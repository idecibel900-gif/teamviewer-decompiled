package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g3 extends ii1 implements d58 {
    public final ub8 q;
    public final boolean r;
    public final int s;
    public final vd4 t;
    public final vd4 u;
    public final xd4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(int i, up upVar, fi1 fi1Var, xd4 xd4Var, sy4 sy4Var, ub8 ub8Var, boolean z) {
        super(fi1Var, upVar, sy4Var, s67.h);
        byte b = 0;
        if (xd4Var == null) {
            z(0);
            throw null;
        }
        byte b2 = 1;
        if (fi1Var == null) {
            z(1);
            throw null;
        }
        if (upVar == null) {
            z(2);
            throw null;
        }
        if (sy4Var == null) {
            z(3);
            throw null;
        }
        if (ub8Var == null) {
            z(4);
            throw null;
        }
        this.q = ub8Var;
        this.r = z;
        this.s = i;
        this.t = new vd4(xd4Var, new e3(this, xd4Var, b));
        this.u = new vd4(xd4Var, new e3(this, sy4Var, b2));
        this.v = xd4Var;
    }

    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ep1.d /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case ep1.d /* 12 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case ep1.b /* 9 */:
                objArr[1] = "getTypeConstructor";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case ep1.d /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
                break;
            case ep1.d /* 12 */:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case ep1.d /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.d58
    public final ub8 B() {
        ub8 ub8Var = this.q;
        if (ub8Var != null) {
            return ub8Var;
        }
        z(7);
        throw null;
    }

    @Override // o.ii1
    /* JADX INFO: renamed from: C0 */
    public final hi1 a() {
        return this;
    }

    public List D0(List list) {
        return list;
    }

    public abstract List E0();

    @Override // o.d58
    public final xd4 P() {
        xd4 xd4Var = this.v;
        if (xd4Var != null) {
            return xd4Var;
        }
        z(14);
        throw null;
    }

    @Override // o.d58
    public final boolean U() {
        return false;
    }

    @Override // o.ys0
    public final g07 W() {
        g07 g07Var = (g07) this.u.a();
        if (g07Var != null) {
            return g07Var;
        }
        z(10);
        throw null;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final fi1 a() {
        return this;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final ys0 a() {
        return this;
    }

    @Override // o.d58
    public final int getIndex() {
        return this.s;
    }

    @Override // o.d58
    public final List getUpperBounds() {
        return ((f3) q()).b();
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.a(this, obj);
    }

    @Override // o.ys0
    public final k48 q() {
        k48 k48Var = (k48) this.t.a();
        if (k48Var != null) {
            return k48Var;
        }
        z(9);
        throw null;
    }

    @Override // o.d58
    public final boolean w() {
        return this.r;
    }

    @Override // o.ii1, o.gi1, o.fi1
    public final d58 a() {
        return this;
    }
}
