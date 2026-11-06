package o;

/* JADX INFO: loaded from: classes.dex */
public enum oo4 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    Source((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Destination((byte) 2),
    StreamIdentifier((byte) 3),
    Error((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    Synchronisation((byte) 5);

    public final byte m;

    oo4(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
