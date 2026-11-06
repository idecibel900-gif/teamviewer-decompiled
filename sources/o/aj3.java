package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/aj3;", "Lo/t90;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class aj3 extends t90 {
    public sc3 F0;

    @Override // o.t90, o.ts, o.v02
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setOnShowListener(new bc0((byte) 1));
        return dialogC0;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        du6 du6VarT;
        sc3 sc3Var;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_inputmode_bottomsheet, viewGroup, false);
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        mo7 mo7Var = ((zt6) c36Var.f).f;
        if (mo7Var instanceof wc3) {
            dl5 dl5Var = new dl5(new r26(c36Var, mo7Var), (byte) 2);
            ve8 ve8VarO = getG0();
            bf1 bf1VarK = h57.k(this);
            pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(c26.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            }
            sc3Var = (sc3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
                hk0.l("No proper session");
                return null;
            }
            dl5 dl5Var2 = new dl5(new r26(mo7Var, c36Var, (byte) 7), (byte) 2);
            ve8 ve8VarO2 = getG0();
            bf1 bf1VarK2 = h57.k(this);
            pn5 pn5VarT2 = ua5.t(bf1VarK2, ve8VarO2, dl5Var2, bf1VarK2);
            wt3 wt3VarB2 = w86.a.b(uz4.class);
            String strC2 = wt3VarB2.c();
            if (strC2 == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            }
            sc3Var = (sc3) pn5VarT2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
        }
        this.F0 = sc3Var;
        xt2 xt2VarP0 = p0();
        RCClientActivity rCClientActivity = xt2VarP0 instanceof RCClientActivity ? (RCClientActivity) xt2VarP0 : null;
        if (rCClientActivity != null) {
            sc3 sc3Var2 = this.F0;
            if (sc3Var2 == null) {
                im3.e0("inputModeViewModel");
                throw null;
            }
            sc3Var2.O0(rCClientActivity);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.chip_group);
        viewFindViewById.getClass();
        ChipGroup chipGroup = (ChipGroup) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.mouse_chip);
        viewFindViewById2.getClass();
        Chip chip = (Chip) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.touch_chip);
        viewFindViewById3.getClass();
        Chip chip2 = (Chip) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.interaction_mode_header);
        viewFindViewById4.getClass();
        MaterialTextView materialTextView = (MaterialTextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.mode_description);
        viewFindViewById5.getClass();
        MaterialTextView materialTextView2 = (MaterialTextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.tip_4);
        viewFindViewById6.getClass();
        MaterialTextView materialTextView3 = (MaterialTextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.tip_5);
        viewFindViewById7.getClass();
        MaterialTextView materialTextView4 = (MaterialTextView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.tip_6);
        viewFindViewById8.getClass();
        MaterialTextView materialTextView5 = (MaterialTextView) viewFindViewById8;
        sc3 sc3Var3 = this.F0;
        if (sc3Var3 == null) {
            im3.e0("inputModeViewModel");
            throw null;
        }
        byte b = 13;
        sc3Var3.w0().observe(L(), new b7(new o43(chip, chip2, (byte) 4), b));
        sc3 sc3Var4 = this.F0;
        if (sc3Var4 == null) {
            im3.e0("inputModeViewModel");
            throw null;
        }
        sc3Var4.w0().observe(L(), new b7(new zi3(viewInflate, materialTextView, materialTextView2, this, materialTextView3, materialTextView4, materialTextView5), b));
        chipGroup.setOnCheckedChangeListener(new ar(this, (byte) 14));
        return viewInflate;
    }

    @Override // o.v02, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        sc3 sc3Var = this.F0;
        if (sc3Var == null) {
            im3.e0("inputModeViewModel");
            throw null;
        }
        sc3Var.m0();
        super.onDismiss(dialogInterface);
    }
}
