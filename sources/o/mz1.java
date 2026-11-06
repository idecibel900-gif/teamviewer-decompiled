package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mz1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1524o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fs4 q;

    public /* synthetic */ mz1(String str, Function1 function1, Function0 function0, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = str;
        this.f1524o = function1;
        this.p = function0;
        this.q = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(1);
                us1.c(this.n, this.f1524o, this.p, this.q, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(1);
                wo1.j(this.n, this.f1524o, this.p, this.q, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(1);
                yo1.p(this.n, this.f1524o, this.p, this.q, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }
}
