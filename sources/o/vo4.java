package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vo4 {
    public final fp1 a;
    public final cj3 b;

    public vo4(fp1 fp1Var) {
        this.a = fp1Var;
        io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1Var.a;
        this.b = new cj3((ps4) kVar.b, (j93) kVar.l);
    }

    public final sx3 a(fi1 fi1Var) {
        if (fi1Var instanceof ad5) {
            ht2 ht2Var = ((bd5) ((ad5) fi1Var)).q;
            fp1 fp1Var = this.a;
            return new qw5(ht2Var, (ty4) fp1Var.b, (d22) fp1Var.d, (rp1) fp1Var.g);
        }
        if (fi1Var instanceof pp1) {
            return ((pp1) fi1Var).H;
        }
        return null;
    }

    public final up b(t1 t1Var, int i, int i2) {
        return !im2.c.i(i).booleanValue() ? yl7.p : new s45((xd4) ((io.sentry.android.replay.screenshot.k) this.a.a).a, new so4(this, t1Var, i2, (byte) 0));
    }

    public final up c(qv5 qv5Var, boolean z) {
        return !im2.c.i(qv5Var.p).booleanValue() ? yl7.p : new s45((xd4) ((io.sentry.android.replay.screenshot.k) this.a.a).a, new to4(this, z, qv5Var));
    }

    public final ip1 d(vu5 vu5Var, boolean z) {
        cp1 cp1Var;
        fp1 fp1Var = this.a;
        fi1 fi1Var = (fi1) fp1Var.c;
        fi1Var.getClass();
        ns4 ns4Var = (ns4) fi1Var;
        ip1 ip1Var = new ip1(ns4Var, null, b(vu5Var, vu5Var.p, 1), z, 1, vu5Var, (ty4) fp1Var.b, (d22) fp1Var.d, (ed8) fp1Var.e, (rp1) fp1Var.g, null);
        vo4 vo4Var = (vo4) fp1Var.a(ip1Var, ea2.m, (ty4) fp1Var.b, (d22) fp1Var.d, (ed8) fp1Var.e, (h60) fp1Var.f).i;
        List list = vu5Var.q;
        list.getClass();
        List listG = vo4Var.g(list, vu5Var, 1);
        ow5 ow5Var = (ow5) im2.d.i(vu5Var.p);
        switch (ow5Var == null ? -1 : tw5.b[ow5Var.ordinal()]) {
            case 1:
                cp1Var = dp1.d;
                cp1Var.getClass();
                break;
            case 2:
                cp1Var = dp1.a;
                cp1Var.getClass();
                break;
            case 3:
                cp1Var = dp1.b;
                cp1Var.getClass();
                break;
            case 4:
                cp1Var = dp1.c;
                cp1Var.getClass();
                break;
            case 5:
                cp1Var = dp1.e;
                cp1Var.getClass();
                break;
            case 6:
                cp1Var = dp1.f;
                cp1Var.getClass();
                break;
            default:
                cp1Var = dp1.a;
                cp1Var.getClass();
                break;
        }
        ip1Var.P0(listG, cp1Var);
        ip1Var.L0(ns4Var.W());
        ip1Var.D = ns4Var.A();
        ip1Var.H = !im2.f1076o.i(vu5Var.p).booleanValue();
        return ip1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    public final dq1 e(iv5 iv5Var) {
        int i;
        int i2;
        oz3 oz3VarG;
        tp tpVar = yl7.p;
        fp1 fp1Var = this.a;
        ty4 ty4Var = (ty4) fp1Var.b;
        d22 d22Var = (d22) fp1Var.d;
        byte b = 1;
        if ((iv5Var.f1108o & 1) == 1) {
            i = iv5Var.p;
        } else {
            int i3 = iv5Var.q;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i;
        up upVarB = b(iv5Var, i4, 1);
        int i5 = iv5Var.f1108o;
        up gp1Var = ((i5 & 32) == 32 || (i5 & 64) == 64) ? new gp1((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, new so4(this, iv5Var, b, b)) : tpVar;
        ed8 ed8Var = bp1.g((fi1) fp1Var.c).c(et1.C(ty4Var, iv5Var.r)).equals(mg7.a) ? ed8.b : (ed8) fp1Var.e;
        fi1 fi1Var = (fi1) fp1Var.c;
        sy4 sy4VarC = et1.C(ty4Var, iv5Var.r);
        jv5 jv5Var = (jv5) im2.p.i(i4);
        int i6 = jv5Var == null ? -1 : tw5.a[jv5Var.ordinal()];
        if (i6 != 1) {
            i2 = 2;
            if (i6 != 2) {
                i2 = 3;
                if (i6 != 3) {
                    i2 = 4;
                    if (i6 != 4) {
                        i2 = 1;
                    }
                }
            }
        } else {
            i2 = 1;
        }
        up upVar = gp1Var;
        dq1 dq1Var = new dq1(fi1Var, null, upVarB, sy4VarC, i2, iv5Var, (ty4) fp1Var.b, d22Var, ed8Var, (rp1) fp1Var.g, null);
        List list = iv5Var.u;
        list.getClass();
        fp1 fp1VarA = fp1Var.a(dq1Var, list, (ty4) fp1Var.b, (d22) fp1Var.d, (ed8) fp1Var.e, (h60) fp1Var.f);
        q48 q48Var = (q48) fp1VarA.h;
        int i7 = iv5Var.f1108o;
        aw5 aw5VarA = (i7 & 32) == 32 ? iv5Var.v : (i7 & 64) == 64 ? d22Var.a(iv5Var.w) : null;
        v14 v14VarO = (aw5VarA == null || (oz3VarG = q48Var.g(aw5VarA)) == null) ? null : io1.O(dq1Var, oz3VarG, upVar);
        fi1 fi1Var2 = (fi1) fp1Var.c;
        ns4 ns4Var = fi1Var2 instanceof ns4 ? (ns4) fi1Var2 : null;
        v14 v14VarQ0 = ns4Var != null ? ns4Var.q0() : null;
        List list2 = iv5Var.x;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = iv5Var.y;
            list3.getClass();
            ArrayList arrayList = new ArrayList(mv0.Z(list3, 10));
            for (Integer num : list3) {
                num.getClass();
                arrayList.add(d22Var.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                qf0.U();
                throw null;
            }
            v14 v14VarI = io1.I(dq1Var, q48Var.g((aw5) obj), null, tpVar, i8);
            if (v14VarI != null) {
                arrayList2.add(v14VarI);
            }
            i8 = i9;
        }
        List listB = q48Var.b();
        vo4 vo4Var = (vo4) fp1VarA.i;
        List list4 = iv5Var.A;
        list4.getClass();
        dq1Var.Q0(v14VarO, v14VarQ0, arrayList2, listB, vo4Var.g(list4, iv5Var, 1), q48Var.g(zu1.R(iv5Var, d22Var)), xz2.B0((kv5) im2.e.i(i4)), vt1.q((ow5) im2.d.i(i4)), fa2.m);
        dq1Var.y = im2.q.i(i4).booleanValue();
        dq1Var.z = im2.r.i(i4).booleanValue();
        dq1Var.A = im2.u.i(i4).booleanValue();
        dq1Var.B = im2.s.i(i4).booleanValue();
        dq1Var.C = im2.t.i(i4).booleanValue();
        dq1Var.G = im2.v.i(i4).booleanValue();
        dq1Var.D = im2.w.i(i4).booleanValue();
        dq1Var.H = !im2.x.i(i4).booleanValue();
        ((ir) ((io.sentry.android.replay.screenshot.k) fp1Var.a).m).getClass();
        return dq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0373  */
    /* JADX WARN: Code duplicated, block: B:103:0x0377  */
    /* JADX WARN: Code duplicated, block: B:104:0x037d  */
    /* JADX WARN: Code duplicated, block: B:107:0x038e  */
    /* JADX WARN: Code duplicated, block: B:110:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:117:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x03be  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:123:0x03de  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x010d  */
    /* JADX WARN: Code duplicated, block: B:30:0x012e  */
    /* JADX WARN: Code duplicated, block: B:33:0x014c  */
    /* JADX WARN: Code duplicated, block: B:34:0x014f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0152  */
    /* JADX WARN: Code duplicated, block: B:37:0x0157  */
    /* JADX WARN: Code duplicated, block: B:40:0x0160  */
    /* JADX WARN: Code duplicated, block: B:41:0x0163  */
    /* JADX WARN: Code duplicated, block: B:43:0x0169  */
    /* JADX WARN: Code duplicated, block: B:44:0x0170  */
    /* JADX WARN: Code duplicated, block: B:49:0x017e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0188  */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7 A[LOOP:0: B:57:0x01a1->B:59:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de A[LOOP:1: B:64:0x01d0->B:68:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x022a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x022e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0233  */
    /* JADX WARN: Code duplicated, block: B:79:0x0258  */
    /* JADX WARN: Code duplicated, block: B:81:0x025f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0262  */
    /* JADX WARN: Code duplicated, block: B:85:0x0283  */
    /* JADX WARN: Code duplicated, block: B:87:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x02db  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0301  */
    /* JADX WARN: Code duplicated, block: B:98:0x0324  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [o.ju5] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r4v17, types: [o.ud4] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.bu5, o.cq1, o.du5, o.ii1, o.xi0] */
    public final cq1 f(qv5 qv5Var) throws Throwable {
        int i;
        ?? cq1Var;
        fp1 fp1Var;
        fp1 fp1VarA;
        q48 q48Var;
        int i2;
        boolean zBooleanValue;
        byte b;
        vo4 vo4Var;
        up gp1Var;
        byte b2;
        fi1 fi1Var;
        ns4 ns4Var;
        v14 v14VarQ0;
        int i3;
        aw5 aw5VarA;
        v14 v14VarO;
        List list;
        int i4;
        List list2;
        ArrayList arrayList;
        int i5;
        int i6;
        fm2 fm2Var;
        boolean zBooleanValue2;
        gm2 gm2Var;
        ow5 ow5Var;
        gm2 gm2Var2;
        kv5 kv5Var;
        int i7;
        int number;
        fm2 fm2Var2;
        fm2 fm2Var3;
        fm2 fm2Var4;
        ol5 ol5Var;
        Throwable th;
        fm2 fm2Var5;
        eu5 eu5Var;
        vo4 vo4Var2;
        ?? K;
        fi1 fi1Var2;
        ns4 ns4Var2;
        ms0 ms0VarI0;
        boolean z;
        int i8;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        boolean zBooleanValue5;
        up upVarB;
        ju5 ju5Var;
        qb8 qb8Var;
        int i9;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        boolean zBooleanValue8;
        up upVarB2;
        eu5 eu5VarJ;
        int i10;
        ArrayList arrayList2;
        oz3 oz3VarG;
        int i11;
        tp tpVar = yl7.p;
        fp1 fp1Var2 = this.a;
        d22 d22Var = (d22) fp1Var2.d;
        if ((qv5Var.f1871o & 1) == 1) {
            i = qv5Var.p;
        } else {
            int i12 = qv5Var.q;
            i = ((i12 >> 8) << 6) + (i12 & 63);
        }
        fi1 fi1Var3 = (fi1) fp1Var2.c;
        int i13 = 2;
        up upVarB3 = b(qv5Var, i, 2);
        as4 as4VarB0 = xz2.B0((kv5) im2.e.i(i));
        cp1 cp1VarQ = vt1.q((ow5) im2.d.i(i));
        boolean zBooleanValue9 = im2.y.i(i).booleanValue();
        sy4 sy4VarC = et1.C((ty4) fp1Var2.b, qv5Var.r);
        jv5 jv5Var = (jv5) im2.p.i(i);
        int i14 = jv5Var == null ? -1 : tw5.a[jv5Var.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    i13 = 4;
                    if (i14 != 4) {
                    }
                } else {
                    i13 = 3;
                }
            }
            fp1Var = fp1Var2;
            cq1Var = new cq1(fi1Var3, null, upVarB3, as4VarB0, cp1VarQ, zBooleanValue9, sy4VarC, i13, im2.C.i(i).booleanValue(), im2.B.i(i).booleanValue(), im2.E.i(i).booleanValue(), im2.F.i(i).booleanValue(), im2.G.i(i).booleanValue(), qv5Var, (ty4) fp1Var2.b, d22Var, (ed8) fp1Var2.e, (rp1) fp1Var2.g);
            List list3 = qv5Var.u;
            list3.getClass();
            fp1VarA = fp1Var.a(cq1Var, list3, (ty4) fp1Var.b, (d22) fp1Var.d, (ed8) fp1Var.e, (h60) fp1Var.f);
            q48Var = (q48) fp1VarA.h;
            i2 = i;
            zBooleanValue = im2.z.i(i2).booleanValue();
            if (zBooleanValue) {
                i11 = qv5Var.f1871o;
                if ((i11 & 32) == 32 || (i11 & 64) == 64) {
                    b = 1;
                    vo4Var = this;
                    gp1Var = new gp1((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, new so4(vo4Var, qv5Var, 3, b));
                } else {
                    b = 1;
                    vo4Var = this;
                    gp1Var = tpVar;
                }
            } else {
                b = 1;
                vo4Var = this;
                gp1Var = tpVar;
            }
            oz3 oz3VarG2 = q48Var.g(zu1.S(qv5Var, d22Var));
            List listB = q48Var.b();
            b2 = b;
            fi1Var = (fi1) fp1Var.c;
            if (fi1Var instanceof ns4) {
                ns4Var = (ns4) fi1Var;
            } else {
                ns4Var = null;
            }
            if (ns4Var != null) {
                v14VarQ0 = ns4Var.q0();
            } else {
                v14VarQ0 = null;
            }
            i3 = qv5Var.f1871o;
            if ((i3 & 32) == 32) {
                aw5VarA = qv5Var.v;
            } else if ((i3 & 64) == 64) {
                aw5VarA = d22Var.a(qv5Var.w);
            } else {
                aw5VarA = null;
            }
            if (aw5VarA != null || (oz3VarG = q48Var.g(aw5VarA)) == null) {
                v14VarO = null;
            } else {
                v14VarO = io1.O(cq1Var, oz3VarG, gp1Var);
            }
            list = qv5Var.x;
            if (list.isEmpty()) {
                list = null;
            }
            i4 = 10;
            if (list == null) {
                List<Integer> list4 = qv5Var.y;
                list4.getClass();
                arrayList2 = new ArrayList(mv0.Z(list4, 10));
                for (Integer num : list4) {
                    num.getClass();
                    arrayList2.add(d22Var.a(num.intValue()));
                }
                list = arrayList2;
            }
            list2 = listB;
            arrayList = new ArrayList(mv0.Z(list, 10));
            i5 = 0;
            for (Object obj : list) {
                i10 = i5 + 1;
                if (i5 >= 0) {
                    qf0.U();
                    throw null;
                }
                arrayList.add(io1.I(cq1Var, q48Var.g((aw5) obj), null, tpVar, i5));
                list2 = list2;
                i4 = i4;
                i5 = i10;
            }
            i6 = i4;
            cq1Var.K0(oz3VarG2, list2, v14VarQ0, v14VarO, arrayList);
            fm2Var = im2.c;
            zBooleanValue2 = fm2Var.i(i2).booleanValue();
            gm2Var = im2.d;
            ow5Var = (ow5) gm2Var.i(i2);
            gm2Var2 = im2.e;
            kv5Var = (kv5) gm2Var2.i(i2);
            if (ow5Var != null) {
                im2.a(i6);
                throw null;
            }
            if (kv5Var != null) {
                im2.a(11);
                throw null;
            }
            if (zBooleanValue2) {
                i7 = b2 << fm2Var.b;
            } else {
                i7 = 0;
            }
            number = (kv5Var.getNumber() << gm2Var2.b) | i7 | (ow5Var.getNumber() << gm2Var.b);
            fm2Var2 = im2.K;
            fm2Var2.getClass();
            fm2Var3 = im2.L;
            fm2Var3.getClass();
            fm2Var4 = im2.M;
            fm2Var4.getClass();
            ol5Var = s67.h;
            if (zBooleanValue) {
                if ((qv5Var.f1871o & 256) == 256) {
                    i9 = qv5Var.B;
                } else {
                    i9 = number;
                }
                zBooleanValue6 = fm2Var2.i(i9).booleanValue();
                zBooleanValue7 = fm2Var3.i(i9).booleanValue();
                zBooleanValue8 = fm2Var4.i(i9).booleanValue();
                upVarB2 = vo4Var.b(qv5Var, i9, 3);
                if (zBooleanValue6) {
                    th = null;
                    fm2Var5 = fm2Var2;
                    eu5VarJ = new eu5(cq1Var, upVarB2, xz2.B0((kv5) gm2Var2.i(i9)), vt1.q((ow5) gm2Var.i(i9)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, cq1Var.k(), null, ol5Var);
                } else {
                    fm2Var5 = fm2Var2;
                    th = null;
                    eu5VarJ = io1.J(cq1Var, upVarB2);
                }
                eu5Var = eu5VarJ;
                eu5Var.F0(cq1Var.getReturnType());
            } else {
                fp1Var = fp1Var;
                fp1VarA = fp1VarA;
                th = null;
                fm2Var5 = fm2Var2;
                fm2Var3 = fm2Var3;
                gm2Var = gm2Var;
                fm2Var4 = fm2Var4;
                gm2Var2 = gm2Var2;
                i2 = i2;
                eu5Var = null;
            }
            if (im2.A.i(i2).booleanValue()) {
                if ((qv5Var.f1871o & 512) == 512) {
                    i8 = qv5Var.C;
                } else {
                    i8 = number;
                }
                zBooleanValue3 = fm2Var5.i(i8).booleanValue();
                zBooleanValue4 = fm2Var3.i(i8).booleanValue();
                zBooleanValue5 = fm2Var4.i(i8).booleanValue();
                vo4Var2 = this;
                upVarB = vo4Var2.b(qv5Var, i8, 4);
                if (zBooleanValue3) {
                    ju5Var = new ju5(cq1Var, upVarB, xz2.B0((kv5) gm2Var2.i(i8)), vt1.q((ow5) gm2Var.i(i8)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, cq1Var.k(), null, ol5Var);
                    fp1 fp1Var3 = fp1VarA;
                    qb8Var = (qb8) lv0.F0(((vo4) fp1Var3.a(ju5Var, ea2.m, (ty4) fp1Var3.b, (d22) fp1Var3.d, (ed8) fp1Var3.e, (h60) fp1Var3.f).i).g(qf0.K(qv5Var.A), qv5Var, 4));
                    if (qb8Var != null) {
                        ju5.z(6);
                        throw th;
                    }
                    ju5Var.y = qb8Var;
                    K = ju5Var;
                } else {
                    K = io1.K(cq1Var, upVarB);
                }
            } else {
                vo4Var2 = this;
                K = th;
            }
            if (im2.D.i(i2).booleanValue()) {
                cq1Var.I0(th, new ro4(vo4Var2, qv5Var, cq1Var, (byte) 0));
            }
            fi1Var2 = (fi1) fp1Var.c;
            if (fi1Var2 instanceof ns4) {
                ns4Var2 = (ns4) fi1Var2;
            } else {
                ns4Var2 = null;
            }
            if (ns4Var2 != null) {
                ms0VarI0 = ns4Var2.i0();
            } else {
                ms0VarI0 = null;
            }
            if (ms0VarI0 == ms0.q) {
                z = true;
                cq1Var.I0(null, new ro4(vo4Var2, qv5Var, cq1Var, true ? 1 : 0));
            } else {
                z = true;
            }
            cq1Var.H0(eu5Var, K, new xi2(vo4Var2.c(qv5Var, false)), new xi2(vo4Var2.c(qv5Var, z)));
            return cq1Var;
        }
        i13 = 1;
        fp1Var = fp1Var2;
        cq1Var = new cq1(fi1Var3, null, upVarB3, as4VarB0, cp1VarQ, zBooleanValue9, sy4VarC, i13, im2.C.i(i).booleanValue(), im2.B.i(i).booleanValue(), im2.E.i(i).booleanValue(), im2.F.i(i).booleanValue(), im2.G.i(i).booleanValue(), qv5Var, (ty4) fp1Var2.b, d22Var, (ed8) fp1Var2.e, (rp1) fp1Var2.g);
        List list5 = qv5Var.u;
        list5.getClass();
        fp1VarA = fp1Var.a(cq1Var, list5, (ty4) fp1Var.b, (d22) fp1Var.d, (ed8) fp1Var.e, (h60) fp1Var.f);
        q48Var = (q48) fp1VarA.h;
        i2 = i;
        zBooleanValue = im2.z.i(i2).booleanValue();
        if (zBooleanValue) {
            i11 = qv5Var.f1871o;
            if ((i11 & 32) == 32) {
                b = 1;
                vo4Var = this;
                gp1Var = tpVar;
            }
            b = 1;
            vo4Var = this;
            gp1Var = new gp1((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, new so4(vo4Var, qv5Var, 3, b));
        } else {
            b = 1;
            vo4Var = this;
            gp1Var = tpVar;
        }
        oz3 oz3VarG3 = q48Var.g(zu1.S(qv5Var, d22Var));
        List listB2 = q48Var.b();
        b2 = b;
        fi1Var = (fi1) fp1Var.c;
        if (fi1Var instanceof ns4) {
            ns4Var = (ns4) fi1Var;
        } else {
            ns4Var = null;
        }
        if (ns4Var != null) {
            v14VarQ0 = ns4Var.q0();
        } else {
            v14VarQ0 = null;
        }
        i3 = qv5Var.f1871o;
        if ((i3 & 32) == 32) {
            aw5VarA = qv5Var.v;
        } else if ((i3 & 64) == 64) {
            aw5VarA = d22Var.a(qv5Var.w);
        } else {
            aw5VarA = null;
        }
        if (aw5VarA != null) {
            v14VarO = null;
        } else {
            v14VarO = null;
        }
        list = qv5Var.x;
        if (list.isEmpty()) {
            list = null;
        }
        i4 = 10;
        if (list == null) {
            List<Integer> list6 = qv5Var.y;
            list6.getClass();
            arrayList2 = new ArrayList(mv0.Z(list6, 10));
            while (r5.hasNext()) {
                num.getClass();
                arrayList2.add(d22Var.a(num.intValue()));
            }
            list = arrayList2;
        }
        list2 = listB2;
        arrayList = new ArrayList(mv0.Z(list, 10));
        i5 = 0;
        while (r5.hasNext()) {
            i10 = i5 + 1;
            if (i5 >= 0) {
                qf0.U();
                throw null;
            }
            arrayList.add(io1.I(cq1Var, q48Var.g((aw5) obj), null, tpVar, i5));
            list2 = list2;
            i4 = i4;
            i5 = i10;
        }
        i6 = i4;
        cq1Var.K0(oz3VarG3, list2, v14VarQ0, v14VarO, arrayList);
        fm2Var = im2.c;
        zBooleanValue2 = fm2Var.i(i2).booleanValue();
        gm2Var = im2.d;
        ow5Var = (ow5) gm2Var.i(i2);
        gm2Var2 = im2.e;
        kv5Var = (kv5) gm2Var2.i(i2);
        if (ow5Var != null) {
            im2.a(i6);
            throw null;
        }
        if (kv5Var != null) {
            im2.a(11);
            throw null;
        }
        if (zBooleanValue2) {
            i7 = b2 << fm2Var.b;
        } else {
            i7 = 0;
        }
        number = (kv5Var.getNumber() << gm2Var2.b) | i7 | (ow5Var.getNumber() << gm2Var.b);
        fm2Var2 = im2.K;
        fm2Var2.getClass();
        fm2Var3 = im2.L;
        fm2Var3.getClass();
        fm2Var4 = im2.M;
        fm2Var4.getClass();
        ol5Var = s67.h;
        if (zBooleanValue) {
            if ((qv5Var.f1871o & 256) == 256) {
                i9 = qv5Var.B;
            } else {
                i9 = number;
            }
            zBooleanValue6 = fm2Var2.i(i9).booleanValue();
            zBooleanValue7 = fm2Var3.i(i9).booleanValue();
            zBooleanValue8 = fm2Var4.i(i9).booleanValue();
            upVarB2 = vo4Var.b(qv5Var, i9, 3);
            if (zBooleanValue6) {
                th = null;
                fm2Var5 = fm2Var2;
                eu5VarJ = new eu5(cq1Var, upVarB2, xz2.B0((kv5) gm2Var2.i(i9)), vt1.q((ow5) gm2Var.i(i9)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, cq1Var.k(), null, ol5Var);
            } else {
                fm2Var5 = fm2Var2;
                th = null;
                eu5VarJ = io1.J(cq1Var, upVarB2);
            }
            eu5Var = eu5VarJ;
            eu5Var.F0(cq1Var.getReturnType());
        } else {
            fp1Var = fp1Var;
            fp1VarA = fp1VarA;
            th = null;
            fm2Var5 = fm2Var2;
            fm2Var3 = fm2Var3;
            gm2Var = gm2Var;
            fm2Var4 = fm2Var4;
            gm2Var2 = gm2Var2;
            i2 = i2;
            eu5Var = null;
        }
        if (im2.A.i(i2).booleanValue()) {
            if ((qv5Var.f1871o & 512) == 512) {
                i8 = qv5Var.C;
            } else {
                i8 = number;
            }
            zBooleanValue3 = fm2Var5.i(i8).booleanValue();
            zBooleanValue4 = fm2Var3.i(i8).booleanValue();
            zBooleanValue5 = fm2Var4.i(i8).booleanValue();
            vo4Var2 = this;
            upVarB = vo4Var2.b(qv5Var, i8, 4);
            if (zBooleanValue3) {
                ju5Var = new ju5(cq1Var, upVarB, xz2.B0((kv5) gm2Var2.i(i8)), vt1.q((ow5) gm2Var.i(i8)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, cq1Var.k(), null, ol5Var);
                fp1 fp1Var4 = fp1VarA;
                qb8Var = (qb8) lv0.F0(((vo4) fp1Var4.a(ju5Var, ea2.m, (ty4) fp1Var4.b, (d22) fp1Var4.d, (ed8) fp1Var4.e, (h60) fp1Var4.f).i).g(qf0.K(qv5Var.A), qv5Var, 4));
                if (qb8Var != null) {
                    ju5.z(6);
                    throw th;
                }
                ju5Var.y = qb8Var;
                K = ju5Var;
            } else {
                K = io1.K(cq1Var, upVarB);
            }
        } else {
            vo4Var2 = this;
            K = th;
        }
        if (im2.D.i(i2).booleanValue()) {
            cq1Var.I0(th, new ro4(vo4Var2, qv5Var, cq1Var, (byte) 0));
        }
        fi1Var2 = (fi1) fp1Var.c;
        if (fi1Var2 instanceof ns4) {
            ns4Var2 = (ns4) fi1Var2;
        } else {
            ns4Var2 = null;
        }
        if (ns4Var2 != null) {
            ms0VarI0 = ns4Var2.i0();
        } else {
            ms0VarI0 = null;
        }
        if (ms0VarI0 == ms0.q) {
            z = true;
            cq1Var.I0(null, new ro4(vo4Var2, qv5Var, cq1Var, true ? 1 : 0));
        } else {
            z = true;
        }
        cq1Var.H0(eu5Var, K, new xi2(vo4Var2.c(qv5Var, false)), new xi2(vo4Var2.c(qv5Var, z)));
        return cq1Var;
    }

    public final List g(List list, t1 t1Var, int i) {
        int i2;
        up s45Var;
        vo4 vo4Var = this;
        fp1 fp1Var = vo4Var.a;
        d22 d22Var = (d22) fp1Var.d;
        q48 q48Var = (q48) fp1Var.h;
        fi1 fi1Var = (fi1) fp1Var.c;
        fi1Var.getClass();
        xi0 xi0Var = (xi0) fi1Var;
        fi1 fi1VarI = xi0Var.i();
        fi1VarI.getClass();
        sx3 sx3VarA = vo4Var.a(fi1VarI);
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            oz3 oz3VarG = null;
            if (i3 < 0) {
                qf0.U();
                throw null;
            }
            iw5 iw5Var = (iw5) obj;
            int i5 = (iw5Var.f1111o & 1) == 1 ? iw5Var.p : 0;
            if (sx3VarA == null || !im2.c.i(i5).booleanValue()) {
                i2 = i3;
                s45Var = yl7.p;
            } else {
                i2 = i3;
                s45Var = new s45((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, new uo4(vo4Var, sx3VarA, t1Var, i, i2, iw5Var));
            }
            sy4 sy4VarC = et1.C((ty4) fp1Var.b, iw5Var.q);
            oz3 oz3VarG2 = q48Var.g(zu1.U(iw5Var, d22Var));
            boolean zBooleanValue = im2.H.i(i5).booleanValue();
            boolean zBooleanValue2 = im2.I.i(i5).booleanValue();
            boolean zBooleanValue3 = im2.J.i(i5).booleanValue();
            int i6 = iw5Var.f1111o;
            aw5 aw5VarA = (i6 & 16) == 16 ? iw5Var.t : (i6 & 32) == 32 ? d22Var.a(iw5Var.u) : null;
            if (aw5VarA != null) {
                oz3VarG = q48Var.g(aw5VarA);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new qb8(xi0Var, null, i2, s45Var, sy4VarC, oz3VarG2, zBooleanValue, zBooleanValue2, zBooleanValue3, oz3VarG, s67.h));
            arrayList = arrayList2;
            i3 = i4;
            vo4Var = this;
        }
        return lv0.P0(arrayList);
    }
}
