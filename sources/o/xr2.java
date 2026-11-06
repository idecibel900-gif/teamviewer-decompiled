package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xr2 implements z82 {
    public final Context a;
    public final wr2 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public zu1 g;

    public xr2(Context context, wr2 wr2Var) {
        io1.A(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = wr2Var;
    }

    @Override // o.z82
    public final void a(zu1 zu1Var) {
        synchronized (this.c) {
            this.g = zu1Var;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new i11("emojiCompat"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor2;
                    this.e = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new pc0((Object) this, (byte) 14));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.g = null;
                Handler handler = this.d;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.d = null;
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ps2 c() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            os2 os2VarA = vr2.a(context, Collections.unmodifiableList(arrayList));
            boolean z = os2VarA.b;
            if (z) {
                hk0.o(fx3.f(z ? 1 : 0, "fetchFonts failed (", ")"));
                return null;
            }
            ps2[] ps2VarArr = (ps2[]) os2VarA.a.get(0);
            if (ps2VarArr != null && ps2VarArr.length != 0) {
                return ps2VarArr[0];
            }
            hk0.o("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            an4.n("provider not found", e);
            return null;
        }
    }
}
