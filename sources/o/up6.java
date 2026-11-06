package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class up6 {
    public static final hr2 b;
    public static final hr2 c;
    public static final hr2 d;
    public static final hr2 e;
    public static final int a = n67.t(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = n67.t(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        byte b2 = 14;
        b = new hr2("PERMIT", b2);
        c = new hr2("TAKEN", b2);
        d = new hr2("BROKEN", b2);
        e = new hr2("CANCELLED", b2);
    }
}
