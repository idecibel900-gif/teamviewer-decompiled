package o;

/* JADX INFO: loaded from: classes2.dex */
public enum fv5 implements ol3 {
    TRUE(0),
    FALSE(1),
    NULL(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    fv5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
