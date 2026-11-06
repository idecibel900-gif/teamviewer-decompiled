package o;

/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final Object a;
    public final ox b;
    public final i46 c;

    public wx(Object obj, ox oxVar, i46 i46Var) {
        this.a = obj;
        this.b = oxVar;
        this.c = i46Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        ox oxVar = wxVar.b;
        ox oxVar2 = this.b;
        return im3.n(oxVar2, oxVar) && oxVar2.a(this.a, wxVar.a) && this.c == wxVar.c;
    }

    public final int hashCode() {
        ox oxVar = this.b;
        return this.c.hashCode() + ((oxVar.b(this.a) + (oxVar.hashCode() * 31)) * 31);
    }
}
