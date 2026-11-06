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
public class NativeLiveDataStringUTF8 extends LiveData {
    private final VoidSignalCallback m_callback;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;
    private static final List<NativeLiveDataStringUTF8> s_keepMeAlive = new ArrayList();
    private static final Map<Long, WeakReference<NativeLiveDataStringUTF8>> s_cache = new HashMap();

    private NativeLiveDataStringUTF8(long j, boolean z) {
        VoidSignalCallbackImpl voidSignalCallbackImpl = new VoidSignalCallbackImpl(this) { // from class: com.teamviewer.nativelivedatalib.swig.NativeLiveDataStringUTF8.1
            final /* synthetic */ NativeLiveDataStringUTF8 this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                NativeLiveDataStringUTF8 nativeLiveDataStringUTF8 = this.this$0;
                nativeLiveDataStringUTF8.setValue(nativeLiveDataStringUTF8.GetNativeValue());
            }
        };
        this.m_callback = voidSignalCallbackImpl;
        this.swigCMemOwn = z;
        this.swigCPtr = j;
        RegisterNative(voidSignalCallbackImpl);
        setValue(GetNativeValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String GetNativeValue() {
        return NativeLiveDataSWIGJNI.NativeLiveDataStringUTF8_GetNativeValue(this.swigCPtr, this);
    }

    private void RegisterNative(VoidSignalCallback voidSignalCallback) {
        NativeLiveDataSWIGJNI.NativeLiveDataStringUTF8_RegisterNative(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(NativeLiveDataStringUTF8 nativeLiveDataStringUTF8) {
        if (nativeLiveDataStringUTF8 == null) {
            return 0L;
        }
        return nativeLiveDataStringUTF8.swigCPtr;
    }

    public static NativeLiveDataStringUTF8 newInstance(long j, boolean z) {
        Map<Long, WeakReference<NativeLiveDataStringUTF8>> map = s_cache;
        WeakReference<NativeLiveDataStringUTF8> weakReference = map.get(Long.valueOf(j));
        NativeLiveDataStringUTF8 nativeLiveDataStringUTF8 = weakReference != null ? weakReference.get() : null;
        if (nativeLiveDataStringUTF8 != null) {
            return nativeLiveDataStringUTF8;
        }
        NativeLiveDataStringUTF8 nativeLiveDataStringUTF9 = new NativeLiveDataStringUTF8(j, z);
        map.put(Long.valueOf(j), new WeakReference<>(nativeLiveDataStringUTF9));
        return nativeLiveDataStringUTF9;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                s_cache.remove(Long.valueOf(j));
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NativeLiveDataSWIGJNI.delete_NativeLiveDataStringUTF8(this.swigCPtr);
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
