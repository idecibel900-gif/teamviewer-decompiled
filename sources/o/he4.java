package o;

import android.os.Build;
import android.text.TextUtils;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class he4 extends oe8 {
    public final LockManager n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LogoutViewModel f966o;
    public final xt6 p;
    public final ia3 q;
    public final nw4 r;

    public he4(LockManager lockManager, LogoutViewModel logoutViewModel, xt6 xt6Var, ia3 ia3Var) {
        lockManager.getClass();
        this.n = lockManager;
        this.f966o = logoutViewModel;
        this.p = xt6Var;
        this.q = ia3Var;
        this.r = new nw4(Boolean.FALSE);
    }

    @Override // o.oe8
    public final void U0() {
        this.f966o.c();
    }

    public final void V0(xt2 xt2Var, Function0 function0) {
        String strValueOf;
        this.r.setValue(Boolean.FALSE);
        fj3 fj3Var = new fj3((Object) this, (byte) 7);
        LockManager lockManager = this.n;
        lockManager.getClass();
        int i = lockManager.d;
        String string = xt2Var.getString(R.string.tv_lock_prompt_title);
        String string2 = xt2Var.getString(R.string.tv_lock_prompt_description);
        ee4 ee4Var = new ee4(fj3Var, lockManager, function0);
        su2 su2VarD = xt2Var.D();
        ve8 ve8VarO = xt2Var.o();
        se8 se8VarL = h57.l(xt2Var);
        bf1 bf1VarK = h57.k(xt2Var);
        se8VarL.getClass();
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, se8VarL, bf1VarK);
        wt3 wt3VarB = w86.a.b(d70.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        ((d70) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB)).n = ee4Var;
        if (TextUtils.isEmpty(string)) {
            hk0.g("Title must be set and non-empty.");
            return;
        }
        if (!mo8.q(i)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            if (i == 15) {
                strValueOf = "BIOMETRIC_STRONG";
            } else if (i == 255) {
                strValueOf = "BIOMETRIC_WEAK";
            } else if (i == 32768) {
                strValueOf = "DEVICE_CREDENTIAL";
            } else if (i != 32783) {
                strValueOf = i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
            } else {
                strValueOf = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
            }
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        boolean zO = i != 0 ? mo8.o(i) : false;
        if (TextUtils.isEmpty(null) && !zO) {
            hk0.g("Negative text must be set and non-empty.");
            return;
        }
        if (!TextUtils.isEmpty(null) && zO) {
            hk0.g("Negative text must not be set if device credential authentication is allowed.");
            return;
        }
        ae aeVar = new ae(string, string2, i, (byte) 4);
        if (su2VarD.R()) {
            io.sentry.android.core.v0.c("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        q60 q60Var = (q60) su2VarD.F("o.q60");
        if (q60Var == null) {
            q60Var = new q60();
            w10 w10Var = new w10(su2VarD);
            w10Var.h(0, q60Var, "o.q60", 1);
            w10Var.g(true, true);
            su2VarD.B(true);
            su2VarD.G();
        }
        xt2 xt2VarC = q60Var.C();
        if (xt2VarC == null) {
            io.sentry.android.core.v0.c("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        d70 d70Var = q60Var.q0;
        d70Var.f592o = aeVar;
        if (i == 0) {
            i = 255;
        }
        if (Build.VERSION.SDK_INT >= 30 || i != 15) {
            d70Var.p = null;
        } else {
            d70Var.p = e8.l();
        }
        boolean zD0 = q60Var.D0();
        d70 d70Var2 = q60Var.q0;
        if (zD0) {
            d70Var2.t = q60Var.I(R.string.confirm_device_credential_password);
        } else {
            d70Var2.t = null;
        }
        if (q60Var.D0() && new iu(new t60(xt2VarC)).g() != 0) {
            q60Var.q0.w = true;
            q60Var.F0();
        } else if (q60Var.q0.y) {
            q60Var.p0.postDelayed(new p60(q60Var), 600L);
        } else {
            q60Var.K0();
        }
    }

    public final void W0() {
        fx3.q(this.n.b, "lock_enabled", false);
        mo7 mo7Var = ((zt6) this.p).f;
        if (mo7Var != null) {
            mo7Var.h(ys6.f2637o);
        }
        ((l41) this.q).a();
    }
}
