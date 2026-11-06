package o;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t60 implements z82 {
    public Context a;

    public t60(ContextWrapper contextWrapper) {
        this.a = contextWrapper.getApplicationContext();
    }

    @Override // o.z82
    public void a(zu1 zu1Var) {
        i11 i11Var = new i11("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), i11Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new io.sentry.android.core.internal.util.j((Object) this, (Object) zu1Var, (Object) threadPoolExecutor, (byte) 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ng1 b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ng1 ng1Var = new ng1();
        ng1Var.m = p32.a(e8.n);
        f4 f4Var = new f4(context);
        ng1Var.n = f4Var;
        ng1Var.f1566o = p32.a(new yt2((Object) f4Var, (Object) new xc0((Object) f4Var, (byte) 25), (byte) 24));
        f4 f4Var2 = ng1Var.n;
        ng1Var.p = new ie2(f4Var2, (byte) 1);
        ex5 ex5VarA = p32.a(new a65((byte) 17, (Object) ng1Var.p, (Object) p32.a(new ie2(f4Var2, (byte) 0)), (boolean) (0 == true ? 1 : 0)));
        ng1Var.q = ex5VarA;
        wj5 wj5Var = new wj5((byte) 7);
        f4 f4Var3 = ng1Var.n;
        ep3 ep3Var = new ep3(f4Var3, ex5VarA, wj5Var, (byte) 19);
        ex5 ex5Var = ng1Var.m;
        ex5 ex5Var2 = ng1Var.f1566o;
        yc4 yc4Var = new yc4(ex5Var, ex5Var2, ep3Var, ex5VarA, ex5VarA);
        io.sentry.android.core.d dVar = new io.sentry.android.core.d();
        dVar.m = f4Var3;
        dVar.n = ex5Var2;
        dVar.f100o = ex5VarA;
        dVar.p = ep3Var;
        dVar.q = ex5Var;
        dVar.r = ex5VarA;
        dVar.s = ex5VarA;
        ng1Var.r = p32.a(new ep3(yc4Var, dVar, new pn5(ex5Var, ex5VarA, ep3Var, ex5VarA), (byte) 28));
        return ng1Var;
    }
}
