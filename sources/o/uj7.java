package o;

/* JADX INFO: loaded from: classes.dex */
public enum uj7 implements i10 {
    ID((byte) 0),
    X((byte) 1),
    Y((byte) 2),
    Phase((byte) 3),
    Flags((byte) 4),
    Delay((byte) 5);

    public final byte m;

    uj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
