package o;

import com.teamviewer.chatviewmodel.swig.ListChangeArgs;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ua4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ListChangeArgs.ListChangeType.values().length];
        try {
            iArr[ListChangeArgs.ListChangeType.Added.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ListChangeArgs.ListChangeType.Removed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ListChangeArgs.ListChangeType.Moved.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ListChangeArgs.ListChangeType.Replace.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ListChangeArgs.ListChangeType.Reset.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
