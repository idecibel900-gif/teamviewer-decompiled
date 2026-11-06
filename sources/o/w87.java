package o;

/* JADX INFO: loaded from: classes2.dex */
public final class w87 extends h58 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;

    public w87(oz3 oz3Var, ub8 ub8Var) {
        if (ub8Var == null) {
            e(0);
            throw null;
        }
        if (oz3Var == null) {
            e(1);
            throw null;
        }
        this.b = ub8Var;
        this.c = oz3Var;
    }

    public static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.h58
    public final ub8 a() {
        switch (this.a) {
            case 0:
                return ub8.q;
            default:
                ub8 ub8Var = (ub8) this.b;
                if (ub8Var != null) {
                    return ub8Var;
                }
                e(4);
                throw null;
        }
    }

    @Override // o.h58
    public final oz3 b() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (oz3) ((u14) obj).getValue();
            default:
                oz3 oz3Var = (oz3) obj;
                if (oz3Var != null) {
                    return oz3Var;
                }
                e(5);
                throw null;
        }
    }

    @Override // o.h58
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // o.h58
    public final h58 d(uz3 uz3Var) {
        switch (this.a) {
            case 0:
                return this;
            default:
                ub8 ub8Var = (ub8) this.b;
                oz3 oz3Var = (oz3) this.c;
                oz3Var.getClass();
                return new w87(oz3Var, ub8Var);
        }
    }

    public w87(d58 d58Var) {
        d58Var.getClass();
        this.b = d58Var;
        this.c = ds1.X(l54.m, new v87(this, (byte) 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w87(oz3 oz3Var) {
        this(oz3Var, ub8.f2197o);
        if (oz3Var != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
