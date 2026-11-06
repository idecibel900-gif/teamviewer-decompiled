package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tw1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f2149o;

    public /* synthetic */ tw1(Function1 function1, Function1 function2, byte b) {
        this.m = b;
        this.n = function1;
        this.f2149o = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        byte b2 = 2;
        f88 f88Var = f88.a;
        Function1 function1 = this.f2149o;
        Function1 function2 = this.n;
        switch (b) {
            case 0:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                function2.invoke(new ql1(function1, l33Var, b2));
                break;
            case 1:
                function2.invoke(new s81(function1, (h71) obj, (byte) 2));
                break;
            case 2:
                h71 h71Var = (h71) obj;
                h71Var.getClass();
                function2.invoke(new s81(function1, h71Var, (byte) 1));
                break;
            case 3:
                SupportSession supportSession = (SupportSession) obj;
                supportSession.getClass();
                function2.invoke(new xw1(function1, supportSession, (byte) 1));
                break;
            case 4:
                SupportSession supportSession2 = (SupportSession) obj;
                supportSession2.getClass();
                function2.invoke(new xw1(function1, supportSession2, (byte) 0));
                break;
            case 5:
                function2.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function2.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return f88Var;
    }
}
