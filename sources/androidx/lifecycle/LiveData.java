package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData.ObserverWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import o.ah6;
import o.bh6;
import o.ch6;
import o.fx3;
import o.hk0;
import o.m84;
import o.ol1;
import o.yv;
import o.zg6;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public abstract class ObserverWrapper {
        public final Observer m;
        public boolean n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f20o = -1;

        public ObserverWrapper(Observer observer) {
            this.m = observer;
        }

        public final void a(boolean z) {
            if (z == this.n) {
                return;
            }
            this.n = z;
            int i = z ? 1 : -1;
            LiveData liveData = LiveData.this;
            liveData.changeActiveCounter(i);
            if (this.n) {
                liveData.dispatchingValue(this);
            }
        }

        public void b() {
        }

        public boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean d();
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a(this);
        this.mData = obj;
        this.mVersion = -1;
    }

    public static void assertMainThread(String str) {
        yv.u().getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        hk0.l(fx3.g("Cannot invoke ", str, " on a background thread"));
    }

    public final void a(ObserverWrapper observerWrapper) {
        if (observerWrapper.n) {
            if (!observerWrapper.d()) {
                observerWrapper.a(false);
                return;
            }
            int i = observerWrapper.f20o;
            int i2 = this.mVersion;
            if (i >= i2) {
                return;
            }
            observerWrapper.f20o = i2;
            observerWrapper.m.a(this.mData);
        }
    }

    public void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i3 = this.mActiveCount;
                if (i2 == i3) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    onActive();
                } else if (z2) {
                    onInactive();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                a(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap safeIterableMap = this.mObservers;
                safeIterableMap.getClass();
                bh6 bh6Var = new bh6(safeIterableMap);
                safeIterableMap.f11o.put(bh6Var, Boolean.FALSE);
                while (bh6Var.hasNext()) {
                    a((ObserverWrapper) ((Map.Entry) bh6Var.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.p > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        assertMainThread("observe");
        if (lifecycleOwner.z().i == m84.m) {
            return;
        }
        c cVar = new c(this, lifecycleOwner, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.mObservers.a(observer, cVar);
        if (observerWrapper != null && !observerWrapper.c(lifecycleOwner)) {
            hk0.g("Cannot add the same observer with different lifecycles");
        } else {
            if (observerWrapper != null) {
                return;
            }
            lifecycleOwner.z().a(cVar);
        }
    }

    public void observeForever(Observer observer) {
        assertMainThread("observeForever");
        b bVar = new b(this, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.mObservers.a(observer, bVar);
        if (observerWrapper instanceof c) {
            hk0.g("Cannot add the same observer with different lifecycles");
        } else {
            if (observerWrapper != null) {
                return;
            }
            bVar.a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object obj) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = obj;
        }
        if (z) {
            yv yvVarU = yv.u();
            Runnable runnable = this.mPostValueRunnable;
            ol1 ol1Var = yvVarU.b;
            if (ol1Var.d == null) {
                synchronized (ol1Var.b) {
                    try {
                        if (ol1Var.d == null) {
                            ol1Var.d = ol1.u(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ol1Var.d.post(runnable);
        }
    }

    public void removeObserver(Observer observer) {
        assertMainThread("removeObserver");
        SafeIterableMap safeIterableMap = this.mObservers;
        WeakHashMap weakHashMap = safeIterableMap.f11o;
        ah6 ah6Var = safeIterableMap.m;
        while (ah6Var != null && !ah6Var.m.equals(observer)) {
            ah6Var = ah6Var.f323o;
        }
        Object obj = null;
        if (ah6Var != null) {
            safeIterableMap.p--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((ch6) it.next()).a(ah6Var);
                }
            }
            ah6 ah6Var2 = ah6Var.p;
            ah6 ah6Var3 = ah6Var.f323o;
            if (ah6Var2 != null) {
                ah6Var2.f323o = ah6Var3;
            } else {
                safeIterableMap.m = ah6Var3;
            }
            ah6 ah6Var4 = ah6Var.f323o;
            if (ah6Var4 != null) {
                ah6Var4.p = ah6Var2;
            } else {
                safeIterableMap.n = ah6Var2;
            }
            ah6Var.f323o = null;
            ah6Var.p = null;
            obj = ah6Var.n;
        }
        ObserverWrapper observerWrapper = (ObserverWrapper) obj;
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.b();
        observerWrapper.a(false);
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (true) {
            zg6 zg6Var = (zg6) it;
            if (!zg6Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) zg6Var.next();
            if (((ObserverWrapper) entry.getValue()).c(lifecycleOwner)) {
                removeObserver((Observer) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public LiveData(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a(this);
        this.mData = obj;
        this.mVersion = 0;
    }
}
