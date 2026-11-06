package o;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o28 {
    public kg5 a;
    public tn0 b;
    public kw7 c;
    public i32 d;
    public sj5 f;
    public ig5 g;
    public jn7 h;
    public ew7 i;
    public r94 k;
    public boolean l;
    public final ArrayList e = new ArrayList();
    public final dw7 j = new dw7(3, this);

    public List a() {
        return this.d.l();
    }

    public final o82 b() {
        return i() ? c() : this.d;
    }

    public final o82 c() {
        return (o82) ua5.j(1, this.e);
    }

    public final boolean d(String str, String str2) {
        if (!i()) {
            return false;
        }
        o82 o82VarC = c();
        return o82VarC.p.f993o.equals(str) && o82VarC.p.m.equals(str2);
    }

    public String e() {
        return "http://www.w3.org/1999/xhtml";
    }

    public ig5 f() {
        return ig5.c;
    }

    public jn7 g() {
        return new jn7(jn7.d, null);
    }

    public final void h(String str, Object... objArr) {
        hg5 hg5Var = this.a.n;
        if (hg5Var.a()) {
            hg5Var.add(new fk3(this.b, str, objArr));
        }
    }

    public final boolean i() {
        return !this.e.isEmpty();
    }

    public void j(Reader reader, String str, kg5 kg5Var) {
        db8.p0(str, "baseUri");
        o28 o28Var = kg5Var.m;
        i32 i32Var = new i32(o28Var.e(), str);
        this.d = i32Var;
        i32Var.w = kg5Var;
        this.a = kg5Var;
        this.g = kg5Var.f1262o;
        tn0 tn0Var = new tn0(reader);
        this.b = tn0Var;
        tn0Var.v = null;
        this.k = null;
        this.c = new kw7(this);
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.ensureCapacity(32);
        this.l = false;
        jn7 jn7VarG = kg5Var.p;
        if (jn7VarG == null) {
            jn7VarG = o28Var.g();
            kg5Var.p = jn7VarG;
        }
        this.h = jn7VarG;
        ew7 ew7Var = new ew7(2, this);
        this.i = ew7Var;
        this.f = ew7Var;
    }

    public void k() {
    }

    public o28 l() {
        return new t63();
    }

    public o82 m() {
        ArrayList arrayList = this.e;
        return (o82) arrayList.remove(arrayList.size() - 1);
    }

    public abstract boolean n(sj5 sj5Var);

    public final boolean o(String str) {
        sj5 sj5Var = this.f;
        dw7 dw7Var = this.j;
        if (sj5Var == dw7Var) {
            dw7 dw7Var2 = new dw7(3, this);
            dw7Var2.k(str);
            return n(dw7Var2);
        }
        dw7Var.f();
        dw7Var.k(str);
        return n(dw7Var);
    }

    public final void p(String str) {
        ew7 ew7Var = this.i;
        if (this.f == ew7Var) {
            ew7 ew7Var2 = new ew7(2, this);
            ew7Var2.k(str);
            n(ew7Var2);
        } else {
            ew7Var.f();
            ew7Var.k(str);
            n(ew7Var);
        }
    }

    public final void q() {
        ArrayList arrayList;
        while (true) {
            boolean z = this.l;
            arrayList = this.e;
            if (z) {
                break;
            }
            if (this.f.a != 7) {
                kw7 kw7Var = this.c;
                zv7 zv7Var = kw7Var.l;
                while (!kw7Var.f) {
                    kw7Var.d.c(kw7Var, kw7Var.a);
                }
                boolean zS = zv7Var.d.s();
                sj5 sj5Var = zv7Var;
                if (!zS) {
                    kw7Var.f = false;
                    sj5Var = kw7Var.e;
                }
                this.f = sj5Var;
                n(sj5Var);
                sj5Var.f();
            } else if (arrayList.isEmpty()) {
                this.l = true;
            } else {
                m();
            }
        }
        if (this.b == null) {
            return;
        }
        r94 r94Var = this.k;
        if (r94Var != null) {
            int[] iArr = r94Var.a;
            int length = iArr.length;
            int i = r94Var.b;
            if (length != i) {
                r94Var.a = i == 0 ? r94.c : Arrays.copyOf(iArr, i);
            }
        }
        this.b.close();
        this.b = null;
        this.k = null;
        this.c = null;
        arrayList.clear();
        arrayList.trimToSize();
    }

    public final hn7 r(ew7 ew7Var) {
        return this.h.d(ew7Var.d.F(), ew7Var.e, e(), this.g.a);
    }
}
