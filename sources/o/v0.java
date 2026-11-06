package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ jl5 n;

    public /* synthetic */ v0(jl5 jl5Var, byte b) {
        this.m = b;
        this.n = jl5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        jl5 jl5Var = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
            case 1:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 2:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 3:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 4:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 5:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
            case 6:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
            case 7:
                il5 il5Var = (il5) obj;
                if (il5Var.c() == j04.m || il5Var.e() == 0) {
                    il5Var.f(jl5Var);
                    jl5Var.c0(vk3.c(0L, jl5Var.q), 0.0f, null);
                } else {
                    long jE = ((long) (il5Var.e() - jl5Var.m)) << 32;
                    il5Var.f(jl5Var);
                    jl5Var.c0(vk3.c(jE, jl5Var.q), 0.0f, null);
                }
                break;
            case 8:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case ep1.b /* 9 */:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
            case ep1.c /* 10 */:
                il5.l((il5) obj, this.n, 0, 0, null, 12);
                break;
            case 11:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
            case ep1.d /* 12 */:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 13:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 14:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
            case 15:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            default:
                il5.k((il5) obj, jl5Var, 0, 0);
                break;
        }
        return f88Var;
    }
}
