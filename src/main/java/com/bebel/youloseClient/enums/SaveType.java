package com.bebel.youloseClient.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types de sauvegarde
 */
public enum SaveType {
        GAUCHE, CENTRE, DROITE;

        @JsonValue
        public String toString() {
            return name().toLowerCase();
        }

        @JsonCreator
        public static SaveType fromCode(final String code) {
            for (final SaveType saveType : values()) {
                if (saveType.name().equalsIgnoreCase(code)) return saveType;
            }
            return null;
        }
}
