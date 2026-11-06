package o;

/* JADX INFO: loaded from: classes.dex */
public enum ox3 implements pl3 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int m;

    ox3(int i) {
        this.m = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        hk0.g("Can't get the number of an unknown enum value.");
        return 0;
    }
}
