package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jy8 {
    public final Context a;
    public int b;
    public byte c = 0;

    public jy8(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        byte b = this.c;
        if (b != 0) {
            return b;
        }
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        if (xn8.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            io.sentry.android.core.v0.c("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.c = (byte) 2;
            return 2;
        }
        io.sentry.android.core.v0.j("Metadata", "Failed to resolve IID implementation package, falling back");
        this.c = (byte) 2;
        return 2;
    }

    public final synchronized int b() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = xn8.a(this.a).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                io.sentry.android.core.v0.j("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }
}
