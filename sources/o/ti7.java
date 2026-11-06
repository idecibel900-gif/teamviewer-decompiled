package o;

/* JADX INFO: loaded from: classes.dex */
public enum ti7 implements i10 {
    Value((byte) 0),
    CanLock((byte) 1);

    public final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    ti7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m ? (byte) 1 : (byte) 0;
    }
}
