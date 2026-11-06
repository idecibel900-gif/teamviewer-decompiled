package o;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public final class oi8 extends WebViewClient {
    public final /* synthetic */ l07 a;

    public oi8(l07 l07Var) {
        this.a = l07Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ((ProgressBar) this.a.n).setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ((ProgressBar) this.a.n).setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (webView == null) {
            return true;
        }
        webView.loadUrl(strValueOf);
        return true;
    }
}
