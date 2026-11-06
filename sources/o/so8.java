package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class so8 extends ga0 {
    public final /* synthetic */ byte v0;

    @Override // o.ga0
    public com.google.android.gms.common.internal.a f(Context context, Looper looper, io.sentry.android.core.d dVar, Object obj, tz2 tz2Var, uz2 uz2Var) {
        switch (this.v0) {
            case 0:
                Object obj2 = dVar.r;
                Integer num = (Integer) dVar.s;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new wz6(context, looper, dVar, bundle, tz2Var, uz2Var);
            case 1:
                throw ua5.i(obj);
            default:
                return super.f(context, looper, dVar, obj, tz2Var, uz2Var);
        }
    }

    @Override // o.ga0
    public com.google.android.gms.common.internal.a g(Context context, Looper looper, io.sentry.android.core.d dVar, Object obj, ap8 ap8Var, ap8 ap8Var2) {
        switch (this.v0) {
            case 2:
                return new xo8(context, looper, 449, dVar, ap8Var, ap8Var2);
            case 3:
                return new zp8(context, looper, dVar, (oo7) obj, ap8Var, ap8Var2);
            case 4:
                return new at8(context, looper, 457, dVar, ap8Var, ap8Var2);
            default:
                return super.g(context, looper, dVar, obj, ap8Var, ap8Var2);
        }
    }
}
