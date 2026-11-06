package o;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class lb2 {
    public static final String a = we4.i("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:101:0x022f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0235  */
    /* JADX WARN: Code duplicated, block: B:107:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:113:0x0311  */
    /* JADX WARN: Code duplicated, block: B:115:0x0315 A[LOOP:4: B:114:0x0313->B:115:0x0315, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0355 A[LOOP:5: B:117:0x034f->B:119:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0371  */
    /* JADX WARN: Code duplicated, block: B:122:0x0395  */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:95:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0311, please report this as an issue */
    public static boolean a(dm8 dm8Var) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr;
        boolean z4;
        WorkDatabase workDatabase;
        String[] strArr2;
        boolean z5;
        Iterator it;
        boolean z6;
        boolean z7;
        xm8 xm8Var;
        UUID uuid;
        boolean zA;
        cn8 cn8VarX;
        String string;
        Iterator it2;
        int i;
        int i2;
        dm8 dm8Var2 = dm8Var;
        HashSet hashSetB = dm8.b(dm8Var2);
        nm8 nm8Var = dm8Var2.a;
        List list = dm8Var2.d;
        String[] strArr3 = (String[]) hashSetB.toArray(new String[0]);
        String str = dm8Var2.b;
        gf2 gf2Var = dm8Var2.c;
        nm8Var.b.getClass();
        nm8Var.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = nm8Var.c;
        workDatabase2.getClass();
        boolean z8 = strArr3.length == 0;
        boolean z9 = !z8;
        lm8 lm8Var = lm8.f1384o;
        lm8 lm8Var2 = lm8.r;
        lm8 lm8Var3 = lm8.p;
        if (!z8) {
            int length = strArr3.length;
            int i3 = 0;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                strArr = strArr3;
                if (i3 < length) {
                    String str2 = strArr[i3];
                    List list2 = list;
                    xm8 xm8VarB = workDatabase2.w().b(str2);
                    if (xm8VarB == null) {
                        we4.f().d(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        lm8 lm8Var4 = xm8VarB.b;
                        z3 &= lm8Var4 == lm8Var;
                        if (lm8Var4 == lm8Var3) {
                            z2 = true;
                        } else if (lm8Var4 == lm8Var2) {
                            z = true;
                        }
                        i3++;
                        strArr3 = strArr;
                        list = list2;
                    }
                }
                z7 = false;
                z6 = true;
                dm8Var2.g = z6;
                return z7;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        strArr = strArr3;
        List list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        lm8 lm8Var5 = lm8.m;
        if (!zIsEmpty && z8) {
            an8 an8VarW = workDatabase2.w();
            str.getClass();
            an8VarW.getClass();
            z4 = zIsEmpty;
            List list4 = (List) au8.M(an8VarW.a, true, false, new zm8(str, (byte) 2));
            if (!list4.isEmpty()) {
                gf2 gf2Var2 = gf2.f887o;
                gf2 gf2Var3 = gf2.p;
                if (gf2Var == gf2Var2 || gf2Var == gf2Var3) {
                    rn1 rn1VarR = workDatabase2.r();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        wm8 wm8Var = (wm8) it3.next();
                        Iterator it4 = it3;
                        String str3 = wm8Var.a;
                        rn1VarR.getClass();
                        str3.getClass();
                        WorkDatabase workDatabase3 = workDatabase2;
                        rn1 rn1Var = rn1VarR;
                        if (!((Boolean) au8.M(rn1VarR.a, true, false, new fy(str3, (byte) 6))).booleanValue()) {
                            lm8 lm8Var6 = wm8Var.b;
                            z3 &= lm8Var6 == lm8Var;
                            if (lm8Var6 == lm8Var3) {
                                z2 = true;
                            } else if (lm8Var6 == lm8Var2) {
                                z = true;
                            }
                            arrayList.add(wm8Var.a);
                        }
                        it3 = it4;
                        workDatabase2 = workDatabase3;
                        rn1VarR = rn1Var;
                    }
                    workDatabase = workDatabase2;
                    if (gf2Var == gf2Var3 && (z || z2)) {
                        an8 an8VarW2 = workDatabase.w();
                        an8VarW2.getClass();
                        ze6 ze6Var = an8VarW2.a;
                        List list5 = (List) au8.M(ze6Var, true, false, new zm8(str, (byte) 2));
                        ArrayList arrayList2 = new ArrayList(mv0.Z(list5, 10));
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(((wm8) it5.next()).a);
                        }
                        Iterator it6 = list5.iterator();
                        while (it6.hasNext()) {
                            String str4 = ((wm8) it6.next()).a;
                            str4.getClass();
                            au8.M(ze6Var, false, true, new zm8(str4, (byte) 1));
                        }
                        i2 = 0;
                        arrayList = new ArrayList();
                        z = false;
                        z2 = false;
                    } else {
                        i2 = 0;
                    }
                    strArr2 = (String[]) arrayList.toArray(new String[i2]);
                    z9 = strArr2.length > 0;
                } else {
                    if (gf2Var == gf2.n) {
                        Iterator it7 = list4.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                lm8 lm8Var7 = ((wm8) it7.next()).b;
                                if (lm8Var7 == lm8Var5 || lm8Var7 == lm8.n) {
                                    z7 = false;
                                    z6 = true;
                                    dm8Var2.g = z6;
                                    return z7;
                                }
                            }
                        }
                    }
                    workDatabase2.o(new io.sentry.android.core.internal.util.j((Object) workDatabase2, (Object) str, (Object) nm8Var, (byte) 2));
                    an8 an8VarW3 = workDatabase2.w();
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        String str5 = ((wm8) it8.next()).a;
                        an8VarW3.getClass();
                        str5.getClass();
                        au8.M(an8VarW3.a, false, true, new zm8(str5, (byte) 1));
                    }
                    workDatabase = workDatabase2;
                    strArr2 = strArr;
                    z5 = true;
                }
                for (it = list3.iterator(); it.hasNext(); it = it) {
                    e95 e95Var = (e95) it.next();
                    xm8Var = e95Var.b;
                    uuid = e95Var.a;
                    if (z9 || z3) {
                        xm8Var.n = jCurrentTimeMillis;
                    } else if (z2) {
                        xm8Var.b = lm8Var3;
                    } else if (z) {
                        xm8Var.b = lm8Var2;
                    } else {
                        xm8Var.b = lm8.q;
                    }
                    if (xm8Var.b == lm8Var5) {
                        z5 = true;
                    }
                    an8 an8VarW4 = workDatabase.w();
                    nm8Var.e.getClass();
                    pg1 pg1Var = xm8Var.e;
                    boolean z10 = z5;
                    zA = pg1Var.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                    nm8 nm8Var2 = nm8Var;
                    boolean zA2 = pg1Var.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                    boolean zA3 = pg1Var.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                    if (zA && zA2 && zA3) {
                        String str6 = xm8Var.c;
                        og1 og1Var = new og1((byte) 0);
                        og1Var.d(pg1Var.a);
                        LinkedHashMap linkedHashMap = og1Var.a;
                        linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str6);
                        pg1 pg1Var2 = new pg1(linkedHashMap);
                        qf0.V(pg1Var2);
                        String str7 = xm8Var.a;
                        lm8 lm8Var8 = xm8Var.b;
                        String str8 = xm8Var.d;
                        pg1 pg1Var3 = xm8Var.f;
                        long j = xm8Var.g;
                        long j2 = xm8Var.h;
                        long j3 = xm8Var.i;
                        q61 q61Var = xm8Var.j;
                        int i4 = xm8Var.k;
                        g20 g20Var = xm8Var.l;
                        long j4 = xm8Var.m;
                        long j5 = xm8Var.n;
                        long j6 = xm8Var.f2535o;
                        long j7 = xm8Var.p;
                        boolean z11 = xm8Var.q;
                        jb5 jb5Var = xm8Var.r;
                        int i5 = xm8Var.s;
                        int i6 = xm8Var.t;
                        long j8 = xm8Var.u;
                        int i7 = xm8Var.v;
                        int i8 = xm8Var.w;
                        String str9 = xm8Var.x;
                        Boolean bool = xm8Var.y;
                        str7.getClass();
                        lm8Var8.getClass();
                        str8.getClass();
                        pg1Var3.getClass();
                        q61Var.getClass();
                        g20Var.getClass();
                        jb5Var.getClass();
                        xm8Var = new xm8(str7, lm8Var8, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", str8, pg1Var2, pg1Var3, j, j2, j3, q61Var, i4, g20Var, j4, j5, j6, j7, z11, jb5Var, i5, i6, j8, i7, i8, str9, bool);
                    }
                    an8VarW4.getClass();
                    au8.M(an8VarW4.a, false, true, new w18(an8VarW4, xm8Var, (byte) 8));
                    if (z9) {
                        for (String str10 : strArr2) {
                            String string2 = uuid.toString();
                            string2.getClass();
                            on1 on1Var = new on1(string2, str10);
                            rn1 rn1VarR2 = workDatabase.r();
                            rn1VarR2.getClass();
                            au8.M(rn1VarR2.a, false, true, new g0(rn1VarR2, on1Var, (byte) 24));
                        }
                    }
                    cn8VarX = workDatabase.x();
                    string = uuid.toString();
                    string.getClass();
                    LinkedHashSet linkedHashSet = e95Var.c;
                    cn8VarX.getClass();
                    it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        au8.M(cn8VarX.a, false, true, new w18(cn8VarX, new bn8((String) it2.next(), string), (byte) 9));
                    }
                    if (!z4) {
                        rm8 rm8VarU = workDatabase.u();
                        str.getClass();
                        String string3 = uuid.toString();
                        string3.getClass();
                        qm8 qm8Var = new qm8(str, string3);
                        rm8VarU.getClass();
                        au8.M(rm8VarU.a, false, true, new w18(rm8VarU, qm8Var, (byte) 5));
                    }
                    z5 = z10;
                    lm8Var5 = lm8Var5;
                    nm8Var = nm8Var2;
                }
                z6 = true;
                z7 = z5;
                dm8Var2 = dm8Var;
                dm8Var2.g = z6;
                return z7;
            }
            z5 = false;
            while (it.hasNext()) {
                e95 e95Var2 = (e95) it.next();
                xm8Var = e95Var2.b;
                uuid = e95Var2.a;
                if (z9) {
                    xm8Var.n = jCurrentTimeMillis;
                } else {
                    xm8Var.n = jCurrentTimeMillis;
                }
                if (xm8Var.b == lm8Var5) {
                    z5 = true;
                }
                an8 an8VarW5 = workDatabase.w();
                nm8Var.e.getClass();
                pg1 pg1Var4 = xm8Var.e;
                boolean z12 = z5;
                zA = pg1Var4.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                nm8 nm8Var3 = nm8Var;
                boolean zA4 = pg1Var4.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                boolean zA5 = pg1Var4.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (zA) {
                }
                an8VarW5.getClass();
                au8.M(an8VarW5.a, false, true, new w18(an8VarW5, xm8Var, (byte) 8));
                if (z9) {
                    while (i < r0) {
                        String string4 = uuid.toString();
                        string4.getClass();
                        on1 on1Var2 = new on1(string4, str10);
                        rn1 rn1VarR3 = workDatabase.r();
                        rn1VarR3.getClass();
                        au8.M(rn1VarR3.a, false, true, new g0(rn1VarR3, on1Var2, (byte) 24));
                    }
                }
                cn8VarX = workDatabase.x();
                string = uuid.toString();
                string.getClass();
                LinkedHashSet linkedHashSet2 = e95Var2.c;
                cn8VarX.getClass();
                it2 = linkedHashSet2.iterator();
                while (it2.hasNext()) {
                    au8.M(cn8VarX.a, false, true, new w18(cn8VarX, new bn8((String) it2.next(), string), (byte) 9));
                }
                if (!z4) {
                    rm8 rm8VarU2 = workDatabase.u();
                    str.getClass();
                    String string5 = uuid.toString();
                    string5.getClass();
                    qm8 qm8Var2 = new qm8(str, string5);
                    rm8VarU2.getClass();
                    au8.M(rm8VarU2.a, false, true, new w18(rm8VarU2, qm8Var2, (byte) 5));
                }
                z5 = z12;
                lm8Var5 = lm8Var5;
                nm8Var = nm8Var3;
            }
            z6 = true;
            z7 = z5;
            dm8Var2 = dm8Var;
            dm8Var2.g = z6;
            return z7;
        }
        z4 = zIsEmpty;
        workDatabase = workDatabase2;
        strArr2 = strArr;
        z5 = false;
        while (it.hasNext()) {
            e95 e95Var3 = (e95) it.next();
            xm8Var = e95Var3.b;
            uuid = e95Var3.a;
            if (z9) {
                xm8Var.n = jCurrentTimeMillis;
            } else {
                xm8Var.n = jCurrentTimeMillis;
            }
            if (xm8Var.b == lm8Var5) {
                z5 = true;
            }
            an8 an8VarW6 = workDatabase.w();
            nm8Var.e.getClass();
            pg1 pg1Var5 = xm8Var.e;
            boolean z13 = z5;
            zA = pg1Var5.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            nm8 nm8Var4 = nm8Var;
            boolean zA6 = pg1Var5.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zA7 = pg1Var5.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (zA) {
            }
            an8VarW6.getClass();
            au8.M(an8VarW6.a, false, true, new w18(an8VarW6, xm8Var, (byte) 8));
            if (z9) {
                while (i < r0) {
                    String string6 = uuid.toString();
                    string6.getClass();
                    on1 on1Var3 = new on1(string6, str10);
                    rn1 rn1VarR4 = workDatabase.r();
                    rn1VarR4.getClass();
                    au8.M(rn1VarR4.a, false, true, new g0(rn1VarR4, on1Var3, (byte) 24));
                }
            }
            cn8VarX = workDatabase.x();
            string = uuid.toString();
            string.getClass();
            LinkedHashSet linkedHashSet3 = e95Var3.c;
            cn8VarX.getClass();
            it2 = linkedHashSet3.iterator();
            while (it2.hasNext()) {
                au8.M(cn8VarX.a, false, true, new w18(cn8VarX, new bn8((String) it2.next(), string), (byte) 9));
            }
            if (!z4) {
                rm8 rm8VarU3 = workDatabase.u();
                str.getClass();
                String string7 = uuid.toString();
                string7.getClass();
                qm8 qm8Var3 = new qm8(str, string7);
                rm8VarU3.getClass();
                au8.M(rm8VarU3.a, false, true, new w18(rm8VarU3, qm8Var3, (byte) 5));
            }
            z5 = z13;
            lm8Var5 = lm8Var5;
            nm8Var = nm8Var4;
        }
        z6 = true;
        z7 = z5;
        dm8Var2 = dm8Var;
        dm8Var2.g = z6;
        return z7;
    }
}
