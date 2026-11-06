package o;

/* JADX INFO: loaded from: classes.dex */
public enum i21 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    Undefined((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    Value((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    ValidFrom((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    ValidUntil((byte) 3),
    Signature((byte) 4),
    SignedFields((byte) 5);

    public final byte m;

    i21(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
