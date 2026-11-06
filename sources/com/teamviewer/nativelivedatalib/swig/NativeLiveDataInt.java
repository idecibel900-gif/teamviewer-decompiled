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
public class NativeLiveDataInt extends LiveData {
    private final VoidSignalCallback m_callback;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;
    private static final List<NativeLiveDataInt> s_keepMeAlive = new ArrayList();
    private static final Map<Long, WeakReference<NativeLiveDataInt>> s_cache = new HashMap();

    private NativeLiveDataInt(long j, boolean z) {
        VoidSignalCallbackImpl voidSignalCallbackImpl = new VoidSignalCallbackImpl(this) { // from class: com.teamviewer.nativelivedatalib.swig.NativeLiveDataInt.1
            final /* synthetic */ NativeLiveDataInt this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                NativeLiveDataInt nativeLiveDataInt = this.this$0;
                nativeLiveDataInt.setValue(Integer.valueOf(nativeLiveDataInt.GetNativeValue()));
            }
        };
        this.m_callback = voidSignalCallbackImpl;
        this.swigCMemOwn = z;
        this.swigCPtr = j;
        RegisterNative(voidSignalCallbackImpl);
        setValue(Integer.valueOf(GetNativeValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int GetNativeValue() {
        return NativeLiveDataSWIGJNI.NativeLiveDataInt_GetNativeValue(this.swigCPtr, this);
    }

    private void RegisterNative(VoidSignalCallback voidSignalCallback) {
        NativeLiveDataSWIGJNI.NativeLiveDataInt_RegisterNative(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(NativeLiveDataInt nativeLiveDataInt) {
        if (nativeLiveDataInt == null) {
            return 0L;
        }
        return nativeLiveDataInt.swigCPtr;
    }

    public static NativeLiveDataInt newInstance(long j, boolean z) {
        Map<Long, WeakReference<NativeLiveDataInt>> map = s_cache;
        WeakReference<NativeLiveDataInt> weakReference = map.get(Long.valueOf(j));
        NativeLiveDataInt nativeLiveDataInt = weakReference != null ? weakReference.get() : null;
        if (nativeLiveDataInt != null) {
            return nativeLiveDataInt;
        }
        NativeLiveDataInt nativeLiveDataInt2 = new NativeLiveDataInt(j, z);
        map.put(Long.valueOf(j), new WeakReference<>(nativeLiveDataInt2));
        return nativeLiveDataInt2;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                s_cache.remove(Long.valueOf(j));
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NativeLiveDataSWIGJNI.delete_NativeLiveDataInt(this.swigCPtr);
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
