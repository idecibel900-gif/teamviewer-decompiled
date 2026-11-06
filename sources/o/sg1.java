package o;

/* JADX INFO: loaded from: classes.dex */
public class sg1 {
    public final int a;
    public final int b;

    public sg1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sg1)) {
            return false;
        }
        sg1 sg1Var = (sg1) obj;
        return this.a == sg1Var.a && this.b == sg1Var.b;
    }

    public final int hashCode() {
        return this.b ^ this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(");
        return e41.j(sb, this.b, ')');
    }
}
