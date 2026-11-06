package o;

import android.content.res.TypedArray;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 implements v46, so {
    public final Object m;

    public g2(byte b) {
        switch (b) {
            case 6:
                this.m = new Object();
                break;
            case 7:
                this.m = h57.p(Boolean.FALSE);
                break;
            default:
                this.m = new bz6();
                break;
        }
    }

    public static /* synthetic */ void e0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public void A0() {
    }

    public up getAnnotations() {
        up upVar = (up) this.m;
        if (upVar != null) {
            return upVar;
        }
        e0(1);
        throw null;
    }

    @Override // o.v46
    public oz3 getType() {
        oz3 oz3Var = (oz3) this.m;
        if (oz3Var != null) {
            return oz3Var;
        }
        z(1);
        throw null;
    }

    public bz6 i0() {
        bz6 bz6Var = (bz6) this.m;
        boolean z = bz6Var.f;
        int[] iArr = bz6Var.b;
        if (!z) {
            int i = bz6Var.e;
            iArr[0] = i;
            int i2 = bz6Var.d;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
        } else {
            int i3 = bz6Var.d;
            iArr[0] = i3;
            iArr[1] = i3;
            int i4 = bz6Var.e;
            iArr[2] = i4;
            iArr[3] = i4;
        }
        float[] fArr = bz6Var.a;
        if (!z) {
            fArr[0] = Math.max(((1.0f - bz6Var.k) - bz6Var.l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - bz6Var.k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((bz6Var.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((bz6Var.k + 1.0f) + bz6Var.l) / 2.0f, 1.0f);
            return bz6Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(bz6Var.k, 1.0f);
        fArr[2] = Math.min(bz6Var.k + bz6Var.l, 1.0f);
        fArr[3] = 1.0f;
        return bz6Var;
    }

    public abstract void j0(wp6 wp6Var);

    public abstract void m0();

    public g2 n0(TypedArray typedArray) {
        bz6 bz6Var = (bz6) this.m;
        if (typedArray.hasValue(3)) {
            bz6Var.n = typedArray.getBoolean(3, bz6Var.n);
        }
        if (typedArray.hasValue(0)) {
            bz6Var.f471o = typedArray.getBoolean(0, bz6Var.f471o);
        }
        if (typedArray.hasValue(1)) {
            bz6Var.e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (bz6Var.e & 16777215);
        }
        if (typedArray.hasValue(11)) {
            bz6Var.d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & bz6Var.d);
        }
        if (typedArray.hasValue(7)) {
            long j = typedArray.getInt(7, (int) bz6Var.s);
            if (j < 0) {
                hk0.g(e41.g("Given a negative duration: ", j));
                return null;
            }
            bz6Var.s = j;
        }
        if (typedArray.hasValue(14)) {
            bz6Var.q = typedArray.getInt(14, bz6Var.q);
        }
        if (typedArray.hasValue(15)) {
            long j2 = typedArray.getInt(15, (int) bz6Var.t);
            if (j2 < 0) {
                hk0.g(e41.g("Given a negative repeat delay: ", j2));
                return null;
            }
            bz6Var.t = j2;
        }
        if (typedArray.hasValue(16)) {
            bz6Var.r = typedArray.getInt(16, bz6Var.r);
        }
        if (typedArray.hasValue(5)) {
            int i = typedArray.getInt(5, bz6Var.c);
            if (i == 1) {
                bz6Var.c = (byte) 1;
            } else if (i == 2) {
                bz6Var.c = (byte) 2;
            } else if (i != 3) {
                bz6Var.c = (byte) 0;
            } else {
                bz6Var.c = (byte) 3;
            }
        }
        if (typedArray.hasValue(17)) {
            if (typedArray.getInt(17, bz6Var.f ? 1 : 0) != 1) {
                bz6Var.f = false;
            } else {
                bz6Var.f = true;
            }
        }
        if (typedArray.hasValue(6)) {
            float f = typedArray.getFloat(6, bz6Var.l);
            if (f < 0.0f) {
                yq4.m("Given invalid dropoff value: ", f);
                return null;
            }
            bz6Var.l = f;
        }
        if (typedArray.hasValue(9)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, bz6Var.g);
            if (dimensionPixelSize < 0) {
                hk0.g(fx3.e(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            bz6Var.g = dimensionPixelSize;
        }
        if (typedArray.hasValue(8)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, bz6Var.h);
            if (dimensionPixelSize2 < 0) {
                hk0.g(fx3.e(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            bz6Var.h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(13)) {
            float f2 = typedArray.getFloat(13, bz6Var.k);
            if (f2 < 0.0f) {
                yq4.m("Given invalid intensity value: ", f2);
                return null;
            }
            bz6Var.k = f2;
        }
        if (typedArray.hasValue(19)) {
            float f3 = typedArray.getFloat(19, bz6Var.i);
            if (f3 < 0.0f) {
                yq4.m("Given invalid width ratio: ", f3);
                return null;
            }
            bz6Var.i = f3;
        }
        if (typedArray.hasValue(10)) {
            float f4 = typedArray.getFloat(10, bz6Var.j);
            if (f4 < 0.0f) {
                yq4.m("Given invalid height ratio: ", f4);
                return null;
            }
            bz6Var.j = f4;
        }
        if (typedArray.hasValue(18)) {
            bz6Var.m = typedArray.getFloat(18, bz6Var.m);
        }
        return t0();
    }

    public abstract void o0();

    public abstract Object p0();

    public abstract Function1 q0();

    public abstract Object r0();

    public abstract String s0();

    public abstract g2 t0();

    public abstract boolean u0();

    public boolean v0() {
        s77 s77VarA;
        q77 q77Var = (q77) this.m;
        View view = q77Var.c.U;
        if (view != null) {
            s77.m.getClass();
            s77VarA = yi5.a(view);
        } else {
            s77VarA = null;
        }
        s77 s77Var = q77Var.a;
        if (s77VarA == s77Var) {
            return true;
        }
        s77 s77Var2 = s77.f1990o;
        return (s77VarA == s77Var2 || s77Var == s77Var2) ? false : true;
    }

    public abstract Function1 w0(wp6 wp6Var);

    public abstract void x0(wm0 wm0Var);

    public abstract void y0(Object obj);

    public void z0(u18 u18Var) {
    }

    public g2(up upVar) {
        if (upVar != null) {
            this.m = upVar;
        } else {
            e0(0);
            throw null;
        }
    }

    public g2(oz3 oz3Var) {
        if (oz3Var != null) {
            this.m = oz3Var;
        } else {
            z(0);
            throw null;
        }
    }

    public g2(q77 q77Var) {
        q77Var.getClass();
        this.m = q77Var;
    }
}
