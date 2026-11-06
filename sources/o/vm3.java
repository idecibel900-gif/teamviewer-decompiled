package o;

import android.content.Intent;
import android.os.CountDownTimer;
import android.view.inputmethod.BaseInputConnection;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase_Impl;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.INearbyDeviceItem;
import com.teamviewer.remotecontrollib.swig.INearbyDeviceItemSWIGJNI;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModel;
import com.teamviewer.remotecontrollib.swig.INearbyDevicesViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.NearbyDeviceItemVector;
import com.teamviewer.remotecontrollib.swig.NearbyDevicesDyngateIds;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.LegalAgreementActivity;
import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;
import com.teamviewer.remotecontrolviewlib.activity.QRCodeAssignmentActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vm3 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ vm3(gt5 gt5Var, k6 k6Var) {
        this.m = (byte) 22;
        this.n = k6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        s01 s01Var;
        RCClientActivity rCClientActivity;
        Object next;
        vd5 vd5Var;
        List list;
        BigInteger bigInteger;
        byte b = this.m;
        boolean z = true;
        groupMemberListViewModel = null;
        GroupMemberListViewModel groupMemberListViewModel = null;
        f88 f88Var = f88.a;
        Object obj = this.n;
        switch (b) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = ((wm3) obj).a;
                if (workDatabase_Impl.j() && !workDatabase_Impl.m()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                h14 h14Var = (h14) obj;
                if (!((Boolean) h14Var.g.getValue()).booleanValue() && (s01Var = h14Var.c) != null) {
                    s01Var.l();
                }
                return f88Var;
            case 2:
                n22 n22Var = ((m34) obj).j;
                if (n22Var != null) {
                    yo1.H(n22Var);
                }
                return f88Var;
            case 3:
                return new BaseInputConnection(((k64) obj).a, false);
            case 4:
                LegalAgreementActivity legalAgreementActivity = (LegalAgreementActivity) obj;
                int i = LegalAgreementActivity.O;
                legalAgreementActivity.setResult(-1, new Intent());
                legalAgreementActivity.finish();
                return f88Var;
            case 5:
                am4 am4Var = (am4) ((a94) obj).a.n;
                if (!am4Var.n) {
                    if (am4Var.f337o) {
                        vp5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    am4Var.a();
                    am4Var.f337o = true;
                }
                return f88Var;
            case 6:
                Iterator it = ((if4) obj).p.iterator();
                while (it.hasNext()) {
                    try {
                        Function0 function0 = (Function0) ((WeakReference) it.next()).get();
                        if (function0 != null) {
                        }
                    } catch (Exception e) {
                        ye4.d("LoginAwareContainerViewModel", e);
                    }
                }
                return f88Var;
            case 7:
                ((tf4) obj).Q0();
                return f88Var;
            case 8:
                hs4 hs4Var = (hs4) obj;
                hs4Var.f = false;
                HashSet hashSet = new HashSet();
                zw4 zw4Var = hs4Var.d;
                if (zw4Var != null) {
                    Object[] objArr = zw4Var.a;
                    int i2 = zw4Var.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        LayoutNode layoutNode = (LayoutNode) objArr[i3];
                        zw4 zw4Var2 = hs4Var.e;
                        if (zw4Var2 == null) {
                            zw4Var2 = new zw4();
                            hs4Var.e = zw4Var2;
                        }
                        ax5 ax5Var = (ax5) zw4Var2.f(i3);
                        es4 es4Var = (es4) layoutNode.S.g;
                        if (es4Var.z) {
                            hs4.b(es4Var, ax5Var);
                        }
                    }
                    zw4Var.d();
                    zw4 zw4Var3 = hs4Var.e;
                    if (zw4Var3 != null) {
                        zw4Var3.d();
                    }
                }
                zw4 zw4Var4 = hs4Var.b;
                if (zw4Var4 != null) {
                    Object[] objArr2 = zw4Var4.a;
                    int i4 = zw4Var4.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        m20 m20Var = (m20) objArr2[i5];
                        zw4 zw4Var5 = hs4Var.c;
                        if (zw4Var5 == null) {
                            zw4Var5 = new zw4();
                            hs4Var.c = zw4Var5;
                        }
                        ax5 ax5Var2 = (ax5) zw4Var5.f(i5);
                        if (m20Var.z) {
                            hs4.b(m20Var, ax5Var2);
                        }
                    }
                    zw4Var4.d();
                    zw4 zw4Var6 = hs4Var.c;
                    if (zw4Var6 != null) {
                        zw4Var6.d();
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((m20) it2.next()).W0();
                }
                return f88Var;
            case ep1.b /* 9 */:
                ((vs4) obj).V0();
                return f88Var;
            case ep1.c /* 10 */:
                ft4 ft4Var = (ft4) obj;
                eh7 eh7Var = ft4Var.K;
                Boolean boolValueOf = eh7Var != null ? Boolean.valueOf(eh7Var.o()) : null;
                boolValueOf.getClass();
                ft4Var.y(boolValueOf.booleanValue());
                return f88Var;
            case 11:
                it4 it4Var = (it4) obj;
                nw4 nw4Var = it4Var.f1100o;
                IMonitoringOverviewViewModel iMonitoringOverviewViewModel = it4Var.n;
                nw4Var.setValue(Long.valueOf(IMonitoringOverviewViewModelSWIGJNI.IMonitoringOverviewViewModel_GetTotalNumberOfEndpoints(iMonitoringOverviewViewModel.a, iMonitoringOverviewViewModel)));
                it4Var.p.setValue(Long.valueOf(IMonitoringOverviewViewModelSWIGJNI.IMonitoringOverviewViewModel_GetNumberOfUsedEndpoints(iMonitoringOverviewViewModel.a, iMonitoringOverviewViewModel)));
                return f88Var;
            case ep1.d /* 12 */:
                ClientViewOpenGL clientViewOpenGL = ((bz4) obj).q;
                if (clientViewOpenGL != null) {
                    clientViewOpenGL.requestRender();
                }
                return f88Var;
            case 13:
                bu7.MAIN.a(new pc0(obj, (byte) 21));
                return f88Var;
            case 14:
                pz4 pz4Var = (pz4) obj;
                pz4Var.J.setValue(Boolean.FALSE);
                WeakReference weakReference = pz4Var.B;
                if (weakReference != null && (rCClientActivity = (RCClientActivity) weakReference.get()) != null) {
                    rCClientActivity.M();
                }
                return f88Var;
            case 15:
                o15 o15Var = (o15) obj;
                INearbyDeviceItem iNearbyDeviceItem = o15Var.a;
                o15Var.c = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetText(iNearbyDeviceItem.a, iNearbyDeviceItem);
                o15Var.d = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetAccountPictureURL(iNearbyDeviceItem.a, iNearbyDeviceItem);
                o15Var.f = new NearbyDevicesDyngateIds(INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetDyngateIds(iNearbyDeviceItem.a, iNearbyDeviceItem));
                o15Var.g = iNearbyDeviceItem.a();
                ArrayList arrayList = new ArrayList();
                nw4 nw4Var2 = o15Var.b;
                List list2 = (List) nw4Var2.getValue();
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((vd5) it3.next());
                    }
                }
                nw4Var2.setValue(arrayList);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                q15 q15Var = (q15) obj;
                INearbyDevicesViewModel iNearbyDevicesViewModel = q15Var.n;
                nw4 nw4Var3 = q15Var.u;
                nw4 nw4Var4 = q15Var.t;
                iNearbyDevicesViewModel.getClass();
                NearbyDeviceItemVector<INearbyDeviceItem> nearbyDeviceItemVector = new NearbyDeviceItemVector(INearbyDevicesViewModelSWIGJNI.INearbyDevicesViewModel_GetList(iNearbyDevicesViewModel.a, iNearbyDevicesViewModel));
                ArrayList arrayList2 = new ArrayList();
                for (INearbyDeviceItem iNearbyDeviceItem2 : nearbyDeviceItemVector) {
                    iNearbyDeviceItem2.getClass();
                    BigInteger bigIntegerINearbyDeviceItem_GetItemId = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetItemId(iNearbyDeviceItem2.a, iNearbyDeviceItem2);
                    BigInteger bigInteger2 = BigInteger.ZERO;
                    if (!im3.n(bigIntegerINearbyDeviceItem_GetItemId, bigInteger2)) {
                        if (im3.n(INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetParentId(iNearbyDeviceItem2.a, iNearbyDeviceItem2), bigInteger2)) {
                            arrayList2.add(new vd5(new o15(iNearbyDeviceItem2, nw4Var4), new ArrayList()));
                        } else {
                            BigInteger bigIntegerINearbyDeviceItem_GetParentId = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetParentId(iNearbyDeviceItem2.a, iNearbyDeviceItem2);
                            bigIntegerINearbyDeviceItem_GetParentId.getClass();
                            Iterator it4 = arrayList2.iterator();
                            do {
                                if (it4.hasNext()) {
                                    next = it4.next();
                                    bigInteger = ((o15) ((vd5) next).m).j;
                                    bigInteger.getClass();
                                } else {
                                    next = null;
                                }
                                vd5Var = (vd5) next;
                                if (vd5Var == null && (list = (List) vd5Var.n) != null) {
                                    list.add(new o15(iNearbyDeviceItem2, nw4Var4));
                                }
                            } while (!bigInteger.equals(bigIntegerINearbyDeviceItem_GetParentId));
                            vd5Var = (vd5) next;
                            if (vd5Var == null) {
                            }
                        }
                    }
                }
                nw4Var4.setValue(arrayList2);
                CountDownTimer countDownTimer = q15Var.s;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                if (im3.n(nw4Var3.getValue(), Boolean.TRUE)) {
                    nw4Var3.setValue(Boolean.FALSE);
                }
                return f88Var;
            case 17:
                return ((x15) obj).d;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return ((b25) obj).U0();
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return (e46) ((i46) obj).a.e.getValue();
            case 20:
                return new m75((o75) obj);
            case 21:
                int i6 = OnBoardingActivity.N;
                ((OnBoardingActivity) obj).finish();
                return f88Var;
            case 22:
                try {
                    ((k6) obj).Disconnect();
                    break;
                } catch (Throwable unused) {
                }
                return f88Var;
            case 23:
                fo5 fo5Var = (fo5) obj;
                hq6 hq6VarR = et1.r("kotlinx.serialization.Polymorphic", eo5.d, new fq6[0], new fj3((Object) fo5Var, (byte) 24));
                wt3 wt3Var = fo5Var.a;
                wt3Var.getClass();
                return new yb1(hq6VarR, wt3Var);
            case 24:
                return Boolean.valueOf(yo5.l((yo5) obj));
            case 25:
                int i7 = QRCodeAssignmentActivity.N;
                ((QRCodeAssignmentActivity) obj).finish();
                return f88Var;
            case 26:
                int i8 = RCClientActivity.c0;
                ((RCClientActivity) obj).V(null);
                return f88Var;
            case 27:
                return ((a2) ((wc3) ((fp1) ((ep3) obj).n).a)).f283o.c();
            case 28:
                LicenseViewModel licenseViewModelH = di1.h();
                licenseViewModelH.getClass();
                return new if4((ILoginStateAwareContainerViewModel) obj, licenseViewModelH);
            default:
                PListGroupID pListGroupID = (PListGroupID) obj;
                if (PListGroupIDSWIGJNI.PListGroupID_Valid(pListGroupID.a, pListGroupID)) {
                    long jPartnerlistViewModelLocator_GetGroupMemberListViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetGroupMemberListViewModel(PListGroupID.a(pListGroupID), pListGroupID);
                    if (jPartnerlistViewModelLocator_GetGroupMemberListViewModel != 0) {
                        groupMemberListViewModel = new GroupMemberListViewModel();
                        groupMemberListViewModel.b = true;
                        groupMemberListViewModel.a = jPartnerlistViewModelLocator_GetGroupMemberListViewModel;
                    }
                }
                return new bd0(groupMemberListViewModel, ds1.l(false));
        }
    }

    public /* synthetic */ vm3(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
