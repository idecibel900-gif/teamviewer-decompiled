package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pl0 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1744o;
    public final /* synthetic */ pw2 p;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pl0(Object obj, pw2 pw2Var, int i, byte b) {
        this.m = b;
        this.f1744o = obj;
        this.p = pw2Var;
        this.n = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = this.n;
        pw2 pw2Var = this.p;
        Object obj3 = this.f1744o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(b2 | 1);
                vn4.K(iY, (Function1) pw2Var, (ux2) obj, (fs4) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                qs7.a((ot7) obj3, (hw2) pw2Var, (ux2) obj, yo1.Y(b2 | 1));
                break;
        }
        return f88Var;
    }
}
