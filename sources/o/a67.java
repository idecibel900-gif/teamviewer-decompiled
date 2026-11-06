package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a67 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ q37 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ me1 f303o;

    public /* synthetic */ a67(q37 q37Var, me1 me1Var, byte b) {
        this.m = b;
        this.n = q37Var;
        this.f303o = me1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        me1 me1Var = this.f303o;
        q37 q37Var = this.n;
        ul7 ul7Var = (ul7) obj;
        switch (b) {
            case 0:
                ul7Var.getClass();
                o37 o37VarA = q37Var.a();
                ul7 ul7Var2 = o37VarA != null ? o37VarA.a : null;
                if (!im3.n(ul7Var2 != null ? ul7Var2.b : null, ul7Var.b)) {
                    im3.R(me1Var, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 5), 3);
                }
                break;
            case 1:
                ul7Var.getClass();
                o37 o37VarA2 = q37Var.a();
                ul7 ul7Var3 = o37VarA2 != null ? o37VarA2.a : null;
                if (!im3.n(ul7Var3 != null ? ul7Var3.b : null, ul7Var.b)) {
                    im3.R(me1Var, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 6), 3);
                }
                break;
            default:
                ul7Var.getClass();
                o37 o37VarA3 = q37Var.a();
                ul7 ul7Var4 = o37VarA3 != null ? o37VarA3.a : null;
                if (!im3.n(ul7Var4 != null ? ul7Var4.b : null, ul7Var.b)) {
                    im3.R(me1Var, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 7), 3);
                }
                break;
        }
        return f88Var;
    }
}
