package com.teamviewer.remotecontrolviewlib.activity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.util.SparseArray;
import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteControlLoginViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import o.bc7;
import o.bf1;
import o.bt1;
import o.c36;
import o.ci8;
import o.cz;
import o.df6;
import o.dl5;
import o.e8;
import o.ei7;
import o.f8;
import o.ga7;
import o.gi8;
import o.h57;
import o.hc1;
import o.hi8;
import o.hk0;
import o.im3;
import o.iq8;
import o.it1;
import o.j93;
import o.jo7;
import o.l97;
import o.mh8;
import o.n87;
import o.nh8;
import o.ny0;
import o.ph8;
import o.pn5;
import o.q26;
import o.ua5;
import o.ub7;
import o.us1;
import o.ve8;
import o.w86;
import o.wk0;
import o.wt3;
import o.ye4;
import o.yy0;
import o.zh8;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class WebLoginActivity extends ei7 {
    public static final /* synthetic */ int S = 0;
    public hi8 N;
    public boolean O;
    public n87 P;
    public Uri Q;
    public final f8 R = C(new nh8(this), new e8(5));

    public final void J(String str) {
        Intent intent = new Intent();
        intent.putExtra("LOGIN_RESULT_KEY", str);
        setResult(-1, intent);
        finish();
    }

    public final void K(String str) {
        ye4.a("WebLoginActivity", "Login result: ".concat(str));
        n87 n87Var = this.P;
        if (n87Var != null) {
            n87Var.j(null);
        }
        J(str);
    }

    public final void L(Uri uri) {
        String string;
        if (uri == null || (string = uri.toString()) == null) {
            return;
        }
        hc1 hc1Var = null;
        if (bc7.N(false, string, "tvoneweblogin://sociallogin")) {
            ye4.a("WebLoginActivity", "Handle intentUri type: SOCIAL_LOGIN");
            ye4.a("WebLoginActivity", "Process social login");
            hi8 hi8Var = this.N;
            if (hi8Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            String queryParameter = uri.getQueryParameter("path");
            if (queryParameter == null || ub7.b0(queryParameter)) {
                im3.R(e8.n(hi8Var), null, null, new gi8(hi8Var, hc1Var, (byte) 1), 3);
                return;
            }
            IRemoteControlLoginViewModel iRemoteControlLoginViewModel = hi8Var.n;
            IRemoteControlLoginViewModelSWIGJNI.IRemoteControlLoginViewModel_ProcessSocialLogInResponse(iRemoteControlLoginViewModel.a, iRemoteControlLoginViewModel, queryParameter);
            l97 l97Var = hi8Var.u;
            Boolean bool = Boolean.TRUE;
            l97Var.getClass();
            l97Var.l(null, bool);
            return;
        }
        if (!bc7.N(false, string, "tvoneweblogin://centralizedclientlogin")) {
            ye4.a.g("WebLoginActivity", "Handle intentUri type: UNKNOWN_PREFIX");
            return;
        }
        ye4.a("WebLoginActivity", "Handle intentUri type: WEB_LOGIN");
        hi8 hi8Var2 = this.N;
        if (hi8Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        l97 l97Var2 = hi8Var2.u;
        Boolean bool2 = Boolean.TRUE;
        l97Var2.getClass();
        l97Var2.l(null, bool2);
        if (!Boolean.parseBoolean(uri.getQueryParameter("fromInAppPurchase"))) {
            O(uri);
            return;
        }
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        Intent intent = new Intent(this, (Class<?>) InAppPurchaseActivity.class);
        intent.putExtra("BUNDLE_KEY_LOGIN_URI", uri);
        jo7 jo7Var = new jo7(this);
        jo7Var.a(new ComponentName(jo7Var.n, (Class<?>) InAppPurchaseActivity.class));
        jo7Var.m.add(intent);
        jo7Var.b();
    }

    public final void M(Uri uri) {
        try {
            this.Q = uri;
            String strR = iq8.r(this);
            ye4.a("WebLoginActivity", "Default browser package: " + strR);
            if (strR != null && iq8.u(this, strR)) {
                ye4.a("WebLoginActivity", "AuthTab supported");
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(h57.D(zh8.OnAuthTabMethod, "WebLoginActivity"));
                cz czVar = new cz(Integer.valueOf(getColor(R.color.primary) | (-16777216)), Integer.valueOf(getColor(R.color.primary) | (-16777216)), (byte) 0);
                Intent intent = new Intent("android.intent.action.VIEW");
                SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
                sparseArray.put(2, czVar.a());
                sparseArray.put(1, czVar.a());
                Bundle bundleA = czVar.a();
                intent.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                    intent.putExtras(bundle);
                }
                intent.putExtras(new Bundle());
                intent.putExtras(bundleA);
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", sparseArray);
                intent.putExtras(bundle2);
                df6 df6Var = new df6(intent, (byte) 23);
                f8 f8Var = this.R;
                Intent intent2 = (Intent) df6Var.n;
                intent2.setData(uri);
                intent2.putExtra("androidx.browser.auth.extra.REDIRECT_SCHEME", "tvoneweblogin");
                f8Var.a(intent2, null);
                ye4.a("WebLoginActivity", "Web browser for login launched.");
                return;
            }
            ye4.a("WebLoginActivity", "AuthTab not supported, falling back to CustomTab");
            N(uri);
        } catch (ActivityNotFoundException unused) {
            K("LOGIN_NO_BROWSER");
        }
    }

    public final void N(Uri uri) {
        try {
            IStatisticsHandler iStatisticsHandler = ga7.a;
            ga7.a(h57.D(zh8.OnCustomTabMethod, "WebLoginActivity"));
            cz czVar = new cz(Integer.valueOf(getColor(R.color.primary) | (-16777216)), Integer.valueOf(getColor(R.color.primary) | (-16777216)), (byte) 1);
            j93 j93Var = new j93((byte) 10);
            j93Var.c0(2, czVar);
            j93Var.c0(1, czVar);
            j93Var.q = czVar.a();
            wk0 wk0VarC = j93Var.C();
            Intent intent = (Intent) wk0VarC.n;
            intent.setData(uri);
            startActivity(intent, (Bundle) wk0VarC.f2420o);
            ye4.a("WebLoginActivity", "Fallback CustomTab for login launched.");
        } catch (ActivityNotFoundException unused) {
            K("LOGIN_NO_BROWSER");
        }
    }

    public final void O(Uri uri) {
        ye4.a("WebLoginActivity", "Process login with Url token");
        hi8 hi8Var = this.N;
        if (hi8Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        String string = uri.toString();
        string.getClass();
        IRemoteControlLoginViewModel iRemoteControlLoginViewModel = hi8Var.n;
        IRemoteControlLoginViewModelSWIGJNI.IRemoteControlLoginViewModel_StartUrlTokenLogIn(iRemoteControlLoginViewModel.a, iRemoteControlLoginViewModel, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strV0;
        super.onCreate(bundle);
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 19), (byte) 2);
        ve8 ve8VarO = o();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(hi8.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.N = (hi8) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        byte b = 0;
        this.O = bundle != null ? bundle.getBoolean("HAS_RESUMED_ONCE_KEY") : false;
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_SIGN_UP", false);
        im3.R(us1.B(this), null, null, new ph8(this, 0 == true ? 1 : 0, b), 3);
        im3.R(us1.B(this), null, null, new ph8(this, 0 == true ? 1 : 0, (byte) 1), 3);
        ny0.a(this, new yy0(-115846153, true, new mh8(this, b)));
        if (bundle != null) {
            Uri uri = (Uri) bt1.C(getIntent(), "BUNDLE_KEY_LOGIN_URI", Uri.class);
            if (uri != null) {
                O(uri);
            }
            L(getIntent().getData());
            return;
        }
        hi8 hi8Var = this.N;
        if (booleanExtra) {
            if (hi8Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            strV0 = hi8Var.V0(ci8.SIGN_UP);
        } else {
            if (hi8Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            strV0 = hi8Var.V0(ci8.LOGIN);
        }
        Intent intent = getIntent();
        Boolean boolValueOf = intent != null ? Boolean.valueOf(intent.getBooleanExtra("fromSettings", false)) : null;
        Intent intent2 = getIntent();
        Boolean boolValueOf2 = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("fromInAppPurchase", false)) : null;
        Uri uriBuild = Uri.parse(strV0).buildUpon().appendQueryParameter("Client-Language", LocaleList.getDefault().get(0).getLanguage()).appendQueryParameter("Is-Native-Client", "1").appendQueryParameter("Client-OS", "Android").appendQueryParameter("redirect_uri", "tvoneweblogin://centralizedclientlogin?fromSettings=" + boolValueOf + "&fromInAppPurchase=" + boolValueOf2 + "&ts=" + System.currentTimeMillis()).build();
        uriBuild.getClass();
        M(uriBuild);
    }

    @Override // o.my0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        L(intent.getData());
    }

    @Override // o.ei7, o.xt2, android.app.Activity
    public final void onResume() {
        super.onResume();
        hi8 hi8Var = this.N;
        hc1 hc1Var = null;
        if (hi8Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        if (((Boolean) hi8Var.v.m.getValue()).booleanValue()) {
            ye4.a("WebLoginActivity", "Back from web browser and loading/activating.");
            n87 n87Var = this.P;
            if (n87Var == null || !n87Var.e()) {
                this.P = im3.R(us1.B(this), null, null, new ph8(this, hc1Var, (byte) 2), 3);
                return;
            }
            return;
        }
        hi8 hi8Var2 = this.N;
        if (hi8Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        if (((Boolean) hi8Var2.x.m.getValue()).booleanValue()) {
            ye4.a("WebLoginActivity", "Back from web browser with sign-in incomplete dialog shown.");
        } else if (!this.O) {
            this.O = true;
        } else {
            ye4.a("WebLoginActivity", "Back from web browser without trying to log in.");
            finish();
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HAS_RESUMED_ONCE_KEY", this.O);
    }
}
