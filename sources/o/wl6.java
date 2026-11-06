package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class wl6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ bn6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bl6 f2428o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl6(bn6 bn6Var, bl6 bl6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = bn6Var;
        this.f2428o = bl6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        bl6 bl6Var = this.f2428o;
        bn6 bn6Var = this.n;
        switch (b) {
            case 0:
                return new wl6(bn6Var, bl6Var, hc1Var, (byte) 0);
            case 1:
                return new wl6(bn6Var, bl6Var, hc1Var, (byte) 1);
            default:
                return new wl6(bn6Var, bl6Var, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((wl6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((wl6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((wl6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[PHI: r3
      0x0105: PHI (r3v23 java.lang.String) = (r3v19 java.lang.String), (r3v24 java.lang.String) binds: [B:51:0x0114, B:45:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19, types: [o.ea2] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        bn6 bn6Var;
        z31 z31VarD1;
        String strValueOf;
        String str;
        byte b = this.m;
        f88 f88Var = f88.a;
        bl6 bl6Var = this.f2428o;
        switch (b) {
            case 0:
                ct1.a0(obj);
                List list = bl6Var.b;
                bn6 bn6Var2 = this.n;
                l97 l97Var = bn6Var2.u;
                list.getClass();
                ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(db8.G0((x46) it.next()));
                }
                List list2 = ((yl6) l97Var.getValue()).e;
                ArrayList arrayList3 = new ArrayList(mv0.Z(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(db8.G0((x46) it2.next()));
                }
                if (!arrayList2.equals(arrayList3)) {
                    while (true) {
                        Object value = l97Var.getValue();
                        yl6 yl6Var = (yl6) value;
                        yl6Var.getClass();
                        List list3 = list;
                        if (l97Var.j(value, yl6.a(yl6Var, null, null, null, false, list3, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097135))) {
                            String str2 = (String) bn6Var2.t.m.getValue();
                            List listB1 = bn6Var2.b1(str2);
                            yl6 yl6Var2 = (yl6) l97Var.getValue();
                            z31 z31VarD2 = ub7.b0(str2) ? null : bn6Var2.d1(str2, bn6.W0(bn6Var2, yl6Var2, listB1, null, null, 14), yl6Var2.b);
                            while (true) {
                                Object value2 = l97Var.getValue();
                                yl6 yl6Var3 = (yl6) value2;
                                yl6Var3.getClass();
                                z31 z31Var = z31VarD2;
                                if (l97Var.j(value2, yl6.a(yl6Var3, null, null, z31Var, bn6.c1(str2, z31VarD2), list3, null, listB1, null, null, null, null, false, null, false, false, false, null, null, false, 2097059))) {
                                    bn6Var2.h1();
                                } else {
                                    z31VarD2 = z31Var;
                                }
                            }
                        } else {
                            list = list3;
                        }
                    }
                }
                break;
            case 1:
                ct1.a0(obj);
                List list4 = bl6Var.c;
                bn6 bn6Var3 = this.n;
                l97 l97Var2 = bn6Var3.u;
                list4.getClass();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list4) {
                    if (!(((l33) obj2).a instanceof h33)) {
                        arrayList4.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList<l33> arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (hashSet.add(((l33) obj3).a)) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(mv0.Z(arrayList5, 10));
                for (l33 l33Var : arrayList5) {
                    UUID uuidB = bt1.B(l33Var);
                    Integer numA = bt1.A(l33Var);
                    b41 b41Var = uuidB != null ? b41.q : numA != null ? b41.r : b41.s;
                    String str3 = l33Var.b;
                    String str4 = str3 == null ? "" : str3;
                    ArrayList arrayListQ0 = cx.Q0(new String[]{uuidB != null ? uuidB.toString() : null, numA != null ? String.valueOf(numA.intValue()) : null});
                    if (uuidB == null || (strValueOf = uuidB.toString()) == null) {
                        strValueOf = numA != null ? String.valueOf(numA.intValue()) : null;
                        if (strValueOf == null) {
                            str = "";
                        } else {
                            str = strValueOf;
                        }
                    } else {
                        str = strValueOf;
                    }
                    arrayList6.add(new z31(str4, null, arrayListQ0, str, uuidB != null ? uuidB.toString() : null, null, null, null, null, b41Var, null, null, null, 7650));
                }
                List listJ0 = lv0.J0(arrayList6, new dj6((byte) 2));
                if (!listJ0.equals(((yl6) l97Var2.getValue()).f)) {
                    String str5 = (String) bn6Var3.t.m.getValue();
                    if (ub7.b0(str5)) {
                        arrayList = ea2.m;
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj4 : listJ0) {
                            if (ub7.Q(((z31) obj4).a, str5, true)) {
                                arrayList.add(obj4);
                            }
                        }
                    }
                    ?? r22 = arrayList;
                    yl6 yl6Var4 = (yl6) l97Var2.getValue();
                    if (ub7.b0(str5)) {
                        z31VarD1 = yl6Var4.c;
                        bn6Var = bn6Var3;
                    } else {
                        bn6Var = bn6Var3;
                        z31VarD1 = bn6Var.d1(str5, bn6.W0(bn6Var3, yl6Var4, null, null, r22, 7), yl6Var4.b);
                    }
                    z31 z31Var2 = z31VarD1;
                    while (true) {
                        Object value3 = l97Var2.getValue();
                        yl6 yl6Var5 = (yl6) value3;
                        yl6Var5.getClass();
                        List list5 = listJ0;
                        if (l97Var2.j(value3, yl6.a(yl6Var5, null, null, z31Var2, bn6.c1(str5, z31Var2), null, list5, null, null, null, r22, null, false, null, false, false, false, null, null, false, 2096595))) {
                            bn6Var.h1();
                        } else {
                            listJ0 = list5;
                        }
                    }
                }
                break;
            default:
                ct1.a0(obj);
                boolean z = bl6Var.a;
                bn6 bn6Var4 = this.n;
                l97 l97Var3 = bn6Var4.u;
                while (true) {
                    Object value4 = l97Var3.getValue();
                    yl6 yl6Var6 = (yl6) value4;
                    yl6Var6.getClass();
                    boolean z2 = z;
                    if (l97Var3.j(value4, yl6.a(yl6Var6, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, z2, 1048575))) {
                        bn6Var4.h1();
                    } else {
                        z = z2;
                    }
                    break;
                }
                break;
        }
        return f88Var;
    }
}
