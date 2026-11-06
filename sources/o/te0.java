package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class te0 extends d66 {
    public final aa3 c;
    public final ze0 d;
    public final PListNavigationStatisticsViewModel e;
    public final xt2 f;
    public final bi7 g;
    public final xc0 h;

    public te0(aa3 aa3Var, yi5 yi5Var, ue0 ue0Var, Bundle bundle, PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel, xt2 xt2Var) {
        ue0Var.getClass();
        this.c = aa3Var;
        this.d = ue0Var;
        this.e = pListNavigationStatisticsViewModel;
        this.f = xt2Var;
        this.g = new bi7(bundle, (byte) 1);
        this.h = new xc0(this, (byte) 5);
    }

    @Override // o.d66
    public final int a() {
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = ((we0) this.c).n;
        return IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_GetSize(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel);
    }

    @Override // o.d66
    public final int c(int i) {
        we0 we0Var = (we0) this.c;
        if (we0Var.V0(i) != null) {
            return 0;
        }
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = we0Var.n;
        String strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition = IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel, i);
        return (strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition == null || strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition.length() == 0) ? 2 : 1;
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        s33 s33Var;
        fl6 fl6Var = (fl6) c76Var;
        we0 we0Var = (we0) this.c;
        z93 z93VarV0 = we0Var.V0(i);
        bi7 bi7Var = this.g;
        xt2 xt2Var = this.f;
        if (z93VarV0 != null) {
            int iOrdinal = z93VarV0.b.ordinal();
            if (iOrdinal == 0) {
                s33Var = s33.Contact;
            } else if (iOrdinal == 1) {
                s33Var = s33.Computer;
            } else {
                if (iOrdinal != 2) {
                    gk0.s();
                    return;
                }
                s33Var = s33.ServiceCase;
            }
            GroupMemberId groupMemberId = new GroupMemberId(s33Var, z93VarV0.a);
            au2 au2Var = vt1.c;
            g1 g1VarH = au2Var != null ? au2Var.h(xt2Var, groupMemberId) : null;
            if (g1VarH != null) {
                fl6Var.r(g1VarH, groupMemberId, bi7Var.a);
            }
        }
        IGroupMemberListSearchViewModel iGroupMemberListSearchViewModel = we0Var.n;
        String strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition = IGroupMemberListSearchViewModelSWIGJNI.IGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition(iGroupMemberListSearchViewModel.a, iGroupMemberListSearchViewModel, i);
        if (strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition == null || strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition.length() == 0) {
            return;
        }
        ManagedDevicesV2MemberId managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, strIGroupMemberListSearchViewModel_GetItemManagedDeviceIdAtPosition);
        au2 au2Var2 = vt1.c;
        qb3 qb3VarI = au2Var2 != null ? au2Var2.i(xt2Var, managedDevicesV2MemberId) : null;
        if (qb3VarI != null) {
            fl6Var.s(qb3VarI, managedDevicesV2MemberId, bi7Var.a, "00000000-0000-0000-0000-000000000000");
        }
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        Object next;
        se0.n.getClass();
        Iterator it = se0.r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((se0) next).m != i);
        se0 se0Var = (se0) next;
        if (se0Var == null) {
            se0Var = se0.UNKNOWN;
        }
        se0 se0Var2 = se0.MDV2_ITEM;
        xc0 xc0Var = this.h;
        ze0 ze0Var = this.d;
        if (se0Var == se0Var2) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner, viewGroup, false);
            viewInflate.getClass();
            return new xk4(viewInflate, xc0Var, ze0Var);
        }
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner, viewGroup, false);
        viewInflate2.getClass();
        return new qe0(viewInflate2, xc0Var, ze0Var);
    }
}
