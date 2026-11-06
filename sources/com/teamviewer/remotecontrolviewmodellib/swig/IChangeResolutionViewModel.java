package com.teamviewer.remotecontrolviewmodellib.swig;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class IChangeResolutionViewModel {
    public transient long a;
    public transient boolean b;

    public final NativeLiveDataListOfResolutions a() {
        long jIChangeResolutionViewModel_AllResolutions = IChangeResolutionViewModelSWIGJNI.IChangeResolutionViewModel_AllResolutions(this.a, this);
        HashMap map = NativeLiveDataListOfResolutions.d;
        WeakReference weakReference = (WeakReference) map.get(Long.valueOf(jIChangeResolutionViewModel_AllResolutions));
        NativeLiveDataListOfResolutions nativeLiveDataListOfResolutions = weakReference != null ? (NativeLiveDataListOfResolutions) weakReference.get() : null;
        if (nativeLiveDataListOfResolutions != null) {
            return nativeLiveDataListOfResolutions;
        }
        NativeLiveDataListOfResolutions nativeLiveDataListOfResolutions2 = new NativeLiveDataListOfResolutions(jIChangeResolutionViewModel_AllResolutions);
        map.put(Long.valueOf(jIChangeResolutionViewModel_AllResolutions), new WeakReference(nativeLiveDataListOfResolutions2));
        return nativeLiveDataListOfResolutions2;
    }

    public final NativeLiveDataResolution b() {
        long jIChangeResolutionViewModel_CurrentResolution = IChangeResolutionViewModelSWIGJNI.IChangeResolutionViewModel_CurrentResolution(this.a, this);
        HashMap map = NativeLiveDataResolution.d;
        WeakReference weakReference = (WeakReference) map.get(Long.valueOf(jIChangeResolutionViewModel_CurrentResolution));
        NativeLiveDataResolution nativeLiveDataResolution = weakReference != null ? (NativeLiveDataResolution) weakReference.get() : null;
        if (nativeLiveDataResolution != null) {
            return nativeLiveDataResolution;
        }
        NativeLiveDataResolution nativeLiveDataResolution2 = new NativeLiveDataResolution(jIChangeResolutionViewModel_CurrentResolution);
        map.put(Long.valueOf(jIChangeResolutionViewModel_CurrentResolution), new WeakReference(nativeLiveDataResolution2));
        return nativeLiveDataResolution2;
    }

    public final synchronized void c() {
        try {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    IChangeResolutionViewModelSWIGJNI.delete_IChangeResolutionViewModel(j);
                }
                this.a = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void finalize() {
        c();
    }
}
