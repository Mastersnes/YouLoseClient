package com.bebel.youloseClient.bean;

import com.bebel.soclews.bean.IData;

import java.util.ArrayList;
import java.util.List;

/**
 * Sauvegarde pour l'enigme 1
 */
public class Enigme1Data implements IData {
    protected List<Integer> feuilles = new ArrayList<>();
    protected int cassure;

    public List<Integer> getFeuilles() {
        return feuilles;
    }
    public int getCassure() {
        return cassure;
    }
    public void setCassure(final int cassure) {
        this.cassure = cassure;
    }

    @Override
    public void reset() {
        feuilles.clear();
        cassure = 0;
    }
}
