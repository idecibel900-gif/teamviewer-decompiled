package o;

/* JADX INFO: loaded from: classes.dex */
public enum ij7 implements i10 {
    Virtual((byte) 0),
    Unicode((byte) 1),
    Released((byte) 2),
    Extended((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    ResetKeyboard((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    NumlockActive((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    LeftRightVirtual((byte) 8),
    VirtualUnicodeHint((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    RepeatingEvent((byte) 10);

    public final byte m;

    ij7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
