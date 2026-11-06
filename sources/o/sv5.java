package o;

/* JADX INFO: loaded from: classes2.dex */
public enum sv5 implements ol3 {
    CLASS(0),
    PACKAGE(1),
    LOCAL(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    sv5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
