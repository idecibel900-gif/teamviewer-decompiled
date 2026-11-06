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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/MobileDeviceManagementLicense;", "", "licenseId", "Ljava/util/UUID;", "productId", "isTrial", "", "maxNumEndpoints", "", "validUntil", "Ljava/time/OffsetDateTime;", "licenseType", "Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;", "licenseState", "Lcom/teamviewer/apidefinitions/account/models/MobileDeviceManagementLicenseState;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;ZILjava/time/OffsetDateTime;Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;Lcom/teamviewer/apidefinitions/account/models/MobileDeviceManagementLicenseState;)V", "getLicenseId", "()Ljava/util/UUID;", "getProductId", "()Z", "getMaxNumEndpoints", "()I", "getValidUntil", "()Ljava/time/OffsetDateTime;", "getLicenseType", "()Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;", "getLicenseState", "()Lcom/teamviewer/apidefinitions/account/models/MobileDeviceManagementLicenseState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MobileDeviceManagementLicense {
    private final boolean isTrial;
    private final UUID licenseId;
    private final MobileDeviceManagementLicenseState licenseState;
    private final MDMLicenseType licenseType;
    private final int maxNumEndpoints;
    private final UUID productId;
    private final OffsetDateTime validUntil;

    public MobileDeviceManagementLicense(@sp3(name = "licenseId") UUID uuid, @sp3(name = "productId") UUID uuid2, @sp3(name = "isTrial") boolean z, @sp3(name = "maxNumEndpoints") int i, @sp3(name = "validUntil") OffsetDateTime offsetDateTime, @sp3(name = "licenseType") MDMLicenseType mDMLicenseType, @sp3(name = "licenseState") MobileDeviceManagementLicenseState mobileDeviceManagementLicenseState) {
        uuid.getClass();
        uuid2.getClass();
        this.licenseId = uuid;
        this.productId = uuid2;
        this.isTrial = z;
        this.maxNumEndpoints = i;
        this.validUntil = offsetDateTime;
        this.licenseType = mDMLicenseType;
        this.licenseState = mobileDeviceManagementLicenseState;
    }

    public static /* synthetic */ MobileDeviceManagementLicense copy$default(MobileDeviceManagementLicense mobileDeviceManagementLicense, UUID uuid, UUID uuid2, boolean z, int i, OffsetDateTime offsetDateTime, MDMLicenseType mDMLicenseType, MobileDeviceManagementLicenseState mobileDeviceManagementLicenseState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = mobileDeviceManagementLicense.licenseId;
        }
        if ((i2 & 2) != 0) {
            uuid2 = mobileDeviceManagementLicense.productId;
        }
        if ((i2 & 4) != 0) {
            z = mobileDeviceManagementLicense.isTrial;
        }
        if ((i2 & 8) != 0) {
            i = mobileDeviceManagementLicense.maxNumEndpoints;
        }
        if ((i2 & 16) != 0) {
            offsetDateTime = mobileDeviceManagementLicense.validUntil;
        }
        if ((i2 & 32) != 0) {
            mDMLicenseType = mobileDeviceManagementLicense.licenseType;
        }
        if ((i2 & 64) != 0) {
            mobileDeviceManagementLicenseState = mobileDeviceManagementLicense.licenseState;
        }
        MDMLicenseType mDMLicenseType2 = mDMLicenseType;
        MobileDeviceManagementLicenseState mobileDeviceManagementLicenseState2 = mobileDeviceManagementLicenseState;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        boolean z2 = z;
        return mobileDeviceManagementLicense.copy(uuid, uuid2, z2, i, offsetDateTime2, mDMLicenseType2, mobileDeviceManagementLicenseState2);
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
    public final MDMLicenseType getLicenseType() {
        return this.licenseType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MobileDeviceManagementLicenseState getLicenseState() {
        return this.licenseState;
    }

    public final MobileDeviceManagementLicense copy(@sp3(name = "licenseId") UUID licenseId, @sp3(name = "productId") UUID productId, @sp3(name = "isTrial") boolean isTrial, @sp3(name = "maxNumEndpoints") int maxNumEndpoints, @sp3(name = "validUntil") OffsetDateTime validUntil, @sp3(name = "licenseType") MDMLicenseType licenseType, @sp3(name = "licenseState") MobileDeviceManagementLicenseState licenseState) {
        licenseId.getClass();
        productId.getClass();
        return new MobileDeviceManagementLicense(licenseId, productId, isTrial, maxNumEndpoints, validUntil, licenseType, licenseState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileDeviceManagementLicense)) {
            return false;
        }
        MobileDeviceManagementLicense mobileDeviceManagementLicense = (MobileDeviceManagementLicense) other;
        return im3.n(this.licenseId, mobileDeviceManagementLicense.licenseId) && im3.n(this.productId, mobileDeviceManagementLicense.productId) && this.isTrial == mobileDeviceManagementLicense.isTrial && this.maxNumEndpoints == mobileDeviceManagementLicense.maxNumEndpoints && im3.n(this.validUntil, mobileDeviceManagementLicense.validUntil) && this.licenseType == mobileDeviceManagementLicense.licenseType && this.licenseState == mobileDeviceManagementLicense.licenseState;
    }

    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final MobileDeviceManagementLicenseState getLicenseState() {
        return this.licenseState;
    }

    public final MDMLicenseType getLicenseType() {
        return this.licenseType;
    }

    public final int getMaxNumEndpoints() {
        return this.maxNumEndpoints;
    }

    public final UUID getProductId() {
        return this.productId;
    }

    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iA = fx3.a(this.maxNumEndpoints, to7.f(ua5.e(this.productId, this.licenseId.hashCode() * 31, 31), 31, this.isTrial), 31);
        OffsetDateTime offsetDateTime = this.validUntil;
        int iHashCode = (iA + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        MDMLicenseType mDMLicenseType = this.licenseType;
        int iHashCode2 = (iHashCode + (mDMLicenseType == null ? 0 : mDMLicenseType.hashCode())) * 31;
        MobileDeviceManagementLicenseState mobileDeviceManagementLicenseState = this.licenseState;
        return iHashCode2 + (mobileDeviceManagementLicenseState != null ? mobileDeviceManagementLicenseState.hashCode() : 0);
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public String toString() {
        return "MobileDeviceManagementLicense(licenseId=" + this.licenseId + ", productId=" + this.productId + ", isTrial=" + this.isTrial + ", maxNumEndpoints=" + this.maxNumEndpoints + ", validUntil=" + this.validUntil + ", licenseType=" + this.licenseType + ", licenseState=" + this.licenseState + ")";
    }

    public /* synthetic */ MobileDeviceManagementLicense(UUID uuid, UUID uuid2, boolean z, int i, OffsetDateTime offsetDateTime, MDMLicenseType mDMLicenseType, MobileDeviceManagementLicenseState mobileDeviceManagementLicenseState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, z, i, (i2 & 16) != 0 ? null : offsetDateTime, (i2 & 32) != 0 ? null : mDMLicenseType, (i2 & 64) != 0 ? null : mobileDeviceManagementLicenseState);
    }
}
