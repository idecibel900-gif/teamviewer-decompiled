package o;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 extends sz2 {
    public static final Object c = new Object();
    public static final rz2 d = new rz2();
    public yp8 b;

    public static AlertDialog d(Activity activity, int i, tp8 tp8Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(mp8.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(com.teamviewer.teamviewer.market.mobile.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(com.teamviewer.teamviewer.market.mobile.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.teamviewer.teamviewer.market.mobile.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, tp8Var);
        }
        String strA = mp8.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        io.sentry.android.core.v0.l("GoogleApiAvailability", fx3.e(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof xt2) {
                su2 su2VarD = ((xt2) activity).D();
                ue7 ue7Var = new ue7();
                nv1.t(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ue7Var.F0 = alertDialog;
                if (onCancelListener != null) {
                    ue7Var.G0 = onCancelListener;
                }
                ue7Var.E0(su2VarD, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        vc2 vc2Var = new vc2();
        nv1.t(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        vc2Var.m = alertDialog;
        if (onCancelListener != null) {
            vc2Var.n = onCancelListener;
        }
        vc2Var.show(fragmentManager, str);
    }

    @Override // o.sz2
    public final Intent a(int i, Context context, String str) {
        return super.a(i, context, str);
    }

    public final AlertDialog c(Activity activity, int i, int i2, GoogleApiActivity googleApiActivity) {
        return d(activity, i, new np8(super.a(i, activity, "d"), activity, i2), googleApiActivity);
    }

    public final void e(Activity activity, t84 t84Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i, new rp8(super.a(i, activity, "d"), t84Var), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        io.sentry.android.core.v0.l("GoogleApiAvailability", fx3.f(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new kp8(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                io.sentry.android.core.v0.j("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? mp8.e(context, "common_google_play_services_resolution_required_title") : mp8.a(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? mp8.d(context, "common_google_play_services_resolution_required_text", mp8.c(context)) : mp8.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        nv1.s(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        o55 o55Var = new o55(context, null);
        o55Var.m = true;
        o55Var.d(16, true);
        o55Var.e = o55.c(strE);
        n55 n55Var = new n55();
        n55Var.c = o55.c(strD);
        o55Var.g(n55Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = lv1.m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            lv1.m = boolValueOf;
        }
        boolean zBooleanValue = boolValueOf.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            o55Var.v.icon = i3;
            o55Var.j = 2;
            if (lv1.Q(context)) {
                o55Var.b.add(new k55(IconCompat.a(2131230873), resources.getString(com.teamviewer.teamviewer.market.mobile.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, true, true, false));
            } else {
                o55Var.g = pendingIntent;
            }
        } else {
            o55Var.v.icon = R.drawable.stat_sys_warning;
            o55Var.h(resources.getString(com.teamviewer.teamviewer.market.mobile.R.string.common_google_play_services_notification_ticker));
            o55Var.v.when = System.currentTimeMillis();
            o55Var.g = pendingIntent;
            o55Var.f = o55.c(strD);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.teamviewer.teamviewer.market.mobile.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        o55Var.s = "com.google.android.gms.availability";
        Notification notificationB = o55Var.b();
        if (i == 1 || i == 2 || i == 3) {
            wz2.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationB);
    }
}
