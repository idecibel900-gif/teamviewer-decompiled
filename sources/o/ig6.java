package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ig6 {
    public zi8 a;
    public ArrayList b;

    public static long a(tn1 tn1Var, long j) {
        zi8 zi8Var = tn1Var.d;
        ArrayList arrayList = tn1Var.k;
        if (zi8Var instanceof q53) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            pn1 pn1Var = (pn1) arrayList.get(i);
            if (pn1Var instanceof tn1) {
                tn1 tn1Var2 = (tn1) pn1Var;
                if (tn1Var2.d != zi8Var) {
                    jMin = Math.min(jMin, a(tn1Var2, ((long) tn1Var2.f) + j));
                }
            }
        }
        tn1 tn1Var3 = zi8Var.i;
        tn1 tn1Var4 = zi8Var.h;
        if (tn1Var != tn1Var3) {
            return jMin;
        }
        long j2 = j - zi8Var.j();
        return Math.min(Math.min(jMin, a(tn1Var4, j2)), j2 - ((long) tn1Var4.f));
    }

    public static long b(tn1 tn1Var, long j) {
        zi8 zi8Var = tn1Var.d;
        ArrayList arrayList = tn1Var.k;
        if (zi8Var instanceof q53) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            pn1 pn1Var = (pn1) arrayList.get(i);
            if (pn1Var instanceof tn1) {
                tn1 tn1Var2 = (tn1) pn1Var;
                if (tn1Var2.d != zi8Var) {
                    jMax = Math.max(jMax, b(tn1Var2, ((long) tn1Var2.f) + j));
                }
            }
        }
        tn1 tn1Var3 = zi8Var.h;
        tn1 tn1Var4 = zi8Var.i;
        if (tn1Var != tn1Var3) {
            return jMax;
        }
        long j2 = zi8Var.j() + j;
        return Math.max(Math.max(jMax, b(tn1Var4, j2)), j2 - ((long) tn1Var4.f));
    }
}
