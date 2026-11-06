package com.teamviewer.apidefinitions.rolloutconfigurations.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010.J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u001aHÆ\u0003Jì\u0001\u0010F\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00032\u0010\b\u0003\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00112\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0004HÖ\u0001J\t\u0010K\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010/\u001a\u0004\b\u0017\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006L"}, d2 = {"Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;", "", "accountManagerIds", "", "", "sharedStateChainIds", "Ljava/util/UUID;", "name", "", "rolloutConfigurationId", "companyManagerIds", "deploymentString", "lastEditedAt", "", "lastEditedBy", "inheritPolicySharedStateChainId", "containsEncryptedData", "", "userGroupManagerIds", "accountManagersWithPermissions", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/AccountManagerWithPermissions;", "userGroupManagersWithPermissions", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/UserGroupManagerWithPermissions;", "isPermissionsInheritanceAllowed", "deviceName", "creationType", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfigurationCreationType;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfigurationCreationType;)V", "getAccountManagerIds", "()Ljava/util/List;", "getSharedStateChainIds", "getName", "()Ljava/lang/String;", "getRolloutConfigurationId", "()Ljava/util/UUID;", "getCompanyManagerIds", "getDeploymentString", "getLastEditedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastEditedBy", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInheritPolicySharedStateChainId", "getContainsEncryptedData", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserGroupManagerIds", "getAccountManagersWithPermissions", "getUserGroupManagersWithPermissions", "getDeviceName", "getCreationType", "()Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfigurationCreationType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/UUID;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfigurationCreationType;)Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RolloutConfiguration {
    private final List<Integer> accountManagerIds;
    private final List<AccountManagerWithPermissions> accountManagersWithPermissions;
    private final List<Integer> companyManagerIds;
    private final Boolean containsEncryptedData;
    private final RolloutConfigurationCreationType creationType;
    private final String deploymentString;
    private final String deviceName;
    private final UUID inheritPolicySharedStateChainId;
    private final Boolean isPermissionsInheritanceAllowed;
    private final Long lastEditedAt;
    private final Integer lastEditedBy;
    private final String name;
    private final UUID rolloutConfigurationId;
    private final List<UUID> sharedStateChainIds;
    private final List<Long> userGroupManagerIds;
    private final List<UserGroupManagerWithPermissions> userGroupManagersWithPermissions;

    public /* synthetic */ RolloutConfiguration(List list, List list2, String str, UUID uuid, List list3, String str2, Long l, Integer num, UUID uuid2, Boolean bool, List list4, List list5, List list6, Boolean bool2, String str3, RolloutConfigurationCreationType rolloutConfigurationCreationType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, str, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : uuid2, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : list4, (i & 2048) != 0 ? null : list5, (i & 4096) != 0 ? null : list6, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : rolloutConfigurationCreationType);
    }

    public final List<Integer> component1() {
        return this.accountManagerIds;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getContainsEncryptedData() {
        return this.containsEncryptedData;
    }

    public final List<Long> component11() {
        return this.userGroupManagerIds;
    }

    public final List<AccountManagerWithPermissions> component12() {
        return this.accountManagersWithPermissions;
    }

    public final List<UserGroupManagerWithPermissions> component13() {
        return this.userGroupManagersWithPermissions;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsPermissionsInheritanceAllowed() {
        return this.isPermissionsInheritanceAllowed;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final RolloutConfigurationCreationType getCreationType() {
        return this.creationType;
    }

    public final List<UUID> component2() {
        return this.sharedStateChainIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getRolloutConfigurationId() {
        return this.rolloutConfigurationId;
    }

    public final List<Integer> component5() {
        return this.companyManagerIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeploymentString() {
        return this.deploymentString;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getLastEditedAt() {
        return this.lastEditedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getLastEditedBy() {
        return this.lastEditedBy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final UUID getInheritPolicySharedStateChainId() {
        return this.inheritPolicySharedStateChainId;
    }

    public final RolloutConfiguration copy(@sp3(name = "accountManagerIds") List<Integer> accountManagerIds, @sp3(name = "sharedStateChainIds") List<UUID> sharedStateChainIds, @sp3(name = "name") String name, @sp3(name = "rolloutConfigurationId") UUID rolloutConfigurationId, @sp3(name = "companyManagerIds") List<Integer> companyManagerIds, @sp3(name = "deploymentString") String deploymentString, @sp3(name = "lastEditedAt") Long lastEditedAt, @sp3(name = "lastEditedBy") Integer lastEditedBy, @sp3(name = "inheritPolicySharedStateChainId") UUID inheritPolicySharedStateChainId, @sp3(name = "containsEncryptedData") Boolean containsEncryptedData, @sp3(name = "userGroupManagerIds") List<Long> userGroupManagerIds, @sp3(name = "accountManagersWithPermissions") List<AccountManagerWithPermissions> accountManagersWithPermissions, @sp3(name = "userGroupManagersWithPermissions") List<UserGroupManagerWithPermissions> userGroupManagersWithPermissions, @sp3(name = "isPermissionsInheritanceAllowed") Boolean isPermissionsInheritanceAllowed, @sp3(name = "deviceName") String deviceName, @sp3(name = "creationType") RolloutConfigurationCreationType creationType) {
        accountManagerIds.getClass();
        sharedStateChainIds.getClass();
        name.getClass();
        return new RolloutConfiguration(accountManagerIds, sharedStateChainIds, name, rolloutConfigurationId, companyManagerIds, deploymentString, lastEditedAt, lastEditedBy, inheritPolicySharedStateChainId, containsEncryptedData, userGroupManagerIds, accountManagersWithPermissions, userGroupManagersWithPermissions, isPermissionsInheritanceAllowed, deviceName, creationType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RolloutConfiguration)) {
            return false;
        }
        RolloutConfiguration rolloutConfiguration = (RolloutConfiguration) other;
        return im3.n(this.accountManagerIds, rolloutConfiguration.accountManagerIds) && im3.n(this.sharedStateChainIds, rolloutConfiguration.sharedStateChainIds) && im3.n(this.name, rolloutConfiguration.name) && im3.n(this.rolloutConfigurationId, rolloutConfiguration.rolloutConfigurationId) && im3.n(this.companyManagerIds, rolloutConfiguration.companyManagerIds) && im3.n(this.deploymentString, rolloutConfiguration.deploymentString) && im3.n(this.lastEditedAt, rolloutConfiguration.lastEditedAt) && im3.n(this.lastEditedBy, rolloutConfiguration.lastEditedBy) && im3.n(this.inheritPolicySharedStateChainId, rolloutConfiguration.inheritPolicySharedStateChainId) && im3.n(this.containsEncryptedData, rolloutConfiguration.containsEncryptedData) && im3.n(this.userGroupManagerIds, rolloutConfiguration.userGroupManagerIds) && im3.n(this.accountManagersWithPermissions, rolloutConfiguration.accountManagersWithPermissions) && im3.n(this.userGroupManagersWithPermissions, rolloutConfiguration.userGroupManagersWithPermissions) && im3.n(this.isPermissionsInheritanceAllowed, rolloutConfiguration.isPermissionsInheritanceAllowed) && im3.n(this.deviceName, rolloutConfiguration.deviceName) && this.creationType == rolloutConfiguration.creationType;
    }

    public final List<Integer> getAccountManagerIds() {
        return this.accountManagerIds;
    }

    public final List<AccountManagerWithPermissions> getAccountManagersWithPermissions() {
        return this.accountManagersWithPermissions;
    }

    public final List<Integer> getCompanyManagerIds() {
        return this.companyManagerIds;
    }

    public final Boolean getContainsEncryptedData() {
        return this.containsEncryptedData;
    }

    public final RolloutConfigurationCreationType getCreationType() {
        return this.creationType;
    }

    public final String getDeploymentString() {
        return this.deploymentString;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final UUID getInheritPolicySharedStateChainId() {
        return this.inheritPolicySharedStateChainId;
    }

    public final Long getLastEditedAt() {
        return this.lastEditedAt;
    }

    public final Integer getLastEditedBy() {
        return this.lastEditedBy;
    }

    public final String getName() {
        return this.name;
    }

    public final UUID getRolloutConfigurationId() {
        return this.rolloutConfigurationId;
    }

    public final List<UUID> getSharedStateChainIds() {
        return this.sharedStateChainIds;
    }

    public final List<Long> getUserGroupManagerIds() {
        return this.userGroupManagerIds;
    }

    public final List<UserGroupManagerWithPermissions> getUserGroupManagersWithPermissions() {
        return this.userGroupManagersWithPermissions;
    }

    public int hashCode() {
        int iE = to7.e(to7.g(this.sharedStateChainIds, this.accountManagerIds.hashCode() * 31, 31), 31, this.name);
        UUID uuid = this.rolloutConfigurationId;
        int iHashCode = (iE + (uuid == null ? 0 : uuid.hashCode())) * 31;
        List<Integer> list = this.companyManagerIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.deploymentString;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.lastEditedAt;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.lastEditedBy;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        UUID uuid2 = this.inheritPolicySharedStateChainId;
        int iHashCode6 = (iHashCode5 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
        Boolean bool = this.containsEncryptedData;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Long> list2 = this.userGroupManagerIds;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AccountManagerWithPermissions> list3 = this.accountManagersWithPermissions;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UserGroupManagerWithPermissions> list4 = this.userGroupManagersWithPermissions;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.isPermissionsInheritanceAllowed;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.deviceName;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RolloutConfigurationCreationType rolloutConfigurationCreationType = this.creationType;
        return iHashCode12 + (rolloutConfigurationCreationType != null ? rolloutConfigurationCreationType.hashCode() : 0);
    }

    public final Boolean isPermissionsInheritanceAllowed() {
        return this.isPermissionsInheritanceAllowed;
    }

    public String toString() {
        return "RolloutConfiguration(accountManagerIds=" + this.accountManagerIds + ", sharedStateChainIds=" + this.sharedStateChainIds + ", name=" + this.name + ", rolloutConfigurationId=" + this.rolloutConfigurationId + ", companyManagerIds=" + this.companyManagerIds + ", deploymentString=" + this.deploymentString + ", lastEditedAt=" + this.lastEditedAt + ", lastEditedBy=" + this.lastEditedBy + ", inheritPolicySharedStateChainId=" + this.inheritPolicySharedStateChainId + ", containsEncryptedData=" + this.containsEncryptedData + ", userGroupManagerIds=" + this.userGroupManagerIds + ", accountManagersWithPermissions=" + this.accountManagersWithPermissions + ", userGroupManagersWithPermissions=" + this.userGroupManagersWithPermissions + ", isPermissionsInheritanceAllowed=" + this.isPermissionsInheritanceAllowed + ", deviceName=" + this.deviceName + ", creationType=" + this.creationType + ")";
    }

    public RolloutConfiguration(@sp3(name = "accountManagerIds") List<Integer> list, @sp3(name = "sharedStateChainIds") List<UUID> list2, @sp3(name = "name") String str, @sp3(name = "rolloutConfigurationId") UUID uuid, @sp3(name = "companyManagerIds") List<Integer> list3, @sp3(name = "deploymentString") String str2, @sp3(name = "lastEditedAt") Long l, @sp3(name = "lastEditedBy") Integer num, @sp3(name = "inheritPolicySharedStateChainId") UUID uuid2, @sp3(name = "containsEncryptedData") Boolean bool, @sp3(name = "userGroupManagerIds") List<Long> list4, @sp3(name = "accountManagersWithPermissions") List<AccountManagerWithPermissions> list5, @sp3(name = "userGroupManagersWithPermissions") List<UserGroupManagerWithPermissions> list6, @sp3(name = "isPermissionsInheritanceAllowed") Boolean bool2, @sp3(name = "deviceName") String str3, @sp3(name = "creationType") RolloutConfigurationCreationType rolloutConfigurationCreationType) {
        list.getClass();
        list2.getClass();
        str.getClass();
        this.accountManagerIds = list;
        this.sharedStateChainIds = list2;
        this.name = str;
        this.rolloutConfigurationId = uuid;
        this.companyManagerIds = list3;
        this.deploymentString = str2;
        this.lastEditedAt = l;
        this.lastEditedBy = num;
        this.inheritPolicySharedStateChainId = uuid2;
        this.containsEncryptedData = bool;
        this.userGroupManagerIds = list4;
        this.accountManagersWithPermissions = list5;
        this.userGroupManagersWithPermissions = list6;
        this.isPermissionsInheritanceAllowed = bool2;
        this.deviceName = str3;
        this.creationType = rolloutConfigurationCreationType;
    }
}
