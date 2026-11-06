package o;

/* JADX INFO: loaded from: classes.dex */
public enum vj7 implements i10 {
    /* JADX INFO: Fake field, exist only in values array */
    Encoding((byte) 0),
    /* JADX INFO: Fake field, exist only in values array */
    Rect((byte) 1),
    /* JADX INFO: Fake field, exist only in values array */
    Data((byte) 5),
    Number((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    OldLeft((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    OldTop((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    UsedColors((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    ColorsPal((byte) 11),
    /* JADX INFO: Fake field, exist only in values array */
    SameMarker((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    Line((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    DataCached((byte) 14),
    /* JADX INFO: Fake field, exist only in values array */
    RequestRedrawLocalMonitor((byte) 15);

    public final byte m;

    vj7(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
