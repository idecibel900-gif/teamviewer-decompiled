package o;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yp8 implements lu0 {
    public static final cj3 j = new cj3("ClientNotification.API", new so8((byte) 2), new z06(29));
    public static final cj3 k = new cj3("ClientTelemetry.API", new so8((byte) 3), new z06(29));
    public static final cj3 l = new cj3("CloudMessaging.API", new so8((byte) 4), new z06(29));
    public final Context a;
    public final String b;
    public final df6 c;
    public final cj3 d;
    public final bq e;
    public final gr f;
    public final int g;
    public final cr h;
    public final vz2 i;

    public yp8(Context context, cj3 cj3Var, bq bqVar, qz2 qz2Var) {
        nv1.t(context, "Null context is not permitted.");
        nv1.t(cj3Var, "Api must not be null.");
        nv1.t(qz2Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        nv1.t(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String strB = (i < 30 || i < 30) ? null : b4.b(context);
        this.b = strB;
        this.c = i >= 31 ? new df6((Object) context.getAttributionSource(), (byte) 22) : null;
        this.d = cj3Var;
        this.e = bqVar;
        this.f = new gr(cj3Var, bqVar, strB);
        vz2 vz2VarC = vz2.c(applicationContext);
        this.i = vz2VarC;
        this.g = vz2VarC.h.getAndIncrement();
        this.h = qz2Var.a;
        xp8 xp8Var = vz2VarC.m;
        xp8Var.sendMessage(xp8Var.obtainMessage(7, this));
    }

    public final iu a() {
        iu iuVar = new iu((byte) 15, false);
        Set set = Collections.EMPTY_SET;
        ax axVar = (ax) iuVar.f1103o;
        if (axVar == null) {
            axVar = new ax(0);
            iuVar.f1103o = axVar;
        }
        axVar.addAll(set);
        Context context = this.a;
        iuVar.n = context.getClass().getName();
        iuVar.p = context.getPackageName();
        return iuVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public final hy8 b(int i, co7 co7Var) {
        dp8 dp8Var;
        do7 do7Var = new do7();
        hy8 hy8Var = do7Var.a;
        cr crVar = this.h;
        vz2 vz2Var = this.i;
        xp8 xp8Var = vz2Var.m;
        char c = co7Var.c;
        if (c != 0) {
            gr grVar = this.f;
            if (vz2Var.d()) {
                ef6 ef6Var = (ef6) df6.r().n;
                boolean z = true;
                if (ef6Var != null) {
                    if (ef6Var.n) {
                        boolean z2 = ef6Var.f709o;
                        ap8 ap8Var = (ap8) vz2Var.j.get(grVar);
                        if (ap8Var != null) {
                            com.google.android.gms.common.internal.a aVar = ap8Var.d;
                            if (aVar instanceof com.google.android.gms.common.internal.a) {
                                if (aVar.v == null || aVar.m()) {
                                    z = z2;
                                } else {
                                    a51 a51VarA = dp8.a(ap8Var, aVar, c);
                                    if (a51VarA != null) {
                                        ap8Var.n++;
                                        z = a51VarA.f299o;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    dp8Var = null;
                }
                dp8Var = new dp8(vz2Var, c, grVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                dp8Var = null;
            }
            if (dp8Var != null) {
                Objects.requireNonNull(xp8Var);
                hy8Var.b(new fj(xp8Var, (byte) 5), dp8Var);
            }
        }
        xp8Var.sendMessage(xp8Var.obtainMessage(4, new hp8(new pp8(i, co7Var, do7Var, crVar), vz2Var.i.get(), this)));
        return hy8Var;
    }
}
