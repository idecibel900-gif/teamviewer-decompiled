package o;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.teamviewer.remotecontrolviewlib.activity.TrustedDeviceRequestActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadNative;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewer.market.mobile.application.TrustedDeviceService;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s38 extends TrustedDeviceRequestPayloadSignalCallbackImpl {
    public final /* synthetic */ io.sentry.instrumentation.file.g a;

    public s38(io.sentry.instrumentation.file.g gVar) {
        this.a = gVar;
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadSignalCallback
    public final void OnCallback(TrustedDeviceRequestPayloadNative trustedDeviceRequestPayloadNative) {
        String string;
        String string2;
        Bitmap bitmapCreateBitmap;
        trustedDeviceRequestPayloadNative.getClass();
        long jTrustedDeviceRequestPayloadNative_dyngateId_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_dyngateId_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        String string3 = (jTrustedDeviceRequestPayloadNative_dyngateId_get == 0 ? null : new DyngateID(jTrustedDeviceRequestPayloadNative_dyngateId_get, false)).toString();
        string3.getClass();
        boolean zTrustedDeviceRequestPayloadNative_isBrowser_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_isBrowser_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        String strTrustedDeviceRequestPayloadNative_ipAddress_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_ipAddress_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        strTrustedDeviceRequestPayloadNative_ipAddress_get.getClass();
        String strTrustedDeviceRequestPayloadNative_city_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_city_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        strTrustedDeviceRequestPayloadNative_city_get.getClass();
        String strTrustedDeviceRequestPayloadNative_country_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_country_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        strTrustedDeviceRequestPayloadNative_country_get.getClass();
        String strTrustedDeviceRequestPayloadNative_timeStamp_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_timeStamp_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        strTrustedDeviceRequestPayloadNative_timeStamp_get.getClass();
        String strTrustedDeviceRequestPayloadNative_token_get = TrustedDeviceRequestPayloadSWIGJNI.TrustedDeviceRequestPayloadNative_token_get(trustedDeviceRequestPayloadNative.a, trustedDeviceRequestPayloadNative);
        strTrustedDeviceRequestPayloadNative_token_get.getClass();
        io.sentry.instrumentation.file.g gVar = this.a;
        n38 n38Var = (n38) gVar.n;
        int i = gVar.m;
        RemoteControlApplication remoteControlApplication = n38Var.b;
        if (zTrustedDeviceRequestPayloadNative_isBrowser_get) {
            string = remoteControlApplication.getString(R.string.tv_trusted_device_request_teamviewer_id_text, remoteControlApplication.getString(R.string.tv_trusted_device_request_management_console));
            string.getClass();
        } else {
            string = remoteControlApplication.getString(R.string.tv_trusted_device_request_teamviewer_id_text, qs1.M(string3));
            string.getClass();
        }
        if (strTrustedDeviceRequestPayloadNative_city_get.length() == 0 && strTrustedDeviceRequestPayloadNative_country_get.length() == 0) {
            string2 = remoteControlApplication.getString(R.string.tv_trusted_device_request_location_not_available_text);
            string2.getClass();
        } else if (strTrustedDeviceRequestPayloadNative_country_get.length() != 0 && strTrustedDeviceRequestPayloadNative_city_get.length() == 0) {
            string2 = remoteControlApplication.getString(R.string.tv_trusted_device_request_location_text, strTrustedDeviceRequestPayloadNative_country_get);
            string2.getClass();
        } else if (strTrustedDeviceRequestPayloadNative_city_get.length() != 0 && strTrustedDeviceRequestPayloadNative_country_get.length() == 0) {
            string2 = remoteControlApplication.getString(R.string.tv_trusted_device_request_location_text, strTrustedDeviceRequestPayloadNative_city_get);
            string2.getClass();
        } else {
            string2 = remoteControlApplication.getString(R.string.tv_trusted_device_request_location_text, fx3.g(strTrustedDeviceRequestPayloadNative_city_get, ", ", strTrustedDeviceRequestPayloadNative_country_get));
            string2.getClass();
        }
        Intent intent = new Intent(remoteControlApplication, (Class<?>) TrustedDeviceRequestActivity.class);
        intent.setAction(String.valueOf(i));
        intent.setFlags(268468224);
        intent.putExtra("ARG_DYNGATE_ID_KEY", string);
        intent.putExtra("ARG_LOCATION_KEY", string2);
        intent.putExtra("ARG_IP_ADDRESS_KEY", strTrustedDeviceRequestPayloadNative_ipAddress_get);
        intent.putExtra("ARG_TIMESTAMP_KEY", strTrustedDeviceRequestPayloadNative_timeStamp_get);
        intent.putExtra("ARG_TOKEN_KEY", strTrustedDeviceRequestPayloadNative_token_get);
        intent.putExtra("ARG_NOTIFICATION_ID_KEY", i);
        intent.putExtra("ARG_DECLINED_FROM_NOTIFICATION", false);
        PendingIntent activity = PendingIntent.getActivity(remoteControlApplication, 36, intent, 67108864);
        Intent intent2 = new Intent(remoteControlApplication, (Class<?>) TrustedDeviceService.class);
        intent2.setAction(String.valueOf(i));
        intent2.setFlags(268468224);
        intent2.putExtra("KEY_TOKEN", strTrustedDeviceRequestPayloadNative_token_get);
        intent2.putExtra("SESSION_ID", i);
        intent2.putExtra("KEY_RESULT", 0);
        PendingIntent service = PendingIntent.getService(remoteControlApplication, 34, intent2, 67108864);
        Intent intent3 = new Intent(remoteControlApplication, (Class<?>) TrustedDeviceRequestActivity.class);
        intent3.setAction(String.valueOf(i));
        intent3.addFlags(268468224);
        intent3.putExtra("ARG_DYNGATE_ID_KEY", string);
        intent3.putExtra("ARG_LOCATION_KEY", string2);
        intent3.putExtra("ARG_IP_ADDRESS_KEY", strTrustedDeviceRequestPayloadNative_ipAddress_get);
        intent3.putExtra("ARG_TIMESTAMP_KEY", strTrustedDeviceRequestPayloadNative_timeStamp_get);
        intent3.putExtra("ARG_TOKEN_KEY", strTrustedDeviceRequestPayloadNative_token_get);
        intent3.putExtra("ARG_NOTIFICATION_ID_KEY", i);
        intent3.putExtra("ARG_DECLINED_FROM_NOTIFICATION", true);
        PendingIntent activity2 = PendingIntent.getActivity(remoteControlApplication, 35, intent3, 67108864);
        RemoteViews remoteViews = new RemoteViews(remoteControlApplication.getPackageName(), R.layout.notification_trusted_device);
        remoteViews.setTextViewText(R.id.trusted_device_request_teamviewer_id_text, string);
        remoteViews.setTextViewText(R.id.trusted_device_location_textview, string2);
        activity.getClass();
        service.getClass();
        activity2.getClass();
        o55 o55Var = new o55(remoteControlApplication, "TV_TRUSTED_DEVICE_NOTIFICATION_CHANNEL");
        Drawable drawable = remoteControlApplication.getDrawable(R.drawable.tv_safe_lock_icon);
        if (drawable == null) {
            bitmapCreateBitmap = null;
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        o55Var.e(bitmapCreateBitmap);
        Notification notification = o55Var.v;
        notification.icon = R.drawable.ic_notification_rc;
        o55Var.h(remoteControlApplication.getString(R.string.tv_trusted_device_notification_title_text));
        notification.when = System.currentTimeMillis();
        o55Var.j = 1;
        o55Var.g(new q55());
        o55Var.q = remoteViews;
        o55Var.m = false;
        o55Var.d(2, false);
        o55Var.d(16, false);
        o55Var.t = 86400000L;
        o55Var.g = activity;
        o55Var.f(RingtoneManager.getDefaultUri(2));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            o55Var.p = 1;
        }
        String string4 = remoteControlApplication.getString(R.string.tv_trusted_device_request_decline_text);
        Bundle bundle = new Bundle();
        CharSequence charSequenceC = o55.c(string4);
        boolean z = i2 >= 31;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
        }
        o55Var.a(new k55(null, charSequenceC, activity2, bundle, arrayList2.isEmpty() ? null : (ga6[]) arrayList2.toArray(new ga6[arrayList2.size()]), true, true, z));
        String string5 = remoteControlApplication.getString(R.string.tv_trusted_device_request_trust_text);
        Bundle bundle2 = new Bundle();
        CharSequence charSequenceC2 = o55.c(string5);
        boolean z2 = i2 >= 31;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList3.isEmpty()) {
        }
        o55Var.a(new k55(null, charSequenceC2, service, bundle2, arrayList4.isEmpty() ? null : (ga6[]) arrayList4.toArray(new ga6[arrayList4.size()]), true, true, z2));
        o55Var.f1632o = remoteControlApplication.getColor(R.color.accent);
        Notification notificationB = o55Var.b();
        notificationB.getClass();
        NotificationManager notificationManager = (NotificationManager) remoteControlApplication.getSystemService("notification");
        if (notificationManager == null) {
            ye4.c("TVNotificationManager", "showNotification: NotificationManager is NULL");
            return;
        }
        if (new j93(remoteControlApplication).W()) {
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(remoteControlApplication, notificationB);
            builderRecoverBuilder.setCategory("recommendation");
            builderRecoverBuilder.setLargeIcon(BitmapFactory.decodeResource(remoteControlApplication.getResources(), R.drawable.tv_icon_recommendation));
            builderRecoverBuilder.setColor(remoteControlApplication.getColor(R.color.tv_colorRecommendation));
        }
        notificationManager.notify("TeamViewerRcTrustedDeviceNotification", i, notificationB);
    }
}
