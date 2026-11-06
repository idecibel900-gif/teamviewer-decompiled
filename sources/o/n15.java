package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n15 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[bc3.values().length];
        try {
            iArr[bc3.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bc3.Away.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bc3.Busy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bc3.Offline.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bc3.Unknown.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[cc3.values().length];
        try {
            iArr2[cc3.ComputerDiscovery.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[cc3.ContactDiscovery.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[cc3.Undefined.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
