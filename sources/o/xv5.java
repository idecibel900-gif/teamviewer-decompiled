package o;

/* JADX INFO: loaded from: classes2.dex */
public enum xv5 implements ol3 {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    xv5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
