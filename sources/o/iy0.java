package o;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class iy0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long m = SystemClock.uptimeMillis() + 10000;
    public Runnable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1113o;
    public final /* synthetic */ my0 p;

    public iy0(my0 my0Var) {
        this.p = my0Var;
    }

    public final void a(View view) {
        if (this.f1113o) {
            return;
        }
        this.f1113o = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
        View decorView = this.p.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f1113o) {
            decorView.postOnAnimation(new pc0((Object) this, (byte) 6));
        } else if (im3.n(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.n;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.m) {
                this.f1113o = false;
                this.p.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.n = null;
        tv2 tv2Var = (tv2) this.p.s.getValue();
        synchronized (tv2Var.b) {
            z = tv2Var.c;
        }
        if (z) {
            this.f1113o = false;
            this.p.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
