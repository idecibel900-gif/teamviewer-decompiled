package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yl6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nl6 f1183o;

    public /* synthetic */ jm6(yl6 yl6Var, nl6 nl6Var, byte b) {
        this.m = b;
        this.n = yl6Var;
        this.f1183o = nl6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        nl6 nl6Var = this.f1183o;
        yl6 yl6Var = this.n;
        switch (b) {
            case 0:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(qs6.OnRemoteControl);
                z31 z31Var = yl6Var.c;
                if (z31Var != null) {
                    nl6Var.f.invoke(z31Var);
                }
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(qs6.OnFileTransfer);
                z31 z31Var2 = yl6Var.c;
                if (z31Var2 != null) {
                    nl6Var.g.invoke(z31Var2);
                }
                break;
            default:
                z31 z31Var3 = yl6Var.c;
                if (z31Var3 != null) {
                    nl6Var.f.invoke(z31Var3);
                }
                break;
        }
        return f88Var;
    }
}
