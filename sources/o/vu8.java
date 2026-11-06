package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class vu8 extends iu8 {
    private static final Map zzb = new ConcurrentHashMap();
    protected tv8 zzc;
    private int zzd;

    public vu8() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = tv8.f;
    }

    public static void f(Class cls, vu8 vu8Var) {
        vu8Var.e();
        zzb.put(cls, vu8Var);
    }

    public static final boolean i(vu8 vu8Var, boolean z) {
        byte bByteValue = ((Byte) vu8Var.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = kv8.b.a(vu8Var.getClass()).d(vu8Var);
        if (z) {
            vu8Var.j(2);
        }
        return zD;
    }

    public static vu8 m(Class cls) {
        Map map = zzb;
        vu8 vu8Var = (vu8) map.get(cls);
        if (vu8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vu8Var = (vu8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (vu8Var != null) {
            return vu8Var;
        }
        try {
            vu8 vu8Var2 = (vu8) ((vu8) vv8.a.allocateInstance(cls)).j(6);
            if (vu8Var2 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, vu8Var2);
            return vu8Var2;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object n(Method method, vu8 vu8Var, Object... objArr) {
        try {
            return method.invoke(vu8Var, objArr);
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

    @Override // o.iu8
    public final void a(cv0 cv0Var) {
        qv8 qv8VarA = kv8.b.a(getClass());
        hj8 hj8Var = (hj8) cv0Var.e;
        if (hj8Var == null) {
            hj8Var = new hj8(cv0Var);
        }
        qv8VarA.i(this, hj8Var);
    }

    @Override // o.iu8
    public final int c(qv8 qv8Var) {
        if (h()) {
            int iE = qv8Var.e(this);
            if (iE >= 0) {
                return iE;
            }
            hk0.l(fx3.e(iE, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = qv8Var.e(this);
        if (iE2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        hk0.l(fx3.e(iE2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // o.iu8
    public final int d() {
        if (h()) {
            int iE = kv8.b.a(getClass()).e(this);
            if (iE >= 0) {
                return iE;
            }
            hk0.l(fx3.e(iE, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iE2 = kv8.b.a(getClass()).e(this);
        if (iE2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        hk0.l(fx3.e(iE2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kv8.b.a(getClass()).b(this, (vu8) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return kv8.b.a(getClass()).c(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iC = kv8.b.a(getClass()).c(this);
        this.zza = iC;
        return iC;
    }

    public abstract Object j(int i);

    public final uu8 k() {
        return (uu8) j(5);
    }

    public final uu8 l() {
        uu8 uu8Var = (uu8) j(5);
        vu8 vu8Var = uu8Var.m;
        if (!vu8Var.getClass().isInstance(this)) {
            hk0.g("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (!vu8Var.equals(this)) {
            if (!uu8Var.n.h()) {
                vu8 vu8Var2 = (vu8) uu8Var.m.j(4);
                kv8.b.a(vu8Var2.getClass()).f(vu8Var2, uu8Var.n);
                uu8Var.n = vu8Var2;
            }
            vu8 vu8Var3 = uu8Var.n;
            kv8.b.a(vu8Var3.getClass()).f(vu8Var3, this);
        }
        return uu8Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = hv8.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        hv8.c(this, sb, 0);
        return sb.toString();
    }
}
