package o;

import com.teamviewer.apidefinitions.legacydevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.Device;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceModuleType;
import com.teamviewer.apidefinitions.manageddevices.models.DevicePolicyDescriptor;
import com.teamviewer.apidefinitions.manageddevices.models.DevicePropertyType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;
import com.teamviewer.apidefinitions.manageddevices.models.EntityManagerListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.Group;
import com.teamviewer.apidefinitions.manageddevices.models.GroupPolicyDescriptor;
import com.teamviewer.apidefinitions.manageddevices.models.ManagerType;
import com.teamviewer.apidefinitions.policies.models.PolicyAssignmentEvent;
import com.teamviewer.apidefinitions.policies.models.PolicyData;
import com.teamviewer.apidefinitions.policies.models.PolicyUnassignmentEvent;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByKnownDeviceMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ru1 extends oe8 {
    public final t36 A;
    public final yx6 B;
    public final r36 C;
    public final yx6 D;
    public final r36 E;
    public final yx6 F;
    public final r36 G;
    public final yx6 H;
    public final r36 I;
    public final l97 J;
    public final LinkedHashMap K;
    public List L;
    public boolean M;
    public boolean N;
    public du1 O;
    public long P;
    public final LinkedHashSet Q;
    public du1 R;
    public Set S;
    public final nx3 T;
    public n87 U;
    public final xk1 V;
    public final f41 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d31 f1953o;
    public final cr p;
    public final jk0 q;
    public final hl4 r;
    public final nx3 s;
    public final g95 t;
    public final cr u;
    public final cr v;
    public final wj5 w;
    public final fe1 x;
    public final Long y;
    public final l97 z;

    public ru1(f41 f41Var, d31 d31Var, cr crVar) {
        byte b = 27;
        jk0 jk0Var = new jk0(b);
        q85 q85Var = q85.a;
        xl4 xl4Var = new xl4();
        nx3 nx3Var = new nx3((byte) 9);
        byte b2 = 6;
        g95 g95Var = new g95((byte) 6);
        cr crVar2 = new cr((byte) 8);
        cr crVar3 = new cr(b);
        wj5 wj5Var = new wj5((byte) 17);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        f41Var.getClass();
        gk1Var.getClass();
        this.n = f41Var;
        this.f1953o = d31Var;
        this.p = crVar;
        this.q = jk0Var;
        this.r = xl4Var;
        this.s = nx3Var;
        this.t = g95Var;
        this.u = crVar2;
        this.v = crVar3;
        this.w = wj5Var;
        this.x = gk1Var;
        this.y = 30000L;
        l97 l97VarK = im3.k(new wt1(null, false, false, null, 16777215));
        this.z = l97VarK;
        this.A = yo1.u(l97VarK);
        hc1 hc1Var = null;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.B = yx6VarL;
        this.C = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.D = yx6VarL2;
        this.E = new r36(yx6VarL2);
        yx6 yx6VarL3 = au8.l(0, 7, null);
        this.F = yx6VarL3;
        this.G = new r36(yx6VarL3);
        yx6 yx6VarL4 = au8.l(0, 7, null);
        this.H = yx6VarL4;
        this.I = new r36(yx6VarL4);
        this.J = im3.k(null);
        this.K = new LinkedHashMap();
        this.L = ea2.m;
        this.Q = new LinkedHashSet();
        this.S = la2.m;
        this.T = new nx3((Object) xl4Var, (byte) 15);
        im3.R(e8.n(this), null, null, new pt1(this, hc1Var, (byte) 5), 3);
        im3.R(e8.n(this), null, null, new pt1(this, hc1Var, (byte) 4), 3);
        im3.R(e8.n(this), null, null, new pt1(this, hc1Var, b2), 3);
        h1();
        this.V = new xk1(this, b2);
    }

    public static du1 V0(ns1 ns1Var) {
        boolean z = ns1Var.l;
        long j = ns1Var.a;
        if (z) {
            UUID uuid = ns1Var.v;
            return uuid != null ? new bu1(uuid) : new cu1(j);
        }
        Integer num = ns1Var.d;
        return num != null ? new zt1(num.intValue()) : new au1(j);
    }

    public static String l1(UUID uuid, List list) {
        Object next;
        if (uuid != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!im3.n(((PolicyData) next).getPolicyId(), uuid));
            PolicyData policyData = (PolicyData) next;
            if (policyData != null) {
                return policyData.getPolicyName();
            }
        }
        return null;
    }

    public static ls1 q1(DeviceOnlineStatus deviceOnlineStatus, boolean z) {
        if (deviceOnlineStatus == DeviceOnlineStatus.Offline && z) {
            return ls1.f1400o;
        }
        int i = fu1.d[deviceOnlineStatus.ordinal()];
        if (i == 1) {
            return ls1.m;
        }
        if (i == 2) {
            return ls1.n;
        }
        gk0.s();
        return null;
    }

    public static ls1 r1(com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus deviceOnlineStatus, ms1 ms1Var) {
        int i = fu1.c[deviceOnlineStatus.ordinal()];
        if (i == 1) {
            return ls1.m;
        }
        ls1 ls1Var = ls1.f1400o;
        if (i == 2) {
            return ms1Var != null ? ls1Var : ls1.n;
        }
        if (i == 3) {
            return ls1Var;
        }
        gk0.s();
        return null;
    }

    public static ns1 v1(ns1 ns1Var, List list) {
        if (!ns1Var.l) {
            return ns1Var;
        }
        UUID uuid = ns1Var.f1598o;
        if (uuid == null) {
            uuid = ns1Var.r;
        }
        return ns1.a(ns1Var, 0L, null, null, null, null, false, null, null, null, null, null, null, null, l1(uuid, list), null, null, null, null, null, null, 4161535);
    }

    public final void W0(long j) {
        l97 l97Var = this.J;
        Long l = (Long) l97Var.getValue();
        if (l != null && l.longValue() == j) {
            l97Var.k(null);
        }
        m1(j, false);
    }

    public final void X0() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.z;
            value = l97Var.getValue();
        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776703)));
    }

    public final ns1 Y0() {
        du1 du1Var = this.O;
        if (du1Var != null) {
            return (ns1) this.K.get(du1Var);
        }
        return null;
    }

    public final du1 Z0(UUID uuid, Long l) {
        Object next;
        Object next2;
        bu1 bu1Var = new bu1(uuid);
        LinkedHashMap linkedHashMap = this.K;
        if (!linkedHashMap.containsKey(bu1Var)) {
            bu1Var = null;
        }
        if (bu1Var != null) {
            return bu1Var;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            du1 du1Var = (du1) entry.getKey();
            ns1 ns1Var = (ns1) entry.getValue();
            if ((du1Var instanceof bu1) || (du1Var instanceof cu1)) {
                if (im3.n(ns1Var.v, uuid)) {
                    break;
                }
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        du1 du1Var2 = entry2 != null ? (du1) entry2.getKey() : null;
        if (du1Var2 != null) {
            return du1Var2;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                Map.Entry entry3 = (Map.Entry) next2;
                du1 du1Var3 = (du1) entry3.getKey();
                ns1 ns1Var2 = (ns1) entry3.getValue();
                if ((du1Var3 instanceof bu1) || (du1Var3 instanceof cu1)) {
                    if (ns1Var2.a == jLongValue) {
                        break;
                    }
                }
            }
            Map.Entry entry4 = (Map.Entry) next2;
            if (entry4 != null) {
                return (du1) entry4.getKey();
            }
        }
        return null;
    }

    public final List a1(long j, UUID uuid) {
        bu1 bu1Var = new bu1(uuid);
        Set setEntrySet = this.K.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            du1 du1Var = (du1) entry.getKey();
            ns1 ns1Var = (ns1) entry.getValue();
            if ((du1Var instanceof bu1) || (du1Var instanceof cu1)) {
                if (im3.n(du1Var, bu1Var) || im3.n(ns1Var.v, uuid) || ns1Var.a == j) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((du1) ((Map.Entry) it.next()).getKey());
        }
        return lv0.P0(lv0.S0(arrayList2));
    }

    public final Object b1(UUID uuid, Set set, hc1 hc1Var) {
        Object objK1;
        du1 du1VarZ0 = Z0(uuid, null);
        if (du1VarZ0 == null) {
            du1VarZ0 = new bu1(uuid);
        }
        if (!this.Q.contains(du1VarZ0)) {
            if (!set.isEmpty()) {
                s1(du1VarZ0, this.L, new a81(set, (byte) 6));
            }
            if (im3.n(this.O, du1VarZ0) && (objK1 = k1(uuid, false, false, true, hc1Var)) == ne1.m) {
                return objK1;
            }
        }
        return f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c1(PolicyAssignmentEvent policyAssignmentEvent, hc1 hc1Var) {
        hu1 hu1Var;
        if (hc1Var instanceof hu1) {
            hu1Var = (hu1) hc1Var;
            int i = hu1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                hu1Var.p = i - Integer.MIN_VALUE;
            } else {
                hu1Var = new hu1(this, hc1Var);
            }
        } else {
            hu1Var = new hu1(this, hc1Var);
        }
        Object objJ1 = hu1Var.n;
        int i2 = hu1Var.p;
        if (i2 == 0) {
            ct1.a0(objJ1);
            Set setT0 = lv0.T0(policyAssignmentEvent.getPolicyData().getDyngateIds());
            hu1Var.m = policyAssignmentEvent;
            hu1Var.p = 1;
            objJ1 = j1(setT0, hu1Var);
            Object obj = ne1.m;
            if (objJ1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            policyAssignmentEvent = hu1Var.m;
            ct1.a0(objJ1);
        }
        du1 du1Var = (du1) objJ1;
        for (du1 du1Var2 : lv0.P0(this.K.keySet())) {
            s1(du1Var2, this.L, new m5((Object) du1Var2, (Object) du1Var, (Object) policyAssignmentEvent, (byte) 16));
        }
        return f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d1(PolicyUnassignmentEvent policyUnassignmentEvent, hc1 hc1Var) {
        iu1 iu1Var;
        if (hc1Var instanceof iu1) {
            iu1Var = (iu1) hc1Var;
            int i = iu1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                iu1Var.p = i - Integer.MIN_VALUE;
            } else {
                iu1Var = new iu1(this, hc1Var);
            }
        } else {
            iu1Var = new iu1(this, hc1Var);
        }
        Object objJ1 = iu1Var.n;
        int i2 = iu1Var.p;
        if (i2 == 0) {
            ct1.a0(objJ1);
            Set setV = lv1.V(new Long(policyUnassignmentEvent.getPolicyData().getDyngateId()));
            iu1Var.m = policyUnassignmentEvent;
            iu1Var.p = 1;
            objJ1 = j1(setV, iu1Var);
            Object obj = ne1.m;
            if (objJ1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            policyUnassignmentEvent = iu1Var.m;
            ct1.a0(objJ1);
        }
        du1 du1Var = (du1) objJ1;
        for (du1 du1Var2 : lv0.P0(this.K.keySet())) {
            s1(du1Var2, this.L, new m5((Object) du1Var2, (Object) du1Var, (Object) policyUnassignmentEvent, (byte) 15));
        }
        return f88.a;
    }

    public final boolean e1() {
        wt1 wt1Var = (wt1) this.A.m.getValue();
        ns1 ns1VarY0 = Y0();
        if (ns1VarY0 == null) {
            return false;
        }
        boolean z = wt1Var.a;
        String str = wt1Var.l;
        if (z || wt1Var.r || !wt1Var.q.isEmpty() || ub7.b0(str) || !wt1Var.v || !wt1Var.w) {
            return false;
        }
        if (!im3.n(ns1VarY0.b, str)) {
            return true;
        }
        String str2 = ns1VarY0.h;
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.equals(wt1Var.n)) {
            return true;
        }
        boolean z2 = ns1VarY0.l;
        if (!z2 && wt1Var.m != null) {
            return true;
        }
        if (z2) {
            return wt1Var.p || wt1Var.u;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object f1(long j, jc1 jc1Var) {
        ju1 ju1Var;
        long j2;
        long j3;
        Object value;
        Object value2;
        wt1 wt1Var;
        ArrayList arrayList;
        ss1 ss1Var;
        if (jc1Var instanceof ju1) {
            ju1Var = (ju1) jc1Var;
            int i = ju1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ju1Var.q = i - Integer.MIN_VALUE;
            } else {
                ju1Var = new ju1(this, jc1Var);
            }
        } else {
            ju1Var = new ju1(this, jc1Var);
        }
        ju1 ju1Var2 = ju1Var;
        Object objJ0 = ju1Var2.f1200o;
        int i2 = ju1Var2.q;
        hc1 hc1Var = null;
        l97 l97Var = this.z;
        if (i2 == 0) {
            ct1.a0(objJ0);
            j2 = this.P;
            ns1 ns1VarY0 = Y0();
            if (ns1VarY0 != null && ns1VarY0.a == j) {
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, la2.m, true, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777191)));
            }
            j3 = j;
            wl wlVar = new wl(this, j3, hc1Var, (byte) 1);
            ju1Var2.m = j3;
            ju1Var2.n = j2;
            ju1Var2.q = 1;
            objJ0 = im3.j0(this.x, wlVar, ju1Var2);
            ne1 ne1Var = ne1.m;
            if (objJ0 == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = ju1Var2.n;
            long j5 = ju1Var2.m;
            ct1.a0(objJ0);
            j2 = j4;
            j3 = j5;
        }
        List list = (List) objJ0;
        ns1 ns1VarY1 = Y0();
        if (ns1VarY1 != null && ns1VarY1.a == j3 && j2 == this.P) {
            do {
                value2 = l97Var.getValue();
                wt1Var = (wt1) value2;
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    switch (fu1.e[((ConnectByKnownDeviceMode) it.next()).ordinal()]) {
                        case 1:
                            ss1Var = ss1.m;
                            break;
                        case 2:
                            ss1Var = ss1.n;
                            break;
                        case 3:
                            ss1Var = ss1.f2046o;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            ss1Var = null;
                            break;
                        default:
                            gk0.s();
                            return null;
                    }
                    if (ss1Var != null) {
                        arrayList.add(ss1Var);
                    }
                }
            } while (!l97Var.j(value2, wt1.a(wt1Var, false, null, lv0.T0(arrayList), false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777191)));
        }
        return f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g1(Device device, jc1 jc1Var) {
        ku1 ku1Var;
        Object obj;
        UUID uuid;
        if (jc1Var instanceof ku1) {
            ku1Var = (ku1) jc1Var;
            int i = ku1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ku1Var.p = i - Integer.MIN_VALUE;
            } else {
                ku1Var = new ku1(this, jc1Var);
            }
        } else {
            ku1Var = new ku1(this, jc1Var);
        }
        Object obj2 = ku1Var.n;
        int i2 = ku1Var.p;
        if (i2 == 0) {
            ct1.a0(obj2);
            DevicePolicyDescriptor policy = device.getPolicy();
            UUID policyId = policy != null ? policy.getPolicyId() : null;
            DevicePolicyDescriptor policy2 = device.getPolicy();
            UUID groupId = policy2 != null ? policy2.getGroupId() : null;
            if (policyId == null && groupId != null) {
                ku1Var.m = groupId;
                ku1Var.p = 1;
                Object objI = ((xl4) this.r).i(groupId, ku1Var);
                ne1 ne1Var = ne1.m;
                if (objI == ne1Var) {
                    return ne1Var;
                }
                UUID uuid2 = groupId;
                obj = objI;
                uuid = uuid2;
            }
            return null;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uuid = ku1Var.m;
        ct1.a0(obj2);
        obj = ((tc6) obj2).m;
        Throwable thA = tc6.a(obj);
        if (thA == null) {
            Group group = (Group) obj;
            GroupPolicyDescriptor policy3 = group.getPolicy();
            return new eu1(policy3 != null ? policy3.getPolicyId() : null, group.getDisplayName());
        }
        ye4.a("DeviceInfoScreenViewModel", "Failed to load group " + uuid + " for inherited policy: " + thA.getMessage());
        return null;
    }

    public final void h1() {
        if (this.M || this.N) {
            return;
        }
        this.N = true;
        im3.R(e8.n(this), null, null, new pt1(this, (hc1) null, (byte) 3), 3);
    }

    public final void i1(UUID uuid, final Device device, final boolean z, final eu1 eu1Var, final String str) {
        du1 du1VarZ0 = Z0(uuid, Long.valueOf(device.getTeamViewerId()));
        if (du1VarZ0 == null) {
            return;
        }
        DevicePolicyDescriptor policy = device.getPolicy();
        final UUID policyId = policy != null ? policy.getPolicyId() : null;
        DevicePolicyDescriptor policy2 = device.getPolicy();
        final UUID groupId = policy2 != null ? policy2.getGroupId() : null;
        final boolean z2 = policyId == null && groupId != null;
        s1(du1VarZ0, this.L, new Function1(str, this, z, z2, eu1Var, policyId, groupId) { // from class: o.yt1
            public final /* synthetic */ String n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ boolean f2641o;
            public final /* synthetic */ boolean p;
            public final /* synthetic */ eu1 q;
            public final /* synthetic */ UUID r;
            public final /* synthetic */ UUID s;

            {
                this.f2641o = z;
                this.p = z2;
                this.q = eu1Var;
                this.r = policyId;
                this.s = groupId;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str2;
                Object next;
                String displayName;
                ns1 ns1Var = (ns1) obj;
                ns1Var.getClass();
                Device device2 = this.m;
                ms1 ms1VarU = et1.U(device2.getFlags());
                String str3 = this.n;
                if (str3 == null) {
                    str3 = ns1Var.b;
                }
                String str4 = str3;
                ls1 ls1Var = ns1Var.c;
                ls1 ls1Var2 = ls1.f1400o;
                ls1 ls1Var3 = ls1.n;
                if (ls1Var != ls1Var3 || ms1VarU == null) {
                    ls1Var2 = (ls1Var == ls1Var2 && ms1VarU == null) ? ls1Var3 : ls1Var;
                }
                String description = this.f2641o ? device2.getDescription() : ns1Var.h;
                List<UUID> groupIds = device2.getGroupIds();
                Iterator<T> it = device2.getManagers().iterator();
                while (true) {
                    str2 = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    EntityManagerListEntry entityManagerListEntry = (EntityManagerListEntry) next;
                    if (!im3.n(entityManagerListEntry.isInvalidManager(), Boolean.TRUE) && entityManagerListEntry.getManagerType() == ManagerType.Company && (displayName = entityManagerListEntry.getDisplayName()) != null && !ub7.b0(displayName)) {
                        break;
                    }
                }
                EntityManagerListEntry entityManagerListEntry2 = (EntityManagerListEntry) next;
                String displayName2 = entityManagerListEntry2 != null ? entityManagerListEntry2.getDisplayName() : null;
                boolean z3 = this.p;
                eu1 eu1Var2 = this.q;
                UUID uuid2 = (!z3 || eu1Var2 == null) ? null : eu1Var2.a;
                if (z3 && eu1Var2 != null) {
                    str2 = eu1Var2.b;
                }
                String str5 = str2;
                DeviceModuleType moduleType = device2.getModuleType();
                if (moduleType == null) {
                    moduleType = ns1Var.j;
                }
                DeviceModuleType deviceModuleType = moduleType;
                String tvVersion = device2.getTvVersion();
                if (tvVersion == null && (tvVersion = device2.getVersion()) == null) {
                    tvVersion = ns1Var.k;
                }
                String str6 = tvVersion;
                DeviceType deviceType = device2.getDeviceType();
                return ns1.a(ns1Var, 0L, str4, ls1Var2, null, ms1VarU, false, description, null, deviceModuleType, str6, displayName2, groupIds, this.r, null, this.s, uuid2, str5, null, deviceType != null ? et1.Q(deviceType) : ns1Var.u, null, 2656601);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j1(Set set, jc1 jc1Var) {
        mu1 mu1Var;
        ns1 ns1Var;
        UUID uuid;
        if (jc1Var instanceof mu1) {
            mu1Var = (mu1) jc1Var;
            int i = mu1Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                mu1Var.p = i - Integer.MIN_VALUE;
            } else {
                mu1Var = new mu1(this, jc1Var);
            }
        } else {
            mu1Var = new mu1(this, jc1Var);
        }
        mu1 mu1Var2 = mu1Var;
        Object obj = mu1Var2.n;
        int i2 = mu1Var2.p;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            du1 du1Var = mu1Var2.m;
            ct1.a0(obj);
            return du1Var;
        }
        ct1.a0(obj);
        du1 du1Var2 = this.O;
        if (du1Var2 == null || (ns1Var = (ns1) this.K.get(du1Var2)) == null || !ns1Var.l || !set.contains(new Long(ns1Var.a)) || (uuid = ns1Var.v) == null) {
            return null;
        }
        mu1Var2.m = du1Var2;
        mu1Var2.p = 1;
        Object objK1 = k1(uuid, false, false, false, mu1Var2);
        Object obj2 = ne1.m;
        return objK1 == obj2 ? obj2 : du1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object k1(UUID uuid, boolean z, boolean z2, boolean z3, hc1 hc1Var) {
        nu1 nu1Var;
        long j;
        boolean z4;
        UUID uuid2;
        boolean z5;
        bu1 bu1Var;
        Device device;
        boolean z6;
        UUID uuid3;
        boolean z7;
        eu1 eu1Var;
        ru1 ru1Var = this;
        boolean z8 = z;
        if (hc1Var instanceof nu1) {
            nu1Var = (nu1) hc1Var;
            int i = nu1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nu1Var.v = i - Integer.MIN_VALUE;
            } else {
                nu1Var = new nu1(ru1Var, hc1Var);
            }
        } else {
            nu1Var = new nu1(ru1Var, hc1Var);
        }
        nu1 nu1Var2 = nu1Var;
        Object objJ0 = nu1Var2.t;
        int i2 = nu1Var2.v;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objJ0);
            bu1 bu1Var2 = new bu1(uuid);
            j = ru1Var.P;
            if (z2) {
                ru1Var.n1(bu1Var2, true);
            }
            sa4 sa4VarT = qf0.t();
            if (z8) {
                sa4VarT.add(DevicePropertyType.Description);
            }
            sa4VarT.add(DevicePropertyType.Flags);
            sa4VarT.add(DevicePropertyType.GroupIds);
            sa4VarT.add(DevicePropertyType.Managers);
            sa4VarT.add(DevicePropertyType.Policies);
            j0 j0Var = new j0((Object) this, (Object) uuid, (Object) qf0.r(sa4VarT), (hc1) null, (byte) 27);
            ru1Var = this;
            nu1Var2.m = uuid;
            nu1Var2.n = bu1Var2;
            nu1Var2.p = z8;
            nu1Var2.q = z2;
            z4 = z3;
            nu1Var2.r = z4;
            nu1Var2.s = j;
            nu1Var2.v = 1;
            objJ0 = im3.j0(ru1Var.x, j0Var, nu1Var2);
            if (objJ0 != ne1Var) {
                uuid2 = uuid;
                z5 = z2;
                bu1Var = bu1Var2;
            }
            return ne1Var;
        }
        if (i2 == 1) {
            long j2 = nu1Var2.s;
            boolean z9 = nu1Var2.r;
            z5 = nu1Var2.q;
            z8 = nu1Var2.p;
            bu1Var = nu1Var2.n;
            uuid2 = nu1Var2.m;
            ct1.a0(objJ0);
            j = j2;
            z4 = z9;
        } else {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = nu1Var2.s;
            boolean z10 = nu1Var2.q;
            boolean z11 = nu1Var2.p;
            Device device2 = nu1Var2.f1601o;
            bu1Var = nu1Var2.n;
            uuid3 = nu1Var2.m;
            ct1.a0(objJ0);
            j = j3;
            z6 = z11;
            device = device2;
            z7 = z10;
        }
        eu1Var = (eu1) objJ0;
        if (j == ru1Var.P) {
            ru1Var.i1(uuid3, device, z6, eu1Var, null);
        }
        z5 = z7;
        if (z5 && j == ru1Var.P) {
            ru1Var.n1(bu1Var, false);
        }
        return f88.a;
        Object obj = ((tc6) objJ0).m;
        Throwable thA = tc6.a(obj);
        if (thA == null) {
            Device device3 = (Device) obj;
            nu1Var2.m = uuid2;
            nu1Var2.n = bu1Var;
            nu1Var2.f1601o = device3;
            nu1Var2.p = z8;
            nu1Var2.q = z5;
            nu1Var2.r = z4;
            nu1Var2.s = j;
            nu1Var2.v = 2;
            Object objG1 = ru1Var.g1(device3, nu1Var2);
            if (objG1 != ne1Var) {
                device = device3;
                objJ0 = objG1;
                z6 = z8;
                uuid3 = uuid2;
                z7 = z5;
                eu1Var = (eu1) objJ0;
                if (j == ru1Var.P) {
                    ru1Var.i1(uuid3, device, z6, eu1Var, null);
                }
                z5 = z7;
            }
            return ne1Var;
        }
        ye4.a("DeviceInfoScreenViewModel", "Failed to load managed device details for " + uuid2 + ": " + thA.getMessage());
        if (z4 && j == ru1Var.P) {
            ru1Var.o1(bu1Var);
        }
        if (z5) {
            ru1Var.n1(bu1Var, false);
        }
        return f88.a;
    }

    public final void m1(long j, boolean z) {
        l97 l97Var;
        Object value;
        ns1 ns1VarY0 = Y0();
        if (ns1VarY0 != null) {
            if (ns1VarY0.a != j) {
                ns1VarY0 = null;
            }
            if (ns1VarY0 == null) {
                return;
            }
            do {
                l97Var = this.z;
                value = l97Var.getValue();
            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, ns1VarY0.c == ls1.f1400o && ns1VarY0.f != null, false, false, false, z, null, null, null, null, false, null, false, null, null, false, false, false, 16775039)));
        }
    }

    public final void n1(bu1 bu1Var, boolean z) {
        l97 l97Var;
        Object value;
        if (im3.n(this.O, bu1Var)) {
            do {
                l97Var = this.z;
                value = l97Var.getValue();
            } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, z, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777183)));
        }
    }

    public final void o1(du1 du1Var) {
        l97 l97Var;
        Object value;
        if (!im3.n(this.O, du1Var) || this.Q.contains(du1Var)) {
            return;
        }
        do {
            l97Var = this.z;
            value = l97Var.getValue();
        } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, false, false, true, false, null, null, null, null, false, null, false, null, null, false, false, false, 16775679)));
    }

    public final void p1() {
        ru1 ru1Var = this;
        ru1Var.R = null;
        la2 la2Var = la2.m;
        ru1Var.S = la2Var;
        n87 n87Var = ru1Var.U;
        if (n87Var != null) {
            n87Var.j(null);
        }
        ru1Var.U = null;
        while (true) {
            l97 l97Var = ru1Var.z;
            Object value = l97Var.getValue();
            la2 la2Var2 = la2Var;
            if (l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, false, false, false, false, "", null, "", la2Var2, false, la2Var2, false, null, null, false, true, true, 528383))) {
                return;
            }
            ru1Var = this;
            la2Var = la2Var2;
        }
    }

    public final void s1(du1 du1Var, List list, Function1 function1) {
        LinkedHashMap linkedHashMap = this.K;
        ns1 ns1Var = (ns1) linkedHashMap.get(du1Var);
        if (ns1Var == null) {
            return;
        }
        long j = ns1Var.a;
        ns1 ns1VarV1 = v1((ns1) function1.invoke(ns1Var), list);
        l97 l97Var = this.J;
        Long l = (Long) l97Var.getValue();
        if (l != null && l.longValue() == j) {
            long j2 = ns1VarV1.a;
            if (j != j2) {
                Long lValueOf = Long.valueOf(j2);
                l97Var.getClass();
                l97Var.l(null, lValueOf);
            }
        }
        linkedHashMap.put(du1Var, ns1VarV1);
        if (im3.n(this.O, du1Var)) {
            u1(ns1VarV1, false);
        }
    }

    public final void t1(List list) {
        l97 l97Var;
        Object value;
        wt1 wt1Var;
        ArrayList arrayList;
        this.L = list;
        do {
            l97Var = this.z;
            value = l97Var.getValue();
            wt1Var = (wt1) value;
            arrayList = new ArrayList(mv0.Z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PolicyData policyData = (PolicyData) it.next();
                arrayList.add(new wn5(policyData.getPolicyId(), policyData.getPolicyName()));
            }
        } while (!l97Var.j(value, wt1.a(wt1Var, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, arrayList, null, false, false, false, 16252927)));
        Iterator it2 = lv0.P0(this.K.keySet()).iterator();
        while (it2.hasNext()) {
            s1((du1) it2.next(), list, new a81(this, (Object) list, (byte) 7));
        }
    }

    public final void u1(ns1 ns1Var, boolean z) {
        l97 l97Var;
        Object value;
        wt1 wt1Var;
        boolean z2;
        Long l;
        do {
            l97Var = this.z;
            value = l97Var.getValue();
            wt1Var = (wt1) value;
            if (z) {
                wt1Var = new wt1(null, wt1Var.f, false, wt1Var.s, 16252863);
            }
            z2 = true;
            if (ns1Var.c != ls1.f1400o || ns1Var.f == null) {
                z2 = false;
            }
            l = (Long) this.J.getValue();
        } while (!l97Var.j(value, wt1.a(wt1Var, false, ns1Var, null, false, false, false, z2, false, false, false, l != null && l.longValue() == ns1Var.a, null, null, null, null, false, null, false, null, null, false, false, false, 16775035)));
    }
}
