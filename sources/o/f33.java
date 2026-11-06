package o;

import java.text.Collator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class f33 extends oe8 {
    public static final long H;
    public static final /* synthetic */ int I = 0;
    public n87 A;
    public n87 B;
    public final l97 C;
    public final t36 D;
    public final t36 E;
    public final r36 F;
    public final j23 G;
    public final f41 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hl4 f764o;
    public final nx3 p;
    public final cr q;
    public final wj5 r;
    public final fe1 s;
    public final Long t;
    public final d11 u;
    public final l97 v;
    public final l97 w;
    public final l97 x;
    public String y;
    public gl4 z;

    static {
        aw awVar = c72.n;
        H = lq1.K(250, g72.MILLISECONDS);
    }

    public f33(f41 f41Var) {
        xl4 xl4Var = new xl4();
        nx3 nx3Var = new nx3((byte) 9);
        cr crVar = new cr((byte) 27);
        q85 q85Var = q85.a;
        wj5 wj5Var = new wj5((byte) 17);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        d11 d11Var = new d11(xl4Var, nx3Var);
        f41Var.getClass();
        gk1Var.getClass();
        this.n = f41Var;
        this.f764o = xl4Var;
        this.p = nx3Var;
        this.q = crVar;
        this.r = wj5Var;
        this.s = gk1Var;
        this.t = 30000L;
        this.u = d11Var;
        hc1 hc1Var = null;
        this.v = im3.k(null);
        this.w = im3.k(null);
        this.x = im3.k(null);
        this.y = "";
        this.z = new gl4(false, false, false, false);
        byte b = 4;
        l97 l97VarK = im3.k(new v23((16383 & 1) != 0 ? ea2.m : null, false, (16383 & 4) != 0, false, "", false, m13.f1425o, false, false, false, false, false, 0, 0));
        this.C = l97VarK;
        this.D = yo1.u(l97VarK);
        this.E = (t36) d11Var.p;
        this.F = (r36) d11Var.r;
        this.G = new j23(xl4Var, nx3Var, e8.n(this), gk1Var);
        im3.R(e8.n(this), gk1Var, null, new z23(this, hc1Var, b), 2);
        im3.R(e8.n(this), gk1Var, null, new z23(this, hc1Var, (byte) 3), 2);
        im3.R(e8.n(this), null, null, new z23(this, hc1Var, (byte) 2), 3);
        im3.R(e8.n(this), null, null, new z23(this, hc1Var, (byte) 5), 3);
        im3.R(e8.n(this), null, null, new z23(this, hc1Var, (byte) 6), 3);
    }

    public final void V0(m13 m13Var) {
        Object value;
        Object value2;
        k33 k33Var = (k33) this.v.getValue();
        l97 l97Var = this.C;
        if (((v23) l97Var.getValue()).h) {
            do {
                value2 = l97Var.getValue();
            } while (!l97Var.j(value2, W0(v23.a((v23) value2, null, false, false, false, null, false, m13Var, false, false, false, false, false, 0, 0, 16319))));
            return;
        }
        do {
            value = l97Var.getValue();
        } while (!l97Var.j(value, W0(v23.a((v23) value, null, false, false, false, null, false, null, false, false, false, true, false, 0, 0, 15103))));
        n87 n87Var = this.A;
        hc1 hc1Var = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.A = im3.R(e8.n(this), null, null, new ko2((Object) this, (Object) k33Var, (Object) m13Var, hc1Var, (byte) 4), 3);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    public final v23 W0(v23 v23Var) {
        List listD;
        boolean zBooleanValue;
        boolean z;
        ox0 ox0Var;
        k33 k33Var = (k33) this.v.getValue();
        boolean z2 = k33Var instanceof i33;
        byte b = 0;
        byte b2 = 1;
        j23 j23Var = this.G;
        if (!z2) {
            listD = j23Var.d(k33Var);
        } else if (v23Var.h) {
            List listD2 = j23Var.d(k33Var);
            m13 m13Var = v23Var.g;
            ji2 ji2Var = new ji2((byte) 13);
            Locale locale = Locale.ROOT;
            locale.getClass();
            Collator collator = Collator.getInstance(locale);
            collator.setStrength(0);
            Comparator ox0Var2 = new ox0(ji2Var, collator, b2);
            int iOrdinal = m13Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        ox0Var = new ox0(new gj2((byte) 16), ox0Var2, b);
                    } else {
                        if (iOrdinal != 3) {
                            gk0.s();
                            return null;
                        }
                        ox0Var = new ox0(new gj2((byte) 17), ox0Var2, b);
                    }
                    ox0Var2 = ox0Var;
                } else {
                    ox0Var2 = ox0Var2.reversed();
                }
            }
            ox0Var2.getClass();
            listD = lv0.J0(listD2, ox0Var2);
        } else {
            listD = ea2.m;
        }
        boolean z3 = v23Var.d;
        String str = v23Var.e;
        boolean z4 = z3 && !ub7.b0(str);
        boolean zN = im3.n(this.y, ub7.x0(str).toString());
        List list = z4 ? (List) j23Var.j.m.getValue() : listD;
        boolean zIsEmpty = listD.isEmpty();
        if (!z4) {
            if (!z2 || !v23Var.k) {
                j23Var.getClass();
                if (k33Var == null) {
                    zBooleanValue = ((Boolean) j23Var.k.getValue()).booleanValue();
                } else if (k33Var instanceof i33) {
                    zBooleanValue = ((Boolean) j23Var.m.getValue()).booleanValue();
                } else {
                    if (!(k33Var instanceof j33) && !(k33Var instanceof h33)) {
                        gk0.s();
                        return null;
                    }
                    zBooleanValue = ((Boolean) j23Var.k.getValue()).booleanValue();
                }
                if (!zBooleanValue) {
                    z = false;
                }
            }
            z = true;
        } else if (((Boolean) j23Var.p.m.getValue()).booleanValue() || !zN) {
            z = true;
        } else {
            z = false;
        }
        return v23.a(v23Var, list, z, zIsEmpty, false, null, z4, null, false, false, false, false, false, 0, 0, 16344);
    }

    public final void X0(long j) {
        l97 l97Var = this.x;
        Long l = (Long) l97Var.getValue();
        if (l != null && l.longValue() == j) {
            l97Var.k(null);
        }
        w23 w23Var = new w23(j, false);
        j23 j23Var = this.G;
        j23Var.getClass();
        j23Var.p(w23Var);
        j23Var.o(w23Var);
        j23Var.q(w23Var);
        b1();
    }

    public final void Y0() {
        l97 l97Var;
        Object value;
        this.y = "";
        j23 j23Var = this.G;
        y13 y13Var = new y13(j23Var.t, "");
        j23Var.u = y13Var;
        j23Var.n(y13Var);
        do {
            l97Var = this.C;
            value = l97Var.getValue();
        } while (!l97Var.j(value, W0(v23.a((v23) value, null, false, false, false, "", false, null, false, false, false, false, false, 0, 0, 16359))));
    }

    public final ns1 Z0(long j) {
        Object next;
        j23 j23Var = this.G;
        Iterator it = lv0.A0(lv0.A0((Collection) j23Var.e.getValue(), (Iterable) j23Var.g.getValue()), (Iterable) j23Var.i.getValue()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ns1) next).a == j) {
                return (ns1) next;
            }
        }
        next = null;
        return (ns1) next;
    }

    public final void a1() {
        v23 v23Var = (v23) this.C.getValue();
        if (v23Var.d && !ub7.b0(this.y) && im3.n(this.y, ub7.x0(v23Var.e).toString())) {
            String str = this.y;
            j23 j23Var = this.G;
            j23Var.getClass();
            gu0 gu0Var = j23Var.c;
            str.getClass();
            if (ub7.b0(str)) {
                return;
            }
            y13 y13Var = new y13(j23Var.t, str);
            iw7 iw7Var = j23Var.x;
            long j = j23Var.C + 1;
            j23Var.C = j;
            g76 g76Var = new g76();
            im3.R(gu0Var, null, null, new ab1(j23Var, new iw7(j23Var.d, gu0Var, 200, new b23(y13Var, j23Var, (hc1) null), new jb(new f42(g76Var, (byte) 2), (byte) 3)), g76Var, j, y13Var, iw7Var, null, (byte) 2), 3);
        }
    }

    public final void b1() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.C;
            value = l97Var.getValue();
        } while (!l97Var.j(value, W0((v23) value)));
    }

    public final void c1(long j) {
        hs1 hs1Var;
        ns1 ns1VarZ0 = Z0(j);
        Boolean boolValueOf = ns1VarZ0 != null ? Boolean.valueOf(ns1VarZ0.l) : null;
        if (im3.n(boolValueOf, Boolean.TRUE)) {
            hs1Var = hs1.n;
        } else if (im3.n(boolValueOf, Boolean.FALSE)) {
            hs1Var = hs1.m;
        } else {
            if (boolValueOf != null) {
                gk0.s();
                return;
            }
            hs1Var = hs1.f1004o;
        }
        f41.e(this.n, String.valueOf(j), hs1Var, false, null, null, 56);
    }

    public final void d1(long j) {
        im3.R(e8.n(this), this.s, null, new e33(this, j, null, (byte) 1), 2);
    }

    public final void e1(UUID uuid) {
        Object next;
        j23 j23Var = this.G;
        j23Var.getClass();
        uuid.getClass();
        Iterator it = lv0.A0((Collection) j23Var.e.getValue(), (Iterable) j23Var.i.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!im3.n(((ns1) next).v, uuid));
        ns1 ns1Var = (ns1) next;
        if (ns1Var != null) {
            d1(ns1Var.a);
        }
    }

    public final void f1() {
        l97 l97Var = this.C;
        boolean z = ((v23) l97Var.getValue()).d;
        j23 j23Var = this.G;
        if (z && !ub7.b0(((v23) l97Var.getValue()).e)) {
            if (j23.j(j23Var.x)) {
                ye4.a("GroupDevicesScreenViewModel", "tryLoadMoreSearchDevices()");
            }
        } else if (!(this.v.getValue() instanceof i33) && j23.j(j23Var.v)) {
            ye4.a("GroupDevicesScreenViewModel", "tryLoadMoreManagedDevices()");
        }
    }
}
