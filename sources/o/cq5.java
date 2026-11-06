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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/cq5;", "Lo/t90;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cq5 extends t90 {
    @Override // o.t90, o.ts, o.v02
    public final Dialog C0(Bundle bundle) {
        Dialog dialogC0 = super.C0(bundle);
        dialogC0.setOnShowListener(new bc0((byte) 2));
        return dialogC0;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_predefined_shortcuts_bottomsheet, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        ListView listView = (ListView) r47.s(viewInflate, R.id.predefined_shortcuts_list);
        if (listView == null) {
            yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.predefined_shortcuts_list)));
            return null;
        }
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        xt2 xt2VarP0 = p0();
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 15), (byte) 2);
        ve8 g0 = xt2VarP0.getG0();
        bf1 bf1VarK = h57.k(xt2VarP0);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(n16.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        n16 n16Var = (n16) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        xt2 xt2VarP1 = p0();
        RCClientActivity rCClientActivity = xt2VarP1 instanceof RCClientActivity ? (RCClientActivity) xt2VarP1 : null;
        if (rCClientActivity != null) {
            n16Var.p = rCClientActivity;
        }
        d7 d7Var = new d7(n16Var, L());
        listView.setAdapter((ListAdapter) d7Var);
        listView.setOnItemClickListener(new dc4(d7Var, this, (byte) 1));
        return linearLayout;
    }
}
