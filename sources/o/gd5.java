package o;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class gd5 {
    public static final String a = we4.i("PackageManagerHelper");
    public static final HashMap b = new HashMap();

    public static final void a(PackageManager packageManager, ComponentName componentName, boolean z, hw2 hw2Var) {
        String str = a;
        try {
            if (z == ((Boolean) hw2Var.invoke(packageManager, componentName)).booleanValue()) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
            we4.f().c(str, componentName.getClassName() + " " + (z ? "enabled" : "disabled"));
        } catch (Exception e) {
            we4 we4VarF = we4.f();
            String str2 = componentName.getClassName() + " could not be " + (z ? "enabled" : "disabled");
            if (we4VarF.m <= 3) {
                Log.d(str, str2, e);
            }
        }
    }
}
