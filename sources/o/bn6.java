package o;

import com.teamviewer.apidefinitions.contacts.models.PersonalContact;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactList;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.DevicePoolType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bn6 extends oe8 {
    public final yx6 A;
    public boolean B;
    public Integer C;
    public boolean D;
    public z31 E;
    public final LinkedHashSet F;
    public final LinkedHashSet G;
    public final g95 H;
    public final f41 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hl4 f443o;
    public final nx3 p;
    public final xc0 q;
    public final fe1 r;
    public final l97 s;
    public final t36 t;
    public final l97 u;
    public final t36 v;
    public final yx6 w;
    public final r36 x;
    public final yx6 y;
    public final r36 z;

    public bn6(f41 f41Var) {
        xl4 xl4Var = new xl4();
        nx3 nx3Var = new nx3((byte) 9);
        xc0 xc0Var = new xc0((byte) 18);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        f41Var.getClass();
        gk1Var.getClass();
        this.n = f41Var;
        this.f443o = xl4Var;
        this.p = nx3Var;
        this.q = xc0Var;
        this.r = gk1Var;
        l97 l97VarK = im3.k("");
        this.s = l97VarK;
        this.t = yo1.u(l97VarK);
        ll6 ll6Var = ll6.m;
        ea2 ea2Var = ea2.m;
        l97 l97VarK2 = im3.k(new yl6("", ll6Var, null, false, ea2Var, ea2Var, ea2Var, ea2Var, ea2Var, ea2Var, al6.p, false, ea2Var, false, false, false, null, null, false));
        this.u = l97VarK2;
        this.v = yo1.u(l97VarK2);
        hc1 hc1Var = null;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.w = yx6VarL;
        this.x = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.y = yx6VarL2;
        this.z = new r36(yx6VarL2);
        this.A = au8.l(0, 7, null);
        this.F = new LinkedHashSet();
        this.G = new LinkedHashSet();
        this.H = new g95(this);
        im3.R(e8.n(this), null, null, new rm6(this, hc1Var, (byte) 1), 3);
        im3.R(e8.n(this), gk1Var, null, new rm6(this, hc1Var, (byte) 3), 2);
        im3.R(e8.n(this), gk1Var, null, new rm6(this, hc1Var, (byte) 2), 2);
    }

    public static gl6 W0(bn6 bn6Var, yl6 yl6Var, List list, ArrayList arrayList, List list2, int i) {
        if ((i & 1) != 0) {
            list = yl6Var.g;
        }
        List list3 = arrayList;
        if ((i & 2) != 0) {
            list3 = yl6Var.i;
        }
        List list4 = yl6Var.h;
        if ((i & 8) != 0) {
            list2 = yl6Var.j;
        }
        bn6Var.getClass();
        return new gl6(list, list3, list4, list2);
    }

    public static boolean c1(String str, z31 z31Var) {
        if (z31Var != null) {
            return e1(z31Var);
        }
        if (ub7.b0(str)) {
            return false;
        }
        String strA0 = ds1.a0(str);
        f95 f95Var = (8182 & 256) != 0 ? f95.s : null;
        b41 b41Var = (8182 & 512) != 0 ? b41.s : null;
        hs1 hs1Var = (8182 & 4096) != 0 ? hs1.f1004o : null;
        f95Var.getClass();
        hs1Var.getClass();
        if (b41Var != b41.q && b41Var != b41.r) {
            String string = ub7.x0(strA0).toString();
            if (!ep1.v(string) && (!ds1.T(string) || f95Var == f95.n || f95Var == f95.r)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e1(z31 z31Var) {
        f95 f95Var;
        b41 b41Var = z31Var.j;
        if (b41Var == b41.q || b41Var == b41.r) {
            return true;
        }
        String string = ub7.x0(z31Var.d).toString();
        return ep1.v(string) || !(!ds1.T(string) || (f95Var = z31Var.i) == f95.n || f95Var == f95.r);
    }

    public static UUID g1(String str) {
        Object sc6Var;
        try {
            sc6Var = UUID.fromString(str);
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        if (sc6Var instanceof sc6) {
            sc6Var = null;
        }
        return (UUID) sc6Var;
    }

    public final ArrayList V0(List list) {
        f95 f95Var;
        UUID uuidG1;
        List list2 = ((yl6) this.v.m.getValue()).f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            vd5 vd5Var = null;
            if (!it.hasNext()) {
                break;
            }
            z31 z31Var = (z31) it.next();
            String str = z31Var.e;
            if (str != null && (uuidG1 = g1(str)) != null) {
                vd5Var = new vd5(uuidG1, z31Var.a);
            }
            if (vd5Var != null) {
                arrayList.add(vd5Var);
            }
        }
        Map mapU = xm4.U(arrayList);
        ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DeviceListEntry deviceListEntry = (DeviceListEntry) it2.next();
            deviceListEntry.getClass();
            List<UUID> groupIds = deviceListEntry.getGroupIds();
            ArrayList arrayList3 = new ArrayList();
            for (UUID uuid : groupIds) {
                uuid.getClass();
                String str2 = (String) mapU.get(uuid);
                if (str2 == null || ub7.b0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            String displayName = deviceListEntry.getDisplayName();
            List<UUID> groupIds2 = deviceListEntry.getGroupIds();
            ArrayList arrayList4 = new ArrayList(mv0.Z(groupIds2, 10));
            Iterator<T> it3 = groupIds2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((UUID) it3.next()).toString());
            }
            String strValueOf = String.valueOf(deviceListEntry.getTeamViewerId());
            String string = deviceListEntry.getManagementId().toString();
            DeviceOnlineStatus onlineStatus = deviceListEntry.getOnlineStatus();
            int i = onlineStatus == null ? -1 : a41.b[onlineStatus.ordinal()];
            if (i == -1) {
                f95Var = f95.s;
            } else if (i == 1) {
                f95Var = f95.f778o;
            } else if (i == 2) {
                f95Var = f95.n;
            } else {
                if (i != 3) {
                    gk0.s();
                    return null;
                }
                f95Var = f95.r;
            }
            f95 f95Var2 = f95Var;
            DeviceType deviceType = deviceListEntry.getDeviceType();
            arrayList2.add(new z31(displayName, arrayList3, arrayList4, strValueOf, string, null, null, null, f95Var2, b41.f389o, deviceType != null ? db8.D0(deviceType) : null, null, hs1.n, 2144));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable X0(String str, jc1 jc1Var) {
        tm6 tm6Var;
        Object obj;
        String str2;
        f95 f95Var;
        if (jc1Var instanceof tm6) {
            tm6Var = (tm6) jc1Var;
            int i = tm6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm6Var.p = i - Integer.MIN_VALUE;
            } else {
                tm6Var = new tm6(this, jc1Var);
            }
        } else {
            tm6Var = new tm6(this, jc1Var);
        }
        Object obj2 = tm6Var.n;
        int i2 = tm6Var.p;
        if (i2 == 0) {
            ct1.a0(obj2);
            tm6Var.m = str;
            tm6Var.p = 1;
            Object objK = this.q.K(str, tm6Var);
            ne1 ne1Var = ne1.m;
            if (objK == ne1Var) {
                return ne1Var;
            }
            obj = objK;
            str2 = str;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = tm6Var.m;
            ct1.a0(obj2);
            obj = ((tc6) obj2).m;
        }
        Throwable thA = tc6.a(obj);
        if (thA != null) {
            ua5.v("Failed to fetch contacts: ", thA.getMessage(), "SearchViewModel");
            return ea2.m;
        }
        List<PersonalContact> items = ((PersonalContactList) obj).getItems();
        ArrayList<PersonalContact> arrayList = new ArrayList();
        for (Object obj3 : items) {
            if (ub7.Q(((PersonalContact) obj3).getName(), str2, true)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        for (PersonalContact personalContact : arrayList) {
            personalContact.getClass();
            String name = personalContact.getName();
            String groupName = personalContact.getGroupName();
            if (groupName == null || ub7.b0(groupName)) {
                groupName = null;
            }
            List listM = qf0.M(groupName);
            Integer groupId = personalContact.getGroupId();
            List listM2 = qf0.M(groupId != null ? String.valueOf(groupId.intValue()) : null);
            String strValueOf = String.valueOf(personalContact.getPersonalContactId());
            int accountId = personalContact.getAccountId();
            String pictureUrl = personalContact.getPictureUrl();
            String strL = (pictureUrl == null || ub7.b0(pictureUrl)) ? null : bc7.L(pictureUrl, "[size]", "128");
            String email = personalContact.getEmail();
            int i3 = a41.a[personalContact.getStatus().ordinal()];
            if (i3 == 1) {
                f95Var = f95.f778o;
            } else if (i3 == 2) {
                f95Var = f95.n;
            } else if (i3 == 3) {
                f95Var = f95.m;
            } else if (i3 == 4) {
                f95Var = f95.p;
            } else {
                if (i3 != 5) {
                    gk0.s();
                    return null;
                }
                f95Var = f95.q;
            }
            arrayList2.add(new z31(name, listM, listM2, strValueOf, null, Integer.valueOf(accountId), email, strL, f95Var, b41.m, null, null, null, 7168));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r1 == r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
    
        if (r1 == r12) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Y0(o.z31 r42, o.jc1 r43) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bn6.Y0(o.z31, o.jc1):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable Z0(String str, jc1 jc1Var) {
        vm6 vm6Var;
        Object objT;
        if (jc1Var instanceof vm6) {
            vm6Var = (vm6) jc1Var;
            int i = vm6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                vm6Var.p = i - Integer.MIN_VALUE;
            } else {
                vm6Var = new vm6(this, jc1Var);
            }
        } else {
            vm6Var = new vm6(this, jc1Var);
        }
        Object obj = vm6Var.n;
        int i2 = vm6Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            vm6Var.m = str;
            vm6Var.p = 1;
            objT = this.p.t(str, null, vm6Var);
            ne1 ne1Var = ne1.m;
            if (objT == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = vm6Var.m;
            ct1.a0(obj);
            objT = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objT);
        if (thA != null) {
            ua5.v("Failed to fetch legacy devices: ", thA.getMessage(), "SearchViewModel");
            return ea2.m;
        }
        List<Device> items = ((DeviceListResponse) objT).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (!this.G.contains(String.valueOf(((Device) obj2).getTeamViewerId()))) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            Device device = (Device) obj3;
            if (ub7.Q(device.getDisplayName(), str, true) || ub7.Q(String.valueOf(device.getTeamViewerId()), bc7.L(str, " ", ""), true)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(db8.F0((Device) it.next()));
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a1(String str, jc1 jc1Var) {
        wm6 wm6Var;
        Object objD;
        String str2;
        if (jc1Var instanceof wm6) {
            wm6Var = (wm6) jc1Var;
            int i = wm6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm6Var.p = i - Integer.MIN_VALUE;
            } else {
                wm6Var = new wm6(this, jc1Var);
            }
        } else {
            wm6Var = new wm6(this, jc1Var);
        }
        Object obj = wm6Var.n;
        int i2 = wm6Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            List list = ((yl6) this.v.m.getValue()).f;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = ((z31) it.next()).e;
                UUID uuidG1 = str3 != null ? g1(str3) : null;
                if (uuidG1 != null) {
                    arrayList.add(uuidG1);
                }
            }
            DeviceFilteringModel deviceFilteringModel = new DeviceFilteringModel(DevicePoolType.Combined, !arrayList.isEmpty() ? arrayList : null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554396, null);
            wm6Var.m = str;
            wm6Var.p = 1;
            objD = ((xl4) this.f443o).d(deviceFilteringModel, wm6Var);
            ne1 ne1Var = ne1.m;
            if (objD == ne1Var) {
                return ne1Var;
            }
            str2 = str;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = wm6Var.m;
            ct1.a0(obj);
            objD = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objD);
        if (thA != null) {
            ua5.v("Failed to fetch managed devices: ", thA.getMessage(), "SearchViewModel");
            return ea2.m;
        }
        List<DeviceListEntry> items = ((com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse) objD).getItems();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : items) {
            if (!this.F.contains(((DeviceListEntry) obj2).getManagementId().toString())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            DeviceListEntry deviceListEntry = (DeviceListEntry) obj3;
            if (ub7.Q(deviceListEntry.getDisplayName(), str2, true) || ub7.Q(String.valueOf(deviceListEntry.getTeamViewerId()), bc7.L(str2, " ", ""), true)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public final List b1(String str) {
        return bq6.l0(new h18(new fl2(lv0.g0(((yl6) this.v.m.getValue()).e), true, new fy(str, (byte) 15)), new fk6((byte) 4)));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:22:0x0048->B:37:?, LOOP_END, SYNTHETIC] */
    public final z31 d1(String str, gl6 gl6Var, ll6 ll6Var) {
        z31 z31Var;
        z31 z31Var2;
        z31 z31Var3 = null;
        Object obj = null;
        if (ub7.b0(str)) {
            return null;
        }
        List listA0 = gl6Var.b;
        List list = gl6Var.c;
        List list2 = gl6Var.d;
        ll6Var.getClass();
        int iOrdinal = ll6Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    listA0 = list;
                } else {
                    if (iOrdinal != 3) {
                        gk0.s();
                        return null;
                    }
                    listA0 = list2;
                }
            }
            z31Var = this.E;
            if (z31Var != null) {
                for (Object obj2 : listA0) {
                    if (g68.s((z31) obj2, z31Var)) {
                        obj = obj2;
                        break;
                    }
                }
                z31Var3 = (z31) obj;
            }
            if (z31Var3 == null) {
                return z31Var3;
            }
            z31Var2 = (z31) lv0.o0(listA0);
            if (z31Var2 == null) {
                return new z31(str, null, null, ds1.a0(str), null, null, null, null, null, null, null, null, null, 8182);
            }
            return z31Var2;
        }
        listA0 = lv0.A0(lv0.A0(lv0.A0(gl6Var.a, listA0), list), list2);
        z31Var = this.E;
        if (z31Var != null) {
            while (r3.hasNext()) {
                if (g68.s((z31) obj2, z31Var)) {
                    obj = obj2;
                    break;
                }
            }
            z31Var3 = (z31) obj;
        }
        if (z31Var3 == null) {
            return z31Var3;
        }
        z31Var2 = (z31) lv0.o0(listA0);
        if (z31Var2 == null) {
            return new z31(str, null, null, ds1.a0(str), null, null, null, null, null, null, null, null, null, 8182);
        }
        return z31Var2;
    }

    public final void f1() {
        l97 l97Var;
        Object value;
        yl6 yl6Var;
        do {
            l97Var = this.u;
            value = l97Var.getValue();
            yl6Var = (yl6) value;
            yl6Var.getClass();
        } while (!l97Var.j(value, yl6.a(yl6Var, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, true, null, null, false, 2064383)));
    }

    public final void h1() {
        al6 al6Var;
        l97 l97Var = this.u;
        yl6 yl6Var = (yl6) l97Var.getValue();
        gl6 gl6VarW0 = W0(this, yl6Var, null, null, null, 15);
        String str = yl6Var.a;
        boolean zC1 = c1(str, d1(str, gl6VarW0, yl6Var.b));
        boolean z = yl6Var.s;
        boolean z2 = (gl6VarW0.a.isEmpty() && gl6VarW0.b.isEmpty() && gl6VarW0.c.isEmpty() && gl6VarW0.d.isEmpty()) ? false : true;
        if (z) {
            al6Var = al6.m;
        } else if (str.length() != 0 || z2) {
            al6Var = (str.length() <= 0 || z2 || zC1) ? al6.p : al6.f335o;
        } else {
            al6Var = al6.n;
        }
        ye4.a("SearchViewModel", "SearchState: loading=" + z + ", state=" + al6Var);
        while (true) {
            Object value = l97Var.getValue();
            yl6 yl6Var2 = (yl6) value;
            yl6Var2.getClass();
            al6 al6Var2 = al6Var;
            if (l97Var.j(value, yl6.a(yl6Var2, null, null, null, false, null, null, null, null, null, null, al6Var2, false, null, false, false, false, null, null, false, 2096127))) {
                return;
            } else {
                al6Var = al6Var2;
            }
        }
    }

    public final void i1(String str) {
        j1(new x9(ub7.x0(str).toString().length() == 0, this, str));
        l97 l97Var = this.s;
        l97Var.getClass();
        l97Var.l(null, str);
        h1();
    }

    public final void j1(Function1 function1) {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.u;
            value = l97Var.getValue();
        } while (!l97Var.j(value, (yl6) function1.invoke((yl6) value)));
    }
}
