package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n74 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ fs4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1548o;
    public final /* synthetic */ byte p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n74(j74 j74Var, f74 f74Var, fs4 fs4Var, k74 k74Var, Function1 function1, int i, int i2) {
        this.q = j74Var;
        this.r = f74Var;
        this.n = fs4Var;
        this.s = k74Var;
        this.t = function1;
        this.f1548o = i;
        this.p = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f1548o;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(i | 1);
                wo1.i((j74) obj6, (f74) obj5, this.n, (k74) obj4, (Function1) obj3, (ux2) obj, iY, this.p);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(i | 1);
                x37.e((sk7) obj6, this.n, (jb4) obj5, (Function0) obj4, (String) obj3, (ux2) obj, iY2, this.p);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n74(sk7 sk7Var, fs4 fs4Var, jb4 jb4Var, Function0 function0, String str, int i, int i2) {
        this.q = sk7Var;
        this.n = fs4Var;
        this.r = jb4Var;
        this.s = function0;
        this.t = str;
        this.f1548o = i;
        this.p = i2;
    }
}
