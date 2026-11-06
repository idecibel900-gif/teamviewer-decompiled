package o;

/* JADX INFO: loaded from: classes.dex */
public final class hj5 {
    public final cj5 a;
    public final cj5 b;
    public final cj5 c;
    public final cj5 d;
    public final cj5 e;
    public final cj5 f;
    public final cj5 g;
    public final String h;

    public hj5(cj5 cj5Var, cj5 cj5Var2, cj5 cj5Var3, cj5 cj5Var4, cj5 cj5Var5, cj5 cj5Var6, cj5 cj5Var7, String str) {
        this.a = cj5Var;
        this.b = cj5Var2;
        this.c = cj5Var3;
        this.d = cj5Var4;
        this.e = cj5Var5;
        this.f = cj5Var6;
        this.g = cj5Var7;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj5)) {
            return false;
        }
        hj5 hj5Var = (hj5) obj;
        return this.a.equals(hj5Var.a) && this.b.equals(hj5Var.b) && this.c.equals(hj5Var.c) && this.d.equals(hj5Var.d) && this.e.equals(hj5Var.e) && this.f.equals(hj5Var.f) && this.g.equals(hj5Var.g) && this.h.equals(hj5Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PermissionsConfig(showRemoteControl=" + this.a + ", showOverlay=" + this.b + ", showNotifications=" + this.c + ", showLocation=" + this.d + ", showStorage=" + this.e + ", showMicrophone=" + this.f + ", showCamera=" + this.g + ", disclaimerDescription=" + this.h + ")";
    }
}
