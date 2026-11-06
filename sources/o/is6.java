package o;

/* JADX INFO: loaded from: classes.dex */
public enum is6 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    StatisticsKey((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    IntVal((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    StringVal((byte) 3),
    SendInfo((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    UIntVal((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    BoolVal((byte) 6);

    public final byte m;

    is6(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
