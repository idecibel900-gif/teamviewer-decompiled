package o;

import android.content.Intent;
import android.net.Uri;
import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nh8 implements a8, qw2 {
    public final /* synthetic */ WebLoginActivity m;

    public nh8(WebLoginActivity webLoginActivity) {
        this.m = webLoginActivity;
    }

    @Override // o.a8
    public final void a(Object obj) {
        dz dzVar = (dz) obj;
        dzVar.getClass();
        int i = WebLoginActivity.S;
        int i2 = dzVar.a;
        Uri data = dzVar.b;
        WebLoginActivity webLoginActivity = this.m;
        ye4 ye4Var = ye4.a;
        if (i2 == -1) {
            ye4Var.g("WebLoginActivity", "AuthTabResult: RESULT_OK");
            webLoginActivity.L(data);
            return;
        }
        if (i2 != 0) {
            if (i2 == 2) {
                ye4Var.g("WebLoginActivity", "AuthTabResult: RESULT_VERIFICATION_FAILED");
                return;
            } else {
                if (i2 == 3) {
                    ye4Var.g("WebLoginActivity", "AuthTabResult: RESULT_VERIFICATION_TIMED_OUT");
                    return;
                }
                ye4Var.g("WebLoginActivity", "Unknown AuthTabResult: " + i2);
                return;
            }
        }
        ye4Var.g("WebLoginActivity", "AuthTabResult: RESULT_CANCELED or auth tab not supported");
        if (data == null) {
            Intent intent = webLoginActivity.getIntent();
            data = intent != null ? intent.getData() : null;
        }
        if (data != null) {
            ye4.a("WebLoginActivity", "Fallback redirect detected after RESULT_CANCELED");
            webLoginActivity.L(data);
            return;
        }
        ye4.a("WebLoginActivity", "FallbackUri is null, showing sign-in incomplete dialog");
        hi8 hi8Var = webLoginActivity.N;
        if (hi8Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        l97 l97Var = hi8Var.w;
        Boolean bool = Boolean.TRUE;
        l97Var.getClass();
        l97Var.l(null, bool);
    }

    @Override // o.qw2
    public final pw2 b() {
        return new cx2(1, this.m, WebLoginActivity.class, "handleAuthTabResult", "handleAuthTabResult(Landroidx/browser/auth/AuthTabIntent$AuthResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a8) && (obj instanceof qw2)) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
