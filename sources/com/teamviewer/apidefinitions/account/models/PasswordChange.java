package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/PasswordChange;", "", "oldPassword", "", "newPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldPassword", "()Ljava/lang/String;", "getNewPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PasswordChange {
    private final String newPassword;
    private final String oldPassword;

    public PasswordChange(@sp3(name = "oldPassword") String str, @sp3(name = "newPassword") String str2) {
        str.getClass();
        str2.getClass();
        this.oldPassword = str;
        this.newPassword = str2;
    }

    public static /* synthetic */ PasswordChange copy$default(PasswordChange passwordChange, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passwordChange.oldPassword;
        }
        if ((i & 2) != 0) {
            str2 = passwordChange.newPassword;
        }
        return passwordChange.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOldPassword() {
        return this.oldPassword;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNewPassword() {
        return this.newPassword;
    }

    public final PasswordChange copy(@sp3(name = "oldPassword") String oldPassword, @sp3(name = "newPassword") String newPassword) {
        oldPassword.getClass();
        newPassword.getClass();
        return new PasswordChange(oldPassword, newPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasswordChange)) {
            return false;
        }
        PasswordChange passwordChange = (PasswordChange) other;
        return im3.n(this.oldPassword, passwordChange.oldPassword) && im3.n(this.newPassword, passwordChange.newPassword);
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public int hashCode() {
        return this.newPassword.hashCode() + (this.oldPassword.hashCode() * 31);
    }

    public String toString() {
        return fx3.h("PasswordChange(oldPassword=", this.oldPassword, ", newPassword=", this.newPassword, ")");
    }
}
