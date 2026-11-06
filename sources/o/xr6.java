package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.text.Collator;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class xr6 extends oe8 {
    public final l07 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fe1 f2546o;
    public final cj3 p;
    public final Clock q;
    public final l97 r;
    public final t36 s;
    public final yx6 t;
    public final r36 u;
    public final a65 v;
    public Integer w;
    public Integer x;
    public n87 y;
    public final LinkedHashSet z;

    /* JADX WARN: Multi-variable type inference failed */
    public xr6(int i) {
        jk0 jk0Var = new jk0((byte) 27);
        q85 q85Var = q85.a;
        l07 l07Var = new l07((byte) 9);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        cj3 cj3Var = new cj3((Object) jk0Var, (Object) l07Var, (byte) 4);
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        gk1Var.getClass();
        this.n = l07Var;
        this.f2546o = gk1Var;
        this.p = cj3Var;
        this.q = clockSystemUTC;
        l97 l97VarK = im3.k(new or6(ea2.m, null, true, false, false, false, false, false, rr6.m, 0, 0));
        this.r = l97VarK;
        this.s = yo1.u(l97VarK);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.t = yx6VarL;
        this.u = new r36(yx6VarL);
        this.v = new a65((byte) 7, (Object) new wr6(this, null), (Object) new fk6((byte) 28), false);
        this.z = new LinkedHashSet();
        im3.R(e8.n(this), null, null, new vr6(this, null, 0 == true ? 1 : 0), 3);
        Y0(true);
    }

    public static or6 a1(or6 or6Var, int i) {
        Object next;
        List list = or6Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SupportSession) obj).getSessioncode() != i) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SupportSession supportSession = (SupportSession) next;
            SupportSession supportSession2 = or6Var.b;
            if (supportSession2 != null && supportSession.getSessioncode() == supportSession2.getSessioncode()) {
                break;
            }
        }
        SupportSession supportSession3 = (SupportSession) next;
        return or6.a(or6Var, arrayList, supportSession3, false, false, or6Var.e && supportSession3 != null, or6Var.f && supportSession3 != null, or6Var.g && supportSession3 != null, false, null, 0, 0, 1928);
    }

    public static List c1(List list, rr6 rr6Var) {
        ox0 ox0Var;
        fk6 fk6Var = new fk6((byte) 29);
        Locale locale = Locale.ROOT;
        locale.getClass();
        Collator collator = Collator.getInstance(locale);
        byte b = 0;
        collator.setStrength(0);
        ox0 ox0Var2 = new ox0(fk6Var, collator, (byte) 1);
        byte b2 = 4;
        Comparator ix0Var = new ix0(ox0Var2, b2);
        int iOrdinal = rr6Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                byte b3 = 3;
                if (iOrdinal == 2) {
                    ox0Var = new ox0(new dj6(b3), ix0Var, b);
                } else {
                    if (iOrdinal != 3) {
                        gk0.s();
                        return null;
                    }
                    ox0Var = new ox0(new dj6(b2), ix0Var, b);
                }
                ix0Var = ox0Var;
            } else {
                ix0Var = ix0Var.reversed();
            }
        }
        ix0Var.getClass();
        return lv0.J0(list, ix0Var);
    }

    public final void V0() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, or6.a((or6) value, null, null, false, false, false, false, false, false, null, 0, 0, 1981)));
    }

    public final void W0(d37 d37Var) {
        im3.R(e8.n(this), null, null, new vt4(this, d37Var, null, (byte) 19), 3);
    }

    public final void X0(int i) {
        Object value;
        List list;
        Object value2;
        this.z.add(Integer.valueOf(i));
        Integer num = this.w;
        l97 l97Var = this.r;
        if (num != null && num.intValue() == i && ((list = ((or6) l97Var.getValue()).a) == null || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((SupportSession) it.next()).getSessioncode() == i) {
                    this.x = Integer.valueOf(i);
                    do {
                        value2 = l97Var.getValue();
                    } while (!l97Var.j(value2, or6.a((or6) value2, null, null, false, false, false, false, false, true, null, 0, 0, 1915)));
                    return;
                }
            }
        }
        do {
            value = l97Var.getValue();
        } while (!l97Var.j(value, a1((or6) value, i)));
    }

    public final void Y0(boolean z) {
        n87 n87Var = this.y;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.y = im3.R(e8.n(this), null, null, new g6(z, this, (hc1) null), 3);
    }

    public final void Z0() {
        l97 l97Var;
        Object value;
        List list = ((or6) this.s.m.getValue()).a;
        ArrayList<SupportSession> arrayList = new ArrayList();
        for (Object obj : list) {
            if (h57.o((SupportSession) obj, this.q)) {
                arrayList.add(obj);
            }
        }
        for (SupportSession supportSession : arrayList) {
            X0(supportSession.getSessioncode());
            do {
                l97Var = this.r;
                value = l97Var.getValue();
            } while (!l97Var.j(value, a1((or6) value, supportSession.getSessioncode())));
        }
    }

    public final void b1(SupportSession supportSession) {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
        } while (!l97Var.j(value, or6.a((or6) value, null, supportSession != null ? h57.E(supportSession) : null, false, false, false, false, false, false, null, 0, 0, 2045)));
    }

    public final void d1() {
        l97 l97Var;
        Object value;
        or6 or6Var;
        do {
            l97Var = this.r;
            value = l97Var.getValue();
            or6Var = (or6) value;
        } while (!l97Var.j(value, or6.a(or6Var, null, null, false, false, !or6Var.e, false, false, false, null, 0, 0, 2031)));
    }

    public xr6() {
        this(0);
    }
}
