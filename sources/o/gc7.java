package o;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class gc7 extends kc7 {
    public static final a65 e = new a65(new sn0((byte) 8));
    public final boolean d;

    public gc7(td2 td2Var) {
        boolean z;
        super(td2Var);
        if (td2Var instanceof yw0) {
            for (td2 td2Var2 : ((yw0) td2Var).a) {
                if ((td2Var2 instanceof jc7) || (td2Var2 instanceof ic7)) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.d = z;
    }

    @Override // o.td2
    public final int a() {
        return this.a.a() * 10;
    }

    @Override // o.kc7, o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        boolean z = this.d;
        td2 td2Var = this.a;
        if (z) {
            o82 o82Var3 = o82Var2.m;
            for (o82 o82VarD0 = o82Var3 != null ? o82Var3.d0() : o82Var2; o82VarD0 != null; o82VarD0 = o82VarD0.v()) {
                if (o82VarD0 != o82Var2 && td2Var.b(o82Var2, o82VarD0)) {
                    return true;
                }
            }
        }
        a65 a65Var = e;
        j45 j45Var = (j45) a65Var.W();
        Class cls = j45Var.r;
        if (cls.isInstance(o82Var2)) {
            j45Var.n = (x35) cls.cast(o82Var2);
        }
        j45Var.f1127o = o82Var2;
        j45Var.p = o82Var2;
        j45Var.m = o82Var2;
        j45Var.q = o82Var2.H();
        while (j45Var.hasNext()) {
            try {
                j45Var.a();
                x35 x35Var = j45Var.n;
                if (x35Var == null) {
                    throw new NoSuchElementException();
                }
                j45Var.p = j45Var.f1127o;
                j45Var.f1127o = x35Var;
                j45Var.q = x35Var.H();
                j45Var.n = null;
                if (x35Var != o82Var2 && td2Var.d(o82Var2, x35Var)) {
                    a65Var.R0(j45Var);
                    return true;
                }
            } catch (Throwable th) {
                a65Var.R0(j45Var);
                throw th;
            }
        }
        a65Var.R0(j45Var);
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
