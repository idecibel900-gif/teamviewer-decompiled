package o;

/* JADX INFO: loaded from: classes2.dex */
public enum ew5 implements ol3 {
    IN(0),
    OUT(1),
    INV(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    ew5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
