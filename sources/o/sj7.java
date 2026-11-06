package o;

/* JADX INFO: loaded from: classes.dex */
public enum sj7 implements i10 {
    MarkerX((byte) 0),
    MarkerY((byte) 1);

    public final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    sj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m ? (byte) 1 : (byte) 0;
    }
}
