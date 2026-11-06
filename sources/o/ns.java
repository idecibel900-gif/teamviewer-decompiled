package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.SessionTimeoutService;

/* JADX INFO: loaded from: classes.dex */
public final class ns extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ns(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        wk2 wk2Var;
        switch (this.a) {
            case 0:
                ((io.sentry.l6) this.b).s();
                break;
            case 1:
                context.getClass();
                intent.getClass();
                ((r93) this.b).e(intent);
                break;
            case 2:
                context.getClass();
                intent.getClass();
                l50 l50Var = (l50) this.b;
                switch (l50Var.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            we4.f().c(m50.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        l50Var.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        l50Var.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        l50Var.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        l50Var.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            we4.f().c(n50.a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        l50Var.b(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    l50Var.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            we4.f().c(pa7.a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        l50Var.b(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    l50Var.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 3:
                nk2 nk2Var = (nk2) this.b;
                context.getClass();
                intent.getClass();
                String action4 = intent.getAction();
                if (bc7.H(true, action4, "android.intent.action.MEDIA_REMOVED") || bc7.H(true, action4, "android.intent.action.MEDIA_UNMOUNTED") || bc7.H(true, action4, "android.intent.action.MEDIA_BAD_REMOVAL") || bc7.H(true, action4, "android.intent.action.MEDIA_EJECT")) {
                    wk2 wk2Var2 = nk2Var.F0;
                    if (wk2Var2 != null && wk2Var2.b1()) {
                        wk2 wk2Var3 = nk2Var.F0;
                        if (wk2Var3 != null) {
                            wk2Var3.j1(false);
                        }
                        wk2 wk2Var4 = nk2Var.F0;
                        if (wk2Var4 != null) {
                            wk2Var4.t = "";
                        }
                        if (wk2Var4 != null) {
                            wk2Var4.m1();
                        }
                        nk2Var.L0();
                        Context context2 = d82.M;
                        if (context2 != null) {
                            d82.t(context2, R.string.tv_filetransfer_error_sdcard_lost);
                        } else {
                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                        }
                        zg2 zg2Var = zg2.H0;
                        if (zg2Var == null) {
                            zg2Var = new zg2();
                            zg2.H0 = zg2Var;
                        }
                        zg2Var.A0();
                        break;
                    }
                } else if (bc7.H(true, action4, "android.intent.action.MEDIA_MOUNTED") && (wk2Var = nk2Var.F0) != null) {
                    wk2Var.j1(true);
                    break;
                }
                break;
            case 4:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((lg3) this.b).d.post(new qe((byte) 3, this, intent.getIntExtra("plugged", -1) <= 0));
                }
                break;
            case 5:
                context.getClass();
                intent.getClass();
                SessionTimeoutService sessionTimeoutService = (SessionTimeoutService) this.b;
                sessionTimeoutService.r.postDelayed(sessionTimeoutService.s, 60000L);
                break;
            default:
                context.getClass();
                intent.getClass();
                ((wv6) this.b).a();
                break;
        }
    }
}
