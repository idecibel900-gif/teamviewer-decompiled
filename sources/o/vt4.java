package o;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassifier;
import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.AccountViewModelBase;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vt4 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2344o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt4(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2344o = obj;
        this.p = obj2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new vt4((j97) this.f2344o, (wt4) obj2, hc1Var, (byte) 0);
            case 1:
                return new vt4((j97) this.f2344o, (rq0) obj2, hc1Var, (byte) 1);
            case 2:
                vt4 vt4Var = new vt4((v25) obj2, hc1Var, (byte) 2);
                vt4Var.f2344o = obj;
                return vt4Var;
            case 3:
                return new vt4((b35) this.f2344o, (gt5) obj2, hc1Var, (byte) 3);
            case 4:
                return new vt4((u45) this.f2344o, (hw2) obj2, hc1Var, (byte) 4);
            case 5:
                vt4 vt4Var2 = new vt4((kf0) obj2, hc1Var, (byte) 5);
                vt4Var2.f2344o = obj;
                return vt4Var2;
            case 6:
                return new vt4((l85) this.f2344o, (h37) obj2, hc1Var, (byte) 6);
            case 7:
                vt4 vt4Var3 = new vt4((nx3) obj2, hc1Var, (byte) 7);
                vt4Var3.f2344o = obj;
                return vt4Var3;
            case 8:
                return new vt4((TextClassifier) this.f2344o, (hw2) obj2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new vt4((LifecycleOwner) this.f2344o, (kp5) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                vt4 vt4Var4 = new vt4((pn5) obj2, hc1Var, (byte) 10);
                vt4Var4.f2344o = obj;
                return vt4Var4;
            case 11:
                return new vt4((tx5) this.f2344o, (UUID) obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new vt4((hw2) this.f2344o, (tb6) obj2, hc1Var, (byte) 12);
            case 13:
                return new vt4((RippleNode) this.f2344o, (jo) obj2, hc1Var, (byte) 13);
            case 14:
                vt4 vt4Var5 = new vt4((RippleNode) obj2, hc1Var, (byte) 14);
                vt4Var5.f2344o = obj;
                return vt4Var5;
            case 15:
                return new vt4((q42) this.f2344o, (sk6) obj2, hc1Var, (byte) 15);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new vt4((bn6) this.f2344o, (h37) obj2, hc1Var, (byte) 16);
            case 17:
                vt4 vt4Var6 = new vt4((bn6) obj2, hc1Var, (byte) 17);
                vt4Var6.f2344o = obj;
                return vt4Var6;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new vt4((xr6) this.f2344o, (px4) obj2, hc1Var, (byte) 18);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new vt4((xr6) this.f2344o, (d37) obj2, hc1Var, (byte) 19);
            case 20:
                return new vt4((su6) this.f2344o, (px4) obj2, hc1Var, (byte) 20);
            case 21:
                return new vt4((ul1) this.f2344o, (String) obj2, hc1Var, (byte) 21);
            case 22:
                return new vt4((o37) this.f2344o, (u3) obj2, hc1Var, (byte) 22);
            case 23:
                return new vt4((e67) this.f2344o, (String) obj2, hc1Var, (byte) 23);
            case 24:
                return new vt4((a65) this.f2344o, (oc7) obj2, hc1Var, (byte) 24);
            case 25:
                return new vt4((wc7) this.f2344o, (mw4) obj2, hc1Var, (byte) 25);
            case 26:
                return new vt4((jf3) this.f2344o, (Function0) obj2, hc1Var, (byte) 26);
            case 27:
                return new vt4((jf3) this.f2344o, (Function1) obj2, hc1Var, (byte) 27);
            case 28:
                return new vt4((dg3) this.f2344o, (Activity) obj2, hc1Var, (byte) 28);
            default:
                return new vt4((dg3) this.f2344o, (Context) obj2, hc1Var, (byte) 29);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 1:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((vt4) create((c35) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((vt4) create((gt5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((vt4) create((gt5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 11:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 13:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 14:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 15:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 17:
                return ((vt4) create((String) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 20:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 21:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 22:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 23:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 24:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 25:
                return ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 26:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 27:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 28:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            default:
                ((vt4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [o.bp3] */
    /* JADX WARN: Type inference failed for: r1v29, types: [o.bp3] */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG;
        Object objM;
        Object obj2;
        long j;
        Object objT;
        String string;
        Object objA;
        byte b = 12;
        byte b2 = 7;
        byte b3 = 10;
        int i = 2;
        ?? r10 = 0;
        boolean z = false;
        boolean z2 = false;
        switch (this.m) {
            case 0:
                ne1 ne1Var = ne1.m;
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    j97 j97Var = (j97) this.f2344o;
                    yi yiVar = new yi((wt4) this.p, (byte) 9);
                    this.n = true;
                    if (j97Var.b(yiVar, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 1:
                ne1 ne1Var2 = ne1.m;
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    j97 j97Var2 = (j97) this.f2344o;
                    if (j97Var2 == null) {
                        return f88.a;
                    }
                    yi yiVar2 = new yi((rq0) this.p, b3);
                    this.n = true;
                    if (j97Var2.b(yiVar2, this) == ne1Var2) {
                        return ne1Var2;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 2:
                v25 v25Var = (v25) this.p;
                c35 c35Var = (c35) this.f2344o;
                ne1 ne1Var3 = ne1.m;
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    a77 a77Var = c35Var.e;
                    if (a77Var == null) {
                        hk0.l("body == null");
                        return null;
                    }
                    this.f2344o = c35Var;
                    this.n = true;
                    objG = v25Var.g(a77Var, this);
                    if (objG == ne1Var3) {
                        return ne1Var3;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objG = obj;
                }
                return new t67((te3) objG, v25.d(v25Var.a, c35Var.d.a()), zg1.p);
            case 3:
                ne1 ne1Var4 = ne1.m;
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    this.n = true;
                    if (im3.A(1000L, this) == ne1Var4) {
                        return ne1Var4;
                    }
                } else {
                    if (!z6) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                we4.f().c(cm8.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((gt5) this.p).b(new x61(7));
                return f88.a;
            case 4:
                ne1 ne1Var5 = ne1.m;
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    yk6 yk6Var = ((u45) this.f2344o).a;
                    ay4 ay4Var = ay4.n;
                    hw2 hw2Var = (hw2) this.p;
                    this.n = true;
                    if (yk6Var.g(ay4Var, hw2Var, this) == ne1Var5) {
                        return ne1Var5;
                    }
                } else {
                    if (!z7) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 5:
                ne1 ne1Var6 = ne1.m;
                ?? r1 = this.n;
                try {
                    if (r1 == 0) {
                        ct1.a0(obj);
                        n87 n87VarR = im3.R((me1) this.f2344o, null, null, new y0(i, z ? 1 : 0), 3);
                        kf0 kf0Var = (kf0) this.p;
                        this.f2344o = n87VarR;
                        this.n = true;
                        objM = kf0Var.m(this);
                        r1 = n87VarR;
                        if (objM == ne1Var6) {
                            return ne1Var6;
                        }
                    } else {
                        if (r1 != 1) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bp3 bp3Var = (bp3) this.f2344o;
                        ct1.a0(obj);
                        objM = obj;
                        r1 = bp3Var;
                    }
                    r1.j(null);
                    r10 = objM;
                    return r10;
                } catch (Throwable th) {
                    r1.j(r10);
                    throw th;
                }
            case 6:
                f88 f88Var = f88.a;
                ne1 ne1Var7 = ne1.m;
                boolean z8 = this.n;
                if (!z8) {
                    ct1.a0(obj);
                    l85 l85Var = (l85) this.f2344o;
                    h37 h37Var = (h37) this.p;
                    this.n = true;
                    Object objC = l85Var.q.c(h37Var, this);
                    if (objC != ne1Var7) {
                        objC = f88Var;
                    }
                    if (objC == ne1Var7) {
                        return ne1Var7;
                    }
                } else {
                    if (!z8) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 7:
                nx3 nx3Var = (nx3) this.p;
                AccountViewModelBase accountViewModelBase = (AccountViewModelBase) nx3Var.n;
                gt5 gt5Var = (gt5) this.f2344o;
                ne1 ne1Var8 = ne1.m;
                boolean z9 = this.n;
                if (!z9) {
                    ct1.a0(obj);
                    LoginState loginStateA = accountViewModelBase.a();
                    loginStateA.getClass();
                    gt5Var.b(r85.a[loginStateA.ordinal()] == 1 ? m51.m : m51.n);
                    k6 k6Var = new k6(gt5Var, nx3Var);
                    accountViewModelBase.b(k6Var);
                    vm3 vm3Var = new vm3(gt5Var, k6Var);
                    this.f2344o = null;
                    this.n = true;
                    if (xs1.u(gt5Var, vm3Var, this) == ne1Var8) {
                        return ne1Var8;
                    }
                } else {
                    if (!z9) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 8:
                ne1 ne1Var9 = ne1.m;
                boolean z10 = this.n;
                if (z10) {
                    if (z10) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                TextClassifier textClassifier = (TextClassifier) this.f2344o;
                if (textClassifier == null) {
                    return null;
                }
                hw2 hw2Var2 = (hw2) this.p;
                this.n = true;
                Object objInvoke = hw2Var2.invoke(textClassifier, this);
                return objInvoke == ne1Var9 ? ne1Var9 : objInvoke;
            case ep1.b /* 9 */:
                ne1 ne1Var10 = ne1.m;
                boolean z11 = this.n;
                if (!z11) {
                    ct1.a0(obj);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f2344o;
                    m84 m84Var = m84.f1446o;
                    ac acVar = new ac((kp5) this.p, z2 ? 1 : 0, b3);
                    this.n = true;
                    if (ds1.e0(lifecycleOwner, m84Var, acVar, this) == ne1Var10) {
                        return ne1Var10;
                    }
                } else {
                    if (!z11) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case ep1.c /* 10 */:
                final pn5 pn5Var = (pn5) this.p;
                SharedPreferences sharedPreferences = (SharedPreferences) pn5Var.m;
                final gt5 gt5Var2 = (gt5) this.f2344o;
                ne1 ne1Var11 = ne1.m;
                boolean z12 = this.n;
                if (!z12) {
                    ct1.a0(obj);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o.iq5
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                            pn5 pn5Var2 = pn5Var;
                            String str2 = (String) pn5Var2.n;
                            if (im3.n(str, str2)) {
                                gt5Var2.b(((iw2) pn5Var2.p).d((SharedPreferences) pn5Var2.m, str2, pn5Var2.f1752o));
                            }
                        }
                    };
                    gt5Var2.b(((iw2) pn5Var.p).d(sharedPreferences, (String) pn5Var.n, pn5Var.f1752o));
                    sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    ql1 ql1Var = new ql1(pn5Var, onSharedPreferenceChangeListener, (byte) 25);
                    this.f2344o = null;
                    this.n = true;
                    if (xs1.u(gt5Var2, ql1Var, this) == ne1Var11) {
                        return ne1Var11;
                    }
                } else {
                    if (!z12) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 11:
                ne1 ne1Var12 = ne1.m;
                boolean z13 = this.n;
                if (!z13) {
                    ct1.a0(obj);
                    ol5 ol5Var = ((tx5) this.f2344o).f2153o;
                    UUID uuid = (UUID) this.p;
                    this.n = true;
                    Object objF = ol5Var.f(uuid, this);
                    if (objF == ne1Var12) {
                        return ne1Var12;
                    }
                    obj2 = objF;
                } else {
                    if (!z13) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    obj2 = ((tc6) obj).m;
                }
                return new tc6(obj2);
            case ep1.d /* 12 */:
                ne1 ne1Var13 = ne1.m;
                boolean z14 = this.n;
                if (z14) {
                    if (z14) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                hw2 hw2Var3 = (hw2) this.f2344o;
                tb6 tb6Var = (tb6) this.p;
                this.n = true;
                Object objInvoke2 = hw2Var3.invoke(tb6Var, this);
                return objInvoke2 == ne1Var13 ? ne1Var13 : objInvoke2;
            case 13:
                ne1 ne1Var14 = ne1.m;
                boolean z15 = this.n;
                if (!z15) {
                    ct1.a0(obj);
                    km kmVar = ((RippleNode) this.f2344o).I;
                    Float f = new Float(0.0f);
                    jo joVar = (jo) this.p;
                    this.n = true;
                    if (km.a(kmVar, f, joVar, null, null, this, 12) == ne1Var14) {
                        return ne1Var14;
                    }
                } else {
                    if (!z15) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 14:
                ne1 ne1Var15 = ne1.m;
                boolean z16 = this.n;
                if (z16) {
                    if (z16) {
                        ct1.a0(obj);
                        return f88.a;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                me1 me1Var = (me1) this.f2344o;
                RippleNode rippleNode = (RippleNode) this.p;
                yx6 yx6Var = rippleNode.A.a;
                q5 q5Var = new q5(rippleNode, me1Var, b2);
                this.n = true;
                yx6.l(yx6Var, q5Var, this);
                return ne1Var15;
            case 15:
                ne1 ne1Var16 = ne1.m;
                boolean z17 = this.n;
                if (!z17) {
                    ct1.a0(obj);
                    q42 q42Var = (q42) this.f2344o;
                    float f2 = q42Var.b ? -1.0f : 1.0f;
                    yk6 yk6Var2 = ((sk6) this.p).d0;
                    long jF = nc8.f(f2, q42Var.a);
                    this.n = true;
                    if (yk6Var2.c(jF, false, this) == ne1Var16) {
                        return ne1Var16;
                    }
                } else {
                    if (!z17) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                f88 f88Var2 = f88.a;
                ne1 ne1Var17 = ne1.m;
                boolean z18 = this.n;
                if (!z18) {
                    ct1.a0(obj);
                    bn6 bn6Var = (bn6) this.f2344o;
                    h37 h37Var2 = (h37) this.p;
                    this.n = true;
                    Object objC2 = bn6Var.y.c(h37Var2, this);
                    if (objC2 != ne1Var17) {
                        objC2 = f88Var2;
                    }
                    if (objC2 == ne1Var17) {
                        return ne1Var17;
                    }
                } else {
                    if (!z18) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var2;
            case 17:
                bn6 bn6Var2 = (bn6) this.p;
                String str = (String) this.f2344o;
                ne1 ne1Var18 = ne1.m;
                boolean z19 = this.n;
                if (z19) {
                    if (z19) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                String string2 = ub7.x0(str).toString();
                bn6Var2.n.getClass();
                if (!BackendContainerAndroid.GetInstance().GetAccount().IsLoggedIn() || string2.length() == 0) {
                    ea2 ea2Var = ea2.m;
                    return new ml6(ea2Var, ea2Var, ea2Var);
                }
                this.f2344o = null;
                this.n = true;
                Object objJ0 = im3.j0(bn6Var2.r, new gy4(bn6Var2, string2, null), this);
                return objJ0 == ne1Var18 ? ne1Var18 : objJ0;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ne1 ne1Var19 = ne1.m;
                boolean z20 = this.n;
                if (!z20) {
                    ct1.a0(obj);
                    r36 r36Var = ((xr6) this.f2344o).u;
                    c5 c5Var = new c5((px4) this.p, (byte) 11);
                    this.n = true;
                    if (r36Var.m.b(c5Var, this) == ne1Var19) {
                        return ne1Var19;
                    }
                } else {
                    if (!z20) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ne1 ne1Var20 = ne1.m;
                boolean z21 = this.n;
                if (!z21) {
                    ct1.a0(obj);
                    yx6 yx6Var2 = ((xr6) this.f2344o).t;
                    d37 d37Var = (d37) this.p;
                    this.n = true;
                    if (yx6Var2.c(d37Var, this) == ne1Var20) {
                        return ne1Var20;
                    }
                } else {
                    if (!z21) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 20:
                ne1 ne1Var21 = ne1.m;
                boolean z22 = this.n;
                if (!z22) {
                    ct1.a0(obj);
                    r36 r36Var2 = ((su6) this.f2344o).w;
                    c5 c5Var2 = new c5((px4) this.p, (byte) 12);
                    this.n = true;
                    if (r36Var2.m.b(c5Var2, this) == ne1Var21) {
                        return ne1Var21;
                    }
                } else {
                    if (!z22) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 21:
                ne1 ne1Var22 = ne1.m;
                boolean z23 = this.n;
                if (!z23) {
                    ct1.a0(obj);
                    ul1 ul1Var = (ul1) this.f2344o;
                    yu7 yu7Var = kh.Q;
                    String str2 = (String) this.p;
                    this.n = true;
                    if (ul1Var.i(yu7Var, str2, this) == ne1Var22) {
                        return ne1Var22;
                    }
                } else {
                    if (!z23) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 22:
                o37 o37Var = (o37) this.f2344o;
                ne1 ne1Var23 = ne1.m;
                boolean z24 = this.n;
                if (!z24) {
                    ct1.a0(obj);
                    if (o37Var != null) {
                        g37 g37Var = o37Var.a.c;
                        u3 u3Var = (u3) this.p;
                        int iOrdinal = g37Var.ordinal();
                        long j2 = Long.MAX_VALUE;
                        if (iOrdinal == 0) {
                            j = 4000;
                        } else if (iOrdinal == 1) {
                            j = 10000;
                        } else {
                            if (iOrdinal != 2) {
                                gk0.s();
                                return null;
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (u3Var == null) {
                            j2 = j;
                        } else {
                            AccessibilityManager accessibilityManager = ((vf) u3Var).a;
                            if (j >= 2147483647L) {
                                j2 = j;
                            } else if (Build.VERSION.SDK_INT >= 29) {
                                int iH = eq.h(accessibilityManager, (int) j, 7);
                                if (iH != Integer.MAX_VALUE) {
                                    j2 = iH;
                                }
                            } else if (!accessibilityManager.isTouchExplorationEnabled()) {
                                j2 = j;
                            }
                        }
                        this.n = true;
                        if (im3.A(j2, this) == ne1Var23) {
                            return ne1Var23;
                        }
                    }
                    return f88.a;
                }
                if (!z24) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                o37Var.a();
                return f88.a;
            case 23:
                e67 e67Var = (e67) this.f2344o;
                l97 l97Var = e67Var.t;
                ne1 ne1Var24 = ne1.m;
                boolean z25 = this.n;
                if (!z25) {
                    ct1.a0(obj);
                    vv vvVar = e67Var.p;
                    String str3 = (String) this.p;
                    this.n = true;
                    objT = vvVar.t(str3, this);
                    if (objT == ne1Var24) {
                        return ne1Var24;
                    }
                } else {
                    if (!z25) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objT = ((tc6) obj).m;
                }
                if (!(objT instanceof sc6)) {
                    List<hu> list = (List) objT;
                    ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                    for (hu huVar : list) {
                        String str4 = huVar.c;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = huVar.d;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = huVar.a;
                        String str9 = str8 == null ? "" : str8;
                        String str10 = huVar.f;
                        arrayList.add(new v57(str5, str7, str9, (str10 == null || (string = ub7.x0(str10).toString()) == null) ? "" : string, huVar.e));
                    }
                    j67 j67Var = (j67) l97Var.getValue();
                    j67Var.getClass();
                    l97Var.l(null, j67.a(j67Var, true, arrayList));
                }
                Throwable thA = tc6.a(objT);
                if (thA != null) {
                    ye4.c("SolutionsFragmentViewModel", "Failed to retrieve apps screen content: " + thA.getMessage());
                    j67 j67Var2 = (j67) l97Var.getValue();
                    j67Var2.getClass();
                    l97Var.l(null, j67.a(j67Var2, false, ea2.m));
                }
                return f88.a;
            case 24:
                ne1 ne1Var25 = ne1.m;
                boolean z26 = this.n;
                try {
                    if (!z26) {
                        ct1.a0(obj);
                        Object obj3 = ((a65) this.f2344o).n;
                        oc7 oc7Var = (oc7) this.p;
                        synchronized (obj3) {
                            if (oc7Var.c == pc7.q) {
                                oc7Var.c = pc7.n;
                            }
                            break;
                        }
                        float fFloatValue = ((Number) vn4.j0.a().invoke(((oc7) this.p).b.c.f1284o)).floatValue();
                        ((oc7) this.p).b = ck3.a(0.0f);
                        km kmVar2 = ((oc7) this.p).b;
                        Float f3 = new Float(1.0f);
                        jo joVar2 = ((oc7) this.p).a;
                        Float f4 = new Float(fFloatValue);
                        this.n = true;
                        objA = km.a(kmVar2, f3, joVar2, f4, null, this, 8);
                        if (objA == ne1Var25) {
                            return ne1Var25;
                        }
                    } else {
                        if (!z26) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                        objA = obj;
                    }
                    ((a65) this.f2344o).m0();
                    return f88.a;
                } catch (Throwable th2) {
                    ((a65) this.f2344o).m0();
                    throw th2;
                }
            case 25:
                ne1 ne1Var26 = ne1.m;
                boolean z27 = this.n;
                if (z27) {
                    if (z27) {
                        ct1.a0(obj);
                        return f88.a;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ux4 ux4Var = ((wc7) this.f2344o).K;
                mw4 mw4Var = (mw4) this.p;
                this.n = true;
                f4 f4Var = new f4();
                f4 f4Var2 = new f4();
                f4 f4Var3 = new f4();
                rx4 rx4Var = ux4Var.c;
                rx4 rx4Var2 = ux4Var.c;
                rx4Var.a(1, false);
                rx4Var2.a(2, false);
                rx4Var2.a(4, false);
                yx6.l(mw4Var.a, new en0(f4Var, ux4Var, f4Var2, f4Var3, (byte) 5), this);
                return ne1Var26;
            case 26:
                ne1 ne1Var27 = ne1.m;
                boolean z28 = this.n;
                if (!z28) {
                    ct1.a0(obj);
                    r36 r36Var3 = ((jf3) this.f2344o).s;
                    yi yiVar3 = new yi((Function0) this.p, b);
                    this.n = true;
                    if (r36Var3.m.b(yiVar3, this) == ne1Var27) {
                        return ne1Var27;
                    }
                } else {
                    if (!z28) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 27:
                ne1 ne1Var28 = ne1.m;
                boolean z29 = this.n;
                if (!z29) {
                    ct1.a0(obj);
                    r36 r36Var4 = ((jf3) this.f2344o).w;
                    yi yiVar4 = new yi((Function1) this.p, (byte) 13);
                    this.n = true;
                    if (r36Var4.m.b(yiVar4, this) == ne1Var28) {
                        return ne1Var28;
                    }
                } else {
                    if (!z29) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 28:
                ne1 ne1Var29 = ne1.m;
                boolean z30 = this.n;
                if (z30) {
                    if (z30) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var3 = ((dg3) this.f2344o).p;
                yi yiVar5 = new yi((Activity) this.p, (byte) 14);
                this.n = true;
                yx6Var3.b(yiVar5, this);
                return ne1Var29;
            default:
                ne1 ne1Var30 = ne1.m;
                boolean z31 = this.n;
                if (z31) {
                    if (z31) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var4 = ((dg3) this.f2344o).q;
                yi yiVar6 = new yi((Context) this.p, (byte) 15);
                this.n = true;
                yx6Var4.b(yiVar6, this);
                return ne1Var30;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt4(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
    }
}
