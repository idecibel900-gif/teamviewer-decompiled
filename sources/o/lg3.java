package o;

import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;

/* JADX INFO: loaded from: classes.dex */
public final class lg3 {
    public final CaptureActivity a;
    public final ql0 e;
    public boolean f;
    public boolean c = false;
    public final ns b = new ns(this, 4);
    public final Handler d = new Handler();

    public lg3(CaptureActivity captureActivity, ql0 ql0Var) {
        this.a = captureActivity;
        this.e = ql0Var;
    }

    public final void a() {
        this.d.removeCallbacksAndMessages(null);
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}
