package o;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r55 {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public r55(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, String str) {
        this.a.cancel(str, i);
    }
}
