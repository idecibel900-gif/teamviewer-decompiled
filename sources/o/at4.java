package o;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperVector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at4 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ at4(byte b) {
        this.m = b;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x029c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        Object sc6Var;
        byte b = this.m;
        byte b2 = 2;
        fe5 ee5Var = null;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ComputerDetailsViewModel computerDetailsViewModel = (ComputerDetailsViewModel) obj;
                computerDetailsViewModel.getClass();
                if (!ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_AreAllAlertsUnAcknowledged(computerDetailsViewModel.a, computerDetailsViewModel)) {
                    IAlertViewModelWrapperVector iAlertViewModelWrapperVectorA = computerDetailsViewModel.a();
                    z = ComputerDetailsViewModelSWIGJNI.IAlertViewModelWrapperVector_isEmpty(iAlertViewModelWrapperVectorA.m, iAlertViewModelWrapperVectorA) ? false : true;
                }
                return Boolean.valueOf(z);
            case 1:
                String str = (String) obj;
                int i = ht4.u0;
                str.getClass();
                ye4.c("Monitoring Overview", "error rechecking alerts: ".concat(str));
                return f88Var;
            case 2:
                fn4 fn4Var = (fn4) obj;
                int i2 = ht4.u0;
                fn4Var.getClass();
                return fn4Var.b();
            case 3:
                cf5 cf5Var = (cf5) obj;
                return fx3.d(cf5Var.b, cf5Var.c, "[", ", ", ")");
            case 4:
                yz4 yz4Var = (yz4) obj;
                yz4Var.getClass();
                return Integer.valueOf(-yz4Var.b);
            case 5:
                yz4 yz4Var2 = (yz4) obj;
                yz4Var2.getClass();
                return Integer.valueOf(-yz4Var2.c);
            case 6:
                vm3 vm3Var = ((r35) obj).a;
                if (vm3Var != null) {
                    vm3Var.a();
                }
                return f88Var;
            case 7:
                e45 e45Var = (e45) obj;
                LayoutNode layoutNode = e45Var.G;
                try {
                    if (e45Var.s()) {
                        e45Var.B1(true);
                        break;
                    }
                    return f88Var;
                } catch (Throwable th) {
                    layoutNode.x0(th);
                    throw null;
                }
            case 8:
                nc5 nc5Var = ((e45) obj).h0;
                if (nc5Var != null) {
                    ((o03) nc5Var).c();
                }
                return f88Var;
            case ep1.b /* 9 */:
                ((Long) obj).getClass();
                return f88Var;
            case ep1.c /* 10 */:
                String str2 = (String) obj;
                str2.getClass();
                try {
                    return Integer.valueOf(Integer.parseInt(str2));
                } catch (NumberFormatException unused) {
                    return null;
                }
            case 11:
                p65 p65Var = (p65) obj;
                if (p65Var.s()) {
                    p65Var.m.n0();
                }
                return f88Var;
            case ep1.d /* 12 */:
                String str3 = (String) obj;
                str3.getClass();
                if (str3.length() > 0) {
                    try {
                        vp3 vp3Var = (vp3) q85.f.getValue();
                        vp3Var.getClass();
                        bf0 bf0Var = new bf0();
                        bf0Var.Z0(str3);
                        nr3 nr3Var = new nr3(bf0Var);
                        sc6Var = vp3Var.a(nr3Var);
                        if (!(vp3Var instanceof tp3) && nr3Var.c0() != 10) {
                            throw new gq3("JSON document was not fully consumed.");
                        }
                    } catch (Throwable th2) {
                        sc6Var = new sc6(th2);
                    }
                    if (!(sc6Var instanceof sc6) && sc6Var != null) {
                        q85.e.r(sc6Var);
                    }
                    Throwable thA = tc6.a(sc6Var);
                    if (thA != null) {
                        e41.s("Failed to parse event: ", thA.getMessage(), "OneAPIEventProvider");
                    }
                }
                return f88Var;
            case 13:
                u01 u01Var = (u01) obj;
                int i3 = kj.a;
                Context context = (Context) u01Var.T(lh.b);
                in1 in1Var = (in1) u01Var.T(b11.h);
                ic5 ic5Var = (ic5) u01Var.T(jc5.a);
                if (ic5Var == null) {
                    return null;
                }
                return new mi(context, in1Var, ic5Var.a, ic5Var.b);
            case 14:
                LayoutNode layoutNode2 = (LayoutNode) obj;
                if (layoutNode2.W()) {
                    LayoutNode.s0(layoutNode2, false, 7);
                }
                return f88Var;
            case 15:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                if (layoutNode3.W()) {
                    LayoutNode.u0(layoutNode3, false, 7);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                LayoutNode layoutNode4 = (LayoutNode) obj;
                if (layoutNode4.W()) {
                    layoutNode4.U();
                }
                return f88Var;
            case 17:
                LayoutNode layoutNode5 = (LayoutNode) obj;
                if (layoutNode5.W()) {
                    layoutNode5.t0(false);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                LayoutNode layoutNode6 = (LayoutNode) obj;
                if (layoutNode6.W()) {
                    layoutNode6.t0(false);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                LayoutNode layoutNode7 = (LayoutNode) obj;
                if (layoutNode7.W()) {
                    layoutNode7.r0(false);
                }
                return f88Var;
            case 20:
                LayoutNode layoutNode8 = (LayoutNode) obj;
                if (layoutNode8.W()) {
                    layoutNode8.r0(false);
                }
                return f88Var;
            case 21:
                obj.getClass();
                return Boolean.valueOf(!((oc5) obj).s());
            case 22:
                throw ua5.i(obj);
            case 23:
                throw ua5.i(obj);
            case 24:
                throw ua5.i(obj);
            case 25:
                throw ua5.i(obj);
            case 26:
                Float f = (Float) obj;
                f.floatValue();
                return f;
            case 27:
                List list = (List) obj;
                Object obj2 = list.get(3);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                if (iIntValue == 1) {
                    Object obj3 = list.get(4);
                    obj3.getClass();
                    ee5Var = new ee5(((Float) obj3).floatValue());
                } else if (iIntValue == 2) {
                    Object obj4 = list.get(4);
                    obj4.getClass();
                    float fFloatValue = ((Float) obj4).floatValue();
                    if (w32.a(fFloatValue, 0.0f) < 0) {
                        hk0.g("Offset must larger than or equal to 0 dp.");
                        return null;
                    }
                    ee5Var = new de5(fFloatValue, 2, (byte) 1);
                } else if (iIntValue == 3) {
                    Object obj5 = list.get(4);
                    obj5.getClass();
                    float fFloatValue2 = ((Float) obj5).floatValue();
                    if (w32.a(fFloatValue2, 0.0f) < 0) {
                        hk0.g("Offset must larger than or equal to 0 dp.");
                        return null;
                    }
                    ee5Var = new de5(fFloatValue2, 3, (byte) 0);
                }
                Object obj6 = list.get(0);
                obj6.getClass();
                int iIntValue2 = ((Integer) obj6).intValue();
                Object obj7 = list.get(1);
                obj7.getClass();
                float fFloatValue3 = ((Float) obj7).floatValue();
                Object obj8 = list.get(2);
                obj8.getClass();
                return new ie5(iIntValue2, fFloatValue3, ((Integer) obj8).intValue(), ee5Var);
            case 28:
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                obj9.getClass();
                if (((Integer) obj9).intValue() == 0 || list2.get(1) == null) {
                    return z06.C;
                }
                a65 a65VarB = vt1.B(new xt7(b2), new yr7((byte) 16));
                Object obj10 = list2.get(1);
                obj10.getClass();
                return (b48) ((Function1) a65VarB.f302o).invoke(obj10);
            default:
                return f88Var;
        }
    }
}
