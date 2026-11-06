package o;

/* JADX INFO: loaded from: classes.dex */
public final class g60 {
    public int a;
    public int b;
    public String c;

    public static io.sentry.android.replay.screenshot.h a() {
        io.sentry.android.replay.screenshot.h hVar = new io.sentry.android.replay.screenshot.h();
        hVar.n = 0;
        hVar.f166o = "";
        return hVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = tr8.a;
        is8 is8Var = er8.f736o;
        Integer numValueOf = Integer.valueOf(i);
        return to7.k("Response Code: ", (!is8Var.containsKey(numValueOf) ? er8.RESPONSE_CODE_UNSPECIFIED : (er8) is8Var.get(numValueOf)).toString(), ", Debug Message: ", this.c);
    }
}
