package br.com.unibh.patterns.flyweight;

import java.util.Objects;

public class Factory {

    private FlyTelesena[] pool;

    public Factory(int maxRows) {
        pool = new FlyTelesena[maxRows];
    }

    public FlyTelesena getFlyweight(int row) {
        if (Objects.isNull(pool[row])) {
            pool[row] = new FlyTelesena(row);
        }
        return pool[row];
    }

}
