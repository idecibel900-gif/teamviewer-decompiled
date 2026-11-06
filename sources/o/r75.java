package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum r75 implements q93 {
    OnBoardingOpened(null, "onboarding-dialog", 23),
    OnSkipLoginClicked(EventType.Event, "skipped", 20);

    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1899o;

    r75(EventType eventType, String str, int i) {
        eventType = (i & 1) != 0 ? EventType.View : eventType;
        boolean z = (i & 2) == 0;
        this.m = eventType;
        this.n = z;
        this.f1899o = str;
    }

    @Override // o.q93
    public final String a() {
        return "onboarding";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f1899o;
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
