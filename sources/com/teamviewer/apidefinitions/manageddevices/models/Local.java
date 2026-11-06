package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/Local;", "", "managementId", "Ljava/util/UUID;", "isManaged", "", "isChangeAllowed", "managers", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/EntityManagerListEntry;", "<init>", "(Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "getManagementId", "()Ljava/util/UUID;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getManagers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/teamviewer/apidefinitions/manageddevices/models/Local;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Local {
    private final Boolean isChangeAllowed;
    private final Boolean isManaged;
    private final UUID managementId;
    private final List<EntityManagerListEntry> managers;

    public /* synthetic */ Local(UUID uuid, Boolean bool, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Local copy$default(Local local, UUID uuid, Boolean bool, Boolean bool2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = local.managementId;
        }
        if ((i & 2) != 0) {
            bool = local.isManaged;
        }
        if ((i & 4) != 0) {
            bool2 = local.isChangeAllowed;
        }
        if ((i & 8) != 0) {
            list = local.managers;
        }
        return local.copy(uuid, bool, bool2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getManagementId() {
        return this.managementId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsManaged() {
        return this.isManaged;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsChangeAllowed() {
        return this.isChangeAllowed;
    }

    public final List<EntityManagerListEntry> component4() {
        return this.managers;
    }

    public final Local copy(@sp3(name = "managementId") UUID managementId, @sp3(name = "isManaged") Boolean isManaged, @sp3(name = "isChangeAllowed") Boolean isChangeAllowed, @sp3(name = "managers") List<EntityManagerListEntry> managers) {
        return new Local(managementId, isManaged, isChangeAllowed, managers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Local)) {
            return false;
        }
        Local local = (Local) other;
        return im3.n(this.managementId, local.managementId) && im3.n(this.isManaged, local.isManaged) && im3.n(this.isChangeAllowed, local.isChangeAllowed) && im3.n(this.managers, local.managers);
    }

    public final UUID getManagementId() {
        return this.managementId;
    }

    public final List<EntityManagerListEntry> getManagers() {
        return this.managers;
    }

    public int hashCode() {
        UUID uuid = this.managementId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        Boolean bool = this.isManaged;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isChangeAllowed;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<EntityManagerListEntry> list = this.managers;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isChangeAllowed() {
        return this.isChangeAllowed;
    }

    public final Boolean isManaged() {
        return this.isManaged;
    }

    public String toString() {
        return "Local(managementId=" + this.managementId + ", isManaged=" + this.isManaged + ", isChangeAllowed=" + this.isChangeAllowed + ", managers=" + this.managers + ")";
    }

    public Local(@sp3(name = "managementId") UUID uuid, @sp3(name = "isManaged") Boolean bool, @sp3(name = "isChangeAllowed") Boolean bool2, @sp3(name = "managers") List<EntityManagerListEntry> list) {
        this.managementId = uuid;
        this.isManaged = bool;
        this.isChangeAllowed = bool2;
        this.managers = list;
    }

    public Local() {
        this(null, null, null, null, 15, null);
    }
}
