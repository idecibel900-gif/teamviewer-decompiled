package o;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class li {
    public final in1 a;
    public long b = 9205357640488583168L;
    public final v72 c;
    public final bg5 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final vm1 i;

    public li(Context context, in1 in1Var, long j, pd5 pd5Var) {
        this.a = in1Var;
        v72 v72Var = new v72(context, j51.U(j));
        this.c = v72Var;
        this.d = new bg5(f88.a, xz2.P);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        ki kiVar = new ki(this, (byte) 0);
        bn5 bn5Var = qg7.a;
        vg7 vg7Var = new vg7(null, null, kiVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new oz2(vg7Var, this, v72Var) : new oz2(vg7Var, this, v72Var, pd5Var);
    }

    public final void a() {
        boolean z;
        v72 v72Var = this.c;
        EdgeEffect edgeEffect = v72Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = v72Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = v72Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = v72Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, o.hw2 r21, o.jc1 r22) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.li.b(long, o.hw2, o.jc1):java.lang.Object");
    }

    public final long c() {
        long jU = this.b;
        if ((9223372034707292159L & jU) == 9205357640488583168L) {
            jU = vt1.u(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jU & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(f88.a);
        }
    }

    public final boolean e() {
        v72 v72Var = this.c;
        EdgeEffect edgeEffect = v72Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? nh.d(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = v72Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? nh.d(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = v72Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? nh.d(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = v72Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? nh.d(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fG = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fG = nh.g(edgeEffectB, fG, f);
        } else {
            edgeEffectB.onPull(fG, f);
        }
        return (i2 >= 31 ? nh.d(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fG) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = nh.g(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? nh.d(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fG = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fG = nh.g(edgeEffectD, fG, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fG, fIntBitsToFloat);
        }
        return (i2 >= 31 ? nh.d(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fG) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = nh.g(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? nh.d(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = y07.a(this.g, 0L);
        boolean zA2 = y07.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iS0 = vn4.s0(Float.intBitsToFloat((int) (j >> 32)));
            long jS0 = (((long) vn4.s0(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iS0) << 32);
            v72 v72Var = this.c;
            v72Var.c = jS0;
            EdgeEffect edgeEffect = v72Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jS0 >> 32), (int) (jS0 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = v72Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jS0 >> 32), (int) (jS0 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = v72Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jS0 & 4294967295L), (int) (jS0 >> 32));
            }
            EdgeEffect edgeEffect4 = v72Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jS0 & 4294967295L), (int) (jS0 >> 32));
            }
            EdgeEffect edgeEffect5 = v72Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jS0 >> 32), (int) (jS0 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = v72Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jS0 >> 32), (int) (jS0 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = v72Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jS0 & 4294967295L), (int) (jS0 >> 32));
            }
            EdgeEffect edgeEffect8 = v72Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jS0), (int) (jS0 >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
