package com.teamviewer.apidefinitions.policies.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JK\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/PolicyData;", "", "policyId", "Ljava/util/UUID;", "policyName", "", "isDefault", "", "lastChanged", "Ljava/time/OffsetDateTime;", "createdBy", "", "settings", "", "Lcom/teamviewer/apidefinitions/policies/models/Settings;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;ZLjava/time/OffsetDateTime;ILjava/util/List;)V", "getPolicyId", "()Ljava/util/UUID;", "getPolicyName", "()Ljava/lang/String;", "()Z", "getLastChanged", "()Ljava/time/OffsetDateTime;", "getCreatedBy", "()I", "getSettings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PolicyData {
    private final int createdBy;
    private final boolean isDefault;
    private final OffsetDateTime lastChanged;
    private final UUID policyId;
    private final String policyName;
    private final List<Settings> settings;

    public PolicyData(@sp3(name = "policyId") UUID uuid, @sp3(name = "policyName") String str, @sp3(name = "isDefault") boolean z, @sp3(name = "lastChanged") OffsetDateTime offsetDateTime, @sp3(name = "createdBy") int i, @sp3(name = "settings") List<Settings> list) {
        uuid.getClass();
        str.getClass();
        offsetDateTime.getClass();
        list.getClass();
        this.policyId = uuid;
        this.policyName = str;
        this.isDefault = z;
        this.lastChanged = offsetDateTime;
        this.createdBy = i;
        this.settings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolicyData copy$default(PolicyData policyData, UUID uuid, String str, boolean z, OffsetDateTime offsetDateTime, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = policyData.policyId;
        }
        if ((i2 & 2) != 0) {
            str = policyData.policyName;
        }
        if ((i2 & 4) != 0) {
            z = policyData.isDefault;
        }
        if ((i2 & 8) != 0) {
            offsetDateTime = policyData.lastChanged;
        }
        if ((i2 & 16) != 0) {
            i = policyData.createdBy;
        }
        if ((i2 & 32) != 0) {
            list = policyData.settings;
        }
        int i3 = i;
        List list2 = list;
        return policyData.copy(uuid, str, z, offsetDateTime, i3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPolicyName() {
        return this.policyName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OffsetDateTime getLastChanged() {
        return this.lastChanged;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCreatedBy() {
        return this.createdBy;
    }

    public final List<Settings> component6() {
        return this.settings;
    }

    public final PolicyData copy(@sp3(name = "policyId") UUID policyId, @sp3(name = "policyName") String policyName, @sp3(name = "isDefault") boolean isDefault, @sp3(name = "lastChanged") OffsetDateTime lastChanged, @sp3(name = "createdBy") int createdBy, @sp3(name = "settings") List<Settings> settings) {
        policyId.getClass();
        policyName.getClass();
        lastChanged.getClass();
        settings.getClass();
        return new PolicyData(policyId, policyName, isDefault, lastChanged, createdBy, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyData)) {
            return false;
        }
        PolicyData policyData = (PolicyData) other;
        return im3.n(this.policyId, policyData.policyId) && im3.n(this.policyName, policyData.policyName) && this.isDefault == policyData.isDefault && im3.n(this.lastChanged, policyData.lastChanged) && this.createdBy == policyData.createdBy && im3.n(this.settings, policyData.settings);
    }

    public final int getCreatedBy() {
        return this.createdBy;
    }

    public final OffsetDateTime getLastChanged() {
        return this.lastChanged;
    }

    public final UUID getPolicyId() {
        return this.policyId;
    }

    public final String getPolicyName() {
        return this.policyName;
    }

    public final List<Settings> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode() + fx3.a(this.createdBy, (this.lastChanged.hashCode() + to7.f(to7.e(this.policyId.hashCode() * 31, 31, this.policyName), 31, this.isDefault)) * 31, 31);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public String toString() {
        return "PolicyData(policyId=" + this.policyId + ", policyName=" + this.policyName + ", isDefault=" + this.isDefault + ", lastChanged=" + this.lastChanged + ", createdBy=" + this.createdBy + ", settings=" + this.settings + ")";
    }
}
