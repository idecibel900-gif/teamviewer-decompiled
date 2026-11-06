package o;

/* JADX INFO: loaded from: classes.dex */
public enum bj7 implements i10 {
    StreamID((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Width((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    Height((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    DPIScale((byte) 4),
    Hidden((byte) 5);

    public final byte m;

    bj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
