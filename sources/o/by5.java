package o;

import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class by5 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Resources n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f466o;
    public final /* synthetic */ Function0 p;

    public /* synthetic */ by5(Resources resources, Function1 function1, Function0 function0, byte b) {
        this.m = b;
        this.n = resources;
        this.f466o = function1;
        this.p = function0;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.p;
        Function1 function1 = this.f466o;
        Resources resources = this.n;
        switch (b) {
            case 0:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(px5.t);
                String string = resources.getString(R.string.scan_qr_invalid);
                string.getClass();
                io1.g0(string, function1, function0, resources.getString(R.string.dismiss));
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(px5.u);
                String string2 = resources.getString(R.string.scan_qr_expired);
                string2.getClass();
                io1.g0(string2, function1, function0, resources.getString(R.string.dismiss));
                break;
            default:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(px5.x);
                String string3 = resources.getString(R.string.scan_qr_error);
                string3.getClass();
                io1.g0(string3, function1, function0, resources.getString(R.string.dismiss));
                break;
        }
        return f88Var;
    }
}
