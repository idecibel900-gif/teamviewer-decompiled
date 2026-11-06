package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/x60;", "Lo/ut2;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x60 extends ut2 {
    public SwitchCompat p0;
    public RadioGroup q0;
    public ViewGroup r0;
    public Button s0;
    public y60 t0;

    public final void A0(boolean z) {
        y60 y60Var = this.t0;
        if (y60Var == null) {
            im3.e0("viewModel");
            throw null;
        }
        y60Var.p = z;
        Button button = this.s0;
        if (button == null) {
            im3.e0("confirmationButton");
            throw null;
        }
        button.setText(z ? R.string.tv_biometric_protection_done : R.string.tv_biometric_protection_skip);
        Button button2 = this.s0;
        if (z) {
            if (button2 == null) {
                im3.e0("confirmationButton");
                throw null;
            }
            button2.setBackground(r0().getDrawable(R.drawable.solid_button_border));
            Button button3 = this.s0;
            if (button3 == null) {
                im3.e0("confirmationButton");
                throw null;
            }
            button3.setTextColor(r0().getColor(android.R.color.white));
            ViewGroup viewGroup = this.r0;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            } else {
                im3.e0("enabledViewGroup");
                throw null;
            }
        }
        if (button2 == null) {
            im3.e0("confirmationButton");
            throw null;
        }
        button2.setBackground(r0().getDrawable(R.drawable.transparent_button_border));
        Button button4 = this.s0;
        if (button4 == null) {
            im3.e0("confirmationButton");
            throw null;
        }
        button4.setTextColor(r0().getColor(R.color.primaryDark));
        ViewGroup viewGroup2 = this.r0;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        } else {
            im3.e0("enabledViewGroup");
            throw null;
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Resources resources;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_biometric_protection_promotion, viewGroup, false);
        Context contextE = E();
        String[] stringArray = (contextE == null || (resources = contextE.getResources()) == null) ? null : resources.getStringArray(R.array.pref_lock_timeout_values);
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 11), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(y60.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        y60 y60Var = (y60) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.t0 = y60Var;
        boolean z = y60Var.n.getBoolean("lock_enabled", false);
        View viewFindViewById = viewInflate.findViewById(R.id.switch_button);
        viewFindViewById.getClass();
        this.p0 = (SwitchCompat) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.wait_time_radio_group);
        viewFindViewById2.getClass();
        this.q0 = (RadioGroup) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.protection_enabled_view_group);
        viewFindViewById3.getClass();
        this.r0 = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.skip_button);
        viewFindViewById4.getClass();
        Button button = (Button) viewFindViewById4;
        this.s0 = button;
        y60 y60Var2 = this.t0;
        if (y60Var2 == null) {
            im3.e0("viewModel");
            throw null;
        }
        button.setText(y60Var2.p ? R.string.tv_biometric_protection_done : R.string.tv_biometric_protection_skip);
        SwitchCompat switchCompat = this.p0;
        if (switchCompat == null) {
            im3.e0("switchButton");
            throw null;
        }
        switchCompat.setChecked(z);
        A0(z);
        SwitchCompat switchCompat2 = this.p0;
        if (switchCompat2 == null) {
            im3.e0("switchButton");
            throw null;
        }
        switchCompat2.setOnCheckedChangeListener(new w60(this, (byte) 0));
        Button button2 = this.s0;
        if (button2 != null) {
            button2.setOnClickListener(new y6(this, stringArray, (byte) 1));
            return viewInflate;
        }
        im3.e0("confirmationButton");
        throw null;
    }
}
