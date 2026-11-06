package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class br7 {
    public final xo a;
    public final long b;
    public final vs7 c;
    public final v65 d;
    public final ft7 e;
    public long f;
    public final xo g;
    public final zr7 h;
    public final ws7 i;

    public br7(zr7 zr7Var, v65 v65Var, ws7 ws7Var, ft7 ft7Var) {
        xo xoVar = zr7Var.a;
        long j = zr7Var.b;
        vs7 vs7Var = ws7Var != null ? ws7Var.a : null;
        this.a = xoVar;
        this.b = j;
        this.c = vs7Var;
        this.d = v65Var;
        this.e = ft7Var;
        this.f = j;
        this.g = xoVar;
        this.h = zr7Var;
        this.i = ws7Var;
    }

    public final List a(Function1 function1) {
        if (!gt7.c(this.f)) {
            return qf0.L(new cx0("", 0), new dv6(gt7.f(this.f), gt7.f(this.f)));
        }
        e82 e82Var = (e82) function1.invoke(this);
        if (e82Var != null) {
            return qf0.K(e82Var);
        }
        return null;
    }

    public final Integer b() {
        vs7 vs7Var = this.c;
        if (vs7Var == null) {
            return null;
        }
        xu4 xu4Var = vs7Var.b;
        int iE = gt7.e(this.f);
        v65 v65Var = this.d;
        return Integer.valueOf(v65Var.k(xu4Var.c(xu4Var.d(v65Var.q(iE)), true)));
    }

    public final Integer c() {
        vs7 vs7Var = this.c;
        if (vs7Var == null) {
            return null;
        }
        int iF = gt7.f(this.f);
        v65 v65Var = this.d;
        return Integer.valueOf(v65Var.k(vs7Var.g(vs7Var.b.d(v65Var.q(iF)))));
    }

    public final Integer d() {
        int length;
        vs7 vs7Var = this.c;
        if (vs7Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            xo xoVar = this.a;
            if (iR < xoVar.n.length()) {
                int length2 = this.g.n.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j = vs7Var.j(length2);
                int i = gt7.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iR) {
                    length = this.d.k(i2);
                    break;
                }
                iR++;
            } else {
                length = xoVar.n.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iK;
        vs7 vs7Var = this.c;
        if (vs7Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.n.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j = vs7Var.j(length);
            int i = gt7.c;
            int i2 = (int) (j >> 32);
            if (i2 < iR) {
                iK = this.d.k(i2);
                return Integer.valueOf(iK);
            }
        }
        iK = 0;
        return Integer.valueOf(iK);
    }

    public final boolean f() {
        vs7 vs7Var = this.c;
        return (vs7Var != null ? vs7Var.h(r()) : null) != rb6.n;
    }

    public final int g(vs7 vs7Var, int i) {
        int iR = r();
        ft7 ft7Var = this.e;
        if (ft7Var.a == null) {
            ft7Var.a = Float.valueOf(vs7Var.c(iR).a);
        }
        xu4 xu4Var = vs7Var.b;
        int iD = xu4Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= xu4Var.f) {
            return this.g.n.length();
        }
        float fB = xu4Var.b(iD) - 1.0f;
        Float f = ft7Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= vs7Var.f(iD)) || (!f() && fFloatValue <= vs7Var.e(iD))) {
            return xu4Var.c(iD, true);
        }
        return this.d.k(xu4Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(ws7 ws7Var, int i) {
        v56 v56VarB;
        i04 i04Var = ws7Var.b;
        vs7 vs7Var = ws7Var.a;
        if (i04Var == null) {
            v56VarB = v56.e;
        } else {
            i04 i04Var2 = ws7Var.c;
            v56VarB = i04Var2 != null ? i04Var2.b(i04Var, true) : null;
            if (v56VarB == null) {
                v56VarB = v56.e;
            }
        }
        long j = this.h.b;
        int i2 = gt7.c;
        v65 v65Var = this.d;
        v56 v56VarC = vs7Var.c(v65Var.q((int) (j & 4294967295L)));
        float f = v56VarC.a;
        return v65Var.k(vs7Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (v56VarB.c() & 4294967295L)) * i) + v56VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        ft7 ft7Var = this.e;
        ft7Var.a = null;
        xo xoVar = this.g;
        if (xoVar.n.length() > 0) {
            if (f()) {
                k();
                return;
            }
            ft7Var.a = null;
            if (xoVar.n.length() > 0) {
                String str = xoVar.n;
                long j = this.f;
                int i = gt7.c;
                int iL = x67.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        xo xoVar = this.g;
        String str = xoVar.n;
        String str2 = xoVar.n;
        if (str.length() > 0) {
            int iG = v67.g(gt7.e(this.f), str2);
            if (iG == gt7.e(this.f) && iG != str2.length()) {
                iG = v67.g(iG + 1, str2);
            }
            q(iG, iG);
        }
    }

    public final void k() {
        this.e.a = null;
        xo xoVar = this.g;
        if (xoVar.n.length() > 0) {
            String str = xoVar.n;
            long j = this.f;
            int i = gt7.c;
            int iM = x67.m((int) (j & 4294967295L), str);
            if (iM != -1) {
                q(iM, iM);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        xo xoVar = this.g;
        String str = xoVar.n;
        String str2 = xoVar.n;
        if (str.length() > 0) {
            int iH = v67.h(gt7.f(this.f), str2);
            if (iH == gt7.f(this.f) && iH != 0) {
                iH = v67.h(iH - 1, str2);
            }
            q(iH, iH);
        }
    }

    public final void m() {
        ft7 ft7Var = this.e;
        ft7Var.a = null;
        xo xoVar = this.g;
        if (xoVar.n.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            ft7Var.a = null;
            if (xoVar.n.length() > 0) {
                String str = xoVar.n;
                long j = this.f;
                int i = gt7.c;
                int iL = x67.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.n.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.n.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.n.length() > 0) {
            int i = gt7.c;
            this.f = h57.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = h57.a(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = gt7.c;
        return this.d.q((int) (j & 4294967295L));
    }
}
