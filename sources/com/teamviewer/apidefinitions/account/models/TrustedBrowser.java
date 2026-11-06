package com.teamviewer.apidefinitions.account.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JD\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TrustedBrowser;", "", "trustedBrowserId", "", "trustOrigin", "Lcom/teamviewer/apidefinitions/account/models/TrustOrigin;", "metadata", "Lcom/teamviewer/apidefinitions/account/models/TrustedBrowserMetadata;", "createdAt", "Ljava/time/OffsetDateTime;", "validOnce", "", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/account/models/TrustOrigin;Lcom/teamviewer/apidefinitions/account/models/TrustedBrowserMetadata;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;)V", "getTrustedBrowserId", "()Ljava/lang/String;", "getTrustOrigin", "()Lcom/teamviewer/apidefinitions/account/models/TrustOrigin;", "getMetadata", "()Lcom/teamviewer/apidefinitions/account/models/TrustedBrowserMetadata;", "getCreatedAt", "()Ljava/time/OffsetDateTime;", "getValidOnce", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/account/models/TrustOrigin;Lcom/teamviewer/apidefinitions/account/models/TrustedBrowserMetadata;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/account/models/TrustedBrowser;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrustedBrowser {
    private final OffsetDateTime createdAt;
    private final TrustedBrowserMetadata metadata;
    private final TrustOrigin trustOrigin;
    private final String trustedBrowserId;
    private final Boolean validOnce;

    public TrustedBrowser(@sp3(name = "trustedBrowserId") String str, @sp3(name = "trustOrigin") TrustOrigin trustOrigin, @sp3(name = "metadata") TrustedBrowserMetadata trustedBrowserMetadata, @sp3(name = "createdAt") OffsetDateTime offsetDateTime, @sp3(name = "validOnce") Boolean bool) {
        str.getClass();
        trustOrigin.getClass();
        trustedBrowserMetadata.getClass();
        this.trustedBrowserId = str;
        this.trustOrigin = trustOrigin;
        this.metadata = trustedBrowserMetadata;
        this.createdAt = offsetDateTime;
        this.validOnce = bool;
    }

    public static /* synthetic */ TrustedBrowser copy$default(TrustedBrowser trustedBrowser, String str, TrustOrigin trustOrigin, TrustedBrowserMetadata trustedBrowserMetadata, OffsetDateTime offsetDateTime, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trustedBrowser.trustedBrowserId;
        }
        if ((i & 2) != 0) {
            trustOrigin = trustedBrowser.trustOrigin;
        }
        if ((i & 4) != 0) {
            trustedBrowserMetadata = trustedBrowser.metadata;
        }
        if ((i & 8) != 0) {
            offsetDateTime = trustedBrowser.createdAt;
        }
        if ((i & 16) != 0) {
            bool = trustedBrowser.validOnce;
        }
        Boolean bool2 = bool;
        TrustedBrowserMetadata trustedBrowserMetadata2 = trustedBrowserMetadata;
        return trustedBrowser.copy(str, trustOrigin, trustedBrowserMetadata2, offsetDateTime, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrustedBrowserId() {
        return this.trustedBrowserId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrustOrigin getTrustOrigin() {
        return this.trustOrigin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrustedBrowserMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getValidOnce() {
        return this.validOnce;
    }

    public final TrustedBrowser copy(@sp3(name = "trustedBrowserId") String trustedBrowserId, @sp3(name = "trustOrigin") TrustOrigin trustOrigin, @sp3(name = "metadata") TrustedBrowserMetadata metadata, @sp3(name = "createdAt") OffsetDateTime createdAt, @sp3(name = "validOnce") Boolean validOnce) {
        trustedBrowserId.getClass();
        trustOrigin.getClass();
        metadata.getClass();
        return new TrustedBrowser(trustedBrowserId, trustOrigin, metadata, createdAt, validOnce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedBrowser)) {
            return false;
        }
        TrustedBrowser trustedBrowser = (TrustedBrowser) other;
        return im3.n(this.trustedBrowserId, trustedBrowser.trustedBrowserId) && this.trustOrigin == trustedBrowser.trustOrigin && im3.n(this.metadata, trustedBrowser.metadata) && im3.n(this.createdAt, trustedBrowser.createdAt) && im3.n(this.validOnce, trustedBrowser.validOnce);
    }

    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public final TrustedBrowserMetadata getMetadata() {
        return this.metadata;
    }

    public final TrustOrigin getTrustOrigin() {
        return this.trustOrigin;
    }

    public final String getTrustedBrowserId() {
        return this.trustedBrowserId;
    }

    public final Boolean getValidOnce() {
        return this.validOnce;
    }

    public int hashCode() {
        int iHashCode = (this.metadata.hashCode() + ((this.trustOrigin.hashCode() + (this.trustedBrowserId.hashCode() * 31)) * 31)) * 31;
        OffsetDateTime offsetDateTime = this.createdAt;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Boolean bool = this.validOnce;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "TrustedBrowser(trustedBrowserId=" + this.trustedBrowserId + ", trustOrigin=" + this.trustOrigin + ", metadata=" + this.metadata + ", createdAt=" + this.createdAt + ", validOnce=" + this.validOnce + ")";
    }

    public /* synthetic */ TrustedBrowser(String str, TrustOrigin trustOrigin, TrustedBrowserMetadata trustedBrowserMetadata, OffsetDateTime offsetDateTime, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, trustOrigin, trustedBrowserMetadata, (i & 8) != 0 ? null : offsetDateTime, (i & 16) != 0 ? null : bool);
    }
}
