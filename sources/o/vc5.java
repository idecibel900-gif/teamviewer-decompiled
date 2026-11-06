package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class vc5 extends d66 {
    public final w93 c;
    public final rd0 d;
    public int e;

    public vc5(w93 w93Var, rd0 rd0Var) {
        w93Var.getClass();
        this.c = w93Var;
        this.d = rd0Var;
    }

    @Override // o.d66
    public final int a() {
        ye4.a.b("PLManagerGroupMainAdapter", "getItemCount" + this.e);
        return this.e;
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        final String strPLManagerGroupsListV2ViewModel_GetGroupElement;
        String strPLManagerGroupsListV2ViewModel_GetGroupName;
        final xc5 xc5Var = (xc5) c76Var;
        ye4.a.b("PLManagerGroupMainAdapter", "onBindViewHolder" + i);
        ud0 ud0Var = (ud0) this.c;
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ud0Var.q;
        final String str = "";
        if (pLManagerGroupsListV2ViewModel == null || (strPLManagerGroupsListV2ViewModel_GetGroupElement = PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetGroupElement(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, i)) == null) {
            strPLManagerGroupsListV2ViewModel_GetGroupElement = "";
        }
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel2 = ud0Var.q;
        if (pLManagerGroupsListV2ViewModel2 != null && (strPLManagerGroupsListV2ViewModel_GetGroupName = PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetGroupName(pLManagerGroupsListV2ViewModel2.a, pLManagerGroupsListV2ViewModel2, strPLManagerGroupsListV2ViewModel_GetGroupElement)) != null) {
            str = strPLManagerGroupsListV2ViewModel_GetGroupName;
        }
        xc5Var.G.setOnClickListener(new View.OnClickListener() { // from class: o.wc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bb5 bb5Var;
                rd0 rd0Var = xc5Var.H;
                if (rd0Var == null || (bb5Var = rd0Var.a.r0) == null) {
                    return;
                }
                int i2 = ae0.F0;
                Bundle bundle = new Bundle();
                bundle.putString("groupId", strPLManagerGroupsListV2ViewModel_GetGroupElement);
                bundle.putString("groupName", str);
                ae0 ae0Var = new ae0();
                ae0Var.u0(bundle);
                bb5Var.I0(ae0Var, true);
            }
        });
        xc5Var.I.setText(str);
        xc5Var.J.setVisibility(8);
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistgroup, viewGroup, false);
        viewInflate.getClass();
        return new xc5(viewInflate, this.d);
    }
}
