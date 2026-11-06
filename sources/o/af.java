package o;

import android.content.res.Resources;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDescription;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDetailModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDisplayNameProperty;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateGroupId;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStatePolicyProperty;
import com.teamviewer.apidefinitions.manageddevices.models.StateOperation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class af implements ho2 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f316o;
    public final Object p;

    public af(ho2 ho2Var, de1 de1Var) {
        this.m = (byte) 11;
        this.n = de1Var;
        this.f316o = j51.S(de1Var);
        this.p = new mf7(ho2Var, null, (byte) 8);
    }

    /* JADX WARN: Code duplicated, block: B:249:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) throws Throwable {
        ze zeVar;
        Object value;
        Object value2;
        Object value3;
        List listR;
        zo2 zo2Var;
        tp2 tp2Var;
        ho2 ho2Var;
        Object objA;
        Object obj2 = obj;
        byte b = this.m;
        zz1 zz1Var = zz1.a;
        c02 c02Var = c02.a;
        xz1 xz1Var = xz1.a;
        a02 a02Var = a02.a;
        d02 d02Var = d02.a;
        yz1 yz1Var = yz1.a;
        b02 b02Var = b02.a;
        e02 e02Var = e02.a;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        Object obj3 = this.p;
        Object obj4 = this.f316o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                k76 k76Var = (k76) obj5;
                if (hc1Var instanceof ze) {
                    zeVar = (ze) hc1Var;
                    int i = zeVar.p;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zeVar.p = i - Integer.MIN_VALUE;
                    } else {
                        zeVar = new ze(this, hc1Var);
                    }
                } else {
                    zeVar = new ze(this, hc1Var);
                }
                Object obj6 = zeVar.n;
                int i2 = zeVar.p;
                if (i2 == 0) {
                    ct1.a0(obj6);
                    bp3 bp3Var = (bp3) k76Var.m;
                    if (bp3Var != null) {
                        bp3Var.j(new ue());
                        zeVar.m = obj2;
                        zeVar.p = 1;
                        if (bp3Var.x0(zeVar) == ne1Var) {
                            return ne1Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = zeVar.m;
                    ct1.a0(obj6);
                }
                me1 me1Var = (me1) obj4;
                k76Var.m = im3.R(me1Var, null, pe1.p, new j0(obj3, obj2, (Object) me1Var, (hc1) null, (byte) 4), 1);
                return f88Var;
            case 1:
                u18 u18Var = (u18) obj4;
                ((ft5) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((hw2) ((px4) obj3).getValue()).invoke(u18Var.a.p0(), u18Var.d.getValue())).booleanValue() : false));
                return f88Var;
            case 2:
                h37 h37Var = (h37) obj2;
                Resources resources = ((ComposeView) obj3).getResources();
                resources.getClass();
                ((Function1) obj5).invoke(lv1.O(h37Var, (Function0) obj4, resources));
                a47 a47Var = h37Var.c;
                if (a47Var != null) {
                    h57.x(a47Var, "remote-control-tab");
                }
                return f88Var;
            case 3:
                f02 f02Var = (f02) obj2;
                if (im3.n(f02Var, d02Var)) {
                    ((Function0) ((px4) obj5).getValue()).a();
                } else if (im3.n(f02Var, a02Var)) {
                    n81 n81Var = (n81) obj4;
                    t36 t36Var = n81Var.s;
                    if (n81Var.a1()) {
                        j97 j97Var = t36Var.m;
                        h71 h71Var = ((i81) j97Var.getValue()).a;
                        if (h71Var != null) {
                            int i3 = h71Var.m;
                            String string = ub7.x0(((i81) j97Var.getValue()).c).toString();
                            String str = ((i81) j97Var.getValue()).d;
                            l97 l97Var = n81Var.r;
                            do {
                                value = l97Var.getValue();
                            } while (!l97Var.j(value, i81.a((i81) value, null, true, null, null, false, false, null, false, false, false, false, 2045)));
                            im3.R(e8.n(n81Var), n81Var.q, null, new l81(n81Var, i3, string, str, null, (byte) 0), 2);
                        }
                    }
                } else if (im3.n(f02Var, xz1Var)) {
                    ((en3) obj3).a(new tg3((byte) 5));
                } else if (!im3.n(f02Var, c02Var) && !im3.n(f02Var, zz1Var) && !im3.n(f02Var, e02Var) && !im3.n(f02Var, b02Var) && !im3.n(f02Var, yz1Var)) {
                    gk0.s();
                    return null;
                }
                return f88Var;
            case 4:
                f02 f02Var2 = (f02) obj2;
                if (im3.n(f02Var2, e02Var)) {
                    ((Function0) ((px4) obj5).getValue()).a();
                } else if (im3.n(f02Var2, b02Var)) {
                    ru1 ru1Var = (ru1) obj4;
                    fe1 fe1Var = ru1Var.x;
                    l97 l97Var2 = ru1Var.z;
                    ns1 ns1VarY0 = ru1Var.Y0();
                    if (ns1VarY0 != null) {
                        UUID uuid = ns1VarY0.v;
                        if (ru1Var.e1()) {
                            wt1 wt1Var = (wt1) ru1Var.A.m.getValue();
                            if (!ns1VarY0.l) {
                                Integer num = ns1VarY0.d;
                                if (num != null) {
                                    int iIntValue = num.intValue();
                                    do {
                                        value2 = l97Var2.getValue();
                                    } while (!l97Var2.j(value2, wt1.a((wt1) value2, true, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777213)));
                                    im3.R(e8.n(ru1Var), fe1Var, null, new l81(ru1Var, iIntValue, wt1Var, ns1VarY0, null, (byte) 1), 2);
                                }
                            } else if (uuid != null) {
                                do {
                                    value3 = l97Var2.getValue();
                                } while (!l97Var2.j(value3, wt1.a((wt1) value3, true, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777213)));
                                boolean z = wt1Var.p;
                                String str2 = wt1Var.n;
                                String str3 = wt1Var.l;
                                boolean z2 = wt1Var.u;
                                Set set = wt1Var.f2442o;
                                List list = ea2.m;
                                if (z) {
                                    List list2 = ns1VarY0.n;
                                    if (list2 != null) {
                                        list = list2;
                                    }
                                    Set setT0 = lv0.T0(list);
                                    Set setZ = fv6.Z(ru1Var.S, set);
                                    Set setZ2 = fv6.Z(set, ru1Var.S);
                                    sa4 sa4VarT = qf0.t();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj7 : setZ) {
                                        if (setT0.contains((UUID) obj7)) {
                                            arrayList.add(obj7);
                                        }
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        sa4VarT.add(new DeviceStateGroupId((UUID) it.next(), StateOperation.Remove));
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj8 : setZ2) {
                                        if (!setT0.contains((UUID) obj8)) {
                                            arrayList2.add(obj8);
                                        }
                                    }
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        sa4VarT.add(new DeviceStateGroupId((UUID) it2.next(), StateOperation.Add));
                                    }
                                    listR = qf0.r(sa4VarT);
                                } else {
                                    listR = list;
                                }
                                UUID uuid2 = z2 ? wt1Var.t : ns1VarY0.f1598o;
                                DeviceStateDisplayNameProperty deviceStateDisplayNameProperty = !im3.n(ns1VarY0.b, str3) ? new DeviceStateDisplayNameProperty(str3, StateOperation.Update) : null;
                                String str4 = ns1VarY0.h;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                im3.R(e8.n(ru1Var), fe1Var, null, new ou1(ru1Var, uuid, new DeviceStateDetailModel(deviceStateDisplayNameProperty, !str4.equals(str2) ? new DeviceStateDescription(StateOperation.Update, str2) : null, null, listR.isEmpty() ? null : listR, z2 ? new DeviceStatePolicyProperty(uuid2 == null ? StateOperation.Remove : StateOperation.Update, uuid2, null, 4, null) : null, null, null, null, null, 484, null), wt1Var, null), 2);
                            }
                        }
                    }
                } else if (im3.n(f02Var2, yz1Var)) {
                    ((en3) obj3).a(new tg3((byte) 5));
                } else if (!im3.n(f02Var2, d02Var) && !im3.n(f02Var2, a02Var) && !im3.n(f02Var2, xz1Var) && !im3.n(f02Var2, c02Var) && !im3.n(f02Var2, zz1Var)) {
                    gk0.s();
                    return null;
                }
                return f88Var;
            case 5:
                jl3 jl3Var = (jl3) obj2;
                ArrayList arrayList3 = (ArrayList) obj5;
                if (jl3Var instanceof j63) {
                    arrayList3.add(jl3Var);
                } else if (jl3Var instanceof k63) {
                    arrayList3.remove(((k63) jl3Var).a);
                } else if (jl3Var instanceof dq2) {
                    arrayList3.add(jl3Var);
                } else if (jl3Var instanceof eq2) {
                    arrayList3.remove(((eq2) jl3Var).a);
                } else if (jl3Var instanceof yr5) {
                    arrayList3.add(jl3Var);
                } else if (jl3Var instanceof zr5) {
                    arrayList3.remove(((zr5) jl3Var).a);
                } else if (jl3Var instanceof xr5) {
                    arrayList3.remove(((xr5) jl3Var).a);
                }
                im3.R((me1) obj4, null, null, new oa1(obj3, lv0.w0(arrayList3), (hc1) null, (byte) 19), 3);
                return f88Var;
            case 6:
                ho2 ho2Var2 = (ho2) obj4;
                g76 g76Var = (g76) obj5;
                if (hc1Var instanceof zo2) {
                    zo2Var = (zo2) hc1Var;
                    int i4 = zo2Var.p;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        zo2Var.p = i4 - Integer.MIN_VALUE;
                    } else {
                        zo2Var = new zo2(this, hc1Var);
                    }
                } else {
                    zo2Var = new zo2(this, hc1Var);
                }
                Object objInvoke = zo2Var.n;
                int i5 = zo2Var.p;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            obj2 = zo2Var.m;
                            ct1.a0(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                g76Var.m = true;
                                zo2Var.m = null;
                                zo2Var.p = 3;
                                if (ho2Var2.c(obj2, zo2Var) == ne1Var) {
                                    return ne1Var;
                                }
                            }
                        } else if (i5 != 3) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    ct1.a0(objInvoke);
                } else {
                    ct1.a0(objInvoke);
                    if (g76Var.m) {
                        zo2Var.m = null;
                        zo2Var.p = 1;
                        if (ho2Var2.c(obj2, zo2Var) == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        zo2Var.m = obj2;
                        zo2Var.p = 2;
                        objInvoke = ((hw2) obj3).invoke(obj2, zo2Var);
                        if (objInvoke == ne1Var) {
                            return ne1Var;
                        }
                        if (!((Boolean) objInvoke).booleanValue()) {
                            g76Var.m = true;
                            zo2Var.m = null;
                            zo2Var.p = 3;
                            if (ho2Var2.c(obj2, zo2Var) == ne1Var) {
                                return ne1Var;
                            }
                        }
                    }
                }
                return f88Var;
            case 7:
                if (hc1Var instanceof tp2) {
                    tp2Var = (tp2) hc1Var;
                    int i6 = tp2Var.n;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        tp2Var.n = i6 - Integer.MIN_VALUE;
                    } else {
                        tp2Var = new tp2(this, hc1Var);
                    }
                } else {
                    tp2Var = new tp2(this, hc1Var);
                }
                Object obj9 = tp2Var.m;
                int i7 = tp2Var.n;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ho2Var = tp2Var.f2132o;
                        ct1.a0(obj9);
                    } else {
                        if (i7 != 2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj9);
                    }
                    return f88Var;
                }
                ct1.a0(obj9);
                ho2 ho2Var3 = (ho2) obj5;
                tp2Var.f2132o = ho2Var3;
                tp2Var.n = 1;
                Object objN = au8.N((ze6) obj4, true, (yb8) obj3, tp2Var);
                if (objN == ne1Var) {
                    return ne1Var;
                }
                ho2Var = ho2Var3;
                obj9 = objN;
                tp2Var.f2132o = null;
                tp2Var.n = 2;
                if (ho2Var.c(obj9, tp2Var) == ne1Var) {
                    return ne1Var;
                }
                return f88Var;
            case 8:
                float fFloatValue = ((Number) obj2).floatValue();
                l76 l76Var = (l76) obj3;
                if (fFloatValue == ((Number) l76Var.a).floatValue()) {
                    return f88Var;
                }
                l76Var.a = Float.valueOf(fFloatValue);
                vc vcVar = (vc) obj4;
                if (((Boolean) ((vx4) obj5).b.getValue()).booleanValue()) {
                    objA = ((km) vcVar.p).e(new Float((0.0012500006f / (fFloatValue + 0.025000006f)) + 0.95f), hc1Var);
                    if (objA != ne1Var) {
                        return f88Var;
                    }
                } else {
                    objA = km.a((km) vcVar.p, new Float(1.0f), null, null, null, hc1Var, 14);
                    if (objA != ne1Var) {
                        return f88Var;
                    }
                }
                return objA;
            case ep1.b /* 9 */:
                px4 px4Var = (px4) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    ((Function1) px4Var.getValue()).invoke((ul7) obj5);
                } else {
                    ((Function1) px4Var.getValue()).invoke((ul7) obj4);
                }
                return f88Var;
            case ep1.c /* 10 */:
                ((Boolean) obj2).getClass();
                ((Function1) obj5).invoke(new ul7(sl7.p, (String) obj4, g37.f854o, null, null, (Function0) obj3, 184));
                return f88Var;
            default:
                Object objY = ga0.y((de1) obj5, obj2, obj4, (mf7) obj3, hc1Var);
                return objY == ne1Var ? objY : f88Var;
        }
    }

    public /* synthetic */ af(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f316o = obj2;
        this.p = obj3;
    }
}
