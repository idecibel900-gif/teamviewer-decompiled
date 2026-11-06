package o;

/* JADX INFO: loaded from: classes.dex */
public enum tj7 implements i10 {
    MessageNumber((byte) 1),
    MessageText((byte) 2);

    public final byte m;

    tj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
