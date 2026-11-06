package o;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yo5 n;

    public /* synthetic */ ak(yo5 yo5Var, byte b) {
        this.m = b;
        this.n = yo5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        yo5 yo5Var = this.n;
        switch (b) {
            case 0:
                yo5Var.m38setPopupContentSizefhxjrPA((dl3) obj);
                yo5Var.q();
                break;
            case 1:
                i04 i04VarF = ((i04) obj).F();
                i04VarF.getClass();
                yo5Var.p(i04VarF);
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = yo5Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = yo5Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new lg(function0, (byte) 5));
                    }
                } else {
                    function0.a();
                }
                break;
        }
        return f88Var;
    }
}
