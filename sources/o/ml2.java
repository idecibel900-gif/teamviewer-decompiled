package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ml2 implements Observer {
    public final /* synthetic */ byte m;
    public final /* synthetic */ v02 n;

    public /* synthetic */ ml2(v02 v02Var, byte b) {
        this.m = b;
        this.n = v02Var;
    }

    @Override // androidx.lifecycle.Observer
    public final void a(Object obj) {
        byte b = this.m;
        v02 v02Var = this.n;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                pl2 pl2Var = (pl2) v02Var;
                Handler handler = pl2Var.F0;
                mt8 mt8Var = pl2Var.G0;
                handler.removeCallbacks(mt8Var);
                int iIntValue = num.intValue();
                if (pl2Var.K0 != null) {
                    int i = pl2Var.H0.H;
                    Context contextE = pl2Var.E();
                    Drawable drawable = null;
                    if (contextE == null) {
                        io.sentry.android.core.v0.j("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i2 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i == 0 && iIntValue == 1) {
                            drawable = contextE.getDrawable(i2);
                        } else {
                            if (i == 1 && iIntValue == 2) {
                                i2 = 2131230952;
                            } else if ((i == 2 && iIntValue == 1) || (i == 1 && iIntValue == 3)) {
                            }
                            drawable = contextE.getDrawable(i2);
                        }
                    }
                    if (drawable != null) {
                        pl2Var.K0.setImageDrawable(drawable);
                        if ((i != 0 || iIntValue != 1) && ((i == 1 && iIntValue == 2) || (i == 2 && iIntValue == 1))) {
                            nl2.a(drawable);
                        }
                        pl2Var.H0.H = iIntValue;
                    }
                }
                int iIntValue2 = num.intValue();
                TextView textView = pl2Var.L0;
                if (textView != null) {
                    textView.setTextColor(iIntValue2 == 2 ? pl2Var.I0 : pl2Var.J0);
                }
                handler.postDelayed(mt8Var, 2000L);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                pl2 pl2Var2 = (pl2) v02Var;
                Handler handler2 = pl2Var2.F0;
                mt8 mt8Var2 = pl2Var2.G0;
                handler2.removeCallbacks(mt8Var2);
                TextView textView2 = pl2Var2.L0;
                if (textView2 != null) {
                    textView2.setText(charSequence);
                }
                handler2.postDelayed(mt8Var2, 2000L);
                break;
            default:
                if (((LifecycleOwner) obj) != null && v02Var.w0) {
                    View viewS0 = v02Var.s0();
                    if (viewS0.getParent() != null) {
                        hk0.l("DialogFragment can not be attached to a container view");
                    } else if (v02Var.A0 != null) {
                        if (su2.M(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + v02Var.A0);
                        }
                        v02Var.A0.setContentView(viewS0);
                    }
                    break;
                }
                break;
        }
    }
}
