package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e33 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f33 f675o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e33(f33 f33Var, long j, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f675o = f33Var;
        this.p = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new e33(this.f675o, this.p, hc1Var, (byte) 0);
            default:
                return new e33(this.f675o, this.p, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((e33) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        DeviceOnlineStatus onlineStatus;
        byte b = this.m;
        f88 f88Var = f88.a;
        v13 v13Var = v13.a;
        final byte b2 = 0;
        ne1 ne1Var = ne1.m;
        f33 f33Var = this.f675o;
        long j = this.p;
        final byte b3 = 1;
        switch (b) {
            case 0:
                j23 j23Var = f33Var.G;
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                    } else {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                obj = j23Var.g(j, this);
                if (obj == ne1Var) {
                    return ne1Var;
                }
                w13 w13Var = (w13) obj;
                if (!(w13Var instanceof t13)) {
                    if (w13Var instanceof u13) {
                        e41.s("Failed to refetch managed device status: ", ((u13) w13Var).a.getMessage(), "GroupDevicesScreenViewModel");
                        return f88Var;
                    }
                    if (im3.n(w13Var, v13Var)) {
                        ye4.a("GroupDevicesScreenViewModel", "Ignored obsolete managed device refetch result");
                        return f88Var;
                    }
                    gk0.s();
                    return null;
                }
                DeviceListEntry deviceListEntry = ((t13) w13Var).a;
                if (deviceListEntry == null || (onlineStatus = deviceListEntry.getOnlineStatus()) == null) {
                    return f88Var;
                }
                ls1 ls1VarS = et1.S(onlineStatus);
                int i = f33.I;
                x23 x23Var = new x23((byte) 0, j, ls1VarS);
                j23Var.p(x23Var);
                j23Var.q(x23Var);
                f33Var.b1();
                return f88Var;
            default:
                j23 j23Var2 = f33Var.G;
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                    } else {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                obj = j23Var2.g(j, this);
                if (obj == ne1Var) {
                    return ne1Var;
                }
                w13 w13Var2 = (w13) obj;
                if (!(w13Var2 instanceof t13)) {
                    if (w13Var2 instanceof u13) {
                        e41.s("Failed to refetch managed device: ", ((u13) w13Var2).a.getMessage(), "GroupDevicesScreenViewModel");
                        return f88Var;
                    }
                    if (im3.n(w13Var2, v13Var)) {
                        ye4.a("GroupDevicesScreenViewModel", "Ignored obsolete managed device refetch result");
                        return f88Var;
                    }
                    gk0.s();
                    return null;
                }
                final DeviceListEntry deviceListEntry2 = ((t13) w13Var2).a;
                if (deviceListEntry2 != null) {
                    int i2 = f33.I;
                    j23Var2.getClass();
                    j23Var2.p(new Function1() { // from class: o.q13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b4 = b2;
                            DeviceListEntry deviceListEntry3 = deviceListEntry2;
                            List<ns1> list = (List) obj2;
                            switch (b4) {
                                case 0:
                                    list.getClass();
                                    Iterator it = list.iterator();
                                    int i3 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i3 = -1;
                                        } else if (((ns1) it.next()).a != deviceListEntry3.getTeamViewerId()) {
                                            i3++;
                                        }
                                    }
                                    if (i3 < 0) {
                                        return lv0.B0(list, et1.P(deviceListEntry3));
                                    }
                                    ArrayList arrayList = new ArrayList(list);
                                    arrayList.set(i3, et1.p(deviceListEntry3, (ns1) arrayList.get(i3)));
                                    return arrayList;
                                default:
                                    list.getClass();
                                    ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
                                    for (ns1 ns1VarP : list) {
                                        if (ns1VarP.a == deviceListEntry3.getTeamViewerId()) {
                                            ns1VarP = et1.p(deviceListEntry3, ns1VarP);
                                        }
                                        arrayList2.add(ns1VarP);
                                    }
                                    return arrayList2;
                            }
                        }
                    });
                    j23Var2.q(new Function1() { // from class: o.q13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b4 = b3;
                            DeviceListEntry deviceListEntry3 = deviceListEntry2;
                            List<ns1> list = (List) obj2;
                            switch (b4) {
                                case 0:
                                    list.getClass();
                                    Iterator it = list.iterator();
                                    int i3 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i3 = -1;
                                        } else if (((ns1) it.next()).a != deviceListEntry3.getTeamViewerId()) {
                                            i3++;
                                        }
                                    }
                                    if (i3 < 0) {
                                        return lv0.B0(list, et1.P(deviceListEntry3));
                                    }
                                    ArrayList arrayList = new ArrayList(list);
                                    arrayList.set(i3, et1.p(deviceListEntry3, (ns1) arrayList.get(i3)));
                                    return arrayList;
                                default:
                                    list.getClass();
                                    ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
                                    for (ns1 ns1VarP : list) {
                                        if (ns1VarP.a == deviceListEntry3.getTeamViewerId()) {
                                            ns1VarP = et1.p(deviceListEntry3, ns1VarP);
                                        }
                                        arrayList2.add(ns1VarP);
                                    }
                                    return arrayList2;
                            }
                        }
                    });
                    return f88Var;
                }
                int i3 = f33.I;
                j23Var2.getClass();
                wh whVar = new wh(j, (byte) 4);
                j23Var2.p(whVar);
                j23Var2.q(whVar);
                return f88Var;
        }
    }
}
