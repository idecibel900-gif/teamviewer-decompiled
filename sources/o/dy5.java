package o;

import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dy5 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Resources f666o;
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ Function0 q;

    public /* synthetic */ dy5(Function0 function0, Resources resources, Function1 function1, Function0 function2, byte b) {
        this.m = b;
        this.n = function0;
        this.f666o = resources;
        this.p = function1;
        this.q = function2;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.q;
        Function1 function1 = this.p;
        Resources resources = this.f666o;
        Function0 function2 = this.n;
        switch (b) {
            case 0:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(px5.w);
                function2.a();
                String string = resources.getString(R.string.scan_qr_canceled);
                string.getClass();
                io1.g0(string, function1, function0, resources.getString(R.string.dismiss));
                break;
            default:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(px5.v);
                function2.a();
                String string2 = resources.getString(R.string.scan_qr_expired);
                string2.getClass();
                io1.g0(string2, function1, function0, resources.getString(R.string.dismiss));
                break;
        }
        return f88Var;
    }
}
