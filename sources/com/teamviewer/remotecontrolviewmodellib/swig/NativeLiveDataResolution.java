package com.teamviewer.remotecontrolviewmodellib.swig;

import androidx.lifecycle.LiveData;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.ArrayList;
import java.util.HashMap;
import o.az4;

/* JADX INFO: loaded from: classes.dex */
public final class NativeLiveDataResolution extends LiveData {
    public static final ArrayList c = new ArrayList();
    public static final HashMap d = new HashMap();
    public transient long a;
    public final az4 b;

    public NativeLiveDataResolution(long j) {
        az4 az4Var = new az4(this, (byte) 1);
        this.b = az4Var;
        this.a = j;
        IChangeResolutionViewModelSWIGJNI.NativeLiveDataResolution_RegisterNative(j, this, VoidSignalCallback.getCPtr((VoidSignalCallback) az4Var), az4Var);
        setValue(new Resolution(IChangeResolutionViewModelSWIGJNI.NativeLiveDataResolution_GetNativeValue(this.a, this), true));
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
