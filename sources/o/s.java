package o;

import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends c76 {
    public View r() {
        return this.m.findViewById(R.id.monitored_device_alert_foreground);
    }

    public View s() {
        return null;
    }

    public View t() {
        return null;
    }

    public View u() {
        return this.m.findViewById(R.id.monitored_device_background_recheck);
    }

    public View v() {
        return this.m.findViewById(R.id.deviceRecheckCheckbox);
    }

    public abstract int w();

    public abstract void x(eh7 eh7Var);
}
