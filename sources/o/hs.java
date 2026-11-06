package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class hs {
    public static final gs m = new gs(new m12((byte) 1));
    public static final int n = -100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ld4 f1003o = null;
    public static ld4 p = null;
    public static Boolean q = null;
    public static boolean r = false;
    public static final ax s = new ax(0);
    public static final Object t = new Object();
    public static final Object u = new Object();

    public static boolean d(Context context) {
        if (q == null) {
            try {
                int i = ku.m;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ku.class), 640).metaData;
                if (bundle != null) {
                    q = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                q = Boolean.FALSE;
            }
        }
        return q.booleanValue();
    }

    public static void g(qs qsVar) {
        synchronized (t) {
            try {
                ax axVar = s;
                axVar.getClass();
                qw qwVar = new qw(axVar);
                while (qwVar.hasNext()) {
                    hs hsVar = (hs) ((WeakReference) qwVar.next()).get();
                    if (hsVar == qsVar || hsVar == null) {
                        qwVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean i(int i);

    public abstract void j(int i);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
