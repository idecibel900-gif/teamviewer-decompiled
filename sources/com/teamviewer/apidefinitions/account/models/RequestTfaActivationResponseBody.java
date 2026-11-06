package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/RequestTfaActivationResponseBody;", "", "secretKey", "", "recoveryCode", "tfaState", "tfaStateKeyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSecretKey", "()Ljava/lang/String;", "getRecoveryCode", "getTfaState", "getTfaStateKeyId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RequestTfaActivationResponseBody {
    private final String recoveryCode;
    private final String secretKey;
    private final String tfaState;
    private final String tfaStateKeyId;

    public RequestTfaActivationResponseBody(@sp3(name = "secretKey") String str, @sp3(name = "recoveryCode") String str2, @sp3(name = "tfaState") String str3, @sp3(name = "tfaStateKeyId") String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.secretKey = str;
        this.recoveryCode = str2;
        this.tfaState = str3;
        this.tfaStateKeyId = str4;
    }

    public static /* synthetic */ RequestTfaActivationResponseBody copy$default(RequestTfaActivationResponseBody requestTfaActivationResponseBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestTfaActivationResponseBody.secretKey;
        }
        if ((i & 2) != 0) {
            str2 = requestTfaActivationResponseBody.recoveryCode;
        }
        if ((i & 4) != 0) {
            str3 = requestTfaActivationResponseBody.tfaState;
        }
        if ((i & 8) != 0) {
            str4 = requestTfaActivationResponseBody.tfaStateKeyId;
        }
        return requestTfaActivationResponseBody.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecoveryCode() {
        return this.recoveryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTfaState() {
        return this.tfaState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTfaStateKeyId() {
        return this.tfaStateKeyId;
    }

    public final RequestTfaActivationResponseBody copy(@sp3(name = "secretKey") String secretKey, @sp3(name = "recoveryCode") String recoveryCode, @sp3(name = "tfaState") String tfaState, @sp3(name = "tfaStateKeyId") String tfaStateKeyId) {
        secretKey.getClass();
        recoveryCode.getClass();
        tfaState.getClass();
        tfaStateKeyId.getClass();
        return new RequestTfaActivationResponseBody(secretKey, recoveryCode, tfaState, tfaStateKeyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestTfaActivationResponseBody)) {
            return false;
        }
        RequestTfaActivationResponseBody requestTfaActivationResponseBody = (RequestTfaActivationResponseBody) other;
        return im3.n(this.secretKey, requestTfaActivationResponseBody.secretKey) && im3.n(this.recoveryCode, requestTfaActivationResponseBody.recoveryCode) && im3.n(this.tfaState, requestTfaActivationResponseBody.tfaState) && im3.n(this.tfaStateKeyId, requestTfaActivationResponseBody.tfaStateKeyId);
    }

    public final String getRecoveryCode() {
        return this.recoveryCode;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getTfaState() {
        return this.tfaState;
    }

    public final String getTfaStateKeyId() {
        return this.tfaStateKeyId;
    }

    public int hashCode() {
        return this.tfaStateKeyId.hashCode() + to7.e(to7.e(this.secretKey.hashCode() * 31, 31, this.recoveryCode), 31, this.tfaState);
    }

    public String toString() {
        String str = this.secretKey;
        String str2 = this.recoveryCode;
        return e41.m(e41.o("RequestTfaActivationResponseBody(secretKey=", str, ", recoveryCode=", str2, ", tfaState="), this.tfaState, ", tfaStateKeyId=", this.tfaStateKeyId, ")");
    }
}
