package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.fx3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/IoTLicense;", "", "licenseType", "Lcom/teamviewer/apidefinitions/account/models/IoTLicenseType;", "totalNumberOfEndpoints", "", "usedNumberOfEndpoints", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/IoTLicenseType;II)V", "getLicenseType", "()Lcom/teamviewer/apidefinitions/account/models/IoTLicenseType;", "getTotalNumberOfEndpoints", "()I", "getUsedNumberOfEndpoints", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IoTLicense {
    private final IoTLicenseType licenseType;
    private final int totalNumberOfEndpoints;
    private final int usedNumberOfEndpoints;

    public IoTLicense(@sp3(name = "licenseType") IoTLicenseType ioTLicenseType, @sp3(name = "totalNumberOfEndpoints") int i, @sp3(name = "usedNumberOfEndpoints") int i2) {
        ioTLicenseType.getClass();
        this.licenseType = ioTLicenseType;
        this.totalNumberOfEndpoints = i;
        this.usedNumberOfEndpoints = i2;
    }

    public static /* synthetic */ IoTLicense copy$default(IoTLicense ioTLicense, IoTLicenseType ioTLicenseType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            ioTLicenseType = ioTLicense.licenseType;
        }
        if ((i3 & 2) != 0) {
            i = ioTLicense.totalNumberOfEndpoints;
        }
        if ((i3 & 4) != 0) {
            i2 = ioTLicense.usedNumberOfEndpoints;
        }
        return ioTLicense.copy(ioTLicenseType, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IoTLicenseType getLicenseType() {
        return this.licenseType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalNumberOfEndpoints() {
        return this.totalNumberOfEndpoints;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUsedNumberOfEndpoints() {
        return this.usedNumberOfEndpoints;
    }

    public final IoTLicense copy(@sp3(name = "licenseType") IoTLicenseType licenseType, @sp3(name = "totalNumberOfEndpoints") int totalNumberOfEndpoints, @sp3(name = "usedNumberOfEndpoints") int usedNumberOfEndpoints) {
        licenseType.getClass();
        return new IoTLicense(licenseType, totalNumberOfEndpoints, usedNumberOfEndpoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IoTLicense)) {
            return false;
        }
        IoTLicense ioTLicense = (IoTLicense) other;
        return this.licenseType == ioTLicense.licenseType && this.totalNumberOfEndpoints == ioTLicense.totalNumberOfEndpoints && this.usedNumberOfEndpoints == ioTLicense.usedNumberOfEndpoints;
    }

    public final IoTLicenseType getLicenseType() {
        return this.licenseType;
    }

    public final int getTotalNumberOfEndpoints() {
        return this.totalNumberOfEndpoints;
    }

    public final int getUsedNumberOfEndpoints() {
        return this.usedNumberOfEndpoints;
    }

    public int hashCode() {
        return Integer.hashCode(this.usedNumberOfEndpoints) + fx3.a(this.totalNumberOfEndpoints, this.licenseType.hashCode() * 31, 31);
    }

    public String toString() {
        IoTLicenseType ioTLicenseType = this.licenseType;
        int i = this.totalNumberOfEndpoints;
        int i2 = this.usedNumberOfEndpoints;
        StringBuilder sb = new StringBuilder("IoTLicense(licenseType=");
        sb.append(ioTLicenseType);
        sb.append(", totalNumberOfEndpoints=");
        sb.append(i);
        sb.append(", usedNumberOfEndpoints=");
        return to7.l(sb, i2, ")");
    }
}
