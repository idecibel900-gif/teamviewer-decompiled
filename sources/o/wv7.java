package o;

import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wv7 extends kt0 {
    public boolean Y;
    public Function1 Z;
    public final ks7 a0;

    public wv7(boolean z, mw4 mw4Var, boolean z2, boolean z3, pe6 pe6Var, Function1 function1) {
        super(mw4Var, null, z2, z3, null, pe6Var, new fq0(function1, z, (byte) 2));
        this.Y = z;
        this.Z = function1;
        this.a0 = new ks7(this, (byte) 3);
    }

    @Override // o.p0
    public final void X0(op6 op6Var) {
        lp6.k(op6Var, this.Y ? xv7.m : xv7.n);
        lp6.c(op6Var, yl7.v);
        lp6.f(op6Var, new pi(AutofillValue.forToggle(this.Y)));
        lp6.b(op6Var, new sq0(op6Var, (byte) 1));
    }
}
