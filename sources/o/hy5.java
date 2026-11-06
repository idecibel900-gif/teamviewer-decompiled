package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hy5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[l84.values().length];
        try {
            iArr[l84.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l84.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
