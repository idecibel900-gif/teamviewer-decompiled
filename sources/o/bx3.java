package o;

/* JADX INFO: loaded from: classes.dex */
public enum bx3 implements pl3 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public final int m;

    bx3(int i) {
        this.m = i;
    }
}
