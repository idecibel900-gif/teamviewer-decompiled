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
public class NativeLiveDataSize extends LiveData {
    private final VoidSignalCallback m_callback;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;
    private static final List<NativeLiveDataSize> s_keepMeAlive = new ArrayList();
    private static final Map<Long, WeakReference<NativeLiveDataSize>> s_cache = new HashMap();

    private NativeLiveDataSize(long j, boolean z) {
        VoidSignalCallbackImpl voidSignalCallbackImpl = new VoidSignalCallbackImpl(this) { // from class: com.teamviewer.nativelivedatalib.swig.NativeLiveDataSize.1
            final /* synthetic */ NativeLiveDataSize this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                NativeLiveDataSize nativeLiveDataSize = this.this$0;
                nativeLiveDataSize.setValue(nativeLiveDataSize.GetNativeValue());
            }
        };
        this.m_callback = voidSignalCallbackImpl;
        this.swigCMemOwn = z;
        this.swigCPtr = j;
        RegisterNative(voidSignalCallbackImpl);
        setValue(GetNativeValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.util.Size GetNativeValue() {
        long jNativeLiveDataSize_GetNativeValue = NativeLiveDataSWIGJNI.NativeLiveDataSize_GetNativeValue(this.swigCPtr, this);
        return new android.util.Size((int) (jNativeLiveDataSize_GetNativeValue >> 32), (int) jNativeLiveDataSize_GetNativeValue);
    }

    private void RegisterNative(VoidSignalCallback voidSignalCallback) {
        NativeLiveDataSWIGJNI.NativeLiveDataSize_RegisterNative(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(NativeLiveDataSize nativeLiveDataSize) {
        if (nativeLiveDataSize == null) {
            return 0L;
        }
        return nativeLiveDataSize.swigCPtr;
    }

    public static NativeLiveDataSize newInstance(long j, boolean z) {
        Map<Long, WeakReference<NativeLiveDataSize>> map = s_cache;
        WeakReference<NativeLiveDataSize> weakReference = map.get(Long.valueOf(j));
        NativeLiveDataSize nativeLiveDataSize = weakReference != null ? weakReference.get() : null;
        if (nativeLiveDataSize != null) {
            return nativeLiveDataSize;
        }
        NativeLiveDataSize nativeLiveDataSize2 = new NativeLiveDataSize(j, z);
        map.put(Long.valueOf(j), new WeakReference<>(nativeLiveDataSize2));
        return nativeLiveDataSize2;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                s_cache.remove(Long.valueOf(j));
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NativeLiveDataSWIGJNI.delete_NativeLiveDataSize(this.swigCPtr);
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
