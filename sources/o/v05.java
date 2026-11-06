package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.INavigationViewModel;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class v05 extends oe8 {
    public static final w05 r = w05.Connect;
    public final SharedPreferences n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final INavigationViewModel f2261o;
    public final Resources p;
    public w05 q;

    public v05(RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, j93 j93Var, INavigationViewModel iNavigationViewModel) {
        sharedPreferences.getClass();
        j93Var.getClass();
        this.n = sharedPreferences;
        this.f2261o = iNavigationViewModel;
        Resources resources = remoteControlApplication.getResources();
        resources.getClass();
        this.p = resources;
    }

    @Override // o.oe8
    public final void U0() {
        INavigationViewModel iNavigationViewModel = this.f2261o;
        if (iNavigationViewModel != null) {
            iNavigationViewModel.a();
        }
    }
}
