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
import com.teamviewer.remotecontrolviewlib.activity.DeviceAuthenticationConnectionRequestActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthDataSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthenticationCallbackImpl;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthenticationData;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.DeviceAuthenticationService;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 extends DeviceAuthenticationCallbackImpl {
    public final /* synthetic */ tr1 a;

    public sr1(tr1 tr1Var) {
        this.a = tr1Var;
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthenticationCallback
    public final void OnCallback(DeviceAuthenticationData deviceAuthenticationData) {
        Bitmap bitmapCreateBitmap;
        deviceAuthenticationData.getClass();
        tr1 tr1Var = this.a;
        RemoteControlApplication remoteControlApplication = tr1Var.b;
        Intent intent = new Intent(remoteControlApplication, (Class<?>) DeviceAuthenticationConnectionRequestActivity.class);
        intent.setAction(String.valueOf(DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData)));
        intent.setFlags(268468224);
        intent.putExtra("ARG_SOURCE_DYNGATE_ID", deviceAuthenticationData.b().ToLong());
        intent.putExtra("ARG_DESTINATION_DYNGATE_ID", deviceAuthenticationData.a().ToLong());
        intent.putExtra("ARG_SESSION_IDENTIFIER", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent.putExtra("ARG_DEVICE_NAME", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_destinationDeviceName_get(deviceAuthenticationData.a, deviceAuthenticationData));
        String str = tr1Var.d;
        if (str == null) {
            im3.e0("registrationUuid");
            throw null;
        }
        intent.putExtra("ARG_REGISTRATION_UUID", str);
        intent.putExtra("ARG_NONCE", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_nonce_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent.putExtra("ARG_TIME_RECEIVED", System.currentTimeMillis());
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? 201326592 : 134217728;
        PendingIntent activity = PendingIntent.getActivity(remoteControlApplication, 29, intent, i2);
        Intent intent2 = new Intent(remoteControlApplication, (Class<?>) DeviceAuthenticationService.class);
        intent2.setAction(String.valueOf(DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData)));
        intent2.addFlags(268468224);
        intent2.putExtra("KEY_VERSION", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_version_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent2.putExtra("KEY_SOURCE_DYNGATE_ID", deviceAuthenticationData.b().ToLong());
        intent2.putExtra("KEY_DESTINATION_DYNGATE_ID", deviceAuthenticationData.a().ToLong());
        intent2.putExtra("KEY_SESSION_IDENTIFIER", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent2.putExtra("KEY_NONCE", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_nonce_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent2.putExtra("KEY_ACTION", "KEY_ACTION_ALLOW");
        String str2 = tr1Var.d;
        if (str2 == null) {
            im3.e0("registrationUuid");
            throw null;
        }
        intent2.putExtra("KEY_REGISTRATION_ID", str2);
        PendingIntent service = PendingIntent.getService(remoteControlApplication, 24, intent2, i2);
        Intent intent3 = new Intent(remoteControlApplication, (Class<?>) DeviceAuthenticationService.class);
        intent3.setAction(String.valueOf(DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData)));
        intent3.addFlags(268468224);
        intent3.putExtra("KEY_VERSION", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_version_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent3.putExtra("KEY_SOURCE_DYNGATE_ID", deviceAuthenticationData.b().ToLong());
        intent3.putExtra("KEY_DESTINATION_DYNGATE_ID", deviceAuthenticationData.a().ToLong());
        intent3.putExtra("KEY_SESSION_IDENTIFIER", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent3.putExtra("KEY_NONCE", DeviceAuthDataSWIGJNI.DeviceAuthenticationData_nonce_get(deviceAuthenticationData.a, deviceAuthenticationData));
        intent3.putExtra("KEY_ACTION", "KEY_ACTION_DENY");
        String str3 = tr1Var.d;
        if (str3 == null) {
            im3.e0("registrationUuid");
            throw null;
        }
        intent3.putExtra("KEY_REGISTRATION_ID", str3);
        PendingIntent service2 = PendingIntent.getService(remoteControlApplication, 25, intent3, i2);
        RemoteViews remoteViews = new RemoteViews(remoteControlApplication.getPackageName(), R.layout.notification_device_authentication_small);
        String strDeviceAuthenticationData_destinationDeviceName_get = DeviceAuthDataSWIGJNI.DeviceAuthenticationData_destinationDeviceName_get(deviceAuthenticationData.a, deviceAuthenticationData);
        strDeviceAuthenticationData_destinationDeviceName_get.getClass();
        DyngateID dyngateIDA = deviceAuthenticationData.a();
        dyngateIDA.getClass();
        remoteViews.setTextViewText(R.id.tv_mfa_to_data, tr1.b(strDeviceAuthenticationData_destinationDeviceName_get, dyngateIDA));
        RemoteViews remoteViews2 = new RemoteViews(remoteControlApplication.getPackageName(), R.layout.notification_device_authentication_large);
        String strDeviceAuthenticationData_sourceDeviceName_get = DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sourceDeviceName_get(deviceAuthenticationData.a, deviceAuthenticationData);
        strDeviceAuthenticationData_sourceDeviceName_get.getClass();
        DyngateID dyngateIDB = deviceAuthenticationData.b();
        dyngateIDB.getClass();
        remoteViews2.setTextViewText(R.id.tv_mfa_from_data, tr1.b(strDeviceAuthenticationData_sourceDeviceName_get, dyngateIDB));
        String strDeviceAuthenticationData_destinationDeviceName_get2 = DeviceAuthDataSWIGJNI.DeviceAuthenticationData_destinationDeviceName_get(deviceAuthenticationData.a, deviceAuthenticationData);
        strDeviceAuthenticationData_destinationDeviceName_get2.getClass();
        DyngateID dyngateIDA2 = deviceAuthenticationData.a();
        dyngateIDA2.getClass();
        remoteViews2.setTextViewText(R.id.tv_mfa_to_data, tr1.b(strDeviceAuthenticationData_destinationDeviceName_get2, dyngateIDA2));
        String string = remoteControlApplication.getString(R.string.tv_device_authentication_notification_content_title);
        string.getClass();
        activity.getClass();
        service.getClass();
        service2.getClass();
        o55 o55Var = new o55(remoteControlApplication, "TV_DEVICE_AUTHENTICATION_NOTIFICATION_CHANNEL");
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
        o55Var.h(string);
        notification.when = System.currentTimeMillis();
        o55Var.j = 2;
        o55Var.g(new q55());
        o55Var.q = remoteViews;
        o55Var.r = remoteViews2;
        o55Var.m = false;
        o55Var.d(2, false);
        o55Var.d(16, true);
        o55Var.t = 300000L;
        o55Var.g = activity;
        o55Var.f(RingtoneManager.getDefaultUri(2));
        String string2 = remoteControlApplication.getString(R.string.tv_device_authentication_notification_button_deny);
        Bundle bundle = new Bundle();
        CharSequence charSequenceC = o55.c(string2);
        boolean z = i >= 31;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
        }
        o55Var.a(new k55(null, charSequenceC, service2, bundle, arrayList2.isEmpty() ? null : (ga6[]) arrayList2.toArray(new ga6[arrayList2.size()]), true, true, z));
        String string3 = remoteControlApplication.getString(R.string.tv_device_authentication_notification_button_allow);
        Bundle bundle2 = new Bundle();
        CharSequence charSequenceC2 = o55.c(string3);
        boolean z2 = i >= 31;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList3.isEmpty()) {
        }
        o55Var.a(new k55(null, charSequenceC2, service, bundle2, arrayList4.isEmpty() ? null : (ga6[]) arrayList4.toArray(new ga6[arrayList4.size()]), true, true, z2));
        o55Var.f1632o = remoteControlApplication.getColor(R.color.accent);
        Notification notificationB = o55Var.b();
        notificationB.getClass();
        int iDeviceAuthenticationData_sessionIdentifier_get = DeviceAuthDataSWIGJNI.DeviceAuthenticationData_sessionIdentifier_get(deviceAuthenticationData.a, deviceAuthenticationData);
        remoteControlApplication.getClass();
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
        notificationManager.notify("TvDeviceConnectionAuthenticationNotification", iDeviceAuthenticationData_sessionIdentifier_get, notificationB);
    }
}
