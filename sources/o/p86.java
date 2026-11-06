package o;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class p86 extends e86 implements rn3 {
    public final n86 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public p86(n86 n86Var, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = n86Var;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // o.rn3
    public final q76 a(ht2 ht2Var) {
        ht2Var.getClass();
        return xs1.I(this.b, ht2Var);
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        return xs1.M(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(p86.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? sy4.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
