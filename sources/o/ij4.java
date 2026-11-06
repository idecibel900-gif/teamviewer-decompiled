package o;

import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/ij4;", "Lo/rq5;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ij4 extends rq5 {
    public boolean x0 = true;

    @Override // o.rq5
    public final void B0(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        if (bundle != null || (bundle = this.r) != null) {
            this.x0 = bundle.getBoolean("extra_disable_instructions", false);
        }
        A0(R.xml.m2m_session_settings);
        br5 br5Var = this.q0;
        Preference preferenceY = null;
        if (br5Var != null && (preferenceScreen = (PreferenceScreen) br5Var.g) != null) {
            preferenceY = preferenceScreen.y("instructions_preference");
        }
        if (preferenceY != null) {
            boolean z = !this.x0;
            if (preferenceY.A != z) {
                preferenceY.A = z;
                preferenceY.h(preferenceY.w());
                preferenceY.g();
            }
            boolean z2 = !this.x0;
            if (preferenceY.B != z2) {
                preferenceY.B = z2;
                preferenceY.g();
            }
        }
    }

    @Override // o.rq5, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putBoolean("extra_disable_instructions", this.x0);
    }
}
