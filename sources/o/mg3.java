package o;

/* JADX INFO: loaded from: classes2.dex */
public final class mg3 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final ps3 d;
    public final String e;
    public final js0 f;

    public mg3(Object obj, Object obj2, ps3 ps3Var, ps3 ps3Var2, String str, js0 js0Var) {
        this.a = obj;
        this.b = obj2;
        this.c = ps3Var;
        this.d = ps3Var2;
        this.e = str;
        this.f = js0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg3)) {
            return false;
        }
        mg3 mg3Var = (mg3) obj;
        return this.a.equals(mg3Var.a) && im3.n(this.b, mg3Var.b) && im3.n(this.c, mg3Var.c) && this.d.equals(mg3Var.d) && this.e.equals(mg3Var.e) && this.f.equals(mg3Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.f.hashCode() + to7.e((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}
