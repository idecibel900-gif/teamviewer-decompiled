package o;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i30 implements hc1, oe1, Serializable {
    private final hc1<Object> completion;

    public i30(hc1 hc1Var) {
        this.completion = hc1Var;
    }

    public hc1 create(Object obj, hc1 hc1Var) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // o.oe1
    public oe1 getCallerFrame() {
        hc1<Object> hc1Var = this.completion;
        if (hc1Var instanceof oe1) {
            return (oe1) hc1Var;
        }
        return null;
    }

    public final hc1<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        ci1 ci1Var = (ci1) getClass().getAnnotation(ci1.class);
        String str = null;
        if (ci1Var == null || ci1Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? ci1Var.l()[iIntValue] : -1;
        rs4 rs4Var = ck3.E;
        rs4 rs4Var2 = ck3.F;
        if (rs4Var2 == null) {
            try {
                rs4 rs4Var3 = new rs4(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                ck3.F = rs4Var3;
                rs4Var2 = rs4Var3;
            } catch (Exception unused2) {
                ck3.F = rs4Var;
                rs4Var2 = rs4Var;
            }
        }
        if (rs4Var2 != rs4Var && (method = rs4Var2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = rs4Var2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = rs4Var2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = ci1Var.c();
        } else {
            strC = str + '/' + ci1Var.c();
        }
        return new StackTraceElement(strC, ci1Var.m(), ci1Var.f(), i);
    }

    public Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        return obj;
    }

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // o.hc1
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            i30 i30Var = (i30) r2;
            hc1<Object> hc1Var = i30Var.completion;
            hc1Var.getClass();
            try {
                obj = i30Var.invokeSuspend(obj);
                if (obj == ne1.m) {
                    return;
                }
            } catch (Throwable th) {
                obj = new sc6(th);
            }
            i30Var.releaseIntercepted();
            if (!(hc1Var instanceof i30)) {
                hc1Var.resumeWith(obj);
                return;
            }
            r2 = hc1Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
