package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.fx3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AllowedNumberOfManagedDevices;", "", "allowedNumberOfManagedDevices", "", "<init>", "(I)V", "getAllowedNumberOfManagedDevices", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AllowedNumberOfManagedDevices {
    private final int allowedNumberOfManagedDevices;

    public AllowedNumberOfManagedDevices(@sp3(name = "allowedNumberOfManagedDevices") int i) {
        this.allowedNumberOfManagedDevices = i;
    }

    public static /* synthetic */ AllowedNumberOfManagedDevices copy$default(AllowedNumberOfManagedDevices allowedNumberOfManagedDevices, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = allowedNumberOfManagedDevices.allowedNumberOfManagedDevices;
        }
        return allowedNumberOfManagedDevices.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAllowedNumberOfManagedDevices() {
        return this.allowedNumberOfManagedDevices;
    }

    public final AllowedNumberOfManagedDevices copy(@sp3(name = "allowedNumberOfManagedDevices") int allowedNumberOfManagedDevices) {
        return new AllowedNumberOfManagedDevices(allowedNumberOfManagedDevices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AllowedNumberOfManagedDevices) && this.allowedNumberOfManagedDevices == ((AllowedNumberOfManagedDevices) other).allowedNumberOfManagedDevices;
    }

    public final int getAllowedNumberOfManagedDevices() {
        return this.allowedNumberOfManagedDevices;
    }

    public int hashCode() {
        return Integer.hashCode(this.allowedNumberOfManagedDevices);
    }

    public String toString() {
        return fx3.f(this.allowedNumberOfManagedDevices, "AllowedNumberOfManagedDevices(allowedNumberOfManagedDevices=", ")");
    }
}
