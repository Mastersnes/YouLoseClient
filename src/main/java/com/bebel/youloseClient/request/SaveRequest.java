package com.bebel.youloseClient.request;

import com.bebel.soclews.request.KongregateRequest;
import com.bebel.youloseClient.enums.SaveType;

/**
 * Requete du controller Save de YouLose
 * 
 */
public class SaveRequest extends KongregateRequest {
    private SaveType type;
    private String data;

    public SaveType getType() {
        return type;
    }
    public void setType(final SaveType type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }
    public void setData(final String data) {
        this.data = data;
    }
}
