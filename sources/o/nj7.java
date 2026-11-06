package o;

/* JADX INFO: loaded from: classes.dex */
public enum nj7 implements i10 {
    Buttons((byte) 0),
    X((byte) 1),
    Y((byte) 2),
    Wheel((byte) 3),
    HWheel((byte) 4);

    public final byte m;

    nj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
