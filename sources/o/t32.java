package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class t32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ug2.values().length];
        try {
            iArr[ug2.ReplyBeginFileTransfer.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ug2.ReplyFileRecursionStatus.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ug2.PublishNewDirectory.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ug2.NewFile.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ug2.FileChunk.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ug2.ReplyEndFileTransfer.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
