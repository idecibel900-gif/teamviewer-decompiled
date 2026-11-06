package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 extends uc1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ vf0(byte b) {
        this.a = b;
    }

    @Override // o.uc1
    public vc1 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, d11 d11Var) {
        switch (this.a) {
            case 0:
                if (db6.class.isAssignableFrom(im3.L(type))) {
                    return jk0.q;
                }
                return null;
            case 1:
            default:
                return super.a(type, annotationArr, annotationArr2, d11Var);
            case 2:
                if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                    return ni6.m;
                }
                return null;
        }
    }

    @Override // o.uc1
    public final vc1 b(Type type, Annotation[] annotationArr, d11 d11Var) {
        switch (this.a) {
            case 0:
                if (type == nc6.class) {
                    return im3.P(annotationArr, ta7.class) ? d82.q : yl7.r;
                }
                if (type == Void.class) {
                    return z06.q;
                }
                if (im3.D && type == f88.class) {
                    return xz2.F;
                }
                return null;
            case 1:
                if (im3.L(type) != Optional.class) {
                    return null;
                }
                return new g95(d11Var.Q(im3.I(0, (ParameterizedType) type), annotationArr));
            default:
                if (type == String.class) {
                    return jk0.J;
                }
                if (type == Boolean.class || type == Boolean.TYPE) {
                    return xz2.T;
                }
                if (type == Byte.class || type == Byte.TYPE) {
                    return z06.F;
                }
                if (type == Character.class || type == Character.TYPE) {
                    return yl7.U;
                }
                if (type == Double.class || type == Double.TYPE) {
                    return jk0.I;
                }
                if (type == Float.class || type == Float.TYPE) {
                    return d82.K;
                }
                if (type == Integer.class || type == Integer.TYPE) {
                    return xz2.U;
                }
                if (type == Long.class || type == Long.TYPE) {
                    return z06.G;
                }
                if (type == Short.class || type == Short.TYPE) {
                    return yl7.V;
                }
                return null;
        }
    }
}
