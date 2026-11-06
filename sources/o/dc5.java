package o;

/* JADX INFO: loaded from: classes.dex */
public enum dc5 implements pl3 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int m;

    dc5(int i) {
        this.m = i;
    }

    public static dc5 a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        hk0.g("Can't get the number of an unknown enum value.");
        return 0;
    }
}
