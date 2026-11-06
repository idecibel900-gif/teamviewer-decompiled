package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo/el7;", "Lo/v02;", "<init>", "()V", "o/yi5", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
@un1
public final class el7 extends v02 {
    public static final yi5 H0 = new yi5((byte) 13);
    public static boolean I0;
    public String F0;
    public boolean G0;

    @Override // o.v02
    public final void A0() {
        Dialog dialog = this.A0;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        F0(null);
        B0(true, false);
    }

    public final void F0(final DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialog = this.A0;
        if (dialog != null) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.dl7
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    DialogInterface.OnCancelListener onCancelListener2 = onCancelListener;
                    if (onCancelListener2 != null) {
                        onCancelListener2.onCancel(dialogInterface);
                    }
                    this.G0 = false;
                }
            });
        } else {
            ye4.a("TVProgressDialogView", "setOnCancelListener: dialog is null");
        }
    }

    @Override // o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            this.G0 = true;
        }
        if (su2.M(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to 1, 0");
        }
        this.t0 = 1;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_progress, (ViewGroup) null, false);
        int i = R.id.dialog_progress_text;
        if (((TextView) r47.s(viewInflate, R.id.dialog_progress_text)) != null) {
            if (((ProgressBar) r47.s(viewInflate, R.id.dialog_progress_wheel)) != null) {
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                if (bundle != null) {
                    this.F0 = bundle.getString("TVPROGRESSDIALOG_MESSAGE");
                }
                String str = this.F0;
                if (str != null) {
                    if (relativeLayout != null) {
                        ((TextView) relativeLayout.findViewById(R.id.dialog_progress_text)).setText(str);
                    } else {
                        ye4.a("TVProgressDialogView", "setMessage: view is null");
                    }
                }
                F0(null);
                relativeLayout.getClass();
                return relativeLayout;
            }
            i = R.id.dialog_progress_wheel;
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putString("TVPROGRESSDIALOG_MESSAGE", this.F0);
    }

    @Override // o.v02, o.ut2
    public final void i0() {
        super.i0();
        y57.a = this;
    }

    @Override // o.v02, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        this.G0 = false;
    }
}
