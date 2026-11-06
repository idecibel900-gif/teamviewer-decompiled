package o;

/* JADX INFO: loaded from: classes.dex */
public enum hs6 implements i10 {
    Show((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Participant((byte) 2);

    public final byte m;

    hs6(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
