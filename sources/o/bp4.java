package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bp4 {
    public final String a;

    public bp4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp4) && this.a.equals(((bp4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MemberSignature(signature=" + this.a + ')';
    }
}
