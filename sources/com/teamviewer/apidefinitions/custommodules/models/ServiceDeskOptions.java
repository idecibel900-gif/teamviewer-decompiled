package com.teamviewer.apidefinitions.custommodules.models;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/ServiceDeskOptions;", "", "enableServiceDesk", "", "mandatoryDescription", "customModuleSessionRequestMappingId", "Ljava/util/UUID;", "<init>", "(ZLjava/lang/Boolean;Ljava/util/UUID;)V", "getEnableServiceDesk", "()Z", "getMandatoryDescription", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCustomModuleSessionRequestMappingId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Boolean;Ljava/util/UUID;)Lcom/teamviewer/apidefinitions/custommodules/models/ServiceDeskOptions;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ServiceDeskOptions {
    private final UUID customModuleSessionRequestMappingId;
    private final boolean enableServiceDesk;
    private final Boolean mandatoryDescription;

    public /* synthetic */ ServiceDeskOptions(boolean z, Boolean bool, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : uuid);
    }

    public static /* synthetic */ ServiceDeskOptions copy$default(ServiceDeskOptions serviceDeskOptions, boolean z, Boolean bool, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            z = serviceDeskOptions.enableServiceDesk;
        }
        if ((i & 2) != 0) {
            bool = serviceDeskOptions.mandatoryDescription;
        }
        if ((i & 4) != 0) {
            uuid = serviceDeskOptions.customModuleSessionRequestMappingId;
        }
        return serviceDeskOptions.copy(z, bool, uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableServiceDesk() {
        return this.enableServiceDesk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getMandatoryDescription() {
        return this.mandatoryDescription;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UUID getCustomModuleSessionRequestMappingId() {
        return this.customModuleSessionRequestMappingId;
    }

    public final ServiceDeskOptions copy(@sp3(name = "enableServiceDesk") boolean enableServiceDesk, @sp3(name = "mandatoryDescription") Boolean mandatoryDescription, @sp3(name = "customModuleSessionRequestMappingId") UUID customModuleSessionRequestMappingId) {
        return new ServiceDeskOptions(enableServiceDesk, mandatoryDescription, customModuleSessionRequestMappingId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceDeskOptions)) {
            return false;
        }
        ServiceDeskOptions serviceDeskOptions = (ServiceDeskOptions) other;
        return this.enableServiceDesk == serviceDeskOptions.enableServiceDesk && im3.n(this.mandatoryDescription, serviceDeskOptions.mandatoryDescription) && im3.n(this.customModuleSessionRequestMappingId, serviceDeskOptions.customModuleSessionRequestMappingId);
    }

    public final UUID getCustomModuleSessionRequestMappingId() {
        return this.customModuleSessionRequestMappingId;
    }

    public final boolean getEnableServiceDesk() {
        return this.enableServiceDesk;
    }

    public final Boolean getMandatoryDescription() {
        return this.mandatoryDescription;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enableServiceDesk) * 31;
        Boolean bool = this.mandatoryDescription;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UUID uuid = this.customModuleSessionRequestMappingId;
        return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "ServiceDeskOptions(enableServiceDesk=" + this.enableServiceDesk + ", mandatoryDescription=" + this.mandatoryDescription + ", customModuleSessionRequestMappingId=" + this.customModuleSessionRequestMappingId + ")";
    }

    public ServiceDeskOptions(@sp3(name = "enableServiceDesk") boolean z, @sp3(name = "mandatoryDescription") Boolean bool, @sp3(name = "customModuleSessionRequestMappingId") UUID uuid) {
        this.enableServiceDesk = z;
        this.mandatoryDescription = bool;
        this.customModuleSessionRequestMappingId = uuid;
    }
}
