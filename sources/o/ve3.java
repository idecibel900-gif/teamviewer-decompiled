package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ve3 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final ue3 j;
    public boolean k;

    public ve3(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? rv0.h : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z2;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ue3 ue3Var = new ue3(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = ue3Var;
        arrayList.add(ue3Var);
    }

    public static void b(ve3 ve3Var, String str, List list) {
        ve3Var.a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list);
    }

    public static void d(ve3 ve3Var, ArrayList arrayList, t57 t57Var, float f, int i, float f2) {
        ve3Var.c(1.0f, 1.0f, f, f2, 0.0f, 1.0f, 0.0f, 0, 0, i, "", arrayList, t57Var, null);
    }

    public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (this.k) {
            ki3.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.i.add(new ue3(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, String str, List list, sb0 sb0Var, sb0 sb0Var2) {
        if (this.k) {
            ki3.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((ue3) ua5.j(1, this.i)).j.add(new dc8(f, f2, f3, f4, f5, f6, f7, i, i2, i3, str, list, sb0Var, sb0Var2));
    }

    public final we3 e() {
        if (this.k) {
            ki3.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (this.i.size() > 1) {
            f();
        }
        ue3 ue3Var = this.j;
        we3 we3Var = new we3(this.a, this.b, this.c, this.d, this.e, new ac8(ue3Var.a, ue3Var.b, ue3Var.c, ue3Var.d, ue3Var.e, ue3Var.f, ue3Var.g, ue3Var.h, ue3Var.i, ue3Var.j), this.f, this.g, this.h);
        this.k = true;
        return we3Var;
    }

    public final void f() {
        if (this.k) {
            ki3.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList = this.i;
        ue3 ue3Var = (ue3) arrayList.remove(arrayList.size() - 1);
        ((ue3) ua5.j(1, arrayList)).j.add(new ac8(ue3Var.a, ue3Var.b, ue3Var.c, ue3Var.d, ue3Var.e, ue3Var.f, ue3Var.g, ue3Var.h, ue3Var.i, ue3Var.j));
    }
}
