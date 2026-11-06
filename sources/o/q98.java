package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q98 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ug2.values().length];
        try {
            iArr[ug2.RequestIncomingTransfer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ug2.NewFile.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ug2.FileChunk.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ug2.ReplyEndFileTransfer.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ug2.Error.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
