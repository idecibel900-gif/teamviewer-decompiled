package o;

/* JADX INFO: loaded from: classes2.dex */
public final class u92 implements ng3 {
    public final boolean m;

    public u92(boolean z) {
        this.m = z;
    }

    @Override // o.ng3
    public final boolean e() {
        return this.m;
    }

    @Override // o.ng3
    public final l45 f() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.m ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
