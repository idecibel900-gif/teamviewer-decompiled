package o;

/* JADX INFO: loaded from: classes.dex */
public enum ui7 implements i10 {
    Width((byte) 1),
    Heigth((byte) 2),
    BPP((byte) 3),
    Frequency((byte) 4),
    Monitor((byte) 5);

    public final byte m;

    ui7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
