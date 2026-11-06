package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class sq6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[qq6.values().length];
        try {
            iArr[qq6.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qq6.Offline.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
