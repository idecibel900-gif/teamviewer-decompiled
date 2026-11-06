package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i86 extends e86 implements rn3, bo3 {
    @Override // o.rn3
    public final q76 a(ht2 ht2Var) {
        ht2Var.getClass();
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return xs1.I(declaredAnnotations, ht2Var);
        }
        return null;
    }

    public abstract Member b();

    public final sy4 c() {
        String name = b().getName();
        return name != null ? sy4.e(name) : a87.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        n86 u76Var;
        n86 l86Var;
        String str;
        boolean z2;
        on3 on3Var;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        jk0 jk0Var = jk0.z;
        Member memberB = b();
        memberB.getClass();
        on3 on3Var2 = jk0.A;
        if (on3Var2 == null) {
            synchronized (jk0Var) {
                on3Var2 = jk0.A;
                if (on3Var2 == null) {
                    Class<?> cls = memberB.getClass();
                    try {
                        on3Var = new on3(cls.getMethod("getParameters", null), p76.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        on3Var = new on3(null, null);
                    }
                    jk0.A = on3Var;
                    on3Var2 = on3Var;
                }
            }
        }
        Method method2 = on3Var2.a;
        if (method2 == null || (method = on3Var2.b) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(memberB, null);
            objInvoke.getClass();
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, null);
                objInvoke2.getClass();
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            type.getClass();
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    l86Var = new l86(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) {
                        u76Var = new u76(type);
                    } else {
                        u76Var = type instanceof WildcardType ? new q86((WildcardType) type) : new c86(type);
                    }
                    l86Var = u76Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    u76Var = new u76(type);
                } else {
                    u76Var = new u76(type);
                }
                l86Var = u76Var;
            }
            if (arrayList != null) {
                str = (String) lv0.p0(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + c() + " type=" + l86Var + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            arrayList2.add(new p86(l86Var, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    public final p7 e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return lg8.p;
        }
        if (Modifier.isPrivate(modifiers)) {
            return ig8.p;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? ap3.p : zo3.p;
        }
        return yo3.p;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i86) && im3.n(b(), ((i86) obj).b());
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        Member memberB = b();
        memberB.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? xs1.M(declaredAnnotations) : ea2.m;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
