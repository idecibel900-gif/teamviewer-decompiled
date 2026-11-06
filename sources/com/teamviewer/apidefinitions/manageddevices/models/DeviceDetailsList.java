package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceDetailsList;", "", "successfulDevicesDetails", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/Device;", "failedDevicesDetails", "Lcom/teamviewer/apidefinitions/manageddevices/models/FailedDeviceDetailsInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSuccessfulDevicesDetails", "()Ljava/util/List;", "getFailedDevicesDetails", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceDetailsList {
    private final List<FailedDeviceDetailsInfo> failedDevicesDetails;
    private final List<Device> successfulDevicesDetails;

    public DeviceDetailsList(@sp3(name = "successfulDevicesDetails") List<Device> list, @sp3(name = "failedDevicesDetails") List<FailedDeviceDetailsInfo> list2) {
        list.getClass();
        list2.getClass();
        this.successfulDevicesDetails = list;
        this.failedDevicesDetails = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceDetailsList copy$default(DeviceDetailsList deviceDetailsList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceDetailsList.successfulDevicesDetails;
        }
        if ((i & 2) != 0) {
            list2 = deviceDetailsList.failedDevicesDetails;
        }
        return deviceDetailsList.copy(list, list2);
    }

    public final List<Device> component1() {
        return this.successfulDevicesDetails;
    }

    public final List<FailedDeviceDetailsInfo> component2() {
        return this.failedDevicesDetails;
    }

    public final DeviceDetailsList copy(@sp3(name = "successfulDevicesDetails") List<Device> successfulDevicesDetails, @sp3(name = "failedDevicesDetails") List<FailedDeviceDetailsInfo> failedDevicesDetails) {
        successfulDevicesDetails.getClass();
        failedDevicesDetails.getClass();
        return new DeviceDetailsList(successfulDevicesDetails, failedDevicesDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDetailsList)) {
            return false;
        }
        DeviceDetailsList deviceDetailsList = (DeviceDetailsList) other;
        return im3.n(this.successfulDevicesDetails, deviceDetailsList.successfulDevicesDetails) && im3.n(this.failedDevicesDetails, deviceDetailsList.failedDevicesDetails);
    }

    public final List<FailedDeviceDetailsInfo> getFailedDevicesDetails() {
        return this.failedDevicesDetails;
    }

    public final List<Device> getSuccessfulDevicesDetails() {
        return this.successfulDevicesDetails;
    }

    public int hashCode() {
        return this.failedDevicesDetails.hashCode() + (this.successfulDevicesDetails.hashCode() * 31);
    }

    public String toString() {
        return "DeviceDetailsList(successfulDevicesDetails=" + this.successfulDevicesDetails + ", failedDevicesDetails=" + this.failedDevicesDetails + ")";
    }
}
