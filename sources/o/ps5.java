package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum ps5 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final sy4 m;
    public final sy4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u14 f1771o;
    public final u14 p;
    public static final Set q = cx.h1(new ps5[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    ps5(String str) {
        this.m = sy4.e(str);
        this.n = sy4.e(str.concat("Array"));
        os5 os5Var = new os5(this, (byte) 0);
        l54 l54Var = l54.m;
        this.f1771o = ds1.X(l54Var, os5Var);
        this.p = ds1.X(l54Var, new os5(this, (byte) 1));
    }
}
