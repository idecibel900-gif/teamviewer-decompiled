package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w51 {
    public int b;
    public boolean c;
    public final n61 d;
    public final int e;
    public w51 f;
    public k67 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public w51(n61 n61Var, int i) {
        this.d = n61Var;
        this.e = i;
    }

    public final void a(w51 w51Var, int i, int i2) {
        if (w51Var == null) {
            g();
            return;
        }
        this.f = w51Var;
        if (w51Var.a == null) {
            w51Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
    }

    public final void b(int i, ArrayList arrayList, yi8 yi8Var) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                zu1.s(((w51) it.next()).d, i, arrayList, yi8Var);
            }
        }
    }

    public final int c() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int d() {
        w51 w51Var;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (w51Var = this.f) == null || w51Var.d.f0 != 8) ? this.g : i;
    }

    public final boolean e() {
        w51 w51Var;
        HashSet<w51> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        for (w51 w51Var2 : hashSet) {
            n61 n61Var = w51Var2.d;
            int i = w51Var2.e;
            switch (ua5.B(i)) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    w51Var = null;
                    break;
                case 1:
                    w51Var = n61Var.J;
                    break;
                case 2:
                    w51Var = n61Var.K;
                    break;
                case 3:
                    w51Var = n61Var.H;
                    break;
                case 4:
                    w51Var = n61Var.I;
                    break;
                default:
                    throw new AssertionError(e41.u(i));
            }
            if (w51Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f != null;
    }

    public final void g() {
        HashSet hashSet;
        w51 w51Var = this.f;
        if (w51Var != null && (hashSet = w51Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void h() {
        k67 k67Var = this.i;
        if (k67Var == null) {
            this.i = new k67(1);
        } else {
            k67Var.c();
        }
    }

    public final void i(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + e41.u(this.e);
    }
}
