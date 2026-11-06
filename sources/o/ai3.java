package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum ai3 implements q93 {
    NoBrowserDialog("login-no-browser"),
    DeviceLimitReachedDialog("login-install-limit");

    public final EventType m;
    public final String n;

    ai3(String str) {
        EventType eventType = EventType.View;
        this.m = eventType;
        this.n = str;
    }

    @Override // o.q93
    public final String a() {
        return this.n;
    }

    @Override // o.q93
    public final boolean c() {
        return false;
    }

    @Override // o.q93
    public final String e() {
        return "";
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
