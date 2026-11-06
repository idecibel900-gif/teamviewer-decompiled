package com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow;

import androidx.lifecycle.LiveData;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.ArrayList;
import java.util.HashMap;
import o.az4;

/* JADX INFO: loaded from: classes.dex */
public final class NativeLiveDataSessionData extends LiveData {
    public static final ArrayList c = new ArrayList();
    public static final HashMap d = new HashMap();
    public transient long a;
    public final az4 b;

    public NativeLiveDataSessionData(long j) {
        az4 az4Var = new az4(this, (byte) 2);
        this.b = az4Var;
        this.a = j;
        IViewManagerViewModelSWIGJNI.NativeLiveDataSessionData_RegisterNative(j, this, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var), az4Var);
        long jNativeLiveDataSessionData_GetNativeValue = IViewManagerViewModelSWIGJNI.NativeLiveDataSessionData_GetNativeValue(this.a, this);
        SessionData sessionData = new SessionData();
        sessionData.b = true;
        sessionData.a = jNativeLiveDataSessionData_GetNativeValue;
        setValue(sessionData);
    }

    public final void finalize() {
        synchronized (this) {
            long j = this.a;
            if (j != 0) {
                d.remove(Long.valueOf(j));
                this.a = 0L;
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        c.add(this);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        c.remove(this);
    }
}
