package o;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/zg2;", "Lo/v02;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zg2 extends v02 {
    public static zg2 H0;
    public View F0;
    public boolean G0;

    public zg2() {
        H0 = this;
    }

    @Override // o.v02
    public final void A0() {
        bu7.MAIN.a(new pc0((Object) this, (byte) 9));
    }

    public final void F0(final long j, final long j2) {
        if (this.U != null) {
            View view = this.F0;
            final ProgressBar progressBar = view != null ? (ProgressBar) view.findViewById(R.id.filetransfer_progress_singlefile) : null;
            View view2 = this.F0;
            final TextView textView = view2 != null ? (TextView) view2.findViewById(R.id.filetransfer_progress_percentprogress) : null;
            View view3 = this.F0;
            final TextView textView2 = view3 != null ? (TextView) view3.findViewById(R.id.filetransfer_progress_sizeprogress) : null;
            if (progressBar == null || textView == null || textView2 == null) {
                return;
            }
            bu7.MAIN.a(new Runnable() { // from class: o.xg2
                @Override // java.lang.Runnable
                public final void run() {
                    double d = j;
                    double d2 = j2;
                    int i = (int) ((d / d2) * 100.0d);
                    double dFloor = Math.floor(((d / 1024.0d) / 1024.0d) * 10.0d) / 10.0d;
                    double dFloor2 = Math.floor(((d2 / 1024.0d) / 1024.0d) * 10.0d) / 10.0d;
                    progressBar.setProgress(i);
                    textView.setText(i + "%");
                    Resources resourcesH = this.H();
                    resourcesH.getClass();
                    textView2.setText(o67.h(resourcesH, R.string.tv_of, dFloor + " MB", dFloor2 + " MB"));
                }
            });
        }
    }

    @Override // o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            this.G0 = true;
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_filetransfer_progress, viewGroup, false);
        this.F0 = viewInflate;
        ProgressBar progressBar = viewInflate != null ? (ProgressBar) viewInflate.findViewById(R.id.filetransfer_progress_singlefile) : null;
        if (progressBar != null) {
            progressBar.setMax(100);
        }
        this.v0 = false;
        Dialog dialog = this.A0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        View view = this.F0;
        Button button = view != null ? (Button) view.findViewById(R.id.filetransfer_cancel_button) : null;
        if (button != null) {
            button.setOnClickListener(new wg2());
        }
        Dialog dialog2 = this.A0;
        if (dialog2 != null) {
            dialog2.setTitle(r0().getString(R.string.tv_filetransfer_load_title));
            dialog2.setCancelable(false);
        } else {
            ye4.c("FTProgressDialogFragment", "onCreateView(): Dialog is NULL");
        }
        return this.F0;
    }

    @Override // o.ut2
    public final void a0() {
        this.S = true;
        this.F0 = null;
    }
}
