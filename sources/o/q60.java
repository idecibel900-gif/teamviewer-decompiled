package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class q60 extends ut2 {
    public final Handler p0 = new Handler(Looper.getMainLooper());
    public d70 q0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(int i) {
        if (i == 3 || !this.q0.z) {
            if (E0()) {
                this.q0.u = i;
                if (i == 1) {
                    H0(10, vs1.w(E(), 10));
                }
            }
            d70 d70Var = this.q0;
            xc0 xc0Var = d70Var.r;
            if (xc0Var == null) {
                xc0Var = new xc0((byte) 8, false);
                d70Var.r = xc0Var;
            }
            CancellationSignal cancellationSignal = (CancellationSignal) xc0Var.n;
            if (cancellationSignal != null) {
                try {
                    il0.a(cancellationSignal);
                } catch (NullPointerException e) {
                    io.sentry.android.core.v0.d("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                xc0Var.n = null;
            }
        }
    }

    public final void B0() {
        this.q0.v = false;
        C0();
        if (!this.q0.x && O()) {
            w10 w10Var = new w10(G());
            w10Var.j(this);
            w10Var.g(true, true);
        }
        Context contextE = E();
        if (contextE != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextE.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        d70 d70Var = this.q0;
                        d70Var.y = true;
                        this.p0.postDelayed(new p60(d70Var, (byte) 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void C0() {
        this.q0.v = false;
        if (O()) {
            su2 su2VarG = G();
            pl2 pl2Var = (pl2) su2VarG.F("o.pl2");
            if (pl2Var != null) {
                if (pl2Var.O()) {
                    pl2Var.B0(true, false);
                    return;
                }
                w10 w10Var = new w10(su2VarG);
                w10Var.j(pl2Var);
                w10Var.g(true, true);
            }
        }
    }

    public final boolean D0() {
        return Build.VERSION.SDK_INT <= 28 && mo8.o(this.q0.V0());
    }

    public final boolean E0() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            xt2 xt2VarC = C();
            if (xt2VarC != null && this.q0.p != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i == 28) {
                    if (str != null) {
                        for (String str3 : xt2VarC.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (!str.equalsIgnoreCase(str3)) {
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : xt2VarC.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context contextE = E();
            return contextE == null || contextE.getPackageManager() == null || !id5.a(contextE.getPackageManager());
        }
        return true;
    }

    public final void F0() {
        xt2 xt2VarC = C();
        if (xt2VarC == null) {
            io.sentry.android.core.v0.c("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = ky3.a(xt2VarC);
        if (keyguardManagerA == null) {
            G0(12, I(R.string.generic_error_no_keyguard));
            return;
        }
        d70 d70Var = this.q0;
        ae aeVar = d70Var.f592o;
        CharSequence charSequence = aeVar != null ? (CharSequence) aeVar.c : null;
        d70Var.getClass();
        ae aeVar2 = this.q0.f592o;
        Intent intentA = l60.a(keyguardManagerA, charSequence, aeVar2 != null ? (CharSequence) aeVar2.d : null);
        if (intentA == null) {
            G0(14, I(R.string.generic_error_no_device_credential));
            return;
        }
        this.q0.x = true;
        if (E0()) {
            C0();
        }
        intentA.setFlags(134742016);
        z0(intentA, 1);
    }

    public final void G0(int i, CharSequence charSequence) {
        H0(i, charSequence);
        B0();
    }

    public final void H0(int i, CharSequence charSequence) {
        d70 d70Var = this.q0;
        if (d70Var.x) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!d70Var.w) {
            io.sentry.android.core.v0.j("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            d70Var.w = false;
            new Handler(Looper.getMainLooper()).post(new it8(this, i, charSequence));
        }
    }

    public final void I0(u60 u60Var) {
        d70 d70Var = this.q0;
        if (d70Var.w) {
            d70Var.w = false;
            new Handler(Looper.getMainLooper()).post(new it8((byte) 6, this, u60Var, false));
        } else {
            io.sentry.android.core.v0.j("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        B0();
    }

    public final void J0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = I(R.string.default_error_msg);
        }
        this.q0.W0(2);
        d70 d70Var = this.q0;
        nw4 nw4Var = d70Var.J;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var.J = nw4Var;
        }
        d70.Y0(nw4Var, charSequence);
    }

    public final void K0() {
        if (this.q0.v) {
            return;
        }
        if (E() == null) {
            io.sentry.android.core.v0.j("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        d70 d70Var = this.q0;
        d70Var.v = true;
        d70Var.w = true;
        if (E0()) {
            G0(12, vs1.w(r0().getApplicationContext(), 12));
            return;
        }
        BiometricPrompt.Builder builderD = m60.d(r0().getApplicationContext());
        d70 d70Var2 = this.q0;
        ae aeVar = d70Var2.f592o;
        String str = null;
        CharSequence charSequence = aeVar != null ? (CharSequence) aeVar.c : null;
        d70Var2.getClass();
        ae aeVar2 = this.q0.f592o;
        CharSequence charSequence2 = aeVar2 != null ? (CharSequence) aeVar2.d : null;
        if (charSequence != null) {
            m60.g(builderD, charSequence);
        }
        if (charSequence2 != null) {
            m60.e(builderD, charSequence2);
        }
        d70 d70Var3 = this.q0;
        String str2 = d70Var3.t;
        if (str2 != null) {
            str = str2;
        } else if (d70Var3.f592o != null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            this.q0.getClass();
            fj fjVar = new fj((byte) 2);
            d70 d70Var4 = this.q0;
            c70 c70Var = d70Var4.s;
            if (c70Var == null) {
                c70Var = new c70(d70Var4);
                d70Var4.s = c70Var;
            }
            m60.f(builderD, str, fjVar, c70Var);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            ae aeVar3 = this.q0.f592o;
            n60.a(builderD, true);
        }
        int iV0 = this.q0.V0();
        if (i >= 30) {
            o60.a(builderD, iV0);
        } else if (i >= 29) {
            n60.b(builderD, mo8.o(iV0));
        }
        BiometricPrompt biometricPromptC = m60.c(builderD);
        Context contextE = E();
        BiometricPrompt.CryptoObject cryptoObjectB = e8.B(this.q0.p);
        d70 d70Var5 = this.q0;
        xc0 xc0Var = d70Var5.r;
        if (xc0Var == null) {
            xc0Var = new xc0((byte) 8, false);
            d70Var5.r = xc0Var;
        }
        CancellationSignal cancellationSignalB = (CancellationSignal) xc0Var.n;
        if (cancellationSignalB == null) {
            cancellationSignalB = il0.b();
            xc0Var.n = cancellationSignalB;
        }
        fj fjVar2 = new fj((byte) 1);
        d70 d70Var6 = this.q0;
        cj3 cj3Var = d70Var6.q;
        if (cj3Var == null) {
            cj3Var = new cj3(new b70(d70Var6));
            d70Var6.q = cj3Var;
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = (BiometricPrompt$AuthenticationCallback) cj3Var.n;
        if (biometricPrompt$AuthenticationCallbackA == null) {
            biometricPrompt$AuthenticationCallbackA = fz.a((b70) cj3Var.f531o);
            cj3Var.n = biometricPrompt$AuthenticationCallbackA;
        }
        try {
            if (cryptoObjectB == null) {
                m60.b(biometricPromptC, cancellationSignalB, fjVar2, biometricPrompt$AuthenticationCallbackA);
            } else {
                m60.a(biometricPromptC, cryptoObjectB, cancellationSignalB, fjVar2, biometricPrompt$AuthenticationCallbackA);
            }
        } catch (NullPointerException e) {
            io.sentry.android.core.v0.d("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
            G0(1, contextE != null ? contextE.getString(R.string.default_error_msg) : "");
        }
    }

    @Override // o.ut2
    public final void T(int i, int i2, Intent intent) {
        super.T(i, i2, intent);
        if (i == 1) {
            this.q0.x = false;
            if (i2 == -1) {
                I0(new u60());
            } else {
                G0(10, I(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (C() == null) {
            return;
        }
        xt2 xt2VarC = C();
        xt2VarC.getClass();
        ve8 ve8VarO = xt2VarC.o();
        se8 se8VarL = h57.l(xt2VarC);
        bf1 bf1VarK = h57.k(xt2VarC);
        se8VarL.getClass();
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, se8VarL, bf1VarK);
        wt3 wt3VarB = w86.a.b(d70.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        d70 d70Var = (d70) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.q0 = d70Var;
        nw4 nw4Var = d70Var.A;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var.A = nw4Var;
        }
        nw4Var.observe(this, new k60(this, (byte) 0));
        d70 d70Var2 = this.q0;
        nw4 nw4Var2 = d70Var2.B;
        if (nw4Var2 == null) {
            nw4Var2 = new nw4();
            d70Var2.B = nw4Var2;
        }
        nw4Var2.observe(this, new k60(this, (byte) 1));
        d70 d70Var3 = this.q0;
        nw4 nw4Var3 = d70Var3.C;
        if (nw4Var3 == null) {
            nw4Var3 = new nw4();
            d70Var3.C = nw4Var3;
        }
        nw4Var3.observe(this, new k60(this, (byte) 2));
        d70 d70Var4 = this.q0;
        nw4 nw4Var4 = d70Var4.D;
        if (nw4Var4 == null) {
            nw4Var4 = new nw4();
            d70Var4.D = nw4Var4;
        }
        nw4Var4.observe(this, new k60(this, (byte) 3));
        d70 d70Var5 = this.q0;
        nw4 nw4Var5 = d70Var5.E;
        if (nw4Var5 == null) {
            nw4Var5 = new nw4();
            d70Var5.E = nw4Var5;
        }
        nw4Var5.observe(this, new k60(this, (byte) 4));
        d70 d70Var6 = this.q0;
        nw4 nw4Var6 = d70Var6.G;
        if (nw4Var6 == null) {
            nw4Var6 = new nw4();
            d70Var6.G = nw4Var6;
        }
        nw4Var6.observe(this, new k60(this, (byte) 5));
    }

    @Override // o.ut2
    public final void i0() {
        this.S = true;
        if (Build.VERSION.SDK_INT == 29 && mo8.o(this.q0.V0())) {
            d70 d70Var = this.q0;
            d70Var.z = true;
            this.p0.postDelayed(new p60(d70Var, (byte) 2), 250L);
        }
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        if (Build.VERSION.SDK_INT >= 29 || this.q0.x) {
            return;
        }
        xt2 xt2VarC = C();
        if (xt2VarC == null || !xt2VarC.isChangingConfigurations()) {
            A0(0);
        }
    }
}
