package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupUIModelHelperDefinitionsSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IndexPath;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDeviceIndexPath;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ManagedDevicesV2MemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class tc0 extends d66 {
    public final /* synthetic */ byte c = 0;
    public final ze0 d;
    public final PListNavigationStatisticsViewModel e;
    public final xt2 f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final ge0 l;

    public tc0(x93 x93Var, ir irVar, nx3 nx3Var, Bundle bundle, PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel, xt2 xt2Var) {
        nx3Var.getClass();
        this.i = x93Var;
        this.j = irVar;
        this.d = nx3Var;
        this.e = pListNavigationStatisticsViewModel;
        this.f = xt2Var;
        this.k = new bi7(bundle, (byte) 2);
        int i = 0;
        this.g = (x93Var == null || ((zd0) x93Var).V0() <= 0) ? 0 : 1;
        if (x93Var != null) {
            PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = ((zd0) x93Var).n;
            i = (pLManagerDevicesV2ViewModel != null ? (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel) : 0) <= 0 ? 0 : 1;
        }
        this.h = i;
        this.l = new nx3(this, (byte) 16);
    }

    @Override // o.d66
    public final int a() {
        byte b = this.c;
        Object obj = this.i;
        switch (b) {
            case 0:
                u93 u93Var = (u93) obj;
                return ((((bd0) u93Var).V0(2) + 1) * this.h) + ((((bd0) u93Var).V0(1) + 1) * this.g);
            default:
                x93 x93Var = (x93) obj;
                if (x93Var == null) {
                    return 0;
                }
                zd0 zd0Var = (zd0) x93Var;
                int iV0 = (zd0Var.V0() + 1) * this.g;
                PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = zd0Var.n;
                return (((pLManagerDevicesV2ViewModel != null ? (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel) : 0) + 1) * this.h) + iV0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r8 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r8 != 0) goto L33;
     */
    @Override // o.d66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r13) {
        /*
            r12 = this;
            byte r0 = r12.c
            r1 = 3
            java.lang.Object r2 = r12.i
            r3 = 1
            r4 = 0
            r5 = 4
            r6 = 2
            switch(r0) {
                case 0: goto L51;
                default: goto Lc;
            }
        Lc:
            o.x93 r2 = (o.x93) r2
            if (r2 != 0) goto L12
        L10:
            r1 = r4
            goto L50
        L12:
            int r0 = r12.g
            o.zd0 r2 = (o.zd0) r2
            int r7 = r2.V0()
            int r7 = r7 - r3
            int r8 = r12.g
            int r7 = r7 * r8
            int r7 = r7 + r0
            int r9 = r12.h
            int r9 = r9 + r7
            int r9 = r9 + r8
            com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel r2 = r2.n
            if (r2 == 0) goto L2f
            long r10 = r2.a
            long r10 = com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(r10, r2)
            int r2 = (int) r10
            goto L30
        L2f:
            r2 = r4
        L30:
            int r2 = r2 - r3
            int r8 = r12.h
            int r2 = r2 * r8
            int r2 = r2 + r9
            if (r13 != 0) goto L41
            int r12 = r12.g
            if (r12 != 0) goto L10
            if (r8 != 0) goto L3f
        L3d:
            r1 = r5
            goto L50
        L3f:
            r1 = r6
            goto L50
        L41:
            if (r0 > r13) goto L47
            if (r13 > r7) goto L47
            r1 = r3
            goto L50
        L47:
            int r12 = r9 + (-1)
            if (r13 != r12) goto L4c
            goto L3f
        L4c:
            if (r9 > r13) goto L3d
            if (r13 > r2) goto L3d
        L50:
            return r1
        L51:
            int r0 = r12.g
            o.u93 r2 = (o.u93) r2
            o.bd0 r2 = (o.bd0) r2
            int r7 = r2.V0(r3)
            int r7 = r7 - r3
            int r8 = r12.g
            int r7 = r7 * r8
            int r7 = r7 + r0
            int r9 = r12.h
            int r9 = r9 + r7
            int r9 = r9 + r8
            int r2 = r2.V0(r6)
            int r2 = r2 - r3
            int r8 = r12.h
            int r2 = r2 * r8
            int r2 = r2 + r9
            if (r13 != 0) goto L7b
            int r12 = r12.g
            if (r12 == 0) goto L75
            r1 = r4
            goto L8a
        L75:
            if (r8 == 0) goto L79
        L77:
            r1 = r6
            goto L8a
        L79:
            r1 = r5
            goto L8a
        L7b:
            if (r0 > r13) goto L81
            if (r13 > r7) goto L81
            r1 = r3
            goto L8a
        L81:
            int r12 = r9 + (-1)
            if (r13 != r12) goto L86
            goto L77
        L86:
            if (r9 > r13) goto L79
            if (r13 > r2) goto L79
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tc0.c(int):int");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177  */
    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        GroupMemberId groupMemberId;
        int iV0;
        int i2;
        au2 au2Var;
        qb3 qb3VarI;
        ManagedDevicesV2MemberId managedDevicesV2MemberId;
        ManagedDevicesV2MemberId managedDevicesV2MemberId2;
        int i3;
        int i4 = i;
        byte b = this.c;
        Object obj = this.k;
        xt2 xt2Var = this.f;
        g1 g1VarH = null;
        g1VarH = null;
        Object obj2 = this.i;
        int iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize = 0;
        int i5 = 2;
        switch (b) {
            case 0:
                w wVar = (w) c76Var;
                u93 u93Var = (u93) obj2;
                int iC = c(i4);
                if (iC == 0 || 2 == iC) {
                    groupMemberId = null;
                } else {
                    bd0 bd0Var = (bd0) u93Var;
                    int iV1 = bd0Var.V0(1);
                    int i6 = (1 > i4 || i4 > iV1) ? ((i4 - iV1) - this.g) - this.h : i4 - this.g;
                    int iC2 = c(i4);
                    sc0.n.getClass();
                    int iOrdinal = ir.m(iC2).ordinal();
                    if (iOrdinal == 1) {
                        iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize = 1;
                    } else if (iOrdinal != 3) {
                        ye4.c("BuddyLPartnersAdapter", "unexpected selection type");
                    } else {
                        iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize = 2;
                    }
                    if (iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize == 1) {
                        iV0 = ((bd0) u93Var).V0(1) + 1;
                        i2 = this.g;
                    } else {
                        iV0 = ((bd0) u93Var).V0(2) + 1;
                        i2 = this.h;
                    }
                    if (i6 >= iV0 * i2) {
                        ye4.c("BuddyLPartnersAdapter", "index out of bounds");
                    } else {
                        long j = i6;
                        GroupMemberListViewModel groupMemberListViewModel = bd0Var.n;
                        if (groupMemberListViewModel != null) {
                            long jNew_IndexPath = GroupUIModelHelperDefinitionsSWIGJNI.new_IndexPath();
                            IndexPath indexPath = new IndexPath();
                            indexPath.b = true;
                            indexPath.a = jNew_IndexPath;
                            GroupUIModelHelperDefinitionsSWIGJNI.IndexPath_row_set(jNew_IndexPath, indexPath, j);
                            GroupUIModelHelperDefinitionsSWIGJNI.IndexPath_section_set(indexPath.a, indexPath, e41.d(iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize) ? 1 : 0);
                            long jGroupMemberListViewModel_GetElement = GroupMemberListViewModelSWIGJNI.GroupMemberListViewModel_GetElement(groupMemberListViewModel.a, groupMemberListViewModel, indexPath.a, indexPath);
                            if (jGroupMemberListViewModel_GetElement != 0) {
                                groupMemberId = new GroupMemberId(jGroupMemberListViewModel_GetElement);
                            }
                        }
                        au2Var = vt1.c;
                        if (au2Var != null) {
                            g1VarH = au2Var.h(xt2Var, groupMemberId);
                        }
                    }
                    groupMemberId = null;
                    au2Var = vt1.c;
                    if (au2Var != null) {
                        g1VarH = au2Var.h(xt2Var, groupMemberId);
                    }
                }
                wVar.r(g1VarH, groupMemberId, ((bi7) obj).a);
                break;
            default:
                q1 q1Var = (q1) c76Var;
                x93 x93Var = (x93) obj2;
                int iC3 = c(i4);
                if (iC3 == 0 || 2 == iC3) {
                    qb3VarI = null;
                    managedDevicesV2MemberId = null;
                } else {
                    int iC4 = c(i4);
                    fl4.n.getClass();
                    int iOrdinal2 = ju.u(iC4).ordinal();
                    if (iOrdinal2 == 1) {
                        i5 = 1;
                    } else if (iOrdinal2 != 3) {
                        i5 = 0;
                    }
                    if (i5 == 0) {
                        managedDevicesV2MemberId2 = null;
                    } else {
                        int iV2 = x93Var != null ? ((zd0) x93Var).V0() : 0;
                        if (1 > i4 || i4 > iV2) {
                            i4 = (i4 - iV2) - this.g;
                            i3 = this.h;
                        } else {
                            i3 = this.g;
                        }
                        int i7 = i4 - i3;
                        if (x93Var != null) {
                            if (i5 == 1) {
                                iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize = (((zd0) x93Var).V0() + 1) * this.g;
                            } else {
                                PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = ((zd0) x93Var).n;
                                iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize = ((pLManagerDevicesV2ViewModel != null ? (int) PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetOfflineDevicesSize(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel) : 0) + 1) * this.h;
                            }
                        }
                        if (i7 >= iPLManagerDevicesV2ViewModel_GetOfflineDevicesSize) {
                            managedDevicesV2MemberId2 = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                        } else if (x93Var != null) {
                            ManagedDeviceIndexPath managedDeviceIndexPath = new ManagedDeviceIndexPath(i5, i7);
                            PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel2 = ((zd0) x93Var).n;
                            if (pLManagerDevicesV2ViewModel2 != null) {
                                long jPLManagerDevicesV2ViewModel_GetElement = PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_GetElement(pLManagerDevicesV2ViewModel2.a, pLManagerDevicesV2ViewModel2, managedDeviceIndexPath.a, managedDeviceIndexPath);
                                managedDevicesV2MemberId2 = jPLManagerDevicesV2ViewModel_GetElement == 0 ? null : new ManagedDevicesV2MemberId(jPLManagerDevicesV2ViewModel_GetElement);
                                if (managedDevicesV2MemberId2 == null) {
                                    managedDevicesV2MemberId2 = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                                }
                            } else {
                                managedDevicesV2MemberId2 = new ManagedDevicesV2MemberId(yl4.ManagedDeviceV2, "");
                            }
                        } else {
                            managedDevicesV2MemberId2 = null;
                        }
                    }
                    au2 au2Var2 = vt1.c;
                    managedDevicesV2MemberId = managedDevicesV2MemberId2;
                    qb3VarI = au2Var2 != null ? au2Var2.i(xt2Var, managedDevicesV2MemberId2) : null;
                }
                q1Var.s(qb3VarI, managedDevicesV2MemberId, ((bi7) obj).a, "00000000-0000-0000-0000-000000000000");
                break;
        }
    }

    @Override // o.d66
    public final c76 f(ViewGroup viewGroup, int i) {
        byte b = this.c;
        ze0 ze0Var = this.d;
        ge0 ge0Var = this.l;
        Object obj = this.j;
        switch (b) {
            case 0:
                df6 df6Var = (df6) ge0Var;
                sc0.n.getClass();
                sc0 sc0VarM = ir.m(i);
                ((ju) obj).getClass();
                df6Var.getClass();
                ze0Var.getClass();
                int iOrdinal = sc0VarM.ordinal();
                if (iOrdinal == 0) {
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner_online_header, viewGroup, false);
                    viewInflate.getClass();
                    return new me0(viewInflate);
                }
                if (iOrdinal != 2) {
                    View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner, viewGroup, false);
                    viewInflate2.getClass();
                    return new qe0(viewInflate2, df6Var, ze0Var);
                }
                View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner_offline_header, viewGroup, false);
                viewInflate3.getClass();
                return new me0(viewInflate3);
            default:
                fl4.n.getClass();
                fl4 fl4VarU = ju.u(i);
                ((ir) obj).getClass();
                return ir.g(viewGroup, (nx3) ge0Var, ze0Var, fl4VarU);
        }
    }

    public int h(int i) {
        return ((bd0) ((u93) this.i)).V0(i) > 0 ? 1 : 0;
    }

    public tc0(u93 u93Var, ju juVar, xc0 xc0Var, Bundle bundle, PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel, xt2 xt2Var) {
        u93Var.getClass();
        xc0Var.getClass();
        this.i = u93Var;
        this.j = juVar;
        this.d = xc0Var;
        this.e = pListNavigationStatisticsViewModel;
        this.f = xt2Var;
        this.k = new bi7(bundle, (byte) 1);
        this.g = h(1);
        this.h = h(2);
        this.l = new df6(this, (byte) 29);
    }
}
