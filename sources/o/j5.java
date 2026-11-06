package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1131o;

    public /* synthetic */ j5(byte b, Function0 function0, Function1 function1) {
        this.m = b;
        this.n = function1;
        this.f1131o = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.f1131o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(function0);
                break;
            case 1:
                function1.invoke(function0);
                break;
            case 2:
                function1.invoke(new yv1(function0, (byte) 3));
                break;
            case 3:
                function1.invoke(Boolean.FALSE);
                function0.a();
                break;
            case 4:
                function1.invoke(Boolean.FALSE);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(f43.w);
                function0.a();
                break;
            default:
                function1.invoke(Boolean.FALSE);
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(f43.x);
                function0.a();
                break;
        }
        return f88Var;
    }
}
