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
public class NativeLiveDataBool extends LiveData {
    private final VoidSignalCallback m_callback;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;
    private static final List<NativeLiveDataBool> s_keepMeAlive = new ArrayList();
    private static final Map<Long, WeakReference<NativeLiveDataBool>> s_cache = new HashMap();

    private NativeLiveDataBool(long j, boolean z) {
        VoidSignalCallbackImpl voidSignalCallbackImpl = new VoidSignalCallbackImpl(this) { // from class: com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool.1
            final /* synthetic */ NativeLiveDataBool this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
            public void OnCallback() {
                NativeLiveDataBool nativeLiveDataBool = this.this$0;
                nativeLiveDataBool.setValue(Boolean.valueOf(nativeLiveDataBool.GetNativeValue()));
            }
        };
        this.m_callback = voidSignalCallbackImpl;
        this.swigCMemOwn = z;
        this.swigCPtr = j;
        RegisterNative(voidSignalCallbackImpl);
        setValue(Boolean.valueOf(GetNativeValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean GetNativeValue() {
        return NativeLiveDataSWIGJNI.NativeLiveDataBool_GetNativeValue(this.swigCPtr, this);
    }

    private void RegisterNative(VoidSignalCallback voidSignalCallback) {
        NativeLiveDataSWIGJNI.NativeLiveDataBool_RegisterNative(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public static long getCPtr(NativeLiveDataBool nativeLiveDataBool) {
        if (nativeLiveDataBool == null) {
            return 0L;
        }
        return nativeLiveDataBool.swigCPtr;
    }

    public static NativeLiveDataBool newInstance(long j, boolean z) {
        Map<Long, WeakReference<NativeLiveDataBool>> map = s_cache;
        WeakReference<NativeLiveDataBool> weakReference = map.get(Long.valueOf(j));
        NativeLiveDataBool nativeLiveDataBool = weakReference != null ? weakReference.get() : null;
        if (nativeLiveDataBool != null) {
            return nativeLiveDataBool;
        }
        NativeLiveDataBool nativeLiveDataBool2 = new NativeLiveDataBool(j, z);
        map.put(Long.valueOf(j), new WeakReference<>(nativeLiveDataBool2));
        return nativeLiveDataBool2;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                s_cache.remove(Long.valueOf(j));
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    NativeLiveDataSWIGJNI.delete_NativeLiveDataBool(this.swigCPtr);
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
