package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class li7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fs4 f1365o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ String r;
    public final /* synthetic */ int s;
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ li7(String str, String str2, fs4 fs4Var, dm7 dm7Var, boolean z, Function0 function0, String str3, int i, int i2) {
        this.m = (byte) 2;
        this.r = str;
        this.p = str2;
        this.f1365o = fs4Var;
        this.u = dm7Var;
        this.q = z;
        this.n = function0;
        this.v = str3;
        this.s = i;
        this.t = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.s;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                m77.g(this.n, this.f1365o, (pw6) obj5, this.q, this.r, (ng0) obj4, (iw2) obj3, (ux2) obj, iY, this.t);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                g57.b(this.n, this.f1365o, (pw6) obj5, this.q, this.r, (d90) obj4, (yy0) obj3, (ux2) obj, iY2, this.t);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(i | 1);
                fm7.a(this.r, (String) obj5, this.f1365o, (dm7) obj4, this.q, this.n, (String) obj3, (ux2) obj, iY3, this.t);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ li7(Function0 function0, fs4 fs4Var, pw6 pw6Var, boolean z, String str, Object obj, iw2 iw2Var, int i, int i2, byte b) {
        this.m = b;
        this.n = function0;
        this.f1365o = fs4Var;
        this.p = pw6Var;
        this.q = z;
        this.r = str;
        this.u = obj;
        this.v = iw2Var;
        this.s = i;
        this.t = i2;
    }
}
