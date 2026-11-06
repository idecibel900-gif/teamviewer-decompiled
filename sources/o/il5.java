package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class il5 implements in1 {
    public boolean m;

    public static void j(il5 il5Var, jl5 jl5Var, long j) {
        il5Var.f(jl5Var);
        jl5Var.c0(vk3.c(j, jl5Var.q), 0.0f, null);
    }

    public static void k(il5 il5Var, jl5 jl5Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (il5Var.c() == j04.m || il5Var.e() == 0) {
            il5Var.f(jl5Var);
            jl5Var.c0(vk3.c(j, jl5Var.q), 0.0f, null);
        } else {
            int iE = (il5Var.e() - jl5Var.m) - ((int) (j >> 32));
            il5Var.f(jl5Var);
            jl5Var.c0(vk3.c((((long) iE) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), jl5Var.q), 0.0f, null);
        }
    }

    public static void l(il5 il5Var, jl5 jl5Var, int i, int i2, Function1 function1, int i3) {
        if ((i3 & 8) != 0) {
            function1 = kl5.a;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (il5Var.c() == j04.m || il5Var.e() == 0) {
            il5Var.f(jl5Var);
            jl5Var.c0(vk3.c(j, jl5Var.q), 0.0f, function1);
        } else {
            il5Var.f(jl5Var);
            jl5Var.c0(vk3.c((((long) ((il5Var.e() - jl5Var.m) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), jl5Var.q), 0.0f, function1);
        }
    }

    public static void m(il5 il5Var, jl5 jl5Var, int i, int i2, Function1 function1) {
        il5Var.f(jl5Var);
        jl5Var.c0(vk3.c((((long) i2) & 4294967295L) | (((long) i) << 32), jl5Var.q), 0.0f, function1);
    }

    public float a(e63 e63Var) {
        return Float.NaN;
    }

    public abstract i04 b();

    public abstract j04 c();

    public abstract int e();

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(jl5 jl5Var) {
        if (jl5Var instanceof bu4) {
            ((bu4) jl5Var).H(this.m);
        }
    }

    public final void g(jl5 jl5Var, int i, int i2, float f) {
        f(jl5Var);
        jl5Var.c0(vk3.c((((long) i2) & 4294967295L) | (((long) i) << 32), jl5Var.q), f, null);
    }
}
