package o;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class br2 extends es4 implements v01, o65, is4, um1 {
    public final boolean A;
    public final hw2 B;
    public boolean C;
    public boolean D;
    public final int E;
    public mh6 F;

    public br2(int i, hw2 hw2Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        hw2Var = (i2 & 4) != 0 ? null : hw2Var;
        this.A = z;
        this.B = hw2Var;
        this.E = i;
    }

    public static boolean d1(br2 br2Var) {
        return br2Var.c1(7);
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // o.es4
    public final void N0() {
        lq2 lq2Var;
        int iOrdinal = Z0().ordinal();
        if (iOrdinal == 0) {
            lq2Var = (lq2) vn4.q0(this).getFocusOwner();
            lq2Var.c(8, true, false);
            if (this.A) {
                lq2Var.a.D();
            }
            lq2Var.d.a();
        } else if (iOrdinal == 1) {
            iq2 focusOwner = vn4.q0(this).getFocusOwner();
            br2 br2VarH = xs1.H(this);
            if (br2VarH != null && br2VarH.A) {
                lq2 lq2Var2 = (lq2) focusOwner;
                lq2Var2.a.D();
                lq2Var2.d.a();
            }
        } else if (iOrdinal == 2) {
            lq2Var = (lq2) vn4.q0(this).getFocusOwner();
            lq2Var.c(8, true, false);
            if (this.A) {
                lq2Var.a.D();
            }
            lq2Var.d.a();
        } else if (iOrdinal != 3) {
            gk0.s();
            return;
        }
        mh6 mh6Var = this.F;
        if (mh6Var != null) {
            ((ep3) mh6Var).G();
        }
        this.F = null;
    }

    @Override // o.es4
    public final void O0() {
        if (Z0().b()) {
            ((lq2) vn4.q0(this).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean U0(int i) {
        int iOrdinal = vs1.M(this, i).ordinal();
        if (iOrdinal == 0) {
            return vs1.N(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        gk0.s();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void V0(wq2 wq2Var, wq2 wq2Var2) {
        nf nfVar;
        hw2 hw2Var;
        lq2 lq2Var = (lq2) vn4.q0(this).getFocusOwner();
        br2 br2VarG = lq2Var.g();
        if (!wq2Var.equals(wq2Var2) && (hw2Var = this.B) != null) {
            hw2Var.invoke(wq2Var, wq2Var2);
        }
        es4 es4Var = this.m;
        if (!es4Var.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var2 = this.m;
        LayoutNode layoutNodeP0 = vn4.p0(this);
        while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 5120) != 0) {
                while (es4Var2 != null) {
                    int i = es4Var2.f737o;
                    if ((i & 5120) != 0) {
                        if (es4Var2 != es4Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? L0 = es4Var2;
                            ?? xx4Var = 0;
                            while (L0 != 0) {
                                if (L0 instanceof xp2) {
                                    xp2 xp2Var = (xp2) L0;
                                    if (br2VarG == lq2Var.g()) {
                                        xp2Var.D(wq2Var2);
                                    }
                                } else if ((L0.f737o & 4096) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var3 = ((vm1) L0).B;
                                    int i2 = 0;
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                    while (es4Var3 != null) {
                                        if ((es4Var3.f737o & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xx4Var = xx4Var;
                                                L0 = es4Var3;
                                            } else {
                                                if (xx4Var == 0) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var.b(es4Var3);
                                            }
                                        }
                                        es4Var3 = es4Var3.r;
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                L0 = vn4.l0(xx4Var);
                            }
                        }
                    }
                    es4Var2 = es4Var2.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var2 = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final oq2 W0() {
        boolean z;
        nf nfVar;
        oq2 oq2Var = new oq2();
        oq2Var.a = true;
        sq2 sq2Var = sq2.b;
        oq2Var.b = sq2Var;
        oq2Var.c = sq2Var;
        oq2Var.d = sq2Var;
        oq2Var.e = sq2Var;
        oq2Var.f = sq2Var;
        oq2Var.g = sq2Var;
        oq2Var.h = sq2Var;
        oq2Var.i = sq2Var;
        oq2Var.j = new ji2((byte) 6);
        oq2Var.k = new ji2((byte) 7);
        oq2Var.l = z06.x;
        int i = this.E;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((hj3) ((jj3) ((ij3) xk0.q(this, b11.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                hk0.l("Unknown Focusability");
                return null;
            }
            z = false;
        }
        oq2Var.a = z;
        es4 es4Var = this.m;
        if (!es4Var.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var2 = this.m;
        LayoutNode layoutNodeP0 = vn4.p0(this);
        loop0: while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 3072) != 0) {
                while (es4Var2 != null) {
                    int i2 = es4Var2.f737o;
                    if ((i2 & 3072) != 0) {
                        if (es4Var2 != es4Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? xx4Var = 0;
                            ?? L0 = es4Var2;
                            while (L0 != 0) {
                                if (L0 instanceof qq2) {
                                    ((qq2) L0).v0(oq2Var);
                                } else if ((L0.f737o & 2048) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var3 = ((vm1) L0).B;
                                    int i3 = 0;
                                    while (es4Var3 != null) {
                                        if ((es4Var3.f737o & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                L0 = L0;
                                                xx4Var = xx4Var;
                                                xx4Var = xx4Var;
                                                L0 = es4Var3;
                                            } else {
                                                if (xx4Var == 0) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var.b(es4Var3);
                                            }
                                        } else {
                                            L0 = L0;
                                            xx4Var = xx4Var;
                                        }
                                        es4Var3 = es4Var3.r;
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    if (i3 == 1) {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    } else {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                }
                                L0 = vn4.l0(xx4Var);
                            }
                        }
                    }
                    es4Var2 = es4Var2.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var2 = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
        return oq2Var;
    }

    public final v56 X0(i04 i04Var) {
        v56 v56Var = W0().l;
        if (v56Var != z06.x) {
            return i04Var == null ? v56Var : v56Var.i(i04Var.z(vn4.o0(this), 0L));
        }
        return i04Var != null ? i04Var.b(vn4.o0(this), false) : qs1.v(0L, xs1.a0(vn4.o0(this).f1179o));
    }

    public final e34 Y0() {
        nf nfVar;
        Object obj;
        if (!this.m.z) {
            ki3.c("visitAncestors called on an unattached node");
        }
        es4 es4Var = this.m.q;
        LayoutNode layoutNodeP0 = vn4.p0(this);
        loop0: while (layoutNodeP0 != null) {
            if ((((es4) layoutNodeP0.S.g).p & 8388640) != 0) {
                while (es4Var != null) {
                    int i = es4Var.f737o;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(es4Var instanceof e34)) {
                                if (es4Var instanceof vm1) {
                                    es4Var = null;
                                    for (es4 es4Var2 = ((vm1) es4Var).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                        if (es4Var2 instanceof e34) {
                                            es4Var = es4Var2;
                                        }
                                    }
                                } else {
                                    es4Var = null;
                                }
                            }
                            e34 e34Var = (e34) es4Var;
                            if (e34Var != null) {
                                return e34Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (es4Var instanceof is4) {
                                obj = es4Var;
                            } else if (es4Var instanceof vm1) {
                                obj = null;
                                for (es4 es4Var3 = ((vm1) es4Var).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                    if (es4Var3 instanceof is4) {
                                        obj = es4Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            is4 is4Var = (is4) obj;
                            if (is4Var != null && is4Var.V().o(ka0.b)) {
                                return (e34) is4Var.V().s();
                            }
                        }
                    }
                    es4Var = es4Var.q;
                }
            }
            layoutNodeP0 = layoutNodeP0.F();
            es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
        }
        return null;
    }

    public final wq2 Z0() {
        br2 br2VarG;
        nf nfVar;
        boolean z = this.z;
        wq2 wq2Var = wq2.f2437o;
        if (!z || (br2VarG = ((lq2) vn4.q0(this).getFocusOwner()).g()) == null) {
            return wq2Var;
        }
        if (this == br2VarG) {
            return wq2.m;
        }
        if (br2VarG.z) {
            if (!br2VarG.m.z) {
                ki3.c("visitAncestors called on an unattached node");
            }
            es4 es4Var = br2VarG.m.q;
            LayoutNode layoutNodeP0 = vn4.p0(br2VarG);
            while (layoutNodeP0 != null) {
                if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                    while (es4Var != null) {
                        if ((es4Var.f737o & 1024) != 0) {
                            es4 es4VarL0 = es4Var;
                            xx4 xx4Var = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof br2) {
                                    if (this == ((br2) es4VarL0)) {
                                        return wq2.n;
                                    }
                                } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i = 0;
                                    for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                        if ((es4Var2.f737o & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                es4VarL0 = es4Var2;
                                            } else {
                                                if (xx4Var == null) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var.b(es4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var);
                            }
                        }
                        es4Var = es4Var.q;
                    }
                }
                layoutNodeP0 = layoutNodeP0.F();
                es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
            }
        }
        return wq2Var;
    }

    public final void a1() {
        int iOrdinal = Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                gk0.s();
                return;
            }
        }
        k76 k76Var = new k76();
        bt1.J(this, new ql1(k76Var, this, (byte) 5));
        Object obj = k76Var.m;
        if (obj == null) {
            im3.e0("focusProperties");
            throw null;
        }
        if (((mq2) obj).a()) {
            return;
        }
        ((lq2) vn4.q0(this).getFocusOwner()).c(8, true, true);
    }

    public final void b1() {
    }

    public final boolean c1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return W0().a ? U0(i) : y57.p(this, i, new mg(i, (byte) 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override // o.o65
    public final void n0() {
        a1();
    }
}
