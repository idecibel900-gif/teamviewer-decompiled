package o;

/* JADX INFO: loaded from: classes.dex */
public enum ms4 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    Uuid((byte) 1),
    ReadableName((byte) 2),
    Flags((byte) 3),
    EnforceLevel((byte) 4);

    public final byte m;

    ms4(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
