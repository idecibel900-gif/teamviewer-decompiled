package o;

/* JADX INFO: loaded from: classes2.dex */
public final class s80 {
    public vi a = null;
    public cg b = null;
    public nl0 c = null;
    public rj d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s80)) {
            return false;
        }
        s80 s80Var = (s80) obj;
        return im3.n(this.a, s80Var.a) && im3.n(this.b, s80Var.b) && im3.n(this.c, s80Var.c) && im3.n(this.d, s80Var.d);
    }

    public final int hashCode() {
        vi viVar = this.a;
        int iHashCode = (viVar == null ? 0 : viVar.hashCode()) * 31;
        cg cgVar = this.b;
        int iHashCode2 = (iHashCode + (cgVar == null ? 0 : cgVar.hashCode())) * 31;
        nl0 nl0Var = this.c;
        int iHashCode3 = (iHashCode2 + (nl0Var == null ? 0 : nl0Var.hashCode())) * 31;
        rj rjVar = this.d;
        return iHashCode3 + (rjVar != null ? rjVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
