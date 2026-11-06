package o;

/* JADX INFO: loaded from: classes.dex */
public enum dj7 implements i10 {
    PacketNr((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Result((byte) 2);

    public final byte m;

    dj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
