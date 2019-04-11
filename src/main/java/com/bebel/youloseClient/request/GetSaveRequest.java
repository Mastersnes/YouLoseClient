package com.bebel.youloseClient.request;

import com.bebel.soclews.request.KongregateRequest;
import com.bebel.youloseClient.enums.SaveType;

/**
 * Requete du controller GetSave de YouLose
 * 
 */
public class GetSaveRequest extends KongregateRequest {
    private SaveType type;

    public SaveType getType() {
        return type;
    }
    public void setType(final SaveType type) {
        this.type = type;
    }
}
