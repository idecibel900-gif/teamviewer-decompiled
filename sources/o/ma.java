package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yf5 n;

    public /* synthetic */ ma(yf5 yf5Var, byte b) {
        this.m = b;
        this.n = yf5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yf5 yf5Var = this.n;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                yf5Var.A(iIntValue);
                if (iIntValue == 0) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(f43.D);
                } else if (iIntValue == 1) {
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(f43.E);
                }
                break;
            case 1:
                vs7 vs7Var = (vs7) obj;
                vs7Var.getClass();
                yf5Var.A(vs7Var.b.f);
                break;
            case 2:
                vs7 vs7Var2 = (vs7) obj;
                vs7Var2.getClass();
                yf5Var.A(vs7Var2.b.f);
                break;
            case 3:
                i04 i04Var = (i04) obj;
                i04Var.getClass();
                yf5Var.A((int) (i04Var.j() & 4294967295L));
                break;
            default:
                yf5Var.A(((Integer) obj).intValue());
                break;
        }
        return f88Var;
    }
}
