package o;

import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class yg0 {
    public static final yg0 a = new yg0();
    public static final my4 b = new my4();
    public static volatile qx0 c;

    public static void a(String str) {
        qx0 qx0Var = c;
        if (qx0Var != null) {
            if (qx0Var.L()) {
                qx0Var = null;
            }
            if (qx0Var != null) {
                qx0Var.N(str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(RemoteControlApplication remoteControlApplication, String str, jc1 jc1Var) throws Throwable {
        xg0 xg0Var;
        ky4 ky4Var;
        ky4 ky4Var2;
        Throwable th;
        if (jc1Var instanceof xg0) {
            xg0Var = (xg0) jc1Var;
            int i = xg0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                xg0Var.r = i - Integer.MIN_VALUE;
            } else {
                xg0Var = new xg0(this, jc1Var);
            }
        } else {
            xg0Var = new xg0(this, jc1Var);
        }
        Object obj = xg0Var.p;
        int i2 = xg0Var.r;
        hc1 hc1Var = null;
        ne1 ne1Var = ne1.m;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                xg0Var.m = remoteControlApplication;
                xg0Var.n = str;
                ky4Var = b;
                xg0Var.f2513o = ky4Var;
                xg0Var.r = 1;
                if (ky4Var.e(xg0Var) != ne1Var) {
                }
                return ne1Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ky4Var2 = xg0Var.f2513o;
                try {
                    ct1.a0(obj);
                    String str2 = (String) obj;
                    ky4Var2.j(null);
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    ky4Var2.j(null);
                    throw th;
                }
            }
            ky4 ky4Var3 = xg0Var.f2513o;
            str = xg0Var.n;
            RemoteControlApplication remoteControlApplication2 = xg0Var.m;
            ct1.a0(obj);
            ky4Var = ky4Var3;
            remoteControlApplication = remoteControlApplication2;
            tk1 tk1Var = g22.a;
            q43 q43Var = ok4.a;
            j0 j0Var = new j0(remoteControlApplication, str, hc1Var, (byte) 12);
            xg0Var.m = null;
            xg0Var.n = null;
            xg0Var.f2513o = ky4Var;
            xg0Var.r = 2;
            Object objJ0 = im3.j0(q43Var, j0Var, xg0Var);
            if (objJ0 != ne1Var) {
                ky4Var2 = ky4Var;
                obj = objJ0;
                String str3 = (String) obj;
                ky4Var2.j(null);
                return str3;
            }
            return ne1Var;
        } catch (Throwable th3) {
            ky4Var2 = ky4Var;
            th = th3;
            ky4Var2.j(null);
            throw th;
        }
    }
}
