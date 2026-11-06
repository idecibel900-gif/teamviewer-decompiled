package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/AccountContactDeviceInfo;", "", "teamviewerId", "", "name", "", "<init>", "(JLjava/lang/String;)V", "getTeamviewerId", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountContactDeviceInfo {
    private final String name;
    private final long teamviewerId;

    public /* synthetic */ AccountContactDeviceInfo(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ AccountContactDeviceInfo copy$default(AccountContactDeviceInfo accountContactDeviceInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = accountContactDeviceInfo.teamviewerId;
        }
        if ((i & 2) != 0) {
            str = accountContactDeviceInfo.name;
        }
        return accountContactDeviceInfo.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final AccountContactDeviceInfo copy(@sp3(name = "teamviewerId") long teamviewerId, @sp3(name = "name") String name) {
        return new AccountContactDeviceInfo(teamviewerId, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountContactDeviceInfo)) {
            return false;
        }
        AccountContactDeviceInfo accountContactDeviceInfo = (AccountContactDeviceInfo) other;
        return this.teamviewerId == accountContactDeviceInfo.teamviewerId && im3.n(this.name, accountContactDeviceInfo.name);
    }

    public final String getName() {
        return this.name;
    }

    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.teamviewerId) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AccountContactDeviceInfo(teamviewerId=" + this.teamviewerId + ", name=" + this.name + ")";
    }

    public AccountContactDeviceInfo(@sp3(name = "teamviewerId") long j, @sp3(name = "name") String str) {
        this.teamviewerId = j;
        this.name = str;
    }
}
