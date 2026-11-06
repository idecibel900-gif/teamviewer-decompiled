package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface u52 extends in1 {
    static void C0(u52 u52Var, vi viVar, long j, long j2, float f, tv0 tv0Var, int i, int i2) {
        u52Var.s0(viVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, tv0Var, (i2 & 512) != 0 ? 1 : i);
    }

    static void H0(u52 u52Var, rj rjVar, sb0 sb0Var, float f, cc7 cc7Var, tv0 tv0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        v52 v52Var = cc7Var;
        if ((i & 8) != 0) {
            v52Var = zk2.a;
        }
        v52 v52Var2 = v52Var;
        if ((i & 16) != 0) {
            tv0Var = null;
        }
        u52Var.G(rjVar, sb0Var, f2, v52Var2, tv0Var, (i & 32) != 0 ? 3 : 0);
    }

    static void L(u52 u52Var, long j, long j2, long j3, float f, int i) {
        u52Var.B(j, j2, j3, f, (i & 16) != 0 ? 0 : 1);
    }

    static void S(u52 u52Var, vi viVar, long j, float f, tv0 tv0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        u52Var.y0(viVar, j2, f, tv0Var, (i & 32) != 0 ? 3 : 0);
    }

    static long U(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void k0(u52 u52Var, long j, long j2, float f, int i) {
        if ((i & 4) != 0) {
            j2 = U(u52Var.d(), 0L);
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        u52Var.E0(j, 0L, j3, f, (i & 64) != 0 ? 3 : 0);
    }

    static void n(u52 u52Var, sb0 sb0Var, long j, long j2, long j3, float f, v52 v52Var, tv0 tv0Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        u52Var.y(sb0Var, j4, (i & 4) != 0 ? U(u52Var.d(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? zk2.a : v52Var, (i & 64) != 0 ? null : tv0Var, (i & 128) != 0 ? 3 : 0);
    }

    static void p(u52 u52Var, long j, long j2, long j3, long j4, v52 v52Var, int i) {
        u52Var.G0(j, (i & 2) != 0 ? 0L : j2, j3, j4, (i & 16) != 0 ? zk2.a : v52Var);
    }

    static void t(u52 u52Var, long j, float f, long j2, v52 v52Var, int i) {
        if ((i & 4) != 0) {
            j2 = u52Var.t0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            v52Var = zk2.a;
        }
        u52Var.w(j, f, j3, v52Var);
    }

    static void x(u52 u52Var, sb0 sb0Var, long j, long j2, float f, v52 v52Var, tv0 tv0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        u52Var.B0(sb0Var, j3, (i & 4) != 0 ? U(u52Var.d(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? zk2.a : v52Var, (i & 32) != 0 ? null : tv0Var, (i & 64) != 0 ? 3 : 0);
    }

    void B(long j, long j2, long j3, float f, int i);

    void B0(sb0 sb0Var, long j, long j2, float f, v52 v52Var, tv0 tv0Var, int i);

    void E0(long j, long j2, long j3, float f, int i);

    void G(rj rjVar, sb0 sb0Var, float f, v52 v52Var, tv0 tv0Var, int i);

    void G0(long j, long j2, long j3, long j4, v52 v52Var);

    default long d() {
        return h0().D();
    }

    default void g0(long j, Function1 function1, l03 l03Var) {
        l03Var.e(this, getLayoutDirection(), j, new io.sentry.android.replay.capture.f(this, function1, (byte) 3));
    }

    j04 getLayoutDirection();

    iu h0();

    void i(long j, float f, float f2, long j2, long j3, v52 v52Var);

    void i0(rj rjVar, long j, v52 v52Var);

    void s0(vi viVar, long j, long j2, long j3, float f, tv0 tv0Var, int i);

    default long t0() {
        return vt1.u(h0().D());
    }

    void w(long j, float f, long j2, v52 v52Var);

    void y(sb0 sb0Var, long j, long j2, long j3, float f, v52 v52Var, tv0 tv0Var, int i);

    void y0(vi viVar, long j, float f, tv0 tv0Var, int i);
}
