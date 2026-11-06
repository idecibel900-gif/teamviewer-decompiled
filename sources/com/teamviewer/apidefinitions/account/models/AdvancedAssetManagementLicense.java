package com.teamviewer.apidefinitions.account.models;

import java.time.OffsetDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jf\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicense;", "", "licenseId", "Ljava/util/UUID;", "productId", "isTrial", "", "maxNumEndpoints", "", "validUntil", "Ljava/time/OffsetDateTime;", "usedEndpoints", "licenseState", "Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseState;", "productType", "Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseProductType;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;ZILjava/time/OffsetDateTime;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseState;Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseProductType;)V", "getLicenseId", "()Ljava/util/UUID;", "getProductId", "()Z", "getMaxNumEndpoints", "()I", "getValidUntil", "()Ljava/time/OffsetDateTime;", "getUsedEndpoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLicenseState", "()Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseState;", "getProductType", "()Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseProductType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/UUID;Ljava/util/UUID;ZILjava/time/OffsetDateTime;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseState;Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicenseProductType;)Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicense;", "equals", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AdvancedAssetManagementLicense {
    private final boolean isTrial;
    private final UUID licenseId;
    private final AdvancedAssetManagementLicenseState licenseState;
    private final int maxNumEndpoints;
    private final UUID productId;
    private final AdvancedAssetManagementLicenseProductType productType;
    private final Integer usedEndpoints;
    private final OffsetDateTime validUntil;

    public AdvancedAssetManagementLicense(@sp3(name = "licenseId") UUID uuid, @sp3(name = "productId") UUID uuid2, @sp3(name = "isTrial") boolean z, @sp3(name = "maxNumEndpoints") int i, @sp3(name = "validUntil") OffsetDateTime offsetDateTime, @sp3(name = "usedEndpoints") Integer num, @sp3(name = "licenseState") AdvancedAssetManagementLicenseState advancedAssetManagementLicenseState, @sp3(name = "productType") AdvancedAssetManagementLicenseProductType advancedAssetManagementLicenseProductType) {
        uuid.getClass();
        uuid2.getClass();
        this.licenseId = uuid;
        this.productId = uuid2;
        this.isTrial = z;
        this.maxNumEndpoints = i;
        this.validUntil = offsetDateTime;
        this.usedEndpoints = num;
        this.licenseState = advancedAssetManagementLicenseState;
        this.productType = advancedAssetManagementLicenseProductType;
    }

    public static /* synthetic */ AdvancedAssetManagementLicense copy$default(AdvancedAssetManagementLicense advancedAssetManagementLicense, UUID uuid, UUID uuid2, boolean z, int i, OffsetDateTime offsetDateTime, Integer num, AdvancedAssetManagementLicenseState advancedAssetManagementLicenseState, AdvancedAssetManagementLicenseProductType advancedAssetManagementLicenseProductType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = advancedAssetManagementLicense.licenseId;
        }
        if ((i2 & 2) != 0) {
            uuid2 = advancedAssetManagementLicense.productId;
        }
        if ((i2 & 4) != 0) {
            z = advancedAssetManagementLicense.isTrial;
        }
        if ((i2 & 8) != 0) {
            i = advancedAssetManagementLicense.maxNumEndpoints;
        }
        if ((i2 & 16) != 0) {
            offsetDateTime = advancedAssetManagementLicense.validUntil;
        }
        if ((i2 & 32) != 0) {
            num = advancedAssetManagementLicense.usedEndpoints;
        }
        if ((i2 & 64) != 0) {
            advancedAssetManagementLicenseState = advancedAssetManagementLicense.licenseState;
        }
        if ((i2 & 128) != 0) {
            advancedAssetManagementLicenseProductType = advancedAssetManagementLicense.productType;
        }
        AdvancedAssetManagementLicenseState advancedAssetManagementLicenseState2 = advancedAssetManagementLicenseState;
        AdvancedAssetManagementLicenseProductType advancedAssetManagementLicenseProductType2 = advancedAssetManagementLicenseProductType;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        Integer num2 = num;
        return advancedAssetManagementLicense.copy(uuid, uuid2, z, i, offsetDateTime2, num2, advancedAssetManagementLicenseState2, advancedAssetManagementLicenseProductType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getLicenseId() {
        return this.licenseId;
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
    public final int getMaxNumEndpoints() {
        return this.maxNumEndpoints;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getUsedEndpoints() {
        return this.usedEndpoints;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AdvancedAssetManagementLicenseState getLicenseState() {
        return this.licenseState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AdvancedAssetManagementLicenseProductType getProductType() {
        return this.productType;
    }

    public final AdvancedAssetManagementLicense copy(@sp3(name = "licenseId") UUID licenseId, @sp3(name = "productId") UUID productId, @sp3(name = "isTrial") boolean isTrial, @sp3(name = "maxNumEndpoints") int maxNumEndpoints, @sp3(name = "validUntil") OffsetDateTime validUntil, @sp3(name = "usedEndpoints") Integer usedEndpoints, @sp3(name = "licenseState") AdvancedAssetManagementLicenseState licenseState, @sp3(name = "productType") AdvancedAssetManagementLicenseProductType productType) {
        licenseId.getClass();
        productId.getClass();
        return new AdvancedAssetManagementLicense(licenseId, productId, isTrial, maxNumEndpoints, validUntil, usedEndpoints, licenseState, productType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedAssetManagementLicense)) {
            return false;
        }
        AdvancedAssetManagementLicense advancedAssetManagementLicense = (AdvancedAssetManagementLicense) other;
        return im3.n(this.licenseId, advancedAssetManagementLicense.licenseId) && im3.n(this.productId, advancedAssetManagementLicense.productId) && this.isTrial == advancedAssetManagementLicense.isTrial && this.maxNumEndpoints == advancedAssetManagementLicense.maxNumEndpoints && im3.n(this.validUntil, advancedAssetManagementLicense.validUntil) && im3.n(this.usedEndpoints, advancedAssetManagementLicense.usedEndpoints) && this.licenseState == advancedAssetManagementLicense.licenseState && this.productType == advancedAssetManagementLicense.productType;
    }

    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final AdvancedAssetManagementLicenseState getLicenseState() {
        return this.licenseState;
    }

    public final int getMaxNumEndpoints() {
        return this.maxNumEndpoints;
    }

    public final UUID getProductId() {
        return this.productId;
    }

    public final AdvancedAssetManagementLicenseProductType getProductType() {
        return this.productType;
    }

    public final Integer getUsedEndpoints() {
        return this.usedEndpoints;
    }

    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iA = fx3.a(this.maxNumEndpoints, to7.f(ua5.e(this.productId, this.licenseId.hashCode() * 31, 31), 31, this.isTrial), 31);
        OffsetDateTime offsetDateTime = this.validUntil;
        int iHashCode = (iA + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Integer num = this.usedEndpoints;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AdvancedAssetManagementLicenseState advancedAssetManagementLicenseState = this.licenseState;
        int iHashCode3 = (iHashCode2 + (advancedAssetManagementLicenseState == null ? 0 : advancedAssetManagementLicenseState.hashCode())) * 31;
        AdvancedAssetManagementLicenseProductType advancedAssetManagementLicenseProductType = this.productType;
        return iHashCode3 + (advancedAssetManagementLicenseProductType != null ? advancedAssetManagementLicenseProductType.hashCode() : 0);
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public String toString() {
        return "AdvancedAssetManagementLicense(licenseId=" + this.licenseId + ", productId=" + this.productId + ", isTrial=" + this.isTrial + ", maxNumEndpoints=" + this.maxNumEndpoints + ", validUntil=" + this.validUntil + ", usedEndpoints=" + this.usedEndpoints + ", licenseState=" + this.licenseState + ", productType=" + this.productType + ")";
    }

    public /* synthetic */ AdvancedAssetManagementLicense(UUID uuid, UUID uuid2, boolean z, int i, OffsetDateTime offsetDateTime, Integer num, AdvancedAssetManagementLicenseState advancedAssetManagementLicenseState, AdvancedAssetManagementLicenseProductType advancedAssetManagementLicenseProductType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, z, i, (i2 & 16) != 0 ? null : offsetDateTime, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : advancedAssetManagementLicenseState, (i2 & 128) != 0 ? null : advancedAssetManagementLicenseProductType);
    }
}
