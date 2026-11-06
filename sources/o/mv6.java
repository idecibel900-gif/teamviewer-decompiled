package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mv6 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a06 f1516o;
    public final /* synthetic */ dw6 p;
    public final /* synthetic */ iv6 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ fs4 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ pw2 w;

    public /* synthetic */ mv6(eg3 eg3Var, boolean z, a06 a06Var, dw6 dw6Var, iv6 iv6Var, Function1 function1, boolean z2, fs4 fs4Var, String str, int i) {
        this.v = eg3Var;
        this.n = z;
        this.f1516o = a06Var;
        this.p = dw6Var;
        this.q = iv6Var;
        this.w = function1;
        this.r = z2;
        this.s = fs4Var;
        this.t = str;
        this.u = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.u;
        pw2 pw2Var = this.w;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                nv1.j(this.n, this.r, this.f1516o, this.p, (Function0) obj3, this.q, this.t, this.s, (Function0) pw2Var, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                io1.v((eg3) obj3, this.n, this.f1516o, this.p, this.q, (Function1) pw2Var, this.r, this.s, this.t, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ mv6(boolean z, boolean z2, a06 a06Var, dw6 dw6Var, Function0 function0, iv6 iv6Var, String str, fs4 fs4Var, Function0 function1, int i) {
        this.n = z;
        this.r = z2;
        this.f1516o = a06Var;
        this.p = dw6Var;
        this.v = function0;
        this.q = iv6Var;
        this.t = str;
        this.s = fs4Var;
        this.w = function1;
        this.u = i;
    }
}
