package com.bebel.youloseClient.response;

import com.bebel.soclews.response.GeneralResponse;
import com.bebel.youloseClient.enums.SaveType;

import java.util.HashMap;
import java.util.Map;

/**
 * Reponse du controller GetSave de YouLose
 */
public class GetSavesResponse extends GeneralResponse {
    private final Map<SaveType, String> save = new HashMap<>();

    public Map<SaveType, String> getSave() {
        return save;
    }
}
