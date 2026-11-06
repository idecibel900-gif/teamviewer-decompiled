package o;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nq5 implements m36 {
    public final String m;
    public final g95 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function1 f1592o;
    public final me1 p;
    public final Object q = new Object();
    public volatile mq5 r;

    public nq5(String str, g95 g95Var, Function1 function1, me1 me1Var) {
        this.m = str;
        this.n = g95Var;
        this.f1592o = function1;
        this.p = me1Var;
    }

    @Override // o.m36
    public final Object a(Object obj, fw3 fw3Var) {
        mq5 mq5Var;
        Context context = (Context) obj;
        context.getClass();
        fw3Var.getClass();
        mq5 mq5Var2 = this.r;
        if (mq5Var2 != null) {
            return mq5Var2;
        }
        synchronized (this.q) {
            try {
                if (this.r == null) {
                    Context applicationContext = context.getApplicationContext();
                    g95 g95Var = this.n;
                    Function1 function1 = this.f1592o;
                    applicationContext.getClass();
                    List list = (List) function1.invoke(applicationContext);
                    me1 me1Var = this.p;
                    io.sentry.android.sqlite.d dVar = new io.sentry.android.sqlite.d(applicationContext, this, (byte) 3);
                    list.getClass();
                    this.r = new mq5(new mq5(new vh1(new oj2(new io.sentry.android.replay.a0(dVar, (byte) 9)), qf0.K(new oa1(list, null, (byte) 4)), g95Var, me1Var)));
                }
                mq5Var = this.r;
                mq5Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mq5Var;
    }
}
