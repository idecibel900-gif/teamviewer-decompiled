package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class wk4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[qr4.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[ViewModelOnlineState.values().length];
        try {
            iArr2[ViewModelOnlineState.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ViewModelOnlineState.OnlineAway.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
