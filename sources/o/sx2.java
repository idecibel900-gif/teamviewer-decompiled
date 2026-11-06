package o;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sx2 extends n01 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final kx4 e;
    public final bg5 f;
    public final /* synthetic */ ux2 g;

    public sx2(ux2 ux2Var, long j, boolean z, boolean z2, xc0 xc0Var) {
        this.g = ux2Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        kx4 kx4Var = ui6.a;
        this.e = new kx4();
        this.f = new bg5(yj5.p, yl7.T);
    }

    @Override // o.n01
    public final void a(s01 s01Var, hw2 hw2Var) {
        this.g.b.a(s01Var, hw2Var);
    }

    @Override // o.n01
    public final kx4 b(s01 s01Var, hz6 hz6Var, hw2 hw2Var) {
        return this.g.b.b(s01Var, hz6Var, hw2Var);
    }

    @Override // o.n01
    public final void c() {
        this.g.A--;
    }

    @Override // o.n01
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // o.n01
    public final boolean e() {
        return this.b;
    }

    @Override // o.n01
    public final boolean f() {
        return this.c;
    }

    @Override // o.n01
    public final long g() {
        return this.a;
    }

    @Override // o.n01
    public final m01 h() {
        return this.g.h;
    }

    @Override // o.n01
    public final yj5 i() {
        return (yj5) this.f.getValue();
    }

    @Override // o.n01
    public final de1 j() {
        return this.g.b.j();
    }

    @Override // o.n01
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // o.n01
    public final void l(s01 s01Var) {
        ux2 ux2Var = this.g;
        n01 n01Var = ux2Var.b;
        n01Var.l(ux2Var.h);
        n01Var.l(s01Var);
    }

    @Override // o.n01
    public final ou4 m(pu4 pu4Var) {
        return this.g.b.m(pu4Var);
    }

    @Override // o.n01
    public final kx4 n(s01 s01Var, hz6 hz6Var, kx4 kx4Var) {
        return this.g.b.n(s01Var, hz6Var, kx4Var);
    }

    @Override // o.n01
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // o.n01
    public final void p(ux2 ux2Var) {
        this.e.a(ux2Var);
    }

    @Override // o.n01
    public final void q(j56 j56Var) {
        this.g.b.q(j56Var);
    }

    @Override // o.n01
    public final void r(s01 s01Var) {
        this.g.b.r(s01Var);
    }

    @Override // o.n01
    public final hl0 s(vm3 vm3Var) {
        return this.g.b.s(vm3Var);
    }

    @Override // o.n01
    public final void t() {
        this.g.A++;
    }

    @Override // o.n01
    public final void u(ux2 ux2Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                ux2Var.getClass();
                set.remove(ux2Var.v());
            }
        }
        if (ux2Var != null) {
            this.e.l(ux2Var);
        }
    }

    @Override // o.n01
    public final void v(s01 s01Var) {
        this.g.b.v(s01Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void w() {
        kx4 kx4Var = this.e;
        if (kx4Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = kx4Var.b;
                long[] jArr = kx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ux2 ux2Var = (ux2) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(ux2Var.v());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            kx4Var.b();
        }
    }
}
