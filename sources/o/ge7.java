package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ge7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final List f;
    public final Integer g;
    public final boolean h;
    public final String i;
    public final String j;
    public final fe7 k;

    public ge7(int i, int i2, int i3, int i4, Integer num, List list, Integer num2, boolean z, String str, String str2, fe7 fe7Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = num;
        this.f = list;
        this.g = num2;
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = fe7Var;
    }

    public String a() {
        return this.i;
    }

    public String b() {
        return this.j;
    }

    public abstract boolean c();
}
