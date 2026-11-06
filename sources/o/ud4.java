package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class ud4 implements Function0 {
    public final xd4 m;
    public final Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Object f2201o;

    public ud4(xd4 xd4Var, Function0 function0) {
        if (xd4Var == null) {
            c(0);
            throw null;
        }
        this.f2201o = wd4.m;
        this.m = xd4Var;
        this.n = function0;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // kotlin.jvm.functions.Function0
    public Object a() throws Throwable {
        Object objA;
        io.sentry.android.core.u0 u0VarF;
        wd4 wd4Var = wd4.f2399o;
        wd4 wd4Var2 = wd4.n;
        Object obj = this.f2201o;
        if (!(obj instanceof wd4)) {
            iq8.G(obj);
            return obj;
        }
        this.m.a.lock();
        try {
            Object obj2 = this.f2201o;
            if (!(obj2 instanceof wd4)) {
                iq8.G(obj2);
                this.m.a.unlock();
                return obj2;
            }
            if (obj2 == wd4Var2) {
                this.f2201o = wd4Var;
                io.sentry.android.core.u0 u0VarF2 = f(true);
                if (!u0VarF2.n) {
                    objA = u0VarF2.f127o;
                } else if (obj2 == wd4Var) {
                    u0VarF = f(false);
                    if (u0VarF.n) {
                        this.f2201o = wd4Var2;
                        try {
                            objA = this.n.a();
                            e(objA);
                            this.f2201o = objA;
                        } catch (Throwable th) {
                            if (bt1.H(th)) {
                                this.f2201o = wd4.m;
                                throw th;
                            }
                            if (this.f2201o == wd4Var2) {
                                this.f2201o = new tn8(th);
                            }
                            this.m.b.getClass();
                            throw th;
                        }
                    } else {
                        objA = u0VarF.f127o;
                    }
                } else {
                    this.f2201o = wd4Var2;
                    objA = this.n.a();
                    e(objA);
                    this.f2201o = objA;
                }
            } else if (obj2 == wd4Var) {
                u0VarF = f(false);
                if (u0VarF.n) {
                    objA = u0VarF.f127o;
                } else {
                    this.f2201o = wd4Var2;
                    objA = this.n.a();
                    e(objA);
                    this.f2201o = objA;
                }
            } else {
                this.f2201o = wd4Var2;
                objA = this.n.a();
                e(objA);
                this.f2201o = objA;
            }
            this.m.a.unlock();
            return objA;
        } catch (Throwable th2) {
            this.m.a.unlock();
            throw th2;
        }
    }

    public void e(Object obj) {
    }

    public io.sentry.android.core.u0 f(boolean z) {
        io.sentry.android.core.u0 u0VarD = this.m.d(null, "in a lazy value");
        if (u0VarD != null) {
            return u0VarD;
        }
        c(2);
        throw null;
    }
}
