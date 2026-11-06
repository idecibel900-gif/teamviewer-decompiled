package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y35 extends o45 {
    public final es4 c;
    public final nd d;
    public final mg4 e;
    public e45 f;
    public bn5 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public y35(es4 es4Var) {
        this.c = es4Var;
        nd ndVar = new nd((byte) 12, false);
        ndVar.f1562o = new long[2];
        this.d = ndVar;
        this.e = new mg4(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // o.o45
    public final boolean a(mg4 mg4Var, i04 i04Var, io.sentry.android.core.n1 n1Var, boolean z) {
        nd ndVar;
        mg4 mg4Var2;
        Object obj;
        boolean z2;
        boolean z3;
        bn5 bn5Var;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        boolean zA = super.a(mg4Var, i04Var, n1Var, z);
        ?? L0 = this.c;
        boolean z6 = true;
        if (L0.z) {
            ?? xx4Var = 0;
            while (L0 != 0) {
                if (L0 instanceof ln5) {
                    this.f = vn4.n0((ln5) L0, 16);
                } else if ((L0.f737o & 16) != 0 && (L0 instanceof vm1)) {
                    es4 es4Var = ((vm1) L0).B;
                    int i3 = 0;
                    while (es4Var != null) {
                        if ((es4Var.f737o & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                L0 = L0;
                                xx4Var = xx4Var;
                                xx4Var = xx4Var;
                                L0 = es4Var;
                            } else {
                                if (xx4Var == 0) {
                                    xx4Var = new xx4(new es4[16]);
                                }
                                if (L0 != 0) {
                                    xx4Var.b(L0);
                                    L0 = 0;
                                }
                                xx4Var.b(es4Var);
                            }
                        } else {
                            L0 = L0;
                            xx4Var = xx4Var;
                        }
                        es4Var = es4Var.r;
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
            if (this.f != null) {
                int iH = mg4Var.h();
                int i4 = 0;
                while (true) {
                    ndVar = this.d;
                    mg4Var2 = this.e;
                    if (i4 >= iH) {
                        break;
                    }
                    long jD = mg4Var.d(i4);
                    in5 in5Var = (in5) mg4Var.i(i4);
                    if (ndVar.d(jD)) {
                        boolean z7 = z6;
                        long j = in5Var.g;
                        long j2 = in5Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            ArrayList arrayList = new ArrayList(in5Var.b().size());
                            List listB = in5Var.b();
                            int size = listB.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list = listB;
                                t53 t53Var = (t53) listB.get(i5);
                                mg4 mg4Var3 = mg4Var2;
                                long j3 = jD;
                                long j4 = t53Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = t53Var.a;
                                    e45 e45Var = this.f;
                                    e45Var.getClass();
                                    arrayList.add(new t53(j5, e45Var.z(i04Var, j4), t53Var.c, t53Var.d, t53Var.e));
                                }
                                i5++;
                                size = size;
                                listB = list;
                                mg4Var2 = mg4Var3;
                                jD = j3;
                                in5Var = in5Var;
                            }
                            mg4 mg4Var4 = mg4Var2;
                            long j6 = jD;
                            e45 e45Var2 = this.f;
                            e45Var2.getClass();
                            long jZ = e45Var2.z(i04Var, j);
                            e45 e45Var3 = this.f;
                            e45Var3.getClass();
                            in5 in5Var2 = new in5(in5Var.a, in5Var.b, e45Var3.z(i04Var, j2), in5Var.d, in5Var.e, in5Var.f, jZ, in5Var.h, in5Var.i, arrayList, in5Var.j, in5Var.k, in5Var.l, in5Var.n);
                            in5 in5Var3 = in5Var.q;
                            if (in5Var3 == null) {
                                in5Var3 = in5Var;
                            }
                            in5Var2.q = in5Var3;
                            in5 in5Var4 = in5Var.q;
                            if (in5Var4 != null) {
                                in5Var = in5Var4;
                            }
                            in5Var2.q = in5Var;
                            mg4Var4.e(j6, in5Var2);
                        } else {
                            z5 = z7;
                        }
                    } else {
                        z5 = z6;
                    }
                    i4++;
                    z6 = z5;
                    iH = iH;
                    zA = zA;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (mg4Var2.h() == 0) {
                    ndVar.n = 0;
                    this.a.g();
                    return z9;
                }
                int i6 = ndVar.n;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (mg4Var.c(((long[]) ndVar.f1562o)[i6]) < 0 && i6 < (i2 = ndVar.n)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = (long[]) ndVar.f1562o;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        ndVar.n--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(mg4Var2.h());
                int iH2 = mg4Var2.h();
                for (int i10 = 0; i10 < iH2; i10++) {
                    arrayList2.add(mg4Var2.i(i10));
                }
                bn5 bn5Var2 = new bn5(arrayList2, n1Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i11);
                    if (n1Var.a(((in5) obj).a)) {
                        break;
                    }
                    i11++;
                }
                in5 in5Var5 = (in5) obj;
                if (in5Var5 != null) {
                    boolean z10 = in5Var5.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z10 || in5Var5.h)) {
                            e45 e45Var4 = this.f;
                            e45Var4.getClass();
                            long j7 = e45Var4.f1179o;
                            long j8 = in5Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            z4 = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat > ((float) i12) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z11 = this.h;
                    if (z4 == z11 || !((i = bn5Var2.f) == 3 || i == 4 || i == 5)) {
                        int i13 = bn5Var2.f;
                        if (i13 == 4 && z11 && !this.j) {
                            bn5Var2.f = 3;
                        } else if (i13 == 5 && z4 && z10) {
                            bn5Var2.f = 3;
                        }
                    } else {
                        bn5Var2.f = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && bn5Var2.f == 3 && (bn5Var = this.g) != null) {
                    ?? r1 = bn5Var.a;
                    int size3 = r1.size();
                    ?? r5 = bn5Var2.a;
                    if (size3 != r5.size()) {
                        z3 = z9;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!t65.b(((in5) r1.get(r6)).c, ((in5) r5.get(r6)).c)) {
                            z3 = z9;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z9;
                    break;
                }
                this.g = bn5Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // o.o45
    public final void b(io.sentry.android.core.n1 n1Var) {
        super.b(n1Var);
        bn5 bn5Var = this.g;
        if (bn5Var == null) {
            return;
        }
        this.h = this.i;
        List list = bn5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            in5 in5Var = (in5) list.get(i);
            boolean z = in5Var.d;
            long j = in5Var.a;
            boolean zA = n1Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.q(j);
            }
        }
        this.i = false;
        this.j = bn5Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        xx4 xx4Var = this.a;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((y35) objArr[i2]).c();
        }
        ?? L0 = this.c;
        ?? xx4Var2 = 0;
        while (L0 != 0) {
            if (L0 instanceof ln5) {
                ((ln5) L0).E();
            } else if ((L0.f737o & 16) != 0 && (L0 instanceof vm1)) {
                es4 es4Var = ((vm1) L0).B;
                int i3 = 0;
                xx4Var2 = xx4Var2;
                L0 = L0;
                while (es4Var != null) {
                    if ((es4Var.f737o & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            xx4Var2 = xx4Var2;
                            L0 = es4Var;
                        } else {
                            if (xx4Var2 == 0) {
                                xx4Var2 = new xx4(new es4[16]);
                            }
                            if (L0 != 0) {
                                xx4Var2.b(L0);
                                L0 = 0;
                            }
                            xx4Var2.b(es4Var);
                        }
                    }
                    es4Var = es4Var.r;
                    xx4Var2 = xx4Var2;
                    L0 = L0;
                }
                if (i3 == 1) {
                }
            }
            L0 = vn4.l0(xx4Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
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
    public final boolean d(io.sentry.android.core.n1 n1Var) {
        LayoutNode layoutNode;
        mg4 mg4Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (mg4Var.h() != 0) {
            es4 es4Var = this.c;
            if (es4Var.z) {
                e45 e45Var = es4Var.t;
                if ((e45Var == null || (layoutNode = e45Var.G) == null) ? false : layoutNode.X()) {
                    bn5 bn5Var = this.g;
                    bn5Var.getClass();
                    e45 e45Var2 = this.f;
                    e45Var2.getClass();
                    long j = e45Var2.f1179o;
                    ?? L0 = es4Var;
                    ?? xx4Var = 0;
                    while (L0 != 0) {
                        if (L0 instanceof ln5) {
                            ((ln5) L0).D0(bn5Var, cn5.f544o, j);
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
                    if (es4Var.z) {
                        xx4 xx4Var2 = this.a;
                        Object[] objArr = xx4Var2.m;
                        int i2 = xx4Var2.f2559o;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((y35) objArr[i3]).d(n1Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(n1Var);
        mg4Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r6v10, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(io.sentry.android.core.n1 n1Var, boolean z) {
        LayoutNode layoutNode;
        if (this.e.h() == 0) {
            return false;
        }
        ?? L0 = this.c;
        if (L0.z) {
            e45 e45Var = L0.t;
            if ((e45Var == null || (layoutNode = e45Var.G) == null) ? false : layoutNode.X()) {
                bn5 bn5Var = this.g;
                bn5Var.getClass();
                e45 e45Var2 = this.f;
                e45Var2.getClass();
                long j = e45Var2.f1179o;
                ?? L1 = L0;
                ?? xx4Var = 0;
                while (L1 != 0) {
                    if (L1 instanceof ln5) {
                        ((ln5) L1).D0(bn5Var, cn5.m, j);
                    } else if ((L1.f737o & 16) != 0 && (L1 instanceof vm1)) {
                        es4 es4Var = ((vm1) L1).B;
                        int i = 0;
                        while (es4Var != null) {
                            if ((es4Var.f737o & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    L1 = L1;
                                    xx4Var = xx4Var;
                                    xx4Var = xx4Var;
                                    L1 = es4Var;
                                } else {
                                    if (xx4Var == 0) {
                                        xx4Var = new xx4(new es4[16]);
                                    }
                                    if (L1 != 0) {
                                        xx4Var.b(L1);
                                        L1 = 0;
                                    }
                                    xx4Var.b(es4Var);
                                }
                            } else {
                                L1 = L1;
                                xx4Var = xx4Var;
                            }
                            es4Var = es4Var.r;
                            L1 = L1;
                            xx4Var = xx4Var;
                        }
                        if (i == 1) {
                            L1 = L1;
                            xx4Var = xx4Var;
                        } else {
                            L1 = L1;
                            xx4Var = xx4Var;
                        }
                    }
                    L1 = vn4.l0(xx4Var);
                }
                if (L0.z) {
                    xx4 xx4Var2 = this.a;
                    Object[] objArr = xx4Var2.m;
                    int i2 = xx4Var2.f2559o;
                    for (int i3 = 0; i3 < i2; i3++) {
                        y35 y35Var = (y35) objArr[i3];
                        this.f.getClass();
                        y35Var.e(n1Var, z);
                    }
                }
                if (L0.z) {
                    ?? xx4Var3 = 0;
                    while (L0 != 0) {
                        if (L0 instanceof ln5) {
                            ((ln5) L0).D0(bn5Var, cn5.n, j);
                        } else if ((L0.f737o & 16) != 0 && (L0 instanceof vm1)) {
                            es4 es4Var2 = ((vm1) L0).B;
                            int i4 = 0;
                            while (es4Var2 != null) {
                                if ((es4Var2.f737o & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        L0 = L0;
                                        xx4Var3 = xx4Var3;
                                        xx4Var3 = xx4Var3;
                                        L0 = es4Var2;
                                    } else {
                                        if (xx4Var3 == 0) {
                                            xx4Var3 = new xx4(new es4[16]);
                                        }
                                        if (L0 != 0) {
                                            xx4Var3.b(L0);
                                            L0 = 0;
                                        }
                                        xx4Var3.b(es4Var2);
                                    }
                                } else {
                                    L0 = L0;
                                    xx4Var3 = xx4Var3;
                                }
                                es4Var2 = es4Var2.r;
                                L0 = L0;
                                xx4Var3 = xx4Var3;
                            }
                            if (i4 == 1) {
                                L0 = L0;
                                xx4Var3 = xx4Var3;
                            } else {
                                L0 = L0;
                                xx4Var3 = xx4Var3;
                            }
                        }
                        L0 = vn4.l0(xx4Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, zw4 zw4Var) {
        nd ndVar = this.d;
        if (ndVar.d(j) && zw4Var.g(this) < 0) {
            ndVar.q(j);
            this.e.g(j);
        }
        xx4 xx4Var = this.a;
        Object[] objArr = xx4Var.m;
        int i = xx4Var.f2559o;
        for (int i2 = 0; i2 < i; i2++) {
            ((y35) objArr[i2]).f(j, zw4Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
