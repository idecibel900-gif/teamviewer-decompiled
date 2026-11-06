package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p56 extends n01 {
    public final ml a;
    public final ep3 b;
    public final Object c;
    public bp3 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public kx4 h;
    public final xx4 i;
    public final ArrayList j;
    public final ArrayList k;
    public final jx4 l;
    public final yt2 m;
    public final jx4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jx4 f1707o;
    public ArrayList p;
    public kx4 q;
    public gl0 r;
    public final l97 s;
    public boolean t;
    public final l97 u;
    public final ep3 v;
    public final dp3 w;
    public final de1 x;
    public final el5 y;
    public static final l97 z = im3.k(ik5.p);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public p56(de1 de1Var) {
        ml mlVar = new ml(new k56(this, (byte) 0));
        this.a = mlVar;
        this.b = new ep3(new k56(this, (byte) 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new kx4();
        this.i = new xx4(new s01[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new jx4();
        this.m = new yt2((byte) 29);
        this.n = new jx4();
        this.f1707o = new jx4();
        this.s = im3.k(null);
        this.u = im3.k(m56.f1437o);
        this.v = new ep3((byte) 24);
        dp3 dp3Var = new dp3((bp3) de1Var.l0(z06.z));
        dp3Var.o0(new y46((Object) this, (byte) 2));
        this.w = dp3Var;
        this.x = de1Var.H0(mlVar).H0(dp3Var);
        this.y = new el5((byte) 3);
    }

    public static final void G(ArrayList arrayList, p56 p56Var, s01 s01Var) {
        arrayList.clear();
        synchronized (p56Var.c) {
            Iterator it = p56Var.k.iterator();
            if (it.hasNext()) {
                ((pu4) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(ox4 ox4Var) {
        try {
            if (ox4Var.w() instanceof p47) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            ox4Var.c();
        } catch (Throwable th) {
            ox4Var.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.f2559o != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((yx) ((yc4) this.b.f733o).f2598o).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.f2559o != 0 || z() || B();
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? ea2.m : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        fl0 fl0VarY;
        synchronized (this.c) {
            fl0VarY = y();
            if (((m56) this.u.getValue()).compareTo(m56.n) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (fl0VarY != null) {
            ((gl0) fl0VarY).resumeWith(f88.a);
        }
    }

    public final void F(s01 s01Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((pu4) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, kx4 kx4Var) {
        ox4 ox4VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((pu4) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            s01 s01Var = (s01) entry.getKey();
            List list2 = (List) entry.getValue();
            if (s01Var.H.F) {
                i01.a("Check failed");
            }
            y46 y46Var = new y46((Object) s01Var, (byte) 1);
            py5 py5Var = new py5((Object) s01Var, (Object) kx4Var, (byte) 2);
            n47 n47VarH = v47.h();
            ox4 ox4Var = n47VarH instanceof ox4 ? (ox4) n47VarH : null;
            if (ox4Var == null || (ox4VarC = ox4Var.C(y46Var, py5Var)) == null) {
                hk0.l("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                n47 n47VarJ = ox4VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                pu4 pu4Var = (pu4) list2.get(i2);
                                jx4 jx4Var = this.l;
                                pu4Var.getClass();
                                Object objA = rv4.a(jx4Var);
                                arrayList.add(new vd5(pu4Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                vd5 vd5Var = (vd5) arrayList.get(i3);
                                if (vd5Var.n == null) {
                                    yt2 yt2Var = this.m;
                                    ((pu4) vd5Var.m).getClass();
                                    if (((jx4) yt2Var.n).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            vd5 vd5Var2 = (vd5) arrayList.get(i4);
                                            if (vd5Var2.n == null) {
                                                yt2 yt2Var2 = this.m;
                                                ((pu4) vd5Var2.m).getClass();
                                                jx4 jx4Var2 = (jx4) yt2Var2.n;
                                                if (jx4Var2.i()) {
                                                    ((jx4) yt2Var2.f2642o).a();
                                                }
                                            }
                                            arrayList3.add(vd5Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((vd5) arrayList.get(i5)).n != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((vd5) arrayList.get(i6)).n == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        vd5 vd5Var3 = (vd5) arrayList.get(i7);
                                        if (vd5Var3.n == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        qv0.c0(this.k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((vd5) obj2).n != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    s01Var.r(arrayList);
                    n47.q(n47VarJ);
                    w(ox4VarC);
                } catch (Throwable th2) {
                    n47.q(n47VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(ox4VarC);
                throw th3;
            }
        }
        return lv0.P0(map.keySet());
    }

    public final s01 I(s01 s01Var, kx4 kx4Var) {
        ox4 ox4VarC;
        if (s01Var.H.F || s01Var.I == 3) {
            return null;
        }
        kx4 kx4Var2 = this.q;
        byte b = 1;
        if (kx4Var2 == null || !kx4Var2.c(s01Var)) {
            y46 y46Var = new y46(s01Var, b);
            py5 py5Var = new py5((Object) s01Var, (Object) kx4Var, (byte) 2);
            n47 n47VarH = v47.h();
            ox4 ox4Var = n47VarH instanceof ox4 ? (ox4) n47VarH : null;
            if (ox4Var == null || (ox4VarC = ox4Var.C(y46Var, py5Var)) == null) {
                hk0.l("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    n47 n47VarJ = ox4VarC.j();
                    if (kx4Var != null) {
                        try {
                            if (kx4Var.h()) {
                                a26 a26Var = new a26((Object) kx4Var, (Object) s01Var, (byte) 7);
                                ux2 ux2Var = s01Var.H;
                                if (ux2Var.F) {
                                    i01.a("Preparing a composition while composing is not supported");
                                }
                                ux2Var.F = true;
                                try {
                                    a26Var.a();
                                    ux2Var.F = false;
                                } catch (Throwable th) {
                                    ux2Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            n47.q(n47VarJ);
                            throw th2;
                        }
                    }
                    boolean zW = s01Var.w();
                    n47.q(n47VarJ);
                    w(ox4VarC);
                    if (zW) {
                        return s01Var;
                    }
                } catch (Throwable th3) {
                    w(ox4VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, s01 s01Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof rz0)) {
            synchronized (this.c) {
                io.sentry.android.core.v0.d("ComposeInternal", "Error was captured in composition.", th);
                l56 l56Var = (l56) this.s.getValue();
                if (l56Var != null) {
                    throw l56Var.a;
                }
                l97 l97Var = this.s;
                l56 l56Var2 = new l56(th);
                l97Var.getClass();
                l97Var.l(null, l56Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                io.sentry.android.core.v0.d("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new kx4();
                this.k.clear();
                this.l.a();
                this.n.a();
                l97 l97Var2 = this.s;
                l56 l56Var3 = new l56(th);
                l97Var2.getClass();
                l97Var2.l(null, l56Var3);
                if (s01Var != null) {
                    L(s01Var);
                }
                if (y() != null) {
                    i01.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            vi6 vi6Var = new vi6(this.h);
            this.h = new kx4();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((s01) listD.get(i)).x(vi6Var);
                    if (((m56) this.u.getValue()).compareTo(m56.n) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    kx4 kx4Var = this.h;
                    int i2 = kx4Var.d;
                    Iterator<E> it = vi6Var.iterator();
                    while (it.hasNext()) {
                        kx4Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(s01 s01Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(s01Var)) {
            arrayList.add(s01Var);
        }
        if (this.f.remove(s01Var)) {
            this.g = null;
        }
    }

    @Override // o.n01
    public final void a(s01 s01Var, hw2 hw2Var) throws Throwable {
        m56 m56Var;
        byte b;
        boolean z2;
        ox4 ox4VarC;
        boolean z3 = s01Var.H.F;
        synchronized (this.c) {
            m56 m56Var2 = (m56) this.u.getValue();
            m56Var = m56.n;
            b = 1;
            z2 = m56Var2.compareTo(m56Var) > 0 ? !D().contains(s01Var) : true;
        }
        try {
            y46 y46Var = new y46(s01Var, b);
            py5 py5Var = new py5((Object) s01Var, (Object) null, (byte) 2);
            n47 n47VarH = v47.h();
            ox4 ox4Var = n47VarH instanceof ox4 ? (ox4) n47VarH : null;
            if (ox4Var == null || (ox4VarC = ox4Var.C(y46Var, py5Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                n47 n47VarJ = ox4VarC.j();
                try {
                    s01Var.j(hw2Var);
                    n47.q(n47VarJ);
                    w(ox4VarC);
                    synchronized (this.c) {
                        if (((m56) this.u.getValue()).compareTo(m56Var) > 0 && !D().contains(s01Var)) {
                            this.f.add(s01Var);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        v47.h().m();
                    }
                    try {
                        F(s01Var);
                        try {
                            s01Var.d();
                            s01Var.f();
                            if (z3) {
                                return;
                            }
                            v47.h().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, s01Var);
                    }
                } catch (Throwable th3) {
                    n47.q(n47VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(ox4VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            J(th5, s01Var);
        }
    }

    @Override // o.n01
    public final kx4 b(s01 s01Var, hz6 hz6Var, hw2 hw2Var) {
        ep3 ep3Var = this.v;
        try {
            hz6 hz6Var2 = s01Var.B;
            s01Var.B = hz6Var;
            try {
                a(s01Var, hw2Var);
                kx4 kx4Var = (kx4) ep3Var.get();
                if (kx4Var == null) {
                    kx4Var = ui6.a;
                    kx4Var.getClass();
                }
                s01Var.B = hz6Var2;
                ep3Var.E(null);
                return kx4Var;
            } catch (Throwable th) {
                s01Var.B = hz6Var2;
                throw th;
            }
        } catch (Throwable th2) {
            ep3Var.E(null);
            throw th2;
        }
    }

    @Override // o.n01
    public final de1 j() {
        return this.x;
    }

    @Override // o.n01
    public final void l(s01 s01Var) {
        fl0 fl0VarY;
        synchronized (this.c) {
            if (this.i.h(s01Var)) {
                fl0VarY = null;
            } else {
                this.i.b(s01Var);
                fl0VarY = y();
            }
        }
        if (fl0VarY != null) {
            ((gl0) fl0VarY).resumeWith(f88.a);
        }
    }

    @Override // o.n01
    public final ou4 m(pu4 pu4Var) {
        ou4 ou4Var;
        synchronized (this.c) {
            ou4Var = (ou4) this.n.k(pu4Var);
        }
        return ou4Var;
    }

    @Override // o.n01
    public final kx4 n(s01 s01Var, hz6 hz6Var, kx4 kx4Var) {
        ep3 ep3Var = this.v;
        try {
            K();
            s01Var.x(new vi6(kx4Var));
            hz6 hz6Var2 = s01Var.B;
            s01Var.B = hz6Var;
            try {
                s01 s01VarI = I(s01Var, null);
                if (s01VarI != null) {
                    F(s01Var);
                    s01VarI.d();
                    s01VarI.f();
                }
                kx4 kx4Var2 = (kx4) ep3Var.get();
                if (kx4Var2 == null) {
                    kx4Var2 = ui6.a;
                    kx4Var2.getClass();
                }
                s01Var.B = hz6Var2;
                ep3Var.E(null);
                return kx4Var2;
            } catch (Throwable th) {
                s01Var.B = hz6Var2;
                throw th;
            }
        } catch (Throwable th2) {
            ep3Var.E(null);
            throw th2;
        }
    }

    @Override // o.n01
    public final void q(j56 j56Var) {
        ep3 ep3Var = this.v;
        kx4 kx4Var = (kx4) ep3Var.get();
        if (kx4Var == null) {
            kx4 kx4Var2 = ui6.a;
            kx4Var = new kx4();
            ep3Var.E(kx4Var);
        }
        kx4Var.a(j56Var);
    }

    @Override // o.n01
    public final void r(s01 s01Var) {
        synchronized (this.c) {
            try {
                kx4 kx4Var = this.q;
                if (kx4Var == null) {
                    kx4 kx4Var2 = ui6.a;
                    kx4Var = new kx4();
                    this.q = kx4Var;
                }
                kx4Var.a(s01Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.n01
    public final hl0 s(vm3 vm3Var) {
        ep3 ep3Var = this.b;
        yc4 yc4Var = (yc4) ep3Var.f733o;
        r35 r35Var = new r35();
        r35Var.a = vm3Var;
        return yc4Var.l(r35Var, (ql1) ep3Var.p);
    }

    @Override // o.n01
    public final void v(s01 s01Var) {
        synchronized (this.c) {
            if (this.f.remove(s01Var)) {
                this.g = null;
            }
            this.i.j(s01Var);
            this.j.remove(s01Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((m56) this.u.getValue()).compareTo(m56.q) >= 0) {
                l97 l97Var = this.u;
                m56 m56Var = m56.n;
                l97Var.getClass();
                l97Var.l(null, m56Var);
            }
        }
        this.w.j(null);
    }

    public final fl0 y() {
        l97 l97Var = this.u;
        int iCompareTo = ((m56) l97Var.getValue()).compareTo(m56.n);
        l97 l97Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        xx4 xx4Var = this.i;
        if (iCompareTo > 0) {
            Object value = l97Var2.getValue();
            m56 m56Var = m56.r;
            m56 m56Var2 = m56.f1437o;
            if (value == null) {
                if (this.d == null) {
                    this.h = new kx4();
                    xx4Var.g();
                    if (z() || B()) {
                        m56Var2 = m56.p;
                    }
                } else {
                    m56Var2 = (xx4Var.f2559o != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? m56Var : m56.q;
                }
            }
            l97Var.getClass();
            l97Var.l(null, m56Var2);
            if (m56Var2 != m56Var) {
                return null;
            }
            gl0 gl0Var = this.r;
            this.r = null;
            return gl0Var;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = ea2.m;
        this.h = new kx4();
        xx4Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        gl0 gl0Var2 = this.r;
        if (gl0Var2 != null) {
            gl0Var2.f(null);
        }
        this.r = null;
        l97Var2.k(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((yx) ((yc4) this.a.f1480o).f2598o).get() & 134217727) > 0;
    }
}
