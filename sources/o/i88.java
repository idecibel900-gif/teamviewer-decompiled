package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class i88 {
    public final boolean a(Object obj, o36 o36Var) throws qm3 {
        int iS = o36Var.s();
        int i = iS >>> 3;
        int i2 = iS & 7;
        if (i2 == 0) {
            ((k88) obj).c(i << 3, Long.valueOf(o36Var.J()));
            return true;
        }
        if (i2 == 1) {
            ((k88) obj).c((i << 3) | 1, Long.valueOf(o36Var.d()));
            return true;
        }
        if (i2 == 2) {
            ((k88) obj).c((i << 3) | 2, o36Var.B());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw qm3.b();
            }
            ((k88) obj).c(5 | (i << 3), Integer.valueOf(o36Var.i()));
            return true;
        }
        k88 k88VarB = k88.b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (o36Var.y() != Integer.MAX_VALUE && a(k88VarB, o36Var)) {
        }
        if (i4 != o36Var.s()) {
            throw new qm3("Protocol message end-group tag did not match expected tag.");
        }
        k88VarB.e = false;
        ((k88) obj).c(i3 | 3, k88VarB);
        return true;
    }
}
