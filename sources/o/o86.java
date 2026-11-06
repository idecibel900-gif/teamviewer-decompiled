package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class o86 extends e86 implements rn3, vn3 {
    public final TypeVariable a;

    public o86(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    @Override // o.rn3
    public final q76 a(ht2 ht2Var) {
        Annotation[] declaredAnnotations;
        ht2Var.getClass();
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return xs1.I(declaredAnnotations, ht2Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o86) {
            return im3.n(this.a, ((o86) obj).a);
        }
        return false;
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? ea2.m : xs1.M(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o86.class.getName() + ": " + this.a;
    }
}
