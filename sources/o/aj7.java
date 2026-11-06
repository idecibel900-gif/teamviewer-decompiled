package o;

/* JADX INFO: loaded from: classes.dex */
public enum aj7 implements i10 {
    Version((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    MinDataSize((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    RemoveEntries((byte) 3),
    /* JADX INFO: Fake field, exist only in values array */
    StoreWindow((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    RestoreWindow((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    WindowHandle((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    Rectangle((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    StoreScrolledLines((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    RestoreScrolledLines((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    ClearCache((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    CacheType((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    ExistingLines((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    AdjustCleanupSize((byte) 13);

    public final byte m;

    aj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
