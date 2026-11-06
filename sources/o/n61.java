package o;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n61 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public final w51 H;
    public final w51 I;
    public final w51 J;
    public final w51 K;
    public final w51 L;
    public final w51 M;
    public final w51 N;
    public final w51 O;
    public final w51[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public o61 S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public lm0 b;
    public int b0;
    public lm0 c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public String j;
    public final float[] j0;
    public boolean k;
    public final n61[] k0;
    public boolean l;
    public final n61[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1543o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public g63 d = null;
    public ld8 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public n61() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.f1543o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = 0;
        this.G = 0;
        w51 w51Var = new w51(this, 2);
        this.H = w51Var;
        w51 w51Var2 = new w51(this, 3);
        this.I = w51Var2;
        w51 w51Var3 = new w51(this, 4);
        this.J = w51Var3;
        w51 w51Var4 = new w51(this, 5);
        this.K = w51Var4;
        w51 w51Var5 = new w51(this, 6);
        this.L = w51Var5;
        w51 w51Var6 = new w51(this, 8);
        this.M = w51Var6;
        w51 w51Var7 = new w51(this, 9);
        this.N = w51Var7;
        w51 w51Var8 = new w51(this, 7);
        this.O = w51Var8;
        this.P = new w51[]{w51Var, w51Var3, w51Var2, w51Var4, w51Var5, w51Var8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new n61[]{null, null};
        this.l0 = new n61[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(w51Var);
        arrayList.add(w51Var2);
        arrayList.add(w51Var3);
        arrayList.add(w51Var4);
        arrayList.add(w51Var6);
        arrayList.add(w51Var7);
        arrayList.add(w51Var8);
        arrayList.add(w51Var5);
    }

    public static void D(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void E(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void m(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            e41.t(sb, "      behavior", " :   ", str2, ",\n");
        }
        D(i, 0, "      size", sb);
        D(i2, 0, "      min", sb);
        D(i3, Integer.MAX_VALUE, "      max", sb);
        D(i4, 0, "      matchMin", sb);
        D(i5, 0, "      matchDef", sb);
        E(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void n(StringBuilder sb, String str, w51 w51Var) {
        if (w51Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(w51Var.f);
        sb.append("'");
        if (w51Var.h != Integer.MIN_VALUE || w51Var.g != 0) {
            sb.append(",");
            sb.append(w51Var.g);
            if (w51Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(w51Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void A() {
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.S = null;
        this.D = Float.NaN;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        int[] iArr = this.o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        float[] fArr = this.j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1543o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w51 w51Var = (w51) arrayList.get(i);
            w51Var.c = false;
            w51Var.b = 0;
        }
    }

    public void C(iu iuVar) {
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.O.h();
        this.M.h();
        this.N.h();
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.H.i(i);
        this.J.i(i2);
        this.X = i;
        this.T = i2 - i;
        this.k = true;
    }

    public final void G(int i, int i2) {
        if (this.l) {
            return;
        }
        this.I.i(i);
        this.K.i(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.E) {
            this.L.i(i + this.Z);
        }
        this.l = true;
    }

    public final void H(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void I(int i) {
        this.o0[0] = i;
    }

    public final void J(int i) {
        this.o0[1] = i;
    }

    public final void K(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void L(boolean z, boolean z2) {
        int i;
        int i2;
        g63 g63Var = this.d;
        boolean z3 = z & g63Var.g;
        ld8 ld8Var = this.e;
        boolean z4 = z2 & ld8Var.g;
        int i3 = g63Var.h.g;
        int i4 = ld8Var.h.g;
        int i5 = g63Var.i.g;
        int i6 = ld8Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void M(ba4 ba4Var, boolean z) {
        int i;
        int i2;
        ld8 ld8Var;
        g63 g63Var;
        ba4Var.getClass();
        int iN = ba4.n(this.H);
        int iN2 = ba4.n(this.I);
        int iN3 = ba4.n(this.J);
        int iN4 = ba4.n(this.K);
        if (z && (g63Var = this.d) != null) {
            tn1 tn1Var = g63Var.h;
            if (tn1Var.j) {
                tn1 tn1Var2 = g63Var.i;
                if (tn1Var2.j) {
                    iN = tn1Var.g;
                    iN3 = tn1Var2.g;
                }
            }
        }
        if (z && (ld8Var = this.e) != null) {
            tn1 tn1Var3 = ld8Var.h;
            if (tn1Var3.j) {
                tn1 tn1Var4 = ld8Var.i;
                if (tn1Var4.j) {
                    iN2 = tn1Var3.g;
                    iN4 = tn1Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        } else {
            i8 = i4;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(i8, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(o61 o61Var, ba4 ba4Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            mo8.i(o61Var, ba4Var, this);
            hashSet.remove(this);
            b(ba4Var, o61Var.S(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((w51) it.next()).d.a(o61Var, ba4Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((w51) it2.next()).d.a(o61Var, ba4Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((w51) it3.next()).d.a(o61Var, ba4Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((w51) it4.next()).d.a(o61Var, ba4Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((w51) it5.next()).d.a(o61Var, ba4Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x0211  */
    /* JADX WARN: Code duplicated, block: B:130:0x0217  */
    /* JADX WARN: Code duplicated, block: B:131:0x0220  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0233  */
    /* JADX WARN: Code duplicated, block: B:145:0x0259  */
    /* JADX WARN: Code duplicated, block: B:157:0x0283  */
    /* JADX WARN: Code duplicated, block: B:161:0x0292  */
    /* JADX WARN: Code duplicated, block: B:164:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:173:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x02be  */
    /* JADX WARN: Code duplicated, block: B:177:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:183:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:187:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x03cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f2 A[PHI: r4
      0x03f2: PHI (r4v39 int) = (r4v4 int), (r4v4 int), (r4v41 int) binds: [B:258:0x03cc, B:259:0x03ce, B:249:0x03a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:270:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:274:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0419  */
    /* JADX WARN: Code duplicated, block: B:279:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0425  */
    /* JADX WARN: Code duplicated, block: B:286:0x042d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0433  */
    /* JADX WARN: Code duplicated, block: B:291:0x0436  */
    /* JADX WARN: Code duplicated, block: B:294:0x0452  */
    /* JADX WARN: Code duplicated, block: B:313:0x0499  */
    /* JADX WARN: Code duplicated, block: B:329:0x0540  */
    /* JADX WARN: Code duplicated, block: B:345:0x0593  */
    /* JADX WARN: Code duplicated, block: B:348:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:351:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:388:0x066a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:390:0x0670  */
    /* JADX WARN: Code duplicated, block: B:392:0x0679  */
    /* JADX WARN: Code duplicated, block: B:393:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:396:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:399:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r58v0, types: [o.n61] */
    public void b(ba4 ba4Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        o61 o61Var;
        WeakReference weakReference;
        WeakReference weakReference2;
        o61 o61Var2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        w51 w51Var;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        w51 w51Var2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        w51 w51Var3;
        int i19;
        ?? r4;
        int[] iArr2;
        w51 w51Var4;
        k67 k67Var;
        k67 k67Var2;
        k67 k67Var3;
        boolean z11;
        ?? r3;
        int i20;
        k67 k67Var4;
        k67 k67Var5;
        k67 k67Var6;
        int i21;
        int i22;
        boolean z12;
        int i23;
        k67 k67Var7;
        int i24;
        float f2;
        ?? r27;
        ld8 ld8Var;
        boolean z13;
        g63 g63Var;
        int i25;
        boolean zV;
        int i26;
        boolean zW;
        g63 g63Var2;
        ld8 ld8Var2;
        boolean z14;
        ArrayList arrayList;
        int size;
        int i27;
        HashSet hashSet2;
        ba4 ba4Var2 = ba4Var;
        w51 w51Var5 = this.H;
        k67 k67VarK = ba4Var2.k(w51Var5);
        w51 w51Var6 = this.J;
        k67 k67VarK2 = ba4Var2.k(w51Var6);
        w51 w51Var7 = this.I;
        k67 k67VarK3 = ba4Var2.k(w51Var7);
        w51 w51Var8 = this.K;
        k67 k67VarK4 = ba4Var2.k(w51Var8);
        w51 w51Var9 = this.L;
        k67 k67VarK5 = ba4Var2.k(w51Var9);
        o61 o61Var3 = this.S;
        if (o61Var3 != null) {
            int[] iArr3 = o61Var3.o0;
            i = 0;
            i3 = iArr3[0] == 2 ? 1 : 0;
            int i28 = iArr3[1] == 2 ? 1 : 0;
            int i29 = this.q;
            if (i29 != 1) {
                if (i29 == 2) {
                    i3 = 0;
                } else if (i29 != 3) {
                }
                i2 = i28;
            } else {
                i2 = 0;
            }
            i4 = this.f0;
            zArr = this.R;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i6 = i3;
                i27 = i;
                while (true) {
                    if (i27 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i30 = size;
                    hashSet2 = ((w51) arrayList.get(i27)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i27++;
                    size = i30;
                }
            } else {
                i6 = i3;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    ba4Var2.d(k67VarK, this.X);
                    ba4Var2.d(k67VarK2, this.X + this.T);
                    if (i6 != 0 && (o61Var2 = this.S) != null) {
                        weakReference3 = o61Var2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || w51Var5.c() > ((w51) o61Var2.G0.get()).c()) {
                            o61Var2.G0 = new WeakReference(w51Var5);
                        }
                        weakReference4 = o61Var2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || w51Var6.c() > ((w51) o61Var2.I0.get()).c()) {
                            o61Var2.I0 = new WeakReference(w51Var6);
                        }
                    }
                }
                if (this.l) {
                    ba4Var2.d(k67VarK3, this.Y);
                    ba4Var2.d(k67VarK4, this.Y + this.U);
                    hashSet = w51Var9.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        ba4Var2.d(k67VarK5, this.Y + this.Z);
                    }
                    if (i5 != 0 && (o61Var = this.S) != null) {
                        weakReference = o61Var.F0;
                        if (weakReference != null || weakReference.get() == null || w51Var7.c() > ((w51) o61Var.F0.get()).c()) {
                            o61Var.F0 = new WeakReference(w51Var7);
                        }
                        weakReference2 = o61Var.H0;
                        if (weakReference2 != null || weakReference2.get() == null || w51Var8.c() > ((w51) o61Var.H0.get()).c()) {
                            o61Var.H0 = new WeakReference(w51Var8);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r12 = i;
                    this.k = r12;
                    this.l = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (g63Var2 = this.d) == null || (ld8Var2 = this.e) == null) {
                w51Var = w51Var9;
                zArr3 = zArr2;
            } else {
                w51Var = w51Var9;
                tn1 tn1Var = g63Var2.h;
                zArr3 = zArr2;
                if (tn1Var.j && g63Var2.i.j && ld8Var2.h.j && ld8Var2.i.j) {
                    ba4Var2.d(k67VarK, tn1Var.g);
                    ba4Var2.d(k67VarK2, this.d.i.g);
                    ba4Var2.d(k67VarK3, this.e.h.g);
                    ba4Var2.d(k67VarK4, this.e.i.g);
                    ba4Var2.d(k67VarK5, this.e.k.g);
                    if (this.S == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !v()) {
                            ba4Var2.f(ba4Var2.k(this.S.J), k67VarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || w()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            ba4Var2.f(ba4Var2.k(this.S.K), k67VarK4, 0, 8);
                        }
                    }
                    this.k = z14;
                    this.l = z14;
                    return;
                }
            }
            if (this.S != null) {
                if (u(0)) {
                    this.S.N(this, 0);
                    zV = true;
                    i26 = 1;
                } else {
                    zV = v();
                    i26 = 1;
                }
                if (u(i26)) {
                    this.S.N(this, i26);
                    zW = true;
                } else {
                    zW = w();
                }
                if (zV && i6 != 0 && this.f0 != 8 && w51Var5.f == null && w51Var6.f == null) {
                    ba4Var2.f(ba4Var2.k(this.S.J), k67VarK2, 0, 1);
                }
                if (!zW && i5 != 0 && this.f0 != 8 && w51Var7.f == null && w51Var8.f == null && w51Var == null) {
                    ba4Var2.f(ba4Var2.k(this.S.K), k67VarK4, 0, 1);
                }
                z4 = zW;
                z3 = zV;
            } else {
                w51Var5 = w51Var5;
                z3 = false;
                z4 = false;
            }
            i7 = this.T;
            i8 = this.a0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.U;
            i10 = this.b0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.o0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i31 = this.W;
            this.A = i31;
            float f3 = this.V;
            this.B = f3;
            f = f3;
            i14 = this.r;
            i15 = this.s;
            if (f > 0.0f) {
                w51Var2 = w51Var8;
                if (this.f0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i25 = i15;
                    } else {
                        i25 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i25 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.A = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                w51Var = w51Var;
                                i16 = i11;
                                i31 = 0;
                                i17 = 4;
                                z7 = false;
                            } else {
                                i16 = i11;
                                i31 = 0;
                            }
                            i18 = i25;
                            int[] iArr4 = this.t;
                            iArr4[0] = i17;
                            iArr4[1] = i18;
                            if (z7 || !(i31 == 0 || i31 == -1)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (z7 || !(i31 == 1 || i31 == -1)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof o61)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                i8 = 0;
                            }
                            w51Var3 = this.O;
                            boolean z15 = !w51Var3.f();
                            char c = '\b';
                            boolean z16 = zArr[0];
                            boolean z17 = zArr[1];
                            i19 = this.f1543o;
                            int[] iArr5 = this.C;
                            if (i19 != 2 || this.k) {
                                r4 = i5;
                                iArr2 = iArr;
                                w51Var4 = w51Var;
                                k67Var = k67VarK;
                                k67Var2 = k67VarK2;
                                k67Var3 = k67VarK5;
                                z11 = z3;
                                r3 = i6;
                                i20 = i17;
                            } else {
                                if (z && (g63Var = this.d) != null) {
                                    tn1 tn1Var2 = g63Var.h;
                                    if (tn1Var2.j && g63Var.i.j) {
                                        if (z) {
                                            ba4Var2.d(k67VarK, tn1Var2.g);
                                            ba4Var2.d(k67VarK2, this.d.i.g);
                                            if (this.S != null && i6 != 0 && zArr3[0] && !v()) {
                                                ba4Var2.f(ba4Var2.k(this.S.J), k67VarK2, 0, 8);
                                            }
                                        }
                                        r4 = i5;
                                        iArr2 = iArr;
                                        w51Var4 = w51Var;
                                        k67Var = k67VarK;
                                        k67Var2 = k67VarK2;
                                        k67Var3 = k67VarK5;
                                        z11 = z3;
                                        r3 = i6;
                                        i20 = i17;
                                    } else {
                                        c = '\b';
                                    }
                                }
                                o61 o61Var4 = this.S;
                                k67 k67VarK6 = o61Var4 != null ? ba4Var2.k(o61Var4.J) : null;
                                o61 o61Var5 = this.S;
                                k67 k67VarK7 = o61Var5 != null ? ba4Var2.k(o61Var5.H) : null;
                                z11 = z3;
                                ?? r5 = i6;
                                i20 = i17;
                                ?? r6 = i5;
                                iArr2 = iArr;
                                k67Var2 = k67VarK2;
                                k67Var = k67VarK;
                                w51Var4 = w51Var;
                                k67Var3 = k67VarK5;
                                ba4Var2 = ba4Var;
                                d(ba4Var2, true, r5, r6, zArr3[0], k67VarK7, k67VarK6, iArr[0], z10, this.H, this.J, this.X, i8, this.a0, iArr5[0], this.c0, z8, iArr[1] == 3, z11, z4, z16, i20, i18, this.u, this.v, this.w, z15);
                                r3 = r5;
                                r4 = r6;
                            }
                            if (z || (ld8Var = this.e) == null) {
                                k67Var4 = r33;
                                k67Var5 = k67VarK4;
                                k67Var6 = k67Var3;
                                i21 = 0;
                                i22 = 8;
                                z12 = true;
                                i23 = 1;
                            } else {
                                tn1 tn1Var3 = ld8Var.h;
                                if (tn1Var3.j && ld8Var.i.j) {
                                    int i32 = tn1Var3.g;
                                    k67Var4 = k67VarK3;
                                    ba4Var2.d(k67Var4, i32);
                                    k67Var5 = k67VarK4;
                                    ba4Var2.d(k67Var5, this.e.i.g);
                                    k67Var6 = k67Var3;
                                    ba4Var2.d(k67Var6, this.e.k.g);
                                    o61 o61Var6 = this.S;
                                    if (o61Var6 == null || z4 || r4 == 0) {
                                        i21 = 0;
                                        i22 = 8;
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                        z13 = true;
                                        if (zArr3[1]) {
                                            i21 = 0;
                                            i22 = 8;
                                            ba4Var2.f(ba4Var2.k(o61Var6.K), k67Var5, 0, 8);
                                        } else {
                                            i21 = 0;
                                            i22 = 8;
                                        }
                                    }
                                    i23 = i21;
                                    z12 = z13;
                                } else {
                                    k67Var4 = r33;
                                    k67Var5 = k67VarK4;
                                    k67Var6 = k67Var3;
                                    i21 = 0;
                                    i22 = 8;
                                    z12 = true;
                                    i23 = 1;
                                }
                            }
                            if (this.p == 2) {
                                i23 = i21;
                            }
                            if (i23 != 0 || this.l) {
                                k67Var7 = k67Var4;
                            } else {
                                int i33 = (iArr2[z12 ? 1 : 0] == 2 && (this instanceof o61)) ? z12 ? 1 : 0 : i21;
                                int i34 = i33 != 0 ? i21 : i16;
                                o61 o61Var7 = this.S;
                                k67 k67VarK8 = o61Var7 != null ? ba4Var2.k(o61Var7.K) : null;
                                o61 o61Var8 = this.S;
                                k67 k67VarK9 = o61Var8 != null ? ba4Var2.k(o61Var8.I) : null;
                                int i35 = this.Z;
                                if (i35 > 0 || this.f0 == i22) {
                                    r27 = z15;
                                    w51 w51Var10 = w51Var4;
                                    if (w51Var10.f != null) {
                                        ba4Var2.e(k67Var6, k67Var4, i35, i22);
                                        ba4Var2.e(k67Var6, ba4Var2.k(w51Var10.f), w51Var10.d(), i22);
                                        if (r4 != 0) {
                                            ba4Var2.f(k67VarK8, ba4Var2.k(w51Var2), i21, 5);
                                        }
                                        r27 = i21;
                                    } else if (this.f0 == i22) {
                                        ba4Var2.e(k67Var6, k67Var4, w51Var10.d(), i22);
                                        r27 = z15;
                                    } else {
                                        ba4Var2.e(k67Var6, k67Var4, i35, i22);
                                        r27 = z15;
                                    }
                                }
                                r27 = z15;
                                boolean z18 = zArr3[z12 ? 1 : 0];
                                int i36 = i21;
                                int i37 = iArr2[z12 ? 1 : 0];
                                int i38 = this.Y;
                                int i39 = this.b0;
                                int i40 = iArr5[z12 ? 1 : 0];
                                float f4 = this.d0;
                                int i41 = iArr2[i36];
                                boolean z19 = z12 ? 1 : 0;
                                ?? r18 = z12;
                                if (i41 != 3) {
                                    r18 = i36;
                                }
                                k67Var7 = k67Var4;
                                ba4Var2 = ba4Var;
                                d(ba4Var2, false, r4, r3, z18, k67VarK9, k67VarK8, i37, i33, this.I, this.K, i38, i34, i39, i40, f4, z9, r18, z4, z11, z17, i18, i20, this.x, this.y, this.z, r27);
                            }
                            if (z7) {
                                i24 = this.A;
                                f2 = this.B;
                                if (i24 == 1) {
                                    zw zwVarL = ba4Var2.l();
                                    zwVarL.d.g(k67Var5, -1.0f);
                                    zwVarL.d.g(k67Var7, 1.0f);
                                    zwVarL.d.g(k67Var2, f2);
                                    zwVarL.d.g(k67Var, -f2);
                                    ba4Var2.c(zwVarL);
                                } else {
                                    zw zwVarL2 = ba4Var2.l();
                                    zwVarL2.d.g(k67Var2, -1.0f);
                                    zwVarL2.d.g(k67Var, 1.0f);
                                    zwVarL2.d.g(k67Var5, f2);
                                    zwVarL2.d.g(k67Var7, -f2);
                                    ba4Var2.c(zwVarL2);
                                }
                            }
                            if (w51Var3.f()) {
                                n61 n61Var = w51Var3.f.d;
                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                int iD = w51Var3.d();
                                k67 k67VarK10 = ba4Var2.k(g(2));
                                k67 k67VarK11 = ba4Var2.k(g(3));
                                k67 k67VarK12 = ba4Var2.k(g(4));
                                k67 k67VarK13 = ba4Var2.k(g(5));
                                k67 k67VarK14 = ba4Var2.k(n61Var.g(2));
                                k67 k67VarK15 = ba4Var2.k(n61Var.g(3));
                                k67 k67VarK16 = ba4Var2.k(n61Var.g(4));
                                k67 k67VarK17 = ba4Var2.k(n61Var.g(5));
                                zw zwVarL3 = ba4Var2.l();
                                double d = radians;
                                double dSin = Math.sin(d);
                                double d2 = iD;
                                zwVarL3.d.g(k67VarK15, 0.5f);
                                zwVarL3.d.g(k67VarK17, 0.5f);
                                zwVarL3.d.g(k67VarK11, -0.5f);
                                zwVarL3.d.g(k67VarK13, -0.5f);
                                zwVarL3.b = -((float) (dSin * d2));
                                ba4Var2.c(zwVarL3);
                                zw zwVarL4 = ba4Var2.l();
                                float fCos = (float) (Math.cos(d) * d2);
                                zwVarL4.d.g(k67VarK14, 0.5f);
                                zwVarL4.d.g(k67VarK16, 0.5f);
                                zwVarL4.d.g(k67VarK10, -0.5f);
                                zwVarL4.d.g(k67VarK12, -0.5f);
                                zwVarL4.b = -fCos;
                                ba4Var2.c(zwVarL4);
                            }
                            this.k = false;
                            this.l = false;
                        }
                        if (i13 != 3 && i25 == 3) {
                            this.A = 1;
                            if (i31 == -1) {
                                float f5 = 1.0f / f;
                                this.B = f5;
                                f = f5;
                            }
                            i16 = (int) (i7 * f);
                            if (i12 != 3) {
                                i17 = i17;
                                i31 = 1;
                                i18 = 4;
                            } else {
                                i31 = 1;
                            }
                        }
                        z7 = true;
                        i18 = i25;
                        int[] iArr6 = this.t;
                        iArr6[0] = i17;
                        iArr6[1] = i18;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z7) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (iArr[0] == 2) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        w51Var3 = this.O;
                        boolean z110 = !w51Var3.f();
                        char c2 = '\b';
                        boolean z111 = zArr[0];
                        boolean z112 = zArr[1];
                        i19 = this.f1543o;
                        int[] iArr7 = this.C;
                        if (i19 != 2) {
                            r4 = i5;
                            iArr2 = iArr;
                            w51Var4 = w51Var;
                            k67Var = k67VarK;
                            k67Var2 = k67VarK2;
                            k67Var3 = k67VarK5;
                            z11 = z3;
                            r3 = i6;
                            i20 = i17;
                        } else {
                            r4 = i5;
                            iArr2 = iArr;
                            w51Var4 = w51Var;
                            k67Var = k67VarK;
                            k67Var2 = k67VarK2;
                            k67Var3 = k67VarK5;
                            z11 = z3;
                            r3 = i6;
                            i20 = i17;
                        }
                        if (z) {
                            k67Var4 = r33;
                            k67Var5 = k67VarK4;
                            k67Var6 = k67Var3;
                            i21 = 0;
                            i22 = 8;
                            z12 = true;
                            i23 = 1;
                        } else {
                            k67Var4 = r33;
                            k67Var5 = k67VarK4;
                            k67Var6 = k67Var3;
                            i21 = 0;
                            i22 = 8;
                            z12 = true;
                            i23 = 1;
                        }
                        if (this.p == 2) {
                            i23 = i21;
                        }
                        if (i23 != 0) {
                            k67Var7 = k67Var4;
                        } else {
                            k67Var7 = k67Var4;
                        }
                        if (z7) {
                            i24 = this.A;
                            f2 = this.B;
                            if (i24 == 1) {
                                zw zwVarL5 = ba4Var2.l();
                                zwVarL5.d.g(k67Var5, -1.0f);
                                zwVarL5.d.g(k67Var7, 1.0f);
                                zwVarL5.d.g(k67Var2, f2);
                                zwVarL5.d.g(k67Var, -f2);
                                ba4Var2.c(zwVarL5);
                            } else {
                                zw zwVarL6 = ba4Var2.l();
                                zwVarL6.d.g(k67Var2, -1.0f);
                                zwVarL6.d.g(k67Var, 1.0f);
                                zwVarL6.d.g(k67Var5, f2);
                                zwVarL6.d.g(k67Var7, -f2);
                                ba4Var2.c(zwVarL6);
                            }
                        }
                        if (w51Var3.f()) {
                            n61 n61Var2 = w51Var3.f.d;
                            float radians2 = (float) Math.toRadians(this.D + 90.0f);
                            int iD2 = w51Var3.d();
                            k67 k67VarK18 = ba4Var2.k(g(2));
                            k67 k67VarK19 = ba4Var2.k(g(3));
                            k67 k67VarK110 = ba4Var2.k(g(4));
                            k67 k67VarK111 = ba4Var2.k(g(5));
                            k67 k67VarK112 = ba4Var2.k(n61Var2.g(2));
                            k67 k67VarK113 = ba4Var2.k(n61Var2.g(3));
                            k67 k67VarK114 = ba4Var2.k(n61Var2.g(4));
                            k67 k67VarK115 = ba4Var2.k(n61Var2.g(5));
                            zw zwVarL7 = ba4Var2.l();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iD2;
                            zwVarL7.d.g(k67VarK113, 0.5f);
                            zwVarL7.d.g(k67VarK115, 0.5f);
                            zwVarL7.d.g(k67VarK19, -0.5f);
                            zwVarL7.d.g(k67VarK111, -0.5f);
                            zwVarL7.b = -((float) (dSin2 * d4));
                            ba4Var2.c(zwVarL7);
                            zw zwVarL8 = ba4Var2.l();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            zwVarL8.d.g(k67VarK112, 0.5f);
                            zwVarL8.d.g(k67VarK114, 0.5f);
                            zwVarL8.d.g(k67VarK18, -0.5f);
                            zwVarL8.d.g(k67VarK110, -0.5f);
                            zwVarL8.b = -fCos2;
                            ba4Var2.c(zwVarL8);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    if (i31 == -1) {
                        if (z5 && !z6) {
                            this.A = 0;
                            i31 = 0;
                        } else if (!z5 && z6) {
                            this.A = 1;
                            if (i31 == -1) {
                                this.B = 1.0f / f;
                            }
                            i31 = 1;
                        }
                    }
                    if (i31 == 0 && (!w51Var7.f() || !w51Var2.f())) {
                        this.A = 1;
                    } else if (this.A == 1 && (!w51Var5.f() || !w51Var6.f())) {
                        this.A = 0;
                    }
                    if (this.A == -1 && (!w51Var7.f() || !w51Var2.f() || !w51Var5.f() || !w51Var6.f())) {
                        if (w51Var7.f() && w51Var2.f()) {
                            this.A = 0;
                        } else if (w51Var5.f() && w51Var6.f()) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                        }
                    }
                    int i42 = this.A;
                    if (i42 == -1) {
                        int i43 = this.u;
                        if (i43 > 0 && this.x == 0) {
                            this.A = 0;
                            i42 = 0;
                        } else if (i43 == 0 && this.x > 0) {
                            this.B = 1.0f / this.B;
                            this.A = 1;
                            i42 = 1;
                        }
                    }
                    i31 = i42;
                    i16 = i11;
                    z7 = true;
                    i18 = i25;
                    int[] iArr8 = this.t;
                    iArr8[0] = i17;
                    iArr8[1] = i18;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (iArr[0] == 2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    w51Var3 = this.O;
                    boolean z113 = !w51Var3.f();
                    char c3 = '\b';
                    boolean z114 = zArr[0];
                    boolean z115 = zArr[1];
                    i19 = this.f1543o;
                    int[] iArr9 = this.C;
                    if (i19 != 2) {
                        r4 = i5;
                        iArr2 = iArr;
                        w51Var4 = w51Var;
                        k67Var = k67VarK;
                        k67Var2 = k67VarK2;
                        k67Var3 = k67VarK5;
                        z11 = z3;
                        r3 = i6;
                        i20 = i17;
                    } else {
                        r4 = i5;
                        iArr2 = iArr;
                        w51Var4 = w51Var;
                        k67Var = k67VarK;
                        k67Var2 = k67VarK2;
                        k67Var3 = k67VarK5;
                        z11 = z3;
                        r3 = i6;
                        i20 = i17;
                    }
                    if (z) {
                        k67Var4 = r33;
                        k67Var5 = k67VarK4;
                        k67Var6 = k67Var3;
                        i21 = 0;
                        i22 = 8;
                        z12 = true;
                        i23 = 1;
                    } else {
                        k67Var4 = r33;
                        k67Var5 = k67VarK4;
                        k67Var6 = k67Var3;
                        i21 = 0;
                        i22 = 8;
                        z12 = true;
                        i23 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i21;
                    }
                    if (i23 != 0) {
                        k67Var7 = k67Var4;
                    } else {
                        k67Var7 = k67Var4;
                    }
                    if (z7) {
                        i24 = this.A;
                        f2 = this.B;
                        if (i24 == 1) {
                            zw zwVarL9 = ba4Var2.l();
                            zwVarL9.d.g(k67Var5, -1.0f);
                            zwVarL9.d.g(k67Var7, 1.0f);
                            zwVarL9.d.g(k67Var2, f2);
                            zwVarL9.d.g(k67Var, -f2);
                            ba4Var2.c(zwVarL9);
                        } else {
                            zw zwVarL10 = ba4Var2.l();
                            zwVarL10.d.g(k67Var2, -1.0f);
                            zwVarL10.d.g(k67Var, 1.0f);
                            zwVarL10.d.g(k67Var5, f2);
                            zwVarL10.d.g(k67Var7, -f2);
                            ba4Var2.c(zwVarL10);
                        }
                    }
                    if (w51Var3.f()) {
                        n61 n61Var3 = w51Var3.f.d;
                        float radians3 = (float) Math.toRadians(this.D + 90.0f);
                        int iD3 = w51Var3.d();
                        k67 k67VarK116 = ba4Var2.k(g(2));
                        k67 k67VarK117 = ba4Var2.k(g(3));
                        k67 k67VarK118 = ba4Var2.k(g(4));
                        k67 k67VarK119 = ba4Var2.k(g(5));
                        k67 k67VarK1110 = ba4Var2.k(n61Var3.g(2));
                        k67 k67VarK1111 = ba4Var2.k(n61Var3.g(3));
                        k67 k67VarK1112 = ba4Var2.k(n61Var3.g(4));
                        k67 k67VarK1113 = ba4Var2.k(n61Var3.g(5));
                        zw zwVarL11 = ba4Var2.l();
                        double d5 = radians3;
                        double dSin3 = Math.sin(d5);
                        double d6 = iD3;
                        zwVarL11.d.g(k67VarK1111, 0.5f);
                        zwVarL11.d.g(k67VarK1113, 0.5f);
                        zwVarL11.d.g(k67VarK117, -0.5f);
                        zwVarL11.d.g(k67VarK119, -0.5f);
                        zwVarL11.b = -((float) (dSin3 * d6));
                        ba4Var2.c(zwVarL11);
                        zw zwVarL12 = ba4Var2.l();
                        float fCos3 = (float) (Math.cos(d5) * d6);
                        zwVarL12.d.g(k67VarK1110, 0.5f);
                        zwVarL12.d.g(k67VarK1112, 0.5f);
                        zwVarL12.d.g(k67VarK116, -0.5f);
                        zwVarL12.d.g(k67VarK118, -0.5f);
                        zwVarL12.b = -fCos3;
                        ba4Var2.c(zwVarL12);
                    }
                    this.k = false;
                    this.l = false;
                }
                z7 = false;
                int[] iArr10 = this.t;
                iArr10[0] = i17;
                iArr10[1] = i18;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (iArr[0] == 2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                w51Var3 = this.O;
                boolean z116 = !w51Var3.f();
                char c4 = '\b';
                boolean z117 = zArr[0];
                boolean z118 = zArr[1];
                i19 = this.f1543o;
                int[] iArr11 = this.C;
                if (i19 != 2) {
                    r4 = i5;
                    iArr2 = iArr;
                    w51Var4 = w51Var;
                    k67Var = k67VarK;
                    k67Var2 = k67VarK2;
                    k67Var3 = k67VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                } else {
                    r4 = i5;
                    iArr2 = iArr;
                    w51Var4 = w51Var;
                    k67Var = k67VarK;
                    k67Var2 = k67VarK2;
                    k67Var3 = k67VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                }
                if (z) {
                    k67Var4 = r33;
                    k67Var5 = k67VarK4;
                    k67Var6 = k67Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                } else {
                    k67Var4 = r33;
                    k67Var5 = k67VarK4;
                    k67Var6 = k67Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                }
                if (this.p == 2) {
                    i23 = i21;
                }
                if (i23 != 0) {
                    k67Var7 = k67Var4;
                } else {
                    k67Var7 = k67Var4;
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        zw zwVarL13 = ba4Var2.l();
                        zwVarL13.d.g(k67Var5, -1.0f);
                        zwVarL13.d.g(k67Var7, 1.0f);
                        zwVarL13.d.g(k67Var2, f2);
                        zwVarL13.d.g(k67Var, -f2);
                        ba4Var2.c(zwVarL13);
                    } else {
                        zw zwVarL14 = ba4Var2.l();
                        zwVarL14.d.g(k67Var2, -1.0f);
                        zwVarL14.d.g(k67Var, 1.0f);
                        zwVarL14.d.g(k67Var5, f2);
                        zwVarL14.d.g(k67Var7, -f2);
                        ba4Var2.c(zwVarL14);
                    }
                }
                if (w51Var3.f()) {
                    n61 n61Var4 = w51Var3.f.d;
                    float radians4 = (float) Math.toRadians(this.D + 90.0f);
                    int iD4 = w51Var3.d();
                    k67 k67VarK1114 = ba4Var2.k(g(2));
                    k67 k67VarK1115 = ba4Var2.k(g(3));
                    k67 k67VarK1116 = ba4Var2.k(g(4));
                    k67 k67VarK1117 = ba4Var2.k(g(5));
                    k67 k67VarK1118 = ba4Var2.k(n61Var4.g(2));
                    k67 k67VarK1119 = ba4Var2.k(n61Var4.g(3));
                    k67 k67VarK11110 = ba4Var2.k(n61Var4.g(4));
                    k67 k67VarK11111 = ba4Var2.k(n61Var4.g(5));
                    zw zwVarL15 = ba4Var2.l();
                    double d7 = radians4;
                    double dSin4 = Math.sin(d7);
                    double d8 = iD4;
                    zwVarL15.d.g(k67VarK1119, 0.5f);
                    zwVarL15.d.g(k67VarK11111, 0.5f);
                    zwVarL15.d.g(k67VarK1115, -0.5f);
                    zwVarL15.d.g(k67VarK1117, -0.5f);
                    zwVarL15.b = -((float) (dSin4 * d8));
                    ba4Var2.c(zwVarL15);
                    zw zwVarL16 = ba4Var2.l();
                    float fCos4 = (float) (Math.cos(d7) * d8);
                    zwVarL16.d.g(k67VarK1118, 0.5f);
                    zwVarL16.d.g(k67VarK11110, 0.5f);
                    zwVarL16.d.g(k67VarK1114, -0.5f);
                    zwVarL16.d.g(k67VarK1116, -0.5f);
                    zwVarL16.b = -fCos4;
                    ba4Var2.c(zwVarL16);
                }
                this.k = false;
                this.l = false;
            }
            w51Var2 = w51Var8;
            k67VarK4 = k67VarK4;
            i16 = i11;
            i17 = i14;
            i18 = i15;
            z7 = false;
            int[] iArr12 = this.t;
            iArr12[0] = i17;
            iArr12[1] = i18;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (iArr[0] == 2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            w51Var3 = this.O;
            boolean z119 = !w51Var3.f();
            char c5 = '\b';
            boolean z1110 = zArr[0];
            boolean z1111 = zArr[1];
            i19 = this.f1543o;
            int[] iArr13 = this.C;
            if (i19 != 2) {
                r4 = i5;
                iArr2 = iArr;
                w51Var4 = w51Var;
                k67Var = k67VarK;
                k67Var2 = k67VarK2;
                k67Var3 = k67VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            } else {
                r4 = i5;
                iArr2 = iArr;
                w51Var4 = w51Var;
                k67Var = k67VarK;
                k67Var2 = k67VarK2;
                k67Var3 = k67VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            }
            if (z) {
                k67Var4 = r33;
                k67Var5 = k67VarK4;
                k67Var6 = k67Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            } else {
                k67Var4 = r33;
                k67Var5 = k67VarK4;
                k67Var6 = k67Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            }
            if (this.p == 2) {
                i23 = i21;
            }
            if (i23 != 0) {
                k67Var7 = k67Var4;
            } else {
                k67Var7 = k67Var4;
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    zw zwVarL17 = ba4Var2.l();
                    zwVarL17.d.g(k67Var5, -1.0f);
                    zwVarL17.d.g(k67Var7, 1.0f);
                    zwVarL17.d.g(k67Var2, f2);
                    zwVarL17.d.g(k67Var, -f2);
                    ba4Var2.c(zwVarL17);
                } else {
                    zw zwVarL18 = ba4Var2.l();
                    zwVarL18.d.g(k67Var2, -1.0f);
                    zwVarL18.d.g(k67Var, 1.0f);
                    zwVarL18.d.g(k67Var5, f2);
                    zwVarL18.d.g(k67Var7, -f2);
                    ba4Var2.c(zwVarL18);
                }
            }
            if (w51Var3.f()) {
                n61 n61Var5 = w51Var3.f.d;
                float radians5 = (float) Math.toRadians(this.D + 90.0f);
                int iD5 = w51Var3.d();
                k67 k67VarK11112 = ba4Var2.k(g(2));
                k67 k67VarK11113 = ba4Var2.k(g(3));
                k67 k67VarK11114 = ba4Var2.k(g(4));
                k67 k67VarK11115 = ba4Var2.k(g(5));
                k67 k67VarK11116 = ba4Var2.k(n61Var5.g(2));
                k67 k67VarK11117 = ba4Var2.k(n61Var5.g(3));
                k67 k67VarK11118 = ba4Var2.k(n61Var5.g(4));
                k67 k67VarK11119 = ba4Var2.k(n61Var5.g(5));
                zw zwVarL19 = ba4Var2.l();
                double d9 = radians5;
                double dSin5 = Math.sin(d9);
                double d10 = iD5;
                zwVarL19.d.g(k67VarK11117, 0.5f);
                zwVarL19.d.g(k67VarK11119, 0.5f);
                zwVarL19.d.g(k67VarK11113, -0.5f);
                zwVarL19.d.g(k67VarK11115, -0.5f);
                zwVarL19.b = -((float) (dSin5 * d10));
                ba4Var2.c(zwVarL19);
                zw zwVarL110 = ba4Var2.l();
                float fCos5 = (float) (Math.cos(d9) * d10);
                zwVarL110.d.g(k67VarK11116, 0.5f);
                zwVarL110.d.g(k67VarK11118, 0.5f);
                zwVarL110.d.g(k67VarK11112, -0.5f);
                zwVarL110.d.g(k67VarK11114, -0.5f);
                zwVarL110.b = -fCos5;
                ba4Var2.c(zwVarL110);
            }
            this.k = false;
            this.l = false;
        }
        i = 0;
        i2 = i;
        i3 = i2;
        i4 = this.f0;
        zArr = this.R;
        i5 = i2;
        if (i4 == 8) {
            arrayList = this.Q;
            size = arrayList.size();
            i6 = i3;
            i27 = i;
            while (true) {
                if (i27 < size) {
                    if (!zArr[i]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i310 = size;
                hashSet2 = ((w51) arrayList.get(i27)).a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i27++;
                size = i310;
            }
        } else {
            i6 = i3;
        }
        z2 = this.k;
        if (z2) {
            if (z2) {
                ba4Var2.d(k67VarK, this.X);
                ba4Var2.d(k67VarK2, this.X + this.T);
                if (i6 != 0) {
                    weakReference3 = o61Var2.G0;
                    if (weakReference3 != null) {
                        o61Var2.G0 = new WeakReference(w51Var5);
                    } else {
                        o61Var2.G0 = new WeakReference(w51Var5);
                    }
                    weakReference4 = o61Var2.I0;
                    if (weakReference4 != null) {
                        o61Var2.I0 = new WeakReference(w51Var6);
                    } else {
                        o61Var2.I0 = new WeakReference(w51Var6);
                    }
                }
            }
            if (this.l) {
                ba4Var2.d(k67VarK3, this.Y);
                ba4Var2.d(k67VarK4, this.Y + this.U);
                hashSet = w51Var9.a;
                if (hashSet != null) {
                    ba4Var2.d(k67VarK5, this.Y + this.Z);
                }
                if (i5 != 0) {
                    weakReference = o61Var.F0;
                    if (weakReference != null) {
                        o61Var.F0 = new WeakReference(w51Var7);
                    } else {
                        o61Var.F0 = new WeakReference(w51Var7);
                    }
                    weakReference2 = o61Var.H0;
                    if (weakReference2 != null) {
                        o61Var.H0 = new WeakReference(w51Var8);
                    } else {
                        o61Var.H0 = new WeakReference(w51Var8);
                    }
                }
            }
            if (this.k) {
                ?? r13 = i;
                this.k = r13;
                this.l = r13;
                return;
            }
        } else {
            if (z2) {
                ba4Var2.d(k67VarK, this.X);
                ba4Var2.d(k67VarK2, this.X + this.T);
                if (i6 != 0) {
                    weakReference3 = o61Var2.G0;
                    if (weakReference3 != null) {
                        o61Var2.G0 = new WeakReference(w51Var5);
                    } else {
                        o61Var2.G0 = new WeakReference(w51Var5);
                    }
                    weakReference4 = o61Var2.I0;
                    if (weakReference4 != null) {
                        o61Var2.I0 = new WeakReference(w51Var6);
                    } else {
                        o61Var2.I0 = new WeakReference(w51Var6);
                    }
                }
            }
            if (this.l) {
                ba4Var2.d(k67VarK3, this.Y);
                ba4Var2.d(k67VarK4, this.Y + this.U);
                hashSet = w51Var9.a;
                if (hashSet != null) {
                    ba4Var2.d(k67VarK5, this.Y + this.Z);
                }
                if (i5 != 0) {
                    weakReference = o61Var.F0;
                    if (weakReference != null) {
                        o61Var.F0 = new WeakReference(w51Var7);
                    } else {
                        o61Var.F0 = new WeakReference(w51Var7);
                    }
                    weakReference2 = o61Var.H0;
                    if (weakReference2 != null) {
                        o61Var.H0 = new WeakReference(w51Var8);
                    } else {
                        o61Var.H0 = new WeakReference(w51Var8);
                    }
                }
            }
            if (this.k) {
                ?? r14 = i;
                this.k = r14;
                this.l = r14;
                return;
            }
        }
        zArr2 = this.f;
        if (z) {
            w51Var = w51Var9;
            zArr3 = zArr2;
        } else {
            w51Var = w51Var9;
            zArr3 = zArr2;
        }
        if (this.S != null) {
            if (u(0)) {
                this.S.N(this, 0);
                zV = true;
                i26 = 1;
            } else {
                zV = v();
                i26 = 1;
            }
            if (u(i26)) {
                this.S.N(this, i26);
                zW = true;
            } else {
                zW = w();
            }
            if (zV) {
            }
            if (!zW) {
                ba4Var2.f(ba4Var2.k(this.S.K), k67VarK4, 0, 1);
            }
            z4 = zW;
            z3 = zV;
        } else {
            w51Var5 = w51Var5;
            z3 = false;
            z4 = false;
        }
        i7 = this.T;
        i8 = this.a0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.U;
        i10 = this.b0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        iArr = this.o0;
        i12 = iArr[0];
        if (i12 != 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        i13 = iArr[1];
        if (i13 != 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i311 = this.W;
        this.A = i311;
        float f6 = this.V;
        this.B = f6;
        f = f6;
        i14 = this.r;
        i15 = this.s;
        if (f > 0.0f) {
            w51Var2 = w51Var8;
            if (this.f0 != 8) {
                if (i12 == 3) {
                    i17 = i14;
                } else {
                    i17 = i14;
                }
                if (i13 == 3) {
                    i25 = i15;
                } else {
                    i25 = i15;
                }
                if (i12 == 3) {
                    if (i12 != 3) {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    } else {
                        if (i13 != 3) {
                            i16 = i11;
                        } else {
                            i16 = i11;
                        }
                        z7 = true;
                    }
                } else if (i12 != 3) {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                } else {
                    if (i13 != 3) {
                        i16 = i11;
                    } else {
                        i16 = i11;
                    }
                    z7 = true;
                }
                i18 = i25;
                int[] iArr14 = this.t;
                iArr14[0] = i17;
                iArr14[1] = i18;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (iArr[0] == 2) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                w51Var3 = this.O;
                boolean z1112 = !w51Var3.f();
                char c6 = '\b';
                boolean z1113 = zArr[0];
                boolean z1114 = zArr[1];
                i19 = this.f1543o;
                int[] iArr15 = this.C;
                if (i19 != 2) {
                    r4 = i5;
                    iArr2 = iArr;
                    w51Var4 = w51Var;
                    k67Var = k67VarK;
                    k67Var2 = k67VarK2;
                    k67Var3 = k67VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                } else {
                    r4 = i5;
                    iArr2 = iArr;
                    w51Var4 = w51Var;
                    k67Var = k67VarK;
                    k67Var2 = k67VarK2;
                    k67Var3 = k67VarK5;
                    z11 = z3;
                    r3 = i6;
                    i20 = i17;
                }
                if (z) {
                    k67Var4 = r33;
                    k67Var5 = k67VarK4;
                    k67Var6 = k67Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                } else {
                    k67Var4 = r33;
                    k67Var5 = k67VarK4;
                    k67Var6 = k67Var3;
                    i21 = 0;
                    i22 = 8;
                    z12 = true;
                    i23 = 1;
                }
                if (this.p == 2) {
                    i23 = i21;
                }
                if (i23 != 0) {
                    k67Var7 = k67Var4;
                } else {
                    k67Var7 = k67Var4;
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        zw zwVarL111 = ba4Var2.l();
                        zwVarL111.d.g(k67Var5, -1.0f);
                        zwVarL111.d.g(k67Var7, 1.0f);
                        zwVarL111.d.g(k67Var2, f2);
                        zwVarL111.d.g(k67Var, -f2);
                        ba4Var2.c(zwVarL111);
                    } else {
                        zw zwVarL112 = ba4Var2.l();
                        zwVarL112.d.g(k67Var2, -1.0f);
                        zwVarL112.d.g(k67Var, 1.0f);
                        zwVarL112.d.g(k67Var5, f2);
                        zwVarL112.d.g(k67Var7, -f2);
                        ba4Var2.c(zwVarL112);
                    }
                }
                if (w51Var3.f()) {
                    n61 n61Var6 = w51Var3.f.d;
                    float radians6 = (float) Math.toRadians(this.D + 90.0f);
                    int iD6 = w51Var3.d();
                    k67 k67VarK111110 = ba4Var2.k(g(2));
                    k67 k67VarK111111 = ba4Var2.k(g(3));
                    k67 k67VarK111112 = ba4Var2.k(g(4));
                    k67 k67VarK111113 = ba4Var2.k(g(5));
                    k67 k67VarK111114 = ba4Var2.k(n61Var6.g(2));
                    k67 k67VarK111115 = ba4Var2.k(n61Var6.g(3));
                    k67 k67VarK111116 = ba4Var2.k(n61Var6.g(4));
                    k67 k67VarK111117 = ba4Var2.k(n61Var6.g(5));
                    zw zwVarL113 = ba4Var2.l();
                    double d11 = radians6;
                    double dSin6 = Math.sin(d11);
                    double d12 = iD6;
                    zwVarL113.d.g(k67VarK111115, 0.5f);
                    zwVarL113.d.g(k67VarK111117, 0.5f);
                    zwVarL113.d.g(k67VarK111111, -0.5f);
                    zwVarL113.d.g(k67VarK111113, -0.5f);
                    zwVarL113.b = -((float) (dSin6 * d12));
                    ba4Var2.c(zwVarL113);
                    zw zwVarL114 = ba4Var2.l();
                    float fCos6 = (float) (Math.cos(d11) * d12);
                    zwVarL114.d.g(k67VarK111114, 0.5f);
                    zwVarL114.d.g(k67VarK111116, 0.5f);
                    zwVarL114.d.g(k67VarK111110, -0.5f);
                    zwVarL114.d.g(k67VarK111112, -0.5f);
                    zwVarL114.b = -fCos6;
                    ba4Var2.c(zwVarL114);
                }
                this.k = false;
                this.l = false;
            }
            z7 = false;
            int[] iArr16 = this.t;
            iArr16[0] = i17;
            iArr16[1] = i18;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (iArr[0] == 2) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            w51Var3 = this.O;
            boolean z1115 = !w51Var3.f();
            char c7 = '\b';
            boolean z1116 = zArr[0];
            boolean z1117 = zArr[1];
            i19 = this.f1543o;
            int[] iArr17 = this.C;
            if (i19 != 2) {
                r4 = i5;
                iArr2 = iArr;
                w51Var4 = w51Var;
                k67Var = k67VarK;
                k67Var2 = k67VarK2;
                k67Var3 = k67VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            } else {
                r4 = i5;
                iArr2 = iArr;
                w51Var4 = w51Var;
                k67Var = k67VarK;
                k67Var2 = k67VarK2;
                k67Var3 = k67VarK5;
                z11 = z3;
                r3 = i6;
                i20 = i17;
            }
            if (z) {
                k67Var4 = r33;
                k67Var5 = k67VarK4;
                k67Var6 = k67Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            } else {
                k67Var4 = r33;
                k67Var5 = k67VarK4;
                k67Var6 = k67Var3;
                i21 = 0;
                i22 = 8;
                z12 = true;
                i23 = 1;
            }
            if (this.p == 2) {
                i23 = i21;
            }
            if (i23 != 0) {
                k67Var7 = k67Var4;
            } else {
                k67Var7 = k67Var4;
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    zw zwVarL115 = ba4Var2.l();
                    zwVarL115.d.g(k67Var5, -1.0f);
                    zwVarL115.d.g(k67Var7, 1.0f);
                    zwVarL115.d.g(k67Var2, f2);
                    zwVarL115.d.g(k67Var, -f2);
                    ba4Var2.c(zwVarL115);
                } else {
                    zw zwVarL116 = ba4Var2.l();
                    zwVarL116.d.g(k67Var2, -1.0f);
                    zwVarL116.d.g(k67Var, 1.0f);
                    zwVarL116.d.g(k67Var5, f2);
                    zwVarL116.d.g(k67Var7, -f2);
                    ba4Var2.c(zwVarL116);
                }
            }
            if (w51Var3.f()) {
                n61 n61Var7 = w51Var3.f.d;
                float radians7 = (float) Math.toRadians(this.D + 90.0f);
                int iD7 = w51Var3.d();
                k67 k67VarK111118 = ba4Var2.k(g(2));
                k67 k67VarK111119 = ba4Var2.k(g(3));
                k67 k67VarK1111110 = ba4Var2.k(g(4));
                k67 k67VarK1111111 = ba4Var2.k(g(5));
                k67 k67VarK1111112 = ba4Var2.k(n61Var7.g(2));
                k67 k67VarK1111113 = ba4Var2.k(n61Var7.g(3));
                k67 k67VarK1111114 = ba4Var2.k(n61Var7.g(4));
                k67 k67VarK1111115 = ba4Var2.k(n61Var7.g(5));
                zw zwVarL117 = ba4Var2.l();
                double d13 = radians7;
                double dSin7 = Math.sin(d13);
                double d14 = iD7;
                zwVarL117.d.g(k67VarK1111113, 0.5f);
                zwVarL117.d.g(k67VarK1111115, 0.5f);
                zwVarL117.d.g(k67VarK111119, -0.5f);
                zwVarL117.d.g(k67VarK1111111, -0.5f);
                zwVarL117.b = -((float) (dSin7 * d14));
                ba4Var2.c(zwVarL117);
                zw zwVarL118 = ba4Var2.l();
                float fCos7 = (float) (Math.cos(d13) * d14);
                zwVarL118.d.g(k67VarK1111112, 0.5f);
                zwVarL118.d.g(k67VarK1111114, 0.5f);
                zwVarL118.d.g(k67VarK111118, -0.5f);
                zwVarL118.d.g(k67VarK1111110, -0.5f);
                zwVarL118.b = -fCos7;
                ba4Var2.c(zwVarL118);
            }
            this.k = false;
            this.l = false;
        }
        w51Var2 = w51Var8;
        k67VarK4 = k67VarK4;
        i16 = i11;
        i17 = i14;
        i18 = i15;
        z7 = false;
        int[] iArr18 = this.t;
        iArr18[0] = i17;
        iArr18[1] = i18;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z7) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (iArr[0] == 2) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z10) {
            i8 = 0;
        }
        w51Var3 = this.O;
        boolean z1118 = !w51Var3.f();
        char c8 = '\b';
        boolean z1119 = zArr[0];
        boolean z11110 = zArr[1];
        i19 = this.f1543o;
        int[] iArr19 = this.C;
        if (i19 != 2) {
            r4 = i5;
            iArr2 = iArr;
            w51Var4 = w51Var;
            k67Var = k67VarK;
            k67Var2 = k67VarK2;
            k67Var3 = k67VarK5;
            z11 = z3;
            r3 = i6;
            i20 = i17;
        } else {
            r4 = i5;
            iArr2 = iArr;
            w51Var4 = w51Var;
            k67Var = k67VarK;
            k67Var2 = k67VarK2;
            k67Var3 = k67VarK5;
            z11 = z3;
            r3 = i6;
            i20 = i17;
        }
        if (z) {
            k67Var4 = r33;
            k67Var5 = k67VarK4;
            k67Var6 = k67Var3;
            i21 = 0;
            i22 = 8;
            z12 = true;
            i23 = 1;
        } else {
            k67Var4 = r33;
            k67Var5 = k67VarK4;
            k67Var6 = k67Var3;
            i21 = 0;
            i22 = 8;
            z12 = true;
            i23 = 1;
        }
        if (this.p == 2) {
            i23 = i21;
        }
        if (i23 != 0) {
            k67Var7 = k67Var4;
        } else {
            k67Var7 = k67Var4;
        }
        if (z7) {
            i24 = this.A;
            f2 = this.B;
            if (i24 == 1) {
                zw zwVarL119 = ba4Var2.l();
                zwVarL119.d.g(k67Var5, -1.0f);
                zwVarL119.d.g(k67Var7, 1.0f);
                zwVarL119.d.g(k67Var2, f2);
                zwVarL119.d.g(k67Var, -f2);
                ba4Var2.c(zwVarL119);
            } else {
                zw zwVarL1110 = ba4Var2.l();
                zwVarL1110.d.g(k67Var2, -1.0f);
                zwVarL1110.d.g(k67Var, 1.0f);
                zwVarL1110.d.g(k67Var5, f2);
                zwVarL1110.d.g(k67Var7, -f2);
                ba4Var2.c(zwVarL1110);
            }
        }
        if (w51Var3.f()) {
            n61 n61Var8 = w51Var3.f.d;
            float radians8 = (float) Math.toRadians(this.D + 90.0f);
            int iD8 = w51Var3.d();
            k67 k67VarK1111116 = ba4Var2.k(g(2));
            k67 k67VarK1111117 = ba4Var2.k(g(3));
            k67 k67VarK1111118 = ba4Var2.k(g(4));
            k67 k67VarK1111119 = ba4Var2.k(g(5));
            k67 k67VarK11111110 = ba4Var2.k(n61Var8.g(2));
            k67 k67VarK11111111 = ba4Var2.k(n61Var8.g(3));
            k67 k67VarK11111112 = ba4Var2.k(n61Var8.g(4));
            k67 k67VarK11111113 = ba4Var2.k(n61Var8.g(5));
            zw zwVarL1111 = ba4Var2.l();
            double d15 = radians8;
            double dSin8 = Math.sin(d15);
            double d16 = iD8;
            zwVarL1111.d.g(k67VarK11111111, 0.5f);
            zwVarL1111.d.g(k67VarK11111113, 0.5f);
            zwVarL1111.d.g(k67VarK1111117, -0.5f);
            zwVarL1111.d.g(k67VarK1111119, -0.5f);
            zwVarL1111.b = -((float) (dSin8 * d16));
            ba4Var2.c(zwVarL1111);
            zw zwVarL1112 = ba4Var2.l();
            float fCos8 = (float) (Math.cos(d15) * d16);
            zwVarL1112.d.g(k67VarK11111110, 0.5f);
            zwVarL1112.d.g(k67VarK11111112, 0.5f);
            zwVarL1112.d.g(k67VarK1111116, -0.5f);
            zwVarL1112.d.g(k67VarK1111118, -0.5f);
            zwVarL1112.b = -fCos8;
            ba4Var2.c(zwVarL1112);
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.f0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:231:0x0402  */
    /* JADX WARN: Code duplicated, block: B:240:0x041f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0452  */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:270:0x046d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0477  */
    /* JADX WARN: Code duplicated, block: B:277:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0485  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
      0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:294:0x04af  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x0521  */
    public final void d(ba4 ba4Var, boolean z, boolean z2, boolean z3, boolean z4, k67 k67Var, k67 k67Var2, int i, boolean z5, w51 w51Var, w51 w51Var2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        k67 k67VarK;
        k67 k67VarK2;
        w51 w51Var3;
        k67 k67Var3;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        n61 n61Var;
        boolean z20;
        int iMin2;
        boolean z21;
        int i14;
        int iD;
        int i15;
        int i16;
        HashSet hashSet;
        boolean z22;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z23;
        boolean z24;
        int i22;
        ba4Var = ba4Var;
        int i23 = i8;
        int i24 = i9;
        k67 k67VarK3 = ba4Var.k(w51Var);
        k67 k67VarK4 = ba4Var.k(w51Var2);
        k67 k67VarK5 = ba4Var.k(w51Var.f);
        k67 k67VarK6 = ba4Var.k(w51Var2.f);
        boolean zF = w51Var.f();
        boolean zF2 = w51Var2.f();
        boolean zF3 = this.O.f();
        int i25 = zF2 ? (zF ? 1 : 0) + 1 : zF ? 1 : 0;
        if (zF3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i6;
        int iB = ua5.B(i);
        boolean z25 = (iB == 0 || iB == 1 || iB != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 == -1 || !z) {
            i28 = i3;
            z12 = z25;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i28 = i29;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.f0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i28;
            z14 = z26;
        }
        if (z11) {
            if (!zF && !zF2 && !zF3) {
                ba4Var.d(k67VarK3, i2);
            } else if (zF && !zF2) {
                i10 = 8;
                ba4Var.e(k67VarK3, k67VarK5, w51Var.d(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z14 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    ba4Var.f(k67VarK4, k67VarK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        ba4Var.g(k67VarK4, k67VarK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        ba4Var.e(k67VarK4, k67VarK3, iMin, 8);
                    } else if (z8) {
                        ba4Var.e(k67VarK4, k67VarK3, iMin, 5);
                        ba4Var.g(k67VarK4, k67VarK3, iMin, 8);
                    } else {
                        ba4Var.e(k67VarK4, k67VarK3, iMin, 5);
                        ba4Var.g(k67VarK4, k67VarK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    int i30 = w51Var.e;
                    if (i30 == 3 || i30 == 5) {
                        k67VarK = ba4Var.k(this.S.g(3));
                        k67VarK2 = ba4Var.k(this.S.g(5));
                    } else {
                        k67VarK = ba4Var.k(this.S.g(2));
                        k67VarK2 = ba4Var.k(this.S.g(4));
                    }
                    zw zwVarL = ba4Var.l();
                    int i31 = i23;
                    zwVarL.d.g(k67VarK4, -1.0f);
                    zwVarL.d.g(k67VarK3, 1.0f);
                    zwVarL.d.g(k67VarK2, f2);
                    zwVarL.d.g(k67VarK, -f2);
                    ba4Var.c(zwVarL);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i11 = i31;
                } else {
                    i11 = i23;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                ba4Var.e(k67VarK4, k67VarK3, iMax, 8);
                z15 = z4;
                i11 = i23;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i26 >= 2 && z2 && z27) {
                    ba4Var.f(k67VarK3, k67Var, 0, 8);
                    w51 w51Var4 = this.L;
                    boolean z28 = z || w51Var4.f == null;
                    if (!z && (w51Var3 = w51Var4.f) != null) {
                        n61 n61Var2 = w51Var3.d;
                        if (n61Var2.V != 0.0f) {
                            int[] iArr = n61Var2.o0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        ba4Var.f(k67Var2, k67VarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zF || zF2 || zF3) {
                if (zF && !zF2) {
                    w51Var2 = w51Var2;
                    k67VarK4 = k67VarK4;
                    z15 = z15;
                    k67Var3 = k67VarK6;
                    z20 = z2;
                    i22 = (z2 && (w51Var.f.d instanceof a30)) ? 8 : 5;
                } else if (zF || !zF2) {
                    k67Var3 = k67VarK6;
                    if (zF && zF2) {
                        n61 n61Var3 = w51Var.f.d;
                        n61 n61Var4 = w51Var2.f.d;
                        z15 = z15;
                        o61 o61Var = this.S;
                        int i32 = 6;
                        if (z14) {
                            if (i27 == 0) {
                                if (i24 != 0 || i11 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (k67VarK5.r && k67Var3.r) {
                                    ba4Var.e(k67VarK3, k67VarK5, w51Var.d(), 8);
                                    ba4Var.e(k67VarK4, k67Var3, -w51Var2.d(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((n61Var3 instanceof a30) || (n61Var4 instanceof a30)) {
                                    ba4Var = ba4Var;
                                    i27 = i27;
                                    k67VarK3 = k67VarK3;
                                    k67VarK4 = k67VarK4;
                                    z18 = z24;
                                    k67Var2 = k67Var2;
                                    i12 = i20;
                                    k67VarK5 = k67VarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = 4;
                                } else {
                                    ba4Var = ba4Var;
                                    k67VarK3 = k67VarK3;
                                    k67VarK4 = k67VarK4;
                                    z18 = z24;
                                    i12 = i20;
                                    k67VarK5 = k67VarK5;
                                    i32 = 6;
                                    z16 = z23;
                                    i13 = i21;
                                    i27 = i27;
                                    k67Var2 = k67Var2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((n61Var3 instanceof a30) || (n61Var4 instanceof a30)) {
                                        i12 = 5;
                                    } else {
                                        ba4Var = ba4Var;
                                        i27 = i27;
                                        k67VarK3 = k67VarK3;
                                        k67VarK4 = k67VarK4;
                                        k67VarK5 = k67VarK5;
                                        i32 = 6;
                                        i12 = 5;
                                        i13 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    k67Var2 = k67Var2;
                                } else if (i27 == 1) {
                                    i12 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i13 = i19;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i24 > 0) {
                                                ba4Var = ba4Var;
                                                k67Var2 = k67Var2;
                                                k67VarK3 = k67VarK3;
                                                k67VarK4 = k67VarK4;
                                                k67VarK5 = k67VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                            } else if (i24 != 0 || i11 != 0) {
                                                ba4Var = ba4Var;
                                                k67Var2 = k67Var2;
                                                k67VarK3 = k67VarK3;
                                                k67VarK4 = k67VarK4;
                                                k67VarK5 = k67VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 4;
                                            } else if (z9) {
                                                i18 = (n61Var3 == o61Var || n61Var4 == o61Var) ? 5 : 4;
                                                i13 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                ba4Var = ba4Var;
                                                k67Var2 = k67Var2;
                                                k67VarK3 = k67VarK3;
                                                k67VarK4 = k67VarK4;
                                                k67VarK5 = k67VarK5;
                                                i32 = 6;
                                                i12 = 5;
                                                i13 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i12 = i18;
                                        ba4Var = ba4Var;
                                    } else if (z9) {
                                        ba4Var = ba4Var;
                                        k67Var2 = k67Var2;
                                        k67VarK3 = k67VarK3;
                                        k67VarK4 = k67VarK4;
                                        k67VarK5 = k67VarK5;
                                        i12 = 8;
                                        i32 = z2 ? 5 : 4;
                                    } else {
                                        ba4Var = ba4Var;
                                        k67Var2 = k67Var2;
                                        k67VarK3 = k67VarK3;
                                        k67VarK4 = k67VarK4;
                                        k67VarK5 = k67VarK5;
                                        i12 = 8;
                                        i32 = 8;
                                    }
                                    i13 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i12 = 5;
                                    i13 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i13 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                k67Var2 = k67Var2;
                            }
                            if (z17 || k67VarK5 != k67Var3 || n61Var3 == o61Var) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && k67VarK5 == k67Var && k67Var3 == k67Var2) {
                                    i32 = 8;
                                    z20 = false;
                                    i17 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i17 = i12;
                                }
                                k67 k67Var4 = k67VarK5;
                                n61Var = n61Var4;
                                ba4Var.b(k67VarK3, k67Var4, w51Var.d(), f, k67Var3, k67VarK4, w51Var2.d(), i32);
                                k67VarK5 = k67Var4;
                                i12 = i17;
                                z19 = z22;
                            } else {
                                n61Var = n61Var4;
                                z20 = z2;
                            }
                            if (this.f0 != 8 && ((hashSet = w51Var2.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && k67VarK5 != k67Var3 && !z14 && ((n61Var3 instanceof a30) || (n61Var instanceof a30))) {
                                    i12 = 6;
                                }
                                ba4Var.f(k67VarK3, k67VarK5, w51Var.d(), i12);
                                ba4Var.g(k67VarK4, k67Var3, -w51Var2.d(), i12);
                            }
                            if (z20 || !z10 || (n61Var3 instanceof a30) || (n61Var instanceof a30) || n61Var == o61Var) {
                                iMin2 = i13;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i12 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (n61Var3 != o61Var && n61Var != o61Var) {
                                        i32 = iMin2;
                                    }
                                    if ((n61Var3 instanceof g43) || (n61Var instanceof g43)) {
                                        i32 = 5;
                                    }
                                    if ((n61Var3 instanceof a30) || (n61Var instanceof a30)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i16 = 5;
                                    } else {
                                        i16 = i32;
                                    }
                                    iMin2 = Math.max(i16, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i12, iMin2);
                                    if (z6 || z9 || !(n61Var3 == o61Var || n61Var == o61Var)) {
                                        i15 = iMin2;
                                    } else {
                                        i15 = 4;
                                    }
                                } else {
                                    i15 = iMin2;
                                }
                                ba4Var.e(k67VarK3, k67VarK5, w51Var.d(), i15);
                                ba4Var.e(k67VarK4, k67Var3, -w51Var2.d(), i15);
                            }
                            if (z20) {
                                if (k67Var == k67VarK5) {
                                    iD = w51Var.d();
                                } else {
                                    iD = 0;
                                }
                                if (k67VarK5 != k67Var) {
                                    ba4Var.f(k67VarK3, k67Var, iD, 5);
                                }
                            }
                            if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                i14 = 5;
                            } else if (z14 && i27 == 3) {
                                ba4Var.f(k67VarK4, k67VarK3, 0, 8);
                                i14 = 5;
                            } else {
                                i14 = 5;
                                ba4Var.f(k67VarK4, k67VarK3, 0, 5);
                            }
                        } else {
                            if (k67VarK5.r && k67Var3.r) {
                                ba4Var.b(k67VarK3, k67VarK5, w51Var.d(), f, k67Var3, k67VarK4, w51Var2.d(), 8);
                                if (z2 && z15) {
                                    int iD2 = w51Var2.f != null ? w51Var2.d() : 0;
                                    if (k67Var3 != k67Var2) {
                                        ba4Var.f(k67Var2, k67VarK4, iD2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i12 = 5;
                            i13 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i17 = i12;
                            }
                            k67 k67Var5 = k67VarK5;
                            n61Var = n61Var4;
                            ba4Var.b(k67VarK3, k67Var5, w51Var.d(), f, k67Var3, k67VarK4, w51Var2.d(), i32);
                            k67VarK5 = k67Var5;
                            i12 = i17;
                            z19 = z22;
                        } else {
                            n61Var = n61Var4;
                            z20 = z2;
                        }
                        if (this.f0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i12 = 6;
                            }
                            ba4Var.f(k67VarK3, k67VarK5, w51Var.d(), i12);
                            ba4Var.g(k67VarK4, k67Var3, -w51Var2.d(), i12);
                        }
                        if (z20) {
                            iMin2 = i13;
                            z21 = z19;
                        } else {
                            iMin2 = i13;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (n61Var3 != o61Var) {
                                    i32 = iMin2;
                                }
                                if (n61Var3 instanceof g43) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (n61Var3 instanceof a30) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i16 = 5;
                                } else {
                                    i16 = i32;
                                }
                                iMin2 = Math.max(i16, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i12, iMin2);
                                if (z6) {
                                    i15 = iMin2;
                                } else {
                                    i15 = iMin2;
                                }
                            } else {
                                i15 = iMin2;
                            }
                            ba4Var.e(k67VarK3, k67VarK5, w51Var.d(), i15);
                            ba4Var.e(k67VarK4, k67Var3, -w51Var2.d(), i15);
                        }
                        if (z20) {
                            if (k67Var == k67VarK5) {
                                iD = w51Var.d();
                            } else {
                                iD = 0;
                            }
                            if (k67VarK5 != k67Var) {
                                ba4Var.f(k67VarK3, k67Var, iD, 5);
                            }
                        }
                        if (z20) {
                            i14 = 5;
                        } else {
                            i14 = 5;
                        }
                    }
                    i22 = i14;
                } else {
                    k67Var3 = k67VarK6;
                    ba4Var.e(k67VarK4, k67Var3, -w51Var2.d(), 8);
                    if (z2) {
                        ba4Var.f(k67VarK3, k67Var, 0, 5);
                        w51Var2 = w51Var2;
                        i14 = 5;
                        k67VarK4 = k67VarK4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i22 = i14;
                }
                if (z20 || !z15) {
                    return;
                }
                int iD3 = w51Var2.f != null ? w51Var2.d() : 0;
                if (k67Var3 != k67Var2) {
                    ba4Var.f(k67Var2, k67VarK4, iD3, i22);
                    return;
                }
                return;
            }
            k67Var3 = k67VarK6;
            i14 = 5;
            z20 = z2;
            i22 = i14;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            ba4Var.e(k67VarK4, k67VarK3, 0, 3);
            if (i4 > 0) {
                ba4Var.f(k67VarK4, k67VarK3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                ba4Var.g(k67VarK4, k67VarK3, i5, i10);
            }
        } else {
            ba4Var.e(k67VarK4, k67VarK3, iMin, i10);
        }
        z15 = z4;
        i11 = i23;
        if (z11) {
        }
        boolean z29 = z15;
        if (i26 >= 2) {
        }
    }

    public final void e(ba4 ba4Var) {
        ba4Var.k(this.H);
        ba4Var.k(this.I);
        ba4Var.k(this.J);
        ba4Var.k(this.K);
        if (this.Z > 0) {
            ba4Var.k(this.L);
        }
    }

    public final void f() {
        if (this.d == null) {
            g63 g63Var = new g63(this);
            g63Var.h.e = 4;
            g63Var.i.e = 5;
            g63Var.f = 0;
            this.d = g63Var;
        }
        if (this.e == null) {
            ld8 ld8Var = new ld8(this);
            tn1 tn1Var = new tn1(ld8Var);
            ld8Var.k = tn1Var;
            ld8Var.l = null;
            ld8Var.h.e = 6;
            ld8Var.i.e = 7;
            tn1Var.e = 8;
            ld8Var.f = 1;
            this.e = ld8Var;
        }
    }

    public w51 g(int i) {
        switch (ua5.B(i)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(e41.u(i));
        }
    }

    public final int h(int i) {
        int[] iArr = this.o0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int i() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final n61 j(int i) {
        w51 w51Var;
        w51 w51Var2;
        if (i != 0) {
            if (i == 1 && (w51Var2 = (w51Var = this.K).f) != null && w51Var2.f == w51Var) {
                return w51Var2.d;
            }
            return null;
        }
        w51 w51Var3 = this.J;
        w51 w51Var4 = w51Var3.f;
        if (w51Var4 == null || w51Var4.f != w51Var3) {
            return null;
        }
        return w51Var4.d;
    }

    public final n61 k(int i) {
        w51 w51Var;
        w51 w51Var2;
        if (i != 0) {
            if (i == 1 && (w51Var2 = (w51Var = this.I).f) != null && w51Var2.f == w51Var) {
                return w51Var2.d;
            }
            return null;
        }
        w51 w51Var3 = this.H;
        w51 w51Var4 = w51Var3.f;
        if (w51Var4 == null || w51Var4.f != w51Var3) {
            return null;
        }
        return w51Var4.d;
    }

    public void l(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.U);
        sb.append("\n");
        sb.append("    actualLeft:" + this.X);
        sb.append("\n");
        sb.append("    actualTop:" + this.Y);
        sb.append("\n");
        n(sb, "left", this.H);
        n(sb, "top", this.I);
        n(sb, "right", this.J);
        n(sb, "bottom", this.K);
        n(sb, "baseline", this.L);
        n(sb, "centerX", this.M);
        n(sb, "centerY", this.N);
        int i = this.T;
        int i2 = this.a0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.o0;
        int i6 = iArr2[0];
        float[] fArr = this.j0;
        float f2 = fArr[0];
        m(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.U;
        int i8 = this.b0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        m(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.V;
        int i13 = this.W;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        E(sb, "    horizontalBias", this.c0, 0.5f);
        E(sb, "    verticalBias", this.d0, 0.5f);
        D(this.h0, 0, "    horizontalChainStyle", sb);
        D(this.i0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int o() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int p() {
        o61 o61Var = this.S;
        return o61Var != null ? o61Var.w0 + this.X : this.X;
    }

    public final int q() {
        o61 o61Var = this.S;
        return o61Var != null ? o61Var.x0 + this.Y : this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean r(int i) {
        if (i == 0) {
            if ((this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean s(int i, int i2) {
        w51 w51Var;
        w51 w51Var2;
        w51 w51Var3;
        w51 w51Var4;
        if (i == 0) {
            w51 w51Var5 = this.H;
            w51 w51Var6 = w51Var5.f;
            if (w51Var6 == null || !w51Var6.c || (w51Var4 = (w51Var3 = this.J).f) == null || !w51Var4.c) {
                return false;
            }
            return (w51Var4.c() - w51Var3.d()) - (w51Var5.d() + w51Var5.f.c()) >= i2;
        }
        w51 w51Var7 = this.I;
        w51 w51Var8 = w51Var7.f;
        if (w51Var8 == null || !w51Var8.c || (w51Var2 = (w51Var = this.K).f) == null || !w51Var2.c) {
            return false;
        }
        return (w51Var2.c() - w51Var.d()) - (w51Var7.d() + w51Var7.f.c()) >= i2;
    }

    public final void t(int i, int i2, int i3, int i4, n61 n61Var) {
        g(i).a(n61Var.g(i2), i3, i4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.g0 != null ? e41.l(new StringBuilder("id: "), this.g0, " ") : "");
        sb.append("(");
        sb.append(this.X);
        sb.append(", ");
        sb.append(this.Y);
        sb.append(") - (");
        sb.append(this.T);
        sb.append(" x ");
        return to7.l(sb, this.U, ")");
    }

    public final boolean u(int i) {
        w51 w51Var;
        w51 w51Var2;
        int i2 = i * 2;
        w51[] w51VarArr = this.P;
        w51 w51Var3 = w51VarArr[i2];
        w51 w51Var4 = w51Var3.f;
        return (w51Var4 == null || w51Var4.f == w51Var3 || (w51Var2 = (w51Var = w51VarArr[i2 + 1]).f) == null || w51Var2.f != w51Var) ? false : true;
    }

    public final boolean v() {
        w51 w51Var = this.H;
        w51 w51Var2 = w51Var.f;
        if (w51Var2 != null && w51Var2.f == w51Var) {
            return true;
        }
        w51 w51Var3 = this.J;
        w51 w51Var4 = w51Var3.f;
        return w51Var4 != null && w51Var4.f == w51Var3;
    }

    public final boolean w() {
        w51 w51Var = this.I;
        w51 w51Var2 = w51Var.f;
        if (w51Var2 != null && w51Var2.f == w51Var) {
            return true;
        }
        w51 w51Var3 = this.K;
        w51 w51Var4 = w51Var3.f;
        return w51Var4 != null && w51Var4.f == w51Var3;
    }

    public final boolean x() {
        return this.g && this.f0 != 8;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        return this.H.c && this.J.c;
    }

    public boolean z() {
        if (this.l) {
            return true;
        }
        return this.I.c && this.K.c;
    }
}
