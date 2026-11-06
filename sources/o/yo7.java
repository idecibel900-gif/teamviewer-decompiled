package o;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class yo7 extends xs1 {
    public final /* synthetic */ i67 b;
    public final /* synthetic */ ap7 c;

    public yo7(ap7 ap7Var, i67 i67Var) {
        this.c = ap7Var;
        this.b = i67Var;
    }

    @Override // o.xs1
    public final void T(int i) {
        this.c.m = true;
        this.b.v(i);
    }

    @Override // o.xs1
    public final void U(Typeface typeface) {
        ap7 ap7Var = this.c;
        Typeface typefaceCreate = Typeface.create(typeface, ap7Var.d);
        ap7Var.n = typefaceCreate;
        ap7Var.m = true;
        this.b.w(typefaceCreate, false);
    }
}
