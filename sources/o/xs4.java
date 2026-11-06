package o;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xs4 extends s implements View.OnAttachStateChangeListener {
    public final View G;
    public final TextView H;
    public final TextView I;
    public final AppCompatImageView J;
    public final AppCompatImageView K;
    public final AppCompatImageView L;
    public final TextView M;
    public eh7 N;
    public final VoidSignalCallback O;
    public final VoidSignalCallback P;

    public xs4(View view) {
        super(view);
        this.G = view;
        View viewFindViewById = view.findViewById(R.id.deviceTitle);
        viewFindViewById.getClass();
        this.H = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.deviceSubtitle);
        viewFindViewById2.getClass();
        this.I = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.deviceAvatarIcon);
        viewFindViewById3.getClass();
        this.J = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.deviceStatusIcon);
        viewFindViewById4.getClass();
        this.K = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.deviceLogAcknowledgedStatusIcon);
        viewFindViewById5.getClass();
        this.L = (AppCompatImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.deviceAlertTimeStamp);
        viewFindViewById6.getClass();
        this.M = (TextView) viewFindViewById6;
        view.addOnAttachStateChangeListener(this);
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        this.O = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ws4
            public final /* synthetic */ xs4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                f88 f88Var = f88.a;
                xs4 xs4Var = this.n;
                switch (b2) {
                    case 0:
                        TextView textView = xs4Var.I;
                        eh7 eh7Var = xs4Var.N;
                        if (eh7Var == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        textView.setText(eh7Var.t());
                        eh7 eh7Var2 = xs4Var.N;
                        if (eh7Var2 != null) {
                            xs4Var.y(eh7Var2.o());
                            return f88Var;
                        }
                        im3.e0("viewModel");
                        throw null;
                    default:
                        AppCompatImageView appCompatImageView = xs4Var.K;
                        eh7 eh7Var3 = xs4Var.N;
                        if (eh7Var3 != null) {
                            appCompatImageView.setImageResource(eh7Var3.r());
                            return f88Var;
                        }
                        im3.e0("viewModel");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.P = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.ws4
            public final /* synthetic */ xs4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                f88 f88Var = f88.a;
                xs4 xs4Var = this.n;
                switch (b3) {
                    case 0:
                        TextView textView = xs4Var.I;
                        eh7 eh7Var = xs4Var.N;
                        if (eh7Var == null) {
                            im3.e0("viewModel");
                            throw null;
                        }
                        textView.setText(eh7Var.t());
                        eh7 eh7Var2 = xs4Var.N;
                        if (eh7Var2 != null) {
                            xs4Var.y(eh7Var2.o());
                            return f88Var;
                        }
                        im3.e0("viewModel");
                        throw null;
                    default:
                        AppCompatImageView appCompatImageView = xs4Var.K;
                        eh7 eh7Var3 = xs4Var.N;
                        if (eh7Var3 != null) {
                            appCompatImageView.setImageResource(eh7Var3.r());
                            return f88Var;
                        }
                        im3.e0("viewModel");
                        throw null;
                }
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        VoidSignalCallback voidSignalCallback = this.O;
        if (!voidSignalCallback.IsConnected()) {
            eh7 eh7Var = this.N;
            if (eh7Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            eh7Var.d(voidSignalCallback);
        }
        VoidSignalCallback voidSignalCallback2 = this.P;
        if (voidSignalCallback2.IsConnected()) {
            return;
        }
        eh7 eh7Var2 = this.N;
        if (eh7Var2 != null) {
            eh7Var2.j(voidSignalCallback2);
        } else {
            im3.e0("viewModel");
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.O.Disconnect();
        this.P.Disconnect();
    }

    @Override // o.s
    public final int w() {
        eh7 eh7Var = this.N;
        if (eh7Var != null) {
            return eh7Var.l();
        }
        im3.e0("viewModel");
        throw null;
    }

    @Override // o.s
    public final void x(eh7 eh7Var) {
        this.N = eh7Var;
        this.H.setText(eh7Var.getTitle());
        this.I.setText(eh7Var.t());
        this.M.setText(eh7Var.x());
        this.J.setImageResource(R.drawable.device_icon);
        y(eh7Var.o());
        eh7 eh7Var2 = this.N;
        if (eh7Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        this.K.setImageResource(eh7Var2.r());
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
        this.L.setImageResource(i3);
        this.M.setTextColor(view.getContext().getColor(i));
    }
}
