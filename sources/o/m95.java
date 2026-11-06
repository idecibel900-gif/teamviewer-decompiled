package o;

/* JADX INFO: loaded from: classes.dex */
public final class m95 extends hm2 {
    public static final m95 d = new m95(0, 2, 1);

    @Override // o.hm2
    public final void c(rr0 rr0Var, jv jvVar, k17 k17Var, au2 au2Var, sa5 sa5Var) {
        al3 al3Var = (al3) rr0Var.h(1);
        boolean z = false;
        int i = al3Var != null ? al3Var.a : 0;
        tm0 tm0Var = (tm0) rr0Var.h(0);
        if (i > 0) {
            io.sentry.android.replay.screenshot.h hVar = new io.sentry.android.replay.screenshot.h();
            hVar.f166o = jvVar;
            hVar.m = i;
            jvVar = hVar;
        }
        tm0Var.C(jvVar, k17Var, au2Var, sa5Var != null ? new a65((byte) 5, (Object) sa5Var, (Object) k17Var, z) : null);
    }
}
