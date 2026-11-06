package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gr {
    public final int a;
    public final cj3 b;
    public final bq c;
    public final String d;

    public gr(cj3 cj3Var, bq bqVar, String str) {
        this.b = cj3Var;
        this.c = bqVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{cj3Var, bqVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gr)) {
            return false;
        }
        gr grVar = (gr) obj;
        return xs1.G(this.b, grVar.b) && xs1.G(this.c, grVar.c) && xs1.G(this.d, grVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
