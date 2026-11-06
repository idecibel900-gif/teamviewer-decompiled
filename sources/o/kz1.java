package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum kz1 implements q93 {
    OnGlobalSearchClicked;

    public final EventType m;

    kz1() {
        EventType eventType = EventType.Event;
        this.m = eventType;
    }

    @Override // o.q93
    public final String a() {
        return "devices-main-topbar";
    }

    @Override // o.q93
    public final boolean c() {
        return true;
    }

    @Override // o.q93
    public final String e() {
        return "global-search-clicked";
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return "";
    }
}
