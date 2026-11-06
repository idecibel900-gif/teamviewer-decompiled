package o;

import com.teamviewer.chatviewmodel.swig.ErrorMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ck4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorMessage.values().length];
        try {
            iArr[ErrorMessage.EndpointIsOffline.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorMessage.EndpointIsUnknown.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorMessage.CannotOpenChatToMyself.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
