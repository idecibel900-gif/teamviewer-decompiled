package o;

/* JADX INFO: loaded from: classes.dex */
public enum yi7 implements i10 {
    Mode((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    Incoming((byte) 1);

    public final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    yi7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m ? (byte) 1 : (byte) 0;
    }
}
