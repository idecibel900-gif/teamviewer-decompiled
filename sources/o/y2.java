package o;

import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 implements Function1 {
    public final /* synthetic */ byte m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2571o;

    public /* synthetic */ y2(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2571o = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:233:0x0574 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x0576  */
    /* JADX WARN: Code duplicated, block: B:250:0x05bd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ys0 ys0VarA;
        uo3 uo3Var;
        t56 t56Var;
        long j;
        Class<?> cls;
        nx3 nx3VarB;
        Class<?> cls2;
        byte b = 5;
        byte b2 = 2;
        boolean zH = true;
        Object[] objArr = 0;
        switch (this.m) {
            case 0:
                zz6 zz6Var = (zz6) this.n;
                yc4 yc4Var = (yc4) zz6Var.d;
                z2 z2Var = (z2) this.f2571o;
                obj.getClass();
                sz3 sz3Var = z2Var.a;
                hp hpVar = (hp) obj;
                if (hpVar instanceof y14) {
                    Object obj2 = yc4Var.m;
                    if (!((y14) hpVar).g && ((lp) zz6Var.e) != lp.TYPE_PARAMETER_BOUNDS) {
                        if (sz3Var != null) {
                            sy4 sy4Var = wy3.e;
                            ys0VarA = ((oz3) sz3Var).o0().a();
                            if (ys0VarA != null || wy3.r(ys0VarA) == null) {
                                zH = false;
                            } else {
                                Object obj3 = yc4Var.m;
                                LinkedHashMap linkedHashMap = op.c;
                                Object objC = op.c(hpVar, s87.t);
                                if (objC == null) {
                                    zH = false;
                                } else {
                                    ArrayList arrayListA = op.a(objC, false);
                                    if (arrayListA.isEmpty()) {
                                        zH = false;
                                    } else {
                                        Iterator it = arrayListA.iterator();
                                        while (it.hasNext()) {
                                            if (im3.n((String) it.next(), "TYPE")) {
                                                Object obj4 = yc4Var.m;
                                            }
                                        }
                                        zH = false;
                                    }
                                }
                            }
                        } else {
                            zH = false;
                        }
                    }
                } else if (sz3Var != null) {
                    sy4 sy4Var2 = wy3.e;
                    ys0VarA = ((oz3) sz3Var).o0().a();
                    if (ys0VarA != null) {
                        zH = false;
                    } else {
                        zH = false;
                    }
                } else {
                    zH = false;
                }
                return Boolean.valueOf(zH);
            case 1:
                s48 s48Var = (s48) this.n;
                uo3[] uo3VarArr = (uo3[]) this.f2571o;
                int iIntValue = ((Number) obj).intValue();
                if (s48Var == null || (uo3Var = (uo3) s48Var.a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= uo3VarArr.length) ? uo3.e : uo3VarArr[iIntValue];
                }
                return uo3Var;
            case 2:
                gj3 gj3Var = (gj3) this.n;
                synchronized (gj3Var.c) {
                    try {
                        gj3Var.e = true;
                        xx4 xx4Var = gj3Var.d;
                        Object[] objArr2 = xx4Var.m;
                        int i = xx4Var.f2559o;
                        for (int i2 = 0; i2 < i; i2++) {
                            d65 d65Var = (d65) ((gh8) objArr2[i2]).get();
                            if (d65Var != null && (t56Var = d65Var.b) != null) {
                                t56Var.closeConnection();
                                d65Var.b = null;
                            }
                        }
                        gj3Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                js7 js7Var = ((xj) this.f2571o).n;
                js7Var.b.set(null);
                js7Var.a.g();
                return f88.a;
            case 3:
                kl klVar = (kl) this.n;
                ll llVar = (ll) this.f2571o;
                synchronized (klVar.q) {
                    klVar.s.remove(llVar);
                }
                return f88.a;
            case 4:
                ((Choreographer) ((ml) this.n).n).removeFrameCallback((ll) this.f2571o);
                return f88.a;
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                return ((iz0) this.n).invoke(Integer.valueOf(iIntValue2), ((List) this.f2571o).get(iIntValue2));
            case 6:
                KeyEvent keyEvent = ((dx3) obj).a;
                if (((j64) this.n).a() == n43.n && keyEvent.getKeyCode() == 4 && yo1.F(keyEvent) == 1) {
                    ((pr7) this.f2571o).d(null);
                } else {
                    zH = false;
                }
                return Boolean.valueOf(zH);
            case 7:
                j93 j93Var = (j93) this.n;
                pp1 pp1Var = (pp1) this.f2571o;
                fp1 fp1Var = pp1Var.x;
                sy4 sy4Var3 = (sy4) obj;
                sy4Var3.getClass();
                dv5 dv5Var = (dv5) ((LinkedHashMap) j93Var.n).get(sy4Var3);
                if (dv5Var != null) {
                    return mc2.C0((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, pp1Var, sy4Var3, (vd4) j93Var.p, new gp1((xd4) ((io.sentry.android.replay.screenshot.k) fp1Var.a).a, new e3(b, pp1Var, dv5Var, objArr == true ? 1 : 0)), s67.h);
                }
                return null;
            case 8:
                t47 t47Var = (t47) obj;
                synchronized (v47.c) {
                    j = v47.e;
                    v47.e = 1 + j;
                }
                return new ox4(j, t47Var, (Function1) this.n, (Function1) this.f2571o);
            case ep1.b /* 9 */:
                int iIntValue3 = ((Number) obj).intValue();
                return ((qo2) this.n).invoke(Integer.valueOf(iIntValue3), ((List) this.f2571o).get(iIntValue3));
            case ep1.c /* 10 */:
                int iIntValue4 = ((Number) obj).intValue();
                return ((qo2) this.n).invoke(Integer.valueOf(iIntValue4), ((List) this.f2571o).get(iIntValue4));
            case 11:
                io.sentry.z7 z7Var = (io.sentry.z7) this.n;
                Object obj5 = z7Var.b;
                gl0 gl0Var = (gl0) this.f2571o;
                synchronized (obj5) {
                    ((ArrayList) z7Var.c).remove(gl0Var);
                }
                return f88.a;
            case ep1.d /* 12 */:
                g24 g24Var = (g24) this.n;
                yc4 yc4Var2 = (yc4) this.f2571o;
                sy4 sy4Var4 = (sy4) obj;
                sy4Var4.getClass();
                vd4 vd4Var = g24Var.r;
                ns4 ns4Var = g24Var.n;
                if (!((Set) vd4Var.a()).contains(sy4Var4)) {
                    if (!((Set) g24Var.s.a()).contains(sy4Var4)) {
                        g86 g86Var = (g86) ((Map) g24Var.t.a()).get(sy4Var4);
                        if (g86Var == null) {
                            return null;
                        }
                        xd4 xd4Var = ((io3) yc4Var2.m).a;
                        return mc2.C0(xd4Var, g24Var.n, sy4Var4, new vd4(xd4Var, new d24(g24Var, b2)), ep1.D(yc4Var2, g86Var), d82.z(g86Var));
                    }
                    sa4 sa4VarT = qf0.t();
                    ns4Var.getClass();
                    yc4Var2.getClass();
                    sa4 sa4VarR = qf0.r(sa4VarT);
                    int iA = sa4VarR.a();
                    if (iA == 0) {
                        return null;
                    }
                    if (iA == 1) {
                        return (ns4) lv0.F0(sa4VarR);
                    }
                    hk0.f(sa4VarR, "Multiple classes with same name are generated: ");
                    return null;
                }
                f71 f71Var = ((io3) yc4Var2.m).b;
                js0 js0VarF = bp1.f(ns4Var);
                js0VarF.getClass();
                js0 js0VarD = js0VarF.d(sy4Var4);
                ht2 ht2Var = js0VarD.a;
                String strReplace = js0VarD.b.b().replace('.', '$');
                strReplace.getClass();
                if (!ht2Var.d()) {
                    strReplace = ht2Var.b() + '.' + strReplace;
                }
                try {
                    cls = Class.forName(strReplace, false, f71Var.a);
                    break;
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                a86 a86Var = cls != null ? new a86(cls) : null;
                if (a86Var != null) {
                    return new b24(yc4Var2, ns4Var, a86Var, null);
                }
                return null;
            case 13:
                c07 c07Var = (c07) this.n;
                g24 g24Var2 = (g24) this.f2571o;
                sy4 sy4Var5 = (sy4) obj;
                sy4Var5.getClass();
                return im3.n(c07Var.getName(), sy4Var5) ? qf0.K(c07Var) : lv0.A0(g24Var2.N(sy4Var5), g24Var2.O(sy4Var5));
            case 14:
                o24 o24Var = (o24) this.n;
                yc4 yc4Var3 = o24Var.b;
                yc4 yc4Var4 = (yc4) this.f2571o;
                k24 k24Var = (k24) obj;
                k24Var.getClass();
                i24 i24Var = o24Var.f1623o;
                ht2 ht2Var2 = i24Var.q;
                sy4 sy4Var6 = k24Var.a;
                ht2Var2.getClass();
                sy4Var6.getClass();
                ht2 ht2VarJ = ht2.j(sy4Var6);
                ht2VarJ.d();
                a86 a86Var2 = k24Var.b;
                io3 io3Var = (io3) yc4Var4.m;
                if (a86Var2 != null) {
                    f71 f71Var2 = io3Var.c;
                    ((jk0) ((io3) yc4Var3.m).d.c().c).getClass();
                    ps3.g.getClass();
                    ht2 ht2VarC = a86Var2.c();
                    nx3VarB = ht2VarC != null ? f71Var2.b(ht2VarC.b()) : null;
                } else {
                    f71 f71Var3 = io3Var.c;
                    ((jk0) ((io3) yc4Var3.m).d.c().c).getClass();
                    ps3.g.getClass();
                    String strReplace2 = ht2VarJ.b().replace('.', '$');
                    strReplace2.getClass();
                    if (!ht2Var2.d()) {
                        strReplace2 = ht2Var2 + '.' + strReplace2;
                    }
                    nx3VarB = f71Var3.b(strReplace2);
                }
                r86 r86Var = nx3VarB != null ? (r86) nx3VarB.n : null;
                js0 js0VarA = r86Var != null ? p76.a(r86Var.a) : null;
                if (js0VarA != null && (!js0VarA.b.e().d() || js0VarA.c)) {
                    return null;
                }
                Object l24Var = m24.d;
                if (r86Var != null) {
                    if (r86Var.b.a == xy3.CLASS) {
                        tp1 tp1Var = ((io3) yc4Var3.m).d;
                        xr0 xr0VarG = tp1Var.g(r86Var);
                        ns4 ns4VarA = xr0VarG == null ? null : ((es0) tp1Var.c().t).a(p76.a(r86Var.a), xr0VarG);
                        if (ns4VarA != null) {
                            l24Var = new l24(ns4VarA);
                        }
                    } else {
                        l24Var = n24.d;
                    }
                }
                if (l24Var instanceof l24) {
                    return ((l24) l24Var).d;
                }
                if (l24Var instanceof n24) {
                    return null;
                }
                if (!(l24Var instanceof m24)) {
                    gk0.s();
                    return null;
                }
                if (a86Var2 == null) {
                    f71 f71Var4 = io3Var.b;
                    String strReplace3 = ht2VarJ.b().replace('.', '$');
                    strReplace3.getClass();
                    if (!ht2Var2.d()) {
                        strReplace3 = ht2Var2.b() + '.' + strReplace3;
                    }
                    try {
                        cls2 = Class.forName(strReplace3, false, f71Var4.a);
                    } catch (ClassNotFoundException unused2) {
                        cls2 = null;
                    }
                    a86Var2 = cls2 != null ? new a86(cls2) : null;
                    break;
                }
                ht2 ht2VarC2 = a86Var2 != null ? a86Var2.c() : null;
                if (ht2VarC2 == null || ht2VarC2.d() || !ht2VarC2.e().equals(i24Var.q)) {
                    return null;
                }
                return new b24(yc4Var4, i24Var, a86Var2, null);
            case 15:
                int iIntValue5 = ((Number) obj).intValue();
                return ((qo2) this.n).invoke(Integer.valueOf(iIntValue5), ((List) this.f2571o).get(iIntValue5));
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                zi0 zi0Var = (zi0) obj;
                qs1 qs1Var = (qs1) this.n;
                zi0 zi0Var2 = (zi0) this.f2571o;
                zi0Var.getClass();
                qs1Var.I(zi0Var2, zi0Var);
                return f88.a;
            case 17:
                return ((Function1) this.n).invoke(((List) this.f2571o).get(((Number) obj).intValue()));
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                int iIntValue6 = ((Number) obj).intValue();
                return ((jp6) this.n).invoke(Integer.valueOf(iIntValue6), ((List) this.f2571o).get(iIntValue6));
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                KeyEvent keyEvent2 = ((dx3) obj).a;
                iq2 iq2Var = (iq2) this.n;
                InputDevice device = keyEvent2.getDevice();
                if (device == null || !device.supportsSource(513) || ((device.isVirtual() && keyEvent2.getSource() != 33554433) || yo1.F(keyEvent2) != 2 || keyEvent2.getSource() == 257)) {
                    zH = false;
                } else if (g77.j(19, keyEvent2)) {
                    zH = ((lq2) iq2Var).h(5, true);
                } else if (g77.j(20, keyEvent2)) {
                    zH = ((lq2) iq2Var).h(6, true);
                } else if (g77.j(21, keyEvent2)) {
                    zH = ((lq2) iq2Var).h(3, true);
                } else if (g77.j(22, keyEvent2)) {
                    zH = ((lq2) iq2Var).h(4, true);
                } else if (g77.j(23, keyEvent2)) {
                    q57 q57Var = ((j64) this.f2571o).c;
                    if (q57Var != null) {
                        ((zm1) q57Var).b();
                    }
                } else {
                    zH = false;
                }
                return Boolean.valueOf(zH);
            default:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof en8) {
                    ((nc4) this.n).c.compareAndSet(-256, ((en8) th2).m);
                }
                ((ic4) this.f2571o).cancel(false);
                return f88.a;
        }
    }
}
