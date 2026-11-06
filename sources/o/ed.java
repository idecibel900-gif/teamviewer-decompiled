package o;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ byte m;

    public /* synthetic */ ed(byte b) {
        this.m = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.m) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                zw4 zw4Var = AndroidComposeView.X0;
                synchronized (zw4Var) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        Object[] objArr = zw4Var.a;
                        int i4 = zw4Var.b;
                        if (i3 < 30) {
                            while (i < i4) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.U0;
                                androidComposeView.setShowLayoutBounds(hm3.o());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new ng(androidComposeView, (byte) 2));
                                }
                                i++;
                            }
                        } else {
                            while (i < i4) {
                                AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i];
                                androidComposeView2.post(new ng(androidComposeView2, (byte) 3));
                                i++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                zg2 zg2Var = zg2.H0;
                if (zg2Var == null) {
                    zg2Var = new zg2();
                    zg2.H0 = zg2Var;
                }
                zg2Var.A0();
                return;
            case 3:
                Context context = d82.M;
                if (context == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
                String string = context.getString(R.string.tv_filetransfer_error_create_dir_failed);
                string.getClass();
                fx3.r(string, 1, context, bu7.MAIN);
                return;
            case 4:
                Context context2 = d82.M;
                if (context2 == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
                String string2 = context2.getString(R.string.tv_filetransfer_error_writing);
                string2.getClass();
                fx3.r(string2, 1, context2, bu7.MAIN);
                return;
            case 5:
                Context context3 = d82.M;
                if (context3 == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
                String string3 = context3.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
                string3.getClass();
                fx3.r(string3, 1, context3, bu7.MAIN);
                return;
            default:
                el7 el7Var = y57.a;
                if (el7Var == null || !el7Var.G0) {
                    return;
                }
                try {
                    el7Var.A0();
                    break;
                } catch (IllegalArgumentException unused) {
                    ye4.c("TVProgressDialog", "onClick(): Dialog can't be dismissed. It's not attached to the window anymore");
                }
                el7Var.G0 = false;
                y57.b = null;
                return;
        }
    }

    public /* synthetic */ ed(ik2 ik2Var, byte b) {
        this.m = b;
    }
}
