package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum qs6 implements q93 {
    OnFileTransfer("file-transfer"),
    OnRemoteControl("remote-control");

    public final EventType m;
    public final String n;

    qs6(String str) {
        EventType eventType = EventType.Event;
        this.m = eventType;
        this.n = str;
    }

    @Override // o.q93
    public final String a() {
        return "session-creation";
    }

    @Override // o.q93
    public final boolean c() {
        return true;
    }

    @Override // o.q93
    public final String e() {
        return "session-initiated";
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return this.n;
    }
}
