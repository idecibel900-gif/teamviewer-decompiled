package o;

/* JADX INFO: loaded from: classes2.dex */
public enum kv5 implements ol3 {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    kv5(int i) {
        this.m = i;
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
