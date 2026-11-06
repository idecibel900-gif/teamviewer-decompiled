package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.widget.EditText;
import com.google.android.gms.common.api.Status;
import com.teamviewer.commonresourcelib.preferences.VersionPreference;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class lh7 implements m02, f75, un6, t75, d60, ht8, y96, ic1 {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1364o;

    public lh7(byte b) {
        this.m = b;
        switch (b) {
            case 6:
                this.n = new ol5((byte) 11);
                this.f1364o = new ni4(16);
                break;
            case 11:
                this.n = new a07(0);
                this.f1364o = new mg4((Object) null);
                break;
            case 13:
                this.n = new xx4(new Reference[16]);
                this.f1364o = new ReferenceQueue();
                break;
            case 17:
                this.n = Collections.synchronizedMap(new WeakHashMap());
                this.f1364o = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.n = new ConcurrentHashMap();
                this.f1364o = new AtomicInteger(0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    public static void h(String str, StringBuilder sb, boolean z) {
        int i = 0;
        while (i < str.length()) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 32) {
                sb.append(z ? '+' : "%20");
            } else if (iCodePointAt == 37) {
                if (i < str.length() - 2) {
                    int i2 = i + 1;
                    if (u(str.charAt(i2))) {
                        int i3 = i + 2;
                        if (u(str.charAt(i3))) {
                            sb.append('%');
                            sb.append(str.charAt(i2));
                            sb.append(str.charAt(i3));
                            i = i3;
                        } else {
                            sb.append("%25");
                        }
                    } else {
                        sb.append("%25");
                    }
                } else {
                    sb.append("%25");
                }
            } else if (iCodePointAt < 32 || iCodePointAt >= 127 || "<>\"{}|\\^[]`#".indexOf(iCodePointAt) != -1) {
                sb.append(URLEncoder.encode(new String(Character.toChars(iCodePointAt)), xh1.b.name()));
                if (Character.charCount(iCodePointAt) == 2) {
                    i++;
                }
            } else {
                sb.append((char) iCodePointAt);
            }
            i++;
        }
    }

    public static g48 n(List list) {
        return list.isEmpty() ? g48.f858o : new g48(list);
    }

    public static boolean u(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    public void A() {
        StringBuilder sb = (StringBuilder) this.f1364o;
        if (sb != null) {
            String[] strArr = lb7.a;
            if (sb.length() <= 8192) {
                sb.delete(0, sb.length());
                lb7.e.R0(sb);
            }
            this.f1364o = null;
        }
        this.n = null;
    }

    public void B(b97 b97Var, yy5 yy5Var) {
        b97Var.getClass();
        yc4 yc4Var = (yc4) this.f1364o;
        ((iq6) yc4Var.m).execute(new io.sentry.android.core.internal.util.j((Object) this, (Object) b97Var, (Object) yy5Var, (byte) 17));
    }

    public void C(b97 b97Var, int i) {
        b97Var.getClass();
        yc4 yc4Var = (yc4) this.f1364o;
        ((iq6) yc4Var.m).execute(new m90((dt5) this.n, b97Var, false, i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    public zu6 D(m58 m58Var, List list, po3 po3Var) {
        m98 m98VarY;
        k58 k58Var = m58Var.a;
        zu6 zu6Var = new zu6();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            oz3 oz3Var = (oz3) it.next();
            ys0 ys0VarA = oz3Var.o0().a();
            if (ys0VarA instanceof ns4) {
                Set set = po3Var.e;
                m98 m98VarR0 = oz3Var.r0();
                if (m98VarR0 instanceof um2) {
                    um2 um2Var = (um2) m98VarR0;
                    g07 g07VarY = um2Var.n;
                    if (!g07VarY.o0().getParameters().isEmpty() && g07VarY.o0().a() != null) {
                        List<d58> parameters = g07VarY.o0().getParameters();
                        parameters.getClass();
                        ArrayList arrayList = new ArrayList(mv0.Z(parameters, 10));
                        for (d58 d58Var : parameters) {
                            h58 w87Var = (h58) lv0.p0(d58Var.getIndex(), oz3Var.m0());
                            boolean z = set != null && set.contains(d58Var);
                            if (w87Var == null || z) {
                                w87Var = new w87(d58Var);
                            } else {
                                oz3 oz3VarB = w87Var.b();
                                oz3VarB.getClass();
                                if (k58Var.d(oz3VarB) == null) {
                                    w87Var = new w87(d58Var);
                                }
                            }
                            arrayList.add(w87Var);
                        }
                        g07VarY = m77.y(g07VarY, arrayList, null, 2);
                    }
                    g07 g07VarY2 = um2Var.f2226o;
                    if (!g07VarY2.o0().getParameters().isEmpty() && g07VarY2.o0().a() != null) {
                        List<d58> parameters2 = g07VarY2.o0().getParameters();
                        parameters2.getClass();
                        ArrayList arrayList2 = new ArrayList(mv0.Z(parameters2, 10));
                        for (d58 d58Var2 : parameters2) {
                            h58 w87Var2 = (h58) lv0.p0(d58Var2.getIndex(), oz3Var.m0());
                            boolean z2 = set != null && set.contains(d58Var2);
                            if (w87Var2 == null || z2) {
                                w87Var2 = new w87(d58Var2);
                            } else {
                                oz3 oz3VarB2 = w87Var2.b();
                                oz3VarB2.getClass();
                                if (k58Var.d(oz3VarB2) == null) {
                                    w87Var2 = new w87(d58Var2);
                                }
                            }
                            arrayList2.add(w87Var2);
                        }
                        g07VarY2 = m77.y(g07VarY2, arrayList2, null, 2);
                    }
                    m98VarY = bt1.v(g07VarY, g07VarY2);
                } else {
                    if (!(m98VarR0 instanceof g07)) {
                        gk0.s();
                        return null;
                    }
                    g07 g07Var = (g07) m98VarR0;
                    if (g07Var.o0().getParameters().isEmpty() || g07Var.o0().a() == null) {
                        m98VarY = g07Var;
                    } else {
                        List<d58> parameters3 = g07Var.o0().getParameters();
                        parameters3.getClass();
                        ArrayList arrayList3 = new ArrayList(mv0.Z(parameters3, 10));
                        for (d58 d58Var3 : parameters3) {
                            h58 w87Var3 = (h58) lv0.p0(d58Var3.getIndex(), oz3Var.m0());
                            boolean z3 = set != null && set.contains(d58Var3);
                            if (w87Var3 == null || z3) {
                                w87Var3 = new w87(d58Var3);
                            } else {
                                oz3 oz3VarB3 = w87Var3.b();
                                oz3VarB3.getClass();
                                if (k58Var.d(oz3VarB3) == null) {
                                    w87Var3 = new w87(d58Var3);
                                }
                            }
                            arrayList3.add(w87Var3);
                        }
                        m98VarY = m77.y(g07Var, arrayList3, null, 2);
                    }
                }
                zu6Var.add(m58Var.f(x37.m(m98VarY, m98VarR0), ub8.q));
            } else if (ys0VarA instanceof d58) {
                Set set2 = po3Var.e;
                if (set2 == null || !set2.contains(ys0VarA)) {
                    List upperBounds = ((d58) ys0VarA).getUpperBounds();
                    upperBounds.getClass();
                    zu6Var.addAll(D(m58Var, upperBounds, po3Var));
                } else {
                    zu6Var.add(p(po3Var));
                }
            }
        }
        return lv1.E(zu6Var);
    }

    public b97 E(km8 km8Var) {
        b97 b97VarH;
        synchronized (this.f1364o) {
            b97VarH = ((og1) this.n).h(km8Var);
        }
        return b97VarH;
    }

    public String F() {
        StringBuilder sb = (StringBuilder) this.f1364o;
        if (sb == null) {
            String str = (String) this.n;
            return str != null ? str : "";
        }
        String strK = lb7.k(sb);
        this.n = strK;
        this.f1364o = null;
        return strK;
    }

    @Override // o.d60
    public void G(g60 g60Var) {
        tr8.g("BillingClient", "Reconnection finished with result: " + g60Var.a);
        try {
            ((sx8) this.n).a(g60Var);
        } catch (Throwable th) {
            tr8.i("BillingClient", "Exception setting completer.", th);
        }
        c60 c60Var = (c60) this.f1364o;
        if (c60Var.B != null) {
            it8 it8Var = new it8((Object) this, (Object) g60Var, (byte) 28);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                it8Var.run();
            } else {
                c60Var.e.post(it8Var);
            }
        }
    }

    @Override // o.d60
    public void H() {
        tr8.g("BillingClient", "Reconnection attempt failed.");
        try {
            ((sx8) this.n).a(jt8.h);
        } catch (Throwable th) {
            tr8.i("BillingClient", "Exception setting completer.", th);
        }
        c60 c60Var = (c60) this.f1364o;
        if (c60Var.B != null) {
            mt8 mt8Var = new mt8((Object) this, (byte) 27);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mt8Var.run();
            } else {
                c60Var.e.post(mt8Var);
            }
        }
    }

    public void I(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.n;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f1364o;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                io.sentry.h2.f();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((do7) entry2.getKey()).b(new br(status));
            }
        }
    }

    public void J(gw8 gw8Var) {
        try {
            S(gw8Var, (sw8) this.n);
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void K(gw8 gw8Var, int i, long j) {
        try {
            rw8 rw8Var = (rw8) ((sw8) this.n).l();
            rw8Var.b();
            sw8.B((sw8) rw8Var.n, i);
            sw8 sw8Var = (sw8) rw8Var.a();
            this.n = sw8Var;
            if (j != 0) {
                rw8 rw8Var2 = (rw8) sw8Var.l();
                rw8Var2.e(j);
                sw8Var = (sw8) rw8Var2.a();
            }
            S(gw8Var, sw8Var);
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void L(gw8 gw8Var, long j, boolean z) {
        try {
            fw8 fw8Var = (fw8) gw8Var.l();
            ww8 ww8Var = (ww8) gw8Var.t().l();
            ww8Var.b();
            yw8.p((yw8) ww8Var.n, z);
            fw8Var.b();
            gw8.o((gw8) fw8Var.n, (yw8) ww8Var.a());
            gw8 gw8Var2 = (gw8) fw8Var.a();
            sw8 sw8Var = (sw8) this.n;
            if (j != 0) {
                rw8 rw8Var = (rw8) sw8Var.l();
                rw8Var.e(j);
                sw8Var = (sw8) rw8Var.a();
            }
            S(gw8Var2, sw8Var);
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void M(gw8 gw8Var, int i, long j, boolean z) {
        try {
            rw8 rw8Var = (rw8) ((sw8) this.n).l();
            rw8Var.b();
            sw8.B((sw8) rw8Var.n, i);
            this.n = (sw8) rw8Var.a();
            fw8 fw8Var = (fw8) gw8Var.l();
            ww8 ww8Var = (ww8) gw8Var.t().l();
            ww8Var.b();
            yw8.p((yw8) ww8Var.n, z);
            fw8Var.b();
            gw8.o((gw8) fw8Var.n, (yw8) ww8Var.a());
            gw8 gw8Var2 = (gw8) fw8Var.a();
            sw8 sw8Var = (sw8) this.n;
            if (j != 0) {
                rw8 rw8Var2 = (rw8) sw8Var.l();
                rw8Var2.e(j);
                sw8Var = (sw8) rw8Var2.a();
            }
            S(gw8Var2, sw8Var);
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void N(lw8 lw8Var) {
        try {
            zw8 zw8VarQ = ax8.q();
            zw8VarQ.c((sw8) this.n);
            zw8VarQ.b();
            ax8.t((ax8) zw8VarQ.n, lw8Var);
            ((io.sentry.android.core.u0) this.f1364o).p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void O(g60 g60Var, long j) {
        try {
            pw8 pw8VarO = qw8.o();
            pw8VarO.b();
            qw8.t((qw8) pw8VarO.n, 4);
            mw8 mw8Var = mw8.IN_APP_BILLING_RESULT_UPDATE_ACTION;
            pw8VarO.b();
            qw8.p((qw8) pw8VarO.n, mw8Var);
            if (g60Var != null) {
                jw8 jw8VarP = kw8.p();
                jw8VarP.d(g60Var.a);
                String str = g60Var.c;
                jw8VarP.b();
                kw8.r((kw8) jw8VarP.n, str);
                pw8VarO.b();
                qw8.q((qw8) pw8VarO.n, (kw8) jw8VarP.a());
            }
            zw8 zw8VarQ = ax8.q();
            sw8 sw8Var = (sw8) this.n;
            if (j != 0) {
                rw8 rw8Var = (rw8) sw8Var.l();
                rw8Var.e(j);
                sw8Var = (sw8) rw8Var.a();
            }
            zw8VarQ.c(sw8Var);
            zw8VarQ.b();
            ax8.u((ax8) zw8VarQ.n, (qw8) pw8VarO.a());
            ((io.sentry.android.core.u0) this.f1364o).p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void P(ex8 ex8Var) {
        try {
            zw8 zw8VarQ = ax8.q();
            zw8VarQ.c((sw8) this.n);
            pw8 pw8VarO = qw8.o();
            pw8VarO.b();
            qw8.r((qw8) pw8VarO.n);
            pw8VarO.b();
            qw8.t((qw8) pw8VarO.n, 2);
            pw8VarO.b();
            qw8.s((qw8) pw8VarO.n, ex8Var);
            zw8VarQ.b();
            ax8.u((ax8) zw8VarQ.n, (qw8) pw8VarO.a());
            ((io.sentry.android.core.u0) this.f1364o).p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void Q(gx8 gx8Var) {
        try {
            io.sentry.android.core.u0 u0Var = (io.sentry.android.core.u0) this.f1364o;
            zw8 zw8VarQ = ax8.q();
            zw8VarQ.c((sw8) this.n);
            zw8VarQ.b();
            ax8.o((ax8) zw8VarQ.n, gx8Var);
            u0Var.p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void R(hx8 hx8Var) {
        if (hx8Var == null) {
            return;
        }
        try {
            zw8 zw8VarQ = ax8.q();
            zw8VarQ.c((sw8) this.n);
            zw8VarQ.b();
            ax8.p((ax8) zw8VarQ.n, hx8Var);
            ((io.sentry.android.core.u0) this.f1364o).p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void S(gw8 gw8Var, sw8 sw8Var) {
        if (gw8Var == null) {
            return;
        }
        try {
            zw8 zw8VarQ = ax8.q();
            zw8VarQ.c(sw8Var);
            zw8VarQ.b();
            ax8.r((ax8) zw8VarQ.n, gw8Var);
            ((io.sentry.android.core.u0) this.f1364o).p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void T(iw8 iw8Var, sw8 sw8Var) {
        if (iw8Var == null) {
            return;
        }
        try {
            zw8 zw8VarQ = ax8.q();
            zw8VarQ.c(sw8Var);
            zw8VarQ.b();
            ax8.s((ax8) zw8VarQ.n, iw8Var);
            ((io.sentry.android.core.u0) this.f1364o).p((ax8) zw8VarQ.a());
        } catch (Throwable th) {
            tr8.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // o.un6
    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.n;
        do {
            i = ((cv0) this.f1364o).s(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // o.y96
    public void accept(Object obj, Object obj2) {
        int i;
        switch (this.m) {
            case 25:
                yv8 yv8Var = new yv8((yp8) this.n, (do7) obj2);
                qt8 qt8Var = (qt8) ((at8) obj).h();
                hr hrVar = new hr(new zx0(-1, -1, 0, true), false);
                hrVar.f999o = false;
                x88 x88Var = (x88) this.f1364o;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i2 = rr8.a;
                parcelObtain.writeStrongBinder(yv8Var);
                parcelObtain.writeInt(1);
                x88Var.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                hrVar.writeToParcel(parcelObtain, 0);
                qt8Var.c(parcelObtain, 2);
                break;
            default:
                yp8 yp8Var = (yp8) this.n;
                at8 at8Var = (at8) obj;
                mv8 mv8Var = new mv8(yp8Var, (do7) obj2);
                Context context = yp8Var.a;
                try {
                    i = xn8.a(context).a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                h96 h96Var = (h96) this.f1364o;
                h96Var.r = i;
                qt8 qt8Var2 = (qt8) at8Var.h();
                hr hrVar2 = new hr(new zx0(-1, -1, 0, true), true);
                hrVar2.f999o = false;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i3 = rr8.a;
                parcelObtain2.writeStrongBinder(mv8Var);
                parcelObtain2.writeInt(1);
                h96Var.writeToParcel(parcelObtain2, 0);
                parcelObtain2.writeInt(1);
                hrVar2.writeToParcel(parcelObtain2, 0);
                qt8Var2.c(parcelObtain2, 1);
                break;
        }
    }

    @Override // o.un6
    public int b(int i) {
        do {
            i = ((cv0) this.f1364o).t(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.n).charAt(i - 1)));
        return i;
    }

    @Override // o.un6
    public int c(int i) {
        do {
            i = ((cv0) this.f1364o).t(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.n).charAt(i)));
        return i;
    }

    @Override // o.un6
    public int d(int i) {
        do {
            i = ((cv0) this.f1364o).s(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.n).charAt(i - 1)));
        return i;
    }

    public void e(c76 c76Var, lf1 lf1Var) {
        a07 a07Var = (a07) this.n;
        je8 je8VarA = (je8) a07Var.get(c76Var);
        if (je8VarA == null) {
            je8VarA = je8.a();
            a07Var.put(c76Var, je8VarA);
        }
        je8VarA.c = lf1Var;
        je8VarA.a |= 8;
    }

    public void f(char c) {
        StringBuilder sb = (StringBuilder) this.f1364o;
        if (sb != null) {
            sb.append(c);
            return;
        }
        if (((String) this.n) == null) {
            this.n = String.valueOf(c);
            return;
        }
        StringBuilder sbB = lb7.b();
        this.f1364o = sbB;
        sbB.append((String) this.n);
        this.n = null;
        ((StringBuilder) this.f1364o).append(c);
    }

    public void g(String str) {
        StringBuilder sb = (StringBuilder) this.f1364o;
        if (sb != null) {
            sb.append(str);
            return;
        }
        if (((String) this.n) == null) {
            this.n = str;
            return;
        }
        StringBuilder sbB = lb7.b();
        this.f1364o = sbB;
        sbB.append((String) this.n);
        this.n = null;
        ((StringBuilder) this.f1364o).append(str);
    }

    public URL i() {
        String strDecode;
        try {
            String protocol = ((URL) this.n).getProtocol();
            String userInfo = ((URL) this.n).getUserInfo();
            try {
                strDecode = URLDecoder.decode(((URL) this.n).getHost(), xh1.b.name());
            } catch (UnsupportedEncodingException e) {
                gk0.r(e);
                strDecode = null;
            }
            URI uri = new URI(protocol, userInfo, IDN.toASCII(strDecode), ((URL) this.n).getPort(), null, null, null);
            StringBuilder sbB = lb7.b();
            sbB.append(uri.toASCIIString());
            h(((URL) this.n).getPath(), sbB, false);
            if (((StringBuilder) this.f1364o) != null) {
                sbB.append('?');
                String strK = lb7.k((StringBuilder) this.f1364o);
                this.f1364o = null;
                h(strK, sbB, true);
            }
            if (((URL) this.n).getRef() != null) {
                sbB.append('#');
                h(((URL) this.n).getRef(), sbB, false);
            }
            URL url = new URL(lb7.k(sbB));
            this.n = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return (URL) this.n;
        }
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        Bundle bundle;
        gg6 gg6Var = (gg6) this.n;
        Bundle bundle2 = (Bundle) this.f1364o;
        gg6Var.getClass();
        return (bo7Var.k() && (bundle = (Bundle) bo7Var.i()) != null && bundle.containsKey("google.messenger")) ? gg6Var.b(bundle2).l(m12.f1424o, rk5.f1928o) : bo7Var;
    }

    public boolean k(km8 km8Var) {
        boolean zContainsKey;
        synchronized (this.f1364o) {
            zContainsKey = ((og1) this.n).a.containsKey(km8Var);
        }
        return zContainsKey;
    }

    @Override // o.m02
    public void l() {
        switch (this.m) {
            case 1:
                ((gk7) this.n).G0((p02) this.f1364o);
                break;
            default:
                nd ndVar = ((VersionPreference) this.n).Y;
                ndVar.getClass();
                String string = ((EditText) ((xk1) this.f1364o).n).getText().toString();
                string.getClass();
                try {
                    ((hy) ndVar.f1562o).a(string);
                } catch (IllegalArgumentException unused) {
                    ye4.c("AttractionGuidPreferenceViewModel", "Attraction GUID is not well-formatted: ".concat(string));
                    Context context = d82.M;
                    if (context == null) {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    String string2 = context.getString(R.string.tv_attraction_guid_invalid);
                    string2.getClass();
                    fx3.r(string2, 1, context, bu7.MAIN);
                    return;
                }
                break;
        }
    }

    @Override // o.t75
    public void m(bo7 bo7Var) {
        switch (this.m) {
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((Map) ((lh7) this.f1364o).f1364o).remove((do7) this.n);
                return;
            default:
                cy8 cy8Var = (cy8) this.n;
                do7 do7Var = (do7) this.f1364o;
                synchronized (cy8Var.f) {
                    cy8Var.e.remove(do7Var);
                    break;
                }
                return;
        }
    }

    public View o(int i, int i2, int i3, int i4) {
        View viewF;
        w20 w20Var = (w20) this.f1364o;
        k66 k66Var = (k66) this.n;
        int iD = k66Var.d();
        int iC = k66Var.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (k66Var.a) {
                case 0:
                    viewF = k66Var.b.F(i);
                    break;
                default:
                    viewF = k66Var.b.F(i);
                    break;
            }
            int iB = k66Var.b(viewF);
            int iA = k66Var.a(viewF);
            w20Var.c = iD;
            w20Var.d = iC;
            w20Var.e = iB;
            w20Var.f = iA;
            if (i3 != 0) {
                w20Var.b = i3;
                if (w20Var.a()) {
                    return viewF;
                }
            }
            if (i4 != 0) {
                w20Var.b = i4;
                if (w20Var.a()) {
                    view = viewF;
                }
            }
            i += i5;
        }
        return view;
    }

    public m98 p(po3 po3Var) {
        m98 m98VarT;
        g07 g07Var = po3Var.f;
        return (g07Var == null || (m98VarT = n37.t(g07Var)) == null) ? (ed2) ((kh7) this.n).getValue() : m98VarT;
    }

    public oz3 q(d58 d58Var, po3 po3Var) {
        d58Var.getClass();
        po3Var.getClass();
        return (oz3) ((sd4) this.f1364o).invoke(new g58(d58Var, po3Var));
    }

    public int r(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.n;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.f1364o).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    public boolean s() {
        return (((StringBuilder) this.f1364o) == null && ((String) this.n) == null) ? false : true;
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        mf8 mf8Var = (mf8) this.n;
        nf8 nf8Var = (nf8) this.f1364o;
        nf8 nf8Var2 = new nf8();
        nf8Var2.a = nf8Var.a;
        nf8Var2.b = nf8Var.b;
        nf8Var2.c = nf8Var.c;
        nf8Var2.d = nf8Var.d;
        return mf8Var.e(view, sk8Var, nf8Var2);
    }

    public String toString() {
        switch (this.m) {
            case 2:
                StringBuilder sb = (StringBuilder) this.f1364o;
                if (sb != null) {
                    return sb.toString();
                }
                String str = (String) this.n;
                return str != null ? str : "";
            case 14:
                return "Bounds{lower=" + ((nj3) this.n) + " upper=" + ((nj3) this.f1364o) + "}";
            default:
                return super.toString();
        }
    }

    public boolean v(View view) {
        w20 w20Var = (w20) this.f1364o;
        k66 k66Var = (k66) this.n;
        int iD = k66Var.d();
        int iC = k66Var.c();
        int iB = k66Var.b(view);
        int iA = k66Var.a(view);
        w20Var.c = iD;
        w20Var.d = iC;
        w20Var.e = iB;
        w20Var.f = iA;
        w20Var.b = 24579;
        return w20Var.a();
    }

    public lf1 w(c76 c76Var, int i) {
        je8 je8Var;
        lf1 lf1Var;
        a07 a07Var = (a07) this.n;
        int iD = a07Var.d(c76Var);
        if (iD >= 0 && (je8Var = (je8) a07Var.i(iD)) != null) {
            int i2 = je8Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                je8Var.a = i3;
                if (i == 4) {
                    lf1Var = je8Var.b;
                } else if (i == 8) {
                    lf1Var = je8Var.c;
                } else {
                    hk0.g("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    a07Var.g(iD);
                    je8Var.a = 0;
                    je8Var.b = null;
                    je8Var.c = null;
                    je8.d.c(je8Var);
                }
                return lf1Var;
            }
        }
        return null;
    }

    public b97 x(km8 km8Var) {
        b97 b97VarF;
        km8Var.getClass();
        synchronized (this.f1364o) {
            b97VarF = ((og1) this.n).f(km8Var);
        }
        return b97VarF;
    }

    public void y(c76 c76Var) {
        je8 je8Var = (je8) ((a07) this.n).get(c76Var);
        if (je8Var == null) {
            return;
        }
        je8Var.a &= -2;
    }

    public void z(c76 c76Var) {
        mg4 mg4Var = (mg4) this.f1364o;
        for (int iH = mg4Var.h() - 1; iH >= 0; iH--) {
            if (c76Var == mg4Var.i(iH)) {
                Object[] objArr = mg4Var.f1467o;
                Object obj = objArr[iH];
                Object obj2 = uf0.F;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                mg4Var.m = true;
                break;
            }
        }
        je8 je8Var = (je8) ((a07) this.n).remove(c76Var);
        if (je8Var != null) {
            je8Var.a = 0;
            je8Var.b = null;
            je8Var.c = null;
            je8.d.c(je8Var);
        }
    }

    public /* synthetic */ lh7(byte b, boolean z) {
        this.m = b;
    }

    public /* synthetic */ lh7(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1364o = obj2;
    }

    public lh7(Context context, sw8 sw8Var) {
        this.m = (byte) 23;
        io.sentry.android.core.u0 u0Var = new io.sentry.android.core.u0((byte) 9);
        try {
            j28.b(context);
            u0Var.f127o = j28.a().c(ci0.e).a("PLAY_BILLING_LIBRARY", new ta2("proto"), new ol5((byte) 19));
        } catch (Throwable unused) {
            u0Var.n = true;
        }
        this.f1364o = u0Var;
        this.n = sw8Var;
    }

    public lh7(IBinder iBinder) throws RemoteException {
        this.m = (byte) 28;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.n = new Messenger(iBinder);
            this.f1364o = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f1364o = new dt8(iBinder);
            this.n = null;
        } else {
            io.sentry.android.core.v0.j("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public lh7(lh7 lh7Var, do7 do7Var) {
        this.m = (byte) 19;
        this.n = do7Var;
        Objects.requireNonNull(lh7Var);
        this.f1364o = lh7Var;
    }

    public lh7(ov8 ov8Var) {
        this.m = (byte) 22;
        this.f1364o = new Handler(Looper.getMainLooper());
        this.n = ov8Var;
    }

    public lh7(rk5 rk5Var) {
        this.m = (byte) 5;
        xd4 xd4Var = new xd4("Type parameter upper bound erasure results");
        this.n = new kh7(new v87(this, (byte) 3));
        this.f1364o = xd4Var.b(new h16(this, (byte) 13));
    }

    public lh7(URL url) {
        this.m = (byte) 8;
        this.n = url;
        if (url.getQuery() != null) {
            StringBuilder sbB = lb7.b();
            sbB.append(((URL) this.n).getQuery());
            this.f1364o = sbB;
        }
    }

    public lh7(dt5 dt5Var, yc4 yc4Var) {
        this.m = (byte) 16;
        dt5Var.getClass();
        yc4Var.getClass();
        this.n = dt5Var;
        this.f1364o = yc4Var;
    }

    public /* synthetic */ lh7(byte b, Object obj, Object obj2, boolean z) {
        this.m = b;
        this.n = obj2;
        this.f1364o = obj;
    }

    public lh7(og1 og1Var) {
        this.m = (byte) 0;
        this.n = og1Var;
        this.f1364o = new Object();
    }

    public lh7(k66 k66Var) {
        this.m = (byte) 10;
        this.n = k66Var;
        w20 w20Var = new w20();
        w20Var.b = 0;
        this.f1364o = w20Var;
    }

    public lh7(WindowInsetsAnimation.Bounds bounds) {
        this.m = (byte) 14;
        this.n = nj3.c(bounds.getLowerBound());
        this.f1364o = nj3.c(bounds.getUpperBound());
    }
}
