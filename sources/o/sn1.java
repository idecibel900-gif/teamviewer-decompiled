package o;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class sn1 {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public sn1(LayoutNode layoutNode) {
        this.a = (byte) 2;
        this.d = layoutNode;
        this.e = new iu((byte) 20);
        this.f = new a65((byte) 3);
        this.g = new xx4(new LayoutNode[16]);
        this.h = new xx4(new ao4[16]);
    }

    public static boolean f(LayoutNode layoutNode, r61 r61Var) {
        if (layoutNode.u == null) {
            return false;
        }
        boolean zA0 = r61Var != null ? layoutNode.a0(r61Var) : LayoutNode.b0(layoutNode);
        LayoutNode layoutNodeF = layoutNode.F();
        if (zA0 && layoutNodeF != null) {
            if (layoutNodeF.u == null) {
                LayoutNode.u0(layoutNodeF, false, 3);
                return zA0;
            }
            if (layoutNode.C() == a14.m) {
                LayoutNode.s0(layoutNodeF, false, 3);
                return zA0;
            }
            if (layoutNode.C() == a14.n) {
                layoutNodeF.r0(false);
            }
        }
        return zA0;
    }

    public static boolean g(LayoutNode layoutNode, r61 r61Var) {
        boolean zM0 = r61Var != null ? layoutNode.m0(r61Var) : LayoutNode.n0(layoutNode);
        LayoutNode layoutNodeF = layoutNode.F();
        if (zM0 && layoutNodeF != null) {
            if (layoutNode.B() == a14.m) {
                LayoutNode.u0(layoutNodeF, false, 3);
                return zM0;
            }
            if (layoutNode.B() == a14.n) {
                layoutNodeF.t0(false);
            }
        }
        return zM0;
    }

    public static boolean m(LayoutNode layoutNode) {
        xg4 xg4Var;
        c14 c14Var;
        if (layoutNode.x()) {
            return (layoutNode.C() == a14.f282o && ((xg4Var = layoutNode.getLayoutDelegate().q) == null || (c14Var = xg4Var.E) == null || !c14Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean n(LayoutNode layoutNode) {
        if (!layoutNode.A()) {
            return false;
        }
        do {
            if (layoutNode.B() == a14.f282o && !layoutNode.getLayoutDelegate().p.K.e()) {
                LayoutNode layoutNodeF = layoutNode.F();
                if ((layoutNodeF != null ? layoutNodeF.v() : null) != y04.m) {
                    return false;
                }
            }
            layoutNode = layoutNode.F();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.X());
        return true;
    }

    public static boolean o(LayoutNode layoutNode) {
        return layoutNode.X() || layoutNode.Y() || n(layoutNode) || im3.n(layoutNode.Z(), Boolean.TRUE) || m(layoutNode) || layoutNode.n();
    }

    public void a(tn1 tn1Var, int i, ArrayList arrayList, ig6 ig6Var) {
        zi8 zi8Var = tn1Var.d;
        ig6 ig6Var2 = zi8Var.c;
        tn1 tn1Var2 = zi8Var.i;
        tn1 tn1Var3 = zi8Var.h;
        if (ig6Var2 == null) {
            o61 o61Var = (o61) this.d;
            if (zi8Var == o61Var.d || zi8Var == o61Var.e) {
                return;
            }
            if (ig6Var == null) {
                ig6Var = new ig6();
                ig6Var.a = null;
                ig6Var.b = new ArrayList();
                ig6Var.a = zi8Var;
                arrayList.add(ig6Var);
            }
            zi8Var.c = ig6Var;
            ig6Var.b.add(zi8Var);
            for (pn1 pn1Var : tn1Var3.k) {
                if (pn1Var instanceof tn1) {
                    a((tn1) pn1Var, i, arrayList, ig6Var);
                }
            }
            for (pn1 pn1Var2 : tn1Var2.k) {
                if (pn1Var2 instanceof tn1) {
                    a((tn1) pn1Var2, i, arrayList, ig6Var);
                }
            }
            if (i == 1 && (zi8Var instanceof ld8)) {
                for (pn1 pn1Var3 : ((ld8) zi8Var).k.k) {
                    if (pn1Var3 instanceof tn1) {
                        a((tn1) pn1Var3, i, arrayList, ig6Var);
                    }
                }
            }
            Iterator it = tn1Var3.l.iterator();
            while (it.hasNext()) {
                a((tn1) it.next(), i, arrayList, ig6Var);
            }
            Iterator it2 = tn1Var2.l.iterator();
            while (it2.hasNext()) {
                a((tn1) it2.next(), i, arrayList, ig6Var);
            }
            if (i == 1 && (zi8Var instanceof ld8)) {
                Iterator it3 = ((ld8) zi8Var).k.l.iterator();
                while (it3.hasNext()) {
                    a((tn1) it3.next(), i, arrayList, ig6Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:121:0x024c  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0311  */
    /* JADX WARN: Code duplicated, block: B:153:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0215 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0254 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a7 A[DONT_INVERT] */
    public void b(o61 o61Var) {
        int i;
        int iO;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        int i15;
        ArrayList<n61> arrayList = o61Var.p0;
        int[] iArr = o61Var.o0;
        for (n61 n61Var : arrayList) {
            int[] iArr2 = n61Var.o0;
            w51[] w51VarArr = n61Var.P;
            w51 w51Var = n61Var.K;
            w51 w51Var2 = n61Var.I;
            w51 w51Var3 = n61Var.J;
            w51 w51Var4 = n61Var.H;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            if (n61Var.f0 == 8) {
                n61Var.a = true;
            } else {
                float f2 = n61Var.w;
                if (f2 < 1.0f && i16 == 3) {
                    n61Var.r = 2;
                }
                float f3 = n61Var.z;
                if (f3 < 1.0f && i17 == 3) {
                    n61Var.s = 2;
                }
                if (n61Var.V > 0.0f) {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        n61Var.r = 3;
                    } else if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        n61Var.s = 3;
                    } else if (i16 == 3 && i17 == 3) {
                        if (n61Var.r == 0) {
                            n61Var.r = 3;
                        }
                        if (n61Var.s == 0) {
                            n61Var.s = 3;
                        }
                    }
                }
                if (i16 == 3 && n61Var.r == 1 && (w51Var4.f == null || w51Var3.f == null)) {
                    i16 = 2;
                }
                if (i17 == 3 && n61Var.s == 1 && (w51Var2.f == null || w51Var.f == null)) {
                    i17 = 2;
                }
                g63 g63Var = n61Var.d;
                g63Var.d = i16;
                int i18 = n61Var.r;
                g63Var.a = i18;
                ld8 ld8Var = n61Var.e;
                ld8Var.d = i17;
                int i19 = n61Var.s;
                ld8Var.a = i19;
                if (i16 == 4 || i16 == 1) {
                    if (i17 == 4) {
                        if (i17 != 1) {
                            i5 = 2;
                            if (i17 != 2) {
                                if (i16 != 3) {
                                    i6 = i17;
                                    i7 = 1;
                                } else if (i17 == i5 && i17 != 1) {
                                    i6 = i17;
                                    i8 = 3;
                                    i7 = 1;
                                    if (i6 == i8) {
                                        if (i16 == i5 && i16 != i7) {
                                            i12 = i8;
                                            i9 = i6;
                                            i10 = i5;
                                        } else if (i19 == i8) {
                                            if (i16 == i5) {
                                                p(i5, 0, i5, 0, n61Var);
                                            }
                                            int iO2 = n61Var.o();
                                            f = n61Var.V;
                                            if (n61Var.W == -1) {
                                                f = 1.0f / f;
                                            }
                                            p(i7, iO2, i7, (int) ((iO2 * f) + 0.5f), n61Var);
                                            n61Var.d.e.d(n61Var.o());
                                            n61Var.e.e.d(n61Var.i());
                                            n61Var.a = true;
                                        } else {
                                            i9 = i6;
                                            i10 = i5;
                                            if (i19 == 1) {
                                                p(i16, 0, i10, 0, n61Var);
                                                n61Var.e.e.m = n61Var.i();
                                            } else if (i19 == 2) {
                                                i13 = iArr[1];
                                                if (i13 != i7 || i13 == 4) {
                                                    p(i16, n61Var.o(), i7, (int) ((f3 * o61Var.i()) + 0.5f), n61Var);
                                                    n61Var.d.e.d(n61Var.o());
                                                    n61Var.e.e.d(n61Var.i());
                                                    n61Var.a = true;
                                                } else {
                                                    i12 = 3;
                                                }
                                            } else if (w51VarArr[2].f != null || w51VarArr[3].f == null) {
                                                p(i10, 0, i9, 0, n61Var);
                                                n61Var.d.e.d(n61Var.o());
                                                n61Var.e.e.d(n61Var.i());
                                                n61Var.a = true;
                                            } else {
                                                i12 = 3;
                                            }
                                        }
                                        i11 = 1;
                                    } else {
                                        i9 = i6;
                                        i10 = i5;
                                        i11 = 1;
                                        i12 = 3;
                                    }
                                    if (i16 != i12 && i9 == i12) {
                                        if (i18 == i11 || i19 == i11) {
                                            p(i10, 0, i10, 0, n61Var);
                                            n61Var.d.e.m = n61Var.o();
                                            n61Var.e.e.m = n61Var.i();
                                        } else if (i19 == 2 && i18 == 2 && iArr[0] == i7 && iArr[i11] == i7) {
                                            p(i7, (int) ((f2 * o61Var.o()) + 0.5f), i7, (int) ((f3 * o61Var.i()) + 0.5f), n61Var);
                                            n61Var.d.e.d(n61Var.o());
                                            n61Var.e.e.d(n61Var.i());
                                            n61Var.a = true;
                                        }
                                    }
                                } else if (i18 == 3) {
                                    if (i17 == i5) {
                                        p(i5, 0, i5, 0, n61Var);
                                    }
                                    int i20 = n61Var.i();
                                    p(1, (int) ((i20 * n61Var.V) + 0.5f), 1, i20, n61Var);
                                    n61Var.d.e.d(n61Var.o());
                                    n61Var.e.e.d(n61Var.i());
                                    n61Var.a = true;
                                } else {
                                    i14 = i5;
                                    i7 = 1;
                                    if (i18 == 1) {
                                        p(i14, 0, i17, 0, n61Var);
                                        n61Var.d.e.m = n61Var.o();
                                    } else {
                                        i5 = i14;
                                        i6 = i17;
                                        if (i18 == 2) {
                                            i15 = iArr[0];
                                            if (i15 != 1 || i15 == 4) {
                                                p(1, (int) ((f2 * o61Var.o()) + 0.5f), i6, n61Var.i(), n61Var);
                                                n61Var.d.e.d(n61Var.o());
                                                n61Var.e.e.d(n61Var.i());
                                                n61Var.a = true;
                                            }
                                        } else if (w51VarArr[0].f != null || w51VarArr[1].f == null) {
                                            p(i5, 0, i6, 0, n61Var);
                                            n61Var.d.e.d(n61Var.o());
                                            n61Var.e.e.d(n61Var.i());
                                            n61Var.a = true;
                                        }
                                    }
                                }
                                i8 = 3;
                                if (i6 == i8) {
                                    i9 = i6;
                                    i10 = i5;
                                    i11 = 1;
                                    i12 = 3;
                                } else if (i16 == i5) {
                                    if (i19 == i8) {
                                        if (i16 == i5) {
                                            p(i5, 0, i5, 0, n61Var);
                                        }
                                        int iO3 = n61Var.o();
                                        f = n61Var.V;
                                        if (n61Var.W == -1) {
                                            f = 1.0f / f;
                                        }
                                        p(i7, iO3, i7, (int) ((iO3 * f) + 0.5f), n61Var);
                                        n61Var.d.e.d(n61Var.o());
                                        n61Var.e.e.d(n61Var.i());
                                        n61Var.a = true;
                                    } else {
                                        i9 = i6;
                                        i10 = i5;
                                        if (i19 == 1) {
                                            p(i16, 0, i10, 0, n61Var);
                                            n61Var.e.e.m = n61Var.i();
                                        } else if (i19 == 2) {
                                            i13 = iArr[1];
                                            if (i13 != i7) {
                                            }
                                            p(i16, n61Var.o(), i7, (int) ((f3 * o61Var.i()) + 0.5f), n61Var);
                                            n61Var.d.e.d(n61Var.o());
                                            n61Var.e.e.d(n61Var.i());
                                            n61Var.a = true;
                                        } else {
                                            if (w51VarArr[2].f != null) {
                                            }
                                            p(i10, 0, i9, 0, n61Var);
                                            n61Var.d.e.d(n61Var.o());
                                            n61Var.e.e.d(n61Var.i());
                                            n61Var.a = true;
                                        }
                                    }
                                } else if (i19 == i8) {
                                    if (i16 == i5) {
                                        p(i5, 0, i5, 0, n61Var);
                                    }
                                    int iO4 = n61Var.o();
                                    f = n61Var.V;
                                    if (n61Var.W == -1) {
                                        f = 1.0f / f;
                                    }
                                    p(i7, iO4, i7, (int) ((iO4 * f) + 0.5f), n61Var);
                                    n61Var.d.e.d(n61Var.o());
                                    n61Var.e.e.d(n61Var.i());
                                    n61Var.a = true;
                                } else {
                                    i9 = i6;
                                    i10 = i5;
                                    if (i19 == 1) {
                                        p(i16, 0, i10, 0, n61Var);
                                        n61Var.e.e.m = n61Var.i();
                                    } else if (i19 == 2) {
                                        i13 = iArr[1];
                                        if (i13 != i7) {
                                        }
                                        p(i16, n61Var.o(), i7, (int) ((f3 * o61Var.i()) + 0.5f), n61Var);
                                        n61Var.d.e.d(n61Var.o());
                                        n61Var.e.e.d(n61Var.i());
                                        n61Var.a = true;
                                    } else {
                                        if (w51VarArr[2].f != null) {
                                        }
                                        p(i10, 0, i9, 0, n61Var);
                                        n61Var.d.e.d(n61Var.o());
                                        n61Var.e.e.d(n61Var.i());
                                        n61Var.a = true;
                                    }
                                }
                                if (i16 != i12) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iO = n61Var.o();
                        if (i16 == 4) {
                            iO = (o61Var.o() - w51Var4.g) - w51Var3.g;
                            i16 = i;
                        }
                        i2 = n61Var.i();
                        if (i17 == 4) {
                            i3 = (o61Var.i() - w51Var2.g) - w51Var.g;
                            i4 = i;
                        } else {
                            i3 = i2;
                            i4 = i17;
                        }
                        p(i16, iO, i4, i3, n61Var);
                        n61Var.d.e.d(n61Var.o());
                        n61Var.e.e.d(n61Var.i());
                        n61Var.a = true;
                    }
                    i = 1;
                    iO = n61Var.o();
                    if (i16 == 4) {
                        iO = (o61Var.o() - w51Var4.g) - w51Var3.g;
                        i16 = i;
                    }
                    i2 = n61Var.i();
                    if (i17 == 4) {
                        i3 = (o61Var.i() - w51Var2.g) - w51Var.g;
                        i4 = i;
                    } else {
                        i3 = i2;
                        i4 = i17;
                    }
                    p(i16, iO, i4, i3, n61Var);
                    n61Var.d.e.d(n61Var.o());
                    n61Var.e.e.d(n61Var.i());
                    n61Var.a = true;
                } else {
                    i5 = 2;
                    if (i16 == 2) {
                        if (i17 == 4) {
                            if (i17 != 1) {
                                i5 = 2;
                                if (i17 != 2) {
                                }
                            } else {
                                i = 1;
                            }
                            iO = n61Var.o();
                            if (i16 == 4) {
                                iO = (o61Var.o() - w51Var4.g) - w51Var3.g;
                                i16 = i;
                            }
                            i2 = n61Var.i();
                            if (i17 == 4) {
                                i3 = (o61Var.i() - w51Var2.g) - w51Var.g;
                                i4 = i;
                            } else {
                                i3 = i2;
                                i4 = i17;
                            }
                            p(i16, iO, i4, i3, n61Var);
                            n61Var.d.e.d(n61Var.o());
                            n61Var.e.e.d(n61Var.i());
                            n61Var.a = true;
                        }
                        i = 1;
                        iO = n61Var.o();
                        if (i16 == 4) {
                            iO = (o61Var.o() - w51Var4.g) - w51Var3.g;
                            i16 = i;
                        }
                        i2 = n61Var.i();
                        if (i17 == 4) {
                            i3 = (o61Var.i() - w51Var2.g) - w51Var.g;
                            i4 = i;
                        } else {
                            i3 = i2;
                            i4 = i17;
                        }
                        p(i16, iO, i4, i3, n61Var);
                        n61Var.d.e.d(n61Var.o());
                        n61Var.e.e.d(n61Var.i());
                        n61Var.a = true;
                    }
                    if (i16 != 3) {
                        if (i17 == i5) {
                        }
                        if (i18 == 3) {
                            if (i17 == i5) {
                                p(i5, 0, i5, 0, n61Var);
                            }
                            int i21 = n61Var.i();
                            p(1, (int) ((i21 * n61Var.V) + 0.5f), 1, i21, n61Var);
                            n61Var.d.e.d(n61Var.o());
                            n61Var.e.e.d(n61Var.i());
                            n61Var.a = true;
                        } else {
                            i14 = i5;
                            i7 = 1;
                            if (i18 == 1) {
                                p(i14, 0, i17, 0, n61Var);
                                n61Var.d.e.m = n61Var.o();
                            } else {
                                i5 = i14;
                                i6 = i17;
                                if (i18 == 2) {
                                    i15 = iArr[0];
                                    if (i15 != 1) {
                                    }
                                    p(1, (int) ((f2 * o61Var.o()) + 0.5f), i6, n61Var.i(), n61Var);
                                    n61Var.d.e.d(n61Var.o());
                                    n61Var.e.e.d(n61Var.i());
                                    n61Var.a = true;
                                } else {
                                    if (w51VarArr[0].f != null) {
                                    }
                                    p(i5, 0, i6, 0, n61Var);
                                    n61Var.d.e.d(n61Var.o());
                                    n61Var.e.e.d(n61Var.i());
                                    n61Var.a = true;
                                }
                            }
                        }
                    } else {
                        i6 = i17;
                        i7 = 1;
                    }
                    i8 = 3;
                    if (i6 == i8) {
                        i9 = i6;
                        i10 = i5;
                        i11 = 1;
                        i12 = 3;
                    } else if (i16 == i5) {
                        if (i19 == i8) {
                            if (i16 == i5) {
                                p(i5, 0, i5, 0, n61Var);
                            }
                            int iO5 = n61Var.o();
                            f = n61Var.V;
                            if (n61Var.W == -1) {
                                f = 1.0f / f;
                            }
                            p(i7, iO5, i7, (int) ((iO5 * f) + 0.5f), n61Var);
                            n61Var.d.e.d(n61Var.o());
                            n61Var.e.e.d(n61Var.i());
                            n61Var.a = true;
                        } else {
                            i9 = i6;
                            i10 = i5;
                            if (i19 == 1) {
                                p(i16, 0, i10, 0, n61Var);
                                n61Var.e.e.m = n61Var.i();
                            } else if (i19 == 2) {
                                i13 = iArr[1];
                                if (i13 != i7) {
                                }
                                p(i16, n61Var.o(), i7, (int) ((f3 * o61Var.i()) + 0.5f), n61Var);
                                n61Var.d.e.d(n61Var.o());
                                n61Var.e.e.d(n61Var.i());
                                n61Var.a = true;
                            } else {
                                if (w51VarArr[2].f != null) {
                                }
                                p(i10, 0, i9, 0, n61Var);
                                n61Var.d.e.d(n61Var.o());
                                n61Var.e.e.d(n61Var.i());
                                n61Var.a = true;
                            }
                        }
                    } else if (i19 == i8) {
                        if (i16 == i5) {
                            p(i5, 0, i5, 0, n61Var);
                        }
                        int iO6 = n61Var.o();
                        f = n61Var.V;
                        if (n61Var.W == -1) {
                            f = 1.0f / f;
                        }
                        p(i7, iO6, i7, (int) ((iO6 * f) + 0.5f), n61Var);
                        n61Var.d.e.d(n61Var.o());
                        n61Var.e.e.d(n61Var.i());
                        n61Var.a = true;
                    } else {
                        i9 = i6;
                        i10 = i5;
                        if (i19 == 1) {
                            p(i16, 0, i10, 0, n61Var);
                            n61Var.e.e.m = n61Var.i();
                        } else if (i19 == 2) {
                            i13 = iArr[1];
                            if (i13 != i7) {
                            }
                            p(i16, n61Var.o(), i7, (int) ((f3 * o61Var.i()) + 0.5f), n61Var);
                            n61Var.d.e.d(n61Var.o());
                            n61Var.e.e.d(n61Var.i());
                            n61Var.a = true;
                        } else {
                            if (w51VarArr[2].f != null) {
                            }
                            p(i10, 0, i9, 0, n61Var);
                            n61Var.d.e.d(n61Var.o());
                            n61Var.e.e.d(n61Var.i());
                            n61Var.a = true;
                        }
                    }
                    if (i16 != i12) {
                    }
                }
            }
        }
    }

    public void c() {
        o61 o61Var = (o61) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList<zi8> arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        o61 o61Var2 = (o61) this.e;
        o61Var2.d.f();
        o61Var2.e.f();
        arrayList2.add(o61Var2.d);
        arrayList2.add(o61Var2.e);
        HashSet hashSet = null;
        for (n61 n61Var : o61Var2.p0) {
            if (n61Var instanceof g43) {
                h43 h43Var = new h43(n61Var);
                n61Var.d.f();
                n61Var.e.f();
                h43Var.f = ((g43) n61Var).t0;
                arrayList2.add(h43Var);
            } else {
                if (n61Var.v()) {
                    if (n61Var.b == null) {
                        n61Var.b = new lm0(n61Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(n61Var.b);
                } else {
                    arrayList2.add(n61Var.d);
                }
                if (n61Var.w()) {
                    if (n61Var.c == null) {
                        n61Var.c = new lm0(n61Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(n61Var.c);
                } else {
                    arrayList2.add(n61Var.e);
                }
                if (n61Var instanceof a30) {
                    arrayList2.add(new q53(n61Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((zi8) it.next()).f();
        }
        for (zi8 zi8Var : arrayList2) {
            if (zi8Var.b != o61Var2) {
                zi8Var.d();
            }
        }
        arrayList.clear();
        j(o61Var.d, 0, arrayList);
        j(o61Var.e, 1, arrayList);
        this.b = false;
    }

    public int d(o61 o61Var, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            zi8 zi8Var = ((ig6) arrayList2.get(i3)).a;
            if (!(zi8Var instanceof lm0) ? !(i != 0 ? (zi8Var instanceof ld8) : (zi8Var instanceof g63)) : ((lm0) zi8Var).f != i) {
                tn1 tn1Var = (i == 0 ? o61Var.d : o61Var.e).h;
                tn1 tn1Var2 = (i == 0 ? o61Var.d : o61Var.e).i;
                tn1 tn1Var3 = zi8Var.h;
                tn1 tn1Var4 = zi8Var.i;
                boolean zContains = tn1Var3.l.contains(tn1Var);
                boolean zContains2 = tn1Var4.l.contains(tn1Var2);
                long j4 = zi8Var.j();
                if (zContains && zContains2) {
                    long jB = ig6.b(tn1Var3, j3);
                    arrayList = arrayList2;
                    long jA = ig6.a(tn1Var4, j3);
                    long j5 = jB - j4;
                    int i4 = tn1Var4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = tn1Var3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    n61 n61Var = zi8Var.b;
                    if (i == 0) {
                        f = n61Var.c0;
                    } else if (i == 1) {
                        f = n61Var.d0;
                    } else {
                        n61Var.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) tn1Var3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) ua5.c(1.0f, f, f2, 0.5f)))) - ((long) tn1Var4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(ig6.b(tn1Var3, tn1Var3.f), ((long) tn1Var3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-ig6.a(tn1Var4, tn1Var4.f), ((long) (-tn1Var4.f)) + j4);
                    } else {
                        j = (zi8Var.j() + ((long) tn1Var3.f)) - ((long) tn1Var4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void e(boolean z) {
        a65 a65Var = (a65) this.f;
        xx4 xx4Var = (xx4) a65Var.n;
        if (z) {
            LayoutNode layoutNode = (LayoutNode) this.d;
            if (layoutNode.b0 > 0) {
                xx4Var.g();
                xx4Var.b(layoutNode);
                layoutNode.a0 = true;
            }
        }
        if (xx4Var.f2559o != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                a65Var.y0();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void h() {
        xx4 xx4Var = (xx4) this.h;
        int i = xx4Var.f2559o;
        if (i != 0) {
            Object[] objArr = xx4Var.m;
            for (int i2 = 0; i2 < i; i2++) {
                ao4 ao4Var = (ao4) objArr[i2];
                if (ao4Var.a.W()) {
                    boolean z = ao4Var.b;
                    LayoutNode layoutNode = ao4Var.a;
                    boolean z2 = ao4Var.c;
                    if (z) {
                        LayoutNode.s0(layoutNode, z2, 2);
                    } else {
                        LayoutNode.u0(layoutNode, z2, 2);
                    }
                }
            }
            xx4Var.g();
        }
    }

    public void i(LayoutNode layoutNode) {
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (im3.n(layoutNode2.Z(), Boolean.TRUE) && !layoutNode2.c0) {
                if (((iu) this.e).j(layoutNode2)) {
                    layoutNode2.c0();
                }
                i(layoutNode2);
            }
        }
    }

    public void j(zi8 zi8Var, int i, ArrayList arrayList) {
        tn1 tn1Var = zi8Var.h;
        tn1 tn1Var2 = zi8Var.i;
        for (pn1 pn1Var : tn1Var.k) {
            if (pn1Var instanceof tn1) {
                a((tn1) pn1Var, i, arrayList, null);
            } else if (pn1Var instanceof zi8) {
                a(((zi8) pn1Var).h, i, arrayList, null);
            }
        }
        for (pn1 pn1Var2 : tn1Var2.k) {
            if (pn1Var2 instanceof tn1) {
                a((tn1) pn1Var2, i, arrayList, null);
            } else if (pn1Var2 instanceof zi8) {
                a(((zi8) pn1Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (pn1 pn1Var3 : ((ld8) zi8Var).k.k) {
                if (pn1Var3 instanceof tn1) {
                    a((tn1) pn1Var3, i, arrayList, null);
                }
            }
        }
    }

    public void k(LayoutNode layoutNode, boolean z) {
        if (!this.b) {
            ki3.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.x() : layoutNode.A()) {
            ki3.a("node not yet measured");
        }
        l(layoutNode, z);
    }

    public void l(LayoutNode layoutNode, boolean z) {
        xg4 xg4Var;
        c14 c14Var;
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            a14 a14Var = a14.m;
            if ((!z && (layoutNode2.B() == a14Var || layoutNode2.getLayoutDelegate().p.K.e())) || (z && (layoutNode2.C() == a14Var || ((xg4Var = layoutNode2.getLayoutDelegate().q) != null && (c14Var = xg4Var.E) != null && c14Var.e())))) {
                if (io1.X(layoutNode2) && !z) {
                    if (layoutNode2.x() && ((iu) this.e).j(layoutNode2)) {
                        v(layoutNode2, true);
                    } else {
                        k(layoutNode2, true);
                    }
                }
                if (z ? layoutNode2.x() : layoutNode2.A()) {
                    v(layoutNode2, z);
                }
                if (!(z ? layoutNode2.x() : layoutNode2.A())) {
                    l(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.x() : layoutNode.A()) {
            v(layoutNode, z);
        }
    }

    public void p(int i, int i2, int i3, int i4, n61 n61Var) {
        k40 k40Var = (k40) this.i;
        k40Var.a = i;
        k40Var.b = i3;
        k40Var.c = i2;
        k40Var.d = i4;
        ((c61) this.h).b(n61Var, k40Var);
        n61Var.K(k40Var.e);
        n61Var.H(k40Var.f);
        n61Var.E = k40Var.h;
        int i5 = k40Var.g;
        n61Var.Z = i5;
        n61Var.E = i5 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public boolean q(Function0 function0) {
        boolean z;
        ?? L0;
        boolean z2;
        LayoutNode layoutNode;
        boolean z3;
        boolean zV;
        iu iuVar = (iu) this.e;
        xk1 xk1Var = (xk1) iuVar.f1103o;
        LayoutNode layoutNode2 = (LayoutNode) this.d;
        if (!layoutNode2.W()) {
            ki3.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.X()) {
            ki3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            ki3.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (((r61) this.i) != null) {
            this.b = true;
            this.c = true;
            try {
                if (iuVar.I()) {
                    z = false;
                    while (true) {
                        xk1 xk1Var2 = (xk1) iuVar.n;
                        m67 m67Var = (m67) xk1Var2.n;
                        xk1 xk1Var3 = (xk1) iuVar.p;
                        m67 m67Var2 = (m67) xk1Var3.n;
                        if (!((m67) xk1Var.n).isEmpty()) {
                            layoutNode = (LayoutNode) ((m67) xk1Var.n).first();
                            xk1Var.S(layoutNode);
                            z3 = layoutNode.u != null;
                            z2 = false;
                        } else if (!m67Var2.isEmpty()) {
                            layoutNode = (LayoutNode) m67Var2.first();
                            xk1Var3.S(layoutNode);
                            z3 = layoutNode.u != null;
                            z2 = true;
                        } else {
                            if (m67Var.isEmpty()) {
                                break;
                            }
                            LayoutNode layoutNode3 = (LayoutNode) m67Var.first();
                            xk1Var2.S(layoutNode3);
                            z2 = true;
                            layoutNode = layoutNode3;
                            z3 = false;
                        }
                        if (z2) {
                            zV = u(layoutNode, z3);
                        } else {
                            zV = v(layoutNode, z3);
                            if (layoutNode.w()) {
                                iuVar.b(layoutNode, sm3.n);
                            }
                            if (layoutNode.u()) {
                                iuVar.b(layoutNode, sm3.p);
                            }
                        }
                        if (layoutNode == layoutNode2 && zV) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.a();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        xx4 xx4Var = (xx4) this.g;
        Object[] objArr = xx4Var.m;
        int i2 = xx4Var.f2559o;
        int i3 = 0;
        while (i3 < i2) {
            nf nfVar = ((LayoutNode) objArr[i3]).S;
            ti3 ti3Var = (ti3) nfVar.d;
            boolean zG = k45.g(4194304);
            es4 es4Var = ti3Var.q0;
            if (zG || (es4Var = es4Var.q) != null) {
                at4 at4Var = e45.j0;
                es4 es4VarD1 = ti3Var.d1(zG);
                while (es4VarD1 != null && (es4VarD1.p & 4194304) != 0) {
                    if ((es4VarD1.f737o & 4194304) != 0) {
                        ?? r12 = es4VarD1;
                        ?? xx4Var2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof g04) {
                                ((g04) r12).Y((ti3) nfVar.d);
                            } else {
                                if ((r12.f737o & 4194304) != 0 && (r12 instanceof vm1)) {
                                    es4 es4Var2 = ((vm1) r12).B;
                                    int i4 = i;
                                    while (es4Var2 != null) {
                                        if ((es4Var2.f737o & 4194304) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                L0 = r12;
                                                xx4Var2 = xx4Var2;
                                                xx4Var2 = xx4Var2;
                                                L0 = es4Var2;
                                            } else {
                                                if (xx4Var2 == 0) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var2.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var2.b(es4Var2);
                                            }
                                        } else {
                                            L0 = r12;
                                            xx4Var2 = xx4Var2;
                                        }
                                        es4Var2 = es4Var2.r;
                                        L0 = L0;
                                        xx4Var2 = xx4Var2;
                                    }
                                    if (i4 == 1) {
                                        L0 = r12;
                                        xx4Var2 = xx4Var2;
                                    }
                                }
                                i = 0;
                                r12 = L0;
                                xx4Var2 = xx4Var2;
                            }
                            L0 = r12;
                            xx4Var2 = xx4Var2;
                            L0 = vn4.l0(xx4Var2);
                            i = 0;
                            r12 = L0;
                            xx4Var2 = xx4Var2;
                        }
                    }
                    if (es4VarD1 == es4Var) {
                        break;
                    }
                    es4VarD1 = es4VarD1.r;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        xx4Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public void r(LayoutNode layoutNode, long j) {
        LayoutNode layoutNode2 = (LayoutNode) this.d;
        if (layoutNode.c0) {
            return;
        }
        if (layoutNode == layoutNode2) {
            ki3.a("measureAndLayout called on root");
        }
        if (!layoutNode2.W()) {
            ki3.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.X()) {
            ki3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            ki3.a("performMeasureAndLayout called during measure layout");
        }
        if (((r61) this.i) != null) {
            this.b = true;
            this.c = false;
            try {
                iu iuVar = (iu) this.e;
                ((xk1) iuVar.f1103o).S(layoutNode);
                ((xk1) iuVar.p).S(layoutNode);
                ((xk1) iuVar.n).S(layoutNode);
                if (f(layoutNode, new r61(j)) || layoutNode.w()) {
                    if (im3.n(layoutNode.Z(), Boolean.TRUE)) {
                        layoutNode.c0();
                    }
                }
                i(layoutNode);
                g(layoutNode, new r61(j));
                if (layoutNode.u() && layoutNode.X()) {
                    layoutNode.q0();
                    a65 a65Var = (a65) this.f;
                    if (layoutNode.b0 > 0) {
                        ((xx4) a65Var.n).b(layoutNode);
                        layoutNode.a0 = true;
                    }
                }
                h();
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        xx4 xx4Var = (xx4) this.g;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            nf nfVar = ((LayoutNode) objArr[i2]).S;
            ti3 ti3Var = (ti3) nfVar.d;
            boolean zG = k45.g(4194304);
            es4 es4Var = ti3Var.q0;
            if (zG || (es4Var = es4Var.q) != null) {
                at4 at4Var = e45.j0;
                for (es4 es4VarD1 = ti3Var.d1(zG); es4VarD1 != null && (es4VarD1.p & 4194304) != 0; es4VarD1 = es4VarD1.r) {
                    if ((es4VarD1.f737o & 4194304) != 0) {
                        ?? L0 = es4VarD1;
                        ?? xx4Var2 = 0;
                        while (L0 != 0) {
                            if (L0 instanceof g04) {
                                ((g04) L0).Y((ti3) nfVar.d);
                            } else if ((L0.f737o & 4194304) != 0 && (L0 instanceof vm1)) {
                                es4 es4Var2 = ((vm1) L0).B;
                                int i3 = 0;
                                while (es4Var2 != null) {
                                    if ((es4Var2.f737o & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            L0 = L0;
                                            xx4Var2 = xx4Var2;
                                            xx4Var2 = xx4Var2;
                                            L0 = es4Var2;
                                        } else {
                                            if (xx4Var2 == 0) {
                                                xx4Var2 = new xx4(new es4[16]);
                                            }
                                            if (L0 != 0) {
                                                xx4Var2.b(L0);
                                                L0 = 0;
                                            }
                                            xx4Var2.b(es4Var2);
                                        }
                                    } else {
                                        L0 = L0;
                                        xx4Var2 = xx4Var2;
                                    }
                                    es4Var2 = es4Var2.r;
                                    L0 = L0;
                                    xx4Var2 = xx4Var2;
                                }
                                if (i3 == 1) {
                                    L0 = L0;
                                    xx4Var2 = xx4Var2;
                                } else {
                                    L0 = L0;
                                    xx4Var2 = xx4Var2;
                                }
                            }
                            L0 = vn4.l0(xx4Var2);
                        }
                    }
                    if (es4VarD1 == es4Var) {
                        break;
                    }
                }
            }
        }
        xx4Var.g();
    }

    public void s() {
        LayoutNode layoutNode = (LayoutNode) this.d;
        iu iuVar = (iu) this.e;
        if (iuVar.I()) {
            if (!layoutNode.W()) {
                ki3.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.X()) {
                ki3.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                ki3.a("performMeasureAndLayout called during measure layout");
            }
            if (((r61) this.i) != null) {
                this.b = true;
                this.c = false;
                try {
                    if ((((m67) ((xk1) iuVar.n).n).isEmpty() || ((m67) ((xk1) iuVar.f1103o).n).isEmpty()) ? false : true) {
                        if (layoutNode.u != null) {
                            x(layoutNode, true);
                        } else {
                            w(layoutNode);
                        }
                    }
                    x(layoutNode, false);
                    this.b = false;
                    this.c = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.b = false;
                        this.c = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public void t() {
        sn1 sn1Var;
        g40 g40Var;
        for (n61 n61Var : ((o61) this.d).p0) {
            if (!n61Var.a) {
                int[] iArr = n61Var.o0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = n61Var.r;
                int i4 = n61Var.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                k12 k12Var = n61Var.d.e;
                boolean z3 = k12Var.j;
                k12 k12Var2 = n61Var.e.e;
                boolean z4 = k12Var2.j;
                boolean z5 = z2;
                if (z3 && z4) {
                    sn1Var = this;
                    sn1Var.p(1, k12Var.g, 1, k12Var2.g, n61Var);
                    n61Var.a = true;
                } else if (z3 && z) {
                    sn1Var = this;
                    sn1Var.p(1, k12Var.g, 2, k12Var2.g, n61Var);
                    ld8 ld8Var = n61Var.e;
                    if (i2 == 3) {
                        ld8Var.e.m = n61Var.i();
                    } else {
                        ld8Var.e.d(n61Var.i());
                        n61Var.a = true;
                    }
                } else {
                    sn1Var = this;
                    if (z4 && z5) {
                        sn1Var.p(2, k12Var.g, 1, k12Var2.g, n61Var);
                        g63 g63Var = n61Var.d;
                        if (i == 3) {
                            g63Var.e.m = n61Var.o();
                        } else {
                            g63Var.e.d(n61Var.o());
                            n61Var.a = true;
                        }
                    }
                }
                if (n61Var.a && (g40Var = n61Var.e.l) != null) {
                    g40Var.d(n61Var.Z);
                }
                this = sn1Var;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return lv0.t0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public boolean u(LayoutNode layoutNode, boolean z) {
        r61 r61Var;
        LayoutNode layoutNodeF;
        LayoutNode layoutNode2 = (LayoutNode) this.d;
        boolean zG = false;
        if (!layoutNode.c0 && o(layoutNode)) {
            if (layoutNode == layoutNode2) {
                r61Var = (r61) this.i;
                r61Var.getClass();
            } else {
                r61Var = null;
            }
            if (z) {
                zG = layoutNode.x() ? f(layoutNode, r61Var) : false;
                if ((zG || layoutNode.w()) && im3.n(layoutNode.Z(), Boolean.TRUE)) {
                    layoutNode.c0();
                }
            } else {
                zG = layoutNode.A() ? g(layoutNode, r61Var) : false;
                if (layoutNode.u() && (layoutNode == layoutNode2 || ((layoutNodeF = layoutNode.F()) != null && layoutNodeF.X() && layoutNode.Y()))) {
                    if (layoutNode == layoutNode2) {
                        layoutNode.l0();
                    } else {
                        layoutNode.q0();
                    }
                    a65 a65Var = (a65) this.f;
                    if (layoutNode.b0 > 0) {
                        ((xx4) a65Var.n).b(layoutNode);
                        layoutNode.a0 = true;
                    }
                }
            }
            h();
        }
        return zG;
    }

    public boolean v(LayoutNode layoutNode, boolean z) {
        r61 r61Var;
        boolean zG = false;
        if (!layoutNode.c0 && o(layoutNode)) {
            if (layoutNode == ((LayoutNode) this.d)) {
                r61Var = (r61) this.i;
                r61Var.getClass();
            } else {
                r61Var = null;
            }
            if (z) {
                if (layoutNode.x()) {
                    zG = f(layoutNode, r61Var);
                }
            } else if (layoutNode.A()) {
                zG = g(layoutNode, r61Var);
            }
            h();
        }
        return zG;
    }

    public void w(LayoutNode layoutNode) {
        xx4 xx4VarL = layoutNode.L();
        Object[] objArr = xx4VarL.m;
        int i = xx4VarL.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.B() == a14.m || layoutNode2.getLayoutDelegate().p.K.e()) {
                if (io1.X(layoutNode2)) {
                    x(layoutNode2, true);
                } else {
                    w(layoutNode2);
                }
            }
        }
    }

    public void x(LayoutNode layoutNode, boolean z) {
        r61 r61Var;
        if (layoutNode.c0) {
            return;
        }
        if (layoutNode == ((LayoutNode) this.d)) {
            r61Var = (r61) this.i;
            r61Var.getClass();
        } else {
            r61Var = null;
        }
        if (z) {
            f(layoutNode, r61Var);
        } else {
            g(layoutNode, r61Var);
        }
    }

    public boolean y(LayoutNode layoutNode, boolean z) {
        int iOrdinal = layoutNode.v().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((xx4) this.h).b(new ao4(layoutNode, false, z));
            } else {
                if (iOrdinal != 4) {
                    gk0.s();
                    return false;
                }
                if (!layoutNode.A() || z) {
                    layoutNode.g0();
                    if (!layoutNode.c0 && (layoutNode.X() || n(layoutNode))) {
                        LayoutNode layoutNodeF = layoutNode.F();
                        if (layoutNodeF == null || !layoutNodeF.A()) {
                            ((iu) this.e).b(layoutNode, sm3.f2031o);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void z(long j) {
        LayoutNode layoutNode = (LayoutNode) this.d;
        r61 r61Var = (r61) this.i;
        if (r61Var == null ? false : r61.c(r61Var.a, j)) {
            return;
        }
        if (this.b) {
            ki3.a("updateRootConstraints called while measuring");
        }
        this.i = new r61(j);
        if (layoutNode.W()) {
            if (layoutNode.u != null) {
                layoutNode.f0();
            }
            layoutNode.g0();
            ((iu) this.e).b(layoutNode, layoutNode.u != null ? sm3.m : sm3.f2031o);
        }
    }

    public /* synthetic */ sn1() {
        this.a = (byte) 0;
    }

    public sn1(boolean z, boolean z2, wg5 wg5Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = (byte) 1;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = wg5Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = xm4.V(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn1(boolean z, boolean z2, wg5 wg5Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, wg5Var, l, l2, l3, l4, fa2.m);
        this.a = (byte) 1;
    }
}
