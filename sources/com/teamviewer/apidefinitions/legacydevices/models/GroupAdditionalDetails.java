package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/GroupAdditionalDetails;", "", "policy", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupPolicy;", "customModule", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupCustomModule;", "<init>", "(Lcom/teamviewer/apidefinitions/legacydevices/models/GroupPolicy;Lcom/teamviewer/apidefinitions/legacydevices/models/GroupCustomModule;)V", "getPolicy", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupPolicy;", "getCustomModule", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupCustomModule;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupAdditionalDetails {
    private final GroupCustomModule customModule;
    private final GroupPolicy policy;

    public /* synthetic */ GroupAdditionalDetails(GroupPolicy groupPolicy, GroupCustomModule groupCustomModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupPolicy, (i & 2) != 0 ? null : groupCustomModule);
    }

    public static /* synthetic */ GroupAdditionalDetails copy$default(GroupAdditionalDetails groupAdditionalDetails, GroupPolicy groupPolicy, GroupCustomModule groupCustomModule, int i, Object obj) {
        if ((i & 1) != 0) {
            groupPolicy = groupAdditionalDetails.policy;
        }
        if ((i & 2) != 0) {
            groupCustomModule = groupAdditionalDetails.customModule;
        }
        return groupAdditionalDetails.copy(groupPolicy, groupCustomModule);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GroupPolicy getPolicy() {
        return this.policy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GroupCustomModule getCustomModule() {
        return this.customModule;
    }

    public final GroupAdditionalDetails copy(@sp3(name = "policy") GroupPolicy policy, @sp3(name = "customModule") GroupCustomModule customModule) {
        return new GroupAdditionalDetails(policy, customModule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupAdditionalDetails)) {
            return false;
        }
        GroupAdditionalDetails groupAdditionalDetails = (GroupAdditionalDetails) other;
        return im3.n(this.policy, groupAdditionalDetails.policy) && im3.n(this.customModule, groupAdditionalDetails.customModule);
    }

    public final GroupCustomModule getCustomModule() {
        return this.customModule;
    }

    public final GroupPolicy getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        GroupPolicy groupPolicy = this.policy;
        int iHashCode = (groupPolicy == null ? 0 : groupPolicy.hashCode()) * 31;
        GroupCustomModule groupCustomModule = this.customModule;
        return iHashCode + (groupCustomModule != null ? groupCustomModule.hashCode() : 0);
    }

    public String toString() {
        return "GroupAdditionalDetails(policy=" + this.policy + ", customModule=" + this.customModule + ")";
    }

    public GroupAdditionalDetails(@sp3(name = "policy") GroupPolicy groupPolicy, @sp3(name = "customModule") GroupCustomModule groupCustomModule) {
        this.policy = groupPolicy;
        this.customModule = groupCustomModule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupAdditionalDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
