package o;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.teamviewer.remotecontrolviewlib.activity.WebViewActivity;

/* JADX INFO: loaded from: classes.dex */
public final class li8 extends WebViewClient {
    public final /* synthetic */ String a;
    public final /* synthetic */ WebViewActivity b;

    public li8(String str, WebViewActivity webViewActivity) {
        this.a = str;
        this.b = webViewActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (str == null || !ub7.Q(str, this.a, false)) {
            return;
        }
        WebViewActivity webViewActivity = this.b;
        webViewActivity.setResult(-1);
        webViewActivity.finish();
    }
}
