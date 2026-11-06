package o;

import android.content.Intent;
import android.content.SharedPreferences;
import android.service.notification.StatusBarNotification;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.mru.ConnectionHistoryManager;
import com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallbackImpl;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.remotecontrolviewlib.activity.BiometricProtectionPromotionActivity;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k6 extends AccountLoginStateChangedSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public k6(gt5 gt5Var, nx3 nx3Var) {
        this.a = (byte) 4;
        this.b = gt5Var;
    }

    @Override // com.teamviewer.remotecontrollib.swig.AccountLoginStateChangedSignalCallback
    public final void OnCallback(LoginState loginState) {
        int i;
        switch (this.a) {
            case 0:
                loginState.getClass();
                ((Function1) this.b).invoke(loginState);
                return;
            case 1:
                z60 z60Var = (z60) this.b;
                RemoteControlApplication remoteControlApplication = (RemoteControlApplication) z60Var.f2673o;
                if (loginState == LoginState.LoggedIn) {
                    LockManager lockManager = (LockManager) z60Var.n;
                    if (!z60Var.m && !((SharedPreferences) z60Var.p).getBoolean("lock_promoted", false) && lockManager.a() && !lockManager.b.getBoolean("lock_enabled", false)) {
                        if (it1.c == null) {
                            im3.e0("viewFactory");
                            throw null;
                        }
                        Intent intent = new Intent(remoteControlApplication, (Class<?>) BiometricProtectionPromotionActivity.class);
                        intent.addFlags(268435456);
                        remoteControlApplication.startActivity(intent);
                    }
                    z60Var.m = false;
                    return;
                }
                return;
            case 2:
                t11 t11Var = (t11) this.b;
                if (t11Var.c == LoginState.LoggedIn && loginState == LoginState.ReadyForLogin) {
                    RemoteControlApplication remoteControlApplication2 = t11Var.b;
                    remoteControlApplication2.getClass();
                    r55 r55Var = new r55(remoteControlApplication2);
                    StatusBarNotification[] activeNotifications = r55Var.a.getActiveNotifications();
                    Iterable arrayList = activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
                    arrayList.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((StatusBarNotification) obj).getId() == 18) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        r55Var.a(18, ((StatusBarNotification) it.next()).getTag());
                    }
                }
                t11Var.c = loginState;
                return;
            case 3:
                loginState.getClass();
                ConnectionHistoryManager connectionHistoryManager = (ConnectionHistoryManager) this.b;
                if (us1.C(connectionHistoryManager.d, LoginState.LoginInProgress, LoginState.NotReady_LoginPending, LoginState.LoggedIn) && loginState == LoginState.ReadyForLogin) {
                    ye4.a("ConnectionHistoryManager", "Clear ConnectionHistory due to Account Sign Out");
                    connectionHistoryManager.b.a();
                }
                connectionHistoryManager.d = loginState;
                return;
            case 4:
                i = loginState != null ? s85.a[loginState.ordinal()] : -1;
                if (i == 1) {
                    n85.b.set(true);
                    ((gt5) this.b).p.b(r85.a[loginState.ordinal()] == 1 ? m51.m : m51.n);
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    n85.b.set(false);
                    synchronized (y85.m) {
                        y85.n = null;
                    }
                    ((gt5) this.b).p.b(r85.a[loginState.ordinal()] == 1 ? m51.m : m51.n);
                    return;
                }
            default:
                n38 n38Var = (n38) this.b;
                LinkedList linkedList = n38Var.d;
                i = loginState != null ? m38.a[loginState.ordinal()] : -1;
                if (i == 1) {
                    while (!linkedList.isEmpty()) {
                        k38 k38Var = (k38) linkedList.remove();
                        int i2 = k38Var.a;
                        String str = k38Var.b;
                        String str2 = k38Var.c;
                        tk1 tk1Var = g22.a;
                        im3.R(hm3.c(ok4.a), null, null, new l38(str, str2, n38Var, i2, null), 3);
                    }
                    return;
                }
                if (i != 2) {
                    return;
                }
                RemoteControlApplication remoteControlApplication3 = n38Var.b;
                remoteControlApplication3.getClass();
                r55 r55Var2 = new r55(remoteControlApplication3);
                StatusBarNotification[] activeNotifications2 = r55Var2.a.getActiveNotifications();
                Iterable arrayList3 = activeNotifications2 == null ? new ArrayList() : Arrays.asList(activeNotifications2);
                arrayList3.getClass();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (im3.n(((StatusBarNotification) obj2).getTag(), "TeamViewerRcTrustedDeviceNotification")) {
                        arrayList4.add(obj2);
                    }
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    r55Var2.a(((StatusBarNotification) it2.next()).getId(), "TeamViewerRcTrustedDeviceNotification");
                }
                return;
        }
    }

    public /* synthetic */ k6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
