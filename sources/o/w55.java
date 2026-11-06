package o;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class w55 extends vp3 {
    public final vp3 a;

    public w55(vp3 vp3Var) {
        this.a = vp3Var;
    }

    @Override // o.vp3
    public final Object a(nr3 nr3Var) throws qq3, EOFException {
        if (nr3Var.c0() != 9) {
            return this.a.a(nr3Var);
        }
        nr3Var.J();
        return null;
    }

    @Override // o.vp3
    public final void c(pr3 pr3Var, Object obj) {
        if (obj == null) {
            pr3Var.J();
        } else {
            this.a.c(pr3Var, obj);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
