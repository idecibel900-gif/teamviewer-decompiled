package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1230o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ fs4 r;

    public /* synthetic */ k5(boolean z, Function0 function0, Function0 function1, String str, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f1230o = function0;
        this.p = function1;
        this.q = str;
        this.r = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(24577);
                uf0.e(this.n, this.f1230o, this.p, this.q, this.r, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                g57.d(this.n, this.f1230o, this.p, this.q, this.r, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }
}
