package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    public /* synthetic */ qv1(Function1 function1, byte b) {
        this.m = b;
        this.n = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        b02 b02Var = b02.a;
        e02 e02Var = e02.a;
        f88 f88Var = f88.a;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(a02.a);
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ra1.C);
                function1.invoke(d02.a);
                break;
            case 2:
                function1.invoke(b02Var);
                break;
            case 3:
                function1.invoke(e02Var);
                break;
            case 4:
                function1.invoke(c02.a);
                break;
            case 5:
                function1.invoke(b02Var);
                break;
            case 6:
                function1.invoke(e02Var);
                break;
            case 7:
                function1.invoke("");
                break;
            case 8:
                function1.invoke(qi2.a);
                break;
            case ep1.b /* 9 */:
                function1.invoke(Boolean.FALSE);
                break;
            case ep1.c /* 10 */:
                function1.invoke(Boolean.TRUE);
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(f43.v);
                break;
            case 11:
                function1.invoke(Boolean.FALSE);
                break;
            case ep1.d /* 12 */:
                function1.invoke(null);
                break;
            case 13:
                function1.invoke("");
                break;
            case 14:
                function1.invoke(null);
                break;
            case 15:
                function1.invoke(null);
                break;
            default:
                function1.invoke(new jv6((byte) 6));
                break;
        }
        return f88Var;
    }
}
