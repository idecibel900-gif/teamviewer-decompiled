package o;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q25 extends cx2 implements Function1 {
    public static final q25 n = new q25(1, j51.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && hm3.h(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new i51(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return h51.a;
    }
}
