package o;

import com.teamviewer.remotecontrollib.swig.LoginState;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ii5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoginState.values().length];
        try {
            iArr[LoginState.ReadyForLogin.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoginState.LoggedIn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoginState.NotReady_LoginPending.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LoginState.LoginInProgress.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LoginState.NotReady.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
