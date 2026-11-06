package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hx2 {
    public final ht2 a;
    public final String b;

    public hx2(String str, ht2 ht2Var) {
        ht2Var.getClass();
        this.a = ht2Var;
        this.b = str;
    }

    public final sy4 a(int i) {
        return sy4.e(this.b + i);
    }

    public final String toString() {
        return this.a + '.' + this.b + 'N';
    }
}
