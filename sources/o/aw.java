package o;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.SystemClock;
import com.teamviewer.apidefinitions.custommodules.apis.CustommodulesApi;
import com.teamviewer.apidefinitions.custommodules.models.CustomModule;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleHost;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class aw implements dw, l30, uh0, sb1, ad2, x43, jk4 {
    public final /* synthetic */ byte m;

    public /* synthetic */ aw(byte b) {
        this.m = b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static nf2 r(g07 g07Var, y2 y2Var, int i, j48 j48Var, boolean z, boolean z2) {
        ys0 ys0VarA;
        ns4 ns4VarY0;
        Boolean bool;
        k48 k48VarO0;
        Boolean bool2;
        nd ndVar;
        w87 w87VarK;
        ?? r3 = 0;
        j48 j48Var2 = j48.f1130o;
        Object[] objArr = j48Var != j48Var2;
        Object[] objArr2 = (z2 && z) ? false : true;
        Object obj = null;
        if ((objArr != false || !g07Var.m0().isEmpty()) && (ys0VarA = g07Var.o0().a()) != null) {
            uo3 uo3Var = (uo3) y2Var.invoke(Integer.valueOf(i));
            wp wpVar = u48.a;
            if (j48Var == j48Var2 || !(ys0VarA instanceof ns4)) {
                ns4VarY0 = null;
            } else if (uo3Var.b == fw4.m && j48Var == j48.m) {
                ns4 ns4Var = (ns4) ys0VarA;
                String str = mo3.a;
                it2 it2VarG = zo1.g(ns4Var);
                HashMap map = mo3.j;
                if (map.containsKey(it2VarG)) {
                    ht2 ht2Var = (ht2) map.get(zo1.g(ns4Var));
                    if (ht2Var == null) {
                        io.sentry.h2.g(ns4Var, " is not a mutable collection", "Given class ");
                        return null;
                    }
                    ns4VarY0 = bp1.e(ns4Var).i(ht2Var);
                } else if (uo3Var.b == fw4.n) {
                    ns4VarY0 = null;
                } else {
                    ns4VarY0 = null;
                }
            } else if (uo3Var.b == fw4.n || j48Var != j48.n) {
                ns4VarY0 = null;
            } else {
                ns4 ns4Var2 = (ns4) ys0VarA;
                String str2 = mo3.a;
                if (mo3.k.containsKey(zo1.g(ns4Var2))) {
                    ns4VarY0 = xz2.y0(ns4Var2);
                } else {
                    ns4VarY0 = null;
                }
            }
            if (j48Var == j48Var2) {
                bool = null;
            } else {
                b65 b65Var = uo3Var.a;
                int i2 = b65Var == null ? -1 : t48.a[b65Var.ordinal()];
                if (i2 == 1) {
                    bool = Boolean.TRUE;
                } else if (i2 != 2) {
                    bool = null;
                } else {
                    bool = Boolean.FALSE;
                }
            }
            if (ns4VarY0 == null || (k48VarO0 = ns4VarY0.q()) == null) {
                k48VarO0 = g07Var.o0();
            }
            int i3 = i + 1;
            List listM0 = g07Var.m0();
            List parameters = k48VarO0.getParameters();
            parameters.getClass();
            Iterator it = listM0.iterator();
            Iterator it2 = parameters.iterator();
            ArrayList arrayList = new ArrayList(Math.min(mv0.Z(listM0, 10), mv0.Z(parameters, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                d58 d58Var = (d58) it2.next();
                h58 h58Var = (h58) next;
                byte b = 7;
                if (objArr2 == true) {
                    bool2 = bool;
                    if (!h58Var.c()) {
                        ndVar = s(h58Var.b().r0(), y2Var, i3, z2);
                    } else if (((uo3) y2Var.invoke(Integer.valueOf(i3))).a == b65.m) {
                        m98 m98VarR0 = h58Var.b().r0();
                        ndVar = new nd((byte) 7, 1, bt1.v(bt1.I(m98VarR0).s0(r3), bt1.V(m98VarR0).s0(true)));
                    } else {
                        ndVar = new nd(b, 1, null);
                    }
                } else {
                    bool2 = bool;
                    ndVar = new nd(b, r3, obj);
                }
                i3 += ndVar.n;
                oz3 oz3Var = (oz3) ndVar.f1562o;
                if (oz3Var != null) {
                    ub8 ub8VarA = h58Var.a();
                    ub8VarA.getClass();
                    w87VarK = n37.i(oz3Var, ub8VarA, d58Var);
                } else if (ns4VarY0 == null || h58Var.c()) {
                    w87VarK = ns4VarY0 != null ? p58.k(d58Var) : null;
                } else {
                    oz3 oz3VarB = h58Var.b();
                    oz3VarB.getClass();
                    ub8 ub8VarA2 = h58Var.a();
                    ub8VarA2.getClass();
                    w87VarK = n37.i(oz3VarB, ub8VarA2, d58Var);
                }
                arrayList.add(w87VarK);
                bool = bool2;
                r3 = 0;
                obj = null;
            }
            Boolean bool3 = bool;
            int i4 = i3 - i;
            if (ns4VarY0 == null && bool3 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (((h58) it3.next()) == null);
                }
                return new nf2(null, i4, false);
            }
            up annotations = g07Var.getAnnotations();
            wp wpVar2 = u48.b;
            if (ns4VarY0 == null) {
                wpVar2 = null;
            }
            wp wpVar3 = u48.a;
            if (bool3 == null) {
                wpVar3 = null;
            }
            char c = 1;
            ArrayList arrayListQ0 = cx.Q0(new up[]{annotations, wpVar2, wpVar3});
            int size = arrayListQ0.size();
            if (size == 0) {
                hk0.l("At least one Annotations object expected");
                return null;
            }
            g48 g48VarC = i67.C(size != 1 ? new wp(lv0.P0(arrayListQ0), c == true ? 1 : 0) : (up) lv0.F0(arrayListQ0));
            List listM1 = g07Var.m0();
            Iterator it4 = arrayList.iterator();
            Iterator it5 = listM1.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(mv0.Z(arrayList, 10), mv0.Z(listM1, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                h58 h58Var2 = (h58) it5.next();
                h58 h58Var3 = (h58) next2;
                if (h58Var3 != null) {
                    h58Var2 = h58Var3;
                }
                arrayList2.add(h58Var2);
            }
            g07 g07VarP = bt1.P(arrayList2, g48VarC, k48VarO0, bool3 != null ? bool3.booleanValue() : g07Var.p0());
            if (uo3Var.c) {
                g07VarP = new h55(g07VarP);
            }
            return new nf2(g07VarP, i4, bool3 != null && uo3Var.d);
        }
        return new nf2(null, 1, false);
    }

    public static nd s(m98 m98Var, y2 y2Var, int i, boolean z) {
        m98 m98VarV;
        g07 g07Var;
        byte b = 7;
        Object objU = null;
        if (ct1.K(m98Var)) {
            return new nd(b, 1, objU);
        }
        if (!(m98Var instanceof um2)) {
            if (!(m98Var instanceof g07)) {
                gk0.s();
                return null;
            }
            nf2 nf2VarR = r((g07) m98Var, y2Var, i, j48.f1130o, false, z);
            boolean z2 = nf2VarR.b;
            oz3 oz3VarU = (g07) nf2VarR.c;
            if (z2) {
                oz3VarU = x37.u(m98Var, oz3VarU);
            }
            return new nd(b, nf2VarR.a, oz3VarU);
        }
        boolean z3 = m98Var instanceof y06;
        um2 um2Var = (um2) m98Var;
        g07 g07Var2 = um2Var.f2226o;
        g07 g07Var3 = um2Var.n;
        nf2 nf2VarR2 = r(g07Var3, y2Var, i, j48.m, z3, z);
        nf2 nf2VarR3 = r(um2Var.f2226o, y2Var, i, j48.n, z3, z);
        g07 g07Var4 = (g07) nf2VarR3.c;
        g07 g07Var5 = (g07) nf2VarR2.c;
        if (g07Var5 != null || g07Var4 != null) {
            if (nf2VarR2.b || nf2VarR3.b) {
                if (g07Var4 != null) {
                    if (g07Var5 == null) {
                        g07Var5 = g07Var4;
                    }
                    m98VarV = bt1.v(g07Var5, g07Var4);
                } else {
                    g07Var5.getClass();
                    m98VarV = g07Var5;
                }
                objU = x37.u(m98Var, m98VarV);
            } else if (z3) {
                g07 g07Var6 = g07Var5;
                if (g07Var5 == null) {
                }
                if (g07Var4 != null) {
                    g07Var6 = g07Var3;
                    g07Var2 = g07Var4;
                }
                g07Var6 = g07Var3;
                objU = new y06(g07Var6, g07Var2);
            } else {
                if (g07Var5 == null) {
                }
                if (g07Var4 != null) {
                    g07Var = g07Var3;
                    g07Var2 = g07Var4;
                }
                g07Var = g07Var3;
                objU = bt1.v(g07Var, g07Var2);
            }
        }
        return new nd(b, nf2VarR2.a, objU);
    }

    @Override // o.x43
    public boolean b(w07 w07Var) {
        j12 j12Var = w07Var.a;
        if ((j12Var instanceof g12 ? ((g12) j12Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        j12 j12Var2 = w07Var.b;
        return (j12Var2 instanceof g12 ? ((g12) j12Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // o.uh0
    public byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // o.l30
    public boolean d(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // o.l30
    public dy3 e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // o.l30
    public boolean f(float f) {
        return false;
    }

    @Override // o.sb1
    public long g(long j, long j2) {
        float fK = e8.k(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK)) & 4294967295L);
        int i = qi6.a;
        return jFloatToRawIntBits;
    }

    @Override // o.dw
    public void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    @Override // o.ad2
    public void i(zi0 zi0Var) {
    }

    @Override // o.l30
    public boolean isEmpty() {
        return true;
    }

    @Override // o.ad2
    public void j(ns4 ns4Var, ArrayList arrayList) {
    }

    @Override // o.x43
    public boolean k() {
        boolean z;
        synchronized (hj2.a) {
            try {
                int i = hj2.c;
                hj2.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > hj2.d + 30000) {
                    hj2.c = 0;
                    hj2.d = SystemClock.uptimeMillis();
                    String[] list = hj2.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    hj2.e = list.length < 800;
                }
                z = hj2.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // o.l30
    public float l() {
        return 1.0f;
    }

    @Override // o.l30
    public float m() {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(CustomModuleHost customModuleHost, jc1 jc1Var) {
        zf1 zf1Var;
        long j;
        if (jc1Var instanceof zf1) {
            zf1Var = (zf1) jc1Var;
            int i = zf1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf1Var.q = i - Integer.MIN_VALUE;
            } else {
                zf1Var = new zf1(this, jc1Var);
            }
        } else {
            zf1Var = new zf1(this, jc1Var);
        }
        Object objA = zf1Var.f2694o;
        int i2 = zf1Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            zf1Var.m = customModuleHost;
            j = 30000;
            zf1Var.n = 30000L;
            zf1Var.q = 1;
            objA = n85Var.a(30000L, zf1Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = zf1Var.n;
        CustomModuleHost customModuleHost2 = zf1Var.m;
        ct1.a0(objA);
        j = j2;
        customModuleHost = customModuleHost2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<CustomModule> qi0VarAddCustomModule = ((CustommodulesApi) ((kh7) y85.m.t().h).getValue()).addCustomModule(customModuleHost);
        zf1Var.m = null;
        zf1Var.n = j;
        zf1Var.q = 2;
        Object objM = nv1.m(qi0VarAddCustomModule, zf1Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public List o(Executor executor) {
        return Collections.singletonList(new rj1(executor));
    }

    @Override // o.jk4
    public void p(ob3 ob3Var) {
        switch (this.m) {
            case 24:
                if (ob3Var != null) {
                    MainActivity mainActivity = (MainActivity) ob3Var;
                    x02 x02VarA = ik7.a();
                    gk7 gk7Var = new gk7();
                    fx3.o(1, "dialogId", x02VarA, gk7Var);
                    gk7Var.Z0 = x02VarA;
                    gk7Var.a1 = false;
                    gk7Var.F0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedActiveBlocked_title;
                    gk7Var.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedActiveBlocked_message;
                    if (ct1.a != null) {
                        xk1.M(mainActivity.o0, new r02(gk7Var, p02.Positive));
                    }
                    gk7Var.K0 = R.string.tv_IDS_PAY_INVOICE;
                    gk7Var.O0 = R.string.tv_IDS_NOT_NOW;
                    gk7.O0(gk7Var, mainActivity);
                }
                break;
            default:
                if (ob3Var != null) {
                    x02 x02VarA2 = ik7.a();
                    gk7 gk7Var2 = new gk7();
                    fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                    gk7Var2.Z0 = x02VarA2;
                    gk7Var2.F0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_PassiveLicenseBlockedDetected_title;
                    gk7Var2.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_PassiveUnpaidLicenseDetected;
                    gk7Var2.K0 = R.string.tv_ok;
                    gk7.O0(gk7Var2, (MainActivity) ob3Var);
                }
                break;
        }
    }

    public List q() {
        return Collections.EMPTY_LIST;
    }

    public y85 t() {
        y85 y85Var;
        y85 y85Var2 = y85.n;
        if (y85Var2 != null) {
            return y85Var2;
        }
        synchronized (this) {
            y85Var = y85.n;
            if (y85Var == null) {
                y85Var = new y85((byte) 0);
                y85.n = y85Var;
            }
        }
        return y85Var;
    }

    public String toString() {
        switch (this.m) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 6:
                return "Empty";
            default:
                return super.toString();
        }
    }

    public Signature[] u(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
