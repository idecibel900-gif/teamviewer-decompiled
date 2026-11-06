package com.teamviewer.nativelivedatalib.swig;

import androidx.lifecycle.LiveData;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.swigcallbacklib.VoidSignalCallbackImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class NativeLiveDataFloat extends LiveData {
    private final VoidSignalCallback m_callback;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;
    private static final List<NativeLiveDataFloat> s_keepMeAlive = new ArrayList();
    private static final Map<Long, WeakReference<NativeLiveDataFloat>> s_cache = new HashMap();

    private NativeLiveDataFloat(long j, boolean z) {
        VoidSignalCallbackImpl voidSignalCallbackImpl = new VoidSignalCallbackImpl(this) { // from class: com.teamviewer.nativelivedatalib.swig.NativeLiveDataFloat.1
            final /* synthetic */ NativeLiveDataFloat this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                NativeLiveDataFloat nativeLiveDataFloat = this.this$0;
                nativeLiveDataFloat.setValue(Float.valueOf(nativeLiveDataFloat.GetNativeValue()));
            }
        };
        this.m_callback = voidSignalCallbackImpl;
        this.swigCMemOwn = z;
        this.swigCPtr = j;
        RegisterNative(voidSignalCallbackImpl);
        setValue(Float.valueOf(GetNativeValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float GetNativeValue() {
        return NativeLiveDataSWIGJNI.NativeLiveDataFloat_GetNativeValue(this.swigCPtr, this);
    }

    private void RegisterNative(VoidSignalCallback voidSignalCallback) {
        NativeLiveDataSWIGJNI.NativeLiveDataFloat_RegisterNative(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(NativeLiveDataFloat nativeLiveDataFloat) {
        if (nativeLiveDataFloat == null) {
            return 0L;
        }
        return nativeLiveDataFloat.swigCPtr;
    }

    public static NativeLiveDataFloat newInstance(long j, boolean z) {
        Map<Long, WeakReference<NativeLiveDataFloat>> map = s_cache;
        WeakReference<NativeLiveDataFloat> weakReference = map.get(Long.valueOf(j));
        NativeLiveDataFloat nativeLiveDataFloat = weakReference != null ? weakReference.get() : null;
        if (nativeLiveDataFloat != null) {
            return nativeLiveDataFloat;
        }
        NativeLiveDataFloat nativeLiveDataFloat2 = new NativeLiveDataFloat(j, z);
        map.put(Long.valueOf(j), new WeakReference<>(nativeLiveDataFloat2));
        return nativeLiveDataFloat2;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                s_cache.remove(Long.valueOf(j));
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NativeLiveDataSWIGJNI.delete_NativeLiveDataFloat(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        s_keepMeAlive.add(this);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        s_keepMeAlive.remove(this);
    }
}
