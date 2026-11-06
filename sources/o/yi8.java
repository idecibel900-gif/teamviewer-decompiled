package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yi8 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                yi8 yi8Var = (yi8) arrayList.get(i);
                if (this.e == yi8Var.b) {
                    c(this.c, yi8Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ba4 ba4Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        o61 o61Var = ((n61) arrayList.get(0)).S;
        ba4Var.t();
        o61Var.b(ba4Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((n61) arrayList.get(i2)).b(ba4Var, false);
        }
        if (i == 0 && o61Var.y0 > 0) {
            au8.q(o61Var, ba4Var, arrayList, 0);
        }
        if (i == 1 && o61Var.z0 > 0) {
            au8.q(o61Var, ba4Var, arrayList, 1);
        }
        try {
            ba4Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            n61 n61Var = (n61) arrayList.get(i3);
            yi5 yi5Var = new yi5((byte) 18);
            new WeakReference(n61Var);
            ba4.n(n61Var.H);
            ba4.n(n61Var.I);
            ba4.n(n61Var.J);
            ba4.n(n61Var.K);
            ba4.n(n61Var.L);
            this.d.add(yi5Var);
        }
        if (i == 0) {
            iN = ba4.n(o61Var.H);
            iN2 = ba4.n(o61Var.J);
            ba4Var.t();
        } else {
            iN = ba4.n(o61Var.I);
            iN2 = ba4.n(o61Var.K);
            ba4Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, yi8 yi8Var) {
        int i2 = yi8Var.b;
        for (n61 n61Var : this.a) {
            ArrayList arrayList = yi8Var.a;
            if (!arrayList.contains(n61Var)) {
                arrayList.add(n61Var);
            }
            if (i == 0) {
                n61Var.m0 = i2;
            } else {
                n61Var.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" [");
        String strL = to7.l(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            strL = strL + " " + ((n61) it.next()).g0;
        }
        return strL.concat(" >");
    }
}
