package o;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class tk0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((BarcodeView) obj).v.iterator();
                while (it.hasNext()) {
                    ((tk0) it.next()).a();
                }
                break;
            case 1:
                tl0 tl0Var = (tl0) obj;
                if (tl0Var.k) {
                    Log.d("tl0", "Camera closed; finishing activity");
                    tl0Var.a.finish();
                }
                break;
        }
    }

    public final void c(Exception exc) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((BarcodeView) obj).v.iterator();
                while (it.hasNext()) {
                    ((tk0) it.next()).c(exc);
                }
                break;
            case 1:
                tl0 tl0Var = (tl0) obj;
                tl0Var.b(tl0Var.a.getString(R.string.zxing_msg_camera_framework_bug));
                break;
        }
    }

    public final void e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = ((BarcodeView) obj).v.iterator();
                while (it.hasNext()) {
                    ((tk0) it.next()).e();
                }
                break;
            case 1:
                break;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) obj;
                uk0 uk0Var = viewfinderView.u;
                if (uk0Var != null) {
                    Rect framingRect = uk0Var.getFramingRect();
                    x07 previewSize = viewfinderView.u.getPreviewSize();
                    if (framingRect != null && previewSize != null) {
                        viewfinderView.v = framingRect;
                        viewfinderView.w = previewSize;
                    }
                }
                viewfinderView.invalidate();
                break;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                Iterator it = ((BarcodeView) this.b).v.iterator();
                while (it.hasNext()) {
                    ((tk0) it.next()).g();
                }
                break;
        }
    }

    public final void j() {
        switch (this.a) {
            case 0:
                Iterator it = ((BarcodeView) this.b).v.iterator();
                while (it.hasNext()) {
                    ((tk0) it.next()).j();
                }
                break;
        }
    }
}
