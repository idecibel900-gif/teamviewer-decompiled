package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationConnectionViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends oe8 {
    public final SharedPreferences n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IDeviceAuthenticationConnectionViewModel f2241o;

    public ur1(SharedPreferences sharedPreferences, IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel) {
        sharedPreferences.getClass();
        this.n = sharedPreferences;
        this.f2241o = iDeviceAuthenticationConnectionViewModel;
    }

    @Override // o.oe8
    public final void U0() {
        this.f2241o.a();
    }
}
