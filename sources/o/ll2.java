package o;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ll2 implements t68, vu6, ho7, q93 {
    public static final kl2 r = new kl2();
    public boolean m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1375o;
    public Object p;
    public Object q;

    public ll2(int i, String str) throws JSONException {
        this.n = str;
        pc6.m.getClass();
        pc6 pc6Var = pc6.SERVER_ERROR;
        pc6 pc6Var2 = pc6.BAD_REQUEST;
        Object obj = null;
        pc6 pc6Var3 = i == 100 ? pc6.WAIT : i == 200 ? pc6.SUCCESS : i == 204 ? pc6.NO_CONTENT : i == 400 ? pc6Var2 : i == 500 ? pc6Var : null;
        this.f1375o = pc6Var3;
        boolean z = pc6Var3 == pc6Var2 || pc6Var3 == pc6Var;
        this.m = z;
        JSONObject jSONObject = str.length() > 0 ? new JSONObject(str) : null;
        this.p = (!z || jSONObject == null) ? null : jSONObject.getString("error_description");
        if (z && jSONObject != null) {
            int i2 = jSONObject.getInt("error_code");
            y38.n.getClass();
            for (Object obj2 : y38.q) {
                if (((y38) obj2).m == i2) {
                    obj = obj2;
                    break;
                }
            }
            obj = (y38) obj;
        }
        this.q = obj;
    }

    public static float i(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean j(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i >= 7) {
            float f = i / 7.0f;
            float f2 = f / 2.0f;
            if (Math.abs(f - iArr[0]) < f2 && Math.abs(f - iArr[1]) < f2 && Math.abs((f * 3.0f) - iArr[2]) < 3.0f * f2 && Math.abs(f - iArr[3]) < f2 && Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    public static double p(il2 il2Var, il2 il2Var2) {
        double d = il2Var.a - il2Var2.a;
        double d2 = il2Var.b - il2Var2.b;
        return (d2 * d2) + (d * d);
    }

    @Override // o.q93
    public String a() {
        return (String) this.f1375o;
    }

    @Override // o.t68
    public void b() {
        ve6 ve6Var = l25.c;
        if (ve6Var == null) {
            im3.e0("watchdog");
            throw null;
        }
        ve6Var.a = true;
        io.sentry.l6 l6Var = (io.sentry.l6) this.f1375o;
        boolean z = this.m;
        l6Var.getClass();
        ye4.a("AbstractNetworkControlMethod", "onUIStarted");
        if (l6Var.n()) {
            return;
        }
        l6Var.z(z);
    }

    @Override // o.q93
    public boolean c() {
        return this.m;
    }

    @Override // o.ho7
    public void d() {
        io.sentry.l6 l6Var = (io.sentry.l6) this.f1375o;
        l6Var.getClass();
        ye4.a("AbstractNetworkControlMethod", "onTaskRemoved");
        l6Var.A();
    }

    @Override // o.q93
    public String e() {
        return (String) this.p;
    }

    @Override // o.vu6
    public void f() {
        Boolean boolValueOf;
        io.sentry.l6 l6Var = (io.sentry.l6) this.f1375o;
        AccountViewModelBase accountViewModelBase = (AccountViewModelBase) this.p;
        l6Var.getClass();
        ye4.a("AbstractNetworkControlMethod", "onSessionShutdown");
        o93 o93Var = (o93) l6Var.b;
        if (o93Var != null) {
            boolValueOf = Boolean.valueOf(((u7) o93Var).b == null);
        } else {
            boolValueOf = null;
        }
        if (im3.n(boolValueOf, Boolean.TRUE)) {
            LoginState loginStateA = accountViewModelBase != null ? accountViewModelBase.a() : null;
            if (loginStateA == LoginState.LoggedIn || loginStateA == LoginState.LoginInProgress) {
                return;
            }
            l6Var.B();
        }
    }

    @Override // o.t68
    public void g() {
        ve6 ve6Var = l25.c;
        if (ve6Var == null) {
            im3.e0("watchdog");
            throw null;
        }
        ve6Var.a = false;
        io.sentry.l6 l6Var = (io.sentry.l6) this.f1375o;
        l6Var.getClass();
        ye4.a("AbstractNetworkControlMethod", "onUIStopped");
        l6Var.B();
    }

    @Override // o.q93
    public EventType getType() {
        return (EventType) this.n;
    }

    @Override // o.q93
    public String getValue() {
        return (String) this.q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(jc1 jc1Var) {
        u33 u33Var;
        if (jc1Var instanceof u33) {
            u33Var = (u33) jc1Var;
            int i = u33Var.f2162o;
            if ((i & Integer.MIN_VALUE) != 0) {
                u33Var.f2162o = i - Integer.MIN_VALUE;
            } else {
                u33Var = new u33(this, jc1Var);
            }
        } else {
            u33Var = new u33(this, jc1Var);
        }
        Object obj = u33Var.m;
        int i2 = u33Var.f2162o;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(obj);
            iw7 iw7Var = (iw7) this.p;
            byte b = 3;
            jp2 jp2Var = new jp2(iw7Var.i, iw7Var.k, new g91(b, hc1Var, b), (byte) 0);
            h23 h23Var = new h23(2, hc1Var, b);
            u33Var.f2162o = 1;
            Object objL = xo1.L(jp2Var, h23Var, u33Var);
            ne1 ne1Var = ne1.m;
            if (objL == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        return Boolean.valueOf(!this.m);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116 A[LOOP:10: B:73:0x0116->B:78:0x0124, LOOP_START, PHI: r7 r14
      0x0116: PHI (r7v2 char) = (r7v1 char), (r7v21 char) binds: [B:70:0x010e, B:78:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r14v21 int) = (r14v20 int), (r14v24 int) binds: [B:70:0x010e, B:78:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0116
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public boolean k(int r21, int r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ll2.k(int, int, int[]):boolean");
    }

    public boolean l() {
        ArrayList<il2> arrayList = (ArrayList) this.f1375o;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i = 0;
        float f = 0.0f;
        for (il2 il2Var : arrayList) {
            if (il2Var.d >= 2) {
                i++;
                f += il2Var.c;
            }
        }
        if (i >= 3) {
            float f2 = f / size;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fAbs += Math.abs(((il2) it.next()).c - f2);
            }
            if (fAbs <= f * 0.05f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(a65 a65Var, AndroidComposeView androidComposeView, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        u53 u53Var = (u53) this.f1375o;
        x53 x53Var = (x53) this.q;
        if (this.m) {
            return 0;
        }
        try {
            this.m = true;
            io.sentry.android.core.n1 n1VarQ = ((g95) this.p).Q(a65Var, androidComposeView);
            mg4 mg4Var = (mg4) n1VarQ.f118o;
            int iH = mg4Var.h();
            while (true) {
                if (i >= iH) {
                    objArr = true;
                    break;
                }
                in5 in5Var = (in5) mg4Var.i(i);
                i = (in5Var.d || in5Var.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iH2 = mg4Var.h();
            for (int i4 = 0; i4 < iH2; i4++) {
                in5 in5Var2 = (in5) mg4Var.i(i4);
                if (objArr != false || qs1.D(in5Var2)) {
                    ((LayoutNode) this.n).M(in5Var2.c, x53Var, in5Var2.i, true);
                    if (!x53Var.m.h()) {
                        u53Var.a(in5Var2.a, x53Var, qs1.D(in5Var2));
                        x53Var.clear();
                    }
                }
            }
            boolean zB = u53Var.b(n1VarQ, z);
            if (n1VarQ.n) {
                i2 = 0;
                break;
            }
            int iH3 = mg4Var.h();
            int i5 = 0;
            while (true) {
                if (i5 >= iH3) {
                    i2 = 0;
                    break;
                }
                in5 in5Var3 = (in5) mg4Var.i(i5);
                if (!t65.b(qs1.T(in5Var3, true), 0L) && in5Var3.c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iH4 = mg4Var.h();
            for (int i6 = 0; i6 < iH4; i6++) {
                if (((in5) mg4Var.i(i6)).c()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.m = false;
        }
    }

    public void n() {
        iw7 iw7Var = (iw7) this.p;
        ji2 ji2Var = new ji2((byte) 15);
        iw7Var.getClass();
        if (((Boolean) iw7Var.h.getValue()).booleanValue()) {
            iw7Var.f1112o = ji2Var;
        } else {
            iw7.b(iw7Var);
            iw7Var.c(ji2Var);
        }
    }

    public synchronized void o() {
        try {
            if (this.m) {
                return;
            }
            this.m = true;
            Context context = (Context) this.q;
            if (context != null) {
                ((yk) this.f1375o).b(context);
                context.unregisterComponentCallbacks((ti) this.p);
            }
            ((WeakReference) this.n).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void q() {
        Iterator it = qf0.L((iw7) this.p, (iw7) this.q).iterator();
        while (it.hasNext()) {
            im3.R((gu0) this.n, (fe1) this.f1375o, null, new y0((iw7) it.next(), null, (byte) 15), 2);
        }
    }

    public void r(int i, int i2) {
        if (i < 0.0f) {
            ni3.a("Index should be non-negative (" + i + ")");
        }
        ((yf5) this.n).A(i);
        s34 s34Var = (s34) this.q;
        if (i != s34Var.n) {
            s34Var.n = i;
            int i3 = (i / 30) * 30;
            s34Var.m.setValue(ct1.b0(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((yf5) this.f1375o).A(i2);
    }

    public ll2(hl4 hl4Var, nx3 nx3Var, gu0 gu0Var, fe1 fe1Var) {
        this.n = gu0Var;
        this.f1375o = fe1Var;
        this.p = new iw7(fe1Var, gu0Var, 1000, new a23(hl4Var, this, null, (byte) 1), null);
        this.q = new iw7(fe1Var, gu0Var, 1000, new v33(nx3Var, null), null);
    }
}
