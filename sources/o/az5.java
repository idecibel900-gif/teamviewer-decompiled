package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/az5;", "Lo/t90;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class az5 extends t90 {
    public xk1 F0;

    @Override // o.t90, o.ts, o.v02
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setOnShowListener(new bc0((byte) 3));
        return dialogC0;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_quickaction_bottomsheet, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        ListView listView = (ListView) r47.s(viewInflate, R.id.quick_action_list);
        if (listView != null) {
            this.F0 = new xk1(linearLayout, listView, (byte) 22);
            return linearLayout;
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.quick_action_list)));
        return null;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        du6 du6VarT;
        tc3 tc3Var;
        view.getClass();
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        xt2 xt2VarP0 = p0();
        mo7 mo7Var = ((zt6) c36Var.f).f;
        if (mo7Var instanceof wc3) {
            dl5 dl5Var = new dl5(new r26(mo7Var, c36Var, (byte) 4), (byte) 2);
            ve8 g0 = xt2VarP0.getG0();
            bf1 bf1VarK = h57.k(xt2VarP0);
            pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(j26.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            tc3Var = (tc3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
                hk0.l("No proper session");
                return;
            }
            dl5 dl5Var2 = new dl5(new v26(mo7Var, (byte) 2), (byte) 2);
            ve8 g1 = xt2VarP0.getG0();
            bf1 bf1VarK2 = h57.k(xt2VarP0);
            pn5 pn5VarT2 = ua5.t(bf1VarK2, g1, dl5Var2, bf1VarK2);
            wt3 wt3VarB2 = w86.a.b(xz4.class);
            String strC2 = wt3VarB2.c();
            if (strC2 == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            }
            tc3Var = (tc3) pn5VarT2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
        }
        xt2 xt2VarP1 = p0();
        RCClientActivity rCClientActivity = xt2VarP1 instanceof RCClientActivity ? (RCClientActivity) xt2VarP1 : null;
        if (rCClientActivity != null) {
            tc3Var.G0(rCClientActivity);
        }
        d7 d7Var = new d7(tc3Var, L());
        xk1 xk1Var = this.F0;
        if (xk1Var != null) {
            ListView listView = (ListView) xk1Var.n;
            listView.setAdapter((ListAdapter) d7Var);
            listView.setOnItemClickListener(new dc4(d7Var, this, (byte) 2));
        }
    }
}
