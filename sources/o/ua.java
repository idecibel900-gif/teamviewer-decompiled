package o;

import android.content.Intent;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ua implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f2190o;

    public /* synthetic */ ua(px4 px4Var, px4 px4Var2, byte b) {
        this.m = b;
        this.n = px4Var;
        this.f2190o = px4Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f2190o;
        px4 px4Var2 = this.n;
        switch (b) {
            case 0:
                z7 z7Var = (z7) obj;
                z7Var.getClass();
                if (z7Var.m == -1) {
                    Intent intent = z7Var.n;
                    String stringExtra = intent != null ? intent.getStringExtra("ASSIGNMENT_RESULT_KEY") : null;
                    if (im3.n(stringExtra, "QR_CODE_ASSIGNMENT_SUCCESS")) {
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(px5.B);
                        ((Function1) px4Var2.getValue()).invoke(t27.a);
                    } else if (im3.n(stringExtra, "QR_CODE_ASSIGNMENT_FAILED")) {
                        IStatisticsHandler iStatisticsHandler2 = ga7.a;
                        ga7.a(px5.A);
                        ((Function1) px4Var2.getValue()).invoke(s27.a);
                    }
                    ((Function0) px4Var.getValue()).a();
                }
                break;
            case 1:
                Function0 function0 = (Function0) obj;
                function0.getClass();
                px4Var2.setValue(function0);
                px4Var.setValue(Boolean.TRUE);
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                px4Var2.setValue(bool);
                if (!zBooleanValue) {
                    px4Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return f88Var;
    }
}
