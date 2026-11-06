package com.teamviewer.remotecontrollib.swig;

import o.hk0;
import o.qs1;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum LoginState {
    NotReady,
    NotReady_LoginPending,
    ReadyForLogin,
    LoginInProgress,
    LoggedIn;

    public final int m;

    LoginState() {
        int i = qs1.b;
        qs1.b = i + 1;
        this.m = i;
    }

    public static LoginState a(int i) {
        LoginState[] loginStateArr = (LoginState[]) LoginState.class.getEnumConstants();
        if (i < loginStateArr.length && i >= 0) {
            LoginState loginState = loginStateArr[i];
            if (loginState.m == i) {
                return loginState;
            }
        }
        for (LoginState loginState2 : loginStateArr) {
            if (loginState2.m == i) {
                return loginState2;
            }
        }
        hk0.g(ua5.k(i, LoginState.class, "No enum ", " with value "));
        return null;
    }

    LoginState() {
        this.m = 0;
        qs1.b = 1;
    }
}
