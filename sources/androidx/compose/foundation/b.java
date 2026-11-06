package androidx.compose.foundation;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import o.cs4;
import o.fs4;
import o.mw4;
import o.pe6;
import o.uf0;
import o.ug3;
import o.xg3;
import o.xw3;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static fs4 a(fs4 fs4Var, mw4 mw4Var, xg3 xg3Var, boolean z, pe6 pe6Var, Function0 function0, int i) {
        fs4 fs4VarF;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            pe6Var = null;
        }
        pe6 pe6Var2 = pe6Var;
        if (xg3Var != null) {
            fs4VarF = new ClickableElement(mw4Var, xg3Var, false, z2, null, pe6Var2, function0);
        } else if (xg3Var == null) {
            fs4VarF = new ClickableElement(mw4Var, null, false, z2, null, pe6Var2, function0);
        } else {
            cs4 cs4Var = cs4.b;
            fs4VarF = mw4Var != null ? ug3.a(cs4Var, mw4Var, xg3Var).f(new ClickableElement(mw4Var, null, false, z2, null, pe6Var2, function0)) : uf0.k(cs4Var, new a(xg3Var, z2, pe6Var2, function0));
        }
        return fs4Var.f(fs4VarF);
    }

    public static fs4 b(fs4 fs4Var, boolean z, String str, pe6 pe6Var, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return fs4Var.f(new ClickableElement(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : pe6Var, function0));
    }

    public static fs4 c(fs4 fs4Var, mw4 mw4Var, Function0 function0) {
        return fs4Var.f(new CombinedClickableElement(function0, null, mw4Var, false));
    }

    public static fs4 d(fs4 fs4Var, Function0 function0, Function0 function1) {
        return fs4Var.f(new CombinedClickableElement(function1, function0, null, true));
    }

    public static final boolean e(KeyEvent keyEvent) {
        long jB = yo1.B(keyEvent);
        int i = xw3.O;
        return xw3.a(jB, xw3.h) || xw3.a(jB, xw3.r) || xw3.a(jB, xw3.E) || xw3.a(jB, xw3.q);
    }
}
