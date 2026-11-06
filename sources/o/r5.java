package o;

import android.content.Context;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements ho2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ iv6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f1893o;
    public final /* synthetic */ Context p;

    public r5(Context context, iv6 iv6Var, px4 px4Var) {
        this.p = context;
        this.n = iv6Var;
        this.f1893o = px4Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f1893o;
        iv6 iv6Var = this.n;
        Context context = this.p;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    xk0.b(iv6Var, context, y5.C);
                } else {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(u5.t);
                    fc1 fc1Var = ai2.a;
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    im3.R(ai2.a, null, null, new j0(applicationContext, null), 3);
                    xk0.b(iv6Var, context, z5.C);
                    iv6Var.m.a();
                    ((Function0) px4Var.getValue()).a();
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    xk0.b(iv6Var, context, v5.C);
                } else {
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(u5.u);
                    xk0.b(iv6Var, context, w5.C);
                    iv6Var.m.a();
                    ((Function0) px4Var.getValue()).a();
                }
                break;
        }
        return f88Var;
    }

    public r5(iv6 iv6Var, px4 px4Var, Context context) {
        this.n = iv6Var;
        this.f1893o = px4Var;
        this.p = context;
    }
}
