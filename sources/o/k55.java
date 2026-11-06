package o;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class k55 {
    public final Bundle a;
    public IconCompat b;
    public final ga6[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;
    public final boolean i;

    public k55(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ga6[] ga6VarArr, boolean z, boolean z2, boolean z3) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.c() == 2) {
            this.f = iconCompat.b();
        }
        this.g = o55.c(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = ga6VarArr;
        this.d = z;
        this.e = z2;
        this.i = z3;
    }
}
