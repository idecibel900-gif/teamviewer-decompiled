package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class pn5 implements yr0, hc8, ex5 {
    public static pn5 q;
    public Object m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1752o;
    public Object p;

    public pn5(byte b) {
        Object obj = null;
        switch (b) {
            case 8:
                if (bt1.a == null) {
                    im3.e0("dialogFactory");
                    throw null;
                }
                this.m = ir.f();
                ReentrantLock reentrantLock = new ReentrantLock();
                this.n = reentrantLock;
                this.f1752o = reentrantLock.newCondition();
                this.p = new b6(this, (byte) 9);
                return;
            case ep1.b /* 9 */:
            default:
                this.m = new Object();
                this.n = new Handler(Looper.getMainLooper(), new qz(this, (byte) 2));
                return;
            case ep1.c /* 10 */:
                this.m = new vw(0);
                this.n = new SparseArray();
                this.f1752o = new mg4(obj);
                this.p = new vw(0);
                return;
        }
    }

    public static void A(int i) {
        Context context = d82.M;
        if (context != null) {
            d82.t(context, i);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }

    public static pn5 i() {
        pn5 pn5Var = q;
        if (pn5Var != null) {
            return pn5Var;
        }
        pn5 pn5Var2 = new pn5((byte) 6);
        q = pn5Var2;
        return pn5Var2;
    }

    public void B(String str) {
        switch (str) {
            case "ConnectFailed":
                A(R.string.tv_errorMessage_connect_ERROR_MASTER_RESPONSE);
                break;
            case "SessionExpired":
                A(R.string.tv_IDS_STATUS_MSG_NOROUTE_SessionExpired);
                break;
            case "InvalidCustomerID":
                A(R.string.tv_IDS_STATUS_MSG_NOROUTE_InvalidCustomerID);
                break;
            case "SessionClosed":
                A(R.string.tv_IDS_STATUS_MSG_NOROUTE_SessionClosed);
                break;
            case "ConditionalAccessDenied":
                A(R.string.tv_IDS_STATUS_MSG_NOROUTE_ConditionalAccessDenied);
                break;
            default:
                return;
        }
        t(i41.q, str);
    }

    public void C() {
        y37 y37Var = (y37) this.p;
        if (y37Var != null) {
            this.f1752o = y37Var;
            this.p = null;
            a40 a40Var = (a40) y37Var.a.get();
            if (a40Var == null) {
                this.f1752o = null;
            } else {
                Handler handler = f40.n;
                handler.sendMessage(handler.obtainMessage(0, a40Var.a));
            }
        }
    }

    public void D(bn5 bn5Var) {
        if (((on5) this.n) == on5.n) {
            e45 e45Var = (e45) this.m;
            if (e45Var == null) {
                hk0.l("layoutCoordinates not set");
                return;
            }
            xs1.Z(bn5Var, e45Var.P(0L), new fj3(this.p, (byte) 23), true);
        }
        this.n = on5.f1662o;
    }

    public void E(b97 b97Var) {
        b97Var.getClass();
        be3 be3Var = new be3(this, b97Var, (byte) 15);
        synchronized (this.f1752o) {
        }
        ((Handler) ((xc0) this.m).n).postDelayed(be3Var, 5400000L);
    }

    public void F(bx0 bx0Var, String str) {
        he2 he2Var = new he2();
        he2Var.c(EventParam.EP_COMMERCIAL_USE_MESSAGE, str);
        he2Var.b(EventParam.EP_COMMERCIAL_USE_DIALOG_TYPE, bx0Var);
        bu7.MAIN.a(new be3(this, he2Var, (byte) 7));
    }

    @Override // o.ec8
    public long b(qo qoVar, qo qoVar2, qo qoVar3) {
        int iB = qoVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((ro) this.m).get(i).c(qoVar.a(i), qoVar2.a(i), qoVar3.a(i)));
        }
        return jMax;
    }

    @Override // o.yr0
    public xr0 c(js0 js0Var) {
        js0Var.getClass();
        tu5 tu5Var = (tu5) ((LinkedHashMap) this.p).get(js0Var);
        if (tu5Var == null) {
            return null;
        }
        return new xr0((yt2) this.m, tu5Var, (zf0) this.n, (s67) ((o48) this.f1752o).invoke(js0Var));
    }

    public void d(b97 b97Var) {
        Runnable runnable;
        b97Var.getClass();
        synchronized (this.f1752o) {
            runnable = (Runnable) ((LinkedHashMap) this.p).remove(b97Var);
        }
        if (runnable != null) {
            ((Handler) ((xc0) this.m).n).removeCallbacks(runnable);
        }
    }

    public boolean e(y37 y37Var, int i) {
        a40 a40Var = (a40) y37Var.a.get();
        if (a40Var == null) {
            return false;
        }
        ((Handler) this.n).removeCallbacksAndMessages(y37Var);
        Handler handler = f40.n;
        handler.sendMessage(handler.obtainMessage(1, i, 0, a40Var.a));
        return true;
    }

    public void f(bn5 bn5Var, boolean z) {
        qn5 qn5Var = (qn5) this.p;
        List list = bn5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((in5) list.get(i)).c()) {
                D(bn5Var);
                return;
            }
        }
        e45 e45Var = (e45) this.m;
        if (e45Var == null) {
            hk0.l("layoutCoordinates not set");
            return;
        }
        xs1.Z(bn5Var, e45Var.P(0L), new o43(this, qn5Var, (byte) 23), false);
        if (((on5) this.n) == on5.n) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((in5) list.get(i2)).a();
                }
            }
            io.sentry.android.core.n1 n1Var = bn5Var.b;
            if (n1Var != null) {
                n1Var.n = !qn5Var.d;
            }
        }
    }

    public te7 g(p7 p7Var) {
        ArrayList arrayList = (ArrayList) this.f1752o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            te7 te7Var = (te7) arrayList.get(i);
            if (te7Var != null && te7Var.b == p7Var) {
                return te7Var;
            }
        }
        te7 te7Var2 = new te7((Context) this.n, p7Var);
        arrayList.add(te7Var2);
        return te7Var2;
    }

    @Override // o.ex5
    public Object get() {
        return new pn5((Executor) ((ex5) this.m).get(), (tg6) ((ex5) this.n).get(), (ep3) ((ep3) this.f1752o).get(), (tg6) ((ex5) this.p).get());
    }

    @Override // o.ec8
    public qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        qo qoVarC = (qo) this.f1752o;
        if (qoVarC == null) {
            qoVarC = qoVar3.c();
            this.f1752o = qoVarC;
        }
        int iB = qoVarC.b();
        int i = 0;
        while (true) {
            qo qoVar4 = (qo) this.f1752o;
            if (i >= iB) {
                if (qoVar4 != null) {
                    return qoVar4;
                }
                im3.e0("velocityVector");
                throw null;
            }
            if (qoVar4 == null) {
                im3.e0("velocityVector");
                throw null;
            }
            long j2 = j;
            qoVar4.e(i, ((ro) this.m).get(i).b(j2, qoVar.a(i), qoVar2.a(i), qoVar3.a(i)));
            i++;
            j = j2;
        }
    }

    public oe8 j(String str, wt3 wt3Var) {
        oe8 oe8Var;
        oe8 oe8VarA;
        wt3Var.getClass();
        str.getClass();
        synchronized (((rk5) this.p)) {
            try {
                oe8Var = (oe8) ((ve8) this.m).a.get(str);
                if (wt3Var.o(oe8Var)) {
                    se8 se8Var = (se8) this.n;
                    if (se8Var instanceof bi6) {
                        bi6 bi6Var = (bi6) se8Var;
                        oe8Var.getClass();
                        x84 x84Var = bi6Var.d;
                        if (x84Var != null) {
                            a65 a65Var = bi6Var.e;
                            a65Var.getClass();
                            vt1.k(oe8Var, a65Var, x84Var);
                        }
                    }
                    oe8Var.getClass();
                } else {
                    hw4 hw4Var = new hw4((bf1) this.f1752o);
                    hw4Var.a.put(ue8.b, str);
                    se8 se8Var2 = (se8) this.n;
                    se8Var2.getClass();
                    try {
                        try {
                            oe8VarA = se8Var2.c(wt3Var, hw4Var);
                        } catch (AbstractMethodError unused) {
                            oe8VarA = se8Var2.b(et1.z(wt3Var), hw4Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        oe8VarA = se8Var2.a(et1.z(wt3Var));
                    }
                    oe8Var = oe8VarA;
                    ve8 ve8Var = (ve8) this.m;
                    ve8Var.getClass();
                    oe8Var.getClass();
                    oe8 oe8Var2 = (oe8) ve8Var.a.put(str, oe8Var);
                    if (oe8Var2 != null) {
                        oe8Var2.S0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oe8Var;
    }

    public boolean k(a40 a40Var) {
        y37 y37Var = (y37) this.f1752o;
        return (y37Var == null || a40Var == null || y37Var.a.get() != a40Var) ? false : true;
    }

    public boolean l(eq1 eq1Var) {
        if (((eq1) this.n).equals(eq1Var)) {
            return true;
        }
        pn5 pn5Var = (pn5) this.m;
        return pn5Var != null ? pn5Var.l(eq1Var) : false;
    }

    public boolean m(p7 p7Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.m).onActionItemClicked(g(p7Var), new tp4((Context) this.n, (ye7) menuItem));
    }

    public boolean o(p7 p7Var, jp4 jp4Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.m;
        te7 te7VarG = g(p7Var);
        a07 a07Var = (a07) this.p;
        Menu kq4Var = (Menu) a07Var.get(jp4Var);
        if (kq4Var == null) {
            kq4Var = new kq4((Context) this.n, jp4Var);
            a07Var.put(jp4Var, kq4Var);
        }
        return callback.onCreateActionMode(te7VarG, kq4Var);
    }

    public void p(a40 a40Var) {
        synchronized (this.m) {
            try {
                if (k(a40Var)) {
                    y37 y37Var = (y37) this.f1752o;
                    if (!y37Var.c) {
                        y37Var.c = true;
                        ((Handler) this.n).removeCallbacksAndMessages(y37Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(t68 t68Var) {
        this.n = t68Var;
        EventHub eventHub = (EventHub) this.m;
        if (!eventHub.c(EventType.EVENT_TEAMVIEWER_UI_STARTED, (s68) this.f1752o)) {
            ye4.c("UIWatcher", "Could not register UI start listener!");
        }
        if (eventHub.c(EventType.EVENT_TEAMVIEWER_UI_CLOSED, (s68) this.p)) {
            return;
        }
        ye4.c("UIWatcher", "Could not register UI close listener!");
    }

    public void r(a40 a40Var) {
        synchronized (this.m) {
            try {
                if (k(a40Var)) {
                    y37 y37Var = (y37) this.f1752o;
                    if (y37Var.c) {
                        y37Var.c = false;
                        s(y37Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(y37 y37Var) {
        Handler handler = (Handler) this.n;
        int i = y37Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(y37Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, y37Var), i);
    }

    public void t(i41 i41Var, String str) {
        he2 he2Var = new he2();
        he2Var.b(EventParam.EP_SESSION_CONNECTION_STATE, i41Var);
        if (str != null) {
            he2Var.c(EventParam.EP_SESSION_CONNECTION_STATE_INFO, str);
        }
        ((EventHub) this.m).d(EventType.EVENT_SESSION_CONNECTION_STATE_UPDATE, he2Var);
    }

    @Override // o.ec8
    public qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        qo qoVarC = (qo) this.n;
        if (qoVarC == null) {
            qoVarC = qoVar.c();
            this.n = qoVarC;
        }
        int iB = qoVarC.b();
        int i = 0;
        while (true) {
            qo qoVar4 = (qo) this.n;
            if (i >= iB) {
                if (qoVar4 != null) {
                    return qoVar4;
                }
                im3.e0("valueVector");
                throw null;
            }
            if (qoVar4 == null) {
                im3.e0("valueVector");
                throw null;
            }
            long j2 = j;
            qoVar4.e(i, ((ro) this.m).get(i).e(j2, qoVar.a(i), qoVar2.a(i), qoVar3.a(i)));
            i++;
            j = j2;
        }
    }

    @Override // o.ec8
    public qo w(qo qoVar, qo qoVar2, qo qoVar3) {
        qo qoVarC = (qo) this.p;
        if (qoVarC == null) {
            qoVarC = qoVar3.c();
            this.p = qoVarC;
        }
        int iB = qoVarC.b();
        int i = 0;
        while (true) {
            qo qoVar4 = (qo) this.p;
            if (i >= iB) {
                if (qoVar4 != null) {
                    return qoVar4;
                }
                im3.e0("endVelocityVector");
                throw null;
            }
            if (qoVar4 == null) {
                im3.e0("endVelocityVector");
                throw null;
            }
            qoVar4.e(i, ((ro) this.m).get(i).d(qoVar.a(i), qoVar2.a(i), qoVar3.a(i)));
            i++;
        }
    }

    public ll2 x(String str) {
        String strConcat;
        str.getClass();
        try {
            StringBuilder sb = new StringBuilder("https://webapi.teamviewer.com/api/v1/devices");
            String str2 = (String) this.n;
            sb.append(str2);
            String str3 = (String) this.p;
            if (str3.length() > 0) {
                sb.append("?");
                sb.append(str3);
                strConcat = sb.toString();
            } else {
                strConcat = "https://webapi.teamviewer.com/api/v1/devices".concat(str2);
            }
            URLConnection uRLConnectionOpenConnection = new URL(strConcat).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setRequestMethod(((oc6) this.m).m);
            httpsURLConnection.setUseCaches(false);
            y(httpsURLConnection, str);
            return bt1.L(httpsURLConnection);
        } catch (Exception unused) {
            ye4.c("RestRequestHandler", "Could not create request!");
            return new ll2(0, "{}");
        }
    }

    public void y(HttpsURLConnection httpsURLConnection, String str) throws IOException {
        String str2 = (String) this.f1752o;
        httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        httpsURLConnection.setRequestProperty("Content-Language", "en-US");
        if (str.length() > 0) {
            httpsURLConnection.setRequestProperty("Authorization", "Bearer ".concat(str));
        }
        if (((oc6) this.m) != oc6.GET) {
            byte[] bytes = str2.getBytes(vn0.a);
            bytes.getClass();
            httpsURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            httpsURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes2 = str2.getBytes(charset);
            bytes2.getClass();
            dataOutputStream.write(bytes2);
            dataOutputStream.close();
        }
    }

    public void z() {
        bu7.MAIN.a(new wu6(this, (byte) 3));
        ReentrantLock reentrantLock = (ReentrantLock) this.n;
        reentrantLock.lock();
        try {
            try {
                ((Condition) this.f1752o).await();
            } catch (InterruptedException unused) {
                ye4.c("TVBlockingDialog", "runResponse(): Interrupt Exception on waiting");
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public pn5(EventHub eventHub) {
        eventHub.getClass();
        this.m = eventHub;
        final byte b = 0;
        this.f1752o = new vd2(this) { // from class: o.s68
            public final /* synthetic */ pn5 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                byte b2 = b;
                pn5 pn5Var = this.b;
                switch (b2) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        t68 t68Var = (t68) pn5Var.n;
                        if (t68Var != null) {
                            t68Var.b();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        t68 t68Var2 = (t68) pn5Var.n;
                        if (t68Var2 != null) {
                            t68Var2.g();
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.p = new vd2(this) { // from class: o.s68
            public final /* synthetic */ pn5 b;

            {
                this.b = this;
            }

            @Override // o.vd2
            public final void a(EventType eventType, he2 he2Var) {
                byte b3 = b2;
                pn5 pn5Var = this.b;
                switch (b3) {
                    case 0:
                        eventType.getClass();
                        he2Var.getClass();
                        t68 t68Var = (t68) pn5Var.n;
                        if (t68Var != null) {
                            t68Var.b();
                        }
                        break;
                    default:
                        eventType.getClass();
                        he2Var.getClass();
                        t68 t68Var2 = (t68) pn5Var.n;
                        if (t68Var2 != null) {
                            t68Var2.g();
                        }
                        break;
                }
            }
        };
    }

    public pn5(SharedPreferences sharedPreferences, String str, Object obj, iw2 iw2Var, iw2 iw2Var2) {
        sharedPreferences.getClass();
        this.m = sharedPreferences;
        this.n = str;
        this.f1752o = obj;
        this.p = iw2Var;
        new vt4(this, null, (byte) 10);
    }

    public pn5(ve8 ve8Var, se8 se8Var, bf1 bf1Var) {
        ve8Var.getClass();
        se8Var.getClass();
        bf1Var.getClass();
        this.m = ve8Var;
        this.n = se8Var;
        this.f1752o = bf1Var;
        this.p = new rk5((byte) 11);
    }

    public /* synthetic */ pn5(Object obj, Object obj2, Object obj3, Object obj4) {
        this.m = obj;
        this.n = obj2;
        this.f1752o = obj3;
        this.p = obj4;
    }

    public pn5(ro roVar) {
        this.m = roVar;
    }

    public pn5(en2 en2Var) {
        this(new l07((Object) en2Var, (byte) 19));
    }
}
