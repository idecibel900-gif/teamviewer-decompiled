package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class j88 {
    public l88 a(Object obj) {
        py2 py2Var = (py2) obj;
        l88 l88Var = py2Var.unknownFields;
        if (l88Var != l88.f) {
            return l88Var;
        }
        l88 l88Var2 = new l88(0, new int[8], new Object[8], true);
        py2Var.unknownFields = l88Var2;
        return l88Var2;
    }

    public final boolean b(int i, Object obj, xu0 xu0Var) throws pm3 {
        uu0 uu0Var = xu0Var.a;
        int i2 = xu0Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            xu0Var.w(0);
            ((l88) obj).c(i3 << 3, Long.valueOf(uu0Var.u()));
            return true;
        }
        if (i4 == 1) {
            xu0Var.w(1);
            ((l88) obj).c((i3 << 3) | 1, Long.valueOf(uu0Var.q()));
            return true;
        }
        if (i4 == 2) {
            ((l88) obj).c((i3 << 3) | 2, xu0Var.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw pm3.b();
            }
            xu0Var.w(5);
            ((l88) obj).c(5 | (i3 << 3), Integer.valueOf(uu0Var.p()));
            return true;
        }
        l88 l88Var = new l88(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new pm3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (xu0Var.a() != Integer.MAX_VALUE && b(i7, l88Var, xu0Var)) {
        }
        if (i6 != xu0Var.b) {
            throw new pm3("Protocol message end-group tag did not match expected tag.");
        }
        if (l88Var.e) {
            l88Var.e = false;
        }
        ((l88) obj).c(i5 | 3, l88Var);
        return true;
    }
}
