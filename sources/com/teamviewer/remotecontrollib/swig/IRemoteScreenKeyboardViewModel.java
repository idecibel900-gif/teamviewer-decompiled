package com.teamviewer.remotecontrollib.swig;

import o.hk0;
import o.ua5;
import o.vc3;

/* JADX INFO: loaded from: classes.dex */
public final class IRemoteScreenKeyboardViewModel {
    public transient long a;
    public transient boolean b;

    public final vc3 a() {
        int iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem = IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem(this.a, this);
        vc3 vc3Var = vc3.Unknown;
        vc3[] vc3VarArr = (vc3[]) vc3.class.getEnumConstants();
        if (iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem < vc3VarArr.length && iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem >= 0) {
            vc3 vc3Var2 = vc3VarArr[iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem];
            if (vc3Var2.m == iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem) {
                return vc3Var2;
            }
        }
        for (vc3 vc3Var3 : vc3VarArr) {
            if (vc3Var3.m == iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem) {
                return vc3Var3;
            }
        }
        hk0.g(ua5.k(iIRemoteScreenKeyboardViewModel_GetRemoteOperatingSystem, vc3.class, "No enum ", " with value "));
        return null;
    }

    public final synchronized void b() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IRemoteScreenKeyboardViewModelSWIGJNI.delete_IRemoteScreenKeyboardViewModel(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        b();
    }
}
