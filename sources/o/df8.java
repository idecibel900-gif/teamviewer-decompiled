package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class df8 {
    public Interpolator c;
    public ef8 d;
    public boolean e;
    public long b = -1;
    public final cf8 f = new cf8(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((bf8) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (bf8 bf8Var : this.a) {
            long j = this.b;
            if (j >= 0) {
                bf8Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) bf8Var.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                bf8Var.d(this.f);
            }
            View view2 = (View) bf8Var.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
