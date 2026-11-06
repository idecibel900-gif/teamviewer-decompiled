package o;

/* JADX INFO: loaded from: classes2.dex */
public enum gt3 implements ol3 {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    gt3(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
