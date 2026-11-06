package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import o.do7;

/* JADX INFO: loaded from: classes.dex */
class GetIdListener implements StateListener {
    final do7 taskCompletionSource;

    public GetIdListener(do7 do7Var) {
        this.taskCompletionSource = do7Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.taskCompletionSource.c(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
