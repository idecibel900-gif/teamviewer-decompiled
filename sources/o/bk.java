package o;

import android.content.Context;
import android.os.Trace;
import com.teamviewer.remotecontrollib.swig.DeviceOptionsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IDeviceOptionsViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberIdSWIGJNI;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f433o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ bk(iy iyVar, me1 me1Var, px4 px4Var, xy6 xy6Var, Function0 function0) {
        this.m = (byte) 1;
        this.f433o = iyVar;
        this.p = me1Var;
        this.q = px4Var;
        this.r = xy6Var;
        this.n = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        String absolutePath;
        v93 id0Var;
        byte b = this.m;
        byte b2 = 0;
        byte b3 = 1;
        IDeviceOptionsViewModel iDeviceOptionsViewModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        f88 f88Var = f88.a;
        Object obj = this.r;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.n;
        Object obj5 = this.f433o;
        switch (b) {
            case 0:
                ((yo5) obj5).n((Function0) obj4, (cp5) obj3, (String) obj2, (j04) obj);
                return f88Var;
            case 1:
                xy6 xy6Var = (xy6) obj;
                ((iy) obj5).V0((String) ((px4) obj2).getValue());
                im3.R((me1) obj3, null, null, new gy(xy6Var, objArr == true ? 1 : 0, b3), 3).o0(new cy(xy6Var, (Function0) obj4, (byte) 1));
                return f88Var;
            case 2:
                im3.R((me1) obj5, null, null, new bj((xy6) obj3, (Function0) obj4, (Function1) obj, (String) obj2, (hc1) null), 3);
                return f88Var;
            case 3:
                fx1 fx1Var = (fx1) obj5;
                me1 me1Var = (me1) obj4;
                px4 px4Var = (px4) obj2;
                ul1 ul1Var = (ul1) obj;
                ((Function0) ((px4) obj3).getValue()).a();
                l97 l97Var = fx1Var.t;
                wy1 wy1Var = (wy1) l97Var.getValue();
                h71 h71Var = wy1Var != null ? wy1Var.b : null;
                ns1 ns1Var = wy1Var != null ? wy1Var.c : null;
                l97 l97Var2 = fx1Var.n;
                do {
                    value = l97Var2.getValue();
                } while (!l97Var2.j(value, gw1.a((gw1) value, h71Var, ns1Var, null, null, 4)));
                l97Var.k(null);
                ((Function1) px4Var.getValue()).invoke(wy1Var != null ? wy1Var.a : null);
                im3.R(me1Var, null, null, new bx1(ul1Var, objArr2 == true ? 1 : 0, b2), 3);
                return f88Var;
            case 4:
                ci2 ci2Var = (ci2) obj5;
                Context context = (Context) obj3;
                px4 px4Var2 = (px4) obj2;
                Function1 function1 = (Function1) obj;
                Function1 function2 = ci2Var.d;
                Boolean bool = Boolean.FALSE;
                function2.invoke(bool);
                iw2 iw2Var = ci2Var.i;
                if (((oi2) obj4).d) {
                    List list = lu.b;
                    absolutePath = xk0.w(context).getAbsolutePath();
                } else {
                    absolutePath = "";
                }
                absolutePath.getClass();
                iw2Var.d(absolutePath, new la(px4Var2, (byte) 23), new qv1(function1, (byte) 8));
                ci2Var.g.invoke(bool);
                return f88Var;
            case 5:
                t33 t33Var = (t33) obj5;
                c36 c36Var = (c36) obj4;
                ut2 ut2Var = (ut2) obj3;
                GroupMemberId groupMemberId = (GroupMemberId) obj2;
                g1 g1Var = (g1) obj;
                int i = b36.b[t33Var.ordinal()];
                long j = groupMemberId.a;
                if (i == 1) {
                    kc0 kc0VarA = c36Var.a(ut2Var, GroupMemberIdSWIGJNI.GroupMemberId_getMemberId(j, groupMemberId));
                    kc0VarA.getClass();
                    id0Var = new gd0(kc0VarA, g1Var);
                } else {
                    ke0 ke0VarB = c36Var.b(ut2Var, GroupMemberIdSWIGJNI.GroupMemberId_getMemberId(j, groupMemberId));
                    id0Var = ke0VarB == null ? null : new id0(ke0VarB, g1Var);
                }
                long jDeviceOptionsViewModelFactory_GetDeviceOptionsViewModel = DeviceOptionsViewModelFactorySWIGJNI.DeviceOptionsViewModelFactory_GetDeviceOptionsViewModel();
                if (jDeviceOptionsViewModelFactory_GetDeviceOptionsViewModel != 0) {
                    iDeviceOptionsViewModel = new IDeviceOptionsViewModel();
                    iDeviceOptionsViewModel.b = true;
                    iDeviceOptionsViewModel.a = jDeviceOptionsViewModelFactory_GetDeviceOptionsViewModel;
                }
                IDeviceOptionsViewModel iDeviceOptionsViewModel2 = iDeviceOptionsViewModel;
                iDeviceOptionsViewModel2.getClass();
                LicenseViewModel licenseViewModelH = di1.h();
                licenseViewModelH.getClass();
                return new iv1(iDeviceOptionsViewModel2, g1Var, id0Var, groupMemberId, t33Var, licenseViewModelH);
            default:
                wc7 wc7Var = (wc7) obj5;
                in1 in1Var = (in1) obj4;
                xc7 xc7Var = (xc7) obj3;
                xc7 xc7Var2 = (xc7) obj2;
                i76 i76Var = (i76) obj;
                pb6 pb6Var = wc7Var.E;
                nc7 nc7Var = wc7Var.D;
                pb6Var.getClass();
                Trace.beginSection("Compose:Styles:build");
                try {
                    pb6Var.n = wc7Var;
                    pb6Var.m = in1Var.getDensity();
                    xc7 xc7Var3 = pb6Var.f1723o;
                    xc7 xc7Var4 = pb6Var.p;
                    if (xc7Var4 != null) {
                        yc7.n.f(xc7Var4);
                    } else {
                        xc7Var4 = new xc7();
                    }
                    pb6Var.f1723o = xc7Var4;
                    pb6Var.p = xc7Var3;
                    pb6Var.u = null;
                    nc7Var.a(pb6Var);
                    pb6Var.b();
                    Trace.endSection();
                    pb6Var.g(0, xc7Var);
                    wc7Var.F = xc7Var;
                    wc7Var.G = xc7Var2;
                    i76Var.m = pb6Var.c();
                    return f88Var;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public /* synthetic */ bk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.m = b;
        this.f433o = obj;
        this.n = obj2;
        this.p = obj3;
        this.q = obj4;
        this.r = obj5;
    }

    public /* synthetic */ bk(me1 me1Var, xy6 xy6Var, Function0 function0, Function1 function1, String str) {
        this.m = (byte) 2;
        this.f433o = me1Var;
        this.p = xy6Var;
        this.n = function0;
        this.r = function1;
        this.q = str;
    }
}
