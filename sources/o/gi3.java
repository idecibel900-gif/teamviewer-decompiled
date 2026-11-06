package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class gi3 extends an5 {
    public final boolean l;

    public gi3(String str, hi3 hi3Var) {
        super(str, hi3Var, 1);
        this.l = true;
    }

    @Override // o.an5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gi3) {
            fq6 fq6Var = (fq6) obj;
            if (this.a.equals(fq6Var.a())) {
                gi3 gi3Var = (gi3) obj;
                if (gi3Var.l && Arrays.equals((fq6[]) this.j.getValue(), (fq6[]) gi3Var.j.getValue())) {
                    int iE = fq6Var.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (im3.n(h(i2).a(), fq6Var.h(i2).a()) && im3.n(h(i2).k(), fq6Var.h(i2).k())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o.an5
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // o.fq6
    public final boolean m() {
        return this.l;
    }
}
