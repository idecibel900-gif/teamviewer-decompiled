package o;

/* JADX INFO: loaded from: classes2.dex */
public final class u77 {
    public final String a;
    public final sy4 b;
    public final String c;
    public final String d;
    public final String e;

    public u77(String str, sy4 sy4Var, String str2, String str3) {
        this.a = str;
        this.b = sy4Var;
        this.c = str2;
        this.d = str3;
        this.e = str + '.' + (sy4Var + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u77)) {
            return false;
        }
        u77 u77Var = (u77) obj;
        return this.a.equals(u77Var.a) && this.b.equals(u77Var.b) && this.c.equals(u77Var.c) && this.d.equals(u77Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + to7.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "NameAndSignature(classInternalName=" + this.a + ", name=" + this.b + ", parameters=" + this.c + ", returnType=" + this.d + ')';
    }
}
