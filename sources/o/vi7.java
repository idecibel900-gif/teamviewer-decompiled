package o;

/* JADX INFO: loaded from: classes.dex */
public enum vi7 implements i10 {
    MaxResolutionWidth((byte) 1),
    MaxResolutionHeight((byte) 2);

    public final byte m;

    vi7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
