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
import android.os.Bundle;
import android.widget.RemoteViews;
import com.teamviewer.remotecontrolviewlib.activity.ConditionalAccessAuthenticationConnectionRequestActivity;
import com.teamviewer.remotecontrolviewlib.activity.ConditionalAccessAuthenticationResponseFeedbackActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthPayloadSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationPayloadNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationPayloadSignalCallbackImpl;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.text.ParseException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u11 extends ConditionalAccessAuthenticationPayloadSignalCallbackImpl {
    public final /* synthetic */ io.sentry.q7 a;

    public u11(io.sentry.q7 q7Var, v11 v11Var) {
        this.a = q7Var;
        swigReleaseOwnership();
    }

    @Override // com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationPayloadSignalCallback
    public final void OnCallback(ConditionalAccessAuthenticationPayloadNative conditionalAccessAuthenticationPayloadNative) {
        long jCurrentTimeMillis;
        Bitmap bitmapCreateBitmap;
        conditionalAccessAuthenticationPayloadNative.getClass();
        swigTakeOwnership();
        String strConditionalAccessAuthenticationPayloadNative_sourceCompanyName_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_sourceCompanyName_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_sourceCompanyName_get.getClass();
        String strConditionalAccessAuthenticationPayloadNative_targetCompanyName_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_targetCompanyName_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_targetCompanyName_get.getClass();
        String strConditionalAccessAuthenticationPayloadNative_sourceAccountName_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_sourceAccountName_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_sourceAccountName_get.getClass();
        String strConditionalAccessAuthenticationPayloadNative_targetAccountName_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_targetAccountName_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_targetAccountName_get.getClass();
        String strConditionalAccessAuthenticationPayloadNative_sourceDeviceName_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_sourceDeviceName_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_sourceDeviceName_get.getClass();
        String strConditionalAccessAuthenticationPayloadNative_targetDeviceName_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_targetDeviceName_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_targetDeviceName_get.getClass();
        int iConditionalAccessAuthenticationPayloadNative_timeoutInSeconds_get = (int) ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_timeoutInSeconds_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        String strConditionalAccessAuthenticationPayloadNative_timestamp_get = ConditionalAccessAuthPayloadSWIGJNI.ConditionalAccessAuthenticationPayloadNative_timestamp_get(conditionalAccessAuthenticationPayloadNative.a, conditionalAccessAuthenticationPayloadNative);
        strConditionalAccessAuthenticationPayloadNative_timestamp_get.getClass();
        try {
            jCurrentTimeMillis = v11.f2262o.parse(strConditionalAccessAuthenticationPayloadNative_timestamp_get).getTime();
        } catch (ParseException unused) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        io.sentry.q7 q7Var = this.a;
        t11 t11Var = (t11) q7Var.f253o;
        String str = (String) q7Var.n;
        String str2 = t11.f;
        RemoteControlApplication remoteControlApplication = t11Var.b;
        RemoteViews remoteViews = new RemoteViews(remoteControlApplication.getPackageName(), R.layout.notification_conditional_access_authentication_small);
        remoteViews.setTextViewText(R.id.from_data, t11.b(strConditionalAccessAuthenticationPayloadNative_sourceAccountName_get, strConditionalAccessAuthenticationPayloadNative_sourceDeviceName_get));
        remoteViews.setTextViewText(R.id.to_data, t11.b(strConditionalAccessAuthenticationPayloadNative_targetAccountName_get, strConditionalAccessAuthenticationPayloadNative_targetDeviceName_get));
        RemoteViews remoteViews2 = new RemoteViews(remoteControlApplication.getPackageName(), R.layout.notification_conditional_access_authentication_large);
        remoteViews2.setTextViewText(R.id.from_account_data, strConditionalAccessAuthenticationPayloadNative_sourceAccountName_get);
        remoteViews2.setTextViewText(R.id.from_device_data, strConditionalAccessAuthenticationPayloadNative_sourceDeviceName_get);
        remoteViews2.setTextViewText(R.id.from_company_data, strConditionalAccessAuthenticationPayloadNative_sourceCompanyName_get);
        remoteViews2.setTextViewText(R.id.to_account_data, strConditionalAccessAuthenticationPayloadNative_targetAccountName_get);
        remoteViews2.setTextViewText(R.id.to_device_data, strConditionalAccessAuthenticationPayloadNative_targetDeviceName_get);
        remoteViews2.setTextViewText(R.id.to_company_data, strConditionalAccessAuthenticationPayloadNative_targetCompanyName_get);
        Intent intent = new Intent(remoteControlApplication, (Class<?>) ConditionalAccessAuthenticationConnectionRequestActivity.class);
        intent.setAction(str);
        intent.putExtra("SESSION_ID", str);
        intent.putExtra("SOURCE_COMPANY_NAME", strConditionalAccessAuthenticationPayloadNative_sourceCompanyName_get);
        intent.putExtra("TARGET_COMPANY_NAME", strConditionalAccessAuthenticationPayloadNative_targetCompanyName_get);
        intent.putExtra("SOURCE_ACCOUNT_NAME", strConditionalAccessAuthenticationPayloadNative_sourceAccountName_get);
        intent.putExtra("TARGET_ACCOUNT_NAME", strConditionalAccessAuthenticationPayloadNative_targetAccountName_get);
        intent.putExtra("SOURCE_DEVICE_NAME", strConditionalAccessAuthenticationPayloadNative_sourceDeviceName_get);
        intent.putExtra("TARGET_DEVICE_NAME", strConditionalAccessAuthenticationPayloadNative_targetDeviceName_get);
        intent.putExtra("TIMESTAMP", jCurrentTimeMillis);
        PendingIntent activity = PendingIntent.getActivity(remoteControlApplication, 31, intent, 67108864);
        int i = ConditionalAccessAuthenticationResponseFeedbackActivity.H;
        long j = Long.parseLong(str);
        Intent intent2 = new Intent(remoteControlApplication, (Class<?>) ConditionalAccessAuthenticationResponseFeedbackActivity.class);
        intent2.putExtra("SESSION_ID", j);
        intent2.putExtra("RESPONSE", x11.m);
        intent2.setAction(str);
        intent2.addFlags(268468224);
        PendingIntent activity2 = PendingIntent.getActivity(remoteControlApplication, 32, intent2, 67108864);
        long j2 = Long.parseLong(str);
        Intent intent3 = new Intent(remoteControlApplication, (Class<?>) ConditionalAccessAuthenticationResponseFeedbackActivity.class);
        intent3.putExtra("SESSION_ID", j2);
        intent3.putExtra("RESPONSE", x11.n);
        intent3.setAction(str);
        intent3.addFlags(268468224);
        PendingIntent activity3 = PendingIntent.getActivity(remoteControlApplication, 33, intent3, 67108864);
        activity.getClass();
        activity2.getClass();
        activity3.getClass();
        long j3 = ((long) iConditionalAccessAuthenticationPayloadNative_timeoutInSeconds_get) * 1000;
        o55 o55Var = new o55(remoteControlApplication, "TV_CONDITIONAL_ACCESS_AUTHENTICATION_NOTIFICATION_CHANNEL");
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
        o55Var.h(remoteControlApplication.getString(R.string.conditional_access_authentication_notification_content_title));
        notification.when = jCurrentTimeMillis;
        o55Var.k = true;
        o55Var.j = 1;
        o55Var.g(new q55());
        o55Var.q = remoteViews;
        o55Var.r = remoteViews2;
        o55Var.m = false;
        o55Var.d(2, false);
        o55Var.d(16, true);
        o55Var.t = j3;
        o55Var.g = activity;
        o55Var.f(RingtoneManager.getDefaultUri(2));
        String string = remoteControlApplication.getString(R.string.tv_device_authentication_notification_button_deny);
        Bundle bundle = new Bundle();
        CharSequence charSequenceC = o55.c(string);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
        }
        o55Var.a(new k55(null, charSequenceC, activity3, bundle, arrayList2.isEmpty() ? null : (ga6[]) arrayList2.toArray(new ga6[arrayList2.size()]), true, true, true));
        String string2 = remoteControlApplication.getString(R.string.tv_device_authentication_notification_button_allow);
        Bundle bundle2 = new Bundle();
        CharSequence charSequenceC2 = o55.c(string2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList3.isEmpty()) {
        }
        o55Var.a(new k55(null, charSequenceC2, activity2, bundle2, arrayList4.isEmpty() ? null : (ga6[]) arrayList4.toArray(new ga6[arrayList4.size()]), true, true, true));
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
        notificationManager.notify(str, 18, notificationB);
    }
}
