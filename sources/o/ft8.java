package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ft8 extends c60 {
    public final RemoteControlApplication F;
    public volatile byte G;
    public volatile gr8 H;
    public volatile xs8 I;
    public volatile ScheduledExecutorService J;

    public ft8(RemoteControlApplication remoteControlApplication, b60 b60Var) {
        super(remoteControlApplication, b60Var);
        this.G = (byte) 0;
        this.F = remoteControlApplication;
    }

    public final synchronized boolean G() {
        return (this.G != 2 || this.H == null || this.I == null) ? false : true;
    }

    public final lt8 H(int i) {
        if (!G()) {
            tr8.h("BillingClientTesting", "Billing Override Service is not ready.");
            I(94, 28, jt8.a(-1, "Billing Override Service connection is disconnected."));
            return new kt8(0);
        }
        ls8 ls8Var = new ls8(this, i);
        sx8 sx8Var = new sx8();
        sx8Var.c = new fy8();
        by8 by8Var = new by8(sx8Var);
        sx8Var.b = by8Var;
        sx8Var.a = ls8.class;
        try {
            ls8Var.a(sx8Var);
            sx8Var.a = "billingOverrideService.getBillingOverride";
            return by8Var;
        } catch (Exception e) {
            by8Var.b(e);
            return by8Var;
        }
    }

    public final void I(int i, int i2, g60 g60Var) {
        int i3 = gt8.a;
        gw8 gw8VarB = gt8.b(i, i2, g60Var, null, mw8.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(gw8VarB, "ApiFailure should not be null");
        this.h.J(gw8VarB);
    }

    public final void J(int i) {
        int i2 = gt8.a;
        iw8 iw8VarC = gt8.c(i, mw8.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(iw8VarC, "ApiSuccess should not be null");
        lh7 lh7Var = this.h;
        lh7Var.getClass();
        try {
            lh7Var.T(iw8VarC, (sw8) lh7Var.n);
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // o.c60
    public final void a() {
        synchronized (this) {
            J(27);
            try {
                try {
                    if (this.I != null && this.H != null) {
                        tr8.g("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.F.unbindService(this.I);
                        this.I = new xs8(this, (byte) 0);
                    }
                    this.H = null;
                    if (this.J != null) {
                        this.J.shutdownNow();
                        this.J = null;
                    }
                } catch (RuntimeException e) {
                    tr8.i("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.G = (byte) 3;
            } catch (Throwable th) {
                this.G = (byte) 3;
                throw th;
            }
        }
        super.a();
    }

    @Override // o.c60
    public final g60 b(Activity activity, f60 f60Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) H(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            I(102, 28, jt8.q);
            tr8.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            I(95, 28, jt8.q);
            tr8.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            g60 g60VarA = jt8.a(iIntValue, "Billing override value was set by a license tester.");
            I(93, 2, g60VarA);
            E(g60VarA);
            return g60VarA;
        }
        try {
            return super.b(activity, f60Var);
        } catch (Exception e3) {
            g60 g60Var = jt8.f;
            I(103, 2, g60Var);
            tr8.i("BillingClientTesting", "An internal error occurred.", e3);
            return g60Var;
        }
    }

    @Override // o.c60
    public final void c(wy5 wy5Var, ag3 ag3Var) {
        ScheduledExecutorService scheduledExecutorService;
        byte b = 2;
        as2 as2Var = new as2(ag3Var, b);
        e53 e53Var = new e53(this, wy5Var, ag3Var, b);
        lt8 lt8VarH = H(7);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.J == null) {
                    this.J = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.J;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!lt8VarH.isDone()) {
            ot8 ot8Var = new ot8();
            ot8Var.t = lt8VarH;
            mt8 mt8Var = new mt8();
            mt8Var.n = ot8Var;
            ot8Var.u = scheduledExecutorService.schedule(mt8Var, 28500L, timeUnit);
            lt8VarH.a(mt8Var, et8.m);
            lt8VarH = ot8Var;
        }
        y58 y58Var = new y58(this, as2Var, e53Var);
        lt8VarH.a(new it8((Object) lt8VarH, (Object) y58Var, (byte) 0), f());
    }

    @Override // o.c60
    public final void e(xk1 xk1Var) {
        synchronized (this) {
            byte b = 0;
            if (G()) {
                tr8.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                J(26);
            } else {
                int i = 1;
                if (this.G == 1) {
                    tr8.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.G == 3) {
                    tr8.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    I(38, 26, jt8.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.G = (byte) 1;
                    tr8.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.I = new xs8(this, b);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    RemoteControlApplication remoteControlApplication = this.F;
                    List<ResolveInfo> listQueryIntentServices = remoteControlApplication.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                tr8.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (remoteControlApplication.bindService(intent2, this.I, 1)) {
                                    tr8.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    tr8.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i = 39;
                        }
                    }
                    this.G = (byte) 0;
                    tr8.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    I(i, 26, jt8.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        z(xk1Var, 0);
    }

    public ft8(aw awVar, RemoteControlApplication remoteControlApplication, b60 b60Var) {
        super(awVar, remoteControlApplication, b60Var);
        this.G = (byte) 0;
        this.F = remoteControlApplication;
    }

    public ft8(aw awVar, RemoteControlApplication remoteControlApplication, ar arVar, b60 b60Var) {
        super(awVar, remoteControlApplication, arVar, b60Var);
        this.G = (byte) 0;
        this.F = remoteControlApplication;
    }
}
