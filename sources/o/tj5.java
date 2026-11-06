package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ x84 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s84 f2115o;

    public /* synthetic */ tj5(x84 x84Var, s84 s84Var, byte b) {
        this.m = b;
        this.n = x84Var;
        this.f2115o = s84Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        s84 s84Var = this.f2115o;
        x84 x84Var = this.n;
        r22 r22Var = (r22) obj;
        switch (b) {
            case 0:
                r22Var.getClass();
                x84Var.a(s84Var);
                return new uj5(x84Var, s84Var, (byte) 0);
            default:
                r22Var.getClass();
                x84Var.a(s84Var);
                return new uj5(x84Var, s84Var, (byte) 1);
        }
    }
}
