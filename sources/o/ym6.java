package o;

import com.teamviewer.apidefinitions.legacydevices.models.DeviceAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupRemovedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ym6 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ bn6 n;

    public /* synthetic */ ym6(bn6 bn6Var, byte b) {
        this.m = b;
        this.n = bn6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [o.ea2] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) throws Throwable {
        Object value;
        yl6 yl6Var;
        Object objC;
        Object objC2;
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        final byte b2 = 1;
        final bn6 bn6Var = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ml6 ml6Var = (ml6) obj;
                l97 l97Var = bn6Var.u;
                String str = (String) bn6Var.t.m.getValue();
                List listB1 = bn6Var.b1(str);
                List listJ0 = lv0.J0(lv0.A0(ml6Var.b, ml6Var.c), new dj6((byte) 2));
                List listJ1 = lv0.J0(ml6Var.a, new dj6((byte) 2));
                boolean zB0 = ub7.b0(str);
                ?? arrayList = ea2.m;
                if (!zB0) {
                    fl2 fl2Var = new fl2(lv0.g0(((yl6) bn6Var.v.m.getValue()).f), true, new fy(str, (byte) 14));
                    dj6 dj6Var = new dj6((byte) 1);
                    ArrayList arrayListM0 = bq6.m0(fl2Var);
                    pv0.b0(arrayListM0, dj6Var);
                    Iterator it = arrayListM0.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            arrayList = new ArrayList();
                            arrayList.add(next);
                            while (it.hasNext()) {
                                arrayList.add(it.next());
                            }
                        } else {
                            arrayList = qf0.K(next);
                        }
                    }
                }
                gl6 gl6Var = new gl6(listB1, listJ0, listJ1, arrayList);
                z31 z31VarD1 = bn6Var.d1(str, gl6Var, ((yl6) l97Var.getValue()).b);
                do {
                    value = l97Var.getValue();
                    yl6Var = (yl6) value;
                    yl6Var.getClass();
                } while (!l97Var.j(value, yl6.a(yl6Var, null, null, z31VarD1, bn6.c1(str, z31VarD1), null, null, gl6Var.a, gl6Var.c, gl6Var.b, gl6Var.d, null, false, null, false, false, false, null, null, false, 2096179)));
                bn6Var.h1();
                return f88Var;
            case 1:
                TeamViewerEvent teamViewerEvent = (TeamViewerEvent) obj;
                yx6 yx6Var = bn6Var.A;
                LinkedHashSet linkedHashSet = bn6Var.G;
                if (teamViewerEvent == null) {
                    return f88Var;
                }
                if (teamViewerEvent instanceof DeviceRemovedEvent) {
                    final String strValueOf = String.valueOf(((DeviceRemovedEvent) teamViewerEvent).getDeviceId());
                    linkedHashSet.add(strValueOf);
                    bn6Var.j1(new Function1() { // from class: o.qm6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ArrayList arrayList2;
                            yl6 yl6Var2;
                            byte b3 = b2;
                            String str2 = strValueOf;
                            switch (b3) {
                                case 0:
                                    yl6 yl6Var3 = (yl6) obj2;
                                    yl6Var3.getClass();
                                    z31 z31VarD2 = yl6Var3.c;
                                    List list = yl6Var3.i;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj3 : list) {
                                        if (!im3.n(((z31) obj3).e, str2)) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                    if (im3.n(z31VarD2 != null ? z31VarD2.e : null, str2)) {
                                        String str3 = yl6Var3.a;
                                        bn6 bn6Var2 = bn6Var;
                                        arrayList2 = arrayList3;
                                        z31VarD2 = bn6Var2.d1(str3, bn6.W0(bn6Var2, yl6Var3, null, arrayList2, null, 13), yl6Var3.b);
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    z31 z31Var = z31VarD2;
                                    return yl6.a(yl6Var3, null, null, z31Var, z31Var != null ? bn6.e1(z31Var) : false, null, null, null, null, arrayList2, null, null, false, null, false, false, false, null, null, false, 2096883);
                                default:
                                    yl6 yl6Var4 = (yl6) obj2;
                                    yl6Var4.getClass();
                                    z31 z31VarD3 = yl6Var4.c;
                                    List list2 = yl6Var4.i;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        boolean zHasNext = it2.hasNext();
                                        b41 b41Var = b41.n;
                                        if (!zHasNext) {
                                            if ((z31VarD3 != null ? z31VarD3.j : null) == b41Var && im3.n(z31VarD3.d, str2)) {
                                                String str4 = yl6Var4.a;
                                                yl6Var2 = yl6Var4;
                                                bn6 bn6Var3 = bn6Var;
                                                z31VarD3 = bn6Var3.d1(str4, bn6.W0(bn6Var3, yl6Var2, null, arrayList4, null, 13), yl6Var2.b);
                                            } else {
                                                yl6Var2 = yl6Var4;
                                            }
                                            z31 z31Var2 = z31VarD3;
                                            return yl6.a(yl6Var2, null, null, z31Var2, z31Var2 != null ? bn6.e1(z31Var2) : false, null, null, null, null, arrayList4, null, null, false, null, false, false, false, null, null, false, 2096883);
                                        }
                                        Object next2 = it2.next();
                                        z31 z31Var3 = (z31) next2;
                                        if (z31Var3.j != b41Var || !im3.n(z31Var3.d, str2)) {
                                            arrayList4.add(next2);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    bn6Var.h1();
                    return f88Var;
                }
                if ((teamViewerEvent instanceof GroupAddedEvent) || (teamViewerEvent instanceof GroupRemovedEvent)) {
                    objC = yx6Var.c(f88Var, hc1Var);
                    if (objC != ne1Var) {
                        return f88Var;
                    }
                } else {
                    if (!(teamViewerEvent instanceof DeviceAddedEvent)) {
                        return f88Var;
                    }
                    linkedHashSet.remove(String.valueOf(((DeviceAddedEvent) teamViewerEvent).getDevice().getTeamViewerId()));
                    objC = yx6Var.c(f88Var, hc1Var);
                    if (objC != ne1Var) {
                        return f88Var;
                    }
                }
                return objC;
            default:
                com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent) obj;
                yx6 yx6Var2 = bn6Var.A;
                LinkedHashSet linkedHashSet2 = bn6Var.F;
                if (teamViewerEvent2 == null) {
                    return f88Var;
                }
                if (teamViewerEvent2 instanceof ManagedDeviceRemovedEvent) {
                    final String string = ((ManagedDeviceRemovedEvent) teamViewerEvent2).getManagementId().toString();
                    string.getClass();
                    linkedHashSet2.add(string);
                    final byte b3 = 0;
                    bn6Var.j1(new Function1() { // from class: o.qm6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ArrayList arrayList2;
                            yl6 yl6Var2;
                            byte b4 = b3;
                            String str2 = string;
                            switch (b4) {
                                case 0:
                                    yl6 yl6Var3 = (yl6) obj2;
                                    yl6Var3.getClass();
                                    z31 z31VarD2 = yl6Var3.c;
                                    List list = yl6Var3.i;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj3 : list) {
                                        if (!im3.n(((z31) obj3).e, str2)) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                    if (im3.n(z31VarD2 != null ? z31VarD2.e : null, str2)) {
                                        String str3 = yl6Var3.a;
                                        bn6 bn6Var2 = bn6Var;
                                        arrayList2 = arrayList3;
                                        z31VarD2 = bn6Var2.d1(str3, bn6.W0(bn6Var2, yl6Var3, null, arrayList2, null, 13), yl6Var3.b);
                                    } else {
                                        arrayList2 = arrayList3;
                                    }
                                    z31 z31Var = z31VarD2;
                                    return yl6.a(yl6Var3, null, null, z31Var, z31Var != null ? bn6.e1(z31Var) : false, null, null, null, null, arrayList2, null, null, false, null, false, false, false, null, null, false, 2096883);
                                default:
                                    yl6 yl6Var4 = (yl6) obj2;
                                    yl6Var4.getClass();
                                    z31 z31VarD3 = yl6Var4.c;
                                    List list2 = yl6Var4.i;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        boolean zHasNext = it2.hasNext();
                                        b41 b41Var = b41.n;
                                        if (!zHasNext) {
                                            if ((z31VarD3 != null ? z31VarD3.j : null) == b41Var && im3.n(z31VarD3.d, str2)) {
                                                String str4 = yl6Var4.a;
                                                yl6Var2 = yl6Var4;
                                                bn6 bn6Var3 = bn6Var;
                                                z31VarD3 = bn6Var3.d1(str4, bn6.W0(bn6Var3, yl6Var2, null, arrayList4, null, 13), yl6Var2.b);
                                            } else {
                                                yl6Var2 = yl6Var4;
                                            }
                                            z31 z31Var2 = z31VarD3;
                                            return yl6.a(yl6Var2, null, null, z31Var2, z31Var2 != null ? bn6.e1(z31Var2) : false, null, null, null, null, arrayList4, null, null, false, null, false, false, false, null, null, false, 2096883);
                                        }
                                        Object next2 = it2.next();
                                        z31 z31Var3 = (z31) next2;
                                        if (z31Var3.j != b41Var || !im3.n(z31Var3.d, str2)) {
                                            arrayList4.add(next2);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    bn6Var.h1();
                    return f88Var;
                }
                if ((teamViewerEvent2 instanceof ManagedGroupAddedEvent) || (teamViewerEvent2 instanceof ManagedGroupRemovedEvent)) {
                    objC2 = yx6Var2.c(f88Var, hc1Var);
                    if (objC2 != ne1Var) {
                        return f88Var;
                    }
                } else {
                    if (!(teamViewerEvent2 instanceof ManagedDeviceAddedEvent)) {
                        return f88Var;
                    }
                    linkedHashSet2.remove(((ManagedDeviceAddedEvent) teamViewerEvent2).getManagementId().toString());
                    objC2 = yx6Var2.c(f88Var, hc1Var);
                    if (objC2 != ne1Var) {
                        return f88Var;
                    }
                }
                return objC2;
        }
    }
}
