package o;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class k45 {
    public static final vw4 a;

    static {
        vw4 vw4Var = h65.a;
        a = new vw4();
    }

    public static final void a(es4 es4Var, int i, int i2) {
        if (!(es4Var instanceof vm1)) {
            b(es4Var, i & es4Var.f737o, i2);
            return;
        }
        vm1 vm1Var = (vm1) es4Var;
        int i3 = vm1Var.A;
        b(es4Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (es4 es4Var2 = vm1Var.B; es4Var2 != null; es4Var2 = es4Var2.r) {
            a(es4Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(es4 es4Var, int i, int i2) {
        if (i2 != 0 || es4Var.J0()) {
            if ((i & 2) != 0 && (es4Var instanceof r04)) {
                vn4.p0((r04) es4Var).S();
                if (i2 == 2) {
                    vn4.n0(es4Var, 2).n1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                vn4.p0(es4Var).S();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                vn4.p0(es4Var).t0(false);
            }
            if ((i & 256) != 0 && (es4Var instanceof gz2)) {
                if (i2 == 1) {
                    LayoutNode layoutNodeP0 = vn4.p0(es4Var);
                    layoutNodeP0.z0(layoutNodeP0.b0 + 1);
                } else if (i2 == 2) {
                    LayoutNode layoutNodeP1 = vn4.p0(es4Var);
                    layoutNodeP1.z0(layoutNodeP1.b0 - 1);
                }
                if (i2 != 2) {
                    LayoutNode layoutNodeP2 = vn4.p0(es4Var);
                    if (layoutNodeP2.b0 != 0 && !layoutNodeP2.u() && !layoutNodeP2.A() && !layoutNodeP2.a0) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) e14.a(layoutNodeP2);
                        a65 a65Var = (a65) androidComposeView.f0.f;
                        if (layoutNodeP2.b0 > 0) {
                            ((xx4) a65Var.n).b(layoutNodeP2);
                            layoutNodeP2.a0 = true;
                        }
                        androidComposeView.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (es4Var instanceof t52)) {
                yo1.H((t52) es4Var);
            }
            if ((i & 8) != 0 && (es4Var instanceof dp6)) {
                vn4.p0(es4Var).E = true;
            }
            if ((i & 64) != 0 && (es4Var instanceof eg5)) {
                vn4.p0((eg5) es4Var).T();
            }
            if ((i & 2048) != 0 && (es4Var instanceof qq2)) {
                qq2 qq2Var = (qq2) es4Var;
                zk0.b = null;
                qq2Var.v0(zk0.a);
                if (zk0.b != null) {
                    es4 es4Var2 = (es4) qq2Var;
                    if (!es4Var2.m.z) {
                        ki3.c("visitChildren called on an unattached node");
                    }
                    xx4 xx4Var = new xx4(new es4[16]);
                    es4 es4Var3 = es4Var2.m;
                    es4 es4Var4 = es4Var3.r;
                    if (es4Var4 == null) {
                        vn4.V(xx4Var, es4Var3);
                    } else {
                        xx4Var.b(es4Var4);
                    }
                    while (true) {
                        int i3 = xx4Var.f2559o;
                        if (i3 == 0) {
                            break;
                        }
                        es4 es4VarL0 = (es4) xx4Var.k(i3 - 1);
                        if ((es4VarL0.p & 1024) == 0) {
                            vn4.V(xx4Var, es4VarL0);
                        } else {
                            while (es4VarL0 != null) {
                                if ((es4VarL0.f737o & 1024) != 0) {
                                    xx4 xx4Var2 = null;
                                    while (es4VarL0 != null) {
                                        if (es4VarL0 instanceof br2) {
                                            br2 br2Var = (br2) es4VarL0;
                                            gq2 gq2Var = ((lq2) vn4.q0(br2Var).getFocusOwner()).d;
                                            if (gq2Var.c.a(br2Var)) {
                                                gq2Var.a();
                                            }
                                        } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                            int i4 = 0;
                                            for (es4 es4Var5 = ((vm1) es4VarL0).B; es4Var5 != null; es4Var5 = es4Var5.r) {
                                                if ((es4Var5.f737o & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        es4VarL0 = es4Var5;
                                                    } else {
                                                        if (xx4Var2 == null) {
                                                            xx4Var2 = new xx4(new es4[16]);
                                                        }
                                                        if (es4VarL0 != null) {
                                                            xx4Var2.b(es4VarL0);
                                                            es4VarL0 = null;
                                                        }
                                                        xx4Var2.b(es4Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        es4VarL0 = vn4.l0(xx4Var2);
                                    }
                                    break;
                                }
                                es4VarL0 = es4VarL0.r;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (es4Var instanceof xp2)) {
                xp2 xp2Var = (xp2) es4Var;
                gq2 gq2Var2 = ((lq2) vn4.q0(xp2Var).getFocusOwner()).d;
                if (gq2Var2.d.a(xp2Var)) {
                    gq2Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (es4Var instanceof mh3) && i2 == 2) {
                ((mh3) es4Var).e0();
            }
        }
    }

    public static final void c(es4 es4Var) {
        if (!es4Var.z) {
            ki3.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(es4Var, -1, 0);
    }

    public static final int d(ds4 ds4Var) {
        int i = ds4Var instanceof p04 ? 3 : 1;
        if (ds4Var instanceof s52) {
            i |= 4;
        }
        if (ds4Var instanceof bp6) {
            i |= 8;
        }
        if (ds4Var instanceof qn5) {
            i |= 16;
        }
        if (ds4Var instanceof js4) {
            i |= 32;
        }
        if (ds4Var instanceof dg5) {
            i |= 64;
        }
        return ds4Var instanceof cb0 ? 524288 | i : i;
    }

    public static final int e(es4 es4Var) {
        int i = es4Var.f737o;
        if (i != 0) {
            return i;
        }
        Class<?> cls = es4Var.getClass();
        vw4 vw4Var = a;
        int iD = vw4Var.d(cls);
        if (iD >= 0) {
            return vw4Var.c[iD];
        }
        int i2 = es4Var instanceof r04 ? 3 : 1;
        if (es4Var instanceof t52) {
            i2 |= 4;
        }
        if (es4Var instanceof dp6) {
            i2 |= 8;
        }
        if (es4Var instanceof ln5) {
            i2 |= 16;
        }
        if (es4Var instanceof is4) {
            i2 |= 32;
        }
        if (es4Var instanceof eg5) {
            i2 |= 64;
        }
        if (es4Var instanceof g04) {
            i2 |= 4194432;
        } else if (es4Var instanceof go4) {
            i2 |= 128;
        }
        if (es4Var instanceof gz2) {
            i2 |= 256;
        }
        if (es4Var instanceof xm) {
            i2 |= 512;
        }
        if (es4Var instanceof br2) {
            i2 |= 1024;
        }
        if (es4Var instanceof qq2) {
            i2 |= 2048;
        }
        if (es4Var instanceof xp2) {
            i2 |= 4096;
        }
        if (es4Var instanceof kx3) {
            i2 |= 8192;
        }
        if (es4Var instanceof pg) {
            i2 |= 16384;
        }
        if (es4Var instanceof v01) {
            i2 |= 32768;
        }
        if (es4Var instanceof l28) {
            i2 |= 262144;
        }
        if (es4Var instanceof cb0) {
            i2 |= 524288;
        }
        if (es4Var instanceof br2) {
            i2 |= 1048576;
        }
        if (es4Var instanceof mh3) {
            i2 |= 2097152;
        }
        if (es4Var instanceof e34) {
            i2 |= 8388608;
        }
        vw4Var.g(i2, cls);
        return i2;
    }

    public static final int f(es4 es4Var) {
        if (!(es4Var instanceof vm1)) {
            return e(es4Var);
        }
        vm1 vm1Var = (vm1) es4Var;
        int iF = vm1Var.A;
        for (es4 es4Var2 = vm1Var.B; es4Var2 != null; es4Var2 = es4Var2.r) {
            iF |= f(es4Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
