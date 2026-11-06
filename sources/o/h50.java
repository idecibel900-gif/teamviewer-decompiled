package o;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class h50 implements Function1 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f950o;
    public final Object p;

    public /* synthetic */ h50(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f950o = obj2;
        this.p = obj3;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + wd4.n + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((xd4) this.n));
        xd4.e(assertionError);
        return assertionError;
    }

    public AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((xd4) this.n));
        xd4.e(assertionError);
        return assertionError;
    }

    public AssertionError g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((xd4) this.n), th);
        xd4.e(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:99:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:99:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:99:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007b A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:99:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:17:0x0048, B:20:0x0053, B:22:0x0059, B:24:0x005d, B:29:0x0068, B:30:0x006b, B:32:0x006e, B:34:0x0074, B:36:0x0078, B:37:0x007b, B:38:0x007e, B:40:0x0081, B:54:0x00a3, B:58:0x00af, B:59:0x00b3, B:60:0x00b4, B:61:0x00b6, B:66:0x00bf, B:68:0x00ca, B:69:0x00ce, B:70:0x00cf, B:71:0x00d2, B:73:0x00d6, B:74:0x00d9, B:76:0x00db, B:77:0x00df, B:63:0x00b8, B:64:0x00bc, B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1, B:56:0x00a9, B:72:0x00d3), top: B:99:0x0048, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:43:0x0088, B:47:0x0095, B:51:0x009d, B:52:0x00a1), top: B:97:0x0088, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) throws Throwable {
        Object objPut;
        io.sentry.android.core.u0 u0VarD;
        byte b = this.m;
        Object obj2 = this.p;
        Object obj3 = this.f950o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                KeyEvent keyEvent = ((dx3) obj).a;
                px4 px4Var = (px4) obj3;
                k08 k08Var = (k08) obj4;
                if (!k08Var.b()) {
                    px4Var.setValue(Boolean.FALSE);
                } else if (yo1.F(keyEvent) == 2 && xw3.a(qs1.m(keyEvent.getKeyCode()), xw3.u)) {
                    ((px4) obj2).setValue(Boolean.FALSE);
                    k08Var.a();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                l28 l28Var = (l28) obj;
                g42 g42Var = (g42) l28Var;
                if (!((hi) vn4.q0((g42) obj3).getDragAndDropManager()).b.contains(g42Var) || !io1.G(g42Var, wo1.M((xk1) obj2))) {
                    return k28.m;
                }
                ((k76) obj4).m = l28Var;
                return k28.f1225o;
            case 2:
                Object obj5 = iq8.P;
                xd4 xd4Var = (xd4) obj4;
                d82 d82Var = xd4Var.b;
                e07 e07Var = xd4Var.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj3;
                Object obj6 = concurrentHashMap.get(obj);
                AssertionError assertionErrorF = null;
                wd4 wd4Var = wd4.n;
                if (obj6 != null && obj6 != wd4Var) {
                    iq8.G(obj6);
                    if (obj6 == obj5) {
                        return null;
                    }
                    return obj6;
                }
                e07Var.lock();
                try {
                    Object objInvoke = concurrentHashMap.get(obj);
                    wd4 wd4Var2 = wd4.f2399o;
                    if (objInvoke == wd4Var) {
                        io.sentry.android.core.u0 u0VarD2 = xd4Var.d(obj, "");
                        if (u0VarD2 == null) {
                            c(3);
                            throw null;
                        }
                        if (u0VarD2.n) {
                            objInvoke = wd4Var2;
                            if (objInvoke != wd4Var2) {
                                u0VarD = xd4Var.d(obj, "");
                                if (u0VarD != null) {
                                    c(3);
                                    throw null;
                                }
                                if (!u0VarD.n) {
                                    objInvoke = u0VarD.f127o;
                                } else {
                                    if (objInvoke != null) {
                                        concurrentHashMap.put(obj, wd4Var);
                                        objInvoke = ((Function1) obj2).invoke(obj);
                                        if (objInvoke == null) {
                                            obj5 = objInvoke;
                                        }
                                        objPut = concurrentHashMap.put(obj, obj5);
                                        if (objPut == wd4Var) {
                                            assertionErrorF = f(obj, objPut);
                                            throw assertionErrorF;
                                        }
                                        e07Var.unlock();
                                        throw th;
                                    }
                                    iq8.G(objInvoke);
                                    if (objInvoke == obj5) {
                                        objInvoke = null;
                                    }
                                }
                            } else {
                                if (objInvoke != null) {
                                    concurrentHashMap.put(obj, wd4Var);
                                    objInvoke = ((Function1) obj2).invoke(obj);
                                    if (objInvoke == null) {
                                        obj5 = objInvoke;
                                    }
                                    objPut = concurrentHashMap.put(obj, obj5);
                                    if (objPut == wd4Var) {
                                        assertionErrorF = f(obj, objPut);
                                        throw assertionErrorF;
                                    }
                                    e07Var.unlock();
                                    throw th;
                                }
                                iq8.G(objInvoke);
                                if (objInvoke == obj5) {
                                    objInvoke = null;
                                }
                            }
                        } else {
                            objInvoke = u0VarD2.f127o;
                        }
                    } else if (objInvoke != wd4Var2) {
                        u0VarD = xd4Var.d(obj, "");
                        if (u0VarD != null) {
                            c(3);
                            throw null;
                        }
                        if (!u0VarD.n) {
                            objInvoke = u0VarD.f127o;
                        } else {
                            if (objInvoke != null) {
                                concurrentHashMap.put(obj, wd4Var);
                                objInvoke = ((Function1) obj2).invoke(obj);
                                if (objInvoke == null) {
                                    obj5 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj5);
                                if (objPut == wd4Var) {
                                    assertionErrorF = f(obj, objPut);
                                    throw assertionErrorF;
                                }
                                e07Var.unlock();
                                throw th;
                            }
                            iq8.G(objInvoke);
                            if (objInvoke == obj5) {
                                objInvoke = null;
                            }
                        }
                    } else {
                        if (objInvoke != null) {
                            try {
                                concurrentHashMap.put(obj, wd4Var);
                                objInvoke = ((Function1) obj2).invoke(obj);
                                if (objInvoke == null) {
                                    obj5 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj5);
                                if (objPut == wd4Var) {
                                    assertionErrorF = f(obj, objPut);
                                    throw assertionErrorF;
                                }
                            } catch (Throwable th) {
                                if (bt1.H(th)) {
                                    try {
                                        Object objRemove = concurrentHashMap.remove(obj);
                                        if (objRemove != wd4Var) {
                                            throw e(obj, objRemove);
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        throw g(obj, th2);
                                    }
                                }
                                if (th != assertionErrorF) {
                                    Object objPut2 = concurrentHashMap.put(obj, new tn8(th));
                                    if (objPut2 != wd4Var) {
                                        throw f(obj, objPut2);
                                    }
                                    d82Var.getClass();
                                    throw th;
                                }
                                try {
                                    concurrentHashMap.remove(obj);
                                    d82Var.getClass();
                                    throw th;
                                } catch (Throwable th3) {
                                    throw g(obj, th3);
                                }
                            }
                            e07Var.unlock();
                            throw th;
                        }
                        iq8.G(objInvoke);
                        if (objInvoke == obj5) {
                            objInvoke = null;
                        }
                    }
                    e07Var.unlock();
                    return objInvoke;
                } catch (Throwable th4) {
                    e07Var.unlock();
                    throw th4;
                }
            default:
                s46 s46Var = (s46) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                ff8 ff8Var = (ff8) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(ff8Var);
                } else {
                    s46Var.b.getViewTreeObserver().removeOnPreDrawListener(ff8Var);
                }
                return f88.a;
        }
    }
}
