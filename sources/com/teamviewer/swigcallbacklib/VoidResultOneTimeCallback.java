package com.teamviewer.swigcallbacklib;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H$¢\u0006\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/teamviewer/swigcallbacklib/VoidResultOneTimeCallback;", "Lcom/teamviewer/swigcallbacklib/VoidResultCallbackImpl;", "<init>", "()V", "Lo/f88;", "OnSuccess", "OnError", "internalOnSuccess", "internalOnError", "SwigCallbackLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class VoidResultOneTimeCallback extends VoidResultCallbackImpl {
    public VoidResultOneTimeCallback() {
        swigReleaseOwnership();
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultCallback
    public final void OnError() {
        internalOnError();
        swigTakeOwnership();
    }

    @Override // com.teamviewer.swigcallbacklib.VoidResultCallback
    public final void OnSuccess() {
        internalOnSuccess();
        swigTakeOwnership();
    }

    public abstract void internalOnError();

    public abstract void internalOnSuccess();
}
