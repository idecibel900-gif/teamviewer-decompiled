package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y9 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2588o;
    public final /* synthetic */ Object p;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y9(boolean z, Function0 function0, int i, int i2) {
        this.n = z;
        this.p = function0;
        this.f2588o = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        boolean z = this.f2588o;
        boolean z2 = this.n;
        switch (b) {
            case 0:
                String str = (String) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    aa aaVar = new aa(z2, z);
                    ux2Var.W(1391242612);
                    qs7.b(m77.A(aaVar.a.intValue(), new Object[]{str}, ux2Var), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                    ux2Var.p(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                kh.c(z2, (Function0) obj3, (ux2) obj, yo1.Y(1), z ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                vn4.O(z2, z, (fs4) obj3, (ux2) obj, yo1.Y(1));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ y9(boolean z, boolean z2, String str) {
        this.n = z;
        this.f2588o = z2;
        this.p = str;
    }

    public /* synthetic */ y9(boolean z, boolean z2, fs4 fs4Var, int i) {
        this.n = z;
        this.f2588o = z2;
        this.p = fs4Var;
    }
}
