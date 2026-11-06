package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2185o;

    public /* synthetic */ u9(Function1 function1, String str, byte b) {
        this.m = b;
        this.n = function1;
        this.f2185o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        String str = this.f2185o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(str);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(f43.u);
                break;
            default:
                function1.invoke(str);
                break;
        }
        return f88Var;
    }
}
