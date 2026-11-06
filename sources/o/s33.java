package o;

/* JADX INFO: loaded from: classes.dex */
public enum s33 {
    Contact,
    Computer,
    ServiceCase;

    public final int m;

    s33() {
        int i = et1.a;
        et1.a = i + 1;
        this.m = i;
    }

    public static s33 a(int i) {
        s33[] s33VarArr = (s33[]) s33.class.getEnumConstants();
        if (i < s33VarArr.length && i >= 0) {
            s33 s33Var = s33VarArr[i];
            if (s33Var.m == i) {
                return s33Var;
            }
        }
        for (s33 s33Var2 : s33VarArr) {
            if (s33Var2.m == i) {
                return s33Var2;
            }
        }
        hk0.g(ua5.k(i, s33.class, "No enum ", " with value "));
        return null;
    }
}
