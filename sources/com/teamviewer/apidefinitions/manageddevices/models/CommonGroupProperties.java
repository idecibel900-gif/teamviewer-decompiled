package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.UUID;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/CommonGroupProperties;", "", "groupId", "Ljava/util/UUID;", "displayName", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getGroupId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonGroupProperties {
    private final String displayName;
    private final UUID groupId;

    public CommonGroupProperties(@sp3(name = "groupId") UUID uuid, @sp3(name = "displayName") String str) {
        uuid.getClass();
        str.getClass();
        this.groupId = uuid;
        this.displayName = str;
    }

    public static /* synthetic */ CommonGroupProperties copy$default(CommonGroupProperties commonGroupProperties, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = commonGroupProperties.groupId;
        }
        if ((i & 2) != 0) {
            str = commonGroupProperties.displayName;
        }
        return commonGroupProperties.copy(uuid, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final CommonGroupProperties copy(@sp3(name = "groupId") UUID groupId, @sp3(name = "displayName") String displayName) {
        groupId.getClass();
        displayName.getClass();
        return new CommonGroupProperties(groupId, displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonGroupProperties)) {
            return false;
        }
        CommonGroupProperties commonGroupProperties = (CommonGroupProperties) other;
        return im3.n(this.groupId, commonGroupProperties.groupId) && im3.n(this.displayName, commonGroupProperties.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        return this.displayName.hashCode() + (this.groupId.hashCode() * 31);
    }

    public String toString() {
        return "CommonGroupProperties(groupId=" + this.groupId + ", displayName=" + this.displayName + ")";
    }
}
