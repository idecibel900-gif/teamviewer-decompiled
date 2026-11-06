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
public class NativeLiveDataString extends LiveData {
    private final VoidSignalCallback m_callback;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;
    private static final List<NativeLiveDataString> s_keepMeAlive = new ArrayList();
    private static final Map<Long, WeakReference<NativeLiveDataString>> s_cache = new HashMap();

    private NativeLiveDataString(long j, boolean z) {
        VoidSignalCallbackImpl voidSignalCallbackImpl = new VoidSignalCallbackImpl(this) { // from class: com.teamviewer.nativelivedatalib.swig.NativeLiveDataString.1
            final /* synthetic */ NativeLiveDataString this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                NativeLiveDataString nativeLiveDataString = this.this$0;
                nativeLiveDataString.setValue(nativeLiveDataString.GetNativeValue());
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
        return NativeLiveDataSWIGJNI.NativeLiveDataString_GetNativeValue(this.swigCPtr, this);
    }

    private void RegisterNative(VoidSignalCallback voidSignalCallback) {
        NativeLiveDataSWIGJNI.NativeLiveDataString_RegisterNative(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(NativeLiveDataString nativeLiveDataString) {
        if (nativeLiveDataString == null) {
            return 0L;
        }
        return nativeLiveDataString.swigCPtr;
    }

    public static NativeLiveDataString newInstance(long j, boolean z) {
        Map<Long, WeakReference<NativeLiveDataString>> map = s_cache;
        WeakReference<NativeLiveDataString> weakReference = map.get(Long.valueOf(j));
        NativeLiveDataString nativeLiveDataString = weakReference != null ? weakReference.get() : null;
        if (nativeLiveDataString != null) {
            return nativeLiveDataString;
        }
        NativeLiveDataString nativeLiveDataString2 = new NativeLiveDataString(j, z);
        map.put(Long.valueOf(j), new WeakReference<>(nativeLiveDataString2));
        return nativeLiveDataString2;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                s_cache.remove(Long.valueOf(j));
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NativeLiveDataSWIGJNI.delete_NativeLiveDataString(this.swigCPtr);
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
