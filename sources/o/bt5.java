package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bt5 {
    public static final String a = we4.i("ProcessUtils");

    public static final boolean a(Context context, d11 d11Var) {
        String strJ;
        Object next;
        context.getClass();
        d11Var.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strJ = dq.j();
        } else {
            strJ = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, nm8.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strJ = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strJ = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                if (we4.f().m <= 3) {
                    Log.d(a, "Unable to check ActivityThread for processName", th);
                }
            }
        }
        return im3.n(strJ, context.getApplicationInfo().processName);
    }
}
