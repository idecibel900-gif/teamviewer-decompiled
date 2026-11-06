package o;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import com.journeyapps.barcodescanner.BarcodeView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z20 implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BarcodeView b;

    public /* synthetic */ z20(BarcodeView barcodeView, byte b) {
        this.a = b;
        this.b = barcodeView;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        u20 u20Var;
        ae aeVar;
        byte b = this.a;
        BarcodeView barcodeView = this.b;
        switch (b) {
            case 0:
                int i = message.what;
                if (i != R.id.zxing_decode_succeeded) {
                    if (i != R.id.zxing_decode_failed) {
                        if (i != R.id.zxing_possible_result_points) {
                            return false;
                        }
                        List list = (List) message.obj;
                        u20 u20Var2 = barcodeView.O;
                        if (u20Var2 != null) {
                            z = true;
                            if (barcodeView.N != 1) {
                                u20Var2.a(list);
                            }
                        }
                    }
                    return z;
                }
                x20 x20Var = (x20) message.obj;
                if (x20Var != null && (u20Var = barcodeView.O) != null && barcodeView.N != 1) {
                    u20Var.b(x20Var);
                    if (barcodeView.N == 2) {
                        barcodeView.N = 1;
                        barcodeView.O = null;
                        barcodeView.j();
                        return true;
                    }
                }
                z = true;
                return z;
            default:
                tk0 tk0Var = barcodeView.L;
                int i2 = message.what;
                if (i2 == R.id.zxing_prewiew_size_ready) {
                    x07 x07Var = (x07) message.obj;
                    barcodeView.z = x07Var;
                    x07 x07Var2 = barcodeView.y;
                    if (x07Var2 != null) {
                        if (x07Var == null || (aeVar = barcodeView.w) == null) {
                            barcodeView.D = null;
                            barcodeView.C = null;
                            barcodeView.A = null;
                            hk0.l("containerSize or previewSize is not set yet");
                        } else {
                            int i3 = x07Var.m;
                            int i4 = x07Var.n;
                            int i5 = x07Var2.m;
                            int i6 = x07Var2.n;
                            Rect rectB = ((ds5) aeVar.d).b(x07Var, (x07) aeVar.c);
                            if (rectB.width() > 0 && rectB.height() > 0) {
                                barcodeView.A = rectB;
                                Rect rect = new Rect(0, 0, i5, i6);
                                Rect rect2 = barcodeView.A;
                                Rect rect3 = new Rect(rect);
                                rect3.intersect(rect2);
                                if (barcodeView.E != null) {
                                    rect3.inset(Math.max(0, (rect3.width() - barcodeView.E.m) / 2), Math.max(0, (rect3.height() - barcodeView.E.n) / 2));
                                } else {
                                    int iMin = (int) Math.min(((double) rect3.width()) * barcodeView.F, ((double) rect3.height()) * barcodeView.F);
                                    rect3.inset(iMin, iMin);
                                    if (rect3.height() > rect3.width()) {
                                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                                    }
                                }
                                barcodeView.C = rect3;
                                Rect rect4 = new Rect(barcodeView.C);
                                Rect rect5 = barcodeView.A;
                                rect4.offset(-rect5.left, -rect5.top);
                                Rect rect6 = new Rect((rect4.left * i3) / barcodeView.A.width(), (rect4.top * i4) / barcodeView.A.height(), (rect4.right * i3) / barcodeView.A.width(), (rect4.bottom * i4) / barcodeView.A.height());
                                barcodeView.D = rect6;
                                if (rect6.width() <= 0 || barcodeView.D.height() <= 0) {
                                    barcodeView.D = null;
                                    barcodeView.C = null;
                                    io.sentry.android.core.v0.j("uk0", "Preview frame is too small");
                                } else {
                                    tk0Var.e();
                                }
                            }
                            barcodeView.requestLayout();
                            barcodeView.g();
                        }
                    }
                    return true;
                }
                if (i2 == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message.obj;
                    if (barcodeView.m != null) {
                        barcodeView.c();
                        tk0Var.c(exc);
                    }
                } else if (i2 == R.id.zxing_camera_closed) {
                    tk0Var.a();
                }
                return false;
        }
    }
}
