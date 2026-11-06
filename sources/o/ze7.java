package o;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ze7 implements pg6 {
    public final bf7 m;

    public ze7(bf7 bf7Var) {
        bf7Var.getClass();
        this.m = bf7Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    @Override // o.pg6
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final kf7 J0(String str) {
        str.getClass();
        bf7 bf7Var = this.m;
        bf7Var.getClass();
        String string = ub7.x0(str).toString();
        if (string.length() >= 3) {
            String upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                hf7 hf7Var = new hf7(bf7Var, str);
                hf7Var.p = new int[0];
                hf7Var.q = new long[0];
                hf7Var.r = new double[0];
                hf7Var.s = new String[0];
                hf7Var.t = new byte[0][];
                return hf7Var;
            }
        }
        return new if7(bf7Var, str);
    }
}
