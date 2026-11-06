package o;

/* JADX INFO: loaded from: classes2.dex */
public enum lw5 implements ol3 {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    lw5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
