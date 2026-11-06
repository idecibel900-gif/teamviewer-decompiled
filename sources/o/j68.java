package o;

import android.os.StatFs;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j68 implements Function0 {
    public final /* synthetic */ byte m;

    public /* synthetic */ j68(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        WindowLayoutComponent windowLayoutComponentA;
        Object lg2Var;
        switch (this.m) {
            case 0:
                return new h68();
            case 1:
                lt3 lt3Var = sj2.m;
                wg5 wg5VarE = sj2.n.e("coil3_disk_cache");
                long jW = 10485760;
                try {
                    File file = wg5VarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jW = ct1.w((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new e46(jW, lt3Var, wg5VarE);
            case 2:
                return f88.a;
            case 3:
                return f88.a;
            case 4:
                return f88.a;
            case 5:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(q31.w);
                return f88.a;
            case 6:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(q31.y);
                return f88.a;
            case 7:
                return f88.a;
            case 8:
                if (zu1.c == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                cg3 cg3Var = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                iInAppPurchaseViewModelD.getClass();
                return new vh8(new wf3(cg3Var, iInAppPurchaseViewModelD, EventHub.e.f()));
            case ep1.b /* 9 */:
                ye4.a("WebLoginViewModel", "login successful, no UI update");
                return f88.a;
            case ep1.c /* 10 */:
                try {
                    ClassLoader classLoader = pj8.class.getClassLoader();
                    ih6 ih6Var = classLoader != null ? new ih6(classLoader, new f71(classLoader)) : null;
                    if (ih6Var == null || (windowLayoutComponentA = ih6Var.a()) == null) {
                        return null;
                    }
                    f71 f71Var = new f71(classLoader);
                    int iA = pg2.a();
                    if (iA >= 9) {
                        lg2Var = new og2(windowLayoutComponentA, f71Var);
                    } else if (iA >= 6) {
                        lg2Var = new ng2(windowLayoutComponentA, f71Var);
                    } else if (iA >= 2) {
                        lg2Var = new mg2(windowLayoutComponentA, f71Var);
                    } else {
                        lg2Var = iA == 1 ? new lg2(windowLayoutComponentA, f71Var) : new jg2();
                    }
                    return lg2Var;
                } catch (Throwable unused2) {
                    return null;
                }
            case 11:
                return new z06((byte) 0);
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ j68(Object obj, byte b) {
        this.m = b;
    }
}
