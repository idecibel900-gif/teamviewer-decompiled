package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class es0 {
    public static final Set c;
    public final io.sentry.android.replay.screenshot.k a;
    public final h50 b;

    static {
        ht2 ht2VarG = s87.c.g();
        ht2 ht2VarE = ht2VarG.e();
        sy4 sy4VarF = ht2VarG.f();
        sy4VarF.getClass();
        c = lv1.V(new js0(ht2VarE, sy4VarF));
    }

    public es0(io.sentry.android.replay.screenshot.k kVar) {
        this.a = kVar;
        this.b = ((xd4) kVar.a).c(new t(this, (byte) 14));
    }

    public final ns4 a(js0 js0Var, xr0 xr0Var) {
        js0Var.getClass();
        return (ns4) this.b.invoke(new ds0(js0Var, xr0Var));
    }
}
