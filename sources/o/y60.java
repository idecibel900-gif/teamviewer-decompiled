package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class y60 extends oe8 {
    public final SharedPreferences n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IBiometricsStatisticsViewModel f2581o;
    public boolean p;

    public y60(SharedPreferences sharedPreferences, IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel) {
        sharedPreferences.getClass();
        this.n = sharedPreferences;
        this.f2581o = iBiometricsStatisticsViewModel;
    }

    @Override // o.oe8
    public final void U0() {
        this.f2581o.a();
    }
}
