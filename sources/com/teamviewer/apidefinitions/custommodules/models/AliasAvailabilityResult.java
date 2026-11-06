package com.teamviewer.apidefinitions.custommodules.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/AliasAvailabilityResult;", "", "available", "", "alias", "", "<init>", "(ZLjava/lang/String;)V", "getAvailable", "()Z", "getAlias", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AliasAvailabilityResult {
    private final String alias;
    private final boolean available;

    public AliasAvailabilityResult(@sp3(name = "available") boolean z, @sp3(name = "alias") String str) {
        str.getClass();
        this.available = z;
        this.alias = str;
    }

    public static /* synthetic */ AliasAvailabilityResult copy$default(AliasAvailabilityResult aliasAvailabilityResult, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aliasAvailabilityResult.available;
        }
        if ((i & 2) != 0) {
            str = aliasAvailabilityResult.alias;
        }
        return aliasAvailabilityResult.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    public final AliasAvailabilityResult copy(@sp3(name = "available") boolean available, @sp3(name = "alias") String alias) {
        alias.getClass();
        return new AliasAvailabilityResult(available, alias);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasAvailabilityResult)) {
            return false;
        }
        AliasAvailabilityResult aliasAvailabilityResult = (AliasAvailabilityResult) other;
        return this.available == aliasAvailabilityResult.available && im3.n(this.alias, aliasAvailabilityResult.alias);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public int hashCode() {
        return this.alias.hashCode() + (Boolean.hashCode(this.available) * 31);
    }

    public String toString() {
        return "AliasAvailabilityResult(available=" + this.available + ", alias=" + this.alias + ")";
    }
}
