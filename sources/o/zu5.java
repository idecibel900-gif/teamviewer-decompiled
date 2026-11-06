package o;

/* JADX INFO: loaded from: classes2.dex */
public enum zu5 implements ol3 {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    zu5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
