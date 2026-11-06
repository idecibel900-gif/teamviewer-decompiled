package o;

/* JADX INFO: loaded from: classes.dex */
public final class qx {
    public final i46 a;
    public final ke3 b;
    public final ox c;

    public qx(i46 i46Var, ke3 ke3Var, ox oxVar) {
        this.a = i46Var;
        this.b = ke3Var;
        this.c = oxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx)) {
            return false;
        }
        qx qxVar = (qx) obj;
        if (this.a != qxVar.a) {
            return false;
        }
        ox oxVar = qxVar.c;
        ox oxVar2 = this.c;
        return im3.n(oxVar2, oxVar) && oxVar2.a(this.b, qxVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ox oxVar = this.c;
        return oxVar.b(this.b) + ((oxVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
