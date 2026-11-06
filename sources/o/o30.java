package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o30 {
    public final l30 c;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object e = null;
    public float f = -1.0f;
    public float g = -1.0f;

    public o30(List list) {
        l30 n30Var;
        if (list.isEmpty()) {
            n30Var = new aw((byte) 2);
        } else {
            n30Var = list.size() == 1 ? new n30(list) : new m30(list);
        }
        this.c = n30Var;
    }

    public final void a(k30 k30Var) {
        this.a.add(k30Var);
    }

    public final float b() {
        Interpolator interpolator;
        dy3 dy3VarE = this.c.e();
        if (dy3VarE == null || dy3VarE.c() || (interpolator = dy3VarE.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(c());
    }

    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        dy3 dy3VarE = this.c.e();
        if (dy3VarE.c()) {
            return 0.0f;
        }
        return (this.d - dy3VarE.b()) / (dy3VarE.a() - dy3VarE.b());
    }

    public Object d() {
        float fC = c();
        l30 l30Var = this.c;
        if (l30Var.d(fC) && !h()) {
            return this.e;
        }
        dy3 dy3VarE = l30Var.e();
        Interpolator interpolator = dy3VarE.e;
        Interpolator interpolator2 = dy3VarE.f;
        Object objE = (interpolator == null || interpolator2 == null) ? e(dy3VarE, b()) : f(dy3VarE, fC, interpolator.getInterpolation(fC), interpolator2.getInterpolation(fC));
        this.e = objE;
        return objE;
    }

    public abstract Object e(dy3 dy3Var, float f);

    public Object f(dy3 dy3Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[PHI: r3
      0x0027: PHI (r3v4 float) = (r3v3 float), (r3v1 float) binds: [B:20:0x003c, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public void g(float f) {
        l30 l30Var = this.c;
        if (l30Var.isEmpty()) {
            return;
        }
        float fM = this.f;
        if (fM == -1.0f) {
            fM = l30Var.m();
            this.f = fM;
        }
        float f2 = fM;
        if (f >= fM) {
            float fL = this.g;
            if (fL == -1.0f) {
                fL = l30Var.l();
                this.g = fL;
            }
            f2 = fL;
            if (f > fL) {
                if (f2 == -1.0f) {
                    f = l30Var.l();
                    this.g = f;
                } else {
                    f = f2;
                }
            }
        } else if (f2 == -1.0f) {
            f = l30Var.m();
            this.f = f;
        } else {
            f = f2;
        }
        if (f == this.d) {
            return;
        }
        this.d = f;
        if (!l30Var.f(f)) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((k30) arrayList.get(i)).a();
            i++;
        }
    }

    public boolean h() {
        return false;
    }
}
