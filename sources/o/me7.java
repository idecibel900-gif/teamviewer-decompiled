package o;

/* JADX INFO: loaded from: classes.dex */
public final class me7 implements se3 {
    public final xd3 a;
    public final ke3 b;
    public final zg1 c;
    public final cp4 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public me7(xd3 xd3Var, ke3 ke3Var, zg1 zg1Var, cp4 cp4Var, String str, boolean z, boolean z2) {
        this.a = xd3Var;
        this.b = ke3Var;
        this.c = zg1Var;
        this.d = cp4Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me7)) {
            return false;
        }
        me7 me7Var = (me7) obj;
        return im3.n(this.a, me7Var.a) && im3.n(this.b, me7Var.b) && this.c == me7Var.c && im3.n(this.d, me7Var.d) && im3.n(this.e, me7Var.e) && this.f == me7Var.f && this.g == me7Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        cp4 cp4Var = this.d;
        int iHashCode2 = (iHashCode + (cp4Var == null ? 0 : cp4Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + to7.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // o.se3
    public final ke3 p() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return ua5.n(")", sb, this.g);
    }
}
