package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xv1 f1956o;

    public /* synthetic */ rv1(Function1 function1, xv1 xv1Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f1956o = xv1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        Object obj = yz1.a;
        e02 e02Var = e02.a;
        f88 f88Var = f88.a;
        xv1 xv1Var = this.f1956o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke((xv1Var.a || xv1Var.c) ? xz1.a : d02.a);
                break;
            case 1:
                if (!xv1Var.a && !xv1Var.c) {
                    obj = e02Var;
                }
                function1.invoke(obj);
                break;
            default:
                if (!xv1Var.a && !xv1Var.c) {
                    obj = e02Var;
                }
                function1.invoke(obj);
                break;
        }
        return f88Var;
    }
}
