package o;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class l61 {
    public final yc4 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public l61(Context context, yc4 yc4Var) {
        this.a = yc4Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((eh6) this.a.q).execute(new io.sentry.u4((Object) lv0.P0(this.d), (Object) this, (byte) 23));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
