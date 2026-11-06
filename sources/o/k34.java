package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k34 {
    public r61 b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ m34 h;
    public i34[] a = g68.r;
    public int e = 1;

    public k34(m34 m34Var) {
        this.h = m34Var;
    }

    public static void b(k34 k34Var, p44 p44Var, me1 me1Var, k03 k03Var, int i, int i2) {
        k34Var.h.getClass();
        k34Var.a(p44Var, me1Var, k03Var, i, i2, (int) (p44Var.b(0) >> 32));
    }

    public final void a(p44 p44Var, me1 me1Var, k03 k03Var, int i, int i2, int i3) {
        i34[] i34VarArr;
        List list = p44Var.b;
        i34[] i34VarArr2 = this.a;
        int length = i34VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                i34 i34Var = i34VarArr2[i4];
                if (i34Var != null && i34Var.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = list.size();
        int length2 = this.a.length;
        while (true) {
            i34VarArr = this.a;
            if (size >= length2) {
                break;
            }
            i34 i34Var2 = i34VarArr[size];
            if (i34Var2 != null) {
                i34Var2.c();
            }
            size++;
        }
        if (i34VarArr.length != list.size()) {
            this.a = (i34[]) Arrays.copyOf(this.a, list.size());
        }
        this.b = new r61(p44Var.l);
        this.c = i3;
        this.d = 0;
        this.e = 1;
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objE = ((jl5) list.get(i5)).E();
            z24 z24Var = objE instanceof z24 ? (z24) objE : null;
            i34[] i34VarArr3 = this.a;
            if (z24Var == null) {
                i34 i34Var3 = i34VarArr3[i5];
                if (i34Var3 != null) {
                    i34Var3.c();
                }
                this.a[i5] = null;
            } else {
                i34 i34Var4 = i34VarArr3[i5];
                if (i34Var4 == null) {
                    i34Var4 = new i34(me1Var, k03Var, new vm3((Object) this.h, (byte) 2));
                    this.a[i5] = i34Var4;
                }
                i34Var4.d = z24Var.A;
                i34Var4.e = z24Var.B;
                i34Var4.f = z24Var.C;
            }
        }
    }
}
