package o;

/* JADX INFO: loaded from: classes2.dex */
public enum av5 implements ol3 {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    av5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
