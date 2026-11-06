package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a86 extends e86 implements rn3, vn3, to3 {
    public final Class a;

    public a86(Class cls) {
        this.a = cls;
    }

    @Override // o.rn3
    public final q76 a(ht2 ht2Var) {
        ht2Var.getClass();
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return xs1.I(declaredAnnotations, ht2Var);
        }
        return null;
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        declaredFields.getClass();
        return bq6.l0(new h18(new fl2(cx.A0(declaredFields), false, x76.n), y76.n));
    }

    public final ht2 c() {
        return p76.a(this.a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        declaredMethods.getClass();
        return bq6.l0(new h18(new fl2(cx.A0(declaredMethods), true, new h16(this, (byte) 4)), z76.n));
    }

    public final sy4 e() {
        Class cls = this.a;
        if (!cls.isAnonymousClass()) {
            return sy4.e(cls.getSimpleName());
        }
        String name = cls.getName();
        int iE0 = ub7.e0(name, 0, 6, ".");
        if (iE0 != -1) {
            name = name.substring(1 + iE0, name.length());
        }
        return sy4.e(name);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a86) {
            return this.a.equals(((a86) obj).a);
        }
        return false;
    }

    public final ArrayList f() {
        j93 j93Var = wo1.e;
        Object[] objArr = null;
        if (j93Var == null) {
            try {
                j93Var = new j93(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
            } catch (NoSuchMethodException unused) {
                j93Var = new j93(objArr, objArr, objArr, objArr, (byte) 21);
            }
            wo1.e = j93Var;
        }
        Method method = (Method) j93Var.q;
        objArr = method != null ? (Object[]) method.invoke(this.a, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new m86(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        j93 j93Var = wo1.e;
        Boolean bool = null;
        if (j93Var == null) {
            try {
                j93Var = new j93(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
            } catch (NoSuchMethodException unused) {
                j93Var = new j93(bool, bool, bool, bool, (byte) 21);
            }
            wo1.e = j93Var;
        }
        Method method = (Method) j93Var.p;
        if (method != null) {
            Object objInvoke = method.invoke(this.a, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations = this.a.getDeclaredAnnotations();
        return declaredAnnotations != null ? xs1.M(declaredAnnotations) : ea2.m;
    }

    @Override // o.to3
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new o86(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() throws IllegalAccessException, InvocationTargetException {
        j93 j93Var = wo1.e;
        Boolean bool = null;
        if (j93Var == null) {
            try {
                j93Var = new j93(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 21);
            } catch (NoSuchMethodException unused) {
                j93Var = new j93(bool, bool, bool, bool, (byte) 21);
            }
            wo1.e = j93Var;
        }
        Method method = (Method) j93Var.n;
        if (method != null) {
            Object objInvoke = method.invoke(this.a, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a86.class.getName() + ": " + this.a;
    }
}
