package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class t90 extends ts {
    @Override // o.v02
    public final void A0() {
        Dialog dialog = this.A0;
        if (dialog instanceof s90) {
            boolean z = ((s90) dialog).l().C;
        }
        B0(false, false);
    }

    @Override // o.ts, o.v02
    public Dialog C0(Bundle bundle) {
        Context contextE = E();
        int i = this.u0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = contextE.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        s90 s90Var = new s90(contextE, i);
        s90Var.w = true;
        s90Var.x = true;
        s90Var.B = new q90(s90Var);
        s90Var.i().i(1);
        s90Var.A = s90Var.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return s90Var;
    }
}
