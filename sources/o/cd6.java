package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cd6 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ d11 c;

    public cd6(d11 d11Var, Class cls) {
        this.c = d11Var;
        this.b = cls;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0074 A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        e93 e93VarB;
        Object obj2;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        yi5 yi5Var = pl5.b;
        if (yi5Var.k(method)) {
            return yi5Var.j(method, cls, obj, objArr2);
        }
        d11 d11Var = this.c;
        while (true) {
            Object objPutIfAbsent = ((ConcurrentHashMap) d11Var.m).get(method);
            if (!(objPutIfAbsent instanceof e93)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = ((ConcurrentHashMap) d11Var.m).get(method);
                        if (obj2 == null) {
                            e93VarB = (e93) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = ((ConcurrentHashMap) d11Var.m).putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = ((ConcurrentHashMap) d11Var.m).get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                e93VarB = (e93) obj2;
                                break;
                            }
                            try {
                                e93VarB = e93.b(d11Var, cls, method);
                                ((ConcurrentHashMap) d11Var.m).put(method, e93VarB);
                                break;
                            } catch (Throwable th2) {
                                ((ConcurrentHashMap) d11Var.m).remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                e93VarB = (e93) objPutIfAbsent;
                break;
            }
        }
        return e93VarB.a(new a75(e93VarB.a, obj, objArr2, e93VarB.b, e93VarB.c), objArr2);
    }
}
