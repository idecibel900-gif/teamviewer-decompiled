package com.teamviewer.apidefinitions.rolloutconfigurations.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfigurationsGetResponse;", "", "rolloutConfigurations", "", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;", "continuationToken", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRolloutConfigurations", "()Ljava/util/List;", "getContinuationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RolloutConfigurationsGetResponse {
    private final String continuationToken;
    private final List<RolloutConfiguration> rolloutConfigurations;

    public RolloutConfigurationsGetResponse(@sp3(name = "rolloutConfigurations") List<RolloutConfiguration> list, @sp3(name = "continuationToken") String str) {
        list.getClass();
        this.rolloutConfigurations = list;
        this.continuationToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RolloutConfigurationsGetResponse copy$default(RolloutConfigurationsGetResponse rolloutConfigurationsGetResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rolloutConfigurationsGetResponse.rolloutConfigurations;
        }
        if ((i & 2) != 0) {
            str = rolloutConfigurationsGetResponse.continuationToken;
        }
        return rolloutConfigurationsGetResponse.copy(list, str);
    }

    public final List<RolloutConfiguration> component1() {
        return this.rolloutConfigurations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final RolloutConfigurationsGetResponse copy(@sp3(name = "rolloutConfigurations") List<RolloutConfiguration> rolloutConfigurations, @sp3(name = "continuationToken") String continuationToken) {
        rolloutConfigurations.getClass();
        return new RolloutConfigurationsGetResponse(rolloutConfigurations, continuationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RolloutConfigurationsGetResponse)) {
            return false;
        }
        RolloutConfigurationsGetResponse rolloutConfigurationsGetResponse = (RolloutConfigurationsGetResponse) other;
        return im3.n(this.rolloutConfigurations, rolloutConfigurationsGetResponse.rolloutConfigurations) && im3.n(this.continuationToken, rolloutConfigurationsGetResponse.continuationToken);
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<RolloutConfiguration> getRolloutConfigurations() {
        return this.rolloutConfigurations;
    }

    public int hashCode() {
        int iHashCode = this.rolloutConfigurations.hashCode() * 31;
        String str = this.continuationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RolloutConfigurationsGetResponse(rolloutConfigurations=" + this.rolloutConfigurations + ", continuationToken=" + this.continuationToken + ")";
    }

    public /* synthetic */ RolloutConfigurationsGetResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
