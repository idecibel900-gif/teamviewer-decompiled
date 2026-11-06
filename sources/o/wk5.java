package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wk5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mf1.values().length];
        try {
            iArr[mf1.Viewer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mf1.None.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
