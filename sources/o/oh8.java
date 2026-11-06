package o;

import android.net.Uri;
import com.teamviewer.remotecontrolviewlib.activity.WebLoginActivity;

/* JADX INFO: loaded from: classes.dex */
public final class oh8 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ WebLoginActivity n;

    public /* synthetic */ oh8(WebLoginActivity webLoginActivity, byte b) {
        this.m = b;
        this.n = webLoginActivity;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        WebLoginActivity webLoginActivity = this.n;
        switch (b) {
            case 0:
                int iOrdinal = ((ei8) obj).ordinal();
                if (iOrdinal == 0) {
                    int i = WebLoginActivity.S;
                    webLoginActivity.J("LOGIN_SUCCESSFUL");
                    return f88Var;
                }
                if (iOrdinal == 1) {
                    int i2 = WebLoginActivity.S;
                    webLoginActivity.K("LOGIN_GENERIC_ERROR");
                    return f88Var;
                }
                if (iOrdinal == 2) {
                    int i3 = WebLoginActivity.S;
                    webLoginActivity.K("LOGIN_ACCOUNT_DEVICE_LIMIT_EXCEEDED_ERROR");
                    return f88Var;
                }
                if (iOrdinal == 3) {
                    int i4 = WebLoginActivity.S;
                    webLoginActivity.K("LOGIN_ACTIVATION_EXPIRED_ERROR");
                    return f88Var;
                }
                if (iOrdinal != 4) {
                    gk0.s();
                    return null;
                }
                int i5 = WebLoginActivity.S;
                webLoginActivity.K("LOGIN_WRONG_EMAIL_OR_PASSWORD_ERROR");
                return f88Var;
            default:
                Uri uri = Uri.parse((String) obj);
                int i6 = WebLoginActivity.S;
                webLoginActivity.M(uri);
                return f88Var;
        }
    }
}
