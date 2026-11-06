package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ht2 {
    public static final ht2 c = new ht2("");
    public final it2 a;
    public transient ht2 b;

    public ht2(String str) {
        if (str != null) {
            this.a = new it2(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case ep1.b /* 9 */:
                objArr[1] = "shortName";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case ep1.d /* 12 */:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ht2 j(sy4 sy4Var) {
        if (sy4Var != null) {
            return new ht2(new it2(sy4Var.b(), c.i(), sy4Var));
        }
        a(14);
        throw null;
    }

    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        it2.a(4);
        throw null;
    }

    public final ht2 c(sy4 sy4Var) {
        if (sy4Var != null) {
            return new ht2(this.a.b(sy4Var), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    public final ht2 e() {
        ht2 ht2Var = this.b;
        if (ht2Var != null) {
            return ht2Var;
        }
        if (d()) {
            hk0.l("root");
            return null;
        }
        it2 it2Var = this.a;
        it2 it2Var2 = it2Var.c;
        if (it2Var2 == null) {
            if (it2Var.a.isEmpty()) {
                hk0.l("root");
                return null;
            }
            it2Var.c();
            it2Var2 = it2Var.c;
            if (it2Var2 == null) {
                it2.a(8);
                throw null;
            }
        }
        ht2 ht2Var2 = new ht2(it2Var2);
        this.b = ht2Var2;
        return ht2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht2) && this.a.equals(((ht2) obj).a);
    }

    public final sy4 f() {
        sy4 sy4VarF = this.a.f();
        if (sy4VarF != null) {
            return sy4VarF;
        }
        a(9);
        throw null;
    }

    public final sy4 g() {
        it2 it2Var = this.a;
        if (it2Var.a.isEmpty()) {
            sy4 sy4Var = it2.e;
            if (sy4Var != null) {
                return sy4Var;
            }
            it2.a(12);
            throw null;
        }
        sy4 sy4VarF = it2Var.f();
        if (sy4VarF != null) {
            return sy4VarF;
        }
        it2.a(13);
        throw null;
    }

    public final boolean h(sy4 sy4Var) {
        if (sy4Var == null) {
            a(12);
            throw null;
        }
        String str = this.a.a;
        if (!str.isEmpty()) {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            String strB = sy4Var.b();
            if (iIndexOf == strB.length() && str.regionMatches(0, strB, 0, iIndexOf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final it2 i() {
        it2 it2Var = this.a;
        if (it2Var != null) {
            return it2Var;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public ht2(it2 it2Var) {
        this.a = it2Var;
    }

    public ht2(it2 it2Var, ht2 ht2Var) {
        this.a = it2Var;
        this.b = ht2Var;
    }
}
