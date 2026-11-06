package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fo3 {
    public static final ht2 a;
    public static final ht2[] b;
    public static final a65 c;
    public static final go3 d;

    static {
        ht2 ht2Var = new ht2("org.jspecify.nullness");
        ht2 ht2Var2 = new ht2("org.jspecify.annotations");
        a = ht2Var2;
        ht2 ht2Var3 = new ht2("io.reactivex.rxjava3.annotations");
        ht2 ht2Var4 = new ht2("org.checkerframework.checker.nullness.compatqual");
        String strB = ht2Var3.b();
        b = new ht2[]{new ht2(strB.concat(".Nullable")), new ht2(strB.concat(".NonNull"))};
        ht2 ht2Var5 = new ht2("org.jetbrains.annotations");
        go3 go3Var = go3.d;
        vd5 vd5Var = new vd5(ht2Var5, go3Var);
        vd5 vd5Var2 = new vd5(new ht2("androidx.annotation"), go3Var);
        vd5 vd5Var3 = new vd5(new ht2("android.support.annotation"), go3Var);
        vd5 vd5Var4 = new vd5(new ht2("android.annotation"), go3Var);
        vd5 vd5Var5 = new vd5(new ht2("com.android.annotations"), go3Var);
        vd5 vd5Var6 = new vd5(new ht2("org.eclipse.jdt.annotation"), go3Var);
        vd5 vd5Var7 = new vd5(new ht2("org.checkerframework.checker.nullness.qual"), go3Var);
        vd5 vd5Var8 = new vd5(ht2Var4, go3Var);
        vd5 vd5Var9 = new vd5(new ht2("javax.annotation"), go3Var);
        vd5 vd5Var10 = new vd5(new ht2("edu.umd.cs.findbugs.annotations"), go3Var);
        vd5 vd5Var11 = new vd5(new ht2("io.reactivex.annotations"), go3Var);
        ht2 ht2Var6 = new ht2("androidx.annotation.RecentlyNullable");
        za6 za6Var = za6.WARN;
        vd5 vd5Var12 = new vd5(ht2Var6, new go3(za6Var, 4));
        vd5 vd5Var13 = new vd5(new ht2("androidx.annotation.RecentlyNonNull"), new go3(za6Var, 4));
        vd5 vd5Var14 = new vd5(new ht2("lombok"), go3Var);
        vz3 vz3Var = new vz3(2, 1, 0);
        za6 za6Var2 = za6.STRICT;
        c = new a65(xm4.R(vd5Var, vd5Var2, vd5Var3, vd5Var4, vd5Var5, vd5Var6, vd5Var7, vd5Var8, vd5Var9, vd5Var10, vd5Var11, vd5Var12, vd5Var13, vd5Var14, new vd5(ht2Var, new go3(za6Var, vz3Var, za6Var2)), new vd5(ht2Var2, new go3(za6Var, new vz3(2, 1, 0), za6Var2)), new vd5(ht2Var3, new go3(za6Var, new vz3(1, 8, 0), za6Var2))));
        d = new go3(za6Var, 4);
    }
}
