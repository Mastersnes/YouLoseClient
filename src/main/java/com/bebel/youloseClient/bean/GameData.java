package com.bebel.youloseClient.bean;

import com.bebel.soclews.bean.IData;
import com.bebel.youloseClient.enums.SaveType;

import static com.bebel.youloseClient.enums.Emplacement.ENIGME1;

/**
 * Sauvegarde de base
 */
public class GameData implements IData {
    protected final SaveType type;

    protected boolean used;
    protected String emplacement;
    protected Enigme1Data enigme1 = new Enigme1Data();

    public GameData(final SaveType type) {
        this.type = type;
    }

    public void reset() {
        used = true;
        emplacement = ENIGME1;
        enigme1.reset();
    }

    public boolean isUsed() {
        return used;
    }
    public void setUsed(final boolean used) {
        this.used = used;
    }

    public String getEmplacement() {
        return emplacement;
    }
    public void setEmplacement(final String emplacement) {
        this.emplacement = emplacement;
    }

    public Enigme1Data getEnigme1() {
        return enigme1;
    }
    public void setEnigme1(final Enigme1Data enigme1) {
        this.enigme1 = enigme1;
    }

    public SaveType getType() {
        return type;
    }
}
