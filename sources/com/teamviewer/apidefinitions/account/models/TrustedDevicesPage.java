package com.teamviewer.apidefinitions.account.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TrustedDevicesPage;", "", "trustedDevices", "", "Lcom/teamviewer/apidefinitions/account/models/TrustedDevice;", "continuationToken", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTrustedDevices", "()Ljava/util/List;", "getContinuationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrustedDevicesPage {
    private final String continuationToken;
    private final List<TrustedDevice> trustedDevices;

    public TrustedDevicesPage(@sp3(name = "trustedDevices") List<TrustedDevice> list, @sp3(name = "continuationToken") String str) {
        list.getClass();
        this.trustedDevices = list;
        this.continuationToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrustedDevicesPage copy$default(TrustedDevicesPage trustedDevicesPage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trustedDevicesPage.trustedDevices;
        }
        if ((i & 2) != 0) {
            str = trustedDevicesPage.continuationToken;
        }
        return trustedDevicesPage.copy(list, str);
    }

    public final List<TrustedDevice> component1() {
        return this.trustedDevices;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final TrustedDevicesPage copy(@sp3(name = "trustedDevices") List<TrustedDevice> trustedDevices, @sp3(name = "continuationToken") String continuationToken) {
        trustedDevices.getClass();
        return new TrustedDevicesPage(trustedDevices, continuationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedDevicesPage)) {
            return false;
        }
        TrustedDevicesPage trustedDevicesPage = (TrustedDevicesPage) other;
        return im3.n(this.trustedDevices, trustedDevicesPage.trustedDevices) && im3.n(this.continuationToken, trustedDevicesPage.continuationToken);
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<TrustedDevice> getTrustedDevices() {
        return this.trustedDevices;
    }

    public int hashCode() {
        int iHashCode = this.trustedDevices.hashCode() * 31;
        String str = this.continuationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TrustedDevicesPage(trustedDevices=" + this.trustedDevices + ", continuationToken=" + this.continuationToken + ")";
    }

    public /* synthetic */ TrustedDevicesPage(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
