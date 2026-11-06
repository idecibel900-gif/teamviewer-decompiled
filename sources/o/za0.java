package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class za0 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2684o;
    public final /* synthetic */ int p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ pw2 s;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za0(int i, int i2, Function0 function0, Function0 function1, fs4 fs4Var, boolean z) {
        this.r = function0;
        this.s = function1;
        this.n = fs4Var;
        this.f2684o = z;
        this.p = i;
        this.q = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        int i = this.p;
        f88 f88Var = f88.a;
        pw2 pw2Var = this.s;
        Object obj3 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                j51.g(this.n, (he) obj3, this.f2684o, (yy0) pw2Var, (ux2) obj, iY, this.q);
                break;
            case 1:
                ((Integer) obj2).getClass();
                qs1.i(yo1.Y(i | 1), this.q, (Function0) obj3, (Function0) pw2Var, (ux2) obj, this.n, this.f2684o);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                xs1.p(this.p, (String) obj3, this.n, this.f2684o, (Function0) pw2Var, (ux2) obj, iY2, this.q);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za0(int i, String str, fs4 fs4Var, boolean z, Function0 function0, int i2, int i3) {
        this.p = i;
        this.r = str;
        this.n = fs4Var;
        this.f2684o = z;
        this.s = function0;
        this.q = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ za0(fs4 fs4Var, he heVar, boolean z, yy0 yy0Var, int i, int i2) {
        this.n = fs4Var;
        this.r = heVar;
        this.f2684o = z;
        this.s = yy0Var;
        this.p = i;
        this.q = i2;
    }
}
