package o;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nu4 extends u45 {
    public final df6 f;
    public final kf0 g;
    public n87 h;

    public nu4(yk6 yk6Var, df6 df6Var, xy0 xy0Var, in1 in1Var) {
        super(yk6Var, xy0Var, in1Var);
        this.f = df6Var;
        this.g = ka0.d(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(nu4 nu4Var, k76 k76Var, h76 h76Var, yk6 yk6Var, k76 k76Var2, long j, jc1 jc1Var) {
        mu4 mu4Var;
        h76 h76Var2;
        yk6 yk6Var2;
        k76 k76Var3;
        boolean z;
        if (jc1Var instanceof mu4) {
            mu4Var = (mu4) jc1Var;
            int i = mu4Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                mu4Var.s = i - Integer.MIN_VALUE;
            } else {
                mu4Var = new mu4(jc1Var);
            }
        } else {
            mu4Var = new mu4(jc1Var);
        }
        Object objU = mu4Var.r;
        int i2 = mu4Var.s;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(objU);
            if (j < 0) {
                return Boolean.FALSE;
            }
            y0 y0Var = new y0(nu4Var, hc1Var, (byte) 22);
            mu4Var.m = nu4Var;
            mu4Var.n = k76Var;
            mu4Var.f1508o = h76Var;
            mu4Var.p = yk6Var;
            mu4Var.q = k76Var2;
            mu4Var.s = 1;
            objU = g77.u(j, y0Var, mu4Var);
            ne1 ne1Var = ne1.m;
            if (objU == ne1Var) {
                return ne1Var;
            }
            h76Var2 = h76Var;
            yk6Var2 = yk6Var;
            k76Var3 = k76Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k76 k76Var4 = mu4Var.q;
            yk6 yk6Var3 = mu4Var.p;
            h76Var2 = mu4Var.f1508o;
            k76 k76Var5 = mu4Var.n;
            nu4 nu4Var2 = mu4Var.m;
            ct1.a0(objU);
            k76Var3 = k76Var4;
            yk6Var2 = yk6Var3;
            k76Var = k76Var5;
            nu4Var = nu4Var2;
        }
        ju4 ju4Var = (ju4) objU;
        if (ju4Var != null) {
            boolean z2 = ((ju4) k76Var.m).c;
            long j2 = ju4Var.a;
            k76Var.m = new ju4(j2, ju4Var.b, z2);
            h76Var2.m = yk6Var2.j(yk6Var2.f(j2));
            k76Var3.m = pm8.b(0.0f, 0.0f, 30);
            wk0 wk0Var = nu4Var.e;
            long j3 = ju4Var.b;
            long j4 = ju4Var.a;
            ((pc8) wk0Var.n).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((pc8) wk0Var.f2420o).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !bt1.G(h76Var2.m);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static ju4 g(kf0 kf0Var) {
        ju4 ju4Var = null;
        aq6 aq6VarM = ct1.M(new v45(new iu4(kf0Var, (byte) 0), null));
        while (aq6VarM.hasNext()) {
            ju4 ju4VarA = (ju4) aq6VarM.next();
            if (ju4Var != null) {
                ju4VarA = ju4Var.a(ju4VarA);
            }
            ju4Var = ju4VarA;
        }
        return ju4Var;
    }

    public final float c(wk6 wk6Var, float f) {
        yk6 yk6Var = this.a;
        long jI = yk6Var.i(yk6Var.e(f));
        yk6 yk6Var2 = wk6Var.a;
        return yk6Var.h(yk6Var.f(yk6Var2.d(yk6Var2.k, jI, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(yk6 yk6Var, ju4 ju4Var, float f, float f2, jc1 jc1Var) {
        ku4 ku4Var;
        f88 f88Var;
        k76 k76Var;
        Object obj;
        h76 h76Var;
        float f3;
        yk6 yk6Var2;
        if (jc1Var instanceof ku4) {
            ku4Var = (ku4) jc1Var;
            int i = ku4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku4Var.r = i - Integer.MIN_VALUE;
            } else {
                ku4Var = new ku4(this, jc1Var);
            }
        } else {
            ku4Var = new ku4(this, jc1Var);
        }
        ku4 ku4Var2 = ku4Var;
        Object obj2 = ku4Var2.p;
        int i2 = ku4Var2.r;
        wk0 wk0Var = this.e;
        f88 f88Var2 = f88.a;
        Object obj3 = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj2);
            k76 k76Var2 = new k76();
            k76Var2.m = ju4Var;
            f88Var = f88Var2;
            long j = ju4Var.b;
            long j2 = ju4Var.a;
            ((pc8) wk0Var.n).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((pc8) wk0Var.f2420o).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            ju4 ju4VarG = g(this.g);
            if (ju4VarG != null) {
                long j3 = ju4VarG.b;
                long j4 = ju4VarG.a;
                ((pc8) wk0Var.n).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((pc8) wk0Var.f2420o).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                k76Var = k76Var2;
                k76Var.m = ((ju4) k76Var.m).a(ju4VarG);
            } else {
                k76Var = k76Var2;
            }
            h76 h76Var2 = new h76();
            float fH = yk6Var.h(yk6Var.f(((ju4) k76Var.m).a));
            h76Var2.m = fH;
            if (!bt1.G(fH)) {
                k76 k76Var3 = new k76();
                k76Var3.m = pm8.b(0.0f, 0.0f, 30);
                obj = obj3;
                hw2 lu4Var = new lu4(h76Var2, k76Var3, k76Var, f, this, f2, yk6Var, null);
                ku4Var2.m = yk6Var;
                ku4Var2.n = h76Var2;
                ku4Var2.f1305o = f2;
                ku4Var2.r = 1;
                if (b(lu4Var, ku4Var2) != obj) {
                    h76Var = h76Var2;
                    f3 = f2;
                    yk6Var2 = yk6Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(obj2);
                return f88Var2;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = ku4Var2.f1305o;
        h76Var = ku4Var2.n;
        yk6Var2 = ku4Var2.m;
        ct1.a0(obj2);
        obj = obj3;
        f88Var = f88Var2;
        long jC = g77.c(((pc8) wk0Var.n).c(Float.MAX_VALUE), ((pc8) wk0Var.f2420o).c(Float.MAX_VALUE));
        if (jC == 0) {
            float fE = yk6Var2.e(Math.signum(h76Var.m)) * Math.min(Math.abs(h76Var.m) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jC = 0;
            } else {
                jC = yk6Var2.d == gb5.n ? g77.c(fE, 0.0f) : g77.c(0.0f, fE);
            }
        }
        nc8 nc8Var = new nc8(jC);
        ku4Var2.m = null;
        ku4Var2.n = null;
        ku4Var2.r = 2;
        return this.b.invoke(nc8Var, ku4Var2) == obj ? obj : f88Var;
    }

    public final boolean f(bn5 bn5Var) {
        long j;
        in1 in1Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.n;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : in1Var.d0(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : in1Var.d0(64.0f));
        List list = bn5Var.a;
        t65 t65Var = new t65(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = t65Var.a;
            if (i2 >= size) {
                break;
            }
            t65Var = new t65(t65.e(j, ((in5) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        yk6 yk6Var = this.a;
        float fJ = yk6Var.j(yk6Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            tk6 tk6Var = yk6Var.a;
            zC = fJ > 0.0f ? tk6Var.c() : tk6Var.b();
        }
        if (zC) {
            return !(this.g.b(new ju4(jFloatToRawIntBits, ((in5) lv0.m0(bn5Var.a)).b, false)) instanceof in0);
        }
        return this.d;
    }
}
