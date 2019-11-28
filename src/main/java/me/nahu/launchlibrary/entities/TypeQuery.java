package me.nahu.launchlibrary.entities;

import java.util.List;

public class TypeQuery<T extends TypeEntity> {
    private List<T> types;

    /**
     * API forces us to list all queries.
     * @return {@link List} of type {@link T}
     */
    public List<T> getTypes() {
        return types;
    }
}
