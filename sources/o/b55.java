package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b55 {
    public final js0 a;
    public final List b;

    public b55(js0 js0Var, List list) {
        js0Var.getClass();
        this.a = js0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b55)) {
            return false;
        }
        b55 b55Var = (b55) obj;
        return im3.n(this.a, b55Var.a) && this.b.equals(b55Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}
