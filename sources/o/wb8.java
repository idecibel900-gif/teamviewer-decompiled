package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ xb8 n;

    public /* synthetic */ wb8(xb8 xb8Var, byte b) {
        this.m = b;
        this.n = xb8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        xb8 xb8Var = this.n;
        switch (b) {
            case 0:
                xb8Var.d = true;
                xb8Var.f.a();
                return f88Var;
            default:
                u52 u52Var = (u52) obj;
                k13 k13Var = xb8Var.b;
                float f = xb8Var.k;
                float f2 = xb8Var.l;
                iu iuVarH0 = u52Var.h0();
                long jD = iuVarH0.D();
                iuVarH0.x().g();
                try {
                    ((xc0) iuVarH0.f1103o).U(f, f2, 0L);
                    k13Var.a(u52Var);
                    return f88Var;
                } finally {
                    ua5.x(iuVarH0, jD);
                }
        }
    }
}
