package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum zh8 implements q93 {
    ScreenOpened(EventType.View, "login-dialog", 20),
    OnSignInClicked(null, "sign-in-initiated", 23),
    OnCreateAccountClicked(null, "create-account-initiated", 23),
    OnAuthTabMethod(null, "auth-tab-method-used", 23),
    OnCustomTabMethod(null, "custom-tab-method-used", 23);

    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2704o;

    zh8(EventType eventType, String str, int i) {
        eventType = (i & 1) != 0 ? EventType.Event : eventType;
        boolean z = (i & 2) != 0;
        this.m = eventType;
        this.n = z;
        this.f2704o = str;
    }

    @Override // o.q93
    public final String a() {
        return "";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f2704o;
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
