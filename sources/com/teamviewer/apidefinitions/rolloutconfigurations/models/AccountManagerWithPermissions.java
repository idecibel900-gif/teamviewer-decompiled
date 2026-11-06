package com.teamviewer.apidefinitions.rolloutconfigurations.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/AccountManagerWithPermissions;", "", "accountManagerWithPermissionsId", "", "permissionSet", "", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/PermissionSet;", "<init>", "(ILjava/util/List;)V", "getAccountManagerWithPermissionsId", "()I", "getPermissionSet", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountManagerWithPermissions {
    private final int accountManagerWithPermissionsId;
    private final List<PermissionSet> permissionSet;

    public /* synthetic */ AccountManagerWithPermissions(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountManagerWithPermissions copy$default(AccountManagerWithPermissions accountManagerWithPermissions, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = accountManagerWithPermissions.accountManagerWithPermissionsId;
        }
        if ((i2 & 2) != 0) {
            list = accountManagerWithPermissions.permissionSet;
        }
        return accountManagerWithPermissions.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccountManagerWithPermissionsId() {
        return this.accountManagerWithPermissionsId;
    }

    public final List<PermissionSet> component2() {
        return this.permissionSet;
    }

    public final AccountManagerWithPermissions copy(@sp3(name = "accountManagerWithPermissionsId") int accountManagerWithPermissionsId, @sp3(name = "permissionSet") List<? extends PermissionSet> permissionSet) {
        return new AccountManagerWithPermissions(accountManagerWithPermissionsId, permissionSet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountManagerWithPermissions)) {
            return false;
        }
        AccountManagerWithPermissions accountManagerWithPermissions = (AccountManagerWithPermissions) other;
        return this.accountManagerWithPermissionsId == accountManagerWithPermissions.accountManagerWithPermissionsId && im3.n(this.permissionSet, accountManagerWithPermissions.permissionSet);
    }

    public final int getAccountManagerWithPermissionsId() {
        return this.accountManagerWithPermissionsId;
    }

    public final List<PermissionSet> getPermissionSet() {
        return this.permissionSet;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.accountManagerWithPermissionsId) * 31;
        List<PermissionSet> list = this.permissionSet;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "AccountManagerWithPermissions(accountManagerWithPermissionsId=" + this.accountManagerWithPermissionsId + ", permissionSet=" + this.permissionSet + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountManagerWithPermissions(@sp3(name = "accountManagerWithPermissionsId") int i, @sp3(name = "permissionSet") List<? extends PermissionSet> list) {
        this.accountManagerWithPermissionsId = i;
        this.permissionSet = list;
    }
}
