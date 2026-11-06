package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class py2 extends u1 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, py2> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected l88 unknownFields;

    public py2() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = l88.f;
    }

    public static py2 d(Class cls) {
        py2 py2Var = defaultInstanceMap.get(cls);
        if (py2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                py2Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (py2Var != null) {
            return py2Var;
        }
        try {
            py2 py2Var2 = (py2) ((py2) e98.a.allocateInstance(cls)).c(6);
            if (py2Var2 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, py2Var2);
            return py2Var2;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object e(Method method, py2 py2Var, Object... objArr) {
        try {
            return method.invoke(py2Var, objArr);
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

    public static final boolean f(py2 py2Var, boolean z) {
        byte bByteValue = ((Byte) py2Var.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        vw5 vw5Var = vw5.c;
        vw5Var.getClass();
        boolean zB = vw5Var.a(py2Var.getClass()).b(py2Var);
        if (z) {
            py2Var.c(2);
        }
        return zB;
    }

    public static void j(Class cls, py2 py2Var) {
        py2Var.h();
        defaultInstanceMap.put(cls, py2Var);
    }

    @Override // o.u1
    public final int a(cj6 cj6Var) {
        int iH;
        int iH2;
        if (g()) {
            if (cj6Var == null) {
                vw5 vw5Var = vw5.c;
                vw5Var.getClass();
                iH2 = vw5Var.a(getClass()).h(this);
            } else {
                iH2 = cj6Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            hk0.l(fx3.e(iH2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (cj6Var == null) {
            vw5 vw5Var2 = vw5.c;
            vw5Var2.getClass();
            iH = vw5Var2.a(getClass()).h(this);
        } else {
            iH = cj6Var.h(this);
        }
        k(iH);
        return iH;
    }

    @Override // o.u1
    public final void b(bv0 bv0Var) {
        vw5 vw5Var = vw5.c;
        vw5Var.getClass();
        cj6 cj6VarA = vw5Var.a(getClass());
        xc0 xc0Var = bv0Var.a;
        if (xc0Var == null) {
            xc0Var = new xc0(bv0Var);
        }
        cj6VarA.f(this, xc0Var);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vw5 vw5Var = vw5.c;
        vw5Var.getClass();
        return vw5Var.a(getClass()).e(this, (py2) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            vw5 vw5Var = vw5.c;
            vw5Var.getClass();
            return vw5Var.a(getClass()).i(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        vw5 vw5Var2 = vw5.c;
        vw5Var2.getClass();
        int i2 = vw5Var2.a(getClass()).i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    public final py2 i() {
        return (py2) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            hk0.l(fx3.e(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = sq4.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        sq4.c(this, sb, 0);
        return sb.toString();
    }
}
