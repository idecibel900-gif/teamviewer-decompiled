package o;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class hr8 extends b77 {
    public final /* synthetic */ byte d;

    @Override // o.b77
    public final long q() {
        switch (this.d) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
