package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class b60 {
    public volatile aw a;
    public final RemoteControlApplication b;
    public volatile ar c;
    public volatile boolean d;
    public volatile boolean e;

    public /* synthetic */ b60(RemoteControlApplication remoteControlApplication) {
        this.b = remoteControlApplication;
    }

    public final boolean a() {
        try {
            RemoteControlApplication remoteControlApplication = this.b;
            return remoteControlApplication.getPackageManager().getApplicationInfo(remoteControlApplication.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            tr8.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
