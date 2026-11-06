package com.teamviewer.apidefinitions.account.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TVSublicense;", "", "parentTeamViewerLicenseId", "Ljava/util/UUID;", "sublicenseId", "name", "", "channels", "", "channelLimitResponsibleAccountIds", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;ILjava/util/List;)V", "getParentTeamViewerLicenseId", "()Ljava/util/UUID;", "getSublicenseId", "getName", "()Ljava/lang/String;", "getChannels", "()I", "getChannelLimitResponsibleAccountIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TVSublicense {
    private final List<Integer> channelLimitResponsibleAccountIds;
    private final int channels;
    private final String name;
    private final UUID parentTeamViewerLicenseId;
    private final UUID sublicenseId;

    public TVSublicense(@sp3(name = "parentTeamViewerLicenseId") UUID uuid, @sp3(name = "sublicenseId") UUID uuid2, @sp3(name = "name") String str, @sp3(name = "channels") int i, @sp3(name = "channelLimitResponsibleAccountIds") List<Integer> list) {
        uuid.getClass();
        uuid2.getClass();
        str.getClass();
        this.parentTeamViewerLicenseId = uuid;
        this.sublicenseId = uuid2;
        this.name = str;
        this.channels = i;
        this.channelLimitResponsibleAccountIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TVSublicense copy$default(TVSublicense tVSublicense, UUID uuid, UUID uuid2, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uuid = tVSublicense.parentTeamViewerLicenseId;
        }
        if ((i2 & 2) != 0) {
            uuid2 = tVSublicense.sublicenseId;
        }
        if ((i2 & 4) != 0) {
            str = tVSublicense.name;
        }
        if ((i2 & 8) != 0) {
            i = tVSublicense.channels;
        }
        if ((i2 & 16) != 0) {
            list = tVSublicense.channelLimitResponsibleAccountIds;
        }
        List list2 = list;
        String str2 = str;
        return tVSublicense.copy(uuid, uuid2, str2, i, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getParentTeamViewerLicenseId() {
        return this.parentTeamViewerLicenseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UUID getSublicenseId() {
        return this.sublicenseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChannels() {
        return this.channels;
    }

    public final List<Integer> component5() {
        return this.channelLimitResponsibleAccountIds;
    }

    public final TVSublicense copy(@sp3(name = "parentTeamViewerLicenseId") UUID parentTeamViewerLicenseId, @sp3(name = "sublicenseId") UUID sublicenseId, @sp3(name = "name") String name, @sp3(name = "channels") int channels, @sp3(name = "channelLimitResponsibleAccountIds") List<Integer> channelLimitResponsibleAccountIds) {
        parentTeamViewerLicenseId.getClass();
        sublicenseId.getClass();
        name.getClass();
        return new TVSublicense(parentTeamViewerLicenseId, sublicenseId, name, channels, channelLimitResponsibleAccountIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TVSublicense)) {
            return false;
        }
        TVSublicense tVSublicense = (TVSublicense) other;
        return im3.n(this.parentTeamViewerLicenseId, tVSublicense.parentTeamViewerLicenseId) && im3.n(this.sublicenseId, tVSublicense.sublicenseId) && im3.n(this.name, tVSublicense.name) && this.channels == tVSublicense.channels && im3.n(this.channelLimitResponsibleAccountIds, tVSublicense.channelLimitResponsibleAccountIds);
    }

    public final List<Integer> getChannelLimitResponsibleAccountIds() {
        return this.channelLimitResponsibleAccountIds;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final String getName() {
        return this.name;
    }

    public final UUID getParentTeamViewerLicenseId() {
        return this.parentTeamViewerLicenseId;
    }

    public final UUID getSublicenseId() {
        return this.sublicenseId;
    }

    public int hashCode() {
        int iA = fx3.a(this.channels, to7.e(ua5.e(this.sublicenseId, this.parentTeamViewerLicenseId.hashCode() * 31, 31), 31, this.name), 31);
        List<Integer> list = this.channelLimitResponsibleAccountIds;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TVSublicense(parentTeamViewerLicenseId=" + this.parentTeamViewerLicenseId + ", sublicenseId=" + this.sublicenseId + ", name=" + this.name + ", channels=" + this.channels + ", channelLimitResponsibleAccountIds=" + this.channelLimitResponsibleAccountIds + ")";
    }

    public /* synthetic */ TVSublicense(UUID uuid, UUID uuid2, String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, str, i, (i2 & 16) != 0 ? null : list);
    }
}
