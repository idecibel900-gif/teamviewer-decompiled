package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class u18 {
    public final g2 a;
    public final u18 b;
    public final String c;
    public final bg5 d;
    public final bg5 f;
    public final bg5 i;
    public final j57 j;
    public final j57 k;
    public final bg5 l;
    public final eo1 m;
    public final bg5 e = h57.p(null);
    public final zf5 g = new zf5(0);
    public final zf5 h = new zf5(Long.MIN_VALUE);

    public u18(g2 g2Var, u18 u18Var, String str) {
        this.a = g2Var;
        this.b = u18Var;
        this.c = str;
        this.d = h57.p(g2Var.p0());
        this.f = h57.p(new p18(g2Var.p0(), g2Var.p0()));
        Boolean bool = Boolean.FALSE;
        this.i = h57.p(bool);
        this.j = new j57();
        this.k = new j57();
        this.l = h57.p(bool);
        this.m = d57.b(new j18(this, (byte) 1));
        g2Var.z0(this);
    }

    public final void a(Object obj, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(obj) : ux2Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(this) ? 32 : 16;
        }
        byte b2 = 0;
        if (!ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            ux2Var.Q();
        } else if (g()) {
            ux2Var.W(467722849);
            ux2Var.p(false);
        } else {
            ux2Var.W(466062241);
            o(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = d57.b(new j18(this, b2));
                ux2Var.g0(objK);
            }
            if (((Boolean) ((i97) objK).getValue()).booleanValue()) {
                ux2Var.W(466470356);
                Object objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    objK2 = ck3.w(ux2Var);
                    ux2Var.g0(objK2);
                }
                me1 me1Var = (me1) objK2;
                boolean zH = ux2Var.h(me1Var) | (i3 == 32);
                Object objK3 = ux2Var.K();
                if (zH || objK3 == awVar) {
                    objK3 = new py5((Object) me1Var, (Object) this, (byte) 25);
                    ux2Var.g0(objK3);
                }
                ck3.d(me1Var, this, (Function1) objK3, ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(467712929);
                ux2Var.p(false);
            }
            ux2Var.p(false);
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa(b, i, this, obj);
        }
    }

    public final long b() {
        j57 j57Var = this.j;
        int size = j57Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((q18) j57Var.get(i)).x.z());
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((u18) j57Var2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        j57 j57Var = this.j;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            q18 q18Var = (q18) j57Var.get(i);
            q18Var.r = null;
            q18Var.q = null;
            q18Var.u = false;
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((u18) j57Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        j57 j57Var = this.j;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            if (((q18) j57Var.get(i)).q != null) {
                return true;
            }
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((u18) j57Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        u18 u18Var = this.b;
        return u18Var != null ? u18Var.e() : this.g.z();
    }

    public final o18 f() {
        return (o18) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        g2 g2Var = this.a;
        bg5 bg5Var = (bg5) g2Var.m;
        zf5 zf5Var = this.h;
        if (zf5Var.z() == Long.MIN_VALUE) {
            zf5Var.A(j);
            ((bg5) g2Var.m).setValue(Boolean.TRUE);
        } else if (!((Boolean) bg5Var.getValue()).booleanValue()) {
            bg5Var.setValue(Boolean.TRUE);
        }
        m(false);
        j57 j57Var = this.j;
        int size = j57Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            q18 q18Var = (q18) j57Var.get(i);
            bg5 bg5Var2 = q18Var.s;
            bg5 bg5Var3 = q18Var.s;
            if (!((Boolean) bg5Var2.getValue()).booleanValue()) {
                long jB = z ? q18Var.a().b() : j;
                q18Var.d(q18Var.a().g(jB));
                q18Var.w = q18Var.a().d(jB);
                if (q18Var.a().e(jB)) {
                    bg5Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) bg5Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            u18 u18Var = (u18) j57Var2.get(i2);
            bg5 bg5Var4 = u18Var.d;
            g2 g2Var2 = u18Var.a;
            if (!im3.n(bg5Var4.getValue(), g2Var2.p0())) {
                u18Var.h(j, z);
            }
            if (!im3.n(u18Var.d.getValue(), g2Var2.p0())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.A(Long.MIN_VALUE);
        g2 g2Var = this.a;
        if (g2Var instanceof wx4) {
            g2Var.y0(this.d.getValue());
        }
        if (this.b == null) {
            this.g.A(0L);
        }
        ((bg5) g2Var.m).setValue(Boolean.FALSE);
        j57 j57Var = this.k;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            ((u18) j57Var.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.h.A(Long.MIN_VALUE);
        g2 g2Var = this.a;
        ((bg5) g2Var.m).setValue(Boolean.FALSE);
        boolean zG = g();
        bg5 bg5Var = this.d;
        if (!zG || !im3.n(g2Var.p0(), obj) || !im3.n(bg5Var.getValue(), obj2)) {
            if (!im3.n(g2Var.p0(), obj) && (g2Var instanceof wx4)) {
                g2Var.y0(obj);
            }
            bg5Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new p18(obj, obj2));
        }
        j57 j57Var = this.k;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            u18 u18Var = (u18) j57Var.get(i);
            u18Var.getClass();
            if (u18Var.g()) {
                u18Var.j(u18Var.a.p0(), u18Var.d.getValue());
            }
        }
        j57 j57Var2 = this.j;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((q18) j57Var2.get(i2)).b(0L);
        }
    }

    public final void k(long j) {
        zf5 zf5Var = this.h;
        if (zf5Var.z() == Long.MIN_VALUE) {
            zf5Var.A(j);
        }
        if (this.b == null) {
            this.g.A(j);
        }
        m(false);
        j57 j57Var = this.j;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            ((q18) j57Var.get(i)).b(j);
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            u18 u18Var = (u18) j57Var2.get(i2);
            if (!im3.n(u18Var.d.getValue(), u18Var.a.p0())) {
                u18Var.k(j);
            }
        }
    }

    public final void l(mn6 mn6Var) {
        j57 j57Var = this.j;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            q18 q18Var = (q18) j57Var.get(i);
            bg5 bg5Var = q18Var.v;
            if (!im3.n(q18Var.a().f2432o, q18Var.a().p)) {
                q18Var.r = q18Var.a();
                q18Var.q = mn6Var;
            }
            q18Var.p.setValue(new wn7(q18Var.z, q18Var.m, bg5Var.getValue(), bg5Var.getValue(), q18Var.w.c()));
            q18Var.x.A(q18Var.a().b());
            q18Var.u = true;
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((u18) j57Var2.get(i2)).l(mn6Var);
        }
    }

    public final void m(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void n() {
        wn7 wn7Var;
        j57 j57Var = this.j;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            q18 q18Var = (q18) j57Var.get(i);
            mn6 mn6Var = q18Var.q;
            if (mn6Var != null && (wn7Var = q18Var.r) != null) {
                long jT0 = vn4.t0(mn6Var.g * ((double) mn6Var.d));
                Object objG = wn7Var.g(jT0);
                if (q18Var.u) {
                    wn7 wn7VarA = q18Var.a();
                    if (!im3.n(wn7VarA.f2432o, objG)) {
                        wn7VarA.f2432o = objG;
                        wn7VarA.r = (qo) wn7VarA.n.b().invoke(objG);
                        wn7VarA.u = null;
                        wn7VarA.t = -1L;
                    }
                }
                wn7 wn7VarA2 = q18Var.a();
                if (!im3.n(objG, wn7VarA2.p)) {
                    wn7VarA2.p = objG;
                    wn7VarA2.q = (qo) wn7VarA2.n.b().invoke(objG);
                    wn7VarA2.u = null;
                    wn7VarA2.t = -1L;
                }
                q18Var.x.A(q18Var.a().b());
                if (q18Var.t.z() == -2.0f || q18Var.u) {
                    q18Var.d(objG);
                } else {
                    q18Var.b(q18Var.A.e());
                }
                if (jT0 >= mn6Var.g) {
                    q18Var.q = null;
                    q18Var.r = null;
                } else {
                    mn6Var.c = false;
                }
            }
        }
        j57 j57Var2 = this.k;
        int size2 = j57Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((u18) j57Var2.get(i2)).n();
        }
    }

    public final void o(Object obj) {
        bg5 bg5Var = this.d;
        if (im3.n(bg5Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new p18(bg5Var.getValue(), obj));
        g2 g2Var = this.a;
        if (!im3.n(g2Var.p0(), bg5Var.getValue())) {
            g2Var.y0(bg5Var.getValue());
        }
        bg5Var.setValue(obj);
        if (this.h.z() == Long.MIN_VALUE) {
            m(true);
        }
        j57 j57Var = this.j;
        int size = j57Var.size();
        for (int i = 0; i < size; i++) {
            ((q18) j57Var.get(i)).t.A(-2.0f);
        }
    }

    public final String toString() {
        j57 j57Var = this.j;
        int size = j57Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((q18) j57Var.get(i)) + ", ";
        }
        return str;
    }
}
