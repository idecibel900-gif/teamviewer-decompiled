package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ThirdPartyFeature;", "", "featureName", "", "featureId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureName", "()Ljava/lang/String;", "getFeatureId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyFeature {
    private final String featureId;
    private final String featureName;

    public ThirdPartyFeature(@sp3(name = "featureName") String str, @sp3(name = "featureId") String str2) {
        str.getClass();
        str2.getClass();
        this.featureName = str;
        this.featureId = str2;
    }

    public static /* synthetic */ ThirdPartyFeature copy$default(ThirdPartyFeature thirdPartyFeature, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyFeature.featureName;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyFeature.featureId;
        }
        return thirdPartyFeature.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeatureId() {
        return this.featureId;
    }

    public final ThirdPartyFeature copy(@sp3(name = "featureName") String featureName, @sp3(name = "featureId") String featureId) {
        featureName.getClass();
        featureId.getClass();
        return new ThirdPartyFeature(featureName, featureId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyFeature)) {
            return false;
        }
        ThirdPartyFeature thirdPartyFeature = (ThirdPartyFeature) other;
        return im3.n(this.featureName, thirdPartyFeature.featureName) && im3.n(this.featureId, thirdPartyFeature.featureId);
    }

    public final String getFeatureId() {
        return this.featureId;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public int hashCode() {
        return this.featureId.hashCode() + (this.featureName.hashCode() * 31);
    }

    public String toString() {
        return fx3.h("ThirdPartyFeature(featureName=", this.featureName, ", featureId=", this.featureId, ")");
    }
}
