package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n75 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[l84.values().length];
        try {
            iArr[l84.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l84.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l84.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
