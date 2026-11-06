package o;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfiguration;
import com.teamviewer.byoclib.ByocAliasAccessActivity;
import com.teamviewer.fcm.swig.PushNotificationRegistration;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1115o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(y31 y31Var, String str, hs1 hs1Var, boolean z, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 15;
        this.f1115o = y31Var;
        this.p = str;
        this.q = hs1Var;
        this.n = z;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 0);
            case 1:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 1);
            case 2:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 2);
            case 3:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 3);
            case 4:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 4);
            case 5:
                j0 j0Var = new j0((Function0) this.p, (hw2) obj2, hc1Var, (byte) 5);
                j0Var.f1115o = obj;
                return j0Var;
            case 6:
                j0 j0Var2 = new j0((iw2) this.p, (nf) obj2, hc1Var, (byte) 6);
                j0Var2.f1115o = obj;
                return j0Var2;
            case 7:
                j0 j0Var3 = new j0((jw2) this.p, (nf) obj2, hc1Var, (byte) 7);
                j0Var3.f1115o = obj;
                return j0Var3;
            case 8:
                j0 j0Var4 = new j0((u18) this.p, (px4) obj2, hc1Var, (byte) 8);
                j0Var4.f1115o = obj;
                return j0Var4;
            case ep1.b /* 9 */:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 10);
            case 11:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new j0((Context) this.p, (String) obj2, hc1Var, (byte) 12);
            case 13:
                j0 j0Var5 = new j0((ho2) this.p, (ym0) obj2, hc1Var, (byte) 13);
                j0Var5.f1115o = obj;
                return j0Var5;
            case 14:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 14);
            case 15:
                return new j0((y31) this.f1115o, (String) this.p, (hs1) obj2, this.n, hc1Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new j0((k76) this.p, (ko5) obj2, hc1Var, (byte) 16);
            case 17:
                return new j0((px4) this.p, (px4) obj2, hc1Var, (byte) 17);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 18);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new j0(this.n, (h71) this.f1115o, (px4) this.p, (px4) obj2, hc1Var);
            case 20:
                j0 j0Var6 = new j0((vh1) this.p, (hw2) obj2, hc1Var, (byte) 20);
                j0Var6.f1115o = obj;
                return j0Var6;
            case 21:
                j0 j0Var7 = new j0((wk1) this.p, (hw2) obj2, hc1Var, (byte) 21);
                j0Var7.f1115o = obj;
                return j0Var7;
            case 22:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 22);
            case 23:
                return new j0((px4) this.p, (px4) obj2, hc1Var, (byte) 23);
            case 24:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 24);
            case 25:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 25);
            case 26:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 26);
            case 27:
                return new j0(this.f1115o, this.p, obj2, hc1Var, (byte) 27);
            case 28:
                j0 j0Var8 = new j0((Context) obj2, hc1Var);
                j0Var8.p = obj;
                return j0Var8;
            default:
                j0 j0Var9 = new j0((mw4) this.f1115o, (sn2) obj2, hc1Var);
                j0Var9.p = obj;
                return j0Var9;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 2:
                ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 3:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((j0) create((uj1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((j0) create((vd5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((j0) create((ft5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 11:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 13:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 14:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 15:
                ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 17:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 20:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 21:
                return ((j0) create((dk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 22:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 23:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 24:
                ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 25:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 26:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 27:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 28:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((j0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0449  */
    /* JADX WARN: Code duplicated, block: B:194:0x0453  */
    /* JADX WARN: Code duplicated, block: B:204:0x0473  */
    /* JADX WARN: Code duplicated, block: B:292:0x0647  */
    /* JADX WARN: Code duplicated, block: B:331:0x0721  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objJ;
        Object objQ;
        qx0 qx0Var;
        Object objH;
        k76 k76Var;
        Object objA;
        String str;
        is1 is1Var;
        Object objU;
        Object value;
        wt1 wt1VarA;
        Object objJ0;
        Object objH2;
        PushNotificationRegistration pushNotificationRegistration;
        byte b = 10;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.m) {
            case 0:
                ne1 ne1Var = ne1.m;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    mw4 mw4Var = (mw4) this.f1115o;
                    xr5 xr5Var = (xr5) this.p;
                    this.n = true;
                    if (mw4Var.a(xr5Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                t22 t22Var = (t22) this.q;
                if (t22Var != null) {
                    t22Var.a();
                }
                return f88.a;
            case 1:
                ne1 ne1Var2 = ne1.m;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    r36 r36Var = ((p9) this.f1115o).s;
                    h9 h9Var = new h9((Function0) this.p, (px4) this.q, (byte) 0);
                    this.n = true;
                    if (r36Var.m.b(h9Var, this) == ne1Var2) {
                        return ne1Var2;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 2:
                ne1 ne1Var3 = ne1.m;
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    r36 r36Var2 = ((vb) this.f1115o).x;
                    wa waVar = new wa((px4) this.p, (px4) this.q, b3);
                    this.n = true;
                    if (r36Var2.m.b(waVar, this) == ne1Var3) {
                        return ne1Var3;
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
            case 3:
                vb vbVar = (vb) this.f1115o;
                l97 l97Var = vbVar.u;
                ne1 ne1Var4 = ne1.m;
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    ol5 ol5Var = vbVar.p;
                    String str2 = ((ib) l97Var.getValue()).c;
                    List listA1 = vb.a1((ib) l97Var.getValue());
                    int accountId = ((Account) this.p).getAccountId();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    RolloutConfiguration rolloutConfiguration = (RolloutConfiguration) this.q;
                    RolloutConfiguration rolloutConfigurationCopy = rolloutConfiguration.copy((48957 & 1) != 0 ? rolloutConfiguration.accountManagerIds : null, (48957 & 2) != 0 ? rolloutConfiguration.sharedStateChainIds : listA1, (48957 & 4) != 0 ? rolloutConfiguration.name : null, (48957 & 8) != 0 ? rolloutConfiguration.rolloutConfigurationId : null, (48957 & 16) != 0 ? rolloutConfiguration.companyManagerIds : null, (48957 & 32) != 0 ? rolloutConfiguration.deploymentString : null, (48957 & 64) != 0 ? rolloutConfiguration.lastEditedAt : new Long(jCurrentTimeMillis), (48957 & 128) != 0 ? rolloutConfiguration.lastEditedBy : new Integer(accountId), (48957 & 256) != 0 ? rolloutConfiguration.inheritPolicySharedStateChainId : null, (48957 & 512) != 0 ? rolloutConfiguration.containsEncryptedData : null, (48957 & 1024) != 0 ? rolloutConfiguration.userGroupManagerIds : null, (48957 & 2048) != 0 ? rolloutConfiguration.accountManagersWithPermissions : null, (48957 & 4096) != 0 ? rolloutConfiguration.userGroupManagersWithPermissions : null, (48957 & 8192) != 0 ? rolloutConfiguration.isPermissionsInheritanceAllowed : null, (48957 & 16384) != 0 ? rolloutConfiguration.deviceName : str2, (48957 & 32768) != 0 ? rolloutConfiguration.creationType : null);
                    this.n = true;
                    objJ = ol5Var.j(rolloutConfigurationCopy, this);
                    if (objJ == ne1Var4) {
                        return ne1Var4;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objJ = ((tc6) obj).m;
                }
                Throwable thA = tc6.a(objJ);
                if (thA == null) {
                    ye4.a("AddRemoteDeviceViewModel", "Rollout configuration with id : " + ((RolloutConfiguration) objJ).getRolloutConfigurationId() + " updated");
                } else {
                    e41.s("Failed to update rollout configuration: ", thA.getMessage(), "AddRemoteDeviceViewModel");
                    List list = vb.D;
                    vbVar.b1();
                }
                return f88.a;
            case 4:
                ne1 ne1Var5 = ne1.m;
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    hw2 hw2Var = (hw2) this.f1115o;
                    Object obj2 = this.p;
                    this.n = true;
                    if (hw2Var.invoke(obj2, this) == ne1Var5) {
                        return ne1Var5;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hm3.f((me1) this.q, new ue());
                return f88.a;
            case 5:
                ne1 ne1Var6 = ne1.m;
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    me1 me1Var = (me1) this.f1115o;
                    k76 k76Var2 = new k76();
                    ih1 ih1VarN = g57.n((Function0) this.p);
                    af afVar = new af(k76Var2, me1Var, (hw2) this.q, b3);
                    this.n = true;
                    if (ih1VarN.b(afVar, this) == ne1Var6) {
                        return ne1Var6;
                    }
                } else {
                    if (!z6) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 6:
                ne1 ne1Var7 = ne1.m;
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    uj1 uj1Var = (uj1) this.f1115o;
                    iw2 iw2Var = (iw2) this.p;
                    mf mfVar = (mf) ((nf) this.q).k;
                    this.n = true;
                    if (iw2Var.d(mfVar, uj1Var, this) == ne1Var7) {
                        return ne1Var7;
                    }
                } else {
                    if (!z7) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 7:
                ne1 ne1Var8 = ne1.m;
                boolean z8 = this.n;
                if (!z8) {
                    ct1.a0(obj);
                    vd5 vd5Var = (vd5) this.f1115o;
                    uj1 uj1Var2 = (uj1) vd5Var.m;
                    Object obj3 = vd5Var.n;
                    jw2 jw2Var = (jw2) this.p;
                    mf mfVar2 = (mf) ((nf) this.q).k;
                    this.n = true;
                    if (jw2Var.i(mfVar2, uj1Var2, obj3, this) == ne1Var8) {
                        return ne1Var8;
                    }
                } else {
                    if (!z8) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 8:
                u18 u18Var = (u18) this.p;
                ne1 ne1Var9 = ne1.m;
                boolean z9 = this.n;
                if (!z9) {
                    ct1.a0(obj);
                    ft5 ft5Var = (ft5) this.f1115o;
                    ih1 ih1VarN2 = g57.n(new io.sentry.android.replay.a0(u18Var, (byte) 7));
                    af afVar2 = new af(ft5Var, u18Var, (px4) this.q, b4);
                    this.n = true;
                    if (ih1VarN2.b(afVar2, this) == ne1Var9) {
                        return ne1Var9;
                    }
                } else {
                    if (!z9) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case ep1.b /* 9 */:
                wq2 wq2Var = (wq2) this.f1115o;
                k08 k08Var = (k08) this.q;
                px4 px4Var = (px4) this.p;
                ne1 ne1Var10 = ne1.m;
                boolean z10 = this.n;
                if (!z10) {
                    ct1.a0(obj);
                    if (wq2Var.b()) {
                        px4Var.setValue(Boolean.TRUE);
                        ay4 ay4Var = ay4.f374o;
                        this.n = true;
                        if (k08Var.c(ay4Var, this) == ne1Var10) {
                            return ne1Var10;
                        }
                    }
                } else {
                    if (!z10) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                if (((Boolean) px4Var.getValue()).booleanValue() && k08Var.b() && !wq2Var.b()) {
                    px4Var.setValue(Boolean.FALSE);
                    k08Var.a();
                }
                return f88.a;
            case ep1.c /* 10 */:
                ne1 ne1Var11 = ne1.m;
                boolean z11 = this.n;
                if (!z11) {
                    ct1.a0(obj);
                    g80 g80Var = (g80) this.f1115o;
                    y yVar = new y((k76) this.p, (byte) 14);
                    d80 d80Var = new d80((Context) this.q, (byte) 0);
                    this.n = true;
                    if (g80Var.W0(yVar, d80Var, this) == ne1Var11) {
                        return ne1Var11;
                    }
                } else {
                    if (!z11) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 11:
                f88 f88Var = f88.a;
                kb0 kb0Var = (kb0) this.f1115o;
                ne1 ne1Var12 = ne1.m;
                boolean z12 = this.n;
                if (!z12) {
                    ct1.a0(obj);
                    cb1 cb1Var = kb0Var.A;
                    jb0 jb0Var = new jb0(kb0Var, (e45) this.p, (x8) this.q);
                    this.n = true;
                    cb1Var.getClass();
                    v56 v56Var = (v56) jb0Var.a();
                    if (v56Var == null || cb1.W0(cb1Var, v56Var, 0L, 0L, 3)) {
                        objQ = f88Var;
                    } else {
                        gl0 gl0Var = new gl0(1, vt1.A(this));
                        gl0Var.t();
                        za1 za1Var = new za1(jb0Var, gl0Var);
                        eb0 eb0Var = cb1Var.F;
                        xx4 xx4Var = eb0Var.a;
                        v56 v56Var2 = (v56) jb0Var.a();
                        if (v56Var2 == null) {
                            gl0Var.resumeWith(f88Var);
                        } else {
                            gl0Var.v(new g0(eb0Var, za1Var, (byte) 18));
                            yk3 yk3VarB0 = ct1.b0(0, xx4Var.f2559o);
                            int i = yk3VarB0.m;
                            int i2 = yk3VarB0.n;
                            if (i <= i2) {
                                while (true) {
                                    v56 v56Var3 = (v56) ((za1) xx4Var.m[i2]).a.a();
                                    if (v56Var3 != null) {
                                        v56 v56VarE = v56Var2.e(v56Var3);
                                        if (v56VarE.equals(v56Var2)) {
                                            xx4Var.a(i2 + 1, za1Var);
                                        } else if (!v56VarE.equals(v56Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i3 = xx4Var.f2559o - 1;
                                            if (i3 <= i2) {
                                                while (true) {
                                                    ((za1) xx4Var.m[i2]).b.f(cancellationException);
                                                    if (i3 != i2) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i2 != i) {
                                        i2--;
                                    } else {
                                        xx4Var.a(0, za1Var);
                                    }
                                }
                            } else {
                                xx4Var.a(0, za1Var);
                            }
                            if (!cb1Var.I) {
                                cb1Var.X0(0L);
                            }
                        }
                        objQ = gl0Var.q();
                        if (objQ != ne1Var12) {
                            objQ = f88Var;
                        }
                    }
                    if (objQ == ne1Var12) {
                        return ne1Var12;
                    }
                } else {
                    if (!z12) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case ep1.d /* 12 */:
                ne1 ne1Var13 = ne1.m;
                boolean z13 = this.n;
                if (!z13) {
                    ct1.a0(obj);
                    qx0 qx0VarE = pm8.e();
                    yg0 yg0Var = yg0.a;
                    yg0.c = qx0VarE;
                    Intent intent = new Intent((Context) this.p, (Class<?>) ByocAliasAccessActivity.class);
                    String str3 = (String) this.q;
                    intent.addFlags(268435456);
                    intent.putExtra("configured_alias", str3);
                    ((Context) this.p).startActivity(intent);
                    try {
                        this.f1115o = qx0VarE;
                        this.n = true;
                        objH = qx0VarE.h(this);
                        if (objH == ne1Var13) {
                            return ne1Var13;
                        }
                        qx0Var = qx0VarE;
                    } catch (Throwable th) {
                        th = th;
                        qx0Var = qx0VarE;
                        if (yg0.c == qx0Var) {
                            yg0 yg0Var2 = yg0.a;
                            yg0.c = null;
                        }
                        throw th;
                    }
                } else {
                    if (!z13) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qx0Var = (qx0) this.f1115o;
                    try {
                        ct1.a0(obj);
                        objH = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        if (yg0.c == qx0Var) {
                            yg0 yg0Var3 = yg0.a;
                            yg0.c = null;
                        }
                        throw th;
                    }
                }
                String str4 = (String) objH;
                if (yg0.c == qx0Var) {
                    yg0 yg0Var4 = yg0.a;
                    yg0.c = null;
                }
                return str4;
            case 13:
                f88 f88Var2 = f88.a;
                me1 me1Var2 = (me1) this.f1115o;
                ne1 ne1Var14 = ne1.m;
                boolean z14 = this.n;
                if (!z14) {
                    ct1.a0(obj);
                    ho2 ho2Var = (ho2) this.p;
                    wm0 wm0VarI = ((ym0) this.q).i(me1Var2);
                    this.f1115o = null;
                    this.n = true;
                    Object objR = vt1.r(ho2Var, wm0VarI, true, this);
                    if (objR != ne1Var14) {
                        objR = f88Var2;
                    }
                    if (objR == ne1Var14) {
                        return ne1Var14;
                    }
                } else {
                    if (!z14) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var2;
            case 14:
                y21 y21Var = (y21) this.f1115o;
                f88 f88Var3 = f88.a;
                ne1 ne1Var15 = ne1.m;
                boolean z15 = this.n;
                if (!z15) {
                    ct1.a0(obj);
                    ClipData clipDataNewPlainText = ClipData.newPlainText(y21Var.I(R.string.no_browser_snackbar_button), y21Var.I(R.string.tv_url_download_mobile_apps_web_page));
                    au0 au0Var = (au0) this.p;
                    clipDataNewPlainText.getClass();
                    this.n = true;
                    ((gg) au0Var).a.F().setPrimaryClip(clipDataNewPlainText);
                    if (f88Var3 == ne1Var15) {
                        return ne1Var15;
                    }
                } else {
                    if (!z15) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                ((Function0) this.q).a();
                return f88Var3;
            case 15:
                ct1.a0(obj);
                y31 y31Var = (y31) this.f1115o;
                f41.e(y31Var.t, (String) this.p, (hs1) this.q, this.n, new n21(y31Var, b), null, 48);
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ne1 ne1Var16 = ne1.m;
                boolean z16 = this.n;
                if (!z16) {
                    ct1.a0(obj);
                    k76Var = (k76) this.p;
                    ko5 ko5Var = (ko5) this.q;
                    this.f1115o = k76Var;
                    this.n = true;
                    objA = ko5Var.a(this);
                    if (objA == ne1Var16) {
                        return ne1Var16;
                    }
                } else {
                    if (!z16) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k76 k76Var3 = (k76) this.f1115o;
                    ct1.a0(obj);
                    k76Var = k76Var3;
                    objA = obj;
                }
                k76Var.m = objA;
                return f88.a;
            case 17:
                px4 px4Var2 = (px4) this.q;
                f88 f88Var4 = f88.a;
                px4 px4Var3 = (px4) this.p;
                ne1 ne1Var17 = ne1.m;
                boolean z17 = this.n;
                if (!z17) {
                    ct1.a0(obj);
                    String str5 = (String) px4Var3.getValue();
                    if (str5 != null) {
                        h31 h31Var = new h31(b2);
                        this.f1115o = str5;
                        this.n = true;
                        if (qs1.O(getContext()).a(h31Var, this) == ne1Var17) {
                            return ne1Var17;
                        }
                        str = str5;
                    }
                    return f88Var4;
                }
                if (!z17) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.f1115o;
                ct1.a0(obj);
                if (im3.n((String) px4Var2.getValue(), str)) {
                    px4Var2.setValue(null);
                }
                px4Var3.setValue(null);
                return f88Var4;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ne1 ne1Var18 = ne1.m;
                boolean z18 = this.n;
                if (!z18) {
                    ct1.a0(obj);
                    r36 r36Var3 = ((n81) this.f1115o).F;
                    wa waVar2 = new wa((px4) this.p, (px4) this.q, b4);
                    this.n = true;
                    if (r36Var3.m.b(waVar2, this) == ne1Var18) {
                        return ne1Var18;
                    }
                } else {
                    if (!z18) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                px4 px4Var4 = (px4) this.p;
                h71 h71Var = (h71) this.f1115o;
                px4 px4Var5 = (px4) this.q;
                f88 f88Var5 = f88.a;
                ct1.a0(obj);
                if (this.n) {
                    List list2 = ((ka1) px4Var5.getValue()).b;
                    Integer num = h71Var != null ? new Integer(h71Var.m) : null;
                    if (num != null) {
                        List list3 = ((ka1) px4Var5.getValue()).a;
                        if (list3 == null || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (((h71) it.next()).m == num.intValue()) {
                                    if (list2.isEmpty()) {
                                        ((Function1) px4Var4.getValue()).invoke(null);
                                    } else if (h71Var != null) {
                                        ((Function1) px4Var4.getValue()).invoke(lv0.m0(list2));
                                    } else {
                                        ((Function1) px4Var4.getValue()).invoke(lv0.m0(list2));
                                    }
                                }
                            }
                        }
                    } else if (list2.isEmpty()) {
                        ((Function1) px4Var4.getValue()).invoke(null);
                    } else if (h71Var != null || list2.isEmpty()) {
                        ((Function1) px4Var4.getValue()).invoke(lv0.m0(list2));
                    } else {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((h71) it2.next()).m == h71Var.m) {
                            }
                        }
                        ((Function1) px4Var4.getValue()).invoke(lv0.m0(list2));
                    }
                }
                return f88Var5;
            case 20:
                vh1 vh1Var = (vh1) this.p;
                ne1 ne1Var19 = ne1.m;
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
                me1 me1Var3 = (me1) this.f1115o;
                qx0 qx0VarE2 = pm8.e();
                oq4 oq4Var = new oq4((hw2) this.q, qx0VarE2, vh1Var.h.b(), me1Var3.getCoroutineContext());
                pn5 pn5Var = vh1Var.l;
                Object objB = ((kf0) pn5Var.f1752o).b(oq4Var);
                if (objB instanceof hn0) {
                    Throwable th3 = ((hn0) objB).a;
                    if (th3 == null) {
                        throw new ju0("Channel was closed normally");
                    }
                    throw th3;
                }
                if (objB instanceof in0) {
                    hk0.l("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((df6) pn5Var.p).n).getAndIncrement() == 0) {
                    im3.R((me1) pn5Var.m, null, null, new ff(pn5Var, objArr == true ? 1 : 0, b), 3);
                }
                this.n = true;
                Object objH3 = qx0VarE2.h(this);
                return objH3 == ne1Var19 ? ne1Var19 : objH3;
            case 21:
                bg5 bg5Var = ((wk1) this.p).d;
                ne1 ne1Var20 = ne1.m;
                boolean z20 = this.n;
                try {
                    if (!z20) {
                        ct1.a0(obj);
                        dk6 dk6Var = (dk6) this.f1115o;
                        bg5Var.setValue(Boolean.TRUE);
                        hw2 hw2Var2 = (hw2) this.q;
                        this.n = true;
                        if (hw2Var2.invoke(dk6Var, this) == ne1Var20) {
                            return ne1Var20;
                        }
                    } else {
                        if (!z20) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    bg5Var.setValue(Boolean.FALSE);
                    return f88.a;
                } catch (Throwable th4) {
                    bg5Var.setValue(Boolean.FALSE);
                    throw th4;
                }
            case 22:
                ne1 ne1Var21 = ne1.m;
                boolean z21 = this.n;
                if (!z21) {
                    ct1.a0(obj);
                    wk1 wk1Var = (wk1) this.f1115o;
                    iy4 iy4Var = wk1Var.c;
                    vk1 vk1Var = wk1Var.b;
                    ay4 ay4Var2 = (ay4) this.p;
                    j0 j0Var = new j0(wk1Var, (hw2) this.q, objArr2 == true ? 1 : 0, (byte) 21);
                    this.n = true;
                    iy4Var.getClass();
                    if (hm3.j(new hy4(ay4Var2, iy4Var, j0Var, vk1Var, null), this) == ne1Var21) {
                        return ne1Var21;
                    }
                } else {
                    if (!z21) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
            case 23:
                px4 px4Var6 = (px4) this.q;
                f88 f88Var6 = f88.a;
                px4 px4Var7 = (px4) this.p;
                ne1 ne1Var22 = ne1.m;
                boolean z22 = this.n;
                if (!z22) {
                    ct1.a0(obj);
                    is1 is1Var2 = (is1) px4Var7.getValue();
                    if (is1Var2 != null) {
                        h31 h31Var2 = new h31((byte) 22);
                        this.f1115o = is1Var2;
                        this.n = true;
                        if (qs1.O(getContext()).a(h31Var2, this) == ne1Var22) {
                            return ne1Var22;
                        }
                        is1Var = is1Var2;
                    }
                    return f88Var6;
                }
                if (!z22) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                is1Var = (is1) this.f1115o;
                ct1.a0(obj);
                if (((is1) px4Var6.getValue()) == is1Var) {
                    px4Var6.setValue(null);
                }
                px4Var7.setValue(null);
                return f88Var6;
            case 24:
                ne1 ne1Var23 = ne1.m;
                boolean z23 = this.n;
                if (!z23) {
                    ct1.a0(obj);
                    r36 r36Var4 = ((ru1) this.f1115o).I;
                    wa waVar3 = new wa((px4) this.p, (px4) this.q, b2);
                    this.n = true;
                    if (r36Var4.m.b(waVar3, this) == ne1Var23) {
                        return ne1Var23;
                    }
                } else {
                    if (!z23) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                hk0.b();
                return null;
            case 25:
                Set set = (Set) this.p;
                ru1 ru1Var = (ru1) this.f1115o;
                ne1 ne1Var24 = ne1.m;
                boolean z24 = this.n;
                if (!z24) {
                    ct1.a0(obj);
                    this.n = true;
                    objU = ru1Var.T.u(set, this);
                    if (objU == ne1Var24) {
                        return ne1Var24;
                    }
                } else {
                    if (!z24) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objU = obj;
                }
                Set set2 = (Set) objU;
                l97 l97Var2 = ru1Var.z;
                du1 du1Var = (du1) this.q;
                do {
                    value = l97Var2.getValue();
                    wt1VarA = (wt1) value;
                    if (im3.n(ru1Var.R, du1Var) && fv6.Z(wt1VarA.f2442o, ru1Var.S).equals(set)) {
                        wt1VarA = wt1.a(wt1VarA, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, set2, false, null, null, false, false, false, 16383999);
                    }
                } while (!l97Var2.j(value, wt1VarA));
                return f88.a;
            case 26:
                ru1 ru1Var2 = (ru1) this.f1115o;
                ne1 ne1Var25 = ne1.m;
                boolean z25 = this.n;
                if (!z25) {
                    ct1.a0(obj);
                    this.n = true;
                    objJ0 = im3.j0(ru1Var2.x, new pt1(ru1Var2, (hc1) (objArr3 == true ? 1 : 0), b2), this);
                    if (objJ0 == ne1Var25) {
                        return ne1Var25;
                    }
                } else {
                    if (!z25) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objJ0 = obj;
                }
                String str6 = (String) objJ0;
                d31 d31Var = ru1Var2.f1953o;
                ns1 ns1Var = (ns1) this.p;
                String str7 = (String) this.q;
                RemoteControlApplication remoteControlApplication = d31Var.a;
                ns1Var.getClass();
                ShortcutManager shortcutManager = (ShortcutManager) d31Var.a.getSystemService(ShortcutManager.class);
                if (shortcutManager != null) {
                    String str8 = ns1Var.b;
                    long jIntValue = ns1Var.a;
                    if (ub7.b0(str8)) {
                        str8 = null;
                    }
                    if (str8 == null) {
                        str8 = str7;
                    }
                    ShortcutInfo.Builder icon = new ShortcutInfo.Builder(remoteControlApplication, str7).setShortLabel(str8).setLongLabel(str8).setIcon(Icon.createWithResource(remoteControlApplication, R.drawable.home_screen_shortcut_device_logo));
                    Uri uri = Uri.parse("tvshortcut://openshortcut");
                    uri.getClass();
                    Intent intentPutExtra = new Intent("android.intent.action.VIEW", uri).putExtra("IS_SHORTCUT", true).putExtra("KEY_ACCOUNTNAME", str6).putExtra("SHORTCUT_DYNGATE_ID", jIntValue);
                    UUID uuid = ns1Var.v;
                    if (uuid == null || intentPutExtra.putExtra("MDV2_MANAGEMENT_ID", uuid.toString()) == null) {
                        Integer num2 = ns1Var.d;
                        if (num2 != null) {
                            jIntValue = num2.intValue();
                        }
                        intentPutExtra.putExtra("MEMBER_ID", jIntValue).getClass();
                    }
                    Intent intentAddFlags = intentPutExtra.addFlags(67108864).addFlags(268435456);
                    intentAddFlags.getClass();
                    ShortcutInfo shortcutInfoBuild = icon.setIntent(intentAddFlags).build();
                    shortcutInfoBuild.getClass();
                    Intent intentCreateShortcutResultIntent = shortcutManager.createShortcutResultIntent(shortcutInfoBuild);
                    PendingIntent broadcast = intentCreateShortcutResultIntent != null ? PendingIntent.getBroadcast(remoteControlApplication, 1, intentCreateShortcutResultIntent, 67108864) : null;
                    shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast != null ? broadcast.getIntentSender() : null);
                }
                return f88.a;
            case 27:
                ne1 ne1Var26 = ne1.m;
                boolean z26 = this.n;
                if (!z26) {
                    ct1.a0(obj);
                    hl4 hl4Var = ((ru1) this.f1115o).r;
                    UUID uuid2 = (UUID) this.p;
                    List list4 = (List) this.q;
                    this.n = true;
                    objH2 = ((xl4) hl4Var).h(uuid2, list4, this);
                    if (objH2 == ne1Var26) {
                        return ne1Var26;
                    }
                } else {
                    if (!z26) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objH2 = ((tc6) obj).m;
                }
                return new tc6(objH2);
            case 28:
                f88 f88Var7 = f88.a;
                ne1 ne1Var27 = ne1.m;
                boolean z27 = this.n;
                try {
                    if (!z27) {
                        ct1.a0(obj);
                        PushNotificationRegistration pushNotificationRegistrationB = zh2.a.b();
                        if (pushNotificationRegistrationB == null) {
                            ye4.c("FcmToken", "Could not create PushNotificationRegistration");
                        } else if (FirebaseApp.getApps((Context) this.q).isEmpty()) {
                            ye4.c("FcmToken", "FirebaseApp is not initialized");
                        } else {
                            bo7 bo7VarUnregister = FirebaseMessaging.getInstance().unregister();
                            bo7VarUnregister.getClass();
                            this.p = null;
                            this.f1115o = pushNotificationRegistrationB;
                            this.n = true;
                            if (y57.i(bo7VarUnregister, this) == ne1Var27) {
                                return ne1Var27;
                            }
                            pushNotificationRegistration = pushNotificationRegistrationB;
                        }
                        return f88Var7;
                    }
                    if (!z27) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pushNotificationRegistration = (PushNotificationRegistration) this.f1115o;
                    ct1.a0(obj);
                    pushNotificationRegistration.DestroyPushNotificationRegistration();
                    ye4.a("FcmToken", "Push notification unregistered");
                    break;
                } catch (Exception e) {
                    ye4.c("FcmToken", "Push notification de-registration failed.");
                    ye4.d("FcmToken", e);
                }
                return f88Var7;
            default:
                ne1 ne1Var28 = ne1.m;
                boolean z28 = this.n;
                if (z28) {
                    if (z28) {
                        ct1.a0(obj);
                        return f88.a;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                me1 me1Var4 = (me1) this.p;
                ArrayList arrayList = new ArrayList();
                yx6 yx6Var = ((mw4) this.f1115o).a;
                af afVar3 = new af(arrayList, me1Var4, (sn2) this.q, (byte) 5);
                this.n = true;
                yx6.l(yx6Var, afVar3, this);
                return ne1Var28;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1115o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 28;
        this.q = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(mw4 mw4Var, sn2 sn2Var, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 29;
        this.f1115o = mw4Var;
        this.q = sn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(boolean z, h71 h71Var, px4 px4Var, px4 px4Var2, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 19;
        this.n = z;
        this.f1115o = h71Var;
        this.p = px4Var;
        this.q = px4Var2;
    }
}
