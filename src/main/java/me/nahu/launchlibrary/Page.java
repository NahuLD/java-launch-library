package me.nahu.launchlibrary;

import me.nahu.launchlibrary.entities.Entity;

import java.util.List;

public class Page<T extends Entity> {
    private List<T> query;

    public List<T> getQuery() {
        return query;
    }
}
