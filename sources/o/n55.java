package o;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class n55 extends io.sentry.l6 {
    public CharSequence c;

    @Override // io.sentry.l6
    public final void d(j93 j93Var) {
        new Notification.BigTextStyle((Notification.Builder) j93Var.f1141o).setBigContentTitle((CharSequence) this.b).bigText(this.c);
    }

    @Override // io.sentry.l6
    public final String i() {
        return "o.n55";
    }
}
