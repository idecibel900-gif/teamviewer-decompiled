package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc1 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f512o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ pw2 q;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cc1(List list, Function0 function0, fs4 fs4Var, int i) {
        this.p = list;
        this.q = function0;
        this.n = fs4Var;
        this.f512o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        pw2 pw2Var = this.q;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                ec1.b(this.n, (zb1) obj3, (Function1) pw2Var, (ux2) obj, iY, this.f512o);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(this.f512o | 1);
                us1.h((List) obj3, (Function0) pw2Var, this.n, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cc1(fs4 fs4Var, zb1 zb1Var, Function1 function1, int i, int i2) {
        this.n = fs4Var;
        this.p = zb1Var;
        this.q = function1;
        this.f512o = i2;
    }
}
