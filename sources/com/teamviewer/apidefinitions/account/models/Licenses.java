package com.teamviewer.apidefinitions.account.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010$J\u0090\u0001\u0010/\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00032\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0014HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/Licenses;", "", "endpointProtectionLicenses", "", "Lcom/teamviewer/apidefinitions/account/models/EndpointProtectionLicense;", "iotLicense", "Lcom/teamviewer/apidefinitions/account/models/IoTLicense;", "pilotLicense", "Lcom/teamviewer/apidefinitions/account/models/PilotLicense;", "tvLicense", "Lcom/teamviewer/apidefinitions/account/models/TVLicense;", "backupLicenses", "Lcom/teamviewer/apidefinitions/account/models/BackupLicense;", "mobileDeviceManagementLicenses", "Lcom/teamviewer/apidefinitions/account/models/MobileDeviceManagementLicense;", "monitoringLicenses", "Lcom/teamviewer/apidefinitions/account/models/MonitoringLicense;", "advancedAssetManagementLicenses", "Lcom/teamviewer/apidefinitions/account/models/AdvancedAssetManagementLicense;", "highestBusinessLicense", "", "<init>", "(Ljava/util/List;Lcom/teamviewer/apidefinitions/account/models/IoTLicense;Lcom/teamviewer/apidefinitions/account/models/PilotLicense;Lcom/teamviewer/apidefinitions/account/models/TVLicense;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getEndpointProtectionLicenses", "()Ljava/util/List;", "getIotLicense", "()Lcom/teamviewer/apidefinitions/account/models/IoTLicense;", "getPilotLicense", "()Lcom/teamviewer/apidefinitions/account/models/PilotLicense;", "getTvLicense", "()Lcom/teamviewer/apidefinitions/account/models/TVLicense;", "getBackupLicenses", "getMobileDeviceManagementLicenses", "getMonitoringLicenses", "getAdvancedAssetManagementLicenses", "getHighestBusinessLicense", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Lcom/teamviewer/apidefinitions/account/models/IoTLicense;Lcom/teamviewer/apidefinitions/account/models/PilotLicense;Lcom/teamviewer/apidefinitions/account/models/TVLicense;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/account/models/Licenses;", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Licenses {
    private final List<AdvancedAssetManagementLicense> advancedAssetManagementLicenses;
    private final List<BackupLicense> backupLicenses;
    private final List<EndpointProtectionLicense> endpointProtectionLicenses;
    private final Integer highestBusinessLicense;
    private final IoTLicense iotLicense;
    private final List<MobileDeviceManagementLicense> mobileDeviceManagementLicenses;
    private final List<MonitoringLicense> monitoringLicenses;
    private final PilotLicense pilotLicense;
    private final TVLicense tvLicense;

    public Licenses(@sp3(name = "endpointProtectionLicenses") List<EndpointProtectionLicense> list, @sp3(name = "iotLicense") IoTLicense ioTLicense, @sp3(name = "pilotLicense") PilotLicense pilotLicense, @sp3(name = "tvLicense") TVLicense tVLicense, @sp3(name = "backupLicenses") List<BackupLicense> list2, @sp3(name = "mobileDeviceManagementLicenses") List<MobileDeviceManagementLicense> list3, @sp3(name = "monitoringLicenses") List<MonitoringLicense> list4, @sp3(name = "advancedAssetManagementLicenses") List<AdvancedAssetManagementLicense> list5, @sp3(name = "highestBusinessLicense") Integer num) {
        list.getClass();
        ioTLicense.getClass();
        pilotLicense.getClass();
        tVLicense.getClass();
        this.endpointProtectionLicenses = list;
        this.iotLicense = ioTLicense;
        this.pilotLicense = pilotLicense;
        this.tvLicense = tVLicense;
        this.backupLicenses = list2;
        this.mobileDeviceManagementLicenses = list3;
        this.monitoringLicenses = list4;
        this.advancedAssetManagementLicenses = list5;
        this.highestBusinessLicense = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Licenses copy$default(Licenses licenses, List list, IoTLicense ioTLicense, PilotLicense pilotLicense, TVLicense tVLicense, List list2, List list3, List list4, List list5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = licenses.endpointProtectionLicenses;
        }
        if ((i & 2) != 0) {
            ioTLicense = licenses.iotLicense;
        }
        if ((i & 4) != 0) {
            pilotLicense = licenses.pilotLicense;
        }
        if ((i & 8) != 0) {
            tVLicense = licenses.tvLicense;
        }
        if ((i & 16) != 0) {
            list2 = licenses.backupLicenses;
        }
        if ((i & 32) != 0) {
            list3 = licenses.mobileDeviceManagementLicenses;
        }
        if ((i & 64) != 0) {
            list4 = licenses.monitoringLicenses;
        }
        if ((i & 128) != 0) {
            list5 = licenses.advancedAssetManagementLicenses;
        }
        if ((i & 256) != 0) {
            num = licenses.highestBusinessLicense;
        }
        List list6 = list5;
        Integer num2 = num;
        List list7 = list3;
        List list8 = list4;
        List list9 = list2;
        PilotLicense pilotLicense2 = pilotLicense;
        return licenses.copy(list, ioTLicense, pilotLicense2, tVLicense, list9, list7, list8, list6, num2);
    }

    public final List<EndpointProtectionLicense> component1() {
        return this.endpointProtectionLicenses;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IoTLicense getIotLicense() {
        return this.iotLicense;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PilotLicense getPilotLicense() {
        return this.pilotLicense;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TVLicense getTvLicense() {
        return this.tvLicense;
    }

    public final List<BackupLicense> component5() {
        return this.backupLicenses;
    }

    public final List<MobileDeviceManagementLicense> component6() {
        return this.mobileDeviceManagementLicenses;
    }

    public final List<MonitoringLicense> component7() {
        return this.monitoringLicenses;
    }

    public final List<AdvancedAssetManagementLicense> component8() {
        return this.advancedAssetManagementLicenses;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getHighestBusinessLicense() {
        return this.highestBusinessLicense;
    }

    public final Licenses copy(@sp3(name = "endpointProtectionLicenses") List<EndpointProtectionLicense> endpointProtectionLicenses, @sp3(name = "iotLicense") IoTLicense iotLicense, @sp3(name = "pilotLicense") PilotLicense pilotLicense, @sp3(name = "tvLicense") TVLicense tvLicense, @sp3(name = "backupLicenses") List<BackupLicense> backupLicenses, @sp3(name = "mobileDeviceManagementLicenses") List<MobileDeviceManagementLicense> mobileDeviceManagementLicenses, @sp3(name = "monitoringLicenses") List<MonitoringLicense> monitoringLicenses, @sp3(name = "advancedAssetManagementLicenses") List<AdvancedAssetManagementLicense> advancedAssetManagementLicenses, @sp3(name = "highestBusinessLicense") Integer highestBusinessLicense) {
        endpointProtectionLicenses.getClass();
        iotLicense.getClass();
        pilotLicense.getClass();
        tvLicense.getClass();
        return new Licenses(endpointProtectionLicenses, iotLicense, pilotLicense, tvLicense, backupLicenses, mobileDeviceManagementLicenses, monitoringLicenses, advancedAssetManagementLicenses, highestBusinessLicense);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Licenses)) {
            return false;
        }
        Licenses licenses = (Licenses) other;
        return im3.n(this.endpointProtectionLicenses, licenses.endpointProtectionLicenses) && im3.n(this.iotLicense, licenses.iotLicense) && im3.n(this.pilotLicense, licenses.pilotLicense) && im3.n(this.tvLicense, licenses.tvLicense) && im3.n(this.backupLicenses, licenses.backupLicenses) && im3.n(this.mobileDeviceManagementLicenses, licenses.mobileDeviceManagementLicenses) && im3.n(this.monitoringLicenses, licenses.monitoringLicenses) && im3.n(this.advancedAssetManagementLicenses, licenses.advancedAssetManagementLicenses) && im3.n(this.highestBusinessLicense, licenses.highestBusinessLicense);
    }

    public final List<AdvancedAssetManagementLicense> getAdvancedAssetManagementLicenses() {
        return this.advancedAssetManagementLicenses;
    }

    public final List<BackupLicense> getBackupLicenses() {
        return this.backupLicenses;
    }

    public final List<EndpointProtectionLicense> getEndpointProtectionLicenses() {
        return this.endpointProtectionLicenses;
    }

    public final Integer getHighestBusinessLicense() {
        return this.highestBusinessLicense;
    }

    public final IoTLicense getIotLicense() {
        return this.iotLicense;
    }

    public final List<MobileDeviceManagementLicense> getMobileDeviceManagementLicenses() {
        return this.mobileDeviceManagementLicenses;
    }

    public final List<MonitoringLicense> getMonitoringLicenses() {
        return this.monitoringLicenses;
    }

    public final PilotLicense getPilotLicense() {
        return this.pilotLicense;
    }

    public final TVLicense getTvLicense() {
        return this.tvLicense;
    }

    public int hashCode() {
        int iHashCode = (this.tvLicense.hashCode() + ((this.pilotLicense.hashCode() + ((this.iotLicense.hashCode() + (this.endpointProtectionLicenses.hashCode() * 31)) * 31)) * 31)) * 31;
        List<BackupLicense> list = this.backupLicenses;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MobileDeviceManagementLicense> list2 = this.mobileDeviceManagementLicenses;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MonitoringLicense> list3 = this.monitoringLicenses;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AdvancedAssetManagementLicense> list4 = this.advancedAssetManagementLicenses;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.highestBusinessLicense;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Licenses(endpointProtectionLicenses=" + this.endpointProtectionLicenses + ", iotLicense=" + this.iotLicense + ", pilotLicense=" + this.pilotLicense + ", tvLicense=" + this.tvLicense + ", backupLicenses=" + this.backupLicenses + ", mobileDeviceManagementLicenses=" + this.mobileDeviceManagementLicenses + ", monitoringLicenses=" + this.monitoringLicenses + ", advancedAssetManagementLicenses=" + this.advancedAssetManagementLicenses + ", highestBusinessLicense=" + this.highestBusinessLicense + ")";
    }

    public /* synthetic */ Licenses(List list, IoTLicense ioTLicense, PilotLicense pilotLicense, TVLicense tVLicense, List list2, List list3, List list4, List list5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, ioTLicense, pilotLicense, tVLicense, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : list5, (i & 256) != 0 ? null : num);
    }
}
