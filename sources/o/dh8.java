package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum dh8 implements q93 {
    WakeUpFromDeviceList("device-list"),
    WakeUpFromDeviceActionsPage("device-action");

    public final EventType m;
    public final String n;

    dh8(String str) {
        EventType eventType = EventType.Event;
        this.m = eventType;
        this.n = str;
    }

    @Override // o.q93
    public final String a() {
        return "computers-and-contacts";
    }

    @Override // o.q93
    public final boolean c() {
        return true;
    }

    @Override // o.q93
    public final String e() {
        return this.n;
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return "wake-up";
    }
}
