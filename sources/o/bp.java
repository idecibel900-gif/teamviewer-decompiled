package o;

/* JADX INFO: loaded from: classes2.dex */
public enum bp {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF24(true, true);

    public final boolean m;
    public final boolean n;

    /* synthetic */ bp(int i) {
        this((i & 1) == 0, false);
    }

    bp(boolean z, boolean z2) {
        this.m = z;
        this.n = z2;
    }
}
