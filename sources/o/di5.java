package o;

import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class di5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoginState.values().length];
        try {
            iArr[LoginState.LoggedIn.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoginState.ReadyForLogin.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
