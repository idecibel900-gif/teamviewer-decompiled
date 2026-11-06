package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fp6 {
    public final es4 a;
    public final boolean b;
    public final LayoutNode c;
    public final ap6 d;
    public fp6 e;
    public final int f;

    public fp6(es4 es4Var, boolean z, LayoutNode layoutNode, ap6 ap6Var) {
        this.a = es4Var;
        this.b = z;
        this.c = layoutNode;
        this.d = ap6Var;
        this.f = layoutNode.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final v56 a(e45 e45Var) {
        ?? L0;
        fp6 fp6VarL = l();
        if (fp6VarL == null) {
            return v56.e;
        }
        es4 es4Var = (es4) fp6VarL.c.S.g;
        if ((es4Var.p & 8) == 0) {
            L0 = 0;
            break;
        }
        loop0: while (true) {
            if (es4Var != null) {
                if ((es4Var.f737o & 8) != 0) {
                    L0 = es4Var;
                    ?? xx4Var = 0;
                    while (L0 != 0) {
                        if (L0 instanceof dp6) {
                            if (((dp6) L0).f()) {
                                break loop0;
                            }
                        } else if ((L0.f737o & 8) != 0 && (L0 instanceof vm1)) {
                            es4 es4Var2 = ((vm1) L0).B;
                            int i = 0;
                            while (es4Var2 != null) {
                                if ((es4Var2.f737o & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                        xx4Var = xx4Var;
                                        L0 = es4Var2;
                                    } else {
                                        if (xx4Var == 0) {
                                            xx4Var = new xx4(new es4[16]);
                                        }
                                        if (L0 != 0) {
                                            xx4Var.b(L0);
                                            L0 = 0;
                                        }
                                        xx4Var.b(es4Var2);
                                    }
                                } else {
                                    L0 = L0;
                                    xx4Var = xx4Var;
                                }
                                es4Var2 = es4Var2.r;
                                L0 = L0;
                                xx4Var = xx4Var;
                            }
                            if (i == 1) {
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
                if ((es4Var.p & 8) != 0) {
                    es4Var = es4Var.r;
                }
            }
            L0 = 0;
            break;
        }
        dp6 dp6Var = (dp6) L0;
        e45 e45VarN0 = dp6Var != null ? vn4.n0(dp6Var, 8) : null;
        return e45VarN0 == null ? fp6VarL.a(e45Var) : e45VarN0.b(e45Var, true);
    }

    public final fp6 b(pe6 pe6Var, Function1 function1) {
        ap6 ap6Var = new ap6();
        ap6Var.f346o = false;
        ap6Var.p = false;
        function1.invoke(ap6Var);
        fp6 fp6Var = new fp6(new ep6(function1), false, new LayoutNode(this.f + (pe6Var != null ? 1000000000 : 2000000000), true), ap6Var);
        fp6Var.e = this;
        return fp6Var;
    }

    public final void c(LayoutNode layoutNode, ArrayList arrayList) {
        xx4 xx4VarK = layoutNode.K();
        Object[] objArr = xx4VarK.m;
        int i = xx4VarK.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.W() && !layoutNode2.c0) {
                if (layoutNode2.S.f(8)) {
                    arrayList.add(vs1.i(layoutNode2, this.b));
                } else {
                    c(layoutNode2, arrayList);
                }
            }
        }
    }

    public final e45 d() {
        if (!n()) {
            dp6 dp6VarF = f();
            return dp6VarF != null ? vn4.n0(dp6VarF, 8) : (ti3) this.c.S.d;
        }
        fp6 fp6VarL = l();
        if (fp6VarL != null) {
            return fp6VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            fp6 fp6Var = (fp6) arrayList.get(size2);
            if (fp6Var.o()) {
                arrayList2.add(fp6Var);
            } else if (!fp6Var.d.p) {
                fp6Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final dp6 f() {
        ?? L0;
        boolean z;
        ?? r0;
        boolean z2 = this.d.f346o;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        LayoutNode layoutNode = this.c;
        if (!z2) {
            es4 es4Var = (es4) layoutNode.S.g;
            if ((es4Var.p & 8) != 0) {
                loop3: while (es4Var != null) {
                    if ((es4Var.f737o & 8) != 0) {
                        L0 = es4Var;
                        ?? xx4Var = 0;
                        while (true) {
                            if (L0 != 0) {
                                if (L0 instanceof dp6) {
                                    if (((dp6) L0).f()) {
                                        r4 = L0;
                                    }
                                } else if ((L0.f737o & 8) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var2 = ((vm1) L0).B;
                                    int i = 0;
                                    while (es4Var2 != null) {
                                        if ((es4Var2.f737o & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                L0 = L0;
                                                xx4Var = xx4Var;
                                                xx4Var = xx4Var;
                                                L0 = es4Var2;
                                            } else {
                                                if (xx4Var == 0) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var.b(es4Var2);
                                            }
                                        } else {
                                            L0 = L0;
                                            xx4Var = xx4Var;
                                        }
                                        es4Var2 = es4Var2.r;
                                        L0 = L0;
                                        xx4Var = xx4Var;
                                    }
                                    if (i == 1) {
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
                    if ((es4Var.p & 8) == 0) {
                        break;
                    }
                    es4Var = es4Var.r;
                }
            }
        } else {
            es4 es4Var3 = (es4) layoutNode.S.g;
            if ((es4Var3.p & 8) != 0) {
                L0 = 0;
                while (es4Var3 != null) {
                    if ((es4Var3.f737o & 8) != 0) {
                        es4 es4VarL0 = es4Var3;
                        xx4 xx4Var2 = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof dp6) {
                                dp6 dp6Var = (dp6) es4VarL0;
                                if (dp6Var.f()) {
                                    if (dp6Var.F0()) {
                                        r0 = L0;
                                        r0 = L0;
                                        return dp6Var;
                                    }
                                    if (L0 == 0) {
                                        r0 = dp6Var;
                                    }
                                }
                                r0 = L0;
                                z = false;
                                L0 = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                L0 = L0;
                                if ((es4VarL0.f737o & 8) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i2 = 0;
                                    for (es4 es4Var4 = ((vm1) es4VarL0).B; es4Var4 != null; es4Var4 = es4Var4.r) {
                                        if ((es4Var4.f737o & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                es4VarL0 = es4Var4;
                                            } else {
                                                if (xx4Var2 == null) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var2.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var2.b(es4Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                L0 = L0;
                            }
                            es4VarL0 = vn4.l0(xx4Var2);
                        }
                    }
                    if ((es4Var3.p & 8) == 0) {
                        break;
                    }
                    es4Var3 = es4Var3.r;
                    L0 = L0;
                }
                r4 = L0;
            }
        }
        return (dp6) r4;
    }

    public final v56 g() {
        e45 e45VarD = d();
        if (e45VarD != null) {
            if (!e45VarD.a1().z) {
                e45VarD = null;
            }
            if (e45VarD != null) {
                return vt1.s(e45VarD).b(e45VarD, true);
            }
        }
        return v56.e;
    }

    public final v56 h() {
        e45 e45VarD = d();
        if (e45VarD != null) {
            if (!e45VarD.a1().z) {
                e45VarD = null;
            }
            if (e45VarD != null) {
                return vt1.m(e45VarD, true);
            }
        }
        return v56.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.p) {
            return ea2.m;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final ap6 k() {
        boolean zO = o();
        ap6 ap6Var = this.d;
        if (!zO) {
            return ap6Var;
        }
        ap6 ap6VarA = ap6Var.a();
        p(new ArrayList(), ap6VarA);
        return ap6VarA;
    }

    public final fp6 l() {
        LayoutNode layoutNodeF;
        fp6 fp6Var = this.e;
        if (fp6Var != null) {
            return fp6Var;
        }
        LayoutNode layoutNode = this.c;
        boolean z = this.b;
        if (!z) {
            layoutNodeF = null;
            break;
        }
        layoutNodeF = layoutNode.F();
        while (true) {
            if (layoutNodeF == null) {
                layoutNodeF = null;
                break;
            }
            ap6 ap6VarH = layoutNodeF.H();
            if (ap6VarH != null && ap6VarH.f346o) {
                break;
            }
            layoutNodeF = layoutNodeF.F();
        }
        if (layoutNodeF == null) {
            for (LayoutNode layoutNodeF2 = layoutNode.F(); layoutNodeF2 != null; layoutNodeF2 = layoutNodeF2.F()) {
                if (layoutNodeF2.S.f(8)) {
                    layoutNodeF = layoutNodeF2;
                }
            }
            layoutNodeF = null;
        }
        if (layoutNodeF == null) {
            return null;
        }
        return vs1.i(layoutNodeF, z);
    }

    public final v56 m() {
        um1 um1VarF = f();
        if (um1VarF == null) {
            return ((ti3) this.c.S.d).x1();
        }
        es4 es4Var = ((es4) um1VarF).m;
        Object objG = this.d.m.g(zo6.b);
        if (objG == null) {
            objG = null;
        }
        return us1.x(es4Var, objG != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.f346o;
    }

    public final void p(ArrayList arrayList, ap6 ap6Var) {
        if (this.d.p) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            fp6 fp6Var = (fp6) arrayList.get(size2);
            if (!fp6Var.o()) {
                ap6Var.c(fp6Var.d);
                fp6Var.p(arrayList, ap6Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return ea2.m;
        }
        c(this.c, arrayList);
        if (z) {
            ap6 ap6Var = this.d;
            jx4 jx4Var = ap6Var.m;
            Object objG = jx4Var.g(kp6.z);
            if (objG == null) {
                objG = null;
            }
            pe6 pe6Var = (pe6) objG;
            if (pe6Var != null && ap6Var.f346o && !arrayList.isEmpty()) {
                arrayList.add(b(pe6Var, new y46((Object) pe6Var, (byte) 11)));
            }
            np6 np6Var = kp6.a;
            if (jx4Var.c(np6Var) && !arrayList.isEmpty() && ap6Var.f346o) {
                Object objG2 = jx4Var.g(np6Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) lv0.o0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new fy(str, (byte) 16)));
                }
            }
        }
        return arrayList;
    }
}
