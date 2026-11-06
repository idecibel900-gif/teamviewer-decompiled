package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ie5 {
    public final yf5 a;
    public final wf5 b;
    public final yf5 c;
    public final bg5 d;

    public ie5(int i, float f, int i2, fe5 fe5Var) {
        this.a = new yf5(i);
        this.b = new wf5(f);
        this.c = new yf5(i2);
        this.d = h57.p(fe5Var);
    }

    public final fe5 a() {
        return (fe5) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        if (this == obj) {
            el5.h(n47VarC, n47VarF, function1E);
            return true;
        }
        try {
            if (!(obj instanceof ie5)) {
                el5.h(n47VarC, n47VarF, function1E);
                return false;
            }
            if (this.a.z() != ((ie5) obj).a.z()) {
                el5.h(n47VarC, n47VarF, function1E);
                return false;
            }
            if (this.b.z() != ((ie5) obj).b.z()) {
                el5.h(n47VarC, n47VarF, function1E);
                return false;
            }
            if (this.c.z() != ((ie5) obj).c.z()) {
                el5.h(n47VarC, n47VarF, function1E);
                return false;
            }
            if (im3.n(a(), ((ie5) obj).a())) {
                el5.h(n47VarC, n47VarF, function1E);
                return true;
            }
            el5.h(n47VarC, n47VarF, function1E);
            return false;
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    public final int hashCode() {
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            int iZ = ((((this.a.z() * 31) + Float.hashCode(this.b.z())) * 31) + this.c.z()) * 31;
            fe5 fe5VarA = a();
            return iZ + (fe5VarA != null ? fe5VarA.hashCode() : 0);
        } finally {
            el5.h(n47VarC, n47VarF, function1E);
        }
    }

    public /* synthetic */ ie5(fe5 fe5Var, int i) {
        this(-1, Float.NaN, -1, (i & 8) != 0 ? null : fe5Var);
    }
}
