package o;

/* JADX INFO: loaded from: classes.dex */
public enum xj7 implements i10 {
    CommandType((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Resolution((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    MonitorID((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    Result((byte) 4);

    public final byte m;

    xj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
