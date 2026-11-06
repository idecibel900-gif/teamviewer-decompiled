package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/GroupPolicy;", "", "tvClientSettingsPolicyId", "", "tvClientSettingsPolicyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTvClientSettingsPolicyId", "()Ljava/lang/String;", "getTvClientSettingsPolicyName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupPolicy {
    private final String tvClientSettingsPolicyId;
    private final String tvClientSettingsPolicyName;

    public /* synthetic */ GroupPolicy(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ GroupPolicy copy$default(GroupPolicy groupPolicy, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupPolicy.tvClientSettingsPolicyId;
        }
        if ((i & 2) != 0) {
            str2 = groupPolicy.tvClientSettingsPolicyName;
        }
        return groupPolicy.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTvClientSettingsPolicyId() {
        return this.tvClientSettingsPolicyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTvClientSettingsPolicyName() {
        return this.tvClientSettingsPolicyName;
    }

    public final GroupPolicy copy(@sp3(name = "tvClientSettingsPolicyId") String tvClientSettingsPolicyId, @sp3(name = "tvClientSettingsPolicyName") String tvClientSettingsPolicyName) {
        return new GroupPolicy(tvClientSettingsPolicyId, tvClientSettingsPolicyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupPolicy)) {
            return false;
        }
        GroupPolicy groupPolicy = (GroupPolicy) other;
        return im3.n(this.tvClientSettingsPolicyId, groupPolicy.tvClientSettingsPolicyId) && im3.n(this.tvClientSettingsPolicyName, groupPolicy.tvClientSettingsPolicyName);
    }

    public final String getTvClientSettingsPolicyId() {
        return this.tvClientSettingsPolicyId;
    }

    public final String getTvClientSettingsPolicyName() {
        return this.tvClientSettingsPolicyName;
    }

    public int hashCode() {
        String str = this.tvClientSettingsPolicyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tvClientSettingsPolicyName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return fx3.h("GroupPolicy(tvClientSettingsPolicyId=", this.tvClientSettingsPolicyId, ", tvClientSettingsPolicyName=", this.tvClientSettingsPolicyName, ")");
    }

    public GroupPolicy(@sp3(name = "tvClientSettingsPolicyId") String str, @sp3(name = "tvClientSettingsPolicyName") String str2) {
        this.tvClientSettingsPolicyId = str;
        this.tvClientSettingsPolicyName = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupPolicy() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
