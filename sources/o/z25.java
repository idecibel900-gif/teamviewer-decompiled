package o;

/* JADX INFO: loaded from: classes.dex */
public final class z25 {
    public final String a;
    public final String b;
    public final w25 c;
    public final tg2 d;

    public z25(String str, String str2, w25 w25Var, tg2 tg2Var) {
        this.a = str;
        this.b = str2;
        this.c = w25Var;
        this.d = tg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z25)) {
            return false;
        }
        z25 z25Var = (z25) obj;
        return this.a.equals(z25Var.a) && im3.n(this.b, z25Var.b) && this.c.equals(z25Var.c) && im3.n(this.d, z25Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + to7.e(this.a.hashCode() * 31, 31, this.b)) * 961);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbO.append(this.c);
        sbO.append(", body=null, extras=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
