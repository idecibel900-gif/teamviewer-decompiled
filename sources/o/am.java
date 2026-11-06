package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f336o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ am(int i, Function1 function1, fs4 fs4Var, int i2, String str, int i3) {
        this.m = (byte) 2;
        this.f336o = i;
        this.q = function1;
        this.n = fs4Var;
        this.p = i2;
        this.r = str;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        int i = this.f336o;
        f88 f88Var = f88.a;
        Object obj3 = this.r;
        Object obj4 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                di1.b((Function1) obj4, this.n, (Function1) obj3, (ux2) obj, iY, this.p);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                ga0.d((int[]) obj4, this.n, (nd5) obj3, (ux2) obj, iY2, this.p);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(24961);
                h67.c(this.f336o, (Function1) obj4, this.n, this.p, (String) obj3, (ux2) obj, iY3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY4 = yo1.Y(i | 1);
                o67.c((hi7) obj4, (vl7) obj3, this.n, (ux2) obj, iY4, this.p);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ am(Object obj, fs4 fs4Var, Object obj2, int i, int i2, byte b) {
        this.m = b;
        this.q = obj;
        this.n = fs4Var;
        this.r = obj2;
        this.f336o = i;
        this.p = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ am(hi7 hi7Var, vl7 vl7Var, fs4 fs4Var, int i, int i2) {
        this.m = (byte) 3;
        this.q = hi7Var;
        this.r = vl7Var;
        this.n = fs4Var;
        this.f336o = i;
        this.p = i2;
    }
}
