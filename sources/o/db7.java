package o;

/* JADX INFO: loaded from: classes.dex */
public final class db7 implements to {
    public final String a;

    public /* synthetic */ db7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof db7) {
            return this.a.equals(((db7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fx3.g("StringAnnotation(value=", this.a, ")");
    }
}
