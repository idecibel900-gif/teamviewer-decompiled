package o;

/* JADX INFO: loaded from: classes.dex */
public enum zi7 implements i10 {
    Color((byte) 0),
    ColorInfo((byte) 1),
    Mask((byte) 2),
    MaskInfo((byte) 3),
    XHotSpot((byte) 4),
    YHotSpot((byte) 5),
    X((byte) 6),
    Y((byte) 7),
    Grabbing((byte) 8);

    public final byte m;

    zi7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
