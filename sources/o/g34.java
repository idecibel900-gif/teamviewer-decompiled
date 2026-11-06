package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g34 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ l03 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i34 f852o;

    public /* synthetic */ g34(l03 l03Var, i34 i34Var, byte b) {
        this.m = b;
        this.n = l03Var;
        this.f852o = i34Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        i34 i34Var = this.f852o;
        l03 l03Var = this.n;
        km kmVar = (km) obj;
        switch (b) {
            case 0:
                l03Var.f(((Number) kmVar.d()).floatValue());
                i34Var.c.a();
                break;
            default:
                l03Var.f(((Number) kmVar.d()).floatValue());
                i34Var.c.a();
                break;
        }
        return f88Var;
    }
}
