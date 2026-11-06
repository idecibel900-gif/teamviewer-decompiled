package com.google.firebase.messaging;

import android.os.Bundle;
import o.vw;

/* JADX INFO: loaded from: classes.dex */
public abstract class Constants {
    public static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = 180000;

    public static final class MessagePayloadKeys {
        public static vw extractDeveloperDefinedPayload(Bundle bundle) {
            vw vwVar = new vw(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        vwVar.put(str, str2);
                    }
                }
            }
            return vwVar;
        }
    }
}
