package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.remotecontrolviewlib.activity.WebViewActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ck3;
import o.df6;
import o.ei7;
import o.g22;
import o.hc1;
import o.hm3;
import o.im3;
import o.j93;
import o.l07;
import o.li8;
import o.r47;
import o.u21;
import o.ye4;
import o.yq4;
import o.ys7;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewActivity extends ei7 {
    public static final /* synthetic */ int O = 0;
    public l07 N;

    @Override // android.app.Activity
    public final void finish() {
        l07 l07Var = this.N;
        hc1 hc1Var = null;
        if (l07Var != null) {
            im3.R(hm3.c(g22.a), null, null, new ys7((Object) l07Var, hc1Var, (byte) 7), 3);
        }
        if (getIntent().getBooleanExtra("sso", false)) {
            CookieManager.getInstance().removeAllCookies(null);
        }
        super.finish();
    }

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ck3 ck3Var = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_webview, (ViewGroup) null, false);
        int i = R.id.webview_progressbar;
        ProgressBar progressBar = (ProgressBar) r47.s(viewInflate, R.id.webview_progressbar);
        if (progressBar != null) {
            i = R.id.webview_webview;
            WebView webView = (WebView) r47.s(viewInflate, R.id.webview_webview);
            if (webView != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                df6 df6Var = new df6(linearLayout, progressBar, webView);
                setContentView(linearLayout);
                I((Toolbar) findViewById(R.id.toolbar));
                ck3 ck3VarH = H();
                if (ck3VarH != null || new j93(this).W()) {
                    ck3Var = ck3VarH;
                } else {
                    ye4.c("ToolbarActivityDelegate", "Could not find action bar!");
                }
                byte b = 1;
                if (ck3Var != null) {
                    ck3Var.n0(true);
                }
                String stringExtra = getIntent().getStringExtra("title");
                if (stringExtra != null) {
                    setTitle(stringExtra);
                }
                this.N = new l07(webView, progressBar);
                webView.getSettings().setJavaScriptEnabled(true);
                String stringExtra2 = getIntent().getStringExtra("finish_url");
                if (stringExtra2 != null && stringExtra2.length() != 0) {
                    webView.setWebViewClient(new li8(stringExtra2, this));
                }
                c().a(this, new u21(df6Var, this, b));
                webView.setDownloadListener(new DownloadListener() { // from class: o.ki8
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        int i2 = WebViewActivity.O;
                        Intent intent = new Intent("android.intent.action.VIEW");
                        str.getClass();
                        intent.setData(Uri.parse(str));
                        this.a.startActivity(intent);
                    }
                });
                String stringExtra3 = getIntent().getStringExtra("url");
                if (stringExtra3 == null) {
                    return;
                }
                webView.loadUrl(stringExtra3);
                return;
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setResult(0);
        finish();
        return true;
    }
}
