package androidx.compose.ui.draw;

import o.fs4;
import o.he;
import o.sb1;
import o.tv0;
import o.ud5;
import o.xz2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static fs4 a(fs4 fs4Var, ud5 ud5Var, he heVar, sb1 sb1Var, float f, tv0 tv0Var, int i) {
        if ((i & 4) != 0) {
            heVar = xz2.s;
        }
        he heVar2 = heVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return fs4Var.f(new PainterElement(ud5Var, heVar2, sb1Var, f, tv0Var));
    }
}
