package o;

import com.teamviewer.commonviewmodel.swig.ViewModelOnlineState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q33 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[s33.values().length];
        try {
            iArr[s33.Contact.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[ViewModelOnlineState.values().length];
        try {
            iArr2[ViewModelOnlineState.Online.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ViewModelOnlineState.OnlineAway.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ViewModelOnlineState.OnlineBusy.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
