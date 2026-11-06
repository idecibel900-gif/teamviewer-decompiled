package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Build;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewer.market.mobile.application.SessionTimeoutService;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import io.sentry.a3;
import io.sentry.f6;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import o.a65;
import o.bo7;
import o.bt1;
import o.d58;
import o.ef1;
import o.ep3;
import o.fi7;
import o.fp4;
import o.g95;
import o.go1;
import o.gt7;
import o.ho7;
import o.j41;
import o.jo6;
import o.k48;
import o.kn5;
import o.mg4;
import o.mo7;
import o.mu;
import o.n43;
import o.of6;
import o.p53;
import o.pn5;
import o.pr7;
import o.pz2;
import o.pz3;
import o.rr0;
import o.t68;
import o.vn7;
import o.vs1;
import o.vu6;
import o.wx8;
import o.xd3;
import o.xi0;
import o.xt6;
import o.ye4;
import o.ys0;
import o.z06;
import o.zr7;
import o.zt6;

/* JADX INFO: loaded from: classes.dex */
public final class n1 implements pz3, vn7, t68, vu6, ho7 {
    public static n1 q;
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f118o;
    public Object p;

    public n1(RemoteControlApplication remoteControlApplication, pn5 pn5Var, ep3 ep3Var, ep3 ep3Var2, xt6 xt6Var) {
        this.m = (byte) 6;
        this.f118o = remoteControlApplication;
        this.p = xt6Var;
        j41 j41Var = new j41(this, (byte) 2);
        pn5Var.q(this);
        ep3Var.f733o = this;
        if (!((EventHub) ep3Var.n).c(EventType.EVENT_SESSION_SHUTDOWN, (mu) ep3Var.p)) {
            ye4.c("SessionShutdownWatcher", "Could not register session shutdown listener!");
        }
        ep3Var2.f733o = this;
        if (!((EventHub) ep3Var2.n).c(EventType.EVENT_APP_TASK_REMOVED, (mu) ep3Var2.p)) {
            ye4.c("TaskRemovedWatcher", "Could not register task removed listener!");
        }
        ((zt6) xt6Var).m.add(j41Var);
    }

    public static void n(BufferedInputStream bufferedInputStream, long j) throws IOException {
        while (j > 0) {
            long jSkip = bufferedInputStream.skip(j);
            if (jSkip != 0) {
                j -= jSkip;
            } else {
                if (bufferedInputStream.read() == -1) {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
                j--;
            }
        }
    }

    public boolean a(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((a65) this.p).n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (vs1.o(((kn5) obj).a, j)) {
                break;
            }
            i++;
        }
        kn5 kn5Var = (kn5) obj;
        if (kn5Var != null) {
            return kn5Var.h;
        }
        return false;
    }

    @Override // o.t68
    public void b() {
        if (this.n) {
            ye4.a("SessionTimeoutController", "UI started while session is running");
            o(false);
        }
    }

    public void c(boolean z) {
        if (z != this.n) {
            if (z) {
                fp4 fp4Var = new fp4(this);
                this.f118o = fp4Var;
                p53.a.schedule(fp4Var, 2000L, 2000L);
            } else {
                fp4 fp4Var2 = (fp4) this.f118o;
                if (fp4Var2 != null) {
                    fp4Var2.cancel();
                }
                this.f118o = null;
            }
            this.n = !this.n;
        }
    }

    @Override // o.ho7
    public void d() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:5:0x0011, B:6:0x001d, B:8:0x0025, B:21:0x0058, B:13:0x0038, B:15:0x0040, B:18:0x0047, B:20:0x004f, B:24:0x005f, B:27:0x0069), top: B:50:0x0011, outer: #4 }] */
    public m1 e(BufferedInputStream bufferedInputStream, int i, File file) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f118o;
        m1 m1Var = null;
        try {
            l1 l1Var = new l1(bufferedInputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(l1Var, StandardCharsets.UTF_8);
                try {
                    io.sentry.r2 r2Var = new io.sentry.r2(inputStreamReader);
                    io.sentry.vendor.gson.stream.a aVar = r2Var.m;
                    r2Var.u0();
                    String strH = null;
                    Date dateD0 = null;
                    while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strU = aVar.U();
                        int iHashCode = strU.hashCode();
                        if (iHashCode != 55126294) {
                            if (iHashCode == 1874684019 && strU.equals("platform")) {
                                strH = r2Var.H();
                            } else {
                                r2Var.v();
                            }
                        } else if (strU.equals("timestamp")) {
                            dateD0 = r2Var.d0(sentryAndroidOptions.getLogger());
                        } else {
                            r2Var.v();
                        }
                        if (strH != null && dateD0 != null) {
                            break;
                        }
                    }
                    if ("native".equals(strH) && dateD0 != null) {
                        m1Var = new m1(file, dateD0.getTime());
                    }
                    inputStreamReader.close();
                    l1Var.close();
                    return m1Var;
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    l1Var.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().b(f6.DEBUG, th5, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    @Override // o.vu6
    public void f() {
        if (this.n) {
            ye4.a("SessionTimeoutController", "Session was shut down");
            RemoteControlApplication remoteControlApplication = (RemoteControlApplication) this.f118o;
            remoteControlApplication.stopService(new Intent(remoteControlApplication, (Class<?>) SessionTimeoutService.class));
            this.n = false;
        }
    }

    @Override // o.t68
    public void g() {
        mo7 mo7Var;
        zt6 zt6Var = (zt6) ((xt6) this.p);
        if ((!zt6Var.a.get() && zt6Var.f == null) || (mo7Var = zt6Var.f) == null || mo7Var.d()) {
            return;
        }
        ye4.a("SessionTimeoutController", "UI stopped while session is running");
        try {
            o(true);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 31 || !(pz2.p(th) || pz2.s(th))) {
                throw th;
            }
            ye4.a("SessionTimeoutController", "Error starting foreground service on UI stopped: " + th);
        }
    }

    public ef1 h() {
        rr0 rr0Var = (rr0) this.p;
        int i = rr0Var.b;
        int i2 = rr0Var.c;
        if (i < i2) {
            return ef1.n;
        }
        return i > i2 ? ef1.m : ef1.f707o;
    }

    public Properties i() {
        a3 a3Var = (a3) this.p;
        String str = (String) this.f118o;
        try {
            File file = new File(str.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        a3Var.g(f6.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
                    }
                } else if (this.n) {
                    a3Var.g(f6.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            a3Var.b(f6.ERROR, th3, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    @Override // o.pz3
    public boolean j(k48 k48Var, k48 k48Var2) {
        boolean z = this.n;
        xi0 xi0Var = (xi0) this.f118o;
        xi0 xi0Var2 = (xi0) this.p;
        if (k48Var.equals(k48Var2)) {
            return true;
        }
        ys0 ys0VarA = k48Var.a();
        ys0 ys0VarA2 = k48Var2.a();
        byte b = 0;
        if ((ys0VarA instanceof d58) && (ys0VarA2 instanceof d58)) {
            return z06.s.n((d58) ys0VarA, (d58) ys0VarA2, z, new go1(xi0Var, xi0Var2, b));
        }
        return false;
    }

    public void k() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) this.p;
        activityManager.getMemoryInfo(memoryInfo);
        ye4 ye4Var = ye4.a;
        ye4Var.f("Memory Info ", "-Device------------------");
        ye4Var.f("Memory Info ", "-Available memory:" + (memoryInfo.availMem / 1024));
        ye4Var.f("Memory Info ", "-Threshold memory:" + (memoryInfo.threshold / 1024));
        ye4Var.f("Memory Info ", "-App memory limit:" + (activityManager.getMemoryClass() * 1024));
        Runtime runtime = Runtime.getRuntime();
        if (runtime != null) {
            ye4Var.f("Memory Info ", "-VM memory limit:" + (runtime.maxMemory() / 1024));
        }
        ye4Var.f("Memory Info ", "-Low memory:" + memoryInfo.lowMemory);
    }

    public void l() {
        if (this.n) {
            ((pr7) this.p).n((gt7) this.f118o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0011, B:5:0x001d, B:7:0x0025, B:20:0x0054, B:12:0x0038, B:14:0x0040, B:17:0x0047, B:19:0x004f, B:24:0x005d), top: B:40:0x0011, outer: #2 }] */
    public io.sentry.s2 m(String str) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                io.sentry.r2 r2Var = new io.sentry.r2(inputStreamReader);
                io.sentry.vendor.gson.stream.a aVar = r2Var.m;
                r2Var.u0();
                int iNextInt = -1;
                String strH = null;
                while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strU = aVar.U();
                    int iHashCode = strU.hashCode();
                    if (iHashCode != -1106363674) {
                        if (iHashCode == 3575610 && strU.equals("type")) {
                            strH = r2Var.H();
                        } else {
                            r2Var.v();
                        }
                    } else if (strU.equals("length")) {
                        iNextInt = r2Var.nextInt();
                    } else {
                        r2Var.v();
                    }
                    if (strH != null && iNextInt >= 0) {
                        break;
                    }
                }
                if (iNextInt < 0) {
                    inputStreamReader.close();
                    return null;
                }
                io.sentry.s2 s2Var = new io.sentry.s2(strH, iNextInt);
                inputStreamReader.close();
                return s2Var;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((SentryAndroidOptions) this.f118o).getLogger().b(f6.DEBUG, th3, "Error parsing item header", new Object[0]);
            return null;
        }
        ((SentryAndroidOptions) this.f118o).getLogger().b(f6.DEBUG, th3, "Error parsing item header", new Object[0]);
        return null;
    }

    public void o(boolean z) {
        this.n = true;
        RemoteControlApplication remoteControlApplication = (RemoteControlApplication) this.f118o;
        Intent intent = new Intent(remoteControlApplication, (Class<?>) SessionTimeoutService.class);
        intent.putExtra("START_TIMEOUT_COUNTDOWN_KEY", z);
        remoteControlApplication.startService(intent);
    }

    @Override // o.vn7
    public void onError(xd3 xd3Var) {
    }

    @Override // o.vn7
    public void onStart(xd3 xd3Var) {
        of6 of6Var;
        if (this.n || (of6Var = (of6) this.f118o) == null) {
            return;
        }
        ((RoundAccountPictureImageView) ((g95) ((l2) this.p).d).m).setImageDrawable(of6Var);
    }

    @Override // o.vn7
    public void onSuccess(xd3 xd3Var) {
        ((l2) this.p).d(bt1.T(xd3Var), false);
    }

    public long p(zr7 zr7Var, long j, boolean z, jo6 jo6Var) {
        pr7 pr7Var = (pr7) this.p;
        long jV = pr7Var.v(zr7Var, j, z, false, jo6Var, false, null);
        if (!gt7.a(jV, (gt7) this.f118o)) {
            this.n = false;
        }
        pr7Var.r(gt7.c(jV) ? n43.f1537o : n43.n);
        return jV;
    }

    public void q(wx8 wx8Var) {
        synchronized (this.f118o) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.p;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.p = arrayDeque;
                }
                arrayDeque.add(wx8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(bo7 bo7Var) {
        wx8 wx8Var;
        synchronized (this.f118o) {
            if (((ArrayDeque) this.p) != null && !this.n) {
                this.n = true;
                while (true) {
                    synchronized (this.f118o) {
                        try {
                            wx8Var = (wx8) ((ArrayDeque) this.p).poll();
                            if (wx8Var == null) {
                                this.n = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    wx8Var.a(bo7Var);
                }
            }
        }
    }

    public String toString() {
        switch (this.m) {
            case 7:
                return "SingleSelectionLayout(isStartHandle=" + this.n + ", crossed=" + h() + ", info=\n\t" + ((rr0) this.p) + ")";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n1(byte b, Object obj, Object obj2, boolean z) {
        this.m = b;
        this.n = z;
        this.f118o = obj;
        this.p = obj2;
    }

    public n1(fi7 fi7Var) {
        this.m = (byte) 4;
        Object systemService = fi7Var.getSystemService("activity");
        systemService.getClass();
        this.p = (ActivityManager) systemService;
    }

    public n1() {
        this.m = (byte) 9;
        this.f118o = new Object();
    }

    public n1(mg4 mg4Var, a65 a65Var) {
        this.m = (byte) 3;
        this.f118o = mg4Var;
        this.p = a65Var;
    }

    public n1(String str, a3 a3Var, boolean z) {
        this.m = (byte) 1;
        this.f118o = str;
        this.p = a3Var;
        this.n = z;
    }

    public n1(SentryAndroidOptions sentryAndroidOptions) {
        this.m = (byte) 0;
        this.p = new ArrayList();
        this.n = false;
        this.f118o = sentryAndroidOptions;
    }

    public n1(pr7 pr7Var) {
        this.m = (byte) 8;
        this.p = pr7Var;
        this.n = true;
    }
}
