package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class v02 extends ut2 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Dialog A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public Handler p0;
    public boolean y0;
    public final mt8 q0 = new mt8((Object) this, (byte) 6);
    public final s02 r0 = new s02(this);
    public final t02 s0 = new t02(this);
    public int t0 = 0;
    public int u0 = 0;
    public boolean v0 = true;
    public boolean w0 = true;
    public int x0 = -1;
    public final ml2 z0 = new ml2(this, 2);
    public boolean E0 = false;

    @Override // o.ut2
    public final lv1 A() {
        return new u02(this, new pt2(this));
    }

    public void A0() {
        B0(false, false);
    }

    public final void B0(boolean z, boolean z2) {
        if (this.C0) {
            return;
        }
        this.C0 = true;
        this.D0 = false;
        Dialog dialog = this.A0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.A0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.p0.getLooper()) {
                    onDismiss(this.A0);
                } else {
                    this.p0.post(this.q0);
                }
            }
        }
        this.B0 = true;
        if (this.x0 >= 0) {
            G().U(this.x0, z);
            this.x0 = -1;
            return;
        }
        w10 w10Var = new w10(G());
        w10Var.p = true;
        w10Var.j(this);
        if (z) {
            w10Var.g(true, true);
        } else {
            w10Var.f();
        }
    }

    public Dialog C0(Bundle bundle) {
        if (su2.M(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new py0(r0(), this.u0);
    }

    public void D0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void E0(su2 su2Var, String str) {
        this.C0 = false;
        this.D0 = true;
        su2Var.getClass();
        w10 w10Var = new w10(su2Var);
        w10Var.p = true;
        w10Var.h(0, this, str, 1);
        w10Var.f();
    }

    @Override // o.ut2
    public final void S() {
        this.S = true;
    }

    @Override // o.ut2
    public final void U(Context context) {
        super.U(context);
        this.g0.observeForever(this.z0);
        if (this.D0) {
            return;
        }
        this.C0 = false;
    }

    @Override // o.ut2
    public void X(Bundle bundle) {
        super.X(bundle);
        this.p0 = new Handler();
        this.w0 = this.K == 0;
        if (bundle != null) {
            this.t0 = bundle.getInt("android:style", 0);
            this.u0 = bundle.getInt("android:theme", 0);
            this.v0 = bundle.getBoolean("android:cancelable", true);
            this.w0 = bundle.getBoolean("android:showsDialog", this.w0);
            this.x0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // o.ut2
    public void b0() {
        this.S = true;
        Dialog dialog = this.A0;
        if (dialog != null) {
            this.B0 = true;
            dialog.setOnDismissListener(null);
            this.A0.dismiss();
            if (!this.C0) {
                onDismiss(this.A0);
            }
            this.A0 = null;
            this.E0 = false;
        }
    }

    @Override // o.ut2
    public final void c0() {
        this.S = true;
        if (!this.D0 && !this.C0) {
            this.C0 = true;
        }
        this.g0.removeObserver(this.z0);
    }

    @Override // o.ut2
    public final LayoutInflater d0(Bundle bundle) {
        LayoutInflater layoutInflaterD0 = super.d0(bundle);
        boolean z = this.w0;
        if (z && !this.y0) {
            if (z && !this.E0) {
                try {
                    this.y0 = true;
                    Dialog dialogC0 = C0(bundle);
                    this.A0 = dialogC0;
                    if (this.w0) {
                        D0(dialogC0, this.t0);
                        Context contextE = E();
                        if (contextE instanceof Activity) {
                            this.A0.setOwnerActivity((Activity) contextE);
                        }
                        this.A0.setCancelable(this.v0);
                        this.A0.setOnCancelListener(this.r0);
                        this.A0.setOnDismissListener(this.s0);
                        this.E0 = true;
                    } else {
                        this.A0 = null;
                    }
                    this.y0 = false;
                } catch (Throwable th) {
                    this.y0 = false;
                    throw th;
                }
            }
            if (su2.M(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.A0;
            if (dialog != null) {
                return layoutInflaterD0.cloneInContext(dialog.getContext());
            }
        } else if (su2.M(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.w0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterD0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterD0;
    }

    @Override // o.ut2
    public void h0(Bundle bundle) {
        Dialog dialog = this.A0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.t0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.u0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.v0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.w0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.x0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // o.ut2
    public void i0() {
        this.S = true;
        Dialog dialog = this.A0;
        if (dialog != null) {
            this.B0 = false;
            dialog.show();
            View decorView = this.A0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // o.ut2
    public void j0() {
        this.S = true;
        Dialog dialog = this.A0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // o.ut2
    public final void l0(Bundle bundle) {
        Bundle bundle2;
        this.S = true;
        if (this.A0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.A0.onRestoreInstanceState(bundle2);
    }

    @Override // o.ut2
    public final void m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.m0(layoutInflater, viewGroup, bundle);
        if (this.U != null || this.A0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.A0.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.B0) {
            return;
        }
        if (su2.M(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        B0(true, true);
    }
}
