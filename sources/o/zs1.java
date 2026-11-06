package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zs1 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ List n;

    public /* synthetic */ zs1(List list, byte b) {
        this.m = b;
        this.n = list;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:19:0x005b->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[LOOP:2: B:36:0x0096->B:47:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        String str;
        vd5 vd5Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        byte b = this.m;
        f88 f88Var = f88.a;
        List list = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qs7.b(jx0.f(list, ux2Var), androidx.compose.ui.platform.a.a(cs4.b, "TVTA-devicesScreen-deviceEditScreen-group-input-error"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 48, 0, 262140);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        hw2 hw2Var = (hw2) list.get(i);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yz0.c.getClass();
                        ez0 ez0Var = d82.s;
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(ez0Var);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                        hw2Var.invoke(ux2Var2, 0);
                        ux2Var2.p(true);
                    }
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    String str5 = (String) lv0.E0(list);
                    int iZ = ub7.Z(charSequence, str5, iIntValue3, false, 4);
                    if (iZ < 0) {
                        vd5Var = null;
                    } else {
                        vd5Var = new vd5(Integer.valueOf(iZ), str5);
                    }
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    yk3 yk3Var = new yk3(iIntValue3, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = yk3Var.f2422o;
                    int i3 = yk3Var.n;
                    if (z) {
                        if ((i2 <= 0 || iIntValue3 > i3) && (i2 >= 0 || i3 > iIntValue3)) {
                            vd5Var = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        vd5Var = new vd5(Integer.valueOf(iIntValue3), str3);
                                    } else if (iIntValue3 != i3) {
                                        iIntValue3 += i2;
                                    } else {
                                        vd5Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue3, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    vd5Var = new vd5(Integer.valueOf(iIntValue3), str3);
                                } else if (iIntValue3 != i3) {
                                    iIntValue3 += i2;
                                } else {
                                    vd5Var = null;
                                }
                            }
                        }
                    } else if ((i2 <= 0 || iIntValue3 > i3) && (i2 >= 0 || i3 > iIntValue3)) {
                        vd5Var = null;
                    } else {
                        int i4 = iIntValue3;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    vd5Var = new vd5(Integer.valueOf(i4), str);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                } else {
                                    vd5Var = null;
                                }
                            } while (!ub7.h0(str2, 0, charSequence, i4, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                vd5Var = new vd5(Integer.valueOf(i4), str);
                            } else if (i4 != i3) {
                                i4 += i2;
                            } else {
                                vd5Var = null;
                            }
                        }
                    }
                }
                if (vd5Var != null) {
                    return new vd5(vd5Var.m, Integer.valueOf(((String) vd5Var.n).length()));
                }
                return null;
        }
    }
}
