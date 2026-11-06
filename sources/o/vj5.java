package o;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class vj5 extends oe8 {
    public final l97 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t36 f2319o;

    public vj5() {
        l97 l97VarK = im3.k(new mx0(false, false, false, false, false, false));
        this.n = l97VarK;
        this.f2319o = yo1.u(l97VarK);
    }

    public static boolean V0(Context context) {
        context.getClass();
        boolean zCanDrawOverlays = Settings.canDrawOverlays(context);
        ye4.a("BasePermissionsViewModel", "Overlay permission " + (zCanDrawOverlays ? "" : "not ") + "granted");
        return zCanDrawOverlays;
    }
}
