package com.teamviewer.nativelivedatalib;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import o.im3;
import o.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u0007J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/nativelivedatalib/NativeLiveDataWrapper;", "T", "Landroidx/lifecycle/LiveData;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "nativeLiveData", "(Landroidx/lifecycle/LiveData;)V", "liveData", "Lo/f88;", "registerOnNativeValue", "unregisterFromNativeValue", "()V", "getValue", "()Ljava/lang/Object;", "onActive", "onInactive", "Landroidx/lifecycle/Observer;", "nativeValueObserver", "Landroidx/lifecycle/Observer;", "Landroidx/lifecycle/LiveData;", "", "stayRegisteredWhileObserving", "Z", "NativeLiveDataLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NativeLiveDataWrapper<T> extends LiveData {
    private LiveData nativeLiveData;
    private final Observer nativeValueObserver;
    private boolean stayRegisteredWhileObserving;

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeLiveDataWrapper(LiveData liveData) {
        liveData.getClass();
        Object value = liveData.getValue();
        value.getClass();
        this(value);
        this.nativeLiveData = liveData;
        this.stayRegisteredWhileObserving = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nativeValueObserver$lambda$0(NativeLiveDataWrapper nativeLiveDataWrapper, Object obj) {
        if (im3.n(super.getValue(), obj)) {
            return;
        }
        nativeLiveDataWrapper.setValue(obj);
    }

    @Override // androidx.lifecycle.LiveData
    public T getValue() {
        LiveData liveData = this.nativeLiveData;
        if (liveData != null) {
            return (T) liveData.getValue();
        }
        return null;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        LiveData liveData;
        if (!this.stayRegisteredWhileObserving || (liveData = this.nativeLiveData) == null) {
            return;
        }
        liveData.observeForever(this.nativeValueObserver);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        if (this.stayRegisteredWhileObserving) {
            unregisterFromNativeValue();
        }
    }

    public final void registerOnNativeValue(LiveData liveData) {
        liveData.getClass();
        unregisterFromNativeValue();
        this.nativeLiveData = liveData;
        liveData.observeForever(this.nativeValueObserver);
    }

    public final void unregisterFromNativeValue() {
        LiveData liveData = this.nativeLiveData;
        if (liveData != null) {
            liveData.removeObserver(this.nativeValueObserver);
        }
    }

    public NativeLiveDataWrapper(T t) {
        super(t);
        this.nativeValueObserver = new p((Object) this, (byte) 5);
    }
}
