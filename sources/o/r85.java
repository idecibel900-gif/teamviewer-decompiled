package o;

import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r85 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoginState.values().length];
        try {
            iArr[LoginState.LoggedIn.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
