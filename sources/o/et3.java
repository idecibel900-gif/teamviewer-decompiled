package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class et3 extends fy2 implements rq4 {
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f740o;
    public List p;

    @Override // o.fy2
    public final t1 c() {
        it3 it3VarG = g();
        if (it3VarG.a()) {
            return it3VarG;
        }
        throw new z78();
    }

    public final Object clone() {
        et3 et3Var = new et3();
        List list = Collections.EMPTY_LIST;
        et3Var.f740o = list;
        et3Var.p = list;
        et3Var.h(g());
        return et3Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // o.fy2
    public final fy2 d(vu0 vu0Var, dg2 dg2Var) throws Throwable {
        it3 it3Var = null;
        try {
            try {
                it3.t.getClass();
                h(new it3(vu0Var, dg2Var));
                return this;
            } catch (rm3 e) {
                it3 it3Var2 = (it3) e.m;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    it3Var = it3Var2;
                    if (it3Var != null) {
                        h(it3Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (it3Var != null) {
                h(it3Var);
            }
            throw th;
        }
    }

    @Override // o.fy2
    public final /* bridge */ /* synthetic */ fy2 e(oy2 oy2Var) {
        h((it3) oy2Var);
        return this;
    }

    public final it3 g() {
        it3 it3Var = new it3(this);
        int i = this.n;
        if ((i & 1) == 1) {
            this.f740o = Collections.unmodifiableList(this.f740o);
            i = this.n & (-2);
            this.n = i;
        }
        it3Var.n = this.f740o;
        if ((i & 2) == 2) {
            this.p = Collections.unmodifiableList(this.p);
            this.n &= -3;
        }
        it3Var.f1099o = this.p;
        return it3Var;
    }

    public final void h(it3 it3Var) {
        if (it3Var == it3.s) {
            return;
        }
        if (!it3Var.n.isEmpty()) {
            if (this.f740o.isEmpty()) {
                this.f740o = it3Var.n;
                this.n &= -2;
            } else {
                if ((this.n & 1) != 1) {
                    this.f740o = new ArrayList(this.f740o);
                    this.n |= 1;
                }
                this.f740o.addAll(it3Var.n);
            }
        }
        if (!it3Var.f1099o.isEmpty()) {
            if (this.p.isEmpty()) {
                this.p = it3Var.f1099o;
                this.n &= -3;
            } else {
                if ((this.n & 2) != 2) {
                    this.p = new ArrayList(this.p);
                    this.n |= 2;
                }
                this.p.addAll(it3Var.f1099o);
            }
        }
        this.m = this.m.b(it3Var.m);
    }
}
