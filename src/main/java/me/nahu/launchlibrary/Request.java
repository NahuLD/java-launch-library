package me.nahu.launchlibrary;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

import java.util.function.Consumer;

public class Request<T> {
    private final Call<T> call;
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
     * Execute in an asynchronous manner with error handling
     *
     * @param response Callback containing the response of type {@link T}
     * @param throwable Callback which is called when an exception is thrown
     *
     * @throws NullPointerException when {@code response} is null
     */
    @SuppressWarnings("ConstantConditions")
    public void execute(Consumer<T> response, Consumer<Throwable> throwable) {
        Callback<T> callback = new Callback<>() {
            @Override
            public void onResponse(Call<T> call, Response<T> result) {
                if (result.isSuccessful())
                    response.accept(result.body());
                else onFailure(call, new HttpException(result));
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                if (throwable != null) throwable.accept(t);
            }
        };

        if(this.throwable != null) {
            callback.onFailure(null, this.throwable);
            return;
        }

        if(this.call == null) {
            callback.onFailure(null, new IllegalStateException("call and throwable are null!"));
            return;
        }
        call.enqueue(callback);
    }

    /**
     * Execute on the current thread
     * @return response of type {@link T}
     * @throws Throwable thrown when an error occurred
     */
    public T executeSync() throws Throwable {
        if(this.throwable != null) {
            throw throwable;
        }

        if(this.call == null) {
            throw new IllegalStateException("call and throwable are null!");
        }

        Response<T> response = call.execute();
        if(response.isSuccessful()) {
            return response.body();
        } else {
            throw new HttpException(response);
        }
    }
}