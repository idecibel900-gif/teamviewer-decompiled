package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.BitSet;
import o.hk0;
import o.mo8;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionParam {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ConnectionParam() {
        this(ConnectionParamSWIGJNI.new_ConnectionParam(), true);
    }

    public static long getCPtr(ConnectionParam connectionParam) {
        if (connectionParam == null) {
            return 0L;
        }
        return connectionParam.swigCPtr;
    }

    public static long swigRelease(ConnectionParam connectionParam) {
        if (connectionParam != null) {
            if (connectionParam.swigCMemOwn) {
                long j = connectionParam.swigCPtr;
                connectionParam.swigCMemOwn = false;
                connectionParam.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ConnectionParamSWIGJNI.delete_ConnectionParam(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public int getActionId() {
        return ConnectionParamSWIGJNI.ConnectionParam_actionId_get(this.swigCPtr, this);
    }

    public short getBlockingReason() {
        return ConnectionParamSWIGJNI.ConnectionParam_blockingReason_get(this.swigCPtr, this);
    }

    public DyngateID getDestClientId() {
        long jConnectionParam_destClientId_get = ConnectionParamSWIGJNI.ConnectionParam_destClientId_get(this.swigCPtr, this);
        if (jConnectionParam_destClientId_get == 0) {
            return null;
        }
        return new DyngateID(jConnectionParam_destClientId_get, false);
    }

    public String getErrorMessage() {
        return ConnectionParamSWIGJNI.ConnectionParam_errorMessage_get(this.swigCPtr, this);
    }

    public BitSet getMyLicenseFeatures() {
        return mo8.z(ConnectionParamSWIGJNI.ConnectionParam_getMyLicenseFeatures(this.swigCPtr, this));
    }

    public BitSet getPartnerLicenseFeatures() {
        return mo8.z(ConnectionParamSWIGJNI.ConnectionParam_getPartnerLicenseFeatures(this.swigCPtr, this));
    }

    public boolean getSendStatistics() {
        return ConnectionParamSWIGJNI.ConnectionParam_sendStatistics_get(this.swigCPtr, this);
    }

    public int getSessionId() {
        return ConnectionParamSWIGJNI.ConnectionParam_sessionId_get(this.swigCPtr, this);
    }

    public int getTimeoutSecs() {
        return ConnectionParamSWIGJNI.ConnectionParam_timeoutSecs_get(this.swigCPtr, this);
    }

    public int getUsedLicense() {
        return ConnectionParamSWIGJNI.ConnectionParam_usedLicense_get(this.swigCPtr, this);
    }

    public int getUsedLicenseFull() {
        return ConnectionParamSWIGJNI.ConnectionParam_usedLicenseFull_get(this.swigCPtr, this);
    }

    public ConnectionParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
