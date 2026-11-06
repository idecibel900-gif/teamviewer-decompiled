package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class my2 {
    public final t1 a;
    public final Object b;
    public final t1 c;
    public final ly2 d;
    public final Method e;

    public my2(t1 t1Var, Object obj, t1 t1Var2, ly2 ly2Var, Class cls) {
        if (t1Var == null) {
            hk0.g("Null containingTypeDefaultInstance");
            throw null;
        }
        if (ly2Var.n == yl8.r && t1Var2 == null) {
            hk0.g("Null messageDefaultInstance");
            throw null;
        }
        this.a = t1Var;
        this.b = obj;
        this.c = t1Var2;
        this.d = ly2Var;
        if (!ol3.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 52);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final Object a(Object obj) {
        if (this.d.n.m != am8.u) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            an4.n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            an4.n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final Object b(Object obj) {
        return this.d.n.m == am8.u ? Integer.valueOf(((ol3) obj).getNumber()) : obj;
    }
}
