package o;

import android.content.Intent;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class wj5 implements ym5, lt5, ex5, v08, du0, ic1 {
    public static wj5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wj5 f2418o = new wj5((byte) 19);
    public final /* synthetic */ byte m;

    public wj5(xt6 xt6Var) {
        this.m = (byte) 5;
        ((zt6) xt6Var).d(new ia6(this, (byte) 0));
    }

    public static RectF d(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.M || !(view instanceof vm7)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        vm7 vm7Var = (vm7) view;
        int contentWidth = vm7Var.getContentWidth();
        int contentHeight = vm7Var.getContentHeight();
        int iK = (int) x67.k(vm7Var.getContext(), 24);
        if (contentWidth < iK) {
            contentWidth = iK;
        }
        int right = (vm7Var.getRight() + vm7Var.getLeft()) / 2;
        int bottom = (vm7Var.getBottom() + vm7Var.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static Typeface f(String str, ms2 ms2Var, int i) {
        if (i == 0 && im3.n(ms2Var, ms2.f1503o) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && im3.n(ms2Var, ms2.r) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ms2Var.m, i == 1);
    }

    public static String i(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // o.du0
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.ym5
    public Typeface b(wy2 wy2Var, ms2 ms2Var, int i) {
        return f(wy2Var.f, ms2Var, i);
    }

    @Override // o.ym5
    public Typeface c(ms2 ms2Var, int i) {
        return f(null, ms2Var, i);
    }

    public void e(up upVar, up upVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = upVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((hp) it.next()).d());
        }
        Iterator it2 = upVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((hp) it2.next()).d());
        }
    }

    public g07 g(pn5 pn5Var, g48 g48Var, boolean z, int i, boolean z2) {
        g48 g48VarN;
        eq1 eq1Var = (eq1) pn5Var.n;
        h58 h58VarH = h(new w87(eq1Var.F0(), ub8.f2197o), pn5Var, null, i);
        oz3 oz3VarB = h58VarH.b();
        oz3VarB.getClass();
        g07 g07VarO = m77.o(oz3VarB);
        if (ct1.K(g07VarO)) {
            return g07VarO;
        }
        h58VarH.a();
        e(g07VarO.getAnnotations(), yp.a(g48Var));
        if (!ct1.K(g07VarO)) {
            if (ct1.K(g07VarO)) {
                g48VarN = g07VarO.n0();
            } else {
                g48 g48VarN0 = g07VarO.n0();
                lh7 lh7Var = g48.n;
                g48VarN0.getClass();
                if (g48Var.isEmpty() && g48VarN0.isEmpty()) {
                    g48VarN = g48Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) lh7Var.n).values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        xp xpVar = (xp) g48Var.m.get(iIntValue);
                        xp xpVar2 = (xp) g48VarN0.m.get(iIntValue);
                        if (xpVar != null) {
                            if (xpVar2 != null) {
                                up wpVar = xpVar.a;
                                up upVar = xpVar2.a;
                                wpVar.getClass();
                                upVar.getClass();
                                if (wpVar.isEmpty()) {
                                    wpVar = upVar;
                                } else if (!upVar.isEmpty()) {
                                    wpVar = new wp(new up[]{wpVar, upVar});
                                }
                                xpVar = new xp(wpVar);
                            }
                            xpVar2 = xpVar;
                        } else if (xpVar2 == null) {
                            xpVar2 = null;
                        } else if (xpVar != null) {
                            up wpVar2 = xpVar2.a;
                            up upVar2 = xpVar.a;
                            wpVar2.getClass();
                            upVar2.getClass();
                            if (wpVar2.isEmpty()) {
                                wpVar2 = upVar2;
                            } else if (!upVar2.isEmpty()) {
                                wpVar2 = new wp(new up[]{wpVar2, upVar2});
                            }
                            xpVar2 = new xp(wpVar2);
                        }
                        if (xpVar2 != null) {
                            arrayList.add(xpVar2);
                        }
                    }
                    g48VarN = lh7.n(arrayList);
                }
            }
            g07VarO = m77.y(g07VarO, null, g48VarN, 1);
        }
        g07 g07VarJ = p58.j(g07VarO, z);
        if (!z2) {
            return g07VarJ;
        }
        b3 b3Var = eq1Var.t;
        b3Var.getClass();
        return x37.t(g07VarJ, bt1.Q((List) pn5Var.f1752o, yo4.b, g48Var, b3Var, z));
    }

    @Override // o.ex5
    public Object get() {
        rk5 rk5Var = new rk5((byte) 17);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            yq4.l("Null flags");
            return null;
        }
        map.put(ss5.m, new t00(30000L, 86400000L, set));
        if (set == null) {
            yq4.l("Null flags");
            return null;
        }
        map.put(ss5.f2049o, new t00(1000L, 86400000L, set));
        if (set == null) {
            yq4.l("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(yi6.n)));
        if (setUnmodifiableSet == null) {
            yq4.l("Null flags");
            return null;
        }
        map.put(ss5.n, new t00(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= ss5.values().length) {
            new HashMap();
            return new s00(rk5Var, map);
        }
        hk0.l("Not all priorities have been configured");
        return null;
    }

    public h58 h(h58 h58Var, pn5 pn5Var, d58 d58Var, int i) {
        ub8 ub8VarB;
        eq1 eq1Var = (eq1) pn5Var.n;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + eq1Var.getName());
        }
        if (h58Var.c()) {
            d58Var.getClass();
            return p58.k(d58Var);
        }
        oz3 oz3VarB = h58Var.b();
        oz3VarB.getClass();
        k48 k48VarO0 = oz3VarB.o0();
        k48VarO0.getClass();
        ys0 ys0VarA = k48VarO0.a();
        h58 h58Var2 = ys0VarA instanceof d58 ? (h58) ((Map) pn5Var.p).get(ys0VarA) : null;
        int i2 = 0;
        ub8 ub8Var = ub8.f2197o;
        if (h58Var2 == null) {
            g07 g07VarO = m77.o(h58Var.b().r0());
            if (!ct1.K(g07VarO) && p58.c(g07VarO, o48.u, null)) {
                k48 k48VarO1 = g07VarO.o0();
                ys0 ys0VarA2 = k48VarO1.a();
                k48VarO1.getParameters().size();
                g07VarO.m0().size();
                if (!(ys0VarA2 instanceof d58)) {
                    if (!(ys0VarA2 instanceof eq1)) {
                        g07 g07VarL = l(g07VarO, pn5Var, i);
                        m58.d(g07VarL);
                        for (Object obj : g07VarL.m0()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                qf0.U();
                                throw null;
                            }
                            h58 h58Var3 = (h58) obj;
                            if (!h58Var3.c()) {
                                oz3 oz3VarB2 = h58Var3.b();
                                oz3VarB2.getClass();
                                if (!p58.c(oz3VarB2, o48.t, null)) {
                                }
                            }
                            i2 = i3;
                        }
                        return new w87(g07VarL, h58Var.a());
                    }
                    eq1 eq1Var2 = (eq1) ys0VarA2;
                    if (pn5Var.l(eq1Var2)) {
                        return new w87(hd2.c(gd2.r, eq1Var2.getName().m), ub8Var);
                    }
                    List listM0 = g07VarO.m0();
                    ArrayList arrayList = new ArrayList(mv0.Z(listM0, 10));
                    for (Object obj2 : listM0) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            qf0.U();
                            throw null;
                        }
                        arrayList.add(h((h58) obj2, pn5Var, (d58) k48VarO1.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List parameters = eq1Var2.t.getParameters();
                    ArrayList arrayList2 = new ArrayList(mv0.Z(parameters, 10));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((d58) it.next()).a());
                    }
                    return new w87(x37.t(g(new pn5(pn5Var, eq1Var2, arrayList, xm4.U(lv0.V0(arrayList2, arrayList))), g07VarO.n0(), g07VarO.p0(), i + 1, false), l(g07VarO, pn5Var, i)), h58Var.a());
                }
            }
            return h58Var;
        }
        if (h58Var2.c()) {
            d58Var.getClass();
            return p58.k(d58Var);
        }
        m98 m98VarR0 = h58Var2.b().r0();
        ub8 ub8VarA = h58Var2.a();
        ub8VarA.getClass();
        ub8 ub8VarA2 = h58Var.a();
        ub8VarA2.getClass();
        if (ub8VarA2 != ub8VarA && ub8VarA2 != ub8Var && ub8VarA == ub8Var) {
            ub8VarA = ub8VarA2;
        }
        if (d58Var == null || (ub8VarB = d58Var.B()) == null) {
            ub8VarB = ub8Var;
        }
        if (ub8VarB == ub8VarA || ub8VarB == ub8Var || ub8VarA != ub8Var) {
            ub8Var = ub8VarA;
        }
        e(oz3VarB.getAnnotations(), m98VarR0.getAnnotations());
        g07 g07VarJ = p58.j(m77.o(m98VarR0), oz3VarB.p0());
        g48 g48VarN0 = oz3VarB.n0();
        if (!ct1.K(g07VarJ)) {
            if (ct1.K(g07VarJ)) {
                g48VarN0 = g07VarJ.n0();
            } else {
                g48 g48VarN1 = g07VarJ.n0();
                g48VarN0.getClass();
                lh7 lh7Var = g48.n;
                g48VarN1.getClass();
                if (!g48VarN0.isEmpty() || !g48VarN1.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) lh7Var.n).values();
                    collectionValues.getClass();
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        xp xpVar = (xp) g48VarN0.m.get(iIntValue);
                        xp xpVar2 = (xp) g48VarN1.m.get(iIntValue);
                        if (xpVar != null) {
                            if (xpVar2 != null) {
                                up wpVar = xpVar.a;
                                up upVar = xpVar2.a;
                                wpVar.getClass();
                                upVar.getClass();
                                if (wpVar.isEmpty()) {
                                    wpVar = upVar;
                                } else if (!upVar.isEmpty()) {
                                    wpVar = new wp(new up[]{wpVar, upVar});
                                }
                                xpVar = new xp(wpVar);
                            }
                            xpVar2 = xpVar;
                        } else if (xpVar2 == null) {
                            xpVar2 = null;
                        } else if (xpVar != null) {
                            up wpVar2 = xpVar2.a;
                            up upVar2 = xpVar.a;
                            wpVar2.getClass();
                            upVar2.getClass();
                            if (wpVar2.isEmpty()) {
                                wpVar2 = upVar2;
                            } else if (!upVar2.isEmpty()) {
                                wpVar2 = new wp(new up[]{wpVar2, upVar2});
                            }
                            xpVar2 = new xp(wpVar2);
                        }
                        if (xpVar2 != null) {
                            arrayList3.add(xpVar2);
                        }
                    }
                    g48VarN0 = lh7.n(arrayList3);
                }
            }
            g07VarJ = m77.y(g07VarJ, null, g48VarN0, 1);
        }
        return new w87(g07VarJ, ub8Var);
    }

    @Override // o.ic1
    public /* synthetic */ Object j(bo7 bo7Var) {
        Intent intent = (Intent) ((Bundle) bo7Var.i()).getParcelable("notification_data");
        if (intent != null) {
            return new ku0(intent);
        }
        return null;
    }

    public void k(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFD = d(tabLayout, view);
        RectF rectFD2 = d(tabLayout, view2);
        int i = (int) rectFD.left;
        int i2 = (int) rectFD2.left;
        LinearInterpolator linearInterpolator = lo.a;
        int iRound = Math.round((i2 - i) * f) + i;
        int i3 = drawable.getBounds().top;
        int i4 = (int) rectFD.right;
        drawable.setBounds(iRound, i3, Math.round(f * (((int) rectFD2.right) - i4)) + i4, drawable.getBounds().bottom);
    }

    public g07 l(g07 g07Var, pn5 pn5Var, int i) {
        k48 k48VarO0 = g07Var.o0();
        List listM0 = g07Var.m0();
        ArrayList arrayList = new ArrayList(mv0.Z(listM0, 10));
        int i2 = 0;
        for (Object obj : listM0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                qf0.U();
                throw null;
            }
            h58 h58Var = (h58) obj;
            h58 h58VarH = h(h58Var, pn5Var, (d58) k48VarO0.getParameters().get(i2), i + 1);
            if (!h58VarH.c()) {
                h58VarH = new w87(p58.i(h58VarH.b(), h58Var.b().p0()), h58VarH.a());
            }
            arrayList.add(h58VarH);
            i2 = i3;
        }
        return m77.y(g07Var, arrayList, null, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r6 == r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.lang.String r7, o.jc1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.ch8
            if (r0 == 0) goto L13
            r0 = r8
            o.ch8 r0 = (o.ch8) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.ch8 r0 = new o.ch8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.f527o
            int r8 = r0.q
            r1 = 2
            r2 = 1
            o.ne1 r3 = o.ne1.m
            if (r8 == 0) goto L3d
            if (r8 == r2) goto L35
            if (r8 != r1) goto L2e
            o.ct1.a0(r6)
            o.tc6 r6 = (o.tc6) r6
            java.lang.Object r6 = r6.m
            goto L89
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            r6 = 0
            return r6
        L35:
            long r7 = r0.n
            long r4 = r0.m
            o.ct1.a0(r6)
            goto L5b
        L3d:
            o.ct1.a0(r6)
            java.lang.Long r6 = o.bc7.P(r7)
            if (r6 == 0) goto La1
            long r4 = r6.longValue()
            o.n85 r6 = o.n85.a
            r0.m = r4
            r7 = 30000(0x7530, double:1.4822E-319)
            r0.n = r7
            r0.q = r2
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r3) goto L5b
            goto L88
        L5b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L94
            o.aw r6 = o.y85.m
            o.y85 r6 = r6.t()
            java.lang.Object r6 = r6.j
            o.kh7 r6 = (o.kh7) r6
            java.lang.Object r6 = r6.getValue()
            com.teamviewer.apidefinitions.wakeonlan.apis.WakeonlanApi r6 = (com.teamviewer.apidefinitions.wakeonlan.apis.WakeonlanApi) r6
            com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceRequest r2 = new com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceRequest
            r2.<init>(r4)
            o.qi0 r6 = r6.wakeupDevice(r2)
            r0.m = r4
            r0.n = r7
            r0.q = r1
            java.lang.Object r6 = o.nv1.m(r6, r0)
            if (r6 != r3) goto L89
        L88:
            return r3
        L89:
            boolean r7 = r6 instanceof o.sc6
            if (r7 != 0) goto L93
            com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceResponse r6 = (com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceResponse) r6
            com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceResult r6 = r6.getResult()
        L93:
            return r6
        L94:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "OneAPI not available (not logged in)"
            r6.<init>(r7)
            o.sc6 r7 = new o.sc6
            r7.<init>(r6)
            return r7
        La1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "deviceId must be a numeric TeamViewer ID"
            r6.<init>(r7)
            o.sc6 r7 = new o.sc6
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wj5.m(java.lang.String, o.jc1):java.lang.Object");
    }

    @Override // o.lt5
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // o.lt5
    public void q(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case ep1.b /* 9 */:
            default:
                str = "";
                break;
            case ep1.c /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            io.sentry.android.core.v0.d("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public String toString() {
        switch (this.m) {
            case 11:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wj5(byte b) {
        this.m = b;
    }
}
