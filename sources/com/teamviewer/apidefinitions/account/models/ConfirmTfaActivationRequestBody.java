package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/ConfirmTfaActivationRequestBody;", "", "securityCode", "", "tfaState", "tfaStateKeyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSecurityCode", "()Ljava/lang/String;", "getTfaState", "getTfaStateKeyId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmTfaActivationRequestBody {
    private final String securityCode;
    private final String tfaState;
    private final String tfaStateKeyId;

    public ConfirmTfaActivationRequestBody(@sp3(name = "securityCode") String str, @sp3(name = "tfaState") String str2, @sp3(name = "tfaStateKeyId") String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.securityCode = str;
        this.tfaState = str2;
        this.tfaStateKeyId = str3;
    }

    public static /* synthetic */ ConfirmTfaActivationRequestBody copy$default(ConfirmTfaActivationRequestBody confirmTfaActivationRequestBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmTfaActivationRequestBody.securityCode;
        }
        if ((i & 2) != 0) {
            str2 = confirmTfaActivationRequestBody.tfaState;
        }
        if ((i & 4) != 0) {
            str3 = confirmTfaActivationRequestBody.tfaStateKeyId;
        }
        return confirmTfaActivationRequestBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSecurityCode() {
        return this.securityCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTfaState() {
        return this.tfaState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTfaStateKeyId() {
        return this.tfaStateKeyId;
    }

    public final ConfirmTfaActivationRequestBody copy(@sp3(name = "securityCode") String securityCode, @sp3(name = "tfaState") String tfaState, @sp3(name = "tfaStateKeyId") String tfaStateKeyId) {
        securityCode.getClass();
        tfaState.getClass();
        tfaStateKeyId.getClass();
        return new ConfirmTfaActivationRequestBody(securityCode, tfaState, tfaStateKeyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTfaActivationRequestBody)) {
            return false;
        }
        ConfirmTfaActivationRequestBody confirmTfaActivationRequestBody = (ConfirmTfaActivationRequestBody) other;
        return im3.n(this.securityCode, confirmTfaActivationRequestBody.securityCode) && im3.n(this.tfaState, confirmTfaActivationRequestBody.tfaState) && im3.n(this.tfaStateKeyId, confirmTfaActivationRequestBody.tfaStateKeyId);
    }

    public final String getSecurityCode() {
        return this.securityCode;
    }

    public final String getTfaState() {
        return this.tfaState;
    }

    public final String getTfaStateKeyId() {
        return this.tfaStateKeyId;
    }

    public int hashCode() {
        return this.tfaStateKeyId.hashCode() + to7.e(this.securityCode.hashCode() * 31, 31, this.tfaState);
    }

    public String toString() {
        String str = this.securityCode;
        String str2 = this.tfaState;
        return e41.l(e41.o("ConfirmTfaActivationRequestBody(securityCode=", str, ", tfaState=", str2, ", tfaStateKeyId="), this.tfaStateKeyId, ")");
    }
}
