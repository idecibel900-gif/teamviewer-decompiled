package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/UnmanagedDevicePassword;", "", "groupId", "Ljava/util/UUID;", "password", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getGroupId", "()Ljava/util/UUID;", "getPassword", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnmanagedDevicePassword {
    private final UUID groupId;
    private final String password;

    public UnmanagedDevicePassword(@sp3(name = "groupId") UUID uuid, @sp3(name = "password") String str) {
        uuid.getClass();
        str.getClass();
        this.groupId = uuid;
        this.password = str;
    }

    public static /* synthetic */ UnmanagedDevicePassword copy$default(UnmanagedDevicePassword unmanagedDevicePassword, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = unmanagedDevicePassword.groupId;
        }
        if ((i & 2) != 0) {
            str = unmanagedDevicePassword.password;
        }
        return unmanagedDevicePassword.copy(uuid, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final UnmanagedDevicePassword copy(@sp3(name = "groupId") UUID groupId, @sp3(name = "password") String password) {
        groupId.getClass();
        password.getClass();
        return new UnmanagedDevicePassword(groupId, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedDevicePassword)) {
            return false;
        }
        UnmanagedDevicePassword unmanagedDevicePassword = (UnmanagedDevicePassword) other;
        return im3.n(this.groupId, unmanagedDevicePassword.groupId) && im3.n(this.password, unmanagedDevicePassword.password);
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.password.hashCode() + (this.groupId.hashCode() * 31);
    }

    public String toString() {
        return "UnmanagedDevicePassword(groupId=" + this.groupId + ", password=" + this.password + ")";
    }
}
