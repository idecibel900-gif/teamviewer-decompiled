package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/DeactivateTfaWithRecoveryCodeRequestBody;", "", "username", "", "password", "recoveryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "getPassword", "getRecoveryCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeactivateTfaWithRecoveryCodeRequestBody {
    private final String password;
    private final String recoveryCode;
    private final String username;

    public DeactivateTfaWithRecoveryCodeRequestBody(@sp3(name = "username") String str, @sp3(name = "password") String str2, @sp3(name = "recoveryCode") String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.username = str;
        this.password = str2;
        this.recoveryCode = str3;
    }

    public static /* synthetic */ DeactivateTfaWithRecoveryCodeRequestBody copy$default(DeactivateTfaWithRecoveryCodeRequestBody deactivateTfaWithRecoveryCodeRequestBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deactivateTfaWithRecoveryCodeRequestBody.username;
        }
        if ((i & 2) != 0) {
            str2 = deactivateTfaWithRecoveryCodeRequestBody.password;
        }
        if ((i & 4) != 0) {
            str3 = deactivateTfaWithRecoveryCodeRequestBody.recoveryCode;
        }
        return deactivateTfaWithRecoveryCodeRequestBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecoveryCode() {
        return this.recoveryCode;
    }

    public final DeactivateTfaWithRecoveryCodeRequestBody copy(@sp3(name = "username") String username, @sp3(name = "password") String password, @sp3(name = "recoveryCode") String recoveryCode) {
        username.getClass();
        password.getClass();
        recoveryCode.getClass();
        return new DeactivateTfaWithRecoveryCodeRequestBody(username, password, recoveryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeactivateTfaWithRecoveryCodeRequestBody)) {
            return false;
        }
        DeactivateTfaWithRecoveryCodeRequestBody deactivateTfaWithRecoveryCodeRequestBody = (DeactivateTfaWithRecoveryCodeRequestBody) other;
        return im3.n(this.username, deactivateTfaWithRecoveryCodeRequestBody.username) && im3.n(this.password, deactivateTfaWithRecoveryCodeRequestBody.password) && im3.n(this.recoveryCode, deactivateTfaWithRecoveryCodeRequestBody.recoveryCode);
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getRecoveryCode() {
        return this.recoveryCode;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return this.recoveryCode.hashCode() + to7.e(this.username.hashCode() * 31, 31, this.password);
    }

    public String toString() {
        String str = this.username;
        String str2 = this.password;
        return e41.l(e41.o("DeactivateTfaWithRecoveryCodeRequestBody(username=", str, ", password=", str2, ", recoveryCode="), this.recoveryCode, ")");
    }
}
