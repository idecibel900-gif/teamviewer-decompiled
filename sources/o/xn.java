package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xn extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ jl5 f2536o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn(jl5 jl5Var, byte b) {
        super(1);
        this.n = b;
        this.f2536o = jl5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        jl5 jl5Var = this.f2536o;
        switch (b) {
            case 0:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 1:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            case 2:
                ((il5) obj).g(jl5Var, 0, 0, 0.0f);
                break;
            default:
                il5 il5Var = (il5) obj;
                il5Var.getClass();
                il5.k(il5Var, jl5Var, 0, 0);
                break;
        }
        return f88Var;
    }
}
