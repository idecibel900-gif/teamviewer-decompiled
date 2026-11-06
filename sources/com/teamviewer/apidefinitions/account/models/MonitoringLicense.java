package com.teamviewer.apidefinitions.account.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003Jb\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/MonitoringLicense;", "", "licenseId", "Ljava/util/UUID;", "isTrial", "", "licenseState", "Lcom/teamviewer/apidefinitions/account/models/MonitoringLicenseState;", "validUntil", "Ljava/time/OffsetDateTime;", "totalEndpoints", "", "usedEndpoints", "featureIds", "", "<init>", "(Ljava/util/UUID;ZLcom/teamviewer/apidefinitions/account/models/MonitoringLicenseState;Ljava/time/OffsetDateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getLicenseId", "()Ljava/util/UUID;", "()Z", "getLicenseState", "()Lcom/teamviewer/apidefinitions/account/models/MonitoringLicenseState;", "getValidUntil", "()Ljava/time/OffsetDateTime;", "getTotalEndpoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsedEndpoints", "getFeatureIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/UUID;ZLcom/teamviewer/apidefinitions/account/models/MonitoringLicenseState;Ljava/time/OffsetDateTime;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/teamviewer/apidefinitions/account/models/MonitoringLicense;", "equals", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MonitoringLicense {
    private final List<UUID> featureIds;
    private final boolean isTrial;
    private final UUID licenseId;
    private final MonitoringLicenseState licenseState;
    private final Integer totalEndpoints;
    private final Integer usedEndpoints;
    private final OffsetDateTime validUntil;

    public /* synthetic */ MonitoringLicense(UUID uuid, boolean z, MonitoringLicenseState monitoringLicenseState, OffsetDateTime offsetDateTime, Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, z, monitoringLicenseState, (i & 8) != 0 ? null : offsetDateTime, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonitoringLicense copy$default(MonitoringLicense monitoringLicense, UUID uuid, boolean z, MonitoringLicenseState monitoringLicenseState, OffsetDateTime offsetDateTime, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = monitoringLicense.licenseId;
        }
        if ((i & 2) != 0) {
            z = monitoringLicense.isTrial;
        }
        if ((i & 4) != 0) {
            monitoringLicenseState = monitoringLicense.licenseState;
        }
        if ((i & 8) != 0) {
            offsetDateTime = monitoringLicense.validUntil;
        }
        if ((i & 16) != 0) {
            num = monitoringLicense.totalEndpoints;
        }
        if ((i & 32) != 0) {
            num2 = monitoringLicense.usedEndpoints;
        }
        if ((i & 64) != 0) {
            list = monitoringLicense.featureIds;
        }
        Integer num3 = num2;
        List list2 = list;
        Integer num4 = num;
        MonitoringLicenseState monitoringLicenseState2 = monitoringLicenseState;
        return monitoringLicense.copy(uuid, z, monitoringLicenseState2, offsetDateTime, num4, num3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getLicenseId() {
        return this.licenseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MonitoringLicenseState getLicenseState() {
        return this.licenseState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTotalEndpoints() {
        return this.totalEndpoints;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getUsedEndpoints() {
        return this.usedEndpoints;
    }

    public final List<UUID> component7() {
        return this.featureIds;
    }

    public final MonitoringLicense copy(@sp3(name = "licenseId") UUID licenseId, @sp3(name = "isTrial") boolean isTrial, @sp3(name = "licenseState") MonitoringLicenseState licenseState, @sp3(name = "validUntil") OffsetDateTime validUntil, @sp3(name = "totalEndpoints") Integer totalEndpoints, @sp3(name = "usedEndpoints") Integer usedEndpoints, @sp3(name = "featureIds") List<UUID> featureIds) {
        licenseId.getClass();
        licenseState.getClass();
        return new MonitoringLicense(licenseId, isTrial, licenseState, validUntil, totalEndpoints, usedEndpoints, featureIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonitoringLicense)) {
            return false;
        }
        MonitoringLicense monitoringLicense = (MonitoringLicense) other;
        return im3.n(this.licenseId, monitoringLicense.licenseId) && this.isTrial == monitoringLicense.isTrial && this.licenseState == monitoringLicense.licenseState && im3.n(this.validUntil, monitoringLicense.validUntil) && im3.n(this.totalEndpoints, monitoringLicense.totalEndpoints) && im3.n(this.usedEndpoints, monitoringLicense.usedEndpoints) && im3.n(this.featureIds, monitoringLicense.featureIds);
    }

    public final List<UUID> getFeatureIds() {
        return this.featureIds;
    }

    public final UUID getLicenseId() {
        return this.licenseId;
    }

    public final MonitoringLicenseState getLicenseState() {
        return this.licenseState;
    }

    public final Integer getTotalEndpoints() {
        return this.totalEndpoints;
    }

    public final Integer getUsedEndpoints() {
        return this.usedEndpoints;
    }

    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iHashCode = (this.licenseState.hashCode() + to7.f(this.licenseId.hashCode() * 31, 31, this.isTrial)) * 31;
        OffsetDateTime offsetDateTime = this.validUntil;
        int iHashCode2 = (iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        Integer num = this.totalEndpoints;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.usedEndpoints;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UUID> list = this.featureIds;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public String toString() {
        return "MonitoringLicense(licenseId=" + this.licenseId + ", isTrial=" + this.isTrial + ", licenseState=" + this.licenseState + ", validUntil=" + this.validUntil + ", totalEndpoints=" + this.totalEndpoints + ", usedEndpoints=" + this.usedEndpoints + ", featureIds=" + this.featureIds + ")";
    }

    public MonitoringLicense(@sp3(name = "licenseId") UUID uuid, @sp3(name = "isTrial") boolean z, @sp3(name = "licenseState") MonitoringLicenseState monitoringLicenseState, @sp3(name = "validUntil") OffsetDateTime offsetDateTime, @sp3(name = "totalEndpoints") Integer num, @sp3(name = "usedEndpoints") Integer num2, @sp3(name = "featureIds") List<UUID> list) {
        uuid.getClass();
        monitoringLicenseState.getClass();
        this.licenseId = uuid;
        this.isTrial = z;
        this.licenseState = monitoringLicenseState;
        this.validUntil = offsetDateTime;
        this.totalEndpoints = num;
        this.usedEndpoints = num2;
        this.featureIds = list;
    }
}
