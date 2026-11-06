package o;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class em7 extends WebViewClient {
    public final /* synthetic */ px4 a;
    public final /* synthetic */ px4 b;
    public final /* synthetic */ px4 c;
    public final /* synthetic */ dm7 d;
    public final /* synthetic */ me1 e;
    public final /* synthetic */ px4 f;

    public em7(px4 px4Var, px4 px4Var2, px4 px4Var3, dm7 dm7Var, me1 me1Var, px4 px4Var4) {
        this.a = px4Var;
        this.b = px4Var2;
        this.c = px4Var3;
        this.d = dm7Var;
        this.e = me1Var;
        this.f = px4Var4;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Boolean bool = Boolean.FALSE;
        this.c.setValue(bool);
        if (!((Boolean) this.a.getValue()).booleanValue()) {
            if (webView != null) {
                webView.setVisibility(0);
            }
            this.b.setValue(bool);
        }
        dm7 dm7Var = this.d;
        if (dm7Var == null || !dm7Var.d) {
            return;
        }
        im3.R(this.e, null, null, new mf7(webView, null, (byte) 3), 3);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.c.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webResourceRequest.getClass();
        webResourceError.getClass();
        Boolean bool = Boolean.TRUE;
        this.a.setValue(bool);
        px4 px4Var = this.b;
        if (!((Boolean) px4Var.getValue()).booleanValue()) {
            px4Var.setValue(bool);
        }
        if (webView != null) {
            webView.setVisibility(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ((Function0) this.f.getValue()).a();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getClass();
        return false;
    }
}
