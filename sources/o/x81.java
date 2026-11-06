package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x81 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2491o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ x81(int i, Function0 function0, Function0 function1, int i2) {
        this.m = (byte) 2;
        this.n = i;
        this.q = function0;
        this.p = function1;
        this.f2491o = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        Object obj4 = this.q;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = yo1.Y(385);
                xk0.d(this.n, this.f2491o, (String) obj3, (Function0) obj4, (ux2) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = yo1.Y(3073);
                r47.a(this.n, this.f2491o, (Integer) obj3, (fs4) obj4, (ux2) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = yo1.Y(this.f2491o | 1);
                r47.g(this.n, (Function0) obj4, (Function0) obj3, (ux2) obj, iY3);
                break;
        }
        return f88Var;
    }

    public /* synthetic */ x81(int i, int i2, Object obj, Object obj2, int i3, byte b) {
        this.m = b;
        this.n = i;
        this.f2491o = i2;
        this.p = obj;
        this.q = obj2;
    }
}
