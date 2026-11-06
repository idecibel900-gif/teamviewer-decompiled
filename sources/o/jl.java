package o;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jl implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ kl m;

    public jl(kl klVar) {
        this.m = klVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.m.p.removeCallbacks(this);
        this.m.O0();
        kl klVar = this.m;
        synchronized (klVar.q) {
            if (klVar.v) {
                klVar.v = false;
                ArrayList arrayList = klVar.s;
                klVar.s = klVar.t;
                klVar.t = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.O0();
        kl klVar = this.m;
        synchronized (klVar.q) {
            if (klVar.s.isEmpty()) {
                klVar.f1276o.removeFrameCallback(this);
                klVar.v = false;
            }
        }
    }
}
