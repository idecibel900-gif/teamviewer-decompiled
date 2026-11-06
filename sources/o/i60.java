package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i60 implements hw2 {
    public final /* synthetic */ byte m = 2;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1041o;
    public final /* synthetic */ fs4 p;
    public final /* synthetic */ int q;

    public /* synthetic */ i60(int i, String str, fs4 fs4Var, Function0 function0, int i2) {
        this.q = i;
        this.n = str;
        this.p = fs4Var;
        this.f1041o = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                e8.b(this.q, iY, this.n, this.f1041o, (ux2) obj, this.p);
                break;
            case 1:
                ((Integer) obj2).getClass();
                jx0.e(yo1.Y(this.q | 1), this.n, this.f1041o, (ux2) obj, this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                qf0.k(this.q, iY2, this.n, this.f1041o, (ux2) obj, this.p);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ i60(String str, Function0 function0, fs4 fs4Var, int i) {
        this.n = str;
        this.f1041o = function0;
        this.p = fs4Var;
        this.q = i;
    }

    public /* synthetic */ i60(Function0 function0, int i, fs4 fs4Var, String str, int i2) {
        this.f1041o = function0;
        this.q = i;
        this.p = fs4Var;
        this.n = str;
    }
}
