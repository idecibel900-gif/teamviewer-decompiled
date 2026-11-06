package o;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes2.dex */
public final class ni8 extends WebChromeClient {
    public final /* synthetic */ l07 a;

    public ni8(l07 l07Var) {
        this.a = l07Var;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
            ((ProgressBar) this.a.n).setVisibility(8);
        }
    }
}
