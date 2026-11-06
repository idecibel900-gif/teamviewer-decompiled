package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class us {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static us c;
    public bc6 a;

    public static synchronized us a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return bc6.f(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            us usVar = new us();
            c = usVar;
            usVar.a = bc6.c();
            bc6 bc6Var = c.a;
            d11 d11Var = new d11((byte) 4);
            synchronized (bc6Var) {
                bc6Var.e = d11Var;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
