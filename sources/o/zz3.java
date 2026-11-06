package o;

/* JADX INFO: loaded from: classes2.dex */
public final class zz3 implements my5 {
    public final String m;

    public zz3(String str) {
        str.getClass();
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz3.class != obj.getClass()) {
            return false;
        }
        return im3.n(this.m, ((zz3) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return fx3.g("LanguageQualifier(language='", this.m, "')");
    }
}
