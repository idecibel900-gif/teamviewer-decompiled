package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n71 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ short f1546o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ pw2 r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n71(Object obj, Object obj2, pw2 pw2Var, Object obj3, int i, byte b) {
        this.m = b;
        this.p = obj;
        this.q = obj2;
        this.r = pw2Var;
        this.n = obj3;
        this.f1546o = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        short s = this.f1546o;
        Object obj3 = this.n;
        pw2 pw2Var = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ka0.e((i81) obj5, (Function1) obj4, (Function1) pw2Var, (fs4) obj3, (ux2) obj, yo1.Y(s | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(s | 1);
                bt1.i(iY, (String) obj5, (String) obj4, (Function0) pw2Var, (ux2) obj, (fs4) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                ep1.i((String) obj5, (Function1) obj4, (Function0) pw2Var, (Function0) obj3, (ux2) obj, yo1.Y(s | 1));
                break;
        }
        return f88Var;
    }
}
