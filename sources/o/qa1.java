package o;

import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qa1 extends oe8 {
    public final r36 A;
    public Integer B;
    public boolean C;
    public Integer D;
    public Integer E;
    public final xc0 F;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xc0 f1814o;
    public final f41 p;
    public final fe1 q;
    public final l97 r;
    public final t36 s;
    public final iu t;
    public List u;
    public List v;
    public List w;
    public final yx6 x;
    public final r36 y;
    public final yx6 z;

    public qa1(int i, f41 f41Var, int i2) {
        byte b = 0;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        xc0 xc0Var = new xc0((byte) 18);
        hc1 hc1Var = null;
        f41 f41Var2 = (i2 & 4) != 0 ? null : f41Var;
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        gk1Var.getClass();
        this.n = i3;
        this.f1814o = xc0Var;
        this.p = f41Var2;
        this.q = gk1Var;
        ea2 ea2Var = ea2.m;
        l97 l97VarK = im3.k(new ka1(ea2Var, ea2Var, false, false, false, false, false, false, a91.m, l71.n, 0, 0, false, null, false, ea2Var, false, false));
        this.r = l97VarK;
        this.s = yo1.u(l97VarK);
        this.t = new iu((Object) xc0Var, (Object) e8.n(this), (Object) gk1Var, (byte) 16);
        this.u = ea2Var;
        this.v = ea2Var;
        this.w = ea2Var;
        yx6 yx6VarL = au8.l(0, 7, null);
        this.x = yx6VarL;
        this.y = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.z = yx6VarL2;
        this.A = new r36(yx6VarL2);
        this.F = new xc0((Object) this, (byte) 19);
        im3.R(e8.n(this), gk1Var, null, new la1(this, hc1Var, (byte) 2), 2);
        if (this.v.isEmpty()) {
            Y0(b91.n);
        }
        im3.R(e8.n(this), null, null, new na1(this, hc1Var, b), 3);
        if (this.w.isEmpty()) {
            Y0(b91.f407o);
        }
        im3.R(e8.n(this), null, null, new na1(this, hc1Var, (byte) 1), 3);
        im3.R(e8.n(this), gk1Var, null, new la1(this, hc1Var, b), 2);
    }

    public static List X0(List list, l71 l71Var) {
        int iOrdinal = l71Var.ordinal();
        if (iOrdinal == 0) {
            return list;
        }
        if (iOrdinal == 1) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((h71) obj).t == b91.m) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (iOrdinal == 2) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((h71) obj2).t == b91.n) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        if (iOrdinal != 3) {
            gk0.s();
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((h71) obj3).t == b91.f407o) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static List a1(List list, a91 a91Var) {
        Map mapR;
        byte b = 0;
        byte b2 = 1;
        int iOrdinal = a91Var.ordinal();
        if (iOrdinal != 2) {
            mapR = iOrdinal != 3 ? null : xm4.R(new vd5(ContactOnlineStatus.Offline, 0), new vd5(ContactOnlineStatus.Standby, 1), new vd5(ContactOnlineStatus.Busy, 2), new vd5(ContactOnlineStatus.Away, 3), new vd5(ContactOnlineStatus.Online, 4));
        } else {
            mapR = xm4.R(new vd5(ContactOnlineStatus.Online, 0), new vd5(ContactOnlineStatus.Away, 1), new vd5(ContactOnlineStatus.Busy, 2), new vd5(ContactOnlineStatus.Standby, 3), new vd5(ContactOnlineStatus.Offline, 4));
        }
        h31 h31Var = new h31((byte) 9);
        Locale locale = Locale.ROOT;
        locale.getClass();
        Collator collator = Collator.getInstance(locale);
        collator.setStrength(0);
        Comparator ox0Var = new ox0(h31Var, collator, b2);
        int iOrdinal2 = a91Var.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                ox0Var = ox0Var.reversed();
            } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                ox0Var = new ox0(new pa1(new gj2((byte) 11), mapR), ox0Var, b);
            } else {
                if (iOrdinal2 != 4) {
                    gk0.s();
                    return null;
                }
                ox0Var = new ox0(new gj2((byte) 12), ox0Var, b);
            }
        }
        ox0Var.getClass();
        return lv0.J0(list, ox0Var);
    }

    public static void b1(qa1 qa1Var, int i) {
        Object value;
        ka1 ka1Var;
        boolean z;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (i & 1) != 0 ? null : bool;
        Boolean bool3 = (i & 2) != 0 ? null : bool;
        if ((i & 4) != 0) {
            bool = null;
        }
        l97 l97Var = qa1Var.r;
        ArrayList arrayListA0 = lv0.A0(lv0.A0(qa1Var.u, qa1Var.v), qa1Var.w);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA0) {
            if (hashSet.add(Integer.valueOf(((h71) obj).m))) {
                arrayList.add(obj);
            }
        }
        List listA1 = a1(X0(arrayList, ((ka1) l97Var.getValue()).j), ((ka1) l97Var.getValue()).i);
        do {
            value = l97Var.getValue();
            ka1Var = (ka1) value;
            z = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((h71) it.next()).t == b91.n) {
                        z = true;
                        break;
                    }
                }
            }
        } while (!l97Var.j(value, ka1.a(ka1Var, arrayList, listA1, bool2 != null ? bool2.booleanValue() : ka1Var.c, bool3 != null ? bool3.booleanValue() : ka1Var.d, bool != null ? bool.booleanValue() : ka1Var.e, false, false, z, null, null, 0, 0, false, null, false, null, false, false, 261984)));
    }

    public final void V0() {
        l97 l97Var;
        Object value;
        this.B = null;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, false, null, false, ea2.m, false, false, 147455)));
    }

    public final void W0() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, ka1.a((ka1) value, null, null, false, false, false, false, false, false, null, null, 0, 0, false, null, false, null, false, false, 249855)));
    }

    public final void Y0(b91 b91Var) {
        Object value;
        Object value2;
        Object value3;
        int iOrdinal = b91Var.ordinal();
        l97 l97Var = this.r;
        if (iOrdinal == 0) {
            do {
                value = l97Var.getValue();
            } while (!l97Var.j(value, ka1.a((ka1) value, null, null, true, false, false, false, false, false, null, null, 0, 0, false, null, false, null, false, false, 262139)));
        } else if (iOrdinal == 1) {
            do {
                value2 = l97Var.getValue();
            } while (!l97Var.j(value2, ka1.a((ka1) value2, null, null, false, true, false, false, false, false, null, null, 0, 0, false, null, false, null, false, false, 262135)));
        } else if (iOrdinal != 2) {
            gk0.s();
        } else {
            do {
                value3 = l97Var.getValue();
            } while (!l97Var.j(value3, ka1.a((ka1) value3, null, null, false, false, true, false, false, false, null, null, 0, 0, false, null, false, null, false, false, 262127)));
        }
    }

    public final boolean Z0(int i) {
        Integer num = this.D;
        boolean z = num != null && num.intValue() == i;
        Integer num2 = this.B;
        return z || (num2 != null && num2.intValue() == i && ((ka1) this.r.getValue()).f1244o);
    }

    public qa1() {
        this(0, null, 15);
    }
}
