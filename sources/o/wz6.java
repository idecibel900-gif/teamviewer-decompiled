package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class wz6 extends com.google.android.gms.common.internal.a {
    public final io.sentry.android.core.d A;
    public final Bundle B;
    public final Integer C;
    public final boolean z;

    public wz6(Context context, Looper looper, io.sentry.android.core.d dVar, Bundle bundle, tz2 tz2Var, uz2 uz2Var) {
        super(context, looper, 44, dVar, tz2Var, uz2Var);
        this.z = true;
        this.A = dVar;
        this.B = bundle;
        this.C = (Integer) dVar.s;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle e() {
        io.sentry.android.core.d dVar = this.A;
        boolean zEquals = this.c.getPackageName().equals((String) dVar.p);
        Bundle bundle = this.B;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) dVar.p);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean n() {
        return this.z;
    }
}
