package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bb7 {
    public final io.sentry.android.core.u0 a;
    public final rp3 b;
    public final zn8 c;
    public final bb7[] d;
    public final wj5 e;
    public final dq3 f;
    public boolean g;
    public String h;
    public String i;

    public bb7(io.sentry.android.core.u0 u0Var, rp3 rp3Var, zn8 zn8Var, bb7[] bb7VarArr) {
        u0Var.getClass();
        this.a = u0Var;
        this.b = rp3Var;
        this.c = zn8Var;
        this.d = bb7VarArr;
        this.e = rp3Var.b;
        this.f = rp3Var.a;
        int iOrdinal = zn8Var.ordinal();
        if (bb7VarArr != null) {
            bb7 bb7Var = bb7VarArr[iOrdinal];
            if (bb7Var == null && bb7Var == this) {
                return;
            }
            bb7VarArr[iOrdinal] = this;
        }
    }

    public final bb7 a(fq6 fq6Var) {
        bb7 bb7Var;
        fq6Var.getClass();
        rp3 rp3Var = this.b;
        zn8 zn8VarO = g57.o(rp3Var, fq6Var);
        char c = zn8VarO.m;
        io.sentry.android.core.u0 u0Var = this.a;
        u0Var.i(c);
        u0Var.n = true;
        String str = this.h;
        if (str != null) {
            String strA = this.i;
            if (strA == null) {
                strA = fq6Var.a();
            }
            u0Var.g();
            u0Var.m(str);
            u0Var.i(':');
            q(strA);
            this.h = null;
            this.i = null;
        }
        if (this.c == zn8VarO) {
            return this;
        }
        bb7[] bb7VarArr = this.d;
        return (bb7VarArr == null || (bb7Var = bb7VarArr[zn8VarO.ordinal()]) == null) ? new bb7(u0Var, rp3Var, zn8VarO, bb7VarArr) : bb7Var;
    }

    public final void b(boolean z) {
        if (this.g) {
            q(String.valueOf(z));
        } else {
            ((nd) this.a.f127o).t(String.valueOf(z));
        }
    }

    public final void c(byte b) {
        if (this.g) {
            q(String.valueOf((int) b));
        } else {
            this.a.h(b);
        }
    }

    public final void d(char c) {
        q(String.valueOf(c));
    }

    public final void e(double d) {
        if (this.g) {
            q(String.valueOf(d));
        } else {
            ((nd) this.a.f127o).t(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new rq3(vs1.J(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    public final void f(fq6 fq6Var, int i) {
        fq6Var.getClass();
        int iOrdinal = this.c.ordinal();
        io.sentry.android.core.u0 u0Var = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!u0Var.n) {
                u0Var.i(',');
            }
            u0Var.g();
            return;
        }
        if (iOrdinal == 2) {
            if (u0Var.n) {
                this.g = true;
                u0Var.g();
                return;
            }
            if (i % 2 == 0) {
                u0Var.i(',');
                u0Var.g();
            } else {
                u0Var.i(':');
                u0Var.n();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!u0Var.n) {
                u0Var.i(',');
            }
            u0Var.g();
            qf0.O(this.b, fq6Var);
            q(fq6Var.f(i));
            u0Var.i(':');
            u0Var.n();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            u0Var.i(',');
            u0Var.n();
            this.g = false;
        }
    }

    public final void g(float f) {
        if (this.g) {
            q(String.valueOf(f));
        } else {
            ((nd) this.a.f127o).t(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new rq3(vs1.J(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    public final bb7 h(fq6 fq6Var) {
        fq6Var.getClass();
        boolean zA = cb7.a(fq6Var);
        zn8 zn8Var = this.c;
        rp3 rp3Var = this.b;
        io.sentry.android.core.u0 g01Var = this.a;
        if (zA) {
            if (!(g01Var instanceof h01)) {
                g01Var = new h01((nd) g01Var.f127o, this.g);
            }
            return new bb7(g01Var, rp3Var, zn8Var, null);
        }
        if (fq6Var.m() && fq6Var.equals(mq3.a)) {
            if (!(g01Var instanceof g01)) {
                g01Var = new g01((nd) g01Var.f127o, this.g);
            }
            return new bb7(g01Var, rp3Var, zn8Var, null);
        }
        if (this.h != null) {
            this.i = fq6Var.a();
        }
        return this;
    }

    public final bb7 i(gs5 gs5Var, int i) {
        f(gs5Var, i);
        return h(gs5Var.h(i));
    }

    public final void j(int i) {
        if (this.g) {
            q(String.valueOf(i));
        } else {
            this.a.j(i);
        }
    }

    public final void k(long j) {
        if (this.g) {
            q(String.valueOf(j));
        } else {
            this.a.k(j);
        }
    }

    public final void l() {
        io.sentry.android.core.u0 u0Var = this.a;
        u0Var.getClass();
        ((nd) u0Var.f127o).t("null");
    }

    public final void m(fq6 fq6Var, int i, nw3 nw3Var, Object obj) {
        fq6Var.getClass();
        nw3Var.getClass();
        if (obj != null || this.f.b) {
            fq6Var.getClass();
            nw3Var.getClass();
            f(fq6Var, i);
            if (nw3Var.d().c()) {
                o(nw3Var, obj);
            } else if (obj == null) {
                l();
            } else {
                o(nw3Var, obj);
            }
        }
    }

    public final void n(fq6 fq6Var, int i, nw3 nw3Var, Object obj) {
        fq6Var.getClass();
        nw3Var.getClass();
        f(fq6Var, i);
        o(nw3Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    public final void o(nw3 nw3Var, Object obj) {
        String strT;
        nw3Var.getClass();
        rp3 rp3Var = this.b;
        dq3 dq3Var = rp3Var.a;
        boolean z = nw3Var instanceof fo5;
        fs0 fs0Var = dq3Var.f;
        if (!z) {
            int iOrdinal = fs0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    it1 it1VarK = nw3Var.d().k();
                    if (im3.n(it1VarK, lc7.d) || im3.n(it1VarK, lc7.g)) {
                        strT = et1.t(rp3Var, nw3Var.d());
                    }
                } else if (iOrdinal != 2) {
                    gk0.s();
                    return;
                }
            }
            strT = null;
        } else if (fs0Var != fs0.m) {
            strT = et1.t(rp3Var, nw3Var.d());
        } else {
            strT = null;
        }
        if (z) {
            fo5 fo5Var = (fo5) nw3Var;
            if (obj == null) {
                an4.q(fo5Var.d(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            } else {
                it1.x(fo5Var, this, obj);
                throw null;
            }
        }
        if (strT != null) {
            fq6 fq6VarD = nw3Var.d();
            fq6VarD.getClass();
            qf0.O(rp3Var, fq6VarD);
            if (im3.q(fq6VarD).contains(strT)) {
                String strA = nw3Var.d().a();
                String strA2 = nw3Var.d().a();
                throw new rq3(e41.l(e41.o("Class '", strA2, "' cannot be serialized ", (dq3Var.f == fs0.n && im3.n(strA, strA2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : to7.i('\'', "as base class '", strA), " because it has property name that conflicts with JSON class discriminator '"), strT, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            it1 it1VarK2 = nw3Var.d().k();
            it1VarK2.getClass();
            if (it1VarK2 instanceof kq6) {
                hk0.l("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (it1VarK2 instanceof is5) {
                hk0.l("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (it1VarK2 instanceof eo5) {
                hk0.l("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strA3 = nw3Var.d().a();
                this.h = strT;
                this.i = strA3;
            }
        }
        nw3Var.a(this, obj);
    }

    public final void p(short s) {
        if (this.g) {
            q(String.valueOf((int) s));
        } else {
            this.a.l(s);
        }
    }

    public final void q(String str) {
        str.getClass();
        this.a.m(str);
    }

    public final void r(fq6 fq6Var, int i, String str) {
        fq6Var.getClass();
        str.getClass();
        f(fq6Var, i);
        q(str);
    }

    public final void s(fq6 fq6Var) {
        fq6Var.getClass();
        io.sentry.android.core.u0 u0Var = this.a;
        u0Var.getClass();
        u0Var.n = false;
        u0Var.i(this.c.n);
    }

    public final boolean t(fq6 fq6Var) {
        fq6Var.getClass();
        return false;
    }
}
