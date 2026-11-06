package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

/* JADX INFO: loaded from: classes.dex */
public enum EndpointActivationResponseCode {
    /* JADX INFO: Fake field, exist only in values array */
    OnSuccess(0),
    /* JADX INFO: Fake field, exist only in values array */
    OnErrorEndpointAlreadyActivated(1),
    /* JADX INFO: Fake field, exist only in values array */
    OnErrorNoLicenseAvailable(2),
    /* JADX INFO: Fake field, exist only in values array */
    OnErrorNoFreeEndpointsAvailable(3),
    /* JADX INFO: Fake field, exist only in values array */
    OnErrorNoRemainingActivationsLeft(4),
    /* JADX INFO: Fake field, exist only in values array */
    OnErrorNoRemainingActivationsLeftRemoteWorker(5),
    /* JADX INFO: Fake field, exist only in values array */
    OnErrorUndefined(6);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    EndpointActivationResponseCode(int i) {
        this.m = i;
    }
}
