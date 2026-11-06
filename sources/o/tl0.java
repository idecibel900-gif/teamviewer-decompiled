package o;

import android.app.AlertDialog;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 {
    public static final /* synthetic */ int n = 0;
    public final CaptureActivity a;
    public final DecoratedBarcodeView b;
    public final lg3 h;
    public final q50 i;
    public final Handler j;
    public boolean m;
    public int c = -1;
    public boolean d = false;
    public boolean e = true;
    public String f = "";
    public boolean g = false;
    public boolean k = false;
    public final sl0 l = new sl0(this);

    public tl0(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        tk0 tk0Var = new tk0(this, (byte) 1);
        this.m = false;
        this.a = captureActivity;
        this.b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().v.add(tk0Var);
        this.j = new Handler();
        this.h = new lg3(captureActivity, new ql0(this, (byte) 0));
        this.i = new q50(captureActivity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.b;
        mk0 mk0Var = decoratedBarcodeView.getBarcodeView().m;
        if (mk0Var == null || mk0Var.g) {
            this.a.finish();
        } else {
            this.k = true;
        }
        decoratedBarcodeView.m.c();
        this.h.a();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.a;
        if (captureActivity.isFinishing() || this.g || this.k) {
            return;
        }
        if (str.isEmpty()) {
            str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new z(this, (byte) 1));
        builder.setOnCancelListener(new rl0(this, (byte) 0));
        builder.show();
    }
}
