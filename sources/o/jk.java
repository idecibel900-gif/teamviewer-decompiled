package o;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jk implements sr5, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long t;
    public final View m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1174o;
    public boolean r;
    public long s;
    public final PriorityQueue n = new PriorityQueue(11, new hk((byte) 0));
    public final Choreographer p = Choreographer.getInstance();
    public final ik q = new ik();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public jk(View view) {
        float refreshRate;
        this.m = view;
        if (t == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            t = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.r = true;
        }
    }

    @Override // o.sr5
    public final void a(rr5 rr5Var) {
        this.n.add(new vs5(1, rr5Var));
        if (this.f1174o) {
            return;
        }
        this.f1174o = true;
        this.m.post(this);
    }

    public final boolean b() {
        ik ikVar = this.q;
        long jA = ikVar.a();
        hm3.F("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.n;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((vs5) objPeek).b.b(ikVar)) {
                priorityQueue.poll();
                z = false;
            }
            ikVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.r) {
            this.s = j;
            this.m.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.r = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.r = false;
        this.m.removeCallbacks(this);
        this.p.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.n;
        if (!priorityQueue.isEmpty() && this.f1174o && this.r) {
            View view = this.m;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * t) + nanos;
                ik ikVar = this.q;
                ikVar.a = z;
                ikVar.b = Math.max(this.s, nanos) + t;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (ikVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.p.postFrameCallback(this);
                } else {
                    this.f1174o = false;
                }
                hm3.F("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f1174o = false;
    }
}
