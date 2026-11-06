package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f546o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ co1(jl5[] jl5VarArr, dg6 dg6Var, int i, int[] iArr) {
        this.m = (byte) 2;
        this.f546o = jl5VarArr;
        this.p = dg6Var;
        this.n = i;
        this.q = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        int i = 0;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        int i2 = this.n;
        Object obj3 = this.p;
        Object obj4 = this.f546o;
        switch (b) {
            case 0:
                al3 al3Var = (al3) obj3;
                vw4 vw4Var = (vw4) obj2;
                if (obj == ((eo1) obj4)) {
                    hk0.l("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof s97)) {
                    return f88Var;
                }
                int i3 = al3Var.a - i2;
                int iD = vw4Var.d(obj);
                vw4Var.g(Math.min(i3, iD >= 0 ? vw4Var.c[iD] : Integer.MAX_VALUE), obj);
                return f88Var;
            case 1:
                f63 f63Var = (f63) obj4;
                fo4 fo4Var = (fo4) obj3;
                jl5 jl5Var = (jl5) obj2;
                il5 il5Var = (il5) obj;
                int i4 = f63Var.c;
                hr7 hr7Var = f63Var.b;
                e18 e18Var = f63Var.d;
                ws7 ws7Var = (ws7) f63Var.e.a();
                hr7Var.a(gb5.n, x37.i(il5Var, i4, e18Var, ws7Var != null ? ws7Var.a : null, fo4Var.getLayoutDirection() == j04.n, jl5Var.m), i2, jl5Var.m);
                il5.k(il5Var, jl5Var, Math.round(-hr7Var.a.z()), 0);
                return f88Var;
            default:
                jl5[] jl5VarArr = (jl5[]) obj4;
                dg6 dg6Var = (dg6) obj3;
                int[] iArr = (int[]) obj2;
                il5 il5Var2 = (il5) obj;
                int length = jl5VarArr.length;
                int i5 = 0;
                while (i < length) {
                    jl5 jl5Var2 = jl5VarArr[i];
                    int i6 = i5 + 1;
                    jl5Var2.getClass();
                    Object objE = jl5Var2.E();
                    bg6 bg6Var = objE instanceof bg6 ? (bg6) objE : null;
                    cf1 cf1Var = bg6Var != null ? bg6Var.c : null;
                    il5Var2.g(jl5Var2, iArr[i5], cf1Var != null ? cf1Var.s0.a(jl5Var2.n, i2, j04.m) : dg6Var.b.a(jl5Var2.n, i2), 0.0f);
                    i++;
                    i5 = i6;
                }
                return f88Var;
        }
    }

    public /* synthetic */ co1(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.m = b;
        this.f546o = obj;
        this.p = obj2;
        this.q = obj3;
        this.n = i;
    }
}
