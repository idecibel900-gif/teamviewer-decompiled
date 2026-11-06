package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pu implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1775o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ pu(String str, boolean z, boolean z2, Function0 function0, Function0 function1, int i) {
        this.r = str;
        this.n = z;
        this.f1775o = z2;
        this.p = function0;
        this.s = function1;
        this.q = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.q;
        Object obj3 = this.s;
        Object obj4 = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                int iY = yo1.Y(i | 1);
                j51.b((String) obj4, this.n, this.f1775o, this.p, (Function0) obj3, (ux2) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                ox1.a(this.n, this.f1775o, (ov1) obj4, this.p, (fs4) obj3, (ux2) obj, iY2);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ pu(boolean z, boolean z2, ov1 ov1Var, Function0 function0, fs4 fs4Var, int i) {
        this.n = z;
        this.f1775o = z2;
        this.r = ov1Var;
        this.p = function0;
        this.s = fs4Var;
        this.q = i;
    }
}
