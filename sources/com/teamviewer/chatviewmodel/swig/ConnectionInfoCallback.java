package com.teamviewer.chatviewmodel.swig;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import o.hk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConnectionInfoCallback extends IConnectionInfoCallback {
    private transient long swigCPtr;

    public ConnectionInfoCallback() {
        this(ConnectionInfoCallbackSWIGJNI.new_ConnectionInfoCallback(), true);
        ConnectionInfoCallbackSWIGJNI.ConnectionInfoCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(ConnectionInfoCallback connectionInfoCallback) {
        if (connectionInfoCallback == null) {
            return 0L;
        }
        return connectionInfoCallback.swigCPtr;
    }

    public static long swigRelease(ConnectionInfoCallback connectionInfoCallback) {
        if (connectionInfoCallback != null) {
            if (connectionInfoCallback.swigCMemOwn) {
                long j = connectionInfoCallback.swigCPtr;
                connectionInfoCallback.swigCMemOwn = false;
                connectionInfoCallback.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public abstract void OnConnectionToAccount(long j);

    public abstract void OnConnectionToMachine(DyngateID dyngateID);

    public abstract void OnConnectionToServiceCase(DyngateID dyngateID);

    public abstract void OnError();

    public void PerformConnectionToAccount(long j) {
        try {
            OnConnectionToAccount(j);
        } catch (Throwable th) {
            ye4.d("ConnectionInfoCallback", th);
            throw th;
        }
    }

    public void PerformConnectionToMachine(DyngateID dyngateID) {
        try {
            OnConnectionToMachine(dyngateID);
        } catch (Throwable th) {
            ye4.d("ConnectionInfoCallback", th);
            throw th;
        }
    }

    public void PerformConnectionToServiceCase(DyngateID dyngateID) {
        try {
            OnConnectionToServiceCase(dyngateID);
        } catch (Throwable th) {
            ye4.d("ConnectionInfoCallback", th);
            throw th;
        }
    }

    public void PerformError() {
        try {
            OnError();
        } catch (Throwable th) {
            ye4.d("ConnectionInfoCallback", th);
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.IConnectionInfoCallback
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ConnectionInfoCallbackSWIGJNI.delete_ConnectionInfoCallback(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.chatviewmodel.swig.IConnectionInfoCallback
    public void finalize() {
        delete();
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ConnectionInfoCallbackSWIGJNI.ConnectionInfoCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ConnectionInfoCallbackSWIGJNI.ConnectionInfoCallback_change_ownership(this, this.swigCPtr, true);
    }

    public ConnectionInfoCallback(long j, boolean z) {
        super(ConnectionInfoCallbackSWIGJNI.ConnectionInfoCallback_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
