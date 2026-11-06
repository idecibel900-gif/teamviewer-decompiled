package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TrustedBrowserMetadata;", "", "browserIdentifier", "", "location", "operatingSystem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrowserIdentifier", "()Ljava/lang/String;", "getLocation", "getOperatingSystem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrustedBrowserMetadata {
    private final String browserIdentifier;
    private final String location;
    private final String operatingSystem;

    public TrustedBrowserMetadata(@sp3(name = "browserIdentifier") String str, @sp3(name = "location") String str2, @sp3(name = "operatingSystem") String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.browserIdentifier = str;
        this.location = str2;
        this.operatingSystem = str3;
    }

    public static /* synthetic */ TrustedBrowserMetadata copy$default(TrustedBrowserMetadata trustedBrowserMetadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trustedBrowserMetadata.browserIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = trustedBrowserMetadata.location;
        }
        if ((i & 4) != 0) {
            str3 = trustedBrowserMetadata.operatingSystem;
        }
        return trustedBrowserMetadata.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrowserIdentifier() {
        return this.browserIdentifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final TrustedBrowserMetadata copy(@sp3(name = "browserIdentifier") String browserIdentifier, @sp3(name = "location") String location, @sp3(name = "operatingSystem") String operatingSystem) {
        browserIdentifier.getClass();
        location.getClass();
        operatingSystem.getClass();
        return new TrustedBrowserMetadata(browserIdentifier, location, operatingSystem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedBrowserMetadata)) {
            return false;
        }
        TrustedBrowserMetadata trustedBrowserMetadata = (TrustedBrowserMetadata) other;
        return im3.n(this.browserIdentifier, trustedBrowserMetadata.browserIdentifier) && im3.n(this.location, trustedBrowserMetadata.location) && im3.n(this.operatingSystem, trustedBrowserMetadata.operatingSystem);
    }

    public final String getBrowserIdentifier() {
        return this.browserIdentifier;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public int hashCode() {
        return this.operatingSystem.hashCode() + to7.e(this.browserIdentifier.hashCode() * 31, 31, this.location);
    }

    public String toString() {
        String str = this.browserIdentifier;
        String str2 = this.location;
        return e41.l(e41.o("TrustedBrowserMetadata(browserIdentifier=", str, ", location=", str2, ", operatingSystem="), this.operatingSystem, ")");
    }
}
