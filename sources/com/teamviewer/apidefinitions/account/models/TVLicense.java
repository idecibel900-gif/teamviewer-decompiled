package com.teamviewer.apidefinitions.account.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TVLicense;", "", "licenseType", "Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;", "displayname", "", "numberOfChannels", "", "licenseId", "Ljava/util/UUID;", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;Ljava/lang/String;ILjava/util/UUID;)V", "getLicenseType", "()Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;", "getDisplayname", "()Ljava/lang/String;", "getNumberOfChannels", "()I", "getLicenseId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TVLicense {
    private final String displayname;
    private final UUID licenseId;
    private final TVLicenseType licenseType;
    private final int numberOfChannels;

    public TVLicense(@sp3(name = "licenseType") TVLicenseType tVLicenseType, @sp3(name = "displayname") String str, @sp3(name = "numberOfChannels") int i, @sp3(name = "licenseId") UUID uuid) {
        tVLicenseType.getClass();
        str.getClass();
        this.licenseType = tVLicenseType;
        this.displayname = str;
        this.numberOfChannels = i;
        this.licenseId = uuid;
    }

    public static /* synthetic */ TVLicense copy$default(TVLicense tVLicense, TVLicenseType tVLicenseType, String str, int i, UUID uuid, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tVLicenseType = tVLicense.licenseType;
        }
        if ((i2 & 2) != 0) {
            str = tVLicense.displayname;
        }
        if ((i2 & 4) != 0) {
            i = tVLicense.numberOfChannels;
        }
        if ((i2 & 8) != 0) {
            uuid = tVLicense.licenseId;
        }
        return tVLicense.copy(tVLicenseType, str, i, uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TVLicenseType getLicenseType() {
        return this.licenseType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayname() {
        return this.displayname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumberOfChannels() {
        return this.numberOfChannels;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final TVLicense copy(@sp3(name = "licenseType") TVLicenseType licenseType, @sp3(name = "displayname") String displayname, @sp3(name = "numberOfChannels") int numberOfChannels, @sp3(name = "licenseId") UUID licenseId) {
        licenseType.getClass();
        displayname.getClass();
        return new TVLicense(licenseType, displayname, numberOfChannels, licenseId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TVLicense)) {
            return false;
        }
        TVLicense tVLicense = (TVLicense) other;
        return this.licenseType == tVLicense.licenseType && im3.n(this.displayname, tVLicense.displayname) && this.numberOfChannels == tVLicense.numberOfChannels && im3.n(this.licenseId, tVLicense.licenseId);
    }

    public final String getDisplayname() {
        return this.displayname;
    }

    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final TVLicenseType getLicenseType() {
        return this.licenseType;
    }

    public final int getNumberOfChannels() {
        return this.numberOfChannels;
    }

    public int hashCode() {
        int iA = fx3.a(this.numberOfChannels, to7.e(this.licenseType.hashCode() * 31, 31, this.displayname), 31);
        UUID uuid = this.licenseId;
        return iA + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "TVLicense(licenseType=" + this.licenseType + ", displayname=" + this.displayname + ", numberOfChannels=" + this.numberOfChannels + ", licenseId=" + this.licenseId + ")";
    }

    public /* synthetic */ TVLicense(TVLicenseType tVLicenseType, String str, int i, UUID uuid, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVLicenseType, str, i, (i2 & 8) != 0 ? null : uuid);
    }
}
