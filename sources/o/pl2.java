package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class pl2 extends v02 {
    public final Handler F0 = new Handler(Looper.getMainLooper());
    public final mt8 G0 = new mt8((Object) this, (byte) 10);
    public d70 H0;
    public int I0;
    public int J0;
    public ImageView K0;
    public TextView L0;

    @Override // o.v02
    public final Dialog C0(Bundle bundle) {
        nd ndVar = new nd(r0());
        jd jdVar = (jd) ndVar.f1562o;
        ae aeVar = this.H0.f592o;
        String strI = null;
        jdVar.d = aeVar != null ? (CharSequence) aeVar.c : null;
        View viewInflate = LayoutInflater.from(jdVar.a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            this.H0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            ae aeVar2 = this.H0.f592o;
            CharSequence charSequence = aeVar2 != null ? (CharSequence) aeVar2.d : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence);
            }
        }
        this.K0 = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.L0 = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (mo8.o(this.H0.V0())) {
            strI = I(R.string.confirm_device_credential_password);
        } else {
            d70 d70Var = this.H0;
            String str = d70Var.t;
            if (str != null) {
                strI = str;
            } else if (d70Var.f592o != null) {
                strI = "";
            }
        }
        c70 c70Var = new c70(this, (byte) 1);
        jdVar.i = strI;
        jdVar.j = c70Var;
        jdVar.r = viewInflate;
        od odVarE = ndVar.e();
        odVarE.setCanceledOnTouchOutside(false);
        return odVarE;
    }

    public final int F0(int i) {
        Context contextE = E();
        xt2 xt2VarC = C();
        if (contextE == null || xt2VarC == null) {
            io.sentry.android.core.v0.j("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextE.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = xt2VarC.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // o.v02, o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            ve8 ve8VarO = xt2VarC.getG0();
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
            this.H0 = d70Var;
            nw4 nw4Var = d70Var.I;
            if (nw4Var == null) {
                nw4Var = new nw4();
                d70Var.I = nw4Var;
            }
            nw4Var.observe(this, new ml2(this, (byte) 0));
            d70 d70Var2 = this.H0;
            nw4 nw4Var2 = d70Var2.J;
            if (nw4Var2 == null) {
                nw4Var2 = new nw4();
                d70Var2.J = nw4Var2;
            }
            nw4Var2.observe(this, new ml2(this, (byte) 1));
        }
        this.I0 = F0(ol2.a());
        this.J0 = F0(android.R.attr.textColorSecondary);
    }

    @Override // o.ut2
    public final void f0() {
        this.S = true;
        this.F0.removeCallbacksAndMessages(null);
    }

    @Override // o.ut2
    public final void g0() {
        this.S = true;
        d70 d70Var = this.H0;
        d70Var.H = 0;
        d70Var.W0(1);
        d70 d70Var2 = this.H0;
        String strI = I(R.string.fingerprint_dialog_touch_sensor);
        nw4 nw4Var = d70Var2.J;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var2.J = nw4Var;
        }
        d70.Y0(nw4Var, strI);
    }

    @Override // o.v02, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        d70 d70Var = this.H0;
        nw4 nw4Var = d70Var.G;
        if (nw4Var == null) {
            nw4Var = new nw4();
            d70Var.G = nw4Var;
        }
        d70.Y0(nw4Var, Boolean.TRUE);
    }
}
