package o;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public abstract class il0 {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
