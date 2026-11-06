package o;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.apidefinitions.policies.models.PolicyAssignmentEvent;
import com.teamviewer.apidefinitions.policies.models.PolicyUnassignmentEvent;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrolviewlib.activity.LockScreenActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDevicePreferenceViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDevicePreferenceViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1435o;
    public final /* synthetic */ Object p;

    public /* synthetic */ m5(Context context, Function1 function1, Function0 function0) {
        this.m = (byte) 21;
        this.f1435o = context;
        this.n = function1;
        this.p = function0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[LOOP:0: B:11:0x002b->B:24:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[EDGE_INSN: B:32:0x0084->B:29:0x0084 BREAK  A[LOOP:0: B:11:0x002b->B:24:0x006f], SYNTHETIC] */
    private final Object c(Object obj) {
        Object objG;
        Set set = (Set) this.n;
        gv4 gv4Var = (gv4) this.f1435o;
        k76 k76Var = (k76) this.p;
        if (set.contains(obj) && (objG = gv4Var.n.g(obj)) != null) {
            if (objG instanceof kx4) {
                kx4 kx4Var = (kx4) objG;
                Object[] objArr = kx4Var.b;
                long[] jArr = kx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    wp6 wp6Var = (wp6) objArr[(i << 3) + i3];
                                    Object arrayList = k76Var.m;
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        k76Var.m = arrayList;
                                    }
                                    ((List) arrayList).add(wp6Var);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                wp6 wp6Var2 = (wp6) objG;
                Object arrayList2 = k76Var.m;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    k76Var.m = arrayList2;
                }
                ((List) arrayList2).add(wp6Var2);
            }
        }
        return f88.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jFloatToRawIntBits;
        ll0 ll0Var;
        t52 t52Var;
        zi5 zi5Var;
        byte b = this.m;
        zk2 zk2Var = zk2.a;
        byte b2 = 4;
        boolean z = false;
        byte b3 = 1;
        byte b4 = 0;
        boolean zBooleanValue = false;
        f88 f88Var = f88.a;
        Object obj2 = this.p;
        Object obj3 = this.f1435o;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                j6 j6Var = (j6) obj4;
                Context context = (Context) obj3;
                iv6 iv6Var = (iv6) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                if (l25.b()) {
                    context.getClass();
                    Object systemService = context.getSystemService("connectivity");
                    systemService.getClass();
                    if (((ConnectivityManager) systemService).getRestrictBackgroundStatus() == 3) {
                        j6Var.X0(b12.f382o);
                        j6Var.V0(false);
                    } else if (j6.W0(context)) {
                        IStatisticsHandler iStatisticsHandler = ga7.a;
                        ga7.a(zBooleanValue2 ? u5.r : u5.s);
                        ITrustedDevicePreferenceViewModelNative iTrustedDevicePreferenceViewModelNative = j6Var.f1133o;
                        if (bool.equals(NativeLiveDataBool.newInstance(ITrustedDevicePreferenceViewModelSWIGJNI.ITrustedDevicePreferenceViewModelNative_IsTrustedDeviceEnabled(iTrustedDevicePreferenceViewModelNative.a, iTrustedDevicePreferenceViewModelNative), false).getValue())) {
                            ye4.a("AccountViewModel", "Updating trusted device from another device should not trigger it again");
                        } else {
                            long j = iTrustedDevicePreferenceViewModelNative.a;
                            if (zBooleanValue2) {
                                ITrustedDevicePreferenceViewModelSWIGJNI.ITrustedDevicePreferenceViewModelNative_EnableTrustedDeviceNotification(j, iTrustedDevicePreferenceViewModelNative);
                            } else {
                                ITrustedDevicePreferenceViewModelSWIGJNI.ITrustedDevicePreferenceViewModelNative_DisableTrustedDeviceNotification(j, iTrustedDevicePreferenceViewModelNative);
                            }
                        }
                    } else {
                        j6Var.V0(!zBooleanValue2);
                        j6Var.X0(b12.n);
                    }
                } else {
                    j6Var.V0(!zBooleanValue2);
                    xk0.b(iv6Var, context, x5.C);
                }
                return f88Var;
            case 1:
                ge8 ge8Var = (ge8) obj4;
                LayoutNode layoutNode = (LayoutNode) obj3;
                ge8 ge8Var2 = (ge8) obj2;
                ll0 ll0VarX = ((u52) obj).h0().x();
                if (ge8Var.n.getVisibility() != 8) {
                    ge8Var.K = true;
                    Owner owner = layoutNode.A;
                    AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                    if (androidComposeView != null) {
                        Canvas canvasB = dg.b(ll0VarX);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        ge8Var2.draw(canvasB);
                    }
                    ge8Var.K = false;
                }
                return f88Var;
            case 2:
                xm xmVar = (xm) obj4;
                zk3 zk3Var = (zk3) obj3;
                jl5 jl5Var = (jl5) obj2;
                il5 il5Var = (il5) obj;
                if (il5Var.b() != null) {
                    long j2 = ((vk3) xmVar.B.invoke(new vk3(zk3Var.e()))).a;
                    i04 i04VarE = xmVar.C.m.e(il5Var);
                    i04 i04VarB = il5Var.b();
                    i04VarB.getClass();
                    il5.j(il5Var, jl5Var, vk3.b(j2, us1.O(i04VarE.K(i04VarB, 0L))));
                }
                return f88Var;
            case 3:
                Function1 function1 = (Function1) obj4;
                px4 px4Var = (px4) obj2;
                zr7 zr7Var = (zr7) obj;
                ((px4) obj3).setValue(zr7Var);
                boolean zN = im3.n((String) px4Var.getValue(), zr7Var.a.n);
                xo xoVar = zr7Var.a;
                px4Var.setValue(xoVar.n);
                if (!zN) {
                    function1.invoke(xoVar.n);
                }
                return f88Var;
            case 4:
                im3.R((me1) obj4, null, null, new j0(obj, obj3, obj2, (hc1) null, (byte) 9), 3);
                return f88Var;
            case 5:
                x8 x8Var = new x8((me1) obj3, (k08) obj2, (byte) 11);
                fw3[] fw3VarArr = lp6.a;
                ((op6) obj).d(zo6.c, new m3((String) obj4, x8Var));
                return f88Var;
            case 6:
                lf6 lf6Var = (lf6) obj3;
                sb0 sb0Var = (sb0) obj2;
                u52 u52Var = (u52) obj;
                uc7 uc7Var = (uc7) ((yc4) obj4).n;
                uc7Var.getClass();
                float fFloatValue = Float.valueOf(uc7Var.m).floatValue();
                float f = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                float f2 = f / 2.0f;
                float f3 = f * 2.0f;
                float fMin = Math.min(Math.abs(lf6Var.b()), Math.abs(lf6Var.a()));
                float f4 = lf6Var.a;
                float f5 = lf6Var.b;
                boolean z2 = f3 > fMin;
                long j3 = lf6Var.e;
                cc7 cc7Var = new cc7(f, 0.0f, 0, 0, 30);
                if (z2) {
                    u52.n(u52Var, sb0Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(lf6Var.b())) << 32) | (((long) Float.floatToRawIntBits(lf6Var.a())) & 4294967295L), j3, 0.0f, null, null, 240);
                } else if (Float.intBitsToFloat((int) (j3 >> 32)) < f2) {
                    float f6 = f4 + f;
                    float f7 = f5 + f;
                    float f8 = lf6Var.c - f;
                    float f9 = lf6Var.d - f;
                    iu iuVarH0 = u52Var.h0();
                    long jD = iuVarH0.D();
                    iuVarH0.x().g();
                    try {
                        ((xc0) iuVarH0.f1103o).D(f6, f7, f8, f9, 0);
                        u52.n(u52Var, sb0Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(lf6Var.b())) << 32) | (((long) Float.floatToRawIntBits(lf6Var.a())) & 4294967295L), j3, 0.0f, null, null, 240);
                    } finally {
                        ua5.x(iuVarH0, jD);
                    }
                } else {
                    u52.n(u52Var, sb0Var, (((long) Float.floatToRawIntBits(f4 + f2)) << 32) | (((long) Float.floatToRawIntBits(f5 + f2)) & 4294967295L), (((long) Float.floatToRawIntBits(lf6Var.b() - f)) << 32) | (((long) Float.floatToRawIntBits(lf6Var.a() - f)) & 4294967295L), xk0.H(f2, j3), 0.0f, cc7Var, null, 208);
                }
                return f88Var;
            case 7:
                v56 v56Var = (v56) obj3;
                float f10 = v56Var.b;
                float f11 = v56Var.d;
                float f12 = v56Var.a;
                float f13 = v56Var.c;
                sb0 sb0Var2 = (sb0) obj2;
                u52 u52Var2 = (u52) obj;
                uc7 uc7Var2 = (uc7) ((yc4) obj4).n;
                uc7Var2.getClass();
                float fFloatValue2 = Float.valueOf(uc7Var2.m).floatValue();
                float f14 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
                boolean z3 = f14 * 2.0f > Math.min(Math.abs(f13 - f12), Math.abs(f11 - f10));
                if (z3) {
                    jFloatToRawIntBits = v56Var.d();
                } else {
                    float f15 = f14 / 2.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12 + f15)) << 32) | (((long) Float.floatToRawIntBits(f15 + f10)) & 4294967295L);
                }
                u52.x(u52Var2, sb0Var2, jFloatToRawIntBits, z3 ? v56Var.c() : (((long) Float.floatToRawIntBits((f11 - f10) - f14)) & 4294967295L) | (((long) Float.floatToRawIntBits((f13 - f12) - f14)) << 32), 0.0f, z3 ? zk2Var : new cc7(f14, 0.0f, 0, 0, 30), null, 104);
                return f88Var;
            case 8:
                cb1 cb1Var = (cb1) obj4;
                bp3 bp3Var = (bp3) obj3;
                wk6 wk6Var = (wk6) obj2;
                float fFloatValue3 = ((Float) obj).floatValue();
                float f16 = cb1Var.C ? 1.0f : -1.0f;
                yk6 yk6Var = cb1Var.B;
                long jF = yk6Var.f(yk6Var.i(f16 * fFloatValue3));
                yk6 yk6Var2 = wk6Var.a;
                float fH = yk6Var.h(yk6Var.f(yk6Var2.d(yk6Var2.k, jF, 1))) * f16;
                if (Math.abs(fH) < Math.abs(fFloatValue3)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fH + " < " + fFloatValue3 + ")");
                    cancellationException.initCause(null);
                    bp3Var.j(cancellationException);
                }
                return f88Var;
            case ep1.b /* 9 */:
                j64 j64Var = (j64) obj4;
                zr7 zr7Var2 = (zr7) obj3;
                v65 v65Var = (v65) obj2;
                u52 u52Var3 = (u52) obj;
                ws7 ws7VarD = j64Var.d();
                if (ws7VarD != null) {
                    ll0 ll0VarX2 = u52Var3.h0().x();
                    long j4 = ((gt7) j64Var.A.getValue()).a;
                    long j5 = ((gt7) j64Var.B.getValue()).a;
                    vs7 vs7Var = ws7VarD.a;
                    xu4 xu4Var = vs7Var.b;
                    us7 us7Var = vs7Var.a;
                    gy8 gy8Var = j64Var.y;
                    long j6 = j64Var.z;
                    if (!gt7.c(j4)) {
                        gy8Var.l(j6);
                        int iQ = v65Var.q(gt7.f(j4));
                        int iQ2 = v65Var.q(gt7.e(j4));
                        if (iQ != iQ2) {
                            ll0VarX2.m(vs7Var.i(iQ, iQ2), gy8Var);
                        }
                    } else if (!gt7.c(j5)) {
                        long jC = us7Var.b.c();
                        rv0 rv0Var = new rv0(jC);
                        if (jC == 16) {
                            rv0Var = null;
                        }
                        long j7 = rv0Var != null ? rv0Var.a : rv0.b;
                        gy8Var.l(rv0.b(rv0.c(j7) * 0.2f, j7));
                        int iQ3 = v65Var.q(gt7.f(j5));
                        int iQ4 = v65Var.q(gt7.e(j5));
                        if (iQ3 != iQ4) {
                            ll0VarX2.m(vs7Var.i(iQ3, iQ4), gy8Var);
                        }
                    } else if (!gt7.c(zr7Var2.b)) {
                        gy8Var.l(j6);
                        long j8 = zr7Var2.b;
                        int iQ5 = v65Var.q(gt7.f(j8));
                        int iQ6 = v65Var.q(gt7.e(j8));
                        if (iQ5 != iQ6) {
                            ll0VarX2.m(vs7Var.i(iQ5, iQ6), gy8Var);
                        }
                    }
                    boolean z4 = vs7Var.d() && us7Var.f != 3;
                    if (z4) {
                        long j9 = vs7Var.c;
                        v56 v56VarV = qs1.v(0L, (((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L));
                        ll0VarX2.g();
                        ll0.e(ll0VarX2, v56VarV);
                    }
                    c77 c77Var = us7Var.b.a;
                    vp7 vp7Var = c77Var.m;
                    bs7 bs7Var = c77Var.a;
                    if (vp7Var == null) {
                        vp7Var = vp7.b;
                    }
                    vp7 vp7Var2 = vp7Var;
                    lw6 lw6Var = c77Var.n;
                    if (lw6Var == null) {
                        lw6Var = lw6.d;
                    }
                    lw6 lw6Var2 = lw6Var;
                    v52 v52Var = c77Var.p;
                    v52 v52Var2 = v52Var == null ? zk2Var : v52Var;
                    try {
                        sb0 sb0VarC = bs7Var.c();
                        as7 as7Var = as7.a;
                        try {
                            if (sb0VarC != null) {
                                ll0Var = ll0VarX2;
                                xu4.j(xu4Var, ll0Var, sb0VarC, bs7Var != as7Var ? bs7Var.a() : 1.0f, lw6Var2, vp7Var2, v52Var2);
                            } else {
                                ll0Var = ll0VarX2;
                                xu4.i(xu4Var, ll0Var, bs7Var != as7Var ? bs7Var.b() : rv0.b, lw6Var2, vp7Var2, v52Var2);
                            }
                            if (z4) {
                                ll0Var.p();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z4) {
                                ll0VarX2.p();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return f88Var;
            case ep1.c /* 10 */:
                h76 h76Var = (h76) obj4;
                io ioVar = (io) obj;
                float fFloatValue4 = ((Number) ioVar.e.getValue()).floatValue() - h76Var.m;
                float fA = ((dk6) obj3).a(fFloatValue4);
                h76Var.m = ((Number) ioVar.e.getValue()).floatValue();
                ((h76) obj2).m = ((Number) ioVar.a.a().invoke(ioVar.f)).floatValue();
                if (Math.abs(fFloatValue4 - fA) > 0.5f) {
                    ioVar.a();
                }
                return f88Var;
            case 11:
                Context context2 = (Context) obj3;
                rp7 rp7Var = (rp7) obj2;
                ac1 ac1Var = (ac1) obj;
                List list = ((ep7) obj4).a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dp7 dp7Var = (dp7) list.get(i);
                    if (dp7Var instanceof mp7) {
                        mp7 mp7Var = (mp7) dp7Var;
                        ac1.b(ac1Var, new t0(mp7Var, (byte) 15), mp7Var.c == 0 ? null : new yy0(-1930700965, true, new lp7(mp7Var, (byte) 2)), new ql1(mp7Var, rp7Var, b4), 6);
                    } else if (dp7Var instanceof sp7) {
                        byte b5 = 28;
                        if (Build.VERSION.SDK_INT >= 28) {
                            sp7 sp7Var = (sp7) dp7Var;
                            if (context2 != null) {
                                int i2 = sp7Var.c;
                                TextClassification textClassification = sp7Var.b;
                                Drawable drawable = sp7Var.d;
                                if (i2 < 0) {
                                    ac1.b(ac1Var, new gg4(textClassification, (byte) 24), drawable != null ? new yy0(-1123224187, true, new lp7(drawable, b4)) : null, new a26((Object) context2, (Object) textClassification, (byte) 23), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i2);
                                    ac1.b(ac1Var, new gg4(remoteAction, (byte) 25), drawable != null ? new yy0(1106162332, true, new lp7(drawable, b3)) : null, new y26(remoteAction, b5), 6);
                                }
                            }
                        }
                    } else if (dp7Var instanceof qp7) {
                        ac1Var.a.add(pm8.d);
                    }
                }
                return f88Var;
            case ep1.d /* 12 */:
                ye5 ye5Var = (ye5) obj4;
                pu7 pu7Var = (pu7) obj3;
                a65 a65Var = (a65) obj2;
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                while (b4 < size2) {
                    Object obj5 = list2.get(b4);
                    obj5.getClass();
                    Object objInvoke = ((Function1) a65Var.f302o).invoke(obj5);
                    objInvoke.getClass();
                    arrayList.add((qu7) objInvoke);
                    b4++;
                }
                return new ul1(arrayList, ye5Var, pu7Var);
            case 13:
                Function1 function2 = (Function1) obj3;
                px4 px4Var2 = (px4) obj2;
                String str = (String) obj;
                str.getClass();
                if (((wt1) obj4).m == null && str.length() > 0) {
                    px4Var2.setValue(Boolean.TRUE);
                }
                function2.invoke(str);
                return f88Var;
            case 14:
                ru1 ru1Var = (ru1) obj4;
                ns1 ns1Var = (ns1) obj3;
                px4 px4Var3 = (px4) obj2;
                ((r22) obj).getClass();
                ns1Var.getClass();
                du1 du1VarV0 = ru1.V0(ns1Var);
                boolean zN2 = im3.n(ru1Var.O, du1VarV0);
                boolean z5 = !zN2;
                if (!zN2) {
                    ru1Var.P++;
                    ru1Var.Q.remove(du1VarV0);
                }
                ru1Var.O = du1VarV0;
                LinkedHashMap linkedHashMap = ru1Var.K;
                Object obj6 = linkedHashMap.get(du1VarV0);
                Object obj7 = obj6;
                if (obj6 == null) {
                    ns1 ns1VarV1 = ru1.v1(ns1Var, ru1Var.L);
                    linkedHashMap.put(du1VarV0, ns1VarV1);
                    obj7 = ns1VarV1;
                }
                ns1 ns1Var2 = (ns1) obj7;
                ru1Var.u1(ns1Var2, z5);
                if (ns1Var2.l) {
                    ru1Var.h1();
                }
                px4Var3.setValue(Boolean.TRUE);
                return new m8(ru1Var, (byte) 7);
            case 15:
                PolicyUnassignmentEvent policyUnassignmentEvent = (PolicyUnassignmentEvent) obj2;
                ns1 ns1Var3 = (ns1) obj;
                ns1Var3.getClass();
                return (!im3.n((du1) obj4, (du1) obj3) && ns1Var3.l && ns1Var3.a == policyUnassignmentEvent.getPolicyData().getDyngateId()) ? ns1.a(ns1Var3, 0L, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4145151) : ns1Var3;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                PolicyAssignmentEvent policyAssignmentEvent = (PolicyAssignmentEvent) obj2;
                ns1 ns1Var4 = (ns1) obj;
                ns1Var4.getClass();
                return (!im3.n((du1) obj4, (du1) obj3) && ns1Var4.l && policyAssignmentEvent.getPolicyData().getDyngateIds().contains(Long.valueOf(ns1Var4.a))) ? ns1.a(ns1Var4, 0L, null, null, null, null, false, null, null, null, null, null, null, policyAssignmentEvent.getPolicyData().getPolicyId(), null, null, null, null, null, null, null, 4177919) : ns1Var4;
            case 17:
                fw1 fw1Var = (fw1) obj3;
                Function0 function0 = (Function0) obj2;
                d37 d37Var = (d37) obj;
                d37Var.getClass();
                vy1 vy1VarI0 = io1.i0(d37Var);
                o37 o37VarA = ((q37) obj4).a();
                ul7 ul7Var = o37VarA != null ? o37VarA.a : null;
                if (ul7Var == null) {
                    ul7Var = null;
                }
                if (im3.n(ul7Var != null ? ul7Var.b : null, vy1VarI0.x(fw1Var.r0())) && ul7Var.a == ((sl7) vy1VarI0.b) && ul7Var.c == ((g37) vy1VarI0.c)) {
                    function0.a();
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                Function1 function3 = (Function1) obj3;
                Function1 function4 = (Function1) obj2;
                ov1 ov1Var = (ov1) obj;
                ov1Var.getClass();
                if (ov1Var != ((lr0) obj4).b) {
                    function3.invoke(new yw1(function4, ov1Var, (byte) 0));
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                fo4 fo4Var = (fo4) obj4;
                k52 k52Var = (k52) obj3;
                jl5 jl5Var2 = (jl5) obj2;
                il5 il5Var2 = (il5) obj;
                boolean zB0 = fo4Var.b0();
                nf nfVar = k52Var.A;
                float f17 = zB0 ? nfVar.e().f(((eo1) k52Var.A.h).getValue()) : ((wf5) nfVar.i).z();
                boolean zB1 = fo4Var.b0();
                if (Float.isNaN(f17)) {
                    throw new of(zB1, k52Var.D, k52Var.A.e(), ((eo1) k52Var.A.h).getValue());
                }
                j04 j04Var = vn4.p0(k52Var).M;
                j04 j04Var2 = j04.n;
                gb5 gb5Var = gb5.n;
                float f18 = (j04Var == j04Var2 && k52Var.C == gb5Var) ? -1.0f : 1.0f;
                gb5 gb5Var2 = k52Var.C;
                float f19 = gb5Var2 == gb5Var ? f18 * f17 : 0.0f;
                float f20 = gb5Var2 == gb5.m ? f17 : 0.0f;
                il5Var2.m = true;
                il5Var2.g(jl5Var2, vn4.s0(f19), vn4.s0(f20), 0.0f);
                il5Var2.m = false;
                return f88Var;
            case 20:
                Function0 function5 = (Function0) obj4;
                Function0 function6 = (Function0) obj3;
                mi2 mi2Var = (mi2) obj2;
                if (((Boolean) obj).booleanValue()) {
                    function5.a();
                } else {
                    function6.a();
                }
                mi2Var.W0(false);
                return f88Var;
            case 21:
                Context context3 = (Context) obj3;
                Function1 function7 = (Function1) obj4;
                Function0 function8 = (Function0) obj2;
                si2 si2Var = (si2) obj;
                si2Var.getClass();
                context3.getClass();
                function7.getClass();
                function8.getClass();
                boolean zEquals = si2Var.equals(qi2.a);
                g37 g37Var = g37.n;
                if (zEquals) {
                    String string = context3.getString(R.string.feedback_error_snackbar);
                    string.getClass();
                    function7.invoke(new ul7(sl7.f2030o, string, g37Var, null, null, function8, 184));
                } else if (!si2Var.equals(pi2.a) && si2Var.equals(ri2.a)) {
                    String string2 = context3.getString(R.string.feedback_success_snackbar);
                    string2.getClass();
                    function7.invoke(new ul7(sl7.m, string2, g37Var, null, null, function8, 184));
                }
                return f88Var;
            case 22:
                lq2 lq2Var = (lq2) obj3;
                Function1 function9 = (Function1) obj2;
                br2 br2Var = (br2) obj;
                if (!im3.n(br2Var, (br2) obj4)) {
                    if (im3.n(br2Var, lq2Var.c)) {
                        hk0.l("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) function9.invoke(br2Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 23:
                Function0 function10 = (Function0) obj;
                function10.getClass();
                im3.R((me1) obj4, null, null, new gy((xy6) obj3, z ? 1 : 0, (byte) 10), 3).o0(new a04((Function0) obj2, function10, (byte) 0));
                return f88Var;
            case 24:
                d14 d14Var = (d14) obj4;
                nl0 nl0Var = d14Var.m;
                Function1 function11 = (Function1) obj2;
                u52 u52Var4 = (u52) obj;
                t52 t52Var2 = d14Var.n;
                d14Var.n = (t52) obj3;
                try {
                    in1 in1VarZ = u52Var4.h0().z();
                    j04 j04VarB = u52Var4.h0().B();
                    ll0 ll0VarX3 = u52Var4.h0().x();
                    long jD2 = u52Var4.h0().D();
                    l03 l03Var = (l03) u52Var4.h0().p;
                    in1 in1VarZ2 = nl0Var.n.z();
                    j04 j04VarB2 = nl0Var.n.B();
                    ll0 ll0VarX4 = nl0Var.n.x();
                    long jD3 = nl0Var.n.D();
                    iu iuVar = nl0Var.n;
                    try {
                        l03 l03Var2 = (l03) iuVar.p;
                        iuVar.Q(in1VarZ);
                        iuVar.R(j04VarB);
                        iuVar.P(ll0VarX3);
                        iuVar.S(jD2);
                        iuVar.p = l03Var;
                        ll0VarX3.g();
                        try {
                            function11.invoke(d14Var);
                            ll0VarX3.p();
                            iu iuVar2 = nl0Var.n;
                            iuVar2.Q(in1VarZ2);
                            iuVar2.R(j04VarB2);
                            iuVar2.P(ll0VarX4);
                            iuVar2.S(jD3);
                            iuVar2.p = l03Var2;
                            d14Var.n = t52Var2;
                            return f88Var;
                        } catch (Throwable th3) {
                            t52Var = t52Var2;
                            try {
                                ll0VarX3.p();
                                iu iuVar3 = nl0Var.n;
                                iuVar3.Q(in1VarZ2);
                                iuVar3.R(j04VarB2);
                                iuVar3.P(ll0VarX4);
                                iuVar3.S(jD3);
                                iuVar3.p = l03Var2;
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                d14Var.n = t52Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        t52Var = t52Var2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    t52Var = t52Var2;
                }
                break;
            case 25:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                final c94 c94Var = (c94) obj3;
                final Function1 function12 = (Function1) obj2;
                final k76 k76Var = new k76();
                s84 s84Var = new s84() { // from class: o.q84
                    @Override // o.s84
                    public final void e(LifecycleOwner lifecycleOwner2, l84 l84Var) {
                        int i3 = r84.a[l84Var.ordinal()];
                        k76 k76Var2 = k76Var;
                        if (i3 == 1) {
                            k76Var2.m = function12.invoke(c94Var);
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            u10 u10Var = (u10) k76Var2.m;
                            if (u10Var != null) {
                                u10Var.a();
                            }
                            k76Var2.m = null;
                        }
                    }
                };
                lifecycleOwner.getR().a(s84Var);
                return new en(lifecycleOwner, s84Var, k76Var, b3);
            case 26:
                nw4 nw4Var = (nw4) obj4;
                p pVar = new p((px4) obj2, b2);
                nw4Var.observe((LifecycleOwner) obj3, pVar);
                return new l9(nw4Var, pVar, (byte) 9);
            case 27:
                Button button = (Button) obj4;
                Button button2 = (Button) obj3;
                TextView textView = (TextView) obj2;
                Boolean bool2 = (Boolean) obj;
                int i3 = LockScreenActivity.O;
                bool2.getClass();
                button.setVisibility(bool2.booleanValue() ? 0 : 4);
                button2.setVisibility(bool2.booleanValue() ? 0 : 4);
                textView.setVisibility(bool2.booleanValue() ? (byte) 0 : (byte) 4);
                return f88Var;
            case 28:
                return c(obj);
            default:
                List list3 = (List) obj4;
                Function1 function13 = (Function1) obj3;
                px4 px4Var4 = (px4) obj2;
                Map map = (Map) obj;
                map.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    boolean zBooleanValue3 = ((Boolean) entry.getValue()).booleanValue();
                    Iterator it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            an4.j("Collection contains no element matching the predicate.");
                            return null;
                        }
                        zi5Var = (zi5) it.next();
                    } while (!im3.n(zi5Var.a, str2));
                    if (zBooleanValue3) {
                        zi5Var.b.a();
                    } else if (!((Boolean) function13.invoke(str2)).booleanValue()) {
                        zi5Var.c.a();
                    } else if (((zi5) px4Var4.getValue()) == null) {
                        px4Var4.setValue(zi5Var);
                    }
                }
                return f88Var;
        }
    }

    public /* synthetic */ m5(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f1435o = obj2;
        this.p = obj3;
    }

    public /* synthetic */ m5(cb1 cb1Var, o98 o98Var, bp3 bp3Var, wk6 wk6Var) {
        this.m = (byte) 8;
        this.n = cb1Var;
        this.f1435o = bp3Var;
        this.p = wk6Var;
    }

    public /* synthetic */ m5(h76 h76Var, dk6 dk6Var, h76 h76Var2, zj1 zj1Var) {
        this.m = (byte) 10;
        this.n = h76Var;
        this.f1435o = dk6Var;
        this.p = h76Var2;
    }
}
