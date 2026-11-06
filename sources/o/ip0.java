package o;

import com.teamviewer.chatviewmodel.swig.ChatMessageState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ip0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChatMessageState.values().length];
        try {
            iArr[ChatMessageState.WasRead.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatMessageState.WasSent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
