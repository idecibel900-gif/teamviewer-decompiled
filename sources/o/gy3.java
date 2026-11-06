package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy3 {
    public static final jr3 a = jr3.b("k");

    public static ArrayList a(kr3 kr3Var, qh4 qh4Var, float f, rb8 rb8Var, boolean z) {
        kr3 kr3Var2;
        qh4 qh4Var2;
        float f2;
        rb8 rb8Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (kr3Var.q() == 6) {
            qh4Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        kr3Var.u0();
        while (kr3Var.hasNext()) {
            if (kr3Var.z(a) != 0) {
                kr3Var.v();
            } else if (kr3Var.q() == 1) {
                kr3Var.D0();
                if (kr3Var.q() == 7) {
                    kr3 kr3Var3 = kr3Var;
                    qh4 qh4Var3 = qh4Var;
                    float f3 = f;
                    rb8 rb8Var3 = rb8Var;
                    boolean z3 = z;
                    dy3 dy3VarB = fy3.b(kr3Var3, qh4Var3, f3, rb8Var3, false, z3);
                    kr3Var2 = kr3Var3;
                    qh4Var2 = qh4Var3;
                    f2 = f3;
                    rb8Var2 = rb8Var3;
                    z2 = z3;
                    arrayList.add(dy3VarB);
                } else {
                    kr3Var2 = kr3Var;
                    qh4Var2 = qh4Var;
                    f2 = f;
                    rb8Var2 = rb8Var;
                    z2 = z;
                    while (kr3Var2.hasNext()) {
                        arrayList.add(fy3.b(kr3Var2, qh4Var2, f2, rb8Var2, true, z2));
                    }
                }
                kr3Var2.A0();
                kr3Var = kr3Var2;
                qh4Var = qh4Var2;
                f = f2;
                rb8Var = rb8Var2;
                z = z2;
            } else {
                kr3 kr3Var4 = kr3Var;
                arrayList.add(fy3.b(kr3Var4, qh4Var, f, rb8Var, false, z));
                kr3Var = kr3Var4;
            }
        }
        kr3Var.Z();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            dy3 dy3Var = (dy3) arrayList.get(i2);
            i2++;
            dy3 dy3Var2 = (dy3) arrayList.get(i2);
            dy3Var.h = Float.valueOf(dy3Var2.g);
            if (dy3Var.c == null && (obj = dy3Var2.b) != null) {
                dy3Var.c = obj;
                if (dy3Var instanceof ah5) {
                    ((ah5) dy3Var).d();
                }
            }
        }
        dy3 dy3Var3 = (dy3) arrayList.get(i);
        if ((dy3Var3.b == null || dy3Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(dy3Var3);
        }
    }
}
