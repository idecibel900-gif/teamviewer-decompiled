package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class jl7 extends oe8 implements fd3 {
    public final xt6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Settings f1180o;
    public final nw4 p;

    public jl7(xt6 xt6Var, Settings settings) {
        settings.getClass();
        this.n = xt6Var;
        this.f1180o = settings;
        this.p = new nw4(Boolean.valueOf(Settings.a(gv6.USER, ca8.P_REMOTE_REMOVEWALLPAPER)));
    }

    @Override // o.fd3
    public final void C0(boolean z) {
        mo7 mo7Var = ((zt6) this.n).f;
        ec3 ec3Var = mo7Var instanceof ec3 ? (ec3) mo7Var : null;
        if (ec3Var == null) {
            ye4.c("TVRemoveWallpaperPreferenceViewModel", "toggleRemoveWallpaper: Session is null");
            return;
        }
        a2 a2Var = (a2) ec3Var;
        if (!a2Var.p.j) {
            ye4.a.g("TVRemoveWallpaperPreferenceViewModel", "Remove Wallpaper not supported by partner");
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_supportedFeatureMessage_NoRemoveWallpaper);
                return;
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                return;
            }
        }
        this.p.setValue(Boolean.valueOf(z));
        ca8 ca8Var = ca8.P_REMOTE_REMOVEWALLPAPER;
        this.f1180o.getClass();
        Settings.k(gv6.USER, ca8Var, z);
        ha6 ha6Var = a2Var.f283o;
        ry5 ry5Var = ha6Var.j;
        if (ry5Var.d != z) {
            ry5Var.d = z;
            ha6Var.a.b();
        }
    }

    @Override // o.fd3
    public final nw4 v0() {
        return this.p;
    }
}
