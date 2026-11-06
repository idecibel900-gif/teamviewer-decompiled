package com.google.firebase.installations;

import com.google.firebase.installations.local.PersistedInstallationEntry;
import o.do7;

/* JADX INFO: loaded from: classes.dex */
class GetAuthTokenListener implements StateListener {
    private final do7 resultTaskCompletionSource;
    private final Utils utils;

    public GetAuthTokenListener(Utils utils, do7 do7Var) {
        this.utils = utils;
        this.resultTaskCompletionSource = do7Var;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.resultTaskCompletionSource.b(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.utils.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.resultTaskCompletionSource.a(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
