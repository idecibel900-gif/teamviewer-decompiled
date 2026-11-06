package o;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public abstract class dg {
    public static final Canvas a = new Canvas();

    public static final cg a(vi viVar) {
        cg cgVar = new cg();
        cgVar.a = new Canvas(mo8.f(viVar));
        return cgVar;
    }

    public static final Canvas b(ll0 ll0Var) {
        ll0Var.getClass();
        return ((cg) ll0Var).a;
    }
}
