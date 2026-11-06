package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JF\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\n\u0010\u0014¨\u0006\""}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TrustedDevice;", "", "teamviewerId", "", "trustOrigin", "Lcom/teamviewer/apidefinitions/account/models/TrustOrigin;", "displayName", "", "validOnce", "", "isCurrentDevice", "<init>", "(JLcom/teamviewer/apidefinitions/account/models/TrustOrigin;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTeamviewerId", "()J", "getTrustOrigin", "()Lcom/teamviewer/apidefinitions/account/models/TrustOrigin;", "getDisplayName", "()Ljava/lang/String;", "getValidOnce", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLcom/teamviewer/apidefinitions/account/models/TrustOrigin;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/account/models/TrustedDevice;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrustedDevice {
    private final String displayName;
    private final Boolean isCurrentDevice;
    private final long teamviewerId;
    private final TrustOrigin trustOrigin;
    private final Boolean validOnce;

    public /* synthetic */ TrustedDevice(long j, TrustOrigin trustOrigin, String str, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, trustOrigin, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }

    public static /* synthetic */ TrustedDevice copy$default(TrustedDevice trustedDevice, long j, TrustOrigin trustOrigin, String str, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = trustedDevice.teamviewerId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            trustOrigin = trustedDevice.trustOrigin;
        }
        TrustOrigin trustOrigin2 = trustOrigin;
        if ((i & 4) != 0) {
            str = trustedDevice.displayName;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            bool = trustedDevice.validOnce;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = trustedDevice.isCurrentDevice;
        }
        return trustedDevice.copy(j2, trustOrigin2, str2, bool3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrustOrigin getTrustOrigin() {
        return this.trustOrigin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getValidOnce() {
        return this.validOnce;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsCurrentDevice() {
        return this.isCurrentDevice;
    }

    public final TrustedDevice copy(@sp3(name = "teamviewerId") long teamviewerId, @sp3(name = "trustOrigin") TrustOrigin trustOrigin, @sp3(name = "displayName") String displayName, @sp3(name = "validOnce") Boolean validOnce, @sp3(name = "isCurrentDevice") Boolean isCurrentDevice) {
        trustOrigin.getClass();
        return new TrustedDevice(teamviewerId, trustOrigin, displayName, validOnce, isCurrentDevice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedDevice)) {
            return false;
        }
        TrustedDevice trustedDevice = (TrustedDevice) other;
        return this.teamviewerId == trustedDevice.teamviewerId && this.trustOrigin == trustedDevice.trustOrigin && im3.n(this.displayName, trustedDevice.displayName) && im3.n(this.validOnce, trustedDevice.validOnce) && im3.n(this.isCurrentDevice, trustedDevice.isCurrentDevice);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final long getTeamviewerId() {
        return this.teamviewerId;
    }

    public final TrustOrigin getTrustOrigin() {
        return this.trustOrigin;
    }

    public final Boolean getValidOnce() {
        return this.validOnce;
    }

    public int hashCode() {
        int iHashCode = (this.trustOrigin.hashCode() + (Long.hashCode(this.teamviewerId) * 31)) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.validOnce;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCurrentDevice;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isCurrentDevice() {
        return this.isCurrentDevice;
    }

    public String toString() {
        return "TrustedDevice(teamviewerId=" + this.teamviewerId + ", trustOrigin=" + this.trustOrigin + ", displayName=" + this.displayName + ", validOnce=" + this.validOnce + ", isCurrentDevice=" + this.isCurrentDevice + ")";
    }

    public TrustedDevice(@sp3(name = "teamviewerId") long j, @sp3(name = "trustOrigin") TrustOrigin trustOrigin, @sp3(name = "displayName") String str, @sp3(name = "validOnce") Boolean bool, @sp3(name = "isCurrentDevice") Boolean bool2) {
        trustOrigin.getClass();
        this.teamviewerId = j;
        this.trustOrigin = trustOrigin;
        this.displayName = str;
        this.validOnce = bool;
        this.isCurrentDevice = bool2;
    }
}
