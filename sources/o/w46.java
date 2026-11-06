package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w46 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2379o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fs4 q;
    public final /* synthetic */ int r;

    public /* synthetic */ w46(int i, Function0 function0, Function0 function1, fs4 fs4Var, boolean z) {
        this.m = (byte) 0;
        this.n = z;
        this.q = fs4Var;
        this.f2379o = function0;
        this.p = function1;
        this.r = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.r;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nv1.f(yo1.Y(i | 1), this.f2379o, this.p, (ux2) obj, this.q, this.n);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l47.g(yo1.Y(i | 1), this.f2379o, this.p, (ux2) obj, this.q, this.n);
                break;
            default:
                ((Integer) obj2).getClass();
                f57.d(yo1.Y(i | 1), this.f2379o, this.p, (ux2) obj, this.q, this.n);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ w46(boolean z, Function0 function0, Function0 function1, fs4 fs4Var, int i, byte b) {
        this.m = b;
        this.n = z;
        this.f2379o = function0;
        this.p = function1;
        this.q = fs4Var;
        this.r = i;
    }
}
