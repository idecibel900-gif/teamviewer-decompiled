package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public abstract class xh2 {
    public static boolean a;
    public static final rz2 b = rz2.d;
    public static int c;

    public static void a(RemoteControlApplication remoteControlApplication) {
        int iB = b.b(remoteControlApplication, sz2.a);
        boolean z = true;
        if (iB != 0) {
            int i = wz2.c;
            if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
                ye4.c("FcmAvailabilityHelper", "User resolvable error: " + iB);
                c = iB;
            } else {
                ye4.c("FcmAvailabilityHelper", "Unsupported device: " + iB);
            }
            z = false;
        } else {
            ye4.a("FcmAvailabilityHelper", "Available");
        }
        a = z;
    }
}
