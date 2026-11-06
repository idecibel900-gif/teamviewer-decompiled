package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import o.g95;
import o.l84;
import o.pc0;
import o.x84;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "o/eq", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final ProcessLifecycleOwner u = new ProcessLifecycleOwner();
    public int m;
    public int n;
    public Handler q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21o = true;
    public boolean p = true;
    public final x84 r = new x84(this, true);
    public final pc0 s = new pc0((Object) this, (byte) 24);
    public final g95 t = new g95(this);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i = this.n + 1;
        this.n = i;
        if (i == 1) {
            if (this.f21o) {
                this.r.d(l84.ON_RESUME);
                this.f21o = false;
            } else {
                Handler handler = this.q;
                handler.getClass();
                handler.removeCallbacks(this.s);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: z, reason: from getter */
    public final x84 getR() {
        return this.r;
    }
}
