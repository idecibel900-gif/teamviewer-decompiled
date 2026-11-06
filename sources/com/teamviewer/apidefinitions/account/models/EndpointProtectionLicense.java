package com.teamviewer.apidefinitions.account.models;

import java.time.OffsetDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u008a\u0001\u0010/\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\fHÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001d¨\u00066"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicense;", "", "licenseId", "Ljava/util/UUID;", "productId", "isTrial", "", "licenseState", "Lcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicenseState;", "validUntil", "Ljava/time/OffsetDateTime;", "numberOfEndpointProtectionServerEndpoints", "", "numberOfEndpointProtectionWorkstationEndpoints", "numberOfEndpointDetectionAndResponseServerEndpoints", "numberOfEndpointDetectionAndResponseWorkstationEndpoints", "numberOfManagedDetectionAndResponseEndpoints", "numberOfManagedThreatHuntingEndpoints", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;ZLcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicenseState;Ljava/time/OffsetDateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLicenseId", "()Ljava/util/UUID;", "getProductId", "()Z", "getLicenseState", "()Lcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicenseState;", "getValidUntil", "()Ljava/time/OffsetDateTime;", "getNumberOfEndpointProtectionServerEndpoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumberOfEndpointProtectionWorkstationEndpoints", "getNumberOfEndpointDetectionAndResponseServerEndpoints", "getNumberOfEndpointDetectionAndResponseWorkstationEndpoints", "getNumberOfManagedDetectionAndResponseEndpoints", "getNumberOfManagedThreatHuntingEndpoints", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/UUID;Ljava/util/UUID;ZLcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicenseState;Ljava/time/OffsetDateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicense;", "equals", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EndpointProtectionLicense {
    private final boolean isTrial;
    private final UUID licenseId;
    private final EndpointProtectionLicenseState licenseState;
    private final Integer numberOfEndpointDetectionAndResponseServerEndpoints;
    private final Integer numberOfEndpointDetectionAndResponseWorkstationEndpoints;
    private final Integer numberOfEndpointProtectionServerEndpoints;
    private final Integer numberOfEndpointProtectionWorkstationEndpoints;
    private final Integer numberOfManagedDetectionAndResponseEndpoints;
    private final Integer numberOfManagedThreatHuntingEndpoints;
    private final UUID productId;
    private final OffsetDateTime validUntil;

    public /* synthetic */ EndpointProtectionLicense(UUID uuid, UUID uuid2, boolean z, EndpointProtectionLicenseState endpointProtectionLicenseState, OffsetDateTime offsetDateTime, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, z, endpointProtectionLicenseState, (i & 16) != 0 ? null : offsetDateTime, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : num6);
    }

    public static /* synthetic */ EndpointProtectionLicense copy$default(EndpointProtectionLicense endpointProtectionLicense, UUID uuid, UUID uuid2, boolean z, EndpointProtectionLicenseState endpointProtectionLicenseState, OffsetDateTime offsetDateTime, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = endpointProtectionLicense.licenseId;
        }
        if ((i & 2) != 0) {
            uuid2 = endpointProtectionLicense.productId;
        }
        if ((i & 4) != 0) {
            z = endpointProtectionLicense.isTrial;
        }
        if ((i & 8) != 0) {
            endpointProtectionLicenseState = endpointProtectionLicense.licenseState;
        }
        if ((i & 16) != 0) {
            offsetDateTime = endpointProtectionLicense.validUntil;
        }
        if ((i & 32) != 0) {
            num = endpointProtectionLicense.numberOfEndpointProtectionServerEndpoints;
        }
        if ((i & 64) != 0) {
            num2 = endpointProtectionLicense.numberOfEndpointProtectionWorkstationEndpoints;
        }
        if ((i & 128) != 0) {
            num3 = endpointProtectionLicense.numberOfEndpointDetectionAndResponseServerEndpoints;
        }
        if ((i & 256) != 0) {
            num4 = endpointProtectionLicense.numberOfEndpointDetectionAndResponseWorkstationEndpoints;
        }
        if ((i & 512) != 0) {
            num5 = endpointProtectionLicense.numberOfManagedDetectionAndResponseEndpoints;
        }
        if ((i & 1024) != 0) {
            num6 = endpointProtectionLicense.numberOfManagedThreatHuntingEndpoints;
        }
        Integer num7 = num5;
        Integer num8 = num6;
        Integer num9 = num3;
        Integer num10 = num4;
        Integer num11 = num;
        Integer num12 = num2;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        boolean z2 = z;
        return endpointProtectionLicense.copy(uuid, uuid2, z2, endpointProtectionLicenseState, offsetDateTime2, num11, num12, num9, num10, num7, num8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getLicenseId() {
        return this.licenseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getNumberOfManagedDetectionAndResponseEndpoints() {
        return this.numberOfManagedDetectionAndResponseEndpoints;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getNumberOfManagedThreatHuntingEndpoints() {
        return this.numberOfManagedThreatHuntingEndpoints;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EndpointProtectionLicenseState getLicenseState() {
        return this.licenseState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getNumberOfEndpointProtectionServerEndpoints() {
        return this.numberOfEndpointProtectionServerEndpoints;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getNumberOfEndpointProtectionWorkstationEndpoints() {
        return this.numberOfEndpointProtectionWorkstationEndpoints;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getNumberOfEndpointDetectionAndResponseServerEndpoints() {
        return this.numberOfEndpointDetectionAndResponseServerEndpoints;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getNumberOfEndpointDetectionAndResponseWorkstationEndpoints() {
        return this.numberOfEndpointDetectionAndResponseWorkstationEndpoints;
    }

    public final EndpointProtectionLicense copy(@sp3(name = "licenseId") UUID licenseId, @sp3(name = "productId") UUID productId, @sp3(name = "isTrial") boolean isTrial, @sp3(name = "licenseState") EndpointProtectionLicenseState licenseState, @sp3(name = "validUntil") OffsetDateTime validUntil, @sp3(name = "numberOfEndpointProtectionServerEndpoints") Integer numberOfEndpointProtectionServerEndpoints, @sp3(name = "numberOfEndpointProtectionWorkstationEndpoints") Integer numberOfEndpointProtectionWorkstationEndpoints, @sp3(name = "numberOfEndpointDetectionAndResponseServerEndpoints") Integer numberOfEndpointDetectionAndResponseServerEndpoints, @sp3(name = "numberOfEndpointDetectionAndResponseWorkstationEndpoints") Integer numberOfEndpointDetectionAndResponseWorkstationEndpoints, @sp3(name = "numberOfManagedDetectionAndResponseEndpoints") Integer numberOfManagedDetectionAndResponseEndpoints, @sp3(name = "numberOfManagedThreatHuntingEndpoints") Integer numberOfManagedThreatHuntingEndpoints) {
        licenseId.getClass();
        productId.getClass();
        licenseState.getClass();
        return new EndpointProtectionLicense(licenseId, productId, isTrial, licenseState, validUntil, numberOfEndpointProtectionServerEndpoints, numberOfEndpointProtectionWorkstationEndpoints, numberOfEndpointDetectionAndResponseServerEndpoints, numberOfEndpointDetectionAndResponseWorkstationEndpoints, numberOfManagedDetectionAndResponseEndpoints, numberOfManagedThreatHuntingEndpoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointProtectionLicense)) {
            return false;
        }
        EndpointProtectionLicense endpointProtectionLicense = (EndpointProtectionLicense) other;
        return im3.n(this.licenseId, endpointProtectionLicense.licenseId) && im3.n(this.productId, endpointProtectionLicense.productId) && this.isTrial == endpointProtectionLicense.isTrial && this.licenseState == endpointProtectionLicense.licenseState && im3.n(this.validUntil, endpointProtectionLicense.validUntil) && im3.n(this.numberOfEndpointProtectionServerEndpoints, endpointProtectionLicense.numberOfEndpointProtectionServerEndpoints) && im3.n(this.numberOfEndpointProtectionWorkstationEndpoints, endpointProtectionLicense.numberOfEndpointProtectionWorkstationEndpoints) && im3.n(this.numberOfEndpointDetectionAndResponseServerEndpoints, endpointProtectionLicense.numberOfEndpointDetectionAndResponseServerEndpoints) && im3.n(this.numberOfEndpointDetectionAndResponseWorkstationEndpoints, endpointProtectionLicense.numberOfEndpointDetectionAndResponseWorkstationEndpoints) && im3.n(this.numberOfManagedDetectionAndResponseEndpoints, endpointProtectionLicense.numberOfManagedDetectionAndResponseEndpoints) && im3.n(this.numberOfManagedThreatHuntingEndpoints, endpointProtectionLicense.numberOfManagedThreatHuntingEndpoints);
    }

    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final EndpointProtectionLicenseState getLicenseState() {
        return this.licenseState;
    }

    public final Integer getNumberOfEndpointDetectionAndResponseServerEndpoints() {
        return this.numberOfEndpointDetectionAndResponseServerEndpoints;
    }

    public final Integer getNumberOfEndpointDetectionAndResponseWorkstationEndpoints() {
        return this.numberOfEndpointDetectionAndResponseWorkstationEndpoints;
    }

    public final Integer getNumberOfEndpointProtectionServerEndpoints() {
        return this.numberOfEndpointProtectionServerEndpoints;
    }

    public final Integer getNumberOfEndpointProtectionWorkstationEndpoints() {
        return this.numberOfEndpointProtectionWorkstationEndpoints;
    }

    public final Integer getNumberOfManagedDetectionAndResponseEndpoints() {
        return this.numberOfManagedDetectionAndResponseEndpoints;
    }

    public final Integer getNumberOfManagedThreatHuntingEndpoints() {
        return this.numberOfManagedThreatHuntingEndpoints;
    }

    public final UUID getProductId() {
        return this.productId;
    }

    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iHashCode = (this.licenseState.hashCode() + to7.f(ua5.e(this.productId, this.licenseId.hashCode() * 31, 31), 31, this.isTrial)) * 31;
        OffsetDateTime offsetDateTime = this.validUntil;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Integer num = this.numberOfEndpointProtectionServerEndpoints;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.numberOfEndpointProtectionWorkstationEndpoints;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.numberOfEndpointDetectionAndResponseServerEndpoints;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.numberOfEndpointDetectionAndResponseWorkstationEndpoints;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.numberOfManagedDetectionAndResponseEndpoints;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.numberOfManagedThreatHuntingEndpoints;
        return iHashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public String toString() {
        return "EndpointProtectionLicense(licenseId=" + this.licenseId + ", productId=" + this.productId + ", isTrial=" + this.isTrial + ", licenseState=" + this.licenseState + ", validUntil=" + this.validUntil + ", numberOfEndpointProtectionServerEndpoints=" + this.numberOfEndpointProtectionServerEndpoints + ", numberOfEndpointProtectionWorkstationEndpoints=" + this.numberOfEndpointProtectionWorkstationEndpoints + ", numberOfEndpointDetectionAndResponseServerEndpoints=" + this.numberOfEndpointDetectionAndResponseServerEndpoints + ", numberOfEndpointDetectionAndResponseWorkstationEndpoints=" + this.numberOfEndpointDetectionAndResponseWorkstationEndpoints + ", numberOfManagedDetectionAndResponseEndpoints=" + this.numberOfManagedDetectionAndResponseEndpoints + ", numberOfManagedThreatHuntingEndpoints=" + this.numberOfManagedThreatHuntingEndpoints + ")";
    }

    public EndpointProtectionLicense(@sp3(name = "licenseId") UUID uuid, @sp3(name = "productId") UUID uuid2, @sp3(name = "isTrial") boolean z, @sp3(name = "licenseState") EndpointProtectionLicenseState endpointProtectionLicenseState, @sp3(name = "validUntil") OffsetDateTime offsetDateTime, @sp3(name = "numberOfEndpointProtectionServerEndpoints") Integer num, @sp3(name = "numberOfEndpointProtectionWorkstationEndpoints") Integer num2, @sp3(name = "numberOfEndpointDetectionAndResponseServerEndpoints") Integer num3, @sp3(name = "numberOfEndpointDetectionAndResponseWorkstationEndpoints") Integer num4, @sp3(name = "numberOfManagedDetectionAndResponseEndpoints") Integer num5, @sp3(name = "numberOfManagedThreatHuntingEndpoints") Integer num6) {
        uuid.getClass();
        uuid2.getClass();
        endpointProtectionLicenseState.getClass();
        this.licenseId = uuid;
        this.productId = uuid2;
        this.isTrial = z;
        this.licenseState = endpointProtectionLicenseState;
        this.validUntil = offsetDateTime;
        this.numberOfEndpointProtectionServerEndpoints = num;
        this.numberOfEndpointProtectionWorkstationEndpoints = num2;
        this.numberOfEndpointDetectionAndResponseServerEndpoints = num3;
        this.numberOfEndpointDetectionAndResponseWorkstationEndpoints = num4;
        this.numberOfManagedDetectionAndResponseEndpoints = num5;
        this.numberOfManagedThreatHuntingEndpoints = num6;
    }
}
