package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum b47 implements q93 {
    LoginErrorIncorrectEmail("incorrect-email-toast"),
    LoginErrorExpired("sign-in-expired-toast"),
    LoginErrorTimeOut("sign-in-timed-out-toast"),
    LoginGenericError("unable-sign-in-toast"),
    SessionRemovedSnackbarMessage("session-removed-toast");

    public final EventType m;
    public final String n;

    b47(String str) {
        EventType eventType = EventType.View;
        this.m = eventType;
        this.n = str;
    }

    @Override // o.q93
    public final String a() {
        return "";
    }

    @Override // o.q93
    public final boolean c() {
        return false;
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
        return "";
    }
}
