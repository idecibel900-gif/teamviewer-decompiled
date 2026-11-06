package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1559o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ fs4 q;

    public /* synthetic */ nb(String str, boolean z, Function1 function1, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = str;
        this.f1559o = z;
        this.p = function1;
        this.q = fs4Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kh.f(this.n, this.f1559o, this.p, this.q, (ux2) obj, yo1.Y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jx0.b(this.n, this.f1559o, this.p, this.q, (ux2) obj, yo1.Y(3457));
                break;
            default:
                ((Integer) obj2).getClass();
                io1.h(this.n, this.f1559o, this.p, this.q, (ux2) obj, yo1.Y(3073));
                break;
        }
        return f88Var;
    }
}
