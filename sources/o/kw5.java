package o;

/* JADX INFO: loaded from: classes2.dex */
public enum kw5 implements ol3 {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    kw5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
