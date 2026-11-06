package o;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1822o;

    public /* synthetic */ qe(boolean z, ii2 ii2Var) {
        this.m = (byte) 2;
        this.n = z;
        this.f1822o = ii2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        boolean z = this.n;
        Object obj = this.f1822o;
        switch (b) {
            case 0:
                ((re) obj).a.d(z);
                break;
            case 1:
                ((mk0) obj).c.d(z);
                break;
            case 2:
                ii2 ii2Var = (ii2) obj;
                if (!z) {
                    Context contextR0 = ii2Var.r0();
                    String strI = ii2Var.I(R.string.feedback_error_text);
                    strI.getClass();
                    Toast toastMakeText = Toast.makeText(contextR0, strI, 0);
                    toastMakeText.getClass();
                    toastMakeText.show();
                    ii2Var.C0(ii2Var.q0);
                } else {
                    ii2Var.B0(R.string.tv_feedback_YourFeedbackHasBeenSubmittedSuccessfully);
                }
                break;
            default:
                lg3 lg3Var = (lg3) ((ns) obj).b;
                lg3Var.f = z;
                if (lg3Var.c) {
                    Handler handler = lg3Var.d;
                    handler.removeCallbacksAndMessages(null);
                    if (lg3Var.f) {
                        handler.postDelayed(lg3Var.e, 300000L);
                    }
                }
                break;
        }
    }

    public /* synthetic */ qe(byte b, Object obj, boolean z) {
        this.m = b;
        this.f1822o = obj;
        this.n = z;
    }
}
