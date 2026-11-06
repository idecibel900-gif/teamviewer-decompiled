package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class yh {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(w65 w65Var, fs4 fs4Var, long j, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(1776202187);
        int i3 = (ux2Var.f(w65Var) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 128;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                ux2Var.Q();
                i2 = i3 & (-897);
            }
            ux2Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new q0(w65Var, (byte) 11);
                ux2Var.g0(objK);
            }
            uf0.d(w65Var, xz2.p, au8.O(-1653527038, new th(j, cp6.a(fs4Var, false, (Function1) objK)), ux2Var), ux2Var, i4 | 432);
        } else {
            ux2Var.Q();
        }
        long j2 = j;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new uh(w65Var, fs4Var, j2, i);
        }
    }

    public static final void b(fs4 fs4Var, ux2 ux2Var, int i, int i2) {
        int i3;
        ux2Var.Y(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        }
        byte b = 0;
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                fs4Var = cs4.b;
            }
            b77.a(ux2Var, j51.C(androidx.compose.foundation.layout.b.m(fs4Var, a, 25.0f), new wh(((jt7) ux2Var.j(kt7.a)).a, b)));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(fs4Var, i, i2);
        }
    }
}
