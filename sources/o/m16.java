package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m16 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[vc3.values().length];
        try {
            iArr[vc3.OSVersion_OSX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vc3.OSVersion_Linux.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
