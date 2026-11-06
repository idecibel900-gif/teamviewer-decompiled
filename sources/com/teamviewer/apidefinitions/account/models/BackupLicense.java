package com.teamviewer.apidefinitions.account.models;

import java.time.OffsetDateTime;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0018JN\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u000b\u0010\u0018¨\u0006("}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/BackupLicense;", "", "licenseState", "Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState;", "totalStorage", "", "usedStorage", "licenseId", "Ljava/util/UUID;", "validUntil", "Ljava/time/OffsetDateTime;", "isTrial", "", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState;JJLjava/util/UUID;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;)V", "getLicenseState", "()Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState;", "getTotalStorage", "()J", "getUsedStorage", "getLicenseId", "()Ljava/util/UUID;", "getValidUntil", "()Ljava/time/OffsetDateTime;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState;JJLjava/util/UUID;Ljava/time/OffsetDateTime;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/account/models/BackupLicense;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BackupLicense {
    private final Boolean isTrial;
    private final UUID licenseId;
    private final BackupLicenseState licenseState;
    private final long totalStorage;
    private final long usedStorage;
    private final OffsetDateTime validUntil;

    public BackupLicense(@sp3(name = "licenseState") BackupLicenseState backupLicenseState, @sp3(name = "totalStorage") long j, @sp3(name = "usedStorage") long j2, @sp3(name = "licenseId") UUID uuid, @sp3(name = "validUntil") OffsetDateTime offsetDateTime, @sp3(name = "isTrial") Boolean bool) {
        backupLicenseState.getClass();
        uuid.getClass();
        this.licenseState = backupLicenseState;
        this.totalStorage = j;
        this.usedStorage = j2;
        this.licenseId = uuid;
        this.validUntil = offsetDateTime;
        this.isTrial = bool;
    }

    public static /* synthetic */ BackupLicense copy$default(BackupLicense backupLicense, BackupLicenseState backupLicenseState, long j, long j2, UUID uuid, OffsetDateTime offsetDateTime, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            backupLicenseState = backupLicense.licenseState;
        }
        if ((i & 2) != 0) {
            j = backupLicense.totalStorage;
        }
        if ((i & 4) != 0) {
            j2 = backupLicense.usedStorage;
        }
        if ((i & 8) != 0) {
            uuid = backupLicense.licenseId;
        }
        if ((i & 16) != 0) {
            offsetDateTime = backupLicense.validUntil;
        }
        if ((i & 32) != 0) {
            bool = backupLicense.isTrial;
        }
        Boolean bool2 = bool;
        UUID uuid2 = uuid;
        long j3 = j2;
        return backupLicense.copy(backupLicenseState, j, j3, uuid2, offsetDateTime, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BackupLicenseState getLicenseState() {
        return this.licenseState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalStorage() {
        return this.totalStorage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUsedStorage() {
        return this.usedStorage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getLicenseId() {
        return this.licenseId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsTrial() {
        return this.isTrial;
    }

    public final BackupLicense copy(@sp3(name = "licenseState") BackupLicenseState licenseState, @sp3(name = "totalStorage") long totalStorage, @sp3(name = "usedStorage") long usedStorage, @sp3(name = "licenseId") UUID licenseId, @sp3(name = "validUntil") OffsetDateTime validUntil, @sp3(name = "isTrial") Boolean isTrial) {
        licenseState.getClass();
        licenseId.getClass();
        return new BackupLicense(licenseState, totalStorage, usedStorage, licenseId, validUntil, isTrial);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupLicense)) {
            return false;
        }
        BackupLicense backupLicense = (BackupLicense) other;
        return this.licenseState == backupLicense.licenseState && this.totalStorage == backupLicense.totalStorage && this.usedStorage == backupLicense.usedStorage && im3.n(this.licenseId, backupLicense.licenseId) && im3.n(this.validUntil, backupLicense.validUntil) && im3.n(this.isTrial, backupLicense.isTrial);
    }

    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final BackupLicenseState getLicenseState() {
        return this.licenseState;
    }

    public final long getTotalStorage() {
        return this.totalStorage;
    }

    public final long getUsedStorage() {
        return this.usedStorage;
    }

    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iE = ua5.e(this.licenseId, fx3.c(fx3.c(this.licenseState.hashCode() * 31, 31, this.totalStorage), 31, this.usedStorage), 31);
        OffsetDateTime offsetDateTime = this.validUntil;
        int iHashCode = (iE + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Boolean bool = this.isTrial;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isTrial() {
        return this.isTrial;
    }

    public String toString() {
        return "BackupLicense(licenseState=" + this.licenseState + ", totalStorage=" + this.totalStorage + ", usedStorage=" + this.usedStorage + ", licenseId=" + this.licenseId + ", validUntil=" + this.validUntil + ", isTrial=" + this.isTrial + ")";
    }

    public /* synthetic */ BackupLicense(BackupLicenseState backupLicenseState, long j, long j2, UUID uuid, OffsetDateTime offsetDateTime, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backupLicenseState, j, j2, uuid, (i & 16) != 0 ? null : offsetDateTime, (i & 32) != 0 ? null : bool);
    }
}
