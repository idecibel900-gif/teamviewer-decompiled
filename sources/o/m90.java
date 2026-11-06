package o;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m90 implements Runnable {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1448o;
    public final Object p;
    public final Object q;

    public m90(dt5 dt5Var, b97 b97Var, boolean z, int i) {
        dt5Var.getClass();
        b97Var.getClass();
        this.p = dt5Var;
        this.q = b97Var;
        this.n = z;
        this.f1448o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        nn8 nn8VarB;
        boolean zD2 = false;
        switch (this.m) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.q;
                fe8 fe8Var = bottomSheetBehavior.G;
                if (fe8Var == null || !fe8Var.f()) {
                    bottomSheetBehavior.C(this.f1448o);
                } else {
                    View view = (View) this.p;
                    WeakHashMap weakHashMap = be8.a;
                    view.postOnAnimation(this);
                }
                this.n = false;
                return;
            default:
                boolean z = this.n;
                dt5 dt5Var = (dt5) this.p;
                b97 b97Var = (b97) this.q;
                if (z) {
                    int i = this.f1448o;
                    dt5Var.getClass();
                    String str = b97Var.a.a;
                    synchronized (dt5Var.k) {
                        nn8VarB = dt5Var.b(str);
                        break;
                    }
                    zD = dt5.d(str, nn8VarB, i);
                } else {
                    int i2 = this.f1448o;
                    dt5Var.getClass();
                    String str2 = b97Var.a.a;
                    synchronized (dt5Var.k) {
                        try {
                            if (dt5Var.f.get(str2) != null) {
                                we4.f().c(dt5.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                            } else {
                                Set set = (Set) dt5Var.h.get(str2);
                                if (set != null && set.contains(b97Var)) {
                                    zD2 = dt5.d(str2, dt5Var.b(str2), i2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    zD = zD2;
                }
                we4.f().c(we4.i("StopWorkRunnable"), "StopWorkRunnable for " + ((b97) this.q).a.a + "; Processor.stopWork = " + zD + ", reason: " + this.f1448o);
                return;
        }
    }

    public m90(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.q = bottomSheetBehavior;
        this.p = view;
        this.f1448o = i;
    }
}
