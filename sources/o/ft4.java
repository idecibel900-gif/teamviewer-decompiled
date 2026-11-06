package o;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ft4 extends s implements View.OnAttachStateChangeListener {
    public final View G;
    public final TextView H;
    public final AppCompatImageView I;
    public final TextView J;
    public eh7 K;
    public final VoidSignalCallback L;

    public ft4(View view) {
        super(view);
        this.G = view;
        View viewFindViewById = view.findViewById(R.id.monitoringAlertDesc);
        viewFindViewById.getClass();
        this.H = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.alertsLogAcknowledgedStatusIcon);
        viewFindViewById2.getClass();
        this.I = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.alertTimeStamp);
        viewFindViewById3.getClass();
        this.J = (TextView) viewFindViewById3;
        view.addOnAttachStateChangeListener(this);
        this.L = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3(this, (byte) 10));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        eh7 eh7Var;
        view.getClass();
        VoidSignalCallback voidSignalCallback = this.L;
        if (voidSignalCallback.IsConnected() || (eh7Var = this.K) == null) {
            return;
        }
        eh7Var.d(voidSignalCallback);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.L.Disconnect();
    }

    @Override // o.s
    public final View r() {
        View viewFindViewById = this.m.findViewById(R.id.monitoring_alert_foreground);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // o.s
    public final View s() {
        View viewFindViewById = this.m.findViewById(R.id.monitoring_alert_background_acknowledge);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // o.s
    public final View t() {
        View viewFindViewById = this.m.findViewById(R.id.acknowledgeCheckbox);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // o.s
    public final View u() {
        View viewFindViewById = this.m.findViewById(R.id.monitoring_alert_background_recheck);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // o.s
    public final View v() {
        View viewFindViewById = this.m.findViewById(R.id.recheckCheckbox);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    @Override // o.s
    public final int w() {
        eh7 eh7Var = this.K;
        Integer numValueOf = eh7Var != null ? Integer.valueOf(eh7Var.l()) : null;
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // o.s
    public final void x(eh7 eh7Var) {
        this.K = eh7Var;
        this.H.setText(eh7Var.getTitle());
        this.J.setText(eh7Var.x());
        y(eh7Var.o());
    }

    public final void y(boolean z) {
        int i = R.color.monitoring_alert_text_low_emphasis;
        int i2 = z ? R.color.monitoring_alert_text_low_emphasis : R.color.monitoring_alert_text_high_emphasis;
        int i3 = z ? R.drawable.acknownledged_alert_icon : R.drawable.unacknownledged_alert_icon;
        if (!z) {
            i = R.color.monitoring_alert_timestamp_text_high_emphasis;
        }
        View view = this.G;
        this.H.setTextColor(view.getContext().getColor(i2));
        this.I.setImageResource(i3);
        this.J.setTextColor(view.getContext().getColor(i));
    }
}
