package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/PilotLicense;", "", "licenseType", "Lcom/teamviewer/apidefinitions/account/models/PilotLicenseType;", "displayname", "", "totalNumberOfTechnicians", "", "usedNumberOfTechnicians", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/PilotLicenseType;Ljava/lang/String;II)V", "getLicenseType", "()Lcom/teamviewer/apidefinitions/account/models/PilotLicenseType;", "getDisplayname", "()Ljava/lang/String;", "getTotalNumberOfTechnicians", "()I", "getUsedNumberOfTechnicians", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PilotLicense {
    private final String displayname;
    private final PilotLicenseType licenseType;
    private final int totalNumberOfTechnicians;
    private final int usedNumberOfTechnicians;

    public PilotLicense(@sp3(name = "licenseType") PilotLicenseType pilotLicenseType, @sp3(name = "displayname") String str, @sp3(name = "totalNumberOfTechnicians") int i, @sp3(name = "usedNumberOfTechnicians") int i2) {
        pilotLicenseType.getClass();
        str.getClass();
        this.licenseType = pilotLicenseType;
        this.displayname = str;
        this.totalNumberOfTechnicians = i;
        this.usedNumberOfTechnicians = i2;
    }

    public static /* synthetic */ PilotLicense copy$default(PilotLicense pilotLicense, PilotLicenseType pilotLicenseType, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            pilotLicenseType = pilotLicense.licenseType;
        }
        if ((i3 & 2) != 0) {
            str = pilotLicense.displayname;
        }
        if ((i3 & 4) != 0) {
            i = pilotLicense.totalNumberOfTechnicians;
        }
        if ((i3 & 8) != 0) {
            i2 = pilotLicense.usedNumberOfTechnicians;
        }
        return pilotLicense.copy(pilotLicenseType, str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PilotLicenseType getLicenseType() {
        return this.licenseType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayname() {
        return this.displayname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalNumberOfTechnicians() {
        return this.totalNumberOfTechnicians;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUsedNumberOfTechnicians() {
        return this.usedNumberOfTechnicians;
    }

    public final PilotLicense copy(@sp3(name = "licenseType") PilotLicenseType licenseType, @sp3(name = "displayname") String displayname, @sp3(name = "totalNumberOfTechnicians") int totalNumberOfTechnicians, @sp3(name = "usedNumberOfTechnicians") int usedNumberOfTechnicians) {
        licenseType.getClass();
        displayname.getClass();
        return new PilotLicense(licenseType, displayname, totalNumberOfTechnicians, usedNumberOfTechnicians);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PilotLicense)) {
            return false;
        }
        PilotLicense pilotLicense = (PilotLicense) other;
        return this.licenseType == pilotLicense.licenseType && im3.n(this.displayname, pilotLicense.displayname) && this.totalNumberOfTechnicians == pilotLicense.totalNumberOfTechnicians && this.usedNumberOfTechnicians == pilotLicense.usedNumberOfTechnicians;
    }

    public final String getDisplayname() {
        return this.displayname;
    }

    public final PilotLicenseType getLicenseType() {
        return this.licenseType;
    }

    public final int getTotalNumberOfTechnicians() {
        return this.totalNumberOfTechnicians;
    }

    public final int getUsedNumberOfTechnicians() {
        return this.usedNumberOfTechnicians;
    }

    public int hashCode() {
        return Integer.hashCode(this.usedNumberOfTechnicians) + fx3.a(this.totalNumberOfTechnicians, to7.e(this.licenseType.hashCode() * 31, 31, this.displayname), 31);
    }

    public String toString() {
        return "PilotLicense(licenseType=" + this.licenseType + ", displayname=" + this.displayname + ", totalNumberOfTechnicians=" + this.totalNumberOfTechnicians + ", usedNumberOfTechnicians=" + this.usedNumberOfTechnicians + ")";
    }
}
