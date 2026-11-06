package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1644o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa1(fw1 fw1Var, boolean z, px4 px4Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 10;
        this.f1644o = fw1Var;
        this.n = z;
        this.p = px4Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 0);
            case 1:
                return new oa1(this.n, (qa1) this.f1644o, (z31) obj2, hc1Var, (byte) 1);
            case 2:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 2);
            case 3:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 3);
            case 4:
                oa1 oa1Var = new oa1((List) obj2, hc1Var, (byte) 4);
                oa1Var.f1644o = obj;
                return oa1Var;
            case 5:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 5);
            case 6:
                oa1 oa1Var2 = new oa1((vh1) obj2, hc1Var, (byte) 6);
                oa1Var2.f1644o = obj;
                return oa1Var2;
            case 7:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 7);
            case 8:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new oa1((fw1) this.f1644o, this.n, (px4) obj2, hc1Var);
            case 11:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new oa1(this.n, (fx1) this.f1644o, (l33) obj2, hc1Var, (byte) 12);
            case 13:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 13);
            case 14:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 14);
            case 15:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 15);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new oa1(this.n, (Activity) this.f1644o, (px4) obj2, hc1Var, (byte) 16);
            case 17:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 17);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 18);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 19);
            case 20:
                oa1 oa1Var3 = new oa1((go2) obj2, hc1Var, (byte) 20);
                oa1Var3.f1644o = obj;
                return oa1Var3;
            case 21:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 21);
            case 22:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 22);
            case 23:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 23);
            case 24:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 24);
            case 25:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 25);
            case 26:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 26);
            case 27:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 27);
            case 28:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 28);
            default:
                return new oa1(this.f1644o, obj2, hc1Var, (byte) 29);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((oa1) create((dh1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((oa1) create((oq4) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 11:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 13:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 14:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 15:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 17:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 20:
                return ((oa1) create((gt5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 21:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 22:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 23:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 24:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 25:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 26:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 27:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 28:
                return ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                ((oa1) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        View view;
        byte b = this.m;
        boolean z = false;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        byte b2 = 1;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((qa1) this.f1644o).z.c((ChatConversationID) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                z31 z31Var = (z31) obj2;
                hs1 hs1Var = z31Var.m;
                ct1.a0(obj);
                boolean z3 = this.n;
                f41 f41Var = ((qa1) this.f1644o).p;
                if (z3) {
                    if (f41Var != null) {
                        f41.b(f41Var, z31Var.d, hs1Var, false, null, null, 56);
                    }
                } else if (f41Var != null) {
                    f41.e(f41Var, z31Var.d, hs1Var, false, null, null, 56);
                }
                return f88Var;
            case 2:
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                pr7 pr7Var = (pr7) this.f1644o;
                v65 v65Var = pr7Var.b;
                long j = pr7Var.l().b;
                int i = gt7.c;
                int iQ = v65Var.q((int) (j >> 32));
                j64 j64Var = pr7Var.d;
                ws7 ws7VarD = j64Var != null ? j64Var.d() : null;
                ws7VarD.getClass();
                vs7 vs7Var = ws7VarD.a;
                v56 v56VarC = vs7Var.c(ct1.v(iQ, 0, vs7Var.a.a.n.length()));
                this.n = true;
                return ((hb0) obj2).a(v56VarC, this) == ne1Var ? ne1Var : f88Var;
            case 3:
                boolean z5 = this.n;
                if (z5) {
                    if (z5) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                nn5 nn5Var = (nn5) this.f1644o;
                kd1 kd1Var = new kd1((pr7) obj2, b2);
                this.n = true;
                return un7.d(nn5Var, kd1Var, this) == ne1Var ? ne1Var : f88Var;
            case 4:
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    dh1 dh1Var = (dh1) this.f1644o;
                    this.n = true;
                    return ck3.A.r((List) obj2, dh1Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z6) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z7 = this.n;
                if (z7) {
                    if (z7) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                hw2 hw2Var = (hw2) this.f1644o;
                Object obj3 = ((qg1) obj2).b;
                this.n = true;
                Object objInvoke = hw2Var.invoke(obj3, this);
                return objInvoke == ne1Var ? ne1Var : objInvoke;
            case 6:
                boolean z8 = this.n;
                if (!z8) {
                    ct1.a0(obj);
                    oq4 oq4Var = (oq4) this.f1644o;
                    this.n = true;
                    return ((vh1) obj2).d(oq4Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z8) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z9 = this.n;
                if (z9) {
                    if (z9) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ((px4) obj2).setValue(null);
                hk6 hk6Var = (hk6) this.f1644o;
                this.n = true;
                return ds1.h0(hk6Var, (float) (0 - hk6Var.a.z()), this) == ne1Var ? ne1Var : f88Var;
            case 8:
                boolean z10 = this.n;
                if (!z10) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((ru1) this.f1644o).D.c((ChatConversationID) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z10) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.b /* 9 */:
                boolean z11 = this.n;
                if (!z11) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((ru1) this.f1644o).B.c((d37) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z11) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.c /* 10 */:
                ct1.a0(obj);
                fw1 fw1Var = (fw1) this.f1644o;
                if (!((Boolean) ((px4) obj2).getValue()).booleanValue() && !this.n) {
                    b2 = 0;
                }
                xt2 xt2VarC = fw1Var.C();
                ac3 ac3Var = xt2VarC instanceof ac3 ? (ac3) xt2VarC : null;
                if (ac3Var != null) {
                    MainActivity mainActivity = (MainActivity) ac3Var;
                    if (b2 != 0) {
                        mainActivity.c0(8);
                    } else {
                        mainActivity.c0(0);
                    }
                }
                return f88Var;
            case 11:
                boolean z12 = this.n;
                if (!z12) {
                    ct1.a0(obj);
                    ((Function0) this.f1644o).a();
                    this.n = true;
                    return ex1.e((ul1) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z12) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.d /* 12 */:
                ct1.a0(obj);
                if (this.n) {
                    fx1 fx1Var = (fx1) this.f1644o;
                    l33 l33Var = (l33) obj2;
                    l97 l97Var = fx1Var.t;
                    if (l97Var.getValue() == null) {
                        gw1 gw1Var = (gw1) fx1Var.n.getValue();
                        l97Var.l(null, new wy1(l33Var, gw1Var.a, gw1Var.b));
                    }
                }
                return f88Var;
            case 13:
                boolean z13 = this.n;
                if (z13) {
                    if (!z13) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                vx6 vx6Var = (vx6) this.f1644o;
                yi yiVar = new yi((ul1) obj2, (byte) 5);
                this.n = true;
                if (vx6Var.b(yiVar, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 14:
                boolean z14 = this.n;
                if (!z14) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((fx1) this.f1644o).r.c((lx1) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z14) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                boolean z15 = this.n;
                if (!z15) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((hz1) this.f1644o).B.c((d37) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z15) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                Activity activity = (Activity) this.f1644o;
                ct1.a0(obj);
                px4 px4Var = (px4) obj2;
                if (this.n) {
                    ac3 ac3Var2 = activity instanceof ac3 ? (ac3) activity : null;
                    if (ac3Var2 != null && (view = ((MainActivity) ac3Var2).V) != null && view.getVisibility() == 0) {
                        z = true;
                    }
                    px4Var.setValue(Boolean.valueOf(z));
                    et1.M(activity, true);
                } else if (((Boolean) px4Var.getValue()).booleanValue()) {
                    et1.M(activity, false);
                    px4Var.setValue(Boolean.FALSE);
                }
                return f88Var;
            case 17:
                boolean z16 = this.n;
                if (!z16) {
                    ct1.a0(obj);
                    this.n = true;
                    Object objInvoke2 = ((hw2) this.f1644o).invoke((Context) obj2, this);
                    return objInvoke2 == ne1Var ? ne1Var : objInvoke2;
                }
                if (z16) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                boolean z17 = this.n;
                if (z17) {
                    if (z17) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                sn2 sn2Var = (sn2) this.f1644o;
                pn2 pn2Var = (pn2) obj2;
                float f = pn2Var.a;
                float f2 = pn2Var.b;
                float f3 = pn2Var.d;
                float f4 = pn2Var.c;
                this.n = true;
                sn2Var.a = f;
                sn2Var.b = f2;
                sn2Var.c = f3;
                sn2Var.d = f4;
                Object objB = sn2Var.b(this);
                if (objB != ne1Var) {
                    objB = f88Var;
                }
                return objB == ne1Var ? ne1Var : f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                boolean z18 = this.n;
                if (!z18) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((sn2) this.f1644o).a((jl3) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z18) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                gt5 gt5Var = (gt5) this.f1644o;
                boolean z19 = this.n;
                if (z19) {
                    if (z19) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yi yiVar2 = new yi(gt5Var, (byte) 6);
                this.f1644o = null;
                this.n = true;
                return ((go2) obj2).b(yiVar2, this) == ne1Var ? ne1Var : f88Var;
            case 21:
                boolean z20 = this.n;
                if (z20) {
                    if (z20) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ArrayList arrayList = new ArrayList();
                yx6 yx6Var = ((mw4) this.f1644o).a;
                q5 q5Var = new q5(arrayList, (px4) obj2, (byte) 4);
                this.n = true;
                yx6.l(yx6Var, q5Var, this);
                return ne1Var;
            case 22:
                boolean z21 = this.n;
                if (!z21) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((f33) this.f1644o).u.L((l33) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z21) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                boolean z22 = this.n;
                if (z22) {
                    if (!z22) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var = ((e43) this.f1644o).t;
                c5 c5Var = new c5((px4) obj2, (byte) 10);
                this.n = true;
                if (r36Var.m.b(c5Var, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 24:
                boolean z23 = this.n;
                if (!z23) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((e43) this.f1644o).n.L((l33) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z23) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                boolean z24 = this.n;
                if (!z24) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((jf3) this.f1644o).t.c((f60) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z24) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                boolean z25 = this.n;
                if (!z25) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((tf3) this.f1644o).p.c((rf3) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z25) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                boolean z26 = this.n;
                if (z26) {
                    if (z26) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                z = ((g60) this.f1644o).a == 0;
                yx6 yx6Var2 = (yx6) ((cg3) obj2).f;
                Boolean boolValueOf = Boolean.valueOf(z);
                this.n = true;
                return yx6Var2.c(boolValueOf, this) == ne1Var ? ne1Var : f88Var;
            case 28:
                boolean z27 = this.n;
                if (!z27) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((dg3) this.f1644o).q.c((lx5) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z27) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z28 = this.n;
                if (z28) {
                    if (z28) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                um5.a((t54) this.f1644o, (bj) obj2, this);
                return ne1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa1(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa1(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1644o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa1(boolean z, Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = z;
        this.f1644o = obj;
        this.p = obj2;
    }
}
