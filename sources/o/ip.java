package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ip implements hp {
    public final oz3 a;
    public final Map b;
    public final s67 c;

    public ip(g07 g07Var, Map map, s67 s67Var) {
        if (g07Var == null) {
            a(0);
            throw null;
        }
        this.a = g07Var;
        this.b = map;
        this.c = s67Var;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.hp
    public final s67 c() {
        return this.c;
    }

    @Override // o.hp
    public final ht2 d() {
        ns4 ns4VarD = bp1.d(this);
        if (ns4VarD != null) {
            if (hd2.f(ns4VarD)) {
                ns4VarD = null;
            }
            if (ns4VarD != null) {
                return bp1.c(ns4VarD);
            }
        }
        return null;
    }

    @Override // o.hp
    public final Map e() {
        return this.b;
    }

    @Override // o.hp
    public final oz3 getType() {
        oz3 oz3Var = this.a;
        if (oz3Var != null) {
            return oz3Var;
        }
        a(3);
        throw null;
    }

    public final String toString() {
        return qo1.c.w(this, null);
    }
}
