package o;

/* JADX INFO: loaded from: classes.dex */
public final class pf extends x67 {
    public final int a;

    public pf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pf) && ((pf) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a * 31;
    }
}
