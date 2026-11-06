package o;

import android.os.Bundle;
import android.view.ViewGroup;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceIndexPath;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerGroupsListV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends d66 {
    public final ce0 c;
    public final String d;
    public final ir e;
    public final ze0 f;
    public final PListNavigationStatisticsViewModel g;
    public final ae0 h;
    public final bi7 i;
    public int j;
    public int k;
    public final xc0 l;

    public yd0(ce0 ce0Var, String str, ir irVar, xc0 xc0Var, Bundle bundle, PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel, ae0 ae0Var) {
        xc0Var.getClass();
        this.c = ce0Var;
        this.d = str;
        this.e = irVar;
        this.f = xc0Var;
        this.g = pListNavigationStatisticsViewModel;
        this.h = ae0Var;
        this.i = new bi7(bundle, (byte) 2);
        this.j = ce0Var.V0(str) > 0 ? 1 : 0;
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ce0Var.n;
        this.k = (pLManagerGroupsListV2ViewModel != null ? (int) PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetOfflineDevicesCount(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, str) : 0) > 0 ? 1 : 0;
        this.l = new xc0(this, (byte) 1);
    }

    @Override // o.d66
    public final int a() {
        ce0 ce0Var = this.c;
        if (ce0Var == null) {
            return 0;
        }
        String str = this.d;
        int iV0 = (ce0Var.V0(str) + 1) * this.j;
        str.getClass();
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ce0Var.n;
        return (((pLManagerGroupsListV2ViewModel != null ? (int) PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetOfflineDevicesCount(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, str) : 0) + 1) * this.k) + iV0;
    }

    @Override // o.d66
    public final int c(int i) {
        ce0 ce0Var = this.c;
        if (ce0Var == null) {
            return 0;
        }
        int i2 = this.j;
        String str = this.d;
        int iV0 = ce0Var.V0(str) - 1;
        int i3 = this.j;
        int i4 = (iV0 * i3) + i2;
        int i5 = this.k + i4 + i3;
        PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ce0Var.n;
        int iPLManagerGroupsListV2ViewModel_GetOfflineDevicesCount = pLManagerGroupsListV2ViewModel != null ? (int) PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetOfflineDevicesCount(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, str) : 0;
        int i6 = this.k;
        int i7 = ((iPLManagerGroupsListV2ViewModel_GetOfflineDevicesCount - 1) * i6) + i5;
        if (i == 0) {
            if (this.j == 0) {
                return i6 == 0 ? 4 : 2;
            }
            return 0;
        }
        if (i2 <= i && i <= i4) {
            return 1;
        }
        if (i == i5 - 1) {
            return 2;
        }
        return (i5 > i || i > i7) ? 4 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.qb3] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.fl6, o.q1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId] */
    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        ?? I;
        ManagedDevicesV2MemberId managedDevicesV2MemberId;
        int i2;
        int iPLManagerGroupsListV2ViewModel_GetOfflineDevicesCount;
        int i3;
        int i4 = i;
        ?? r2 = (q1) c76Var;
        int iC = c(i4);
        ye4 ye4Var = ye4.a;
        Object obj = null;
        if (iC != 0) {
            int i5 = 2;
            if (2 == iC) {
                I = 0;
            } else {
                int iC2 = c(i4);
                fl4.n.getClass();
                int iOrdinal = ju.u(iC2).ordinal();
                int i6 = 0;
                if (iOrdinal == 1) {
                    i5 = 1;
                } else if (iOrdinal != 3) {
                    i5 = 0;
                }
                if (i5 != 0) {
                    String str = this.d;
                    ce0 ce0Var = this.c;
                    int iV0 = ce0Var != null ? ce0Var.V0(str) : 0;
                    ye4Var.b("BuddyListManagedGroupAdapter", "subtractPosition");
                    if (1 > i4 || i4 > iV0) {
                        i4 = (i4 - iV0) - this.j;
                        i2 = this.k;
                    } else {
                        i2 = this.j;
                    }
                    int i7 = i4 - i2;
                    if (ce0Var != null) {
                        if (i5 == 1) {
                            iPLManagerGroupsListV2ViewModel_GetOfflineDevicesCount = ce0Var.V0(str) + 1;
                            i3 = this.j;
                        } else {
                            str.getClass();
                            PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel = ce0Var.n;
                            iPLManagerGroupsListV2ViewModel_GetOfflineDevicesCount = (pLManagerGroupsListV2ViewModel != null ? (int) PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetOfflineDevicesCount(pLManagerGroupsListV2ViewModel.a, pLManagerGroupsListV2ViewModel, str) : 0) + 1;
                            i3 = this.k;
                        }
                        i6 = iPLManagerGroupsListV2ViewModel_GetOfflineDevicesCount * i3;
                    }
                    if (i7 < i6) {
                        ye4Var.b("BuddyListManagedGroupAdapter", "getGroupMemberId " + i7);
                        if (i7 < 0) {
                            managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                        } else if (ce0Var != null) {
                            ManagedDeviceIndexPath managedDeviceIndexPath = new ManagedDeviceIndexPath(i5, i7);
                            str.getClass();
                            PLManagerGroupsListV2ViewModel pLManagerGroupsListV2ViewModel2 = ce0Var.n;
                            if (pLManagerGroupsListV2ViewModel2 != null) {
                                long jPLManagerGroupsListV2ViewModel_GetGroupMemberElement = PLManagerGroupsListV2ViewModelSWIGJNI.PLManagerGroupsListV2ViewModel_GetGroupMemberElement(pLManagerGroupsListV2ViewModel2.a, pLManagerGroupsListV2ViewModel2, str, managedDeviceIndexPath.a, managedDeviceIndexPath);
                                managedDevicesV2MemberId = jPLManagerGroupsListV2ViewModel_GetGroupMemberElement == 0 ? null : new ManagedDevicesV2MemberId(jPLManagerGroupsListV2ViewModel_GetGroupMemberElement);
                                if (managedDevicesV2MemberId == null) {
                                    managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                                }
                            } else {
                                managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                            }
                        } else {
                            managedDevicesV2MemberId = null;
                        }
                    } else {
                        managedDevicesV2MemberId = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                    }
                } else {
                    managedDevicesV2MemberId = null;
                }
                au2 au2Var = vt1.c;
                obj = managedDevicesV2MemberId;
                I = au2Var != null ? au2Var.i(this.h, managedDevicesV2MemberId) : null;
            }
        } else {
            I = 0;
        }
        ye4Var.b("BuddyListManagedGroupAdapter", "onBindViewHolder");
        r2.s(I, obj, this.i.a, this.d);
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        fl4.n.getClass();
        fl4 fl4VarU = ju.u(i);
        this.e.getClass();
        return ir.g(viewGroup, this.l, this.f, fl4VarU);
    }
}
