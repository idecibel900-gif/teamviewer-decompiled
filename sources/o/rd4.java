package o;

/* JADX INFO: loaded from: classes2.dex */
public final class rd4 extends ud4 implements f55 {
    public volatile a65 p;
    public final /* synthetic */ t q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd4(xd4 xd4Var, a3 a3Var, t tVar) {
        super(xd4Var, a3Var);
        this.q = tVar;
        if (xd4Var == null) {
            g(0);
            throw null;
        }
        this.p = null;
    }

    public static /* synthetic */ void c(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // o.ud4, kotlin.jvm.functions.Function0
    public final Object a() throws Throwable {
        Object objA;
        a65 a65Var = this.p;
        if (a65Var == null || ((Thread) a65Var.f302o) != Thread.currentThread()) {
            objA = super.a();
        } else if (((Thread) a65Var.f302o) == Thread.currentThread()) {
            objA = a65Var.n;
        } else {
            hk0.l("No value in this thread (hasValue should be checked before)");
            objA = null;
        }
        if (objA != null) {
            return objA;
        }
        g(2);
        throw null;
    }

    @Override // o.ud4
    public final void e(Object obj) {
        this.p = new a65(obj, (byte) 25);
        try {
            if (obj == null) {
                c(2);
                throw null;
            }
            this.q.invoke(obj);
            this.p = null;
        } catch (Throwable th) {
            this.p = null;
            throw th;
        }
    }

    @Override // o.ud4
    public final io.sentry.android.core.u0 f(boolean z) {
        return new io.sentry.android.core.u0((byte) 4, new c3(qf0.K(hd2.d)), false);
    }
}
