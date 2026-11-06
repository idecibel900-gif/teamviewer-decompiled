package o;

/* JADX INFO: loaded from: classes.dex */
public final class h00 {
    public final String a;
    public final Class b;

    public h00(Class cls, String str) {
        this.a = str;
        if (cls != null) {
            this.b = cls;
        } else {
            yq4.l("Null valueClass");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        return this.a.equals(h00Var.a) && this.b.equals(h00Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003)) * 1000003;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=null}";
    }
}
