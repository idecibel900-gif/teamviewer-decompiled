package o;

/* JADX INFO: loaded from: classes.dex */
public final class m47 implements d72 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public m47(int i) {
        this.a = i;
    }

    @Override // o.rl2, o.jo
    public final gc8 a(yn1 yn1Var) {
        return new we4(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m47) && ((m47) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
