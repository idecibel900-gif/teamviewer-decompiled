package o;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ez extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ hz a;

    public ez(hz hzVar) {
        this.a = hzVar;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        WeakReference weakReference = ((b70) this.a).a;
        if (weakReference.get() == null || ((d70) weakReference.get()).x || !((d70) weakReference.get()).w) {
            return;
        }
        d70 d70Var = (d70) weakReference.get();
        j60 j60Var = new j60(i, charSequence);
        nw4 nw4Var = d70Var.B;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var.B = nw4Var;
        }
        d70.Y0(nw4Var, j60Var);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((b70) this.a).a;
        if (weakReference.get() == null || !((d70) weakReference.get()).w) {
            return;
        }
        d70 d70Var = (d70) weakReference.get();
        nw4 nw4Var = d70Var.D;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var.D = nw4Var;
        }
        d70.Y0(nw4Var, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0038  */
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        int iA;
        BiometricPrompt.CryptoObject cryptoObject;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null && gf1.d(cryptoObject) == null && gf1.f(cryptoObject) == null && gf1.e(cryptoObject) == null && Build.VERSION.SDK_INT >= 30) {
            hf1.b(cryptoObject);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = gz.a(authenticationResult);
            } else {
                iA = -1;
            }
        } else if (i == 29) {
            iA = -1;
        } else {
            iA = 2;
        }
        u60 u60Var = new u60();
        WeakReference weakReference = ((b70) this.a).a;
        if (weakReference.get() == null || !((d70) weakReference.get()).w) {
            return;
        }
        if (iA == -1) {
            ((d70) weakReference.get()).V0();
            u60Var = new u60();
        }
        d70 d70Var = (d70) weakReference.get();
        nw4 nw4Var = d70Var.A;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var.A = nw4Var;
        }
        d70.Y0(nw4Var, u60Var);
    }
}
