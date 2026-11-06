package androidx.compose.foundation.layout;

import o.fs4;
import o.gg4;
import o.im3;
import o.r12;
import o.x50;
import o.xz2;
import o.y50;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final FillElement a = new FillElement(r12.n, 1.0f);
    public static final FillElement b;
    public static final FillElement c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;

    static {
        r12 r12Var = r12.m;
        b = new FillElement(r12Var, 1.0f);
        r12 r12Var2 = r12.f1880o;
        c = new FillElement(r12Var2, 1.0f);
        x50 x50Var = xz2.y;
        byte b2 = 28;
        d = new d(r12Var, new gg4(x50Var, b2), x50Var);
        x50 x50Var2 = xz2.x;
        e = new d(r12Var, new gg4(x50Var2, b2), x50Var2);
        y50 y50Var = xz2.s;
        byte b3 = 29;
        f = new d(r12Var2, new gg4(y50Var, b3), y50Var);
        y50 y50Var2 = xz2.f2564o;
        g = new d(r12Var2, new gg4(y50Var2, b3), y50Var2);
    }

    public static final fs4 a(fs4 fs4Var, float f2, float f3) {
        return fs4Var.f(new c(f2, f3));
    }

    public static fs4 b(fs4 fs4Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(fs4Var, f2, f3);
    }

    public static final fs4 c(fs4 fs4Var, float f2) {
        return fs4Var.f(f2 == 1.0f ? a : new FillElement(r12.n, f2));
    }

    public static final fs4 d(fs4 fs4Var, float f2) {
        return fs4Var.f(new a(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final fs4 e(fs4 fs4Var, float f2, float f3) {
        return fs4Var.f(new a(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static fs4 f(fs4 fs4Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        return e(fs4Var, f2, f3);
    }

    public static final fs4 g(fs4 fs4Var, float f2) {
        return fs4Var.f(new a(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final fs4 h(fs4 fs4Var, float f2) {
        return fs4Var.f(new a(f2, f2, f2, f2, false));
    }

    public static final fs4 i(fs4 fs4Var, float f2, float f3) {
        return fs4Var.f(new a(f2, f3, f2, f3, false));
    }

    public static fs4 j(fs4 fs4Var, float f2, float f3, float f4, float f5, int i) {
        return fs4Var.f(new a(f2, (i & 2) != 0 ? Float.NaN : f3, (i & 4) != 0 ? Float.NaN : f4, (i & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final fs4 k(fs4 fs4Var, float f2) {
        return fs4Var.f(new a(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static final fs4 l(fs4 fs4Var, float f2) {
        return fs4Var.f(new a(f2, f2, f2, f2, true));
    }

    public static final fs4 m(fs4 fs4Var, float f2, float f3) {
        return fs4Var.f(new a(f2, f3, f2, f3, true));
    }

    public static final fs4 n(fs4 fs4Var, float f2, float f3, float f4, float f5) {
        return fs4Var.f(new a(f2, f3, f4, f5, true));
    }

    public static fs4 o(fs4 fs4Var, float f2, float f3, float f4, int i) {
        if ((i & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f4 = Float.NaN;
        }
        return n(fs4Var, f2, f3, f4, Float.NaN);
    }

    public static final fs4 p(fs4 fs4Var, float f2) {
        return fs4Var.f(new a(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static fs4 q(fs4 fs4Var, float f2, int i) {
        return fs4Var.f(new a((i & 1) != 0 ? Float.NaN : 50.0f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 0.0f, true, 10));
    }

    public static fs4 r(fs4 fs4Var) {
        d dVar;
        x50 x50Var = xz2.y;
        if (im3.n(x50Var, x50Var)) {
            dVar = d;
        } else if (im3.n(x50Var, xz2.x)) {
            dVar = e;
        } else {
            dVar = new d(r12.m, new gg4(x50Var, (byte) 28), x50Var);
        }
        return fs4Var.f(dVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static fs4 s(fs4 fs4Var) {
        d dVar;
        y50 y50Var = xz2.s;
        if (y50Var.equals(y50Var)) {
            dVar = f;
        } else if (y50Var.equals(xz2.f2564o)) {
            dVar = g;
        } else {
            dVar = new d(r12.f1880o, new gg4(y50Var, (byte) 29), y50Var);
        }
        return fs4Var.f(dVar);
    }
}
