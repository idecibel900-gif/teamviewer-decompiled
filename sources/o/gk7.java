package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/gk7;", "Lo/v02;", "<init>", "()V", "CommonResourceLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class gk7 extends v02 {
    public int F0;
    public String G0;
    public int H0;
    public CharSequence I0;
    public boolean J0;
    public int K0;
    public String L0;
    public int M0;
    public String N0;
    public int O0;
    public String P0;
    public int Q0;
    public String R0;
    public int S0;
    public String T0;
    public int U0;
    public String V0;
    public int W0;
    public View X0;
    public x02 Z0;
    public int b1;
    public fk7 c1;
    public boolean d1;
    public boolean Y0 = true;
    public boolean a1 = true;

    public static void O0(gk7 gk7Var, xt2 xt2Var) {
        gk7Var.getClass();
        if (xt2Var == null) {
            ye4.c("TVDialogFragment", "show: activity is null");
        } else {
            xt2Var.runOnUiThread(new be3(xt2Var, gk7Var, (byte) 13));
        }
    }

    @Override // o.v02
    public final void A0() {
        Dialog dialog = this.A0;
        if (dialog != null ? dialog.isShowing() : false) {
            View view = this.X0;
            if (view == null) {
                view = this.U;
            }
            if (view == null) {
                ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
            } else {
                Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            B0(true, false);
        } else {
            this.d1 = true;
        }
        List list = ik7.b;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            io.sentry.h2.f();
            return;
        }
        list.clear();
        Iterator it2 = ik7.a.keySet().iterator();
        while (it2.hasNext()) {
            if (H0().equals(((r02) it2.next()).m)) {
                it2.remove();
            }
        }
    }

    @Override // o.v02
    public final Dialog C0(Bundle bundle) {
        CharSequence text;
        CharSequence text2;
        final gk7 gk7Var;
        Context contextR0 = r0();
        n02 n02Var = new n02(contextR0);
        n02Var.s = this.a1;
        if (this.F0 > 0) {
            text = H().getText(this.F0);
        } else {
            text = this.G0;
            if (text == null) {
                text = null;
            }
        }
        if (text != null) {
            n02Var.d = text;
        }
        if (this.H0 > 0) {
            text2 = H().getText(this.H0);
        } else {
            text2 = this.I0;
            if (text2 == null) {
                text2 = null;
            }
        }
        if (text2 != null) {
            boolean z = this.J0;
            n02Var.e = text2;
            n02Var.f = z;
        }
        View view = this.X0;
        if (view != null) {
            boolean z2 = this.Y0;
            n02Var.g = view;
            n02Var.h = 0;
            n02Var.i = z2;
        } else {
            int i = this.W0;
            if (i > 0) {
                boolean z3 = this.Y0;
                Integer numValueOf = Integer.valueOf(i);
                n02Var.h = numValueOf;
                n02Var.g = null;
                n02Var.i = z3;
                View viewInflate = View.inflate(contextR0, numValueOf.intValue(), null);
                n02Var.g = viewInflate;
                this.X0 = viewInflate;
            }
        }
        String strI0 = I0(this.S0, this.T0);
        byte b = 1;
        if (strI0 != null) {
            lh7 lh7Var = new lh7(this, p02.Neutral, b);
            n02Var.k = strI0;
            n02Var.l = lh7Var;
        }
        String strI1 = I0(this.O0, this.P0);
        if (strI1 != null) {
            if (this.b1 > 0) {
                String strF0 = F0(strI1);
                gk7Var = this;
                gk7Var.c1 = new fk7(gk7Var, n02Var, strI1, this.b1 * 1000);
                ye4.a("TVDialogFragment", "TimeoutTimer started with " + gk7Var.b1 + "s");
                strI1 = strF0;
            } else {
                gk7Var = this;
            }
            lh7 lh7Var2 = new lh7(gk7Var, p02.Negative, b);
            n02Var.n = strI1;
            n02Var.f1529o = lh7Var2;
        } else {
            gk7Var = this;
        }
        String strI2 = gk7Var.I0(gk7Var.K0, gk7Var.L0);
        if (strI2 != null) {
            lh7 lh7Var3 = new lh7(gk7Var, p02.Positive, b);
            n02Var.q = strI2;
            n02Var.r = lh7Var3;
        }
        String strI3 = gk7Var.I0(gk7Var.M0, gk7Var.N0);
        if (strI3 != null) {
            n02Var.p = strI3;
        }
        String strI4 = gk7Var.I0(gk7Var.Q0, gk7Var.R0);
        if (strI4 != null) {
            n02Var.m = strI4;
        }
        String strI5 = gk7Var.I0(gk7Var.U0, gk7Var.V0);
        if (strI5 != null) {
            n02Var.j = strI5;
        }
        boolean z4 = gk7Var.a1;
        gk7Var.v0 = z4;
        Dialog dialog = gk7Var.A0;
        if (dialog != null) {
            dialog.setCancelable(z4);
        }
        final od odVarA = n02Var.a();
        odVarA.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.ek7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.a.J0(odVarA);
            }
        });
        return odVarA;
    }

    public final String F0(String str) {
        return to7.k(str, " (", DateUtils.formatElapsedTime(this.b1), ")");
    }

    public final void G0(p02 p02Var) {
        Iterator it;
        p02Var.getClass();
        ConcurrentHashMap concurrentHashMap = ik7.a;
        List list = (List) ik7.a.get(new r02(this, p02Var));
        if (list == null || (it = list.iterator()) == null) {
            return;
        }
        while (it.hasNext()) {
            ((hk7) it.next()).a(this);
        }
    }

    public final x02 H0() {
        x02 x02Var = this.Z0;
        if (x02Var != null) {
            return x02Var;
        }
        im3.e0("dialogID");
        throw null;
    }

    public final String I0(int i, String str) {
        return i > 0 ? H().getString(i) : str;
    }

    public void J0(od odVar) {
        fk7 fk7Var;
        if (this.b1 <= 0 || (fk7Var = this.c1) == null) {
            return;
        }
        fk7Var.start();
    }

    public final void K0(View view) {
        this.X0 = view;
        this.W0 = 0;
    }

    public final void L0(String str) {
        this.H0 = 0;
        this.I0 = str;
        this.J0 = false;
    }

    public final void M0(String str) {
        this.F0 = 0;
        this.G0 = str;
    }

    public final void N0() {
        s7 s7Var = u7.g;
        my0 my0Var = vn4.g0().b;
        if (my0Var == null || !(my0Var instanceof xt2)) {
            ye4.c("TVDialogFragment", "show():can't show dialog. current activity is no FragmentActivity");
        } else {
            O0(this, (xt2) my0Var);
        }
    }

    @Override // o.v02, o.ut2
    public void X(Bundle bundle) {
        super.X(bundle);
        x02 x02Var = (x02) pm8.u(q0(), "dialogId", x02.class);
        x02Var.getClass();
        this.Z0 = x02Var;
        if (bundle != null) {
            this.F0 = bundle.getInt("TVDIALOG_HEADER_ID");
            this.G0 = bundle.getString("TVDIALOG_HEADER_STRING");
            this.H0 = bundle.getInt("TVDIALOG_MESSAGE_ID");
            this.I0 = bundle.getCharSequence("TVDIALOG_MESSAGE_CHAR_SEQUENCE");
            this.J0 = bundle.getBoolean("TVDIALOG_MESSAGE_CONTAINS_LINKS");
            this.W0 = bundle.getInt("TVDIALOG_CONTENT_ID");
            this.K0 = bundle.getInt("TVDIALOG_POS_BUTTON_ID");
            this.L0 = bundle.getString("TVDIALOG_POS_BUTTON_STRING");
            this.M0 = bundle.getInt("TVDIALOG_POS_BUTTON_CONTENT_DESCRIPTION_ID");
            this.N0 = bundle.getString("TVDIALOG_POS_BUTTON_CONTENT_DESCRIPTION_STRING");
            this.O0 = bundle.getInt("TVDIALOG_NEG_BUTTON_ID");
            this.P0 = bundle.getString("TVDIALOG_NEG_BUTTON_STRING");
            this.Q0 = bundle.getInt("TVDIALOG_NEG_BUTTON_CONTENT_DESCRIPTION_ID");
            this.R0 = bundle.getString("TVDIALOG_NEG_BUTTON_CONTENT_DESCRIPTION_STRING");
            this.S0 = bundle.getInt("TVDIALOG_NEUT_BUTTON_ID");
            this.T0 = bundle.getString("TVDIALOG_NEUT_BUTTON_STRING");
            this.U0 = bundle.getInt("TVDIALOG_NEUT_BUTTON_CONTENT_DESCRIPTION_ID");
            this.V0 = bundle.getString("TVDIALOG_NEUT_BUTTON_CONTENT_DESCRIPTION_STRING");
            this.Z0 = new x02(bundle.getInt("TVDIALOG_ID"), bundle.getInt("TVDIALOG_IDTYPE"));
            this.a1 = bundle.getBoolean("TVDIALOG_CANCELABLE");
            this.b1 = bundle.getInt("TVDIALOG_TIMEOUT");
        }
    }

    @Override // o.v02, o.ut2
    public void b0() {
        super.b0();
        fk7 fk7Var = this.c1;
        if (fk7Var != null) {
            fk7Var.cancel();
            this.c1 = null;
        }
    }

    @Override // o.ut2
    public void g0() {
        this.S = true;
        if (this.d1) {
            this.d1 = false;
            B0(true, false);
        }
    }

    @Override // o.v02, o.ut2
    public void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putInt("TVDIALOG_HEADER_ID", this.F0);
        bundle.putString("TVDIALOG_HEADER_STRING", this.G0);
        bundle.putInt("TVDIALOG_MESSAGE_ID", this.H0);
        bundle.putCharSequence("TVDIALOG_MESSAGE_CHAR_SEQUENCE", this.I0);
        bundle.putBoolean("TVDIALOG_MESSAGE_CONTAINS_LINKS", this.J0);
        bundle.putInt("TVDIALOG_CONTENT_ID", this.W0);
        bundle.putInt("TVDIALOG_POS_BUTTON_ID", this.K0);
        bundle.putString("TVDIALOG_POS_BUTTON_STRING", this.L0);
        bundle.putInt("TVDIALOG_NEG_BUTTON_ID", this.O0);
        bundle.putString("TVDIALOG_NEG_BUTTON_STRING", this.P0);
        bundle.putInt("TVDIALOG_NEUT_BUTTON_ID", this.S0);
        bundle.putString("TVDIALOG_NEUT_BUTTON_STRING", this.T0);
        bundle.putInt("TVDIALOG_ID", H0().m);
        bundle.putInt("TVDIALOG_IDTYPE", H0().n);
        bundle.putBoolean("TVDIALOG_CANCELABLE", this.a1);
        bundle.putInt("TVDIALOG_TIMEOUT", this.b1);
    }

    @Override // o.v02, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        A0();
    }
}
