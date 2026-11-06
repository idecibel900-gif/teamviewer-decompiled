package o;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class os4 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final mg6 a(Class cls) {
        cc ccVarJ;
        rl5 rl5VarJ;
        cls.getClass();
        ClassLoader classLoaderD = p76.d(cls);
        fh8 fh8Var = new fh8(classLoaderD);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(fh8Var);
        if (weakReference != null) {
            mg6 mg6Var = (mg6) weakReference.get();
            if (mg6Var != null) {
                return mg6Var;
            }
            concurrentHashMap.remove(fh8Var, weakReference);
        }
        xz2 xz2Var = xz2.N;
        byte b = 0;
        f71 f71Var = new f71(classLoaderD, false);
        ClassLoader classLoader = f88.class.getClassLoader();
        classLoader.getClass();
        f71 f71Var2 = new f71(classLoader, false);
        f71 f71Var3 = new f71(classLoaderD, false);
        jk0 jk0Var = jk0.H;
        xd4 xd4Var = new xd4("DeserializationComponentsForJava.ModuleData");
        yr3 yr3Var = new yr3(xd4Var);
        qs4 qs4Var = new qs4(sy4.g("<" + ("runtime module for " + classLoaderD) + '>'), xd4Var, yr3Var, 56);
        e07 e07Var = xd4Var.a;
        e07Var.lock();
        try {
            if (yr3Var.a != null) {
                throw new AssertionError("Built-ins module is already set: " + yr3Var.a + " (attempting to reset to " + qs4Var + ")");
            }
            yr3Var.a = qs4Var;
            e07Var.unlock();
            yr3Var.f = new wr3(qs4Var, (byte) 0);
            tp1 tp1Var = new tp1();
            l07 l07Var = new l07((byte) 0, false);
            j93 j93Var = new j93(xd4Var, qs4Var);
            jk0 jk0Var2 = jk0.E;
            rk5 rk5Var = new rk5(xd4Var);
            a96 a96Var = new a96(qs4Var, j93Var);
            ro3 ro3Var = ro3.c;
            op opVar = new op(ro3Var);
            rk5 rk5Var2 = new rk5(new aw((byte) 20));
            p35.b.getClass();
            q35 q35Var = o35.b;
            fh8 fh8Var2 = fh8Var;
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            j24 j24Var = new j24(new io3(xd4Var, f71Var3, f71Var, tp1Var, rk5Var, l07Var, jk0Var2, qs4Var, a96Var, opVar, rk5Var2, q35Var, ro3Var, new aw((byte) 12)));
            ps3 ps3Var = ps3.g;
            ps3Var.getClass();
            yt2 yt2Var = new yt2(f71Var, tp1Var, (byte) 11);
            d11 d11Var = new d11();
            d11Var.m = f71Var;
            d11Var.n = xd4Var.b(new t(d11Var, b));
            d11Var.f578o = qs4Var;
            d11Var.p = j93Var;
            d11Var.q = new cj3(qs4Var, j93Var);
            d11Var.r = ps3.g;
            d11Var.r = ps3Var;
            List listK = qf0.K(wl1.a);
            wy3 wy3Var = qs4Var.p;
            yr3 yr3Var2 = wy3Var instanceof yr3 ? (yr3) wy3Var : null;
            d82 d82Var = d82.D;
            if (yr3Var2 == null || (ccVarJ = yr3Var2.J()) == null) {
                ccVarJ = d82.n;
            }
            if (yr3Var2 == null || (rl5VarJ = yr3Var2.J()) == null) {
                rl5VarJ = z06.D;
            }
            io.sentry.android.replay.screenshot.k kVar = new io.sentry.android.replay.screenshot.k(xd4Var, qs4Var, yt2Var, d11Var, j24Var, jk0Var, d82Var, ea2.m, j93Var, ccVarJ, rl5VarJ, kt3.a, q35Var, new rk5(xd4Var), listK, xz2Var);
            tp1Var.a = kVar;
            l07Var.n = new xk1((Object) j24Var, (byte) 28);
            bs3 bs3VarJ = yr3Var.J();
            bs3 bs3VarJ2 = yr3Var.J();
            rk5 rk5Var3 = new rk5(xd4Var);
            bs3VarJ.getClass();
            bs3VarJ2.getClass();
            ds3 ds3Var = new ds3(xd4Var, f71Var2, qs4Var);
            xk1 xk1Var = new xk1((Object) ds3Var, (byte) 3);
            yf0 yf0Var = yf0.m;
            ds3Var.c = new io.sentry.android.replay.screenshot.k(xd4Var, qs4Var, xk1Var, new cj3(qs4Var, j93Var, yf0Var), ds3Var, qf0.L(new xf0(xd4Var, qs4Var), new vr3(xd4Var, qs4Var)), j93Var, bs3VarJ, bs3VarJ2, yf0Var.a, q35Var, rk5Var3, 262144);
            qs4Var.s = new d22(cx.g1(new qs4[]{qs4Var}));
            qs4Var.t = new l01(qf0.L(j24Var, ds3Var), "CompositeProvider@RuntimeModuleData for " + qs4Var);
            mg6 mg6Var2 = new mg6(kVar, new ep3(tp1Var, f71Var));
            while (true) {
                fh8 fh8Var3 = fh8Var2;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(fh8Var3, new WeakReference(mg6Var2));
                if (weakReference2 == null) {
                    return mg6Var2;
                }
                mg6 mg6Var3 = (mg6) weakReference2.get();
                if (mg6Var3 != null) {
                    return mg6Var3;
                }
                concurrentHashMap3.remove(fh8Var3, weakReference2);
                fh8Var2 = fh8Var3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } catch (Throwable th) {
            try {
                xd4Var.b.getClass();
                throw th;
            } catch (Throwable th2) {
                e07Var.unlock();
                throw th2;
            }
        }
    }
}
