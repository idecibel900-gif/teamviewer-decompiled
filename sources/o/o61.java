package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o61 extends n61 {
    public km0[] A0;
    public km0[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final k40 K0;
    public ArrayList p0 = new ArrayList();
    public final iu q0 = new iu(this);
    public final sn1 r0;
    public int s0;
    public c61 t0;
    public boolean u0;
    public final ba4 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public o61() {
        sn1 sn1Var = new sn1();
        sn1Var.b = true;
        sn1Var.c = true;
        sn1Var.f = new ArrayList();
        new ArrayList();
        sn1Var.h = null;
        sn1Var.i = new k40();
        sn1Var.g = new ArrayList();
        sn1Var.d = this;
        sn1Var.e = this;
        this.r0 = sn1Var;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new ba4();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new km0[4];
        this.B0 = new km0[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new k40();
    }

    public static void R(n61 n61Var, c61 c61Var, k40 k40Var) {
        int i;
        int i2;
        if (c61Var == null) {
            return;
        }
        int i3 = n61Var.f0;
        int[] iArr = n61Var.t;
        if (i3 == 8 || (n61Var instanceof g43) || (n61Var instanceof a30)) {
            k40Var.e = 0;
            k40Var.f = 0;
            return;
        }
        int[] iArr2 = n61Var.o0;
        k40Var.a = iArr2[0];
        k40Var.b = iArr2[1];
        k40Var.c = n61Var.o();
        k40Var.d = n61Var.i();
        k40Var.i = false;
        k40Var.j = 0;
        boolean z = k40Var.a == 3;
        boolean z2 = k40Var.b == 3;
        boolean z3 = z && n61Var.V > 0.0f;
        boolean z4 = z2 && n61Var.V > 0.0f;
        if (z && n61Var.r(0) && n61Var.r == 0 && !z3) {
            k40Var.a = 2;
            if (z2 && n61Var.s == 0) {
                k40Var.a = 1;
            }
            z = false;
        }
        if (z2 && n61Var.r(1) && n61Var.s == 0 && !z4) {
            k40Var.b = 2;
            if (z && n61Var.r == 0) {
                k40Var.b = 1;
            }
            z2 = false;
        }
        if (n61Var.y()) {
            k40Var.a = 1;
            z = false;
        }
        if (n61Var.z()) {
            k40Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                k40Var.a = 1;
            } else if (!z2) {
                if (k40Var.b == 1) {
                    i2 = k40Var.d;
                } else {
                    k40Var.a = 2;
                    c61Var.b(n61Var, k40Var);
                    i2 = k40Var.f;
                }
                k40Var.a = 1;
                k40Var.c = (int) (n61Var.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                k40Var.b = 1;
            } else if (!z) {
                if (k40Var.a == 1) {
                    i = k40Var.c;
                } else {
                    k40Var.b = 2;
                    c61Var.b(n61Var, k40Var);
                    i = k40Var.e;
                }
                k40Var.b = 1;
                int i4 = n61Var.W;
                float f = n61Var.V;
                if (i4 == -1) {
                    k40Var.d = (int) (i / f);
                } else {
                    k40Var.d = (int) (f * i);
                }
            }
        }
        c61Var.b(n61Var, k40Var);
        n61Var.K(k40Var.e);
        n61Var.H(k40Var.f);
        n61Var.E = k40Var.h;
        int i5 = k40Var.g;
        n61Var.Z = i5;
        n61Var.E = i5 > 0;
        k40Var.j = 0;
    }

    @Override // o.n61
    public final void A() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.A();
    }

    @Override // o.n61
    public final void C(iu iuVar) {
        super.C(iuVar);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((n61) this.p0.get(i)).C(iuVar);
        }
    }

    @Override // o.n61
    public final void L(boolean z, boolean z2) {
        super.L(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((n61) this.p0.get(i)).L(z, z2);
        }
    }

    public final void N(n61 n61Var, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            km0[] km0VarArr = this.B0;
            if (i2 >= km0VarArr.length) {
                km0VarArr = (km0[]) Arrays.copyOf(km0VarArr, km0VarArr.length * 2);
                this.B0 = km0VarArr;
            }
            int i3 = this.y0;
            km0VarArr[i3] = new km0(n61Var, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            km0[] km0VarArr2 = this.A0;
            if (i4 >= km0VarArr2.length) {
                km0VarArr2 = (km0[]) Arrays.copyOf(km0VarArr2, km0VarArr2.length * 2);
                this.A0 = km0VarArr2;
            }
            int i5 = this.z0;
            km0VarArr2[i5] = new km0(n61Var, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void O(ba4 ba4Var) {
        o61 o61Var;
        ba4 ba4Var2;
        boolean zS = S(64);
        b(ba4Var, zS);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            n61 n61Var = (n61) this.p0.get(i);
            boolean[] zArr = n61Var.R;
            zArr[0] = false;
            zArr[1] = false;
            if (n61Var instanceof a30) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                n61 n61Var2 = (n61) this.p0.get(i2);
                if (n61Var2 instanceof a30) {
                    a30 a30Var = (a30) n61Var2;
                    for (int i3 = 0; i3 < a30Var.q0; i3++) {
                        n61 n61Var3 = a30Var.p0[i3];
                        if (a30Var.s0 || n61Var3.c()) {
                            int i4 = a30Var.r0;
                            if (i4 == 0 || i4 == 1) {
                                n61Var3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                n61Var3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            n61 n61Var4 = (n61) this.p0.get(i5);
            n61Var4.getClass();
            if (n61Var4 instanceof g43) {
                n61Var4.b(ba4Var, zS);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((n61) it.next()).getClass();
                io.sentry.h2.f();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((n61) it2.next()).b(ba4Var, zS);
                }
                hashSet.clear();
            }
        }
        if (ba4.q) {
            HashSet<n61> hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                n61 n61Var5 = (n61) this.p0.get(i6);
                n61Var5.getClass();
                if (!(n61Var5 instanceof g43)) {
                    hashSet2.add(n61Var5);
                }
            }
            o61Var = this;
            ba4Var2 = ba4Var;
            o61Var.a(this, ba4Var2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            for (n61 n61Var6 : hashSet2) {
                mo8.i(o61Var, ba4Var2, n61Var6);
                n61Var6.b(ba4Var2, zS);
            }
        } else {
            o61Var = this;
            ba4Var2 = ba4Var;
            for (int i7 = 0; i7 < size; i7++) {
                n61 n61Var7 = (n61) o61Var.p0.get(i7);
                if (n61Var7 instanceof o61) {
                    int[] iArr = n61Var7.o0;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        n61Var7.I(1);
                    }
                    if (i9 == 2) {
                        n61Var7.J(1);
                    }
                    n61Var7.b(ba4Var2, zS);
                    if (i8 == 2) {
                        n61Var7.I(i8);
                    }
                    if (i9 == 2) {
                        n61Var7.J(i9);
                    }
                } else {
                    mo8.i(o61Var, ba4Var2, n61Var7);
                    if (!(n61Var7 instanceof g43)) {
                        n61Var7.b(ba4Var2, zS);
                    }
                }
            }
        }
        if (o61Var.y0 > 0) {
            au8.q(o61Var, ba4Var2, null, 0);
        }
        if (o61Var.z0 > 0) {
            au8.q(o61Var, ba4Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final boolean P(int i, boolean z) {
        boolean z2;
        sn1 sn1Var = this.r0;
        ArrayList<zi8> arrayList = (ArrayList) sn1Var.f;
        o61 o61Var = (o61) sn1Var.d;
        boolean z3 = false;
        int iH = o61Var.h(0);
        int iH2 = o61Var.h(1);
        int iP = o61Var.p();
        int iQ = o61Var.q();
        if (z && (iH == 2 || iH2 == 2)) {
            for (zi8 zi8Var : arrayList) {
                if (zi8Var.f == i && !zi8Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iH == 2) {
                    o61Var.I(1);
                    o61Var.K(sn1Var.d(o61Var, 0));
                    o61Var.d.e.d(o61Var.o());
                }
            } else if (z && iH2 == 2) {
                o61Var.J(1);
                o61Var.H(sn1Var.d(o61Var, 1));
                o61Var.e.e.d(o61Var.i());
            }
        }
        int[] iArr = o61Var.o0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iO = o61Var.o() + iP;
                o61Var.d.i.d(iO);
                o61Var.d.e.d(iO - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int i4 = o61Var.i() + iQ;
                o61Var.e.i.d(i4);
                o61Var.e.e.d(i4 - iQ);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        sn1Var.t();
        for (zi8 zi8Var2 : arrayList) {
            if (zi8Var2.f == i && (zi8Var2.b != o61Var || zi8Var2.g)) {
                zi8Var2.e();
            }
        }
        for (zi8 zi8Var3 : arrayList) {
            if (zi8Var3.f == i && (z2 || zi8Var3.b != o61Var)) {
                if (!zi8Var3.h.j || !zi8Var3.i.j || (!(zi8Var3 instanceof lm0) && !zi8Var3.e.j)) {
                    o61Var.I(iH);
                    o61Var.J(iH2);
                    return z3;
                }
            }
        }
        z3 = true;
        o61Var.I(iH);
        o61Var.J(iH2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:352:0x060c  */
    /* JADX WARN: Code duplicated, block: B:366:0x063b  */
    /* JADX WARN: Code duplicated, block: B:384:0x066f A[PHI: r31
      0x066f: PHI (r31v1 o.w51) = (r31v0 o.w51), (r31v11 o.w51), (r31v11 o.w51) binds: [B:151:0x0267, B:336:0x05d8, B:368:0x063e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:469:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:471:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:473:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:475:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:478:0x0801  */
    /* JADX WARN: Code duplicated, block: B:480:0x0808 A[LOOP:34: B:479:0x0806->B:480:0x0808, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:484:0x081b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:489:0x0828 A[LOOP:33: B:488:0x0826->B:489:0x0828, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:492:0x085d  */
    /* JADX WARN: Code duplicated, block: B:496:0x086e  */
    /* JADX WARN: Code duplicated, block: B:501:0x088d  */
    /* JADX WARN: Code duplicated, block: B:502:0x0899  */
    /* JADX WARN: Code duplicated, block: B:505:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:506:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:508:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:510:0x08bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:513:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:516:0x08d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:521:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:523:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:629:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [o.n61, o.o61] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v126, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v94, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v66, types: [int] */
    /* JADX WARN: Type inference failed for: r6v79, types: [int] */
    public final void Q() {
        ?? r21;
        w51 w51Var;
        int i;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int iMax;
        ?? r10;
        ?? r17;
        boolean z5;
        int iMax2;
        ?? r0;
        boolean z6;
        boolean z7;
        ?? r1;
        ?? r13;
        int i3;
        boolean z8;
        boolean z9;
        ?? r2;
        ?? r3;
        int i4;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zS;
        int size;
        int i5;
        boolean z10;
        n61 n61Var;
        boolean z11;
        yi8 yi8Var;
        yi8 yi8Var2;
        int iB;
        int i6;
        ArrayList arrayList;
        yi8 yi8Var3;
        yi8 yi8Var4;
        boolean z12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i7;
        boolean z13;
        boolean[] zArr = mo8.n;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size2 = this.p0.size();
        int iMax7 = Math.max(0, o());
        int iMax8 = Math.max(0, i());
        int[] iArr = this.o0;
        int i8 = iArr[1];
        int i9 = iArr[0];
        int i10 = this.s0;
        w51 w51Var2 = this.I;
        w51 w51Var3 = this.H;
        if (i10 == 0 && mo8.l(this.C0, 1)) {
            c61 c61Var = this.t0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            B();
            ArrayList arrayList4 = this.p0;
            int size3 = arrayList4.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((n61) arrayList4.get(i13)).B();
            }
            boolean z14 = this.u0;
            if (i11 == 1) {
                F(0, o());
            } else {
                w51Var3.i(0);
                this.X = 0;
            }
            int i14 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i14 < size3) {
                int i15 = i14;
                n61 n61Var2 = (n61) arrayList4.get(i14);
                int[] iArr2 = iArr;
                if (n61Var2 instanceof g43) {
                    g43 g43Var = (g43) n61Var2;
                    z13 = z15;
                    if (g43Var.t0 == 1) {
                        int i16 = g43Var.q0;
                        if (i16 != -1) {
                            g43Var.N(i16);
                        } else if (g43Var.r0 != -1 && y()) {
                            g43Var.N(o() - g43Var.r0);
                        } else if (y()) {
                            g43Var.N((int) ((g43Var.p0 * o()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    z13 = z15;
                    if ((n61Var2 instanceof a30) && ((a30) n61Var2).P() == 0) {
                        z15 = z13;
                        z16 = true;
                    }
                    i14 = i15 + 1;
                    iArr = iArr2;
                }
                z15 = z13;
                i14 = i15 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z15) {
                for (int i17 = 0; i17 < size3; i17 = i7 + 1) {
                    n61 n61Var3 = (n61) arrayList4.get(i17);
                    if (n61Var3 instanceof g43) {
                        g43 g43Var2 = (g43) n61Var3;
                        i7 = i17;
                        if (g43Var2.t0 == 1) {
                            kh.v(0, c61Var, g43Var2, z14);
                        }
                    } else {
                        i7 = i17;
                    }
                }
            }
            kh.v(0, c61Var, this, z14);
            if (z16) {
                for (int i18 = 0; i18 < size3; i18++) {
                    n61 n61Var4 = (n61) arrayList4.get(i18);
                    if (n61Var4 instanceof a30) {
                        a30 a30Var = (a30) n61Var4;
                        if (a30Var.P() == 0 && a30Var.O()) {
                            kh.v(1, c61Var, a30Var, z14);
                        }
                    }
                }
            }
            if (i12 == 1) {
                G(0, i());
            } else {
                w51Var2.i(0);
                this.Y = 0;
            }
            int i19 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (i19 < size3) {
                n61 n61Var5 = (n61) arrayList4.get(i19);
                int i20 = i19;
                if (n61Var5 instanceof g43) {
                    g43 g43Var3 = (g43) n61Var5;
                    if (g43Var3.t0 == 0) {
                        int i21 = g43Var3.q0;
                        if (i21 != -1) {
                            g43Var3.N(i21);
                        } else if (g43Var3.r0 != -1 && z()) {
                            g43Var3.N(i() - g43Var3.r0);
                        } else if (z()) {
                            g43Var3.N((int) ((g43Var3.p0 * i()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else if ((n61Var5 instanceof a30) && ((a30) n61Var5).P() == 1) {
                    z18 = true;
                }
                i19 = i20 + 1;
            }
            if (z17) {
                for (int i22 = 0; i22 < size3; i22++) {
                    n61 n61Var6 = (n61) arrayList4.get(i22);
                    if (n61Var6 instanceof g43) {
                        g43 g43Var4 = (g43) n61Var6;
                        if (g43Var4.t0 == 0) {
                            kh.I(1, c61Var, g43Var4);
                        }
                    }
                }
            }
            kh.I(0, c61Var, this);
            if (z18) {
                for (int i23 = 0; i23 < size3; i23++) {
                    n61 n61Var7 = (n61) arrayList4.get(i23);
                    if (n61Var7 instanceof a30) {
                        a30 a30Var2 = (a30) n61Var7;
                        if (a30Var2.P() == 1 && a30Var2.O()) {
                            kh.I(1, c61Var, a30Var2);
                        }
                    }
                }
            }
            for (int i24 = 0; i24 < size3; i24++) {
                n61 n61Var8 = (n61) arrayList4.get(i24);
                if (n61Var8.x() && kh.m(n61Var8)) {
                    R(n61Var8, c61Var, kh.r);
                    if (!(n61Var8 instanceof g43)) {
                        kh.v(0, c61Var, n61Var8, z14);
                        kh.I(0, c61Var, n61Var8);
                    } else if (((g43) n61Var8).t0 == 0) {
                        kh.I(0, c61Var, n61Var8);
                    } else {
                        kh.v(0, c61Var, n61Var8, z14);
                    }
                }
            }
            for (int i25 = 0; i25 < size2; i25++) {
                n61 n61Var9 = (n61) this.p0.get(i25);
                if (n61Var9.x() && !(n61Var9 instanceof g43) && !(n61Var9 instanceof a30)) {
                    int iH = n61Var9.h(0);
                    int iH2 = n61Var9.h(1);
                    if (iH != 3 || n61Var9.r == 1 || iH2 != 3 || n61Var9.s == 1) {
                        R(n61Var9, this.t0, new k40());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        ba4 ba4Var = this.v0;
        if (size2 <= 2 || !((i9 == 2 || i8 == 2) && mo8.l(this.C0, 1024))) {
            w51Var = w51Var3;
            i = iMax7;
            z = false;
        } else {
            c61 c61Var2 = this.t0;
            ArrayList arrayList5 = this.p0;
            int size4 = arrayList5.size();
            int i26 = 0;
            while (true) {
                if (i26 < size4) {
                    n61 n61Var10 = (n61) arrayList5.get(i26);
                    ?? r4 = r21[0];
                    ?? r6 = r21[1];
                    int[] iArr3 = n61Var10.o0;
                    int i27 = i26;
                    if (zu1.V(r4, r6, iArr3[0], iArr3[1])) {
                        i26 = i27 + 1;
                    } else {
                        w51Var = w51Var3;
                        i = iMax7;
                        z = false;
                    }
                } else {
                    int i28 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList<a30> arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    while (i28 < size4) {
                        int i29 = i28;
                        n61 n61Var11 = (n61) arrayList5.get(i28);
                        ArrayList arrayList12 = arrayList6;
                        ?? r5 = r21[0];
                        ArrayList arrayList13 = arrayList7;
                        ?? r7 = r21[1];
                        ArrayList arrayList14 = arrayList8;
                        int[] iArr4 = n61Var11.o0;
                        w51 w51Var4 = w51Var3;
                        if (!zu1.V(r5, r7, iArr4[0], iArr4[1])) {
                            R(n61Var11, c61Var2, this.K0);
                        }
                        boolean z19 = n61Var11 instanceof g43;
                        if (z19) {
                            g43 g43Var5 = (g43) n61Var11;
                            if (g43Var5.t0 == 0) {
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(g43Var5);
                            } else {
                                arrayList8 = arrayList14;
                            }
                            z12 = z19;
                            if (g43Var5.t0 == 1) {
                                arrayList2 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList2.add(g43Var5);
                            } else {
                                arrayList2 = arrayList12;
                            }
                        } else {
                            z12 = z19;
                            arrayList2 = arrayList12;
                            arrayList8 = arrayList14;
                        }
                        if (!(n61Var11 instanceof a30)) {
                            arrayList7 = arrayList13;
                        } else if (n61Var11 instanceof a30) {
                            a30 a30Var3 = (a30) n61Var11;
                            if (a30Var3.P() == 0) {
                                arrayList3 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList3.add(a30Var3);
                            } else {
                                arrayList3 = arrayList13;
                            }
                            if (a30Var3.P() == 1) {
                                ArrayList arrayList15 = arrayList9 == null ? new ArrayList() : arrayList9;
                                arrayList15.add(a30Var3);
                                arrayList9 = arrayList15;
                            }
                            arrayList7 = arrayList3;
                        } else {
                            a30 a30Var4 = (a30) n61Var11;
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(a30Var4);
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList16 = arrayList9;
                            arrayList16.add(a30Var4);
                            arrayList9 = arrayList16;
                        }
                        if (n61Var11.H.f == null && n61Var11.J.f == null && !z12 && !(n61Var11 instanceof a30)) {
                            if (arrayList10 == null) {
                                arrayList10 = new ArrayList();
                            }
                            ArrayList arrayList17 = arrayList10;
                            arrayList17.add(n61Var11);
                            arrayList10 = arrayList17;
                        }
                        if (n61Var11.I.f == null && n61Var11.K.f == null && n61Var11.L.f == null && !z12 && !(n61Var11 instanceof a30)) {
                            if (arrayList11 == null) {
                                arrayList11 = new ArrayList();
                            }
                            ArrayList arrayList18 = arrayList11;
                            arrayList18.add(n61Var11);
                            arrayList11 = arrayList18;
                        }
                        i28 = i29 + 1;
                        arrayList6 = arrayList2;
                        w51Var3 = w51Var4;
                        c61Var2 = c61Var2;
                    }
                    ArrayList arrayList19 = arrayList6;
                    ArrayList<a30> arrayList20 = arrayList7;
                    w51Var = w51Var3;
                    ArrayList arrayList21 = arrayList8;
                    ArrayList<yi8> arrayList22 = new ArrayList();
                    if (arrayList19 != null) {
                        Iterator it = arrayList19.iterator();
                        while (it.hasNext()) {
                            zu1.s((g43) it.next(), 0, arrayList22, null);
                        }
                    }
                    yi8 yi8Var5 = null;
                    int i30 = 0;
                    if (arrayList20 != null) {
                        for (a30 a30Var5 : arrayList20) {
                            yi8 yi8VarS = zu1.s(a30Var5, i30, arrayList22, yi8Var5);
                            a30Var5.N(i30, arrayList22, yi8VarS);
                            yi8VarS.a(arrayList22);
                            yi8Var5 = null;
                            i30 = 0;
                        }
                    }
                    HashSet hashSet = g(2).a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            zu1.s(((w51) it2.next()).d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet2 = g(4).a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            zu1.s(((w51) it3.next()).d, 0, arrayList22, null);
                        }
                    }
                    HashSet hashSet3 = g(7).a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            zu1.s(((w51) it4.next()).d, 0, arrayList22, null);
                        }
                    }
                    yi8 yi8Var6 = null;
                    if (arrayList10 != null) {
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            zu1.s((n61) it5.next(), 0, arrayList22, null);
                        }
                    }
                    if (arrayList21 != null) {
                        Iterator it6 = arrayList21.iterator();
                        while (it6.hasNext()) {
                            zu1.s((g43) it6.next(), 1, arrayList22, null);
                        }
                    }
                    int i31 = 1;
                    if (arrayList9 != null) {
                        for (a30 a30Var6 : arrayList9) {
                            yi8 yi8VarS2 = zu1.s(a30Var6, i31, arrayList22, yi8Var6);
                            a30Var6.N(i31, arrayList22, yi8VarS2);
                            yi8VarS2.a(arrayList22);
                            yi8Var6 = null;
                            i31 = 1;
                        }
                    }
                    HashSet hashSet4 = g(3).a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            zu1.s(((w51) it7.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet5 = g(6).a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            zu1.s(((w51) it8.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet6 = g(5).a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            zu1.s(((w51) it9.next()).d, 1, arrayList22, null);
                        }
                    }
                    HashSet hashSet7 = g(7).a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            zu1.s(((w51) it10.next()).d, 1, arrayList22, null);
                        }
                    }
                    boolean z20 = true;
                    if (arrayList11 != null) {
                        Iterator it11 = arrayList11.iterator();
                        while (it11.hasNext()) {
                            zu1.s((n61) it11.next(), 1, arrayList22, null);
                        }
                    }
                    int i32 = 0;
                    while (i32 < size4) {
                        n61 n61Var12 = (n61) arrayList5.get(i32);
                        int[] iArr5 = n61Var12.o0;
                        boolean z21 = z20;
                        if (iArr5[0] == 3 && iArr5[z21 ? 1 : 0] == 3) {
                            int i33 = n61Var12.m0;
                            int size5 = arrayList22.size();
                            int i34 = 0;
                            while (true) {
                                if (i34 >= size5) {
                                    i6 = i32;
                                    arrayList = arrayList5;
                                    yi8Var3 = null;
                                    break;
                                }
                                i6 = i32;
                                yi8Var3 = (yi8) arrayList22.get(i34);
                                arrayList = arrayList5;
                                if (i33 == yi8Var3.b) {
                                    break;
                                }
                                i34++;
                                arrayList5 = arrayList;
                                i32 = i6;
                            }
                            int i35 = n61Var12.n0;
                            int size6 = arrayList22.size();
                            int i36 = 0;
                            while (true) {
                                if (i36 >= size6) {
                                    yi8Var4 = null;
                                    break;
                                }
                                yi8Var4 = (yi8) arrayList22.get(i36);
                                if (i35 == yi8Var4.b) {
                                    break;
                                } else {
                                    i36++;
                                }
                            }
                            if (yi8Var3 != null && yi8Var4 != null) {
                                yi8Var3.c(0, yi8Var4);
                                yi8Var4.c = 2;
                                arrayList22.remove(yi8Var3);
                            }
                        } else {
                            i6 = i32;
                            arrayList = arrayList5;
                        }
                        i32 = i6 + 1;
                        arrayList5 = arrayList;
                        z20 = true;
                    }
                    if (arrayList22.size() <= 1) {
                        i = iMax7;
                        z = false;
                    } else {
                        int i37 = 0;
                        if (r21[0] == 2) {
                            int i38 = 0;
                            yi8Var = null;
                            for (yi8 yi8Var7 : arrayList22) {
                                if (yi8Var7.c != 1) {
                                    int iB2 = yi8Var7.b(ba4Var, i37);
                                    if (iB2 > i38) {
                                        yi8Var = yi8Var7;
                                        i38 = iB2;
                                    }
                                    i37 = 0;
                                }
                            }
                            if (yi8Var != null) {
                                I(1);
                                K(i38);
                            } else {
                                yi8Var = null;
                            }
                        } else {
                            yi8Var = null;
                        }
                        if (r21[1] == 2) {
                            int i39 = 0;
                            yi8Var2 = null;
                            for (yi8 yi8Var8 : arrayList22) {
                                if (yi8Var8.c != 0 && (iB = yi8Var8.b(ba4Var, 1)) > i39) {
                                    yi8Var2 = yi8Var8;
                                    i39 = iB;
                                }
                            }
                            if (yi8Var2 != null) {
                                J(1);
                                H(i39);
                            } else {
                                yi8Var2 = null;
                            }
                        } else {
                            yi8Var2 = null;
                        }
                        if (yi8Var == null && yi8Var2 == null) {
                            i = iMax7;
                            z = false;
                        } else {
                            if (i9 == 2) {
                                if (iMax7 >= o() || iMax7 <= 0) {
                                    iMax7 = o();
                                } else {
                                    K(iMax7);
                                    this.D0 = true;
                                }
                            }
                            if (i8 == 2) {
                                if (iMax8 >= i() || iMax8 <= 0) {
                                    iMax8 = i();
                                } else {
                                    H(iMax8);
                                    this.E0 = true;
                                }
                            }
                            i = iMax7;
                            z = true;
                        }
                    }
                }
            }
        }
        boolean z22 = S(64) || S(128);
        ba4Var.getClass();
        ba4Var.h = false;
        if (this.C0 == 0 || !z22) {
            c = 1;
        } else {
            c = 1;
            ba4Var.h = true;
        }
        ArrayList arrayList23 = this.p0;
        boolean z23 = r21[0] == 2 || r21[c] == 2;
        this.y0 = 0;
        this.z0 = 0;
        for (int i40 = 0; i40 < size2; i40++) {
            n61 n61Var13 = (n61) this.p0.get(i40);
            if (n61Var13 instanceof o61) {
                ((o61) n61Var13).Q();
            }
        }
        boolean zS2 = S(64);
        ?? r14 = z;
        int i41 = 0;
        boolean z24 = true;
        while (z24) {
            int i42 = i41 + 1;
            try {
                ba4Var.t();
                this.y0 = 0;
                this.z0 = 0;
                e(ba4Var);
                for (int i43 = 0; i43 < size2; i43++) {
                    ((n61) this.p0.get(i43)).e(ba4Var);
                }
                O(ba4Var);
                try {
                    WeakReference weakReference = this.F0;
                    if (weakReference == null || weakReference.get() == null) {
                        z2 = z23;
                    } else {
                        z2 = z23;
                        try {
                            ba4Var.f(ba4Var.k((w51) this.F0.get()), ba4Var.k(w51Var2), 0, 5);
                            this.F0 = null;
                        } catch (Exception e) {
                            e = e;
                            z11 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            z3 = z11;
                            if (z3) {
                                zArr[2] = false;
                                zS = S(64);
                                M(ba4Var, zS);
                                size = this.p0.size();
                                i5 = 0;
                                z10 = false;
                                while (i5 < size) {
                                    n61Var = (n61) this.p0.get(i5);
                                    n61Var.M(ba4Var, zS);
                                    boolean z25 = zS;
                                    int i44 = size;
                                    if (n61Var.h == -1) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    i5++;
                                    zS = z25;
                                    size = i44;
                                    z10 = z10;
                                }
                                z4 = z10;
                            } else {
                                M(ba4Var, zS2);
                                for (i2 = 0; i2 < size2; i2++) {
                                    ((n61) this.p0.get(i2)).M(ba4Var, zS2);
                                }
                                z4 = false;
                            }
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (i4 = 0; i4 < size2; i4++) {
                                    n61 n61Var14 = (n61) this.p0.get(i4);
                                    iMax4 = Math.max(iMax4, n61Var14.o() + n61Var14.X);
                                    iMax3 = Math.max(iMax3, n61Var14.i() + n61Var14.Y);
                                }
                                iMax5 = Math.max(this.a0, iMax4);
                                iMax6 = Math.max(this.b0, iMax3);
                                r14 = r14;
                                z4 = z4;
                                if (i9 == 2) {
                                    r14 = r14;
                                    z4 = z4;
                                    K(iMax5);
                                    r21[0] = 2;
                                    r14 = 1;
                                    z4 = true;
                                }
                                if (i8 == 2) {
                                    H(iMax6);
                                    r21[1] = 2;
                                    r14 = 1;
                                    z4 = true;
                                }
                            }
                            iMax = Math.max(this.a0, o());
                            if (iMax > o()) {
                                K(iMax);
                                r10 = 1;
                                r21[0] = 1;
                                z5 = true;
                                r17 = 1;
                            } else {
                                r10 = 1;
                                r17 = r14;
                                z5 = z4;
                            }
                            iMax2 = Math.max(this.b0, i());
                            if (iMax2 > i()) {
                                H(iMax2);
                                r21[r10] = r10;
                                r3 = r10;
                                z6 = r3 == true ? 1 : 0;
                            } else {
                                r0 = r17;
                            }
                            if (r0 == 0) {
                                z6 = z5;
                                if (r21[0] == 2) {
                                    r2 = r0;
                                    z9 = z6;
                                    if (o() > i) {
                                        this.D0 = r10;
                                        r21[0] = r10;
                                        K(i);
                                        ?? r8 = r10;
                                        z9 = r8 == true ? 1 : 0;
                                        r2 = r8;
                                    }
                                }
                                r0 = r3;
                                r2 = r0;
                                r2 = r0;
                                z9 = z6;
                                z9 = z6;
                                r1 = r2;
                                r1 = r2;
                                z7 = z9;
                                z7 = z9;
                                if (r21[r10] != 2) {
                                }
                                if (i42 > i3) {
                                    r1 = r2;
                                    z7 = z9;
                                    z8 = false;
                                } else {
                                    r1 = r2;
                                    z7 = z9;
                                }
                                i41 = i42;
                                z23 = z2;
                                w51Var2 = w51Var2;
                                r14 = r13;
                                z24 = z8;
                            } else {
                                z6 = z5;
                                r0 = r3;
                                r1 = r0;
                                z7 = z6;
                            }
                            r1 = r2;
                            z7 = z9;
                            r13 = r1;
                            i3 = 8;
                            z8 = z7;
                            if (i42 > i3) {
                                r1 = r2;
                                z7 = z9;
                                z8 = false;
                            } else {
                                r1 = r2;
                                z7 = z9;
                            }
                            i41 = i42;
                            z23 = z2;
                            w51Var2 = w51Var2;
                            r14 = r13;
                            z24 = z8;
                        }
                    }
                    WeakReference weakReference2 = this.H0;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ba4Var.f(ba4Var.k(this.K), ba4Var.k((w51) this.H0.get()), 0, 5);
                        this.H0 = null;
                    }
                    WeakReference weakReference3 = this.G0;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        w51 w51Var5 = w51Var;
                        try {
                            w51Var = w51Var5;
                            ba4Var.f(ba4Var.k((w51) this.G0.get()), ba4Var.k(w51Var5), 0, 5);
                            this.G0 = null;
                        } catch (Exception e2) {
                            e = e2;
                            w51Var = w51Var5;
                            z11 = true;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            z3 = z11;
                            if (z3) {
                                zArr[2] = false;
                                zS = S(64);
                                M(ba4Var, zS);
                                size = this.p0.size();
                                i5 = 0;
                                z10 = false;
                                while (i5 < size) {
                                    n61Var = (n61) this.p0.get(i5);
                                    n61Var.M(ba4Var, zS);
                                    boolean z26 = zS;
                                    int i45 = size;
                                    if (n61Var.h == -1) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    i5++;
                                    zS = z26;
                                    size = i45;
                                    z10 = z10;
                                }
                                z4 = z10;
                            } else {
                                M(ba4Var, zS2);
                                while (i2 < size2) {
                                    ((n61) this.p0.get(i2)).M(ba4Var, zS2);
                                }
                                z4 = false;
                            }
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i4 < size2) {
                                    n61 n61Var15 = (n61) this.p0.get(i4);
                                    iMax4 = Math.max(iMax4, n61Var15.o() + n61Var15.X);
                                    iMax3 = Math.max(iMax3, n61Var15.i() + n61Var15.Y);
                                }
                                iMax5 = Math.max(this.a0, iMax4);
                                iMax6 = Math.max(this.b0, iMax3);
                                r14 = r14;
                                z4 = z4;
                                if (i9 == 2) {
                                    r14 = r14;
                                    z4 = z4;
                                    K(iMax5);
                                    r21[0] = 2;
                                    r14 = 1;
                                    z4 = true;
                                }
                                if (i8 == 2) {
                                    H(iMax6);
                                    r21[1] = 2;
                                    r14 = 1;
                                    z4 = true;
                                }
                            }
                            iMax = Math.max(this.a0, o());
                            if (iMax > o()) {
                                K(iMax);
                                r10 = 1;
                                r21[0] = 1;
                                z5 = true;
                                r17 = 1;
                            } else {
                                r10 = 1;
                                r17 = r14;
                                z5 = z4;
                            }
                            iMax2 = Math.max(this.b0, i());
                            if (iMax2 > i()) {
                                H(iMax2);
                                r21[r10] = r10;
                                r3 = r10;
                                z6 = r3 == true ? 1 : 0;
                            } else {
                                r0 = r17;
                            }
                            if (r0 == 0) {
                                z6 = z5;
                                if (r21[0] == 2) {
                                    r2 = r0;
                                    z9 = z6;
                                    if (o() > i) {
                                        this.D0 = r10;
                                        r21[0] = r10;
                                        K(i);
                                        ?? r9 = r10;
                                        z9 = r9 == true ? 1 : 0;
                                        r2 = r9;
                                    }
                                }
                                r0 = r3;
                                r2 = r0;
                                r2 = r0;
                                z9 = z6;
                                z9 = z6;
                                r1 = r2;
                                r1 = r2;
                                z7 = z9;
                                z7 = z9;
                                if (r21[r10] != 2) {
                                }
                                if (i42 > i3) {
                                    r1 = r2;
                                    z7 = z9;
                                    z8 = false;
                                } else {
                                    r1 = r2;
                                    z7 = z9;
                                }
                                i41 = i42;
                                z23 = z2;
                                w51Var2 = w51Var2;
                                r14 = r13;
                                z24 = z8;
                            } else {
                                z6 = z5;
                                r0 = r3;
                                r1 = r0;
                                z7 = z6;
                            }
                            r1 = r2;
                            z7 = z9;
                            r13 = r1;
                            i3 = 8;
                            z8 = z7;
                            if (i42 > i3) {
                                r1 = r2;
                                z7 = z9;
                                z8 = false;
                            } else {
                                r1 = r2;
                                z7 = z9;
                            }
                            i41 = i42;
                            z23 = z2;
                            w51Var2 = w51Var2;
                            r14 = r13;
                            z24 = z8;
                        }
                    }
                    WeakReference weakReference4 = this.I0;
                    if (weakReference4 != null && weakReference4.get() != null) {
                        try {
                            try {
                                ba4Var.f(ba4Var.k(this.J), ba4Var.k((w51) this.I0.get()), 0, 5);
                                try {
                                    this.I0 = null;
                                } catch (Exception e3) {
                                    e = e3;
                                    z11 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z3 = z11;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                z11 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z3 = z11;
                                if (z3) {
                                    zArr[2] = false;
                                    zS = S(64);
                                    M(ba4Var, zS);
                                    size = this.p0.size();
                                    i5 = 0;
                                    z10 = false;
                                    while (i5 < size) {
                                        n61Var = (n61) this.p0.get(i5);
                                        n61Var.M(ba4Var, zS);
                                        boolean z27 = zS;
                                        int i46 = size;
                                        if (n61Var.h == -1) {
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                        }
                                        i5++;
                                        zS = z27;
                                        size = i46;
                                        z10 = z10;
                                    }
                                    z4 = z10;
                                } else {
                                    M(ba4Var, zS2);
                                    while (i2 < size2) {
                                        ((n61) this.p0.get(i2)).M(ba4Var, zS2);
                                    }
                                    z4 = false;
                                }
                                if (z2) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i4 < size2) {
                                        n61 n61Var16 = (n61) this.p0.get(i4);
                                        iMax4 = Math.max(iMax4, n61Var16.o() + n61Var16.X);
                                        iMax3 = Math.max(iMax3, n61Var16.i() + n61Var16.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax4);
                                    iMax6 = Math.max(this.b0, iMax3);
                                    r14 = r14;
                                    z4 = z4;
                                    if (i9 == 2) {
                                        r14 = r14;
                                        z4 = z4;
                                        K(iMax5);
                                        r21[0] = 2;
                                        r14 = 1;
                                        z4 = true;
                                    }
                                    if (i8 == 2) {
                                        H(iMax6);
                                        r21[1] = 2;
                                        r14 = 1;
                                        z4 = true;
                                    }
                                }
                                iMax = Math.max(this.a0, o());
                                if (iMax > o()) {
                                    K(iMax);
                                    r10 = 1;
                                    r21[0] = 1;
                                    z5 = true;
                                    r17 = 1;
                                } else {
                                    r10 = 1;
                                    r17 = r14;
                                    z5 = z4;
                                }
                                iMax2 = Math.max(this.b0, i());
                                if (iMax2 > i()) {
                                    H(iMax2);
                                    r21[r10] = r10;
                                    r3 = r10;
                                    z6 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z6 = z5;
                                    if (r21[0] == 2) {
                                        r2 = r0;
                                        z9 = z6;
                                        if (o() > i) {
                                            this.D0 = r10;
                                            r21[0] = r10;
                                            K(i);
                                            ?? r11 = r10;
                                            z9 = r11 == true ? 1 : 0;
                                            r2 = r11;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    z9 = z6;
                                    z9 = z6;
                                    r1 = r2;
                                    r1 = r2;
                                    z7 = z9;
                                    z7 = z9;
                                    if (r21[r10] != 2) {
                                    }
                                    if (i42 > i3) {
                                        r1 = r2;
                                        z7 = z9;
                                        z8 = false;
                                    } else {
                                        r1 = r2;
                                        z7 = z9;
                                    }
                                    i41 = i42;
                                    z23 = z2;
                                    w51Var2 = w51Var2;
                                    r14 = r13;
                                    z24 = z8;
                                } else {
                                    z6 = z5;
                                    r0 = r3;
                                    r1 = r0;
                                    z7 = z6;
                                }
                                r1 = r2;
                                z7 = z9;
                                r13 = r1;
                                i3 = 8;
                                z8 = z7;
                                if (i42 > i3) {
                                    r1 = r2;
                                    z7 = z9;
                                    z8 = false;
                                } else {
                                    r1 = r2;
                                    z7 = z9;
                                }
                                i41 = i42;
                                z23 = z2;
                                w51Var2 = w51Var2;
                                r14 = r13;
                                z24 = z8;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    ba4Var.p();
                    z3 = true;
                } catch (Exception e6) {
                    e = e6;
                    z2 = z23;
                }
            } catch (Exception e7) {
                e = e7;
                z2 = z23;
                z11 = z24;
            }
            if (z3) {
                zArr[2] = false;
                zS = S(64);
                M(ba4Var, zS);
                size = this.p0.size();
                i5 = 0;
                z10 = false;
                while (i5 < size) {
                    n61Var = (n61) this.p0.get(i5);
                    n61Var.M(ba4Var, zS);
                    boolean z28 = zS;
                    int i47 = size;
                    if (n61Var.h == -1 || n61Var.i != -1) {
                        z10 = true;
                    }
                    i5++;
                    zS = z28;
                    size = i47;
                    z10 = z10;
                }
                z4 = z10;
            } else {
                M(ba4Var, zS2);
                while (i2 < size2) {
                    ((n61) this.p0.get(i2)).M(ba4Var, zS2);
                }
                z4 = false;
            }
            if (z2 && i42 < 8 && zArr[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i4 < size2) {
                    n61 n61Var17 = (n61) this.p0.get(i4);
                    iMax4 = Math.max(iMax4, n61Var17.o() + n61Var17.X);
                    iMax3 = Math.max(iMax3, n61Var17.i() + n61Var17.Y);
                }
                iMax5 = Math.max(this.a0, iMax4);
                iMax6 = Math.max(this.b0, iMax3);
                r14 = r14;
                z4 = z4;
                if (i9 == 2 && o() < iMax5) {
                    r14 = r14;
                    z4 = z4;
                    K(iMax5);
                    r21[0] = 2;
                    r14 = 1;
                    z4 = true;
                }
                if (i8 == 2 && i() < iMax6) {
                    H(iMax6);
                    r21[1] = 2;
                    r14 = 1;
                    z4 = true;
                }
            }
            iMax = Math.max(this.a0, o());
            if (iMax > o()) {
                K(iMax);
                r10 = 1;
                r21[0] = 1;
                z5 = true;
                r17 = 1;
            } else {
                r10 = 1;
                r17 = r14;
                z5 = z4;
            }
            iMax2 = Math.max(this.b0, i());
            if (iMax2 > i()) {
                H(iMax2);
                r21[r10] = r10;
                r3 = r10;
                z6 = r3 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z6 = z5;
                if (r21[0] == 2 && i > 0) {
                    r2 = r0;
                    z9 = z6;
                    if (o() > i) {
                        this.D0 = r10;
                        r21[0] = r10;
                        K(i);
                        ?? r12 = r10;
                        z9 = r12 == true ? 1 : 0;
                        r2 = r12;
                    }
                }
                r0 = r3;
                r2 = r0;
                r2 = r0;
                z9 = z6;
                z9 = z6;
                r1 = r2;
                r1 = r2;
                z7 = z9;
                z7 = z9;
                if (r21[r10] != 2 && iMax8 > 0 && i() > iMax8) {
                    this.E0 = r10;
                    r21[r10] = r10;
                    H(iMax8);
                    i3 = 8;
                    r13 = 1;
                    z8 = true;
                }
                if (i42 > i3) {
                    r1 = r2;
                    z7 = z9;
                    z8 = false;
                } else {
                    r1 = r2;
                    z7 = z9;
                }
                i41 = i42;
                z23 = z2;
                w51Var2 = w51Var2;
                r14 = r13;
                z24 = z8;
            } else {
                z6 = z5;
                r0 = r3;
                r1 = r0;
                z7 = z6;
            }
            r1 = r2;
            z7 = z9;
            r13 = r1;
            i3 = 8;
            z8 = z7;
            if (i42 > i3) {
                r1 = r2;
                z7 = z9;
                z8 = false;
            } else {
                r1 = r2;
                z7 = z9;
            }
            i41 = i42;
            z23 = z2;
            w51Var2 = w51Var2;
            r14 = r13;
            z24 = z8;
        }
        this.p0 = arrayList23;
        if (r14 != 0) {
            r21[0] = i9;
            r21[1] = i8;
        }
        C(ba4Var.m);
    }

    public final boolean S(int i) {
        return (this.C0 & i) == i;
    }

    @Override // o.n61
    public final void l(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.U);
        sb.append("\n");
        Iterator it = this.p0.iterator();
        while (it.hasNext()) {
            ((n61) it.next()).l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
