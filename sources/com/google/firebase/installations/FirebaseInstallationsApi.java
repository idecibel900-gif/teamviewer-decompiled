package com.google.firebase.installations;

import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import o.bo7;

/* JADX INFO: loaded from: classes.dex */
public interface FirebaseInstallationsApi {
    void clearFidCache();

    bo7 getId();

    bo7 getToken(boolean z);

    FidListenerHandle registerFidListener(FidListener fidListener);
}
