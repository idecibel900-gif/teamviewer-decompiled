package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\"Jz\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/Group;", "", "groupId", "Ljava/util/UUID;", "displayName", "", "managers", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/EntityManagerListEntry;", "policy", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;", "backupPolicy", "monitoringPolicy", "patchManagementPolicy", "unifiedPolicy", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupUnifiedPolicyDescriptor;", "allDevicesSupportRemoveMySelfAsManager", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupUnifiedPolicyDescriptor;Ljava/lang/Boolean;)V", "getGroupId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getManagers", "()Ljava/util/List;", "getPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;", "getBackupPolicy", "getMonitoringPolicy", "getPatchManagementPolicy", "getUnifiedPolicy", "()Lcom/teamviewer/apidefinitions/manageddevices/models/GroupUnifiedPolicyDescriptor;", "getAllDevicesSupportRemoveMySelfAsManager", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupPolicyDescriptor;Lcom/teamviewer/apidefinitions/manageddevices/models/GroupUnifiedPolicyDescriptor;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/manageddevices/models/Group;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Group {
    private final Boolean allDevicesSupportRemoveMySelfAsManager;
    private final GroupPolicyDescriptor backupPolicy;
    private final String displayName;
    private final UUID groupId;
    private final List<EntityManagerListEntry> managers;
    private final GroupPolicyDescriptor monitoringPolicy;
    private final GroupPolicyDescriptor patchManagementPolicy;
    private final GroupPolicyDescriptor policy;
    private final GroupUnifiedPolicyDescriptor unifiedPolicy;

    public /* synthetic */ Group(UUID uuid, String str, List list, GroupPolicyDescriptor groupPolicyDescriptor, GroupPolicyDescriptor groupPolicyDescriptor2, GroupPolicyDescriptor groupPolicyDescriptor3, GroupPolicyDescriptor groupPolicyDescriptor4, GroupUnifiedPolicyDescriptor groupUnifiedPolicyDescriptor, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, list, (i & 8) != 0 ? null : groupPolicyDescriptor, (i & 16) != 0 ? null : groupPolicyDescriptor2, (i & 32) != 0 ? null : groupPolicyDescriptor3, (i & 64) != 0 ? null : groupPolicyDescriptor4, (i & 128) != 0 ? null : groupUnifiedPolicyDescriptor, (i & 256) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Group copy$default(Group group, UUID uuid, String str, List list, GroupPolicyDescriptor groupPolicyDescriptor, GroupPolicyDescriptor groupPolicyDescriptor2, GroupPolicyDescriptor groupPolicyDescriptor3, GroupPolicyDescriptor groupPolicyDescriptor4, GroupUnifiedPolicyDescriptor groupUnifiedPolicyDescriptor, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = group.groupId;
        }
        if ((i & 2) != 0) {
            str = group.displayName;
        }
        if ((i & 4) != 0) {
            list = group.managers;
        }
        if ((i & 8) != 0) {
            groupPolicyDescriptor = group.policy;
        }
        if ((i & 16) != 0) {
            groupPolicyDescriptor2 = group.backupPolicy;
        }
        if ((i & 32) != 0) {
            groupPolicyDescriptor3 = group.monitoringPolicy;
        }
        if ((i & 64) != 0) {
            groupPolicyDescriptor4 = group.patchManagementPolicy;
        }
        if ((i & 128) != 0) {
            groupUnifiedPolicyDescriptor = group.unifiedPolicy;
        }
        if ((i & 256) != 0) {
            bool = group.allDevicesSupportRemoveMySelfAsManager;
        }
        GroupUnifiedPolicyDescriptor groupUnifiedPolicyDescriptor2 = groupUnifiedPolicyDescriptor;
        Boolean bool2 = bool;
        GroupPolicyDescriptor groupPolicyDescriptor5 = groupPolicyDescriptor3;
        GroupPolicyDescriptor groupPolicyDescriptor6 = groupPolicyDescriptor4;
        GroupPolicyDescriptor groupPolicyDescriptor7 = groupPolicyDescriptor2;
        List list2 = list;
        return group.copy(uuid, str, list2, groupPolicyDescriptor, groupPolicyDescriptor7, groupPolicyDescriptor5, groupPolicyDescriptor6, groupUnifiedPolicyDescriptor2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<EntityManagerListEntry> component3() {
        return this.managers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GroupPolicyDescriptor getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GroupPolicyDescriptor getBackupPolicy() {
        return this.backupPolicy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GroupPolicyDescriptor getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GroupPolicyDescriptor getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GroupUnifiedPolicyDescriptor getUnifiedPolicy() {
        return this.unifiedPolicy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getAllDevicesSupportRemoveMySelfAsManager() {
        return this.allDevicesSupportRemoveMySelfAsManager;
    }

    public final Group copy(@sp3(name = "groupId") UUID groupId, @sp3(name = "displayName") String displayName, @sp3(name = "managers") List<EntityManagerListEntry> managers, @sp3(name = "policy") GroupPolicyDescriptor policy, @sp3(name = "backupPolicy") GroupPolicyDescriptor backupPolicy, @sp3(name = "monitoringPolicy") GroupPolicyDescriptor monitoringPolicy, @sp3(name = "patchManagementPolicy") GroupPolicyDescriptor patchManagementPolicy, @sp3(name = "unifiedPolicy") GroupUnifiedPolicyDescriptor unifiedPolicy, @sp3(name = "allDevicesSupportRemoveMySelfAsManager") Boolean allDevicesSupportRemoveMySelfAsManager) {
        groupId.getClass();
        displayName.getClass();
        managers.getClass();
        return new Group(groupId, displayName, managers, policy, backupPolicy, monitoringPolicy, patchManagementPolicy, unifiedPolicy, allDevicesSupportRemoveMySelfAsManager);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Group)) {
            return false;
        }
        Group group = (Group) other;
        return im3.n(this.groupId, group.groupId) && im3.n(this.displayName, group.displayName) && im3.n(this.managers, group.managers) && im3.n(this.policy, group.policy) && im3.n(this.backupPolicy, group.backupPolicy) && im3.n(this.monitoringPolicy, group.monitoringPolicy) && im3.n(this.patchManagementPolicy, group.patchManagementPolicy) && im3.n(this.unifiedPolicy, group.unifiedPolicy) && im3.n(this.allDevicesSupportRemoveMySelfAsManager, group.allDevicesSupportRemoveMySelfAsManager);
    }

    public final Boolean getAllDevicesSupportRemoveMySelfAsManager() {
        return this.allDevicesSupportRemoveMySelfAsManager;
    }

    public final GroupPolicyDescriptor getBackupPolicy() {
        return this.backupPolicy;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final UUID getGroupId() {
        return this.groupId;
    }

    public final List<EntityManagerListEntry> getManagers() {
        return this.managers;
    }

    public final GroupPolicyDescriptor getMonitoringPolicy() {
        return this.monitoringPolicy;
    }

    public final GroupPolicyDescriptor getPatchManagementPolicy() {
        return this.patchManagementPolicy;
    }

    public final GroupPolicyDescriptor getPolicy() {
        return this.policy;
    }

    public final GroupUnifiedPolicyDescriptor getUnifiedPolicy() {
        return this.unifiedPolicy;
    }

    public int hashCode() {
        int iG = to7.g(this.managers, to7.e(this.groupId.hashCode() * 31, 31, this.displayName), 31);
        GroupPolicyDescriptor groupPolicyDescriptor = this.policy;
        int iHashCode = (iG + (groupPolicyDescriptor == null ? 0 : groupPolicyDescriptor.hashCode())) * 31;
        GroupPolicyDescriptor groupPolicyDescriptor2 = this.backupPolicy;
        int iHashCode2 = (iHashCode + (groupPolicyDescriptor2 == null ? 0 : groupPolicyDescriptor2.hashCode())) * 31;
        GroupPolicyDescriptor groupPolicyDescriptor3 = this.monitoringPolicy;
        int iHashCode3 = (iHashCode2 + (groupPolicyDescriptor3 == null ? 0 : groupPolicyDescriptor3.hashCode())) * 31;
        GroupPolicyDescriptor groupPolicyDescriptor4 = this.patchManagementPolicy;
        int iHashCode4 = (iHashCode3 + (groupPolicyDescriptor4 == null ? 0 : groupPolicyDescriptor4.hashCode())) * 31;
        GroupUnifiedPolicyDescriptor groupUnifiedPolicyDescriptor = this.unifiedPolicy;
        int iHashCode5 = (iHashCode4 + (groupUnifiedPolicyDescriptor == null ? 0 : groupUnifiedPolicyDescriptor.hashCode())) * 31;
        Boolean bool = this.allDevicesSupportRemoveMySelfAsManager;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "Group(groupId=" + this.groupId + ", displayName=" + this.displayName + ", managers=" + this.managers + ", policy=" + this.policy + ", backupPolicy=" + this.backupPolicy + ", monitoringPolicy=" + this.monitoringPolicy + ", patchManagementPolicy=" + this.patchManagementPolicy + ", unifiedPolicy=" + this.unifiedPolicy + ", allDevicesSupportRemoveMySelfAsManager=" + this.allDevicesSupportRemoveMySelfAsManager + ")";
    }

    public Group(@sp3(name = "groupId") UUID uuid, @sp3(name = "displayName") String str, @sp3(name = "managers") List<EntityManagerListEntry> list, @sp3(name = "policy") GroupPolicyDescriptor groupPolicyDescriptor, @sp3(name = "backupPolicy") GroupPolicyDescriptor groupPolicyDescriptor2, @sp3(name = "monitoringPolicy") GroupPolicyDescriptor groupPolicyDescriptor3, @sp3(name = "patchManagementPolicy") GroupPolicyDescriptor groupPolicyDescriptor4, @sp3(name = "unifiedPolicy") GroupUnifiedPolicyDescriptor groupUnifiedPolicyDescriptor, @sp3(name = "allDevicesSupportRemoveMySelfAsManager") Boolean bool) {
        uuid.getClass();
        str.getClass();
        list.getClass();
        this.groupId = uuid;
        this.displayName = str;
        this.managers = list;
        this.policy = groupPolicyDescriptor;
        this.backupPolicy = groupPolicyDescriptor2;
        this.monitoringPolicy = groupPolicyDescriptor3;
        this.patchManagementPolicy = groupPolicyDescriptor4;
        this.unifiedPolicy = groupUnifiedPolicyDescriptor;
        this.allDevicesSupportRemoveMySelfAsManager = bool;
    }
}
