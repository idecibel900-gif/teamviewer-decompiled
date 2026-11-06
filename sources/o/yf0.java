package o;

/* JADX INFO: loaded from: classes2.dex */
public final class yf0 {
    public static final yf0 m = new yf0();
    public final dg2 a;
    public final my2 b;
    public final my2 c;
    public final my2 d;
    public final my2 e;
    public final my2 f;
    public final my2 g;
    public final my2 h;
    public final my2 i;
    public final my2 j;
    public final my2 k;
    public final my2 l;

    public yf0() {
        dg2 dg2Var = new dg2();
        fg0.a(dg2Var);
        fg0.a.getClass();
        my2 my2Var = fg0.c;
        my2Var.getClass();
        my2 my2Var2 = fg0.b;
        my2Var2.getClass();
        my2 my2Var3 = fg0.d;
        my2Var3.getClass();
        my2 my2Var4 = fg0.e;
        my2Var4.getClass();
        my2 my2Var5 = fg0.f;
        my2Var5.getClass();
        my2 my2Var6 = fg0.g;
        my2Var6.getClass();
        my2 my2Var7 = fg0.i;
        my2Var7.getClass();
        my2 my2Var8 = fg0.h;
        my2Var8.getClass();
        my2 my2Var9 = fg0.j;
        my2Var9.getClass();
        my2 my2Var10 = fg0.k;
        my2Var10.getClass();
        my2 my2Var11 = fg0.l;
        my2Var11.getClass();
        this.a = dg2Var;
        this.b = my2Var;
        this.c = my2Var2;
        this.d = my2Var3;
        this.e = my2Var4;
        this.f = my2Var5;
        this.g = my2Var6;
        this.h = my2Var7;
        this.i = my2Var8;
        this.j = my2Var9;
        this.k = my2Var10;
        this.l = my2Var11;
    }

    public static String a(ht2 ht2Var) {
        String strB;
        ht2Var.getClass();
        String strReplace = ht2Var.b().replace('.', '/');
        strReplace.getClass();
        StringBuilder sb = new StringBuilder(strReplace);
        sb.append('/');
        if (ht2Var.d()) {
            strB = "default-package";
        } else {
            strB = ht2Var.f().b();
            strB.getClass();
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
