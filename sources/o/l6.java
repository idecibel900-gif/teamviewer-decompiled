package o;

import android.content.Context;
import com.teamviewer.commonviewmodel.swig.ErrorCode;
import com.teamviewer.remotecontrollib.swig.TokenLoginViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l6 extends uc2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.uc2
    public final void a(ErrorCode errorCode) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((Function1) obj).invoke(errorCode);
                break;
            case 1:
                ua5.v("Resetting Lock failed: ", errorCode.GetErrorMessage(), "LockScreenViewModel");
                ((he4) this.b).W0();
                ((ge4) obj).a();
                break;
            case 2:
                ye4.c("PendingConnectionTv8Scheme", "checkForScheduledConnect(): wrong account logged in!");
                wi6.a();
                break;
            case 3:
                ye4.c("PendingConnectionTv8SchemeMDv2", "Login before connection attempt failed");
                wi6.a();
                break;
            default:
                ye4.c("PendingConnectionTv8SchemeMDv2", "checkForScheduledConnect(): wrong account logged in!");
                wi6.a();
                break;
        }
    }

    @Override // o.uc2
    public final void b() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Function0) obj2).a();
                break;
            case 1:
                ((he4) obj2).W0();
                ((ge4) obj).a();
                break;
            case 2:
                ((li5) obj2).b((Context) obj);
                break;
            case 3:
                ((TokenLoginViewModel) obj2).b(new oi5((li5) obj));
                wi6.a();
                break;
            default:
                ((li5) obj2).b((Context) obj);
                break;
        }
    }
}
