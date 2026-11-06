package o;

/* JADX INFO: loaded from: classes.dex */
public enum yl4 {
    ManagedDeviceV2,
    /* JADX INFO: Fake field, exist only in values array */
    ManagedGroupV2;

    public final int m;

    yl4() {
        int i = zu1.b;
        zu1.b = i + 1;
        this.m = i;
    }

    public static yl4 a(int i) {
        yl4[] yl4VarArr = (yl4[]) yl4.class.getEnumConstants();
        if (i < yl4VarArr.length && i >= 0) {
            yl4 yl4Var = yl4VarArr[i];
            if (yl4Var.m == i) {
                return yl4Var;
            }
        }
        for (yl4 yl4Var2 : yl4VarArr) {
            if (yl4Var2.m == i) {
                return yl4Var2;
            }
        }
        hk0.g(ua5.k(i, yl4.class, "No enum ", " with value "));
        return null;
    }
}
