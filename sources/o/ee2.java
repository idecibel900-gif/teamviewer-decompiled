package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ee2 implements Runnable, Comparable, t22 {
    private volatile Object _heap;
    public long m;
    public int n = -1;

    public ee2(long j) {
        this.m = j;
    }

    @Override // o.t22
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                hr2 hr2Var = vn4.u;
                if (obj == hr2Var) {
                    return;
                }
                fe2 fe2Var = obj instanceof fe2 ? (fe2) obj : null;
                if (fe2Var != null) {
                    synchronized (fe2Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof gu7 ? (gu7) obj2 : null) != null) {
                            fe2Var.c(this.n);
                        }
                    }
                }
                this._heap = hr2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, fe2 fe2Var, ge2 ge2Var) {
        synchronized (this) {
            if (this._heap == vn4.u) {
                return 2;
            }
            synchronized (fe2Var) {
                try {
                    ee2[] ee2VarArr = fe2Var.a;
                    ee2 ee2Var = ee2VarArr != null ? ee2VarArr[0] : null;
                    int i = ge2.v;
                    if (defpackage.a.a.getIntVolatile(ge2Var, ge2.t) == 1) {
                        return 1;
                    }
                    if (ee2Var == null) {
                        fe2Var.c = j;
                    } else {
                        long j2 = ee2Var.m;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = fe2Var.c;
                        if (j - j3 > 0) {
                            fe2Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.m - j < 0) {
                        this.m = j;
                    }
                    fe2Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.m - ((ee2) obj).m;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(fe2 fe2Var) {
        if (this._heap != vn4.u) {
            this._heap = fe2Var;
        } else {
            hk0.g("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.m + ']';
    }
}
