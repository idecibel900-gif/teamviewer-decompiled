package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qj6 implements my5 {
    public final String m;

    public qj6(String str) {
        str.getClass();
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qj6.class != obj.getClass()) {
            return false;
        }
        return im3.n(this.m, ((qj6) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return fx3.g("ScriptQualifier(script='", this.m, "')");
    }
}
