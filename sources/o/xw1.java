package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SupportSession f2556o;

    public /* synthetic */ xw1(Function1 function1, SupportSession supportSession, byte b) {
        this.m = b;
        this.n = function1;
        this.f2556o = supportSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        SupportSession supportSession = this.f2556o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(supportSession);
                break;
            case 1:
                function1.invoke(supportSession);
                break;
            case 2:
                function1.invoke(supportSession);
                break;
            default:
                function1.invoke(supportSession);
                break;
        }
        return f88Var;
    }
}
