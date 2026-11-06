package com.teamviewer.apidefinitions.manageddevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/DeviceStateDescription;", "", "operation", "Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "description", "", "<init>", "(Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;Ljava/lang/String;)V", "getOperation", "()Lcom/teamviewer/apidefinitions/manageddevices/models/StateOperation;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceStateDescription {
    private final String description;
    private final StateOperation operation;

    public DeviceStateDescription(@sp3(name = "operation") StateOperation stateOperation, @sp3(name = "description") String str) {
        stateOperation.getClass();
        this.operation = stateOperation;
        this.description = str;
    }

    public static /* synthetic */ DeviceStateDescription copy$default(DeviceStateDescription deviceStateDescription, StateOperation stateOperation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stateOperation = deviceStateDescription.operation;
        }
        if ((i & 2) != 0) {
            str = deviceStateDescription.description;
        }
        return deviceStateDescription.copy(stateOperation, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StateOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final DeviceStateDescription copy(@sp3(name = "operation") StateOperation operation, @sp3(name = "description") String description) {
        operation.getClass();
        return new DeviceStateDescription(operation, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStateDescription)) {
            return false;
        }
        DeviceStateDescription deviceStateDescription = (DeviceStateDescription) other;
        return this.operation == deviceStateDescription.operation && im3.n(this.description, deviceStateDescription.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final StateOperation getOperation() {
        return this.operation;
    }

    public int hashCode() {
        int iHashCode = this.operation.hashCode() * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeviceStateDescription(operation=" + this.operation + ", description=" + this.description + ")";
    }

    public /* synthetic */ DeviceStateDescription(StateOperation stateOperation, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateOperation, (i & 2) != 0 ? null : str);
    }
}
