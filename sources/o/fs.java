package o;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Context n;

    public /* synthetic */ fs(Context context, byte b) {
        this.m = b;
        this.n = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    @Override // java.lang.Runnable
    public final void run() {
        ld4 ld4Var;
        Object systemService;
        Context context;
        byte b = this.m;
        Context context2 = this.n;
        switch (b) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            ax axVar = hs.s;
                            axVar.getClass();
                            qw qwVar = new qw(axVar);
                            while (true) {
                                if (qwVar.hasNext()) {
                                    hs hsVar = (hs) ((WeakReference) qwVar.next()).get();
                                    if (hsVar != null && (context = ((qs) hsVar).w) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                ld4Var = new ld4(new md4(c4.k(systemService)));
                            } else {
                                ld4Var = ld4.b;
                            }
                        } else {
                            ld4Var = hs.f1003o;
                            if (ld4Var == null) {
                                ld4Var = ld4.b;
                            }
                        }
                        if (ld4Var.a.a.isEmpty()) {
                            String strW0 = db8.w0(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                c4.l(systemService2, LocaleList.forLanguageTags(strW0));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                hs.r = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new fs(context2, (byte) 2));
                break;
            default:
                db8.P0(context2, new xv((byte) 1), db8.B, false);
                break;
        }
    }
}
