package o;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class ms extends io.sentry.l6 {
    public final /* synthetic */ byte c = 0;
    public final /* synthetic */ qs d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(qs qsVar, Context context) {
        super(qsVar);
        this.d = qsVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // io.sentry.l6
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // io.sentry.l6
    public final int h() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                ep3 ep3Var = (ep3) obj;
                LocationManager locationManager = (LocationManager) ep3Var.f733o;
                ik ikVar = (ik) ep3Var.p;
                if (ikVar.b <= System.currentTimeMillis()) {
                    Context context = (Context) ep3Var.n;
                    Location lastKnownLocation2 = null;
                    if (xs1.y(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (xs1.y(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        a48 a48Var = a48.d;
                        if (a48Var == null) {
                            a48Var = new a48();
                            a48.d = a48Var;
                        }
                        a48 a48Var2 = a48Var;
                        a48Var2.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        a48Var2.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = a48Var2.c;
                        long j2 = a48Var2.b;
                        long j3 = a48Var2.a;
                        a48Var2.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = a48Var2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        ikVar.a = z;
                        ikVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = ikVar.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // io.sentry.l6
    public final void s() {
        byte b = this.c;
        qs qsVar = this.d;
        switch (b) {
            case 0:
                qsVar.n(true, true);
                break;
            default:
                qsVar.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(qs qsVar, ep3 ep3Var) {
        super(qsVar);
        this.d = qsVar;
        this.e = ep3Var;
    }
}
