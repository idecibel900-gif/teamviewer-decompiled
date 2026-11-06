package o;

/* JADX INFO: loaded from: classes2.dex */
public final class r86 {
    public final Class a;
    public final yy3 b;

    public r86(Class cls, yy3 yy3Var) {
        this.a = cls;
        this.b = yy3Var;
    }

    public final String a() {
        String strReplace = this.a.getName().replace('.', '/');
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r86) {
            return this.a.equals(((r86) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return r86.class.getName() + ": " + this.a;
    }
}
