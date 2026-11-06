package o;

import android.webkit.WebView;
import com.teamviewer.remotecontrolviewlib.activity.WebViewActivity;

/* JADX INFO: loaded from: classes.dex */
public final class u21 extends j75 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u21(Object obj, Object obj2, byte b) {
        super(true);
        this.d = b;
        this.e = obj;
        this.f = obj2;
    }

    @Override // o.j75
    public final void b() {
        byte b = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj2;
                t36 t36Var = y31Var.Q;
                if (((p31) t36Var.m.getValue()).a) {
                    y31Var.Z0();
                } else if (!((p31) t36Var.m.getValue()).b) {
                    f(false);
                    ((y21) obj).p0().c().d();
                } else {
                    y31Var.b1();
                    y31Var.i1(null);
                }
                break;
            default:
                WebView webView = (WebView) ((df6) obj2).n;
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    ((WebViewActivity) obj).setResult(0);
                }
                f(webView.canGoBack());
                break;
        }
    }
}
