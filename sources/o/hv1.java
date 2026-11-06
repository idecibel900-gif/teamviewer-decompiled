package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hv1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ViewModelOnlineState.values().length];
        try {
            iArr[ViewModelOnlineState.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewModelOnlineState.OnlineAway.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewModelOnlineState.OnlineBusy.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
