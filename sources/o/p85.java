package o;

import com.teamviewer.oneapinetworklib.swig.OneAPIEventHandlerAndroid;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.StringSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class p85 implements ho2 {
    public static final p85 m = new p85();

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        int iOrdinal = ((m51) obj).ordinal();
        if (iOrdinal == 0) {
            synchronized (q85.a) {
                if (q85.b == null) {
                    q85.d.set(true);
                    q85.b = OneAPIEventHandlerAndroid.Create();
                    StringSignalCallback stringSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().stringSignalCallback(new at4((byte) 12));
                    q85.c = stringSignalCallback;
                    OneAPIEventHandlerAndroid oneAPIEventHandlerAndroid = q85.b;
                    if (oneAPIEventHandlerAndroid != null) {
                        oneAPIEventHandlerAndroid.RegisterForOneAPIEvents(stringSignalCallback);
                    }
                }
            }
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return null;
            }
            synchronized (q85.a) {
                try {
                    if (q85.d.compareAndSet(true, false)) {
                        StringSignalCallback stringSignalCallback2 = q85.c;
                        if (stringSignalCallback2 != null) {
                            stringSignalCallback2.Disconnect();
                        }
                        q85.c = null;
                        q85.b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f88.a;
    }
}
