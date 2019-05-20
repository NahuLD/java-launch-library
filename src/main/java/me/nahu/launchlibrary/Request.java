package me.nahu.launchlibrary;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

import java.util.function.Consumer;

public class Request<T> {
    private Call<T> call;
    private Throwable throwable;

    protected Request(Call<T> call) {
        this.call = call;
    }

    /**
     * Execute {@link Request} in an async manner.
     * @param result {@link Callback} containing the response of type {@link T}.
     * @throws IllegalStateException when {@code result} and {@code throwable} are null.
     */
    public void execute(Consumer<T> result) {
        execute(result, null);
    }

    /**
     * Execute {@link Request} in an async manner.
     * @param result {@link Callback} containing the response of type {@link T}.
     * @param throwable {@link Callback} which is called when an exception is thrown.
     * @throws IllegalStateException when {@code result} and {@code throwable} are null.
     */
    public void execute(final Consumer<T> result, final Consumer<Throwable> throwable) {
        Callback<T> callback = new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.isSuccessful())
                    result.accept(response.body());
                else onFailure(call, new HttpException(response));
            }
            @Override
            public void onFailure(Call<T> call, Throwable t) {
                if (throwable != null) throwable.accept(t);
            }
        };
        if (throwable != null) {
            callback.onFailure(null, this.throwable);
            return;
        }
        if (this.call == null) {
            callback.onFailure(null, new IllegalStateException("callback and throwable are null"));
        }
        call.enqueue(callback);
    }


    /**
     * Execute {@link Request} on the current thread.
     * @return response of type {@link T}.
     * @throws Throwable thrown when an error occurred.
     */
    public T executeSync() throws Throwable {
        if (throwable != null) {
            throw throwable;
        }
        if (call == null) {
            throw new IllegalStateException("call and throwable are null!");
        }

        Response<T> result = call.execute();
        if(result.isSuccessful()) {
            return result.body();
        } else {
            throw new HttpException(result);
        }
    }
}
