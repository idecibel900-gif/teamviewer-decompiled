package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f840o;

    public /* synthetic */ g0(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f840o = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ie4 ie4Var;
        String str;
        byte b = this.m;
        byte b2 = 1;
        byte b3 = 2;
        byte b4 = 6;
        Object obj2 = null;
        byte b5 = 0;
        f88 f88Var = f88.a;
        Object obj3 = this.f840o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                ((mw4) obj4).b((xr5) obj3);
                return f88Var;
            case 1:
                d7 d7Var = (d7) obj4;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (List) obj3) {
                    if (im3.n(((hc3) obj5).a().getValue(), Boolean.TRUE)) {
                        arrayList.add(obj5);
                    }
                }
                d7Var.f591o = arrayList;
                d7Var.notifyDataSetChanged();
                return f88Var;
            case 2:
                ((r22) obj).getClass();
                return new l9((Activity) obj4, (p9) obj3, b5);
            case 3:
                ((r22) obj).getClass();
                return new l9((Activity) obj4, (vb) obj3, b2);
            case 4:
                hb hbVar = (hb) obj4;
                Set set = (Set) obj;
                set.getClass();
                Function1 function1 = hbVar.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : (List) obj3) {
                    if (lv0.h0(set, bt1.B((l33) obj6))) {
                        arrayList2.add(obj6);
                    }
                }
                function1.invoke(arrayList2);
                hbVar.h.invoke(ea0.m);
                return f88Var;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(g02.S);
                ((hb) obj4).g.invoke(str2);
                ((Function0) obj3).a();
                return f88Var;
            case 6:
                gf gfVar = (gf) obj4;
                mf mfVar = (mf) obj3;
                long jF = t65.f(gfVar.q1() ? -1.0f : 1.0f, ((o42) obj).a);
                mfVar.a(gfVar.V.h(Float.intBitsToFloat((int) (gfVar.C == gb5.m ? jF & 4294967295L : jF >> 32))), 0.0f);
                return f88Var;
            case 7:
                return new gj3((k64) obj4, new y((xj) obj3, b4));
            case 8:
                yo5 yo5Var = (yo5) obj4;
                yo5Var.setPositionProvider((bp5) obj3);
                yo5Var.q();
                return new fc((byte) 1);
            case ep1.b /* 9 */:
                ((LayoutNode) obj4).C0(((fs4) obj).f((fs4) obj3));
                return f88Var;
            case ep1.c /* 10 */:
                xm xmVar = (xm) obj4;
                yc4 yc4Var = xmVar.E;
                jl5 jl5Var = (jl5) obj3;
                il5 il5Var = (il5) obj;
                if (il5Var.b() != null) {
                    zu7 zu7Var = xmVar.C.m;
                    i04 i04VarE = zu7Var.e(il5Var);
                    i04 i04VarB = il5Var.b();
                    i04VarB.getClass();
                    long jO = us1.O(zu7Var.a(i04VarE, i04VarB));
                    na0 na0Var = (na0) yc4Var.f2598o;
                    if (!vk3.a(na0Var.a, jO)) {
                        ((na0) yc4Var.n).a = !((zk3) yc4Var.p).equals(hm3.a) ? ((zk3) yc4Var.p).e() : jO;
                        na0Var.a = jO;
                    }
                    if (!xmVar.D) {
                        yc4Var.b0(1.0f);
                    }
                    il5Var.g(jl5Var, 0, 0, 0.0f);
                }
                return f88Var;
            case 11:
                c10 c10Var = (c10) obj4;
                d10 d10Var = (d10) obj3;
                dv7 dv7Var = c10Var.A;
                if (dv7Var != null) {
                    dv7Var.b();
                }
                c10Var.A = null;
                qx0 qx0Var = d10Var.c;
                if (qx0Var != null) {
                    qx0Var.N(f88Var);
                }
                d10Var.c = null;
                return f88Var;
            case ep1.d /* 12 */:
                s10 s10Var = (s10) obj4;
                jz0 jz0Var = (jz0) obj3;
                s10Var.a(jz0Var);
                return new l9(s10Var, jz0Var, b3);
            case 13:
                Function1 function2 = (Function1) obj3;
                zr7 zr7Var = (zr7) obj;
                if (!im3.n((zr7) obj4, zr7Var)) {
                    function2.invoke(zr7Var);
                }
                return f88Var;
            case 14:
                Context context = (Context) obj4;
                Function1 function3 = (Function1) obj3;
                String str3 = (String) obj;
                str3.getClass();
                ie4.f1053o.getClass();
                context.getClass();
                for (Object obj7 : ie4.r) {
                    if (im3.n(context.getString(((ie4) obj7).n), str3)) {
                        obj2 = obj7;
                        ie4Var = (ie4) obj2;
                        if (ie4Var == null) {
                            ie4Var = ie4.DEFAULT;
                        }
                        function3.invoke(ie4Var.m);
                        return f88Var;
                    }
                }
                ie4Var = (ie4) obj2;
                if (ie4Var == null) {
                    ie4Var = ie4.DEFAULT;
                }
                function3.invoke(ie4Var.m);
                return f88Var;
            case 15:
                il5.m((il5) obj, (jl5) obj4, 0, 0, ((v70) obj3).A);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                sb0 sb0Var = (sb0) obj3;
                d14 d14Var = (d14) obj;
                d14Var.a();
                u52.H0(d14Var, (rj) obj4, sb0Var, 0.0f, null, null, 60);
                return f88Var;
            case 17:
                d14 d14Var2 = (d14) obj;
                d14Var2.a();
                u52.H0(d14Var2, ((nb5) obj4).e, (sb0) obj3, 0.0f, null, null, 60);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((eb0) obj4).a.j((za1) obj3);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((TextView) ((yt2) obj4).n).setText(((cc0) obj3).H().getString(R.string.tv_partner_member, (Integer) obj));
                return f88Var;
            case 20:
                ae0 ae0Var = (ae0) obj4;
                View view = (View) obj3;
                int i = ae0.F0;
                if (((Boolean) obj).booleanValue() && (str = ae0Var.y0) != null) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.pl_scan_qr_code);
                    ae0Var.x0 = floatingActionButton;
                    if (floatingActionButton != null) {
                        floatingActionButton.setVisibility(0);
                    }
                    FloatingActionButton floatingActionButton2 = ae0Var.x0;
                    if (floatingActionButton2 != null) {
                        floatingActionButton2.setOnClickListener(new y6(ae0Var, str, b3));
                    }
                }
                return f88Var;
            case 21:
                PListComputerID pListComputerID = (PListComputerID) obj3;
                ComputerEditViewModel computerEditViewModel = (ComputerEditViewModel) obj;
                computerEditViewModel.getClass();
                PListDyngateID pListDyngateIDA = computerEditViewModel.a();
                String strPListDyngateID_GetAsString = PListDyngateIDSWIGJNI.PListDyngateID_GetAsString(pListDyngateIDA.a, pListDyngateIDA);
                strPListDyngateID_GetAsString.getClass();
                String strB = ((l41) ((ja3) obj4)).b(strPListDyngateID_GetAsString);
                if (strB == null || strB.length() == 0) {
                    strB = ComputerEditViewModelSWIGJNI.ComputerEditViewModel_GetPassword(computerEditViewModel.a, computerEditViewModel);
                    strB.getClass();
                }
                if (ComputerEditViewModelSWIGJNI.ComputerEditViewModel_IsITbRemoteAccessActivated(computerEditViewModel.a, computerEditViewModel)) {
                    int i2 = wt6.k;
                    return vt6.b(PListComputerIDSWIGJNI.PListComputerID_GetInternalID(pListComputerID.a, pListComputerID), strPListDyngateID_GetAsString, strB);
                }
                int i3 = wt6.k;
                return vt6.a(60, strPListDyngateID_GetAsString, strB, null);
            case 22:
                ((r22) obj).getClass();
                return new l9((ja1) obj4, (w44) obj3, (byte) 3);
            case 23:
                j64 j64Var = (j64) obj4;
                sb0 sb0Var2 = (sb0) obj3;
                d14 d14Var3 = (d14) obj;
                d14Var3.a();
                if (((Boolean) j64Var.s.getValue()).booleanValue() || ((Boolean) j64Var.t.getValue()).booleanValue()) {
                    u52.x(d14Var3, sb0Var2, 0L, 0L, 0.0f, null, null, 126);
                }
                return f88Var;
            case 24:
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                ((rn1) obj4).b.P(pg6Var, (on1) obj3);
                return f88Var;
            case 25:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                ((Function1) ((px4) obj3).getValue()).invoke(l33Var);
                ((fx1) obj4).X0(l33Var.a);
                return f88Var;
            case 26:
                en3 en3Var = (en3) obj4;
                Function0 function0 = (Function0) obj;
                function0.getClass();
                if (!((xv1) ((i97) obj3).getValue()).b) {
                    en3Var.a(function0);
                }
                return f88Var;
            case 27:
                ((mw4) obj4).b((jl3) obj3);
                return f88Var;
            case 28:
                ((r22) obj).getClass();
                return new l9((u23) obj4, (w44) obj3, (byte) 5);
            default:
                ((r22) obj).getClass();
                return new l9((e43) obj4, (w44) obj3, b4);
        }
    }
}
