package o;

import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntryType;
import com.teamviewer.apidefinitions.manageddevices.models.DevicePoolType;
import com.teamviewer.apidefinitions.manageddevices.models.SortingOrder;
import com.teamviewer.apidefinitions.manageddevices.models.SortingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j23 {
    public static final s13 D = new s13();
    public n87 A;
    public long B;
    public long C;
    public final hl4 a;
    public final nx3 b;
    public final gu0 c;
    public final fe1 d;
    public final l97 e;
    public final t36 f;
    public final l97 g;
    public final t36 h;
    public final l97 i;
    public final t36 j;
    public final l97 k;
    public final t36 l;
    public final l97 m;
    public final t36 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l97 f1123o;
    public final t36 p;
    public final l97 q;
    public final l97 r;
    public final l97 s;
    public r13 t;
    public y13 u;
    public iw7 v;
    public iw7 w;
    public iw7 x;
    public n87 y;
    public n87 z;

    /* JADX WARN: Multi-variable type inference failed */
    public j23(hl4 hl4Var, nx3 nx3Var, gu0 gu0Var, fe1 fe1Var) {
        this.a = hl4Var;
        this.b = nx3Var;
        this.c = gu0Var;
        this.d = fe1Var;
        ea2 ea2Var = ea2.m;
        l97 l97VarK = im3.k(ea2Var);
        this.e = l97VarK;
        this.f = yo1.u(l97VarK);
        l97 l97VarK2 = im3.k(ea2Var);
        this.g = l97VarK2;
        this.h = yo1.u(l97VarK2);
        l97 l97VarK3 = im3.k(ea2Var);
        this.i = l97VarK3;
        this.j = yo1.u(l97VarK3);
        Boolean bool = Boolean.FALSE;
        l97 l97VarK4 = im3.k(bool);
        this.k = l97VarK4;
        this.l = yo1.u(l97VarK4);
        l97 l97VarK5 = im3.k(bool);
        this.m = l97VarK5;
        this.n = yo1.u(l97VarK5);
        l97 l97VarK6 = im3.k(bool);
        this.f1123o = l97VarK6;
        this.p = yo1.u(l97VarK6);
        Boolean bool2 = Boolean.TRUE;
        this.q = im3.k(bool2);
        this.r = im3.k(bool2);
        this.s = im3.k(bool2);
        r13 r13Var = new r13(null, null, m13.f1425o);
        this.t = r13Var;
        this.u = new y13(r13Var, "");
        this.v = new iw7(fe1Var, gu0Var, 200, new b23(this, this.t, (hc1) null), null);
        this.w = new iw7(fe1Var, gu0Var, 200, new a23(this.t, this, null, (byte) 0), null);
        this.x = new iw7(fe1Var, gu0Var, 200, new b23(this.u, this, (hc1) null), new jb(0 == true ? 1 : 0, (byte) 3));
        a(this.v);
        iw7 iw7Var = this.w;
        this.z = b(iw7Var, new o13(this, iw7Var, (byte) 1), new p13(this, (byte) 3), new p13(this, (byte) 4), new p13(this, (byte) 5));
        c(this.x);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    public static DeviceFilteringModel e(j23 j23Var, r13 r13Var, List list, String str, int i) {
        List listK;
        SortingOrder sortingOrder;
        SortingType sortingType;
        List list2 = (i & 2) != 0 ? null : list;
        int i2 = (i & 4) != 0 ? 200 : 1;
        String str2 = (i & 8) != 0 ? null : str;
        k33 k33Var = r13Var.a;
        m13 m13Var = r13Var.c;
        if (k33Var == null) {
            listK = null;
        } else if (k33Var instanceof j33) {
            listK = qf0.K(((j33) k33Var).m);
        } else if (k33Var instanceof h33) {
            listK = r13Var.b;
        } else {
            listK = null;
        }
        DevicePoolType devicePoolType = r13Var.a instanceof h33 ? DevicePoolType.Combined : DevicePoolType.Grouped;
        List listK2 = qf0.K(DeviceListEntryType.Managed);
        int iOrdinal = m13Var.ordinal();
        if (iOrdinal == 0) {
            sortingOrder = SortingOrder.Ascending;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    sortingOrder = SortingOrder.Ascending;
                } else if (iOrdinal != 3) {
                    gk0.s();
                    return null;
                }
            }
            sortingOrder = SortingOrder.Descending;
        }
        int iOrdinal2 = m13Var.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            sortingType = SortingType.Name;
        } else {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                gk0.s();
                return null;
            }
            sortingType = SortingType.OnlineStatus;
        }
        return new DeviceFilteringModel(devicePoolType, listK, list2, sortingType, sortingOrder, str2, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i2), null, null, null, null, null, listK2, null, 25034688, null);
    }

    public static boolean j(iw7 iw7Var) {
        if (((Boolean) iw7Var.i.m.getValue()).booleanValue() || !((Boolean) iw7Var.k.m.getValue()).booleanValue()) {
            return false;
        }
        iw7Var.a(new ew1(1, D, s13.class, "distinctDevices", "distinctDevices(Ljava/util/List;)Ljava/util/List;", 0, (byte) 17));
        return true;
    }

    public final void a(iw7 iw7Var) {
        this.y = b(iw7Var, new o13(this, iw7Var, (byte) 0), new p13(this, (byte) 0), new p13(this, (byte) 1), new p13(this, (byte) 2));
    }

    public final n87 b(iw7 iw7Var, Function0 function0, Function1 function1, Function1 function2, Function1 function3) {
        return im3.R(this.c, this.d, null, new aj(iw7Var, function0, function1, function2, function3, null, (byte) 6), 2);
    }

    public final void c(iw7 iw7Var) {
        this.A = b(iw7Var, new o13(this, iw7Var, (byte) 2), new p13(this, (byte) 6), new p13(this, (byte) 7), new p13(this, (byte) 8));
    }

    public final List d(k33 k33Var) {
        if (k33Var != null) {
            if (k33Var instanceof i33) {
                return (List) this.g.getValue();
            }
            if (!(k33Var instanceof j33) && !(k33Var instanceof h33)) {
                gk0.s();
                return null;
            }
        }
        return (List) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(y13 y13Var, String str, jc1 jc1Var) {
        c23 c23Var;
        Object objT;
        Integer num;
        if (jc1Var instanceof c23) {
            c23Var = (c23) jc1Var;
            int i = c23Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23Var.p = i - Integer.MIN_VALUE;
            } else {
                c23Var = new c23(this, jc1Var);
            }
        } else {
            c23Var = new c23(this, jc1Var);
        }
        Object obj = c23Var.n;
        int i2 = c23Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            if (str != null) {
                return new hw7(ea2.m, null);
            }
            k33 k33Var = y13Var.a.a;
            i33 i33Var = k33Var instanceof i33 ? (i33) k33Var : null;
            Integer num2 = i33Var != null ? new Integer(i33Var.m) : null;
            String str2 = y13Var.b;
            c23Var.m = num2;
            c23Var.p = 1;
            objT = this.b.t(str2, null, c23Var);
            ne1 ne1Var = ne1.m;
            if (objT == ne1Var) {
                return ne1Var;
            }
            num = num2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num = c23Var.m;
            ct1.a0(obj);
            objT = ((tc6) obj).m;
        }
        if (objT instanceof sc6) {
            return objT;
        }
        List<Device> items = ((DeviceListResponse) objT).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            Device device = (Device) obj2;
            if (num == null || device.getGroupId() == num.intValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(et1.O((Device) it.next()));
        }
        return new hw7(arrayList2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, jc1 jc1Var) {
        d23 d23Var;
        Object objD;
        r13 r13Var;
        if (jc1Var instanceof d23) {
            d23Var = (d23) jc1Var;
            int i = d23Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                d23Var.p = i - Integer.MIN_VALUE;
            } else {
                d23Var = new d23(this, jc1Var);
            }
        } else {
            d23Var = new d23(this, jc1Var);
        }
        Object obj = d23Var.n;
        int i2 = d23Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            r13 r13Var2 = this.t;
            DeviceFilteringModel deviceFilteringModelE = e(this, r13Var2, qf0.K(String.valueOf(j)), null, 8);
            d23Var.m = r13Var2;
            d23Var.p = 1;
            objD = ((xl4) this.a).d(deviceFilteringModelE, d23Var);
            ne1 ne1Var = ne1.m;
            if (objD == ne1Var) {
                return ne1Var;
            }
            r13Var = r13Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r13Var = d23Var.m;
            ct1.a0(obj);
            objD = ((tc6) obj).m;
        }
        if (!im3.n(this.t, r13Var)) {
            return v13.a;
        }
        Throwable thA = tc6.a(objD);
        return thA == null ? new t13((DeviceListEntry) lv0.o0(((com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse) objD).getItems())) : new u13(thA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r10 == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r10 == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(o.y13 r11, java.lang.String r12, o.jc1 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof o.e23
            if (r0 == 0) goto L13
            r0 = r13
            o.e23 r0 = (o.e23) r0
            int r1 = r0.f671o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f671o = r1
            goto L18
        L13:
            o.e23 r0 = new o.e23
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.m
            int r1 = r0.f671o
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L25
            if (r1 != r3) goto L2d
        L25:
            o.ct1.a0(r13)
            o.tc6 r13 = (o.tc6) r13
            java.lang.Object r10 = r13.m
            goto L66
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r10)
            return r2
        L33:
            o.ct1.a0(r13)
            o.ne1 r13 = o.ne1.m
            o.hl4 r1 = r10.a
            if (r12 != 0) goto L50
            o.r13 r12 = r11.a
            java.lang.String r11 = r11.b
            r3 = 6
            com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel r10 = e(r10, r12, r2, r11, r3)
            r0.f671o = r4
            o.xl4 r1 = (o.xl4) r1
            java.lang.Object r10 = r1.d(r10, r0)
            if (r10 != r13) goto L66
            goto L65
        L50:
            com.teamviewer.apidefinitions.manageddevices.models.FilterPaginationModel r4 = new com.teamviewer.apidefinitions.manageddevices.models.FilterPaginationModel
            r8 = 4
            r9 = 0
            r6 = 200(0xc8, float:2.8E-43)
            r7 = 0
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f671o = r3
            o.xl4 r1 = (o.xl4) r1
            java.lang.Object r10 = r1.e(r4, r0)
            if (r10 != r13) goto L66
        L65:
            return r13
        L66:
            boolean r11 = r10 instanceof o.sc6
            if (r11 != 0) goto L9d
            com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse r10 = (com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse) r10
            java.util.List r11 = r10.getItems()
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = o.mv0.Z(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L93
            java.lang.Object r13 = r11.next()
            com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry r13 = (com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry) r13
            o.ns1 r13 = o.et1.P(r13)
            r12.add(r13)
            goto L7f
        L93:
            java.lang.String r10 = r10.getNextPaginationToken()
            o.hw7 r11 = new o.hw7
            r11.<init>(r12, r10)
            return r11
        L9d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j23.h(o.y13, java.lang.String, o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(jc1 jc1Var) {
        f23 f23Var;
        j23 j23Var;
        iw7 iw7Var;
        r13 r13Var;
        if (jc1Var instanceof f23) {
            f23Var = (f23) jc1Var;
            int i = f23Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                f23Var.q = i - Integer.MIN_VALUE;
            } else {
                f23Var = new f23(this, jc1Var);
            }
        } else {
            f23Var = new f23(this, jc1Var);
        }
        Object objL = f23Var.f762o;
        int i2 = f23Var.q;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        byte b = 1;
        if (i2 == 0) {
            ct1.a0(objL);
            iw7 iw7Var2 = this.w;
            r13 r13Var2 = this.t;
            j(iw7Var2);
            hc1 hc1Var = null;
            j23Var = this;
            yo2 yo2Var = new yo2(new jp2(iw7Var2.i, iw7Var2.k, new g91(3, hc1Var, (byte) 2), z ? (byte) 1 : (byte) 0), new g23(j23Var, iw7Var2, r13Var2, hc1Var, (byte) 0), b);
            g23 g23Var = new g23(j23Var, iw7Var2, r13Var2, hc1Var, (byte) 1);
            f23Var.m = iw7Var2;
            f23Var.n = r13Var2;
            f23Var.q = 1;
            objL = xo1.L(yo2Var, g23Var, f23Var);
            ne1 ne1Var = ne1.m;
            if (objL == ne1Var) {
                return ne1Var;
            }
            iw7Var = iw7Var2;
            r13Var = r13Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r13Var = f23Var.n;
            iw7Var = f23Var.m;
            ct1.a0(objL);
            j23Var = this;
        }
        vd5 vd5Var = (vd5) objL;
        boolean zBooleanValue = ((Boolean) vd5Var.m).booleanValue();
        boolean zBooleanValue2 = ((Boolean) vd5Var.n).booleanValue();
        if (j23Var.w == iw7Var && im3.n(j23Var.t, r13Var) && !zBooleanValue && !zBooleanValue2 && iw7Var.m.m.getValue() == null) {
            z = true;
        }
        if (z) {
            j23Var.g.k(iw7Var.g.m.getValue());
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(m13 m13Var, jc1 jc1Var) {
        i23 i23Var;
        r13 r13Var;
        iw7 iw7Var;
        if (jc1Var instanceof i23) {
            i23Var = (i23) jc1Var;
            int i = i23Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                i23Var.q = i - Integer.MIN_VALUE;
            } else {
                i23Var = new i23(this, jc1Var);
            }
        } else {
            i23Var = new i23(this, jc1Var);
        }
        Object obj = i23Var.f1028o;
        int i2 = i23Var.q;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(obj);
            r13 r13VarA = r13.a(this.t, m13Var);
            this.t = r13VarA;
            m(r13VarA);
            iw7 iw7Var2 = this.v;
            j(iw7Var2);
            t36 t36Var = iw7Var2.i;
            byte b = 2;
            h23 h23Var = new h23(b, hc1Var, b);
            i23Var.m = r13VarA;
            i23Var.n = iw7Var2;
            i23Var.q = 1;
            Object objL = xo1.L(t36Var, h23Var, i23Var);
            ne1 ne1Var = ne1.m;
            if (objL == ne1Var) {
                return ne1Var;
            }
            r13Var = r13VarA;
            iw7Var = iw7Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iw7Var = i23Var.n;
            r13Var = i23Var.m;
            ct1.a0(obj);
        }
        return Boolean.valueOf(this.v == iw7Var && im3.n(this.t, r13Var));
    }

    public final void l(r13 r13Var) {
        n87 n87Var = this.z;
        hc1 hc1Var = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.w = new iw7(this.d, this.c, 200, new a23(r13Var, this, hc1Var, (byte) 0), null);
        l97 l97Var = this.g;
        l97Var.getClass();
        l97Var.l(null, ea2.m);
        Boolean bool = Boolean.FALSE;
        l97 l97Var2 = this.m;
        l97Var2.getClass();
        l97Var2.l(null, bool);
        Boolean bool2 = Boolean.TRUE;
        l97 l97Var3 = this.r;
        l97Var3.getClass();
        l97Var3.l(null, bool2);
        iw7 iw7Var = this.w;
        this.z = b(iw7Var, new o13(this, iw7Var, (byte) 1), new p13(this, (byte) 3), new p13(this, (byte) 4), new p13(this, (byte) 5));
    }

    public final void m(r13 r13Var) {
        n87 n87Var = this.y;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.v = new iw7(this.d, this.c, 200, new b23(this, r13Var, (hc1) null), null);
        l97 l97Var = this.e;
        l97Var.getClass();
        l97Var.l(null, ea2.m);
        Boolean bool = Boolean.FALSE;
        l97 l97Var2 = this.k;
        l97Var2.getClass();
        l97Var2.l(null, bool);
        Boolean bool2 = Boolean.TRUE;
        l97 l97Var3 = this.q;
        l97Var3.getClass();
        l97Var3.l(null, bool2);
        a(this.v);
    }

    public final void n(y13 y13Var) {
        n87 n87Var = this.A;
        Function1 function1 = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.x = new iw7(this.d, this.c, 200, new b23(y13Var, this, (hc1) null), new jb(function1, (byte) 3));
        l97 l97Var = this.i;
        l97Var.getClass();
        l97Var.l(null, ea2.m);
        Boolean bool = Boolean.FALSE;
        l97 l97Var2 = this.f1123o;
        l97Var2.getClass();
        l97Var2.l(null, bool);
        Boolean bool2 = Boolean.TRUE;
        l97 l97Var3 = this.s;
        l97Var3.getClass();
        l97Var3.l(null, bool2);
        c(this.x);
    }

    public final void o(Function1 function1) {
        this.w.d(function1);
        l97 l97Var = this.g;
        l97Var.k(function1.invoke(l97Var.getValue()));
    }

    public final void p(Function1 function1) {
        this.v.d(function1);
        l97 l97Var = this.e;
        l97Var.k(function1.invoke(l97Var.getValue()));
    }

    public final void q(Function1 function1) {
        this.x.d(function1);
        l97 l97Var = this.i;
        l97Var.k(function1.invoke(l97Var.getValue()));
    }
}
