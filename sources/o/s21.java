package o;

import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s21 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ q37 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a06 f1974o;

    public /* synthetic */ s21(q37 q37Var, a06 a06Var, byte b) {
        this.m = b;
        this.n = q37Var;
        this.f1974o = a06Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        hc1 hc1Var = null;
        a06 a06Var = this.f1974o;
        q37 q37Var = this.n;
        byte b2 = 3;
        ul7 ul7Var = (ul7) obj;
        switch (b) {
            case 0:
                ul7Var.getClass();
                o37 o37VarA = q37Var.a();
                ul7 ul7Var2 = o37VarA != null ? o37VarA.a : null;
                if (!im3.n(ul7Var2 != null ? ul7Var2.b : null, ul7Var.b)) {
                    im3.R(a06Var.a, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 0), 3);
                }
                break;
            case 1:
                ul7Var.getClass();
                o37 o37VarA2 = q37Var.a();
                ul7 ul7Var3 = o37VarA2 != null ? o37VarA2.a : null;
                if (!im3.n(ul7Var3 != null ? ul7Var3.b : null, ul7Var.b)) {
                    im3.R(a06Var.a, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 1), 3);
                }
                break;
            case 2:
                int i = OnBoardingActivity.N;
                ul7Var.getClass();
                o37 o37VarA3 = q37Var.a();
                ul7 ul7Var4 = o37VarA3 != null ? o37VarA3.a : null;
                if (!im3.n(ul7Var4 != null ? ul7Var4.b : null, ul7Var.b)) {
                    im3.R(a06Var.a, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 2), 3);
                }
                break;
            case 3:
                ul7Var.getClass();
                o37 o37VarA4 = q37Var.a();
                ul7 ul7Var5 = o37VarA4 != null ? o37VarA4.a : null;
                if (!im3.n(ul7Var5 != null ? ul7Var5.b : null, ul7Var.b)) {
                    im3.R(a06Var.a, null, null, new x21(q37Var, ul7Var, hc1Var, b2), 3);
                }
                break;
            default:
                ul7Var.getClass();
                o37 o37VarA5 = q37Var.a();
                ul7 ul7Var6 = o37VarA5 != null ? o37VarA5.a : null;
                if (!im3.n(ul7Var6 != null ? ul7Var6.b : null, ul7Var.b)) {
                    im3.R(a06Var.a, null, null, new x21(q37Var, ul7Var, hc1Var, (byte) 4), 3);
                }
                break;
        }
        return f88Var;
    }
}
