package o;

import com.teamviewer.commonviewmodel.swig.ErrorCode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jr1 extends uc2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ jr1(byte b, Function0 function0, Function1 function1) {
        this.a = b;
        this.b = function1;
    }

    @Override // o.uc2
    public final void a(ErrorCode errorCode) {
        byte b = this.a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                String strGetErrorMessage = errorCode.GetErrorMessage();
                strGetErrorMessage.getClass();
                ((h31) function1).invoke(strGetErrorMessage);
                break;
            default:
                String strGetErrorMessage2 = errorCode.GetErrorMessage();
                strGetErrorMessage2.getClass();
                ((at4) function1).invoke(strGetErrorMessage2);
                break;
        }
    }

    @Override // o.uc2
    public final void b() {
        switch (this.a) {
            case 0:
                int i = hr1.u0;
                break;
            default:
                int i2 = ht4.u0;
                break;
        }
    }
}
