package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wz1 implements Function0 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ vs1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2462o;

    public /* synthetic */ wz1(vs1 vs1Var, boolean z) {
        this.n = vs1Var;
        this.f2462o = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = this.f2462o;
        vs1 vs1Var = this.n;
        switch (b) {
            case 0:
                if (!z) {
                    vs1Var.y().a();
                }
                break;
            default:
                Function0 function0Y = vs1Var.y();
                if (!vs1Var.F() || z) {
                    function0Y = null;
                }
                if (function0Y != null) {
                    function0Y.a();
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ wz1(boolean z, vs1 vs1Var) {
        this.f2462o = z;
        this.n = vs1Var;
    }
}
