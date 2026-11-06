package o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ny2 extends s1 {
    private static Map<Object, ny2> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected k88 unknownFields;

    public ny2() {
        this.memoizedHashCode = 0;
        this.unknownFields = k88.f;
        this.memoizedSerializedSize = -1;
    }

    public static ny2 g(Class cls) {
        ny2 ny2Var = defaultInstanceMap.get(cls);
        if (ny2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ny2Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ny2Var != null) {
            return ny2Var;
        }
        try {
            ny2 ny2Var2 = (ny2) ((ny2) d98.b.allocateInstance(cls)).f(6);
            if (ny2Var2 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, ny2Var2);
            return ny2Var2;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object h(Method method, ny2 ny2Var, Object... objArr) {
        try {
            return method.invoke(ny2Var, objArr);
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

    public static ny2 j(ny2 ny2Var, yh0 yh0Var, cg2 cg2Var) throws qm3 {
        vh0 vh0Var = (vh0) yh0Var;
        byte[] bArr = vh0Var.p;
        int iG = vh0Var.g();
        int size = vh0Var.size();
        ru0 ru0Var = new ru0(bArr, iG, size, true);
        try {
            ru0Var.k(size);
            ny2 ny2Var2 = (ny2) ny2Var.f(4);
            try {
                uw5 uw5Var = uw5.c;
                uw5Var.getClass();
                bj6 bj6VarA = uw5Var.a(ny2Var2.getClass());
                wu0 wu0Var = (wu0) ru0Var.n;
                if (wu0Var == null) {
                    wu0Var = new wu0(ru0Var);
                }
                bj6VarA.g(ny2Var2, wu0Var, cg2Var);
                bj6VarA.a(ny2Var2);
                if (ru0Var.t != 0) {
                    throw new qm3("Protocol message end-group tag did not match expected tag.");
                }
                if (ny2Var2.i()) {
                    return ny2Var2;
                }
                throw new qm3(new y78().getMessage());
            } catch (IOException e) {
                if (e.getCause() instanceof qm3) {
                    throw ((qm3) e.getCause());
                }
                throw new qm3(e.getMessage());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof qm3) {
                    throw ((qm3) e2.getCause());
                }
                throw e2;
            }
        } catch (qm3 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static ny2 k(ny2 ny2Var, byte[] bArr, cg2 cg2Var) throws qm3 {
        int length = bArr.length;
        ny2 ny2Var2 = (ny2) ny2Var.f(4);
        try {
            uw5 uw5Var = uw5.c;
            uw5Var.getClass();
            bj6 bj6VarA = uw5Var.a(ny2Var2.getClass());
            jw jwVar = new jw();
            cg2Var.getClass();
            bj6VarA.d(ny2Var2, bArr, 0, length, jwVar);
            bj6VarA.a(ny2Var2);
            if (ny2Var2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (ny2Var2.i()) {
                return ny2Var2;
            }
            throw new qm3(new y78().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof qm3) {
                throw ((qm3) e.getCause());
            }
            throw new qm3(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw qm3.e();
        }
    }

    public static void l(Class cls, ny2 ny2Var) {
        defaultInstanceMap.put(cls, ny2Var);
    }

    @Override // o.s1
    public final int a() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        int iH = uw5Var.a(getClass()).h(this);
        this.memoizedSerializedSize = iH;
        return iH;
    }

    @Override // o.s1
    public final void d(yu0 yu0Var) {
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        bj6 bj6VarA = uw5Var.a(getClass());
        df6 df6Var = yu0Var.a;
        if (df6Var == null) {
            df6Var = new df6(yu0Var);
        }
        bj6VarA.e(this, df6Var);
    }

    public final ey2 e() {
        return (ey2) f(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((ny2) f(6)).getClass().isInstance(obj)) {
            return false;
        }
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        return uw5Var.a(getClass()).f(this, (ny2) obj);
    }

    public abstract Object f(int i);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        int i2 = uw5Var.a(getClass()).i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    public final boolean i() {
        byte bByteValue = ((Byte) f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        uw5 uw5Var = uw5.c;
        uw5Var.getClass();
        boolean zB = uw5Var.a(getClass()).b(this);
        f(2);
        return zB;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        di1.A(this, sb, 0);
        return sb.toString();
    }
}
