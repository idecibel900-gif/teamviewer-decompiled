package o;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class c45 implements d45 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // o.d45
    public final boolean c(es4 es4Var) {
        ?? xx4Var = 0;
        while (true) {
            int i = 0;
            if (es4Var == 0) {
                return false;
            }
            if (es4Var instanceof ln5) {
                ((ln5) es4Var).M();
            } else if ((es4Var.f737o & 16) != 0 && (es4Var instanceof vm1)) {
                es4 es4Var2 = ((vm1) es4Var).B;
                xx4Var = xx4Var;
                es4Var = es4Var;
                while (es4Var2 != null) {
                    if ((es4Var2.f737o & 16) != 0) {
                        i++;
                        if (i == 1) {
                            xx4Var = xx4Var;
                            es4Var = es4Var2;
                        } else {
                            if (xx4Var == 0) {
                                xx4Var = new xx4(new es4[16]);
                            }
                            if (es4Var != 0) {
                                xx4Var.b(es4Var);
                                es4Var = 0;
                            }
                            xx4Var.b(es4Var2);
                        }
                    }
                    es4Var2 = es4Var2.r;
                    xx4Var = xx4Var;
                    es4Var = es4Var;
                }
                if (i == 1) {
                }
            }
            es4Var = vn4.l0(xx4Var);
        }
    }

    @Override // o.d45
    public final int d() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // o.d45
    public final boolean e(x53 x53Var, LayoutNode layoutNode) {
        e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        outerCoordinator$ui.getClass();
        es4 es4VarD1 = outerCoordinator$ui.d1(k45.g(16));
        if (es4VarD1 != null && es4VarD1.z) {
            if (!es4VarD1.m.z) {
                ki3.c("visitLocalDescendants called on an unattached node");
            }
            es4 es4Var = es4VarD1.m;
            if ((es4Var.p & 16) != 0) {
                while (es4Var != null) {
                    if ((es4Var.f737o & 16) != 0) {
                        ?? L0 = es4Var;
                        ?? xx4Var = 0;
                        while (L0 != 0) {
                            if (L0 instanceof ln5) {
                                if (((ln5) L0).u0()) {
                                    x53Var.f2482o = x53Var.m.b - 1;
                                    return true;
                                }
                            } else if ((L0.f737o & 16) != 0 && (L0 instanceof vm1)) {
                                es4 es4Var2 = ((vm1) L0).B;
                                int i = 0;
                                while (es4Var2 != null) {
                                    if ((es4Var2.f737o & 16) != 0) {
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
                    es4Var = es4Var.r;
                }
            }
        }
        return false;
    }

    @Override // o.d45
    public final void f(LayoutNode layoutNode, long j, x53 x53Var, int i, boolean z) {
        layoutNode.M(j, x53Var, i, z);
    }

    @Override // o.d45
    public final boolean o(LayoutNode layoutNode) {
        return true;
    }
}
