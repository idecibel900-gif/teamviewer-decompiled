package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q48 {
    public final fp1 a;
    public final q48 b;
    public final String c;
    public final String d;
    public final h50 e;
    public final h50 f;
    public final Map g;

    /* JADX WARN: Multi-variable type inference failed */
    public q48(fp1 fp1Var, q48 q48Var, List list, String str, String str2) {
        Map linkedHashMap;
        list.getClass();
        this.a = fp1Var;
        this.b = q48Var;
        this.c = str;
        this.d = str2;
        xd4 xd4Var = (xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a;
        int i = 0;
        this.e = xd4Var.c(new n48(this, 0 == true ? 1 : 0));
        this.f = xd4Var.c(new n48(this, (byte) 1));
        if (list.isEmpty()) {
            linkedHashMap = fa2.m;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fw5 fw5Var = (fw5) it.next();
                linkedHashMap.put(Integer.valueOf(fw5Var.p), new fq1(this.a, fw5Var, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static g07 a(g07 g07Var, oz3 oz3Var) {
        wy3 wy3VarM = n37.m(g07Var);
        up annotations = g07Var.getAnnotations();
        oz3 oz3VarN = wo1.N(g07Var);
        List listG = wo1.G(g07Var);
        List listK0 = lv0.k0(wo1.O(g07Var));
        ArrayList arrayList = new ArrayList(mv0.Z(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(((h58) it.next()).b());
        }
        return wo1.B(wy3VarM, annotations, oz3VarN, listG, arrayList, oz3Var, true).s0(g07Var.p0());
    }

    public static final ArrayList e(aw5 aw5Var, q48 q48Var) {
        aw5 aw5VarA;
        List list = aw5Var.p;
        list.getClass();
        d22 d22Var = (d22) q48Var.a.d;
        int i = aw5Var.f368o;
        if ((i & 256) == 256) {
            aw5VarA = aw5Var.y;
        } else {
            aw5VarA = (i & 512) == 512 ? d22Var.a(aw5Var.z) : null;
        }
        Iterable iterableE = aw5VarA != null ? e(aw5VarA, q48Var) : null;
        if (iterableE == null) {
            iterableE = ea2.m;
        }
        return lv0.A0(list, iterableE);
    }

    public static g48 f(List list, up upVar) {
        g48 g48VarN;
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((wl1) it.next()).getClass();
            if (upVar.isEmpty()) {
                g48.n.getClass();
                g48VarN = g48.f858o;
            } else {
                lh7 lh7Var = g48.n;
                List listK = qf0.K(new xp(upVar));
                lh7Var.getClass();
                g48VarN = lh7.n(listK);
            }
            arrayList.add(g48VarN);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qv0.c0(arrayList2, (Iterable) it2.next());
        }
        g48.n.getClass();
        return lh7.n(arrayList2);
    }

    public static final ns4 h(q48 q48Var, aw5 aw5Var, int i) {
        fp1 fp1Var = q48Var.a;
        js0 js0VarY = et1.y((ty4) fp1Var.b, i);
        ArrayList arrayListM0 = bq6.m0(new h18(bq6.h0(aw5Var, new n48(q48Var, (byte) 2)), o48.n));
        Iterator it = bq6.h0(js0VarY, p48.m).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        while (arrayListM0.size() < i2) {
            arrayListM0.add(0);
        }
        return ((j93) ((io.sentry.android.replay.screenshot.k) fp1Var.a).l).P(js0VarY, arrayListM0);
    }

    public final List b() {
        return lv0.P0(this.g.values());
    }

    public final d58 c(int i) {
        d58 d58Var = (d58) this.g.get(Integer.valueOf(i));
        if (d58Var != null) {
            return d58Var;
        }
        q48 q48Var = this.b;
        if (q48Var != null) {
            return q48Var.c(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:121:0x0305  */
    /* JADX WARN: Code duplicated, block: B:128:0x0322  */
    /* JADX WARN: Code duplicated, block: B:129:0x0327  */
    /* JADX WARN: Code duplicated, block: B:132:0x0333  */
    /* JADX WARN: Code duplicated, block: B:139:0x0359  */
    /* JADX WARN: Code duplicated, block: B:140:0x035c  */
    /* JADX WARN: Code duplicated, block: B:142:0x035f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0364  */
    /* JADX WARN: Code duplicated, block: B:146:0x036d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0372  */
    /* JADX WARN: Code duplicated, block: B:149:0x0378  */
    /* JADX WARN: Code duplicated, block: B:150:0x0385  */
    /* JADX WARN: Code duplicated, block: B:151:0x0388  */
    /* JADX WARN: Code duplicated, block: B:153:0x039a  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:163:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:170:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:49:0x0167  */
    /* JADX WARN: Code duplicated, block: B:51:0x016f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0188  */
    /* JADX WARN: Code duplicated, block: B:55:0x0196  */
    /* JADX WARN: Code duplicated, block: B:57:0x019d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ed  */
    public final g07 d(aw5 aw5Var, boolean z) {
        k48 k48VarD;
        ys0 ys0VarH;
        Object next;
        int i;
        g48 g48VarF;
        ArrayList arrayList;
        int i2;
        List listP0;
        boolean zBooleanValue;
        boolean z2;
        g07 g07VarP;
        lm1 lm1VarL;
        int size;
        g07 g07VarP2;
        ys0 ys0VarA;
        hx2 hx2VarH;
        h58 h58Var;
        oz3 oz3VarB;
        ys0 ys0VarA2;
        ht2 ht2VarG;
        oz3 oz3VarB2;
        xi0 xi0Var;
        ht2 ht2VarC;
        int size2;
        int i3;
        aw5 aw5VarA;
        int i4;
        yv5 yv5Var;
        d58 d58Var;
        xv5 xv5Var;
        int iOrdinal;
        ub8 ub8Var;
        int i5;
        aw5 aw5VarA2;
        Object w87Var;
        Object w87Var2;
        fp1 fp1Var = this.a;
        d22 d22Var = (d22) fp1Var.d;
        fi1 fi1Var = (fi1) fp1Var.c;
        io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1Var.a;
        aw5Var.getClass();
        int i6 = aw5Var.f368o;
        if ((i6 & 16) == 16) {
            if (et1.y((ty4) fp1Var.b, aw5Var.u).c) {
                ((jk0) ((io.sentry.android.replay.screenshot.k) fp1Var.a).g).getClass();
            }
        } else if ((i6 & 128) == 128) {
            if (et1.y((ty4) fp1Var.b, aw5Var.x).c) {
                ((jk0) ((io.sentry.android.replay.screenshot.k) fp1Var.a).g).getClass();
            }
        }
        int i7 = aw5Var.f368o;
        boolean z3 = false;
        if ((i7 & 16) != 16) {
            if ((i7 & 32) == 32) {
                ys0VarH = c(aw5Var.v);
                if (ys0VarH == null) {
                    hd2 hd2Var = hd2.a;
                    k48VarD = hd2.d(gd2.A, String.valueOf(aw5Var.v), this.d);
                }
            } else if ((i7 & 64) == 64) {
                String string = ((ty4) fp1Var.b).getString(aw5Var.w);
                Iterator it = b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!im3.n(((d58) next).getName().b(), string));
                d58 d58Var2 = (d58) next;
                if (d58Var2 == null) {
                    hd2 hd2Var2 = hd2.a;
                    k48VarD = hd2.d(gd2.B, string, fi1Var.toString());
                } else {
                    ys0VarH = d58Var2;
                }
            } else if ((i7 & 128) == 128) {
                ys0VarH = (ys0) this.f.invoke(Integer.valueOf(aw5Var.x));
                if (ys0VarH == null) {
                    ys0VarH = h(this, aw5Var, aw5Var.x);
                }
            } else {
                hd2 hd2Var3 = hd2.a;
                k48VarD = hd2.d(gd2.D, new String[0]);
            }
            i = 1;
            if (hd2.f(k48VarD.a())) {
                hd2 hd2Var4 = hd2.a;
                return hd2.e(gd2.I, ea2.m, k48VarD, (String[]) Arrays.copyOf(new String[]{k48VarD.toString()}, 1));
            }
            gp1 gp1Var = new gp1((xd4) kVar.a, new e3((byte) 22, this, aw5Var, z3));
            g48VarF = f((List) kVar.r, gp1Var);
            ArrayList arrayListE = e(aw5Var, this);
            arrayList = new ArrayList(mv0.Z(arrayListE, 10));
            i2 = 0;
            for (Object obj : arrayListE) {
                i4 = i2 + 1;
                if (i2 >= 0) {
                    qf0.U();
                    throw null;
                }
                yv5Var = (yv5) obj;
                List parameters = k48VarD.getParameters();
                parameters.getClass();
                d58Var = (d58) lv0.p0(i2, parameters);
                xv5Var = yv5Var.f2647o;
                if (xv5Var == xv5.STAR) {
                    xv5Var.getClass();
                    iOrdinal = xv5Var.ordinal();
                    if (iOrdinal != 0) {
                        ub8Var = ub8.p;
                    } else if (iOrdinal != i) {
                        ub8Var = ub8.q;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                gk0.s();
                                return null;
                            }
                            an4.i(xv5Var, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        ub8Var = ub8.f2197o;
                    }
                    i5 = yv5Var.n;
                    if ((i5 & 2) == 2) {
                        aw5VarA2 = yv5Var.p;
                    } else if ((i5 & 4) == 4) {
                        aw5VarA2 = d22Var.a(yv5Var.q);
                    } else {
                        aw5VarA2 = null;
                    }
                    if (aw5VarA2 == null) {
                        w87Var2 = new w87(hd2.c(gd2.N, yv5Var.toString()));
                    } else {
                        w87Var = new w87(g(aw5VarA2), ub8Var);
                        w87Var2 = w87Var;
                    }
                } else if (d58Var == null) {
                    w87Var2 = new u87(((ps4) kVar.b).h());
                } else {
                    w87Var = new w87(d58Var);
                    w87Var2 = w87Var;
                }
                arrayList.add(w87Var2);
                i2 = i4;
                i = 1;
            }
            Object obj2 = null;
            listP0 = lv0.P0(arrayList);
            ys0 ys0VarA3 = k48VarD.a();
            if (z || !(ys0VarA3 instanceof eq1)) {
                zBooleanValue = im2.a.i(aw5Var.C).booleanValue();
                z2 = aw5Var.q;
                if (zBooleanValue) {
                    size = k48VarD.getParameters().size() - listP0.size();
                    if (size == 0) {
                        g07VarP2 = bt1.P(listP0, g48VarF, k48VarD, z2);
                        ys0VarA = g07VarP2.o0().a();
                        if (ys0VarA != null) {
                            hx2VarH = wo1.H(ys0VarA);
                        } else {
                            hx2VarH = null;
                        }
                        if (im3.n(hx2VarH, dx2.c) || (h58Var = (h58) lv0.w0(wo1.O(g07VarP2))) == null || (oz3VarB = h58Var.b()) == null) {
                            g07VarP2 = null;
                        } else {
                            ys0VarA2 = oz3VarB.o0().a();
                            if (ys0VarA2 != null) {
                                ht2VarG = bp1.g(ys0VarA2);
                            } else {
                                ht2VarG = null;
                            }
                            if (oz3VarB.m0().size() == 1 && (im3.n(ht2VarG, t87.g) || im3.n(ht2VarG, r48.a))) {
                                oz3VarB2 = ((h58) lv0.F0(oz3VarB.m0())).b();
                                oz3VarB2.getClass();
                                if (fi1Var instanceof xi0) {
                                    xi0Var = (xi0) fi1Var;
                                } else {
                                    xi0Var = null;
                                }
                                if (xi0Var != null) {
                                    ht2VarC = bp1.c(xi0Var);
                                } else {
                                    ht2VarC = null;
                                }
                                if (im3.n(ht2VarC, mg7.a)) {
                                    g07VarP2 = a(g07VarP2, oz3VarB2);
                                } else {
                                    g07VarP2 = a(g07VarP2, oz3VarB2);
                                }
                            }
                        }
                    } else if (size != 1 && (size2 = listP0.size() - 1) >= 0) {
                        k48 k48VarQ = k48VarD.h().v(size2).q();
                        k48VarQ.getClass();
                        g07VarP2 = bt1.P(listP0, g48VarF, k48VarQ, z2);
                    } else {
                        g07VarP2 = null;
                    }
                    if (g07VarP2 == null) {
                        hd2 hd2Var5 = hd2.a;
                        g07VarP = hd2.e(gd2.C, listP0, k48VarD, new String[0]);
                    } else {
                        g07VarP = g07VarP2;
                    }
                } else {
                    g07VarP = bt1.P(listP0, g48VarF, k48VarD, z2);
                    if (im2.b.i(aw5Var.C).booleanValue()) {
                        lm1VarL = cr.l(g07VarP, true);
                        if (lm1VarL == null) {
                            an4.r(g07VarP, "null DefinitelyNotNullType for '");
                            return null;
                        }
                        g07VarP = lm1VarL;
                    }
                }
            } else {
                eq1 eq1Var = (eq1) ys0VarA3;
                wj5 wj5Var = new wj5((byte) 15);
                List parameters2 = eq1Var.t.getParameters();
                ArrayList arrayList2 = new ArrayList(mv0.Z(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((d58) it2.next()).a());
                }
                pn5 pn5Var = new pn5(obj2, eq1Var, listP0, xm4.U(lv0.V0(arrayList2, listP0)));
                g48.n.getClass();
                g48 g48Var = g48.f858o;
                g48Var.getClass();
                g07 g07VarG = wj5Var.g(pn5Var, g48Var, false, 0, true);
                List list = (List) kVar.r;
                ArrayList arrayListY0 = lv0.y0(gp1Var, g07VarG.getAnnotations());
                g07VarP = g07VarG.s0(p58.e(g07VarG) || aw5Var.q).u0(f(list, arrayListY0.isEmpty() ? yl7.p : new wp(arrayListY0, (byte) 0)));
            }
            i3 = aw5Var.f368o;
            if ((i3 & 1024) == 1024) {
                aw5VarA = aw5Var.A;
            } else if ((i3 & 2048) == 2048) {
                aw5VarA = d22Var.a(aw5Var.B);
            } else {
                aw5VarA = null;
            }
            if (aw5VarA != null) {
                return x37.t(g07VarP, d(aw5VarA, false));
            }
            return g07VarP;
        }
        ys0VarH = (ys0) this.e.invoke(Integer.valueOf(aw5Var.u));
        if (ys0VarH == null) {
            ys0VarH = h(this, aw5Var, aw5Var.u);
        }
        k48VarD = ys0VarH.q();
        k48VarD.getClass();
        i = 1;
        if (hd2.f(k48VarD.a())) {
            hd2 hd2Var6 = hd2.a;
            return hd2.e(gd2.I, ea2.m, k48VarD, (String[]) Arrays.copyOf(new String[]{k48VarD.toString()}, 1));
        }
        gp1 gp1Var2 = new gp1((xd4) kVar.a, new e3((byte) 22, this, aw5Var, z3));
        g48VarF = f((List) kVar.r, gp1Var2);
        ArrayList arrayListE2 = e(aw5Var, this);
        arrayList = new ArrayList(mv0.Z(arrayListE2, 10));
        i2 = 0;
        while (r9.hasNext()) {
            i4 = i2 + 1;
            if (i2 >= 0) {
                qf0.U();
                throw null;
            }
            yv5Var = (yv5) obj;
            List parameters3 = k48VarD.getParameters();
            parameters3.getClass();
            d58Var = (d58) lv0.p0(i2, parameters3);
            xv5Var = yv5Var.f2647o;
            if (xv5Var == xv5.STAR) {
                xv5Var.getClass();
                iOrdinal = xv5Var.ordinal();
                if (iOrdinal != 0) {
                    ub8Var = ub8.p;
                } else if (iOrdinal != i) {
                    ub8Var = ub8.q;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            gk0.s();
                            return null;
                        }
                        an4.i(xv5Var, "Only IN, OUT and INV are supported. Actual argument: ");
                        return null;
                    }
                    ub8Var = ub8.f2197o;
                }
                i5 = yv5Var.n;
                if ((i5 & 2) == 2) {
                    aw5VarA2 = yv5Var.p;
                } else if ((i5 & 4) == 4) {
                    aw5VarA2 = d22Var.a(yv5Var.q);
                } else {
                    aw5VarA2 = null;
                }
                if (aw5VarA2 == null) {
                    w87Var2 = new w87(hd2.c(gd2.N, yv5Var.toString()));
                } else {
                    w87Var = new w87(g(aw5VarA2), ub8Var);
                    w87Var2 = w87Var;
                }
            } else if (d58Var == null) {
                w87Var2 = new u87(((ps4) kVar.b).h());
            } else {
                w87Var = new w87(d58Var);
                w87Var2 = w87Var;
            }
            arrayList.add(w87Var2);
            i2 = i4;
            i = 1;
        }
        Object obj3 = null;
        listP0 = lv0.P0(arrayList);
        ys0 ys0VarA4 = k48VarD.a();
        if (z) {
            zBooleanValue = im2.a.i(aw5Var.C).booleanValue();
            z2 = aw5Var.q;
            if (zBooleanValue) {
                size = k48VarD.getParameters().size() - listP0.size();
                if (size == 0) {
                    g07VarP2 = bt1.P(listP0, g48VarF, k48VarD, z2);
                    ys0VarA = g07VarP2.o0().a();
                    if (ys0VarA != null) {
                        hx2VarH = wo1.H(ys0VarA);
                    } else {
                        hx2VarH = null;
                    }
                    if (im3.n(hx2VarH, dx2.c)) {
                        g07VarP2 = null;
                    } else {
                        ys0VarA2 = oz3VarB.o0().a();
                        if (ys0VarA2 != null) {
                            ht2VarG = bp1.g(ys0VarA2);
                        } else {
                            ht2VarG = null;
                        }
                        if (oz3VarB.m0().size() == 1) {
                            oz3VarB2 = ((h58) lv0.F0(oz3VarB.m0())).b();
                            oz3VarB2.getClass();
                            if (fi1Var instanceof xi0) {
                                xi0Var = (xi0) fi1Var;
                            } else {
                                xi0Var = null;
                            }
                            if (xi0Var != null) {
                                ht2VarC = bp1.c(xi0Var);
                            } else {
                                ht2VarC = null;
                            }
                            if (im3.n(ht2VarC, mg7.a)) {
                                g07VarP2 = a(g07VarP2, oz3VarB2);
                            } else {
                                g07VarP2 = a(g07VarP2, oz3VarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    g07VarP2 = null;
                } else {
                    k48 k48VarQ2 = k48VarD.h().v(size2).q();
                    k48VarQ2.getClass();
                    g07VarP2 = bt1.P(listP0, g48VarF, k48VarQ2, z2);
                }
                if (g07VarP2 == null) {
                    hd2 hd2Var7 = hd2.a;
                    g07VarP = hd2.e(gd2.C, listP0, k48VarD, new String[0]);
                } else {
                    g07VarP = g07VarP2;
                }
            } else {
                g07VarP = bt1.P(listP0, g48VarF, k48VarD, z2);
                if (im2.b.i(aw5Var.C).booleanValue()) {
                    lm1VarL = cr.l(g07VarP, true);
                    if (lm1VarL == null) {
                        an4.r(g07VarP, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    g07VarP = lm1VarL;
                }
            }
        } else {
            zBooleanValue = im2.a.i(aw5Var.C).booleanValue();
            z2 = aw5Var.q;
            if (zBooleanValue) {
                size = k48VarD.getParameters().size() - listP0.size();
                if (size == 0) {
                    g07VarP2 = bt1.P(listP0, g48VarF, k48VarD, z2);
                    ys0VarA = g07VarP2.o0().a();
                    if (ys0VarA != null) {
                        hx2VarH = wo1.H(ys0VarA);
                    } else {
                        hx2VarH = null;
                    }
                    if (im3.n(hx2VarH, dx2.c)) {
                        g07VarP2 = null;
                    } else {
                        ys0VarA2 = oz3VarB.o0().a();
                        if (ys0VarA2 != null) {
                            ht2VarG = bp1.g(ys0VarA2);
                        } else {
                            ht2VarG = null;
                        }
                        if (oz3VarB.m0().size() == 1) {
                            oz3VarB2 = ((h58) lv0.F0(oz3VarB.m0())).b();
                            oz3VarB2.getClass();
                            if (fi1Var instanceof xi0) {
                                xi0Var = (xi0) fi1Var;
                            } else {
                                xi0Var = null;
                            }
                            if (xi0Var != null) {
                                ht2VarC = bp1.c(xi0Var);
                            } else {
                                ht2VarC = null;
                            }
                            if (im3.n(ht2VarC, mg7.a)) {
                                g07VarP2 = a(g07VarP2, oz3VarB2);
                            } else {
                                g07VarP2 = a(g07VarP2, oz3VarB2);
                            }
                        }
                    }
                } else if (size != 1) {
                    g07VarP2 = null;
                } else {
                    k48 k48VarQ3 = k48VarD.h().v(size2).q();
                    k48VarQ3.getClass();
                    g07VarP2 = bt1.P(listP0, g48VarF, k48VarQ3, z2);
                }
                if (g07VarP2 == null) {
                    hd2 hd2Var8 = hd2.a;
                    g07VarP = hd2.e(gd2.C, listP0, k48VarD, new String[0]);
                } else {
                    g07VarP = g07VarP2;
                }
            } else {
                g07VarP = bt1.P(listP0, g48VarF, k48VarD, z2);
                if (im2.b.i(aw5Var.C).booleanValue()) {
                    lm1VarL = cr.l(g07VarP, true);
                    if (lm1VarL == null) {
                        an4.r(g07VarP, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    g07VarP = lm1VarL;
                }
            }
        }
        i3 = aw5Var.f368o;
        if ((i3 & 1024) == 1024) {
            aw5VarA = aw5Var.A;
        } else if ((i3 & 2048) == 2048) {
            aw5VarA = d22Var.a(aw5Var.B);
        } else {
            aw5VarA = null;
        }
        if (aw5VarA != null) {
            return x37.t(g07VarP, d(aw5VarA, false));
        }
        return g07VarP;
    }

    public final oz3 g(aw5 aw5Var) {
        aw5 aw5VarA;
        aw5Var.getClass();
        if ((aw5Var.f368o & 2) != 2) {
            return d(aw5Var, true);
        }
        fp1 fp1Var = this.a;
        String string = ((ty4) fp1Var.b).getString(aw5Var.r);
        g07 g07VarD = d(aw5Var, true);
        d22 d22Var = (d22) fp1Var.d;
        int i = aw5Var.f368o;
        if ((i & 4) == 4) {
            aw5VarA = aw5Var.s;
        } else {
            aw5VarA = (i & 8) == 8 ? d22Var.a(aw5Var.t) : null;
        }
        aw5VarA.getClass();
        return ((vm2) ((io.sentry.android.replay.screenshot.k) fp1Var.a).j).f(aw5Var, string, g07VarD, d(aw5VarA, true));
    }

    public final String toString() {
        q48 q48Var = this.b;
        return this.c.concat(q48Var == null ? "" : ". Child of ".concat(q48Var.c));
    }
}
