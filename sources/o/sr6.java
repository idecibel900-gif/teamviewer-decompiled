package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum sr6 implements q93 {
    OnServiceQueueScreenOpen(EventType.View, "service-queue-screen-opened", null, 20),
    OnServiceQueueConnectClicked(null, "service-queue-connect-clicked", null, 23),
    OnServiceQueueSortByClicked(null, "service-queue-sort-by-clicked", null, 23),
    OnServiceQueueSortByOptionAscendingClicked(null, "service-queue-sort-by-option-clicked", "ascending", 7),
    OnServiceQueueSortByOptionDescendingClicked(null, "service-queue-sort-by-option-clicked", "descending", 7),
    OnServiceQueueSortByOptionWaitingClicked(null, "service-queue-sort-by-option-clicked", "waiting", 7),
    OnServiceQueueSortByOptionNotJoinedClicked(null, "service-queue-sort-by-option-clicked", "not_joined", 7),
    OnServiceQueueMoreActionsClicked(null, "service-queue-more-actions-clicked", null, 23),
    OnServiceQueueAssignToMeClicked(null, "service-queue-assign-to-me-clicked", null, 23),
    OnServiceQueueUnassignClicked(null, "service-queue-unassign-clicked", null, 23),
    OnServiceQueueRemoveSessionClicked(null, "service-queue-remove-session-clicked", null, 23),
    OnServiceQueueShowDetailsClicked(null, "service-queue-show-details-clicked", null, 23),
    OnServiceQueueEditSessionClicked(null, "service-queue-edit-session-clicked", null, 23),
    OnServiceQueueShareSessionClicked(null, "service-queue-share-session-clicked", null, 23),
    OnServiceQueueCopySessionLinkClicked(null, "service-queue-copy-session-link-clicked", null, 23),
    OnServiceQueueShareSessionLinkClicked(null, "service-queue-share-session-link-clicked", null, 23),
    OnServiceQueueCopySessionCodeClicked(null, "service-queue-copy-session-code-clicked", null, 23),
    OnServiceQueueShareSessionCodeClicked(null, "service-queue-share-session-code-clicked", null, 23);

    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2044o;
    public final String p;

    sr6(EventType eventType, String str, String str2, int i) {
        eventType = (i & 1) != 0 ? EventType.Event : eventType;
        boolean z = (i & 2) != 0;
        str2 = (i & 16) != 0 ? "" : str2;
        this.m = eventType;
        this.n = z;
        this.f2044o = str;
        this.p = str2;
    }

    @Override // o.q93
    public final String a() {
        return "devices-screen-servicequeue";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f2044o;
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return this.p;
    }
}
