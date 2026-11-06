package o;

import androidx.compose.material3.internal.ripple.RippleNode;
import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.account.models.AccountRights;
import com.teamviewer.apidefinitions.account.models.CompanyPermission;
import com.teamviewer.apidefinitions.contacts.models.CreatePersonalInvitationResult;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitation;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceMeta;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.ConditionalAccessAuthenticationResponseFeedbackActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2567o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2567o = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = 2;
        switch (this.m) {
            case 0:
                return new y0((a1) this.f2567o, hc1Var, (byte) 0);
            case 1:
                return new y0((c1) this.f2567o, hc1Var, (byte) 1);
            case 2:
                return new y0((p9) this.f2567o, hc1Var, b);
            case 3:
                return new y0((vb) this.f2567o, hc1Var, (byte) 3);
            case 4:
                return new y0((RemoteControlApplication) this.f2567o, hc1Var, (byte) 4);
            case 5:
                return new y0((km) this.f2567o, hc1Var, (byte) 5);
            case 6:
                return new y0((zd0) this.f2567o, hc1Var, (byte) 6);
            case 7:
                return new y0((ce0) this.f2567o, hc1Var, (byte) 7);
            case 8:
                return new y0((ConditionalAccessAuthenticationResponseFeedbackActivity) this.f2567o, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new y0((y21) this.f2567o, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new y0((vh1) this.f2567o, hc1Var, (byte) 10);
            case 11:
                return new y0((sj1) this.f2567o, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new y0((yr1) this.f2567o, hc1Var, (byte) 12);
            case 13:
                return new y0((yo2) this.f2567o, hc1Var, (byte) 13);
            case 14:
                return new y0((fr2) this.f2567o, hc1Var, (byte) 14);
            case 15:
                return new y0((iw7) this.f2567o, hc1Var, (byte) 15);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new y0((zf3) this.f2567o, hc1Var, (byte) 16);
            case 17:
                return new y0((cg3) this.f2567o, hc1Var, (byte) 17);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new y0((dg3) this.f2567o, hc1Var, (byte) 18);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new y0((wm3) this.f2567o, hc1Var, (byte) 19);
            case 20:
                return new y0((yt2) this.f2567o, hc1Var, (byte) 20);
            case 21:
                return new y0((qb3) this.f2567o, hc1Var, (byte) 21);
            case 22:
                return new y0((nu4) this.f2567o, hc1Var, (byte) 22);
            case 23:
                y0 y0Var = new y0(b, hc1Var);
                y0Var.f2567o = obj;
                return y0Var;
            case 24:
                return new y0((go2) this.f2567o, hc1Var, (byte) 24);
            case 25:
                return new y0((RippleNode) this.f2567o, hc1Var, (byte) 25);
            case 26:
                return new y0((qx0) this.f2567o, hc1Var, (byte) 26);
            case 27:
                return new y0((e67) this.f2567o, hc1Var, (byte) 27);
            case 28:
                return new y0((sf1) this.f2567o, hc1Var, (byte) 28);
            default:
                return new y0((pr7) this.f2567o, hc1Var, (byte) 29);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 1:
                ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 2:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((y0) create((ho2) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 11:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 13:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 14:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 15:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1Var;
            case 17:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 20:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 21:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 22:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 23:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 24:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 25:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 26:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 27:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 28:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((y0) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG;
        String email;
        Object objK;
        Object objH;
        List<CompanyPermission> effectivePermissions;
        Object objH2;
        List<CompanyPermission> effectivePermissions2;
        me1 me1Var;
        au0 au0Var;
        byte b = this.m;
        byte b2 = 8;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        Object obj2 = f88.a;
        Object obj3 = ne1.m;
        Integer numA = 0;
        xoVarV = null;
        xoVarV = null;
        xo xoVarV = null;
        boolValueOf = null;
        Boolean boolValueOf = null;
        boolValueOf = null;
        Boolean boolValueOf2 = null;
        switch (b) {
            case 0:
                a1 a1Var = (a1) this.f2567o;
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                l97 l97VarA = a1Var.a.a();
                x0 x0Var = new x0(a1Var, z ? (byte) 1 : (byte) 0);
                this.n = true;
                l97VarA.b(x0Var, this);
                return obj3;
            case 1:
                c1 c1Var = (c1) this.f2567o;
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        throw ua5.q(obj);
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                l97 l97VarA2 = c1Var.a.a();
                b1 b1Var = new b1(c1Var, z ? (byte) 1 : (byte) 0);
                this.n = true;
                l97VarA2.b(b1Var, this);
                return obj3;
            case 2:
                p9 p9Var = (p9) this.f2567o;
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    xc0 xc0Var = p9Var.n;
                    l97 l97Var = p9Var.p;
                    String str = ((o9) l97Var.getValue()).b;
                    l33 l33Var = ((o9) l97Var.getValue()).c;
                    numA = l33Var != null ? bt1.A(l33Var) : 0;
                    String str2 = ((o9) l97Var.getValue()).d;
                    this.n = true;
                    objG = xc0Var.G(str, numA, str2, this);
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objG = ((tc6) obj).m;
                }
                Throwable thA = tc6.a(objG);
                if (thA == null) {
                    p9Var.X0(false);
                    PersonalContactInvitation invitation = ((CreatePersonalInvitationResult) objG).getInvitation();
                    if (invitation == null || (email = invitation.getEmail()) == null) {
                        email = ((o9) p9Var.p.getValue()).b;
                    }
                    p9Var.W0(new i27(email));
                    return obj2;
                }
                l97 l97Var2 = p9Var.p;
                p9Var.X0(false);
                if (thA instanceof zm3) {
                    p9Var.W0(new g27(((o9) l97Var2.getValue()).b));
                    return obj2;
                }
                if ((thA instanceof ty2) || (thA instanceof p25)) {
                    p9Var.W0(new h27(((o9) l97Var2.getValue()).b));
                    return obj2;
                }
                p9Var.W0(new h27(((o9) l97Var2.getValue()).b));
                return obj2;
            case 3:
                vb vbVar = (vb) this.f2567o;
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    nx3 nx3Var = vbVar.n;
                    t36 t36Var = vbVar.t;
                    String str3 = ((ob) t36Var.m.getValue()).a;
                    long j = Long.parseLong(((ob) t36Var.m.getValue()).b);
                    l33 l33Var2 = ((ob) t36Var.m.getValue()).c;
                    Integer numA2 = l33Var2 != null ? bt1.A(l33Var2) : null;
                    String str4 = ((ob) t36Var.m.getValue()).e;
                    String str5 = ((ob) t36Var.m.getValue()).d;
                    DeviceMeta deviceMeta = new DeviceMeta(new Long(j), str3, null, numA2, str4, !ub7.b0(str5) ? str5 : null, null, 68, null);
                    this.n = true;
                    objK = nx3Var.k(deviceMeta, this);
                    if (objK == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z6) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objK = ((tc6) obj).m;
                }
                Throwable thA2 = tc6.a(objK);
                if (thA2 == null) {
                    List list = vb.D;
                    vbVar.e1(false);
                    vbVar.X0(z17.a);
                    return obj2;
                }
                String message = thA2.getMessage();
                if (message == null) {
                    message = "";
                }
                ye4.a("AddRemoteDeviceViewModel", message);
                List list2 = vb.D;
                vbVar.e1(false);
                vbVar.X0(y17.a);
                return obj2;
            case 4:
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    RemoteControlApplication remoteControlApplication = (RemoteControlApplication) this.f2567o;
                    this.n = true;
                    return bg.a.b(remoteControlApplication, this) == obj3 ? obj3 : obj2;
                }
                if (z7) {
                    ct1.a0(obj);
                    return obj2;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z8 = this.n;
                if (z8) {
                    if (z8) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                km kmVar = (km) this.f2567o;
                Float f = new Float(0.0f);
                this.n = true;
                return km.a(kmVar, f, null, null, null, this, 14) == obj3 ? obj3 : obj2;
            case 6:
                zd0 zd0Var = (zd0) this.f2567o;
                boolean z9 = this.n;
                if (!z9) {
                    ct1.a0(obj);
                    jk0 jk0Var = zd0Var.f2690o;
                    this.n = true;
                    objH = jk0Var.h(this);
                    if (objH == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z9) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objH = ((tc6) obj).m;
                }
                if (!(objH instanceof sc6)) {
                    Account account = (Account) objH;
                    nw4 nw4Var = zd0Var.r;
                    if (account.getAccountCompanyInfo().isInCompany()) {
                        AccountRights rights = account.getRights();
                        if (rights != null && (effectivePermissions = rights.getEffectivePermissions()) != null) {
                            boolValueOf2 = Boolean.valueOf(effectivePermissions.contains(CompanyPermission.ManageAdmins));
                        }
                        if (im3.n(boolValueOf2, Boolean.TRUE)) {
                            z = true;
                        }
                    }
                    nw4Var.postValue(Boolean.valueOf(z));
                }
                if (tc6.a(objH) == null) {
                    return obj2;
                }
                zd0Var.r.postValue(Boolean.FALSE);
                return obj2;
            case 7:
                ce0 ce0Var = (ce0) this.f2567o;
                boolean z10 = this.n;
                if (!z10) {
                    ct1.a0(obj);
                    jk0 jk0Var2 = ce0Var.f517o;
                    this.n = true;
                    objH2 = jk0Var2.h(this);
                    if (objH2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z10) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objH2 = ((tc6) obj).m;
                }
                if (!(objH2 instanceof sc6)) {
                    Account account2 = (Account) objH2;
                    nw4 nw4Var2 = ce0Var.q;
                    if (account2.getAccountCompanyInfo().isInCompany()) {
                        AccountRights rights2 = account2.getRights();
                        if (rights2 != null && (effectivePermissions2 = rights2.getEffectivePermissions()) != null) {
                            boolValueOf = Boolean.valueOf(effectivePermissions2.contains(CompanyPermission.ManageAdmins));
                        }
                        if (im3.n(boolValueOf, Boolean.TRUE)) {
                            z2 = true;
                        }
                    }
                    nw4Var2.postValue(Boolean.valueOf(z2));
                }
                if (tc6.a(objH2) == null) {
                    return obj2;
                }
                ce0Var.q.postValue(Boolean.FALSE);
                return obj2;
            case 8:
                boolean z11 = this.n;
                if (!z11) {
                    ct1.a0(obj);
                    this.n = true;
                    if (im3.A(1000L, this) == obj3) {
                        return obj3;
                    }
                } else {
                    if (!z11) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                ((ConditionalAccessAuthenticationResponseFeedbackActivity) this.f2567o).finish();
                return obj2;
            case ep1.b /* 9 */:
                boolean z12 = this.n;
                if (z12) {
                    if (z12) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                y31 y31Var = ((y21) this.f2567o).q0;
                if (y31Var == null) {
                    return obj2;
                }
                h37 h37Var = new h37(new j37(R.string.tv_sendEmail_ActivityNotFoundException, null), k37.m, null, 12);
                this.n = true;
                return y31Var.c1(h37Var, this) == obj3 ? obj3 : obj2;
            case ep1.c /* 10 */:
                boolean z13 = this.n;
                if (!z13) {
                    ct1.a0(obj);
                    vh1 vh1Var = (vh1) this.f2567o;
                    this.n = true;
                    return vh1Var.e(this) == obj3 ? obj3 : obj2;
                }
                if (z13) {
                    ct1.a0(obj);
                    return obj2;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z14 = this.n;
                if (z14) {
                    if (z14) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                i76 i76Var = new i76();
                i76 i76Var2 = new i76();
                i76 i76Var3 = new i76();
                sj1 sj1Var = (sj1) this.f2567o;
                yx6 yx6Var = sj1Var.A.a;
                en0 en0Var = new en0(i76Var, i76Var2, i76Var3, sj1Var, (byte) 2);
                this.n = true;
                yx6.l(yx6Var, en0Var, this);
                return obj3;
            case ep1.d /* 12 */:
                boolean z15 = this.n;
                if (z15) {
                    if (z15) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = ((yr1) this.f2567o).v;
                Boolean bool = Boolean.FALSE;
                this.n = true;
                return yx6Var2.c(bool, this) == obj3 ? obj3 : obj2;
            case 13:
                boolean z16 = this.n;
                if (z16) {
                    if (z16) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yo2 yo2Var = (yo2) this.f2567o;
                this.n = true;
                Object objB = yo2Var.b(y45.m, this);
                if (objB != obj3) {
                    objB = obj2;
                }
                return objB == obj3 ? obj3 : obj2;
            case 14:
                boolean z17 = this.n;
                if (!z17) {
                    ct1.a0(obj);
                    fr2 fr2Var = (fr2) this.f2567o;
                    this.n = true;
                    return di1.m(fr2Var, null, this) == obj3 ? obj3 : obj2;
                }
                if (z17) {
                    ct1.a0(obj);
                    return obj2;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                iw7 iw7Var = (iw7) this.f2567o;
                boolean z18 = this.n;
                if (z18) {
                    if (z18) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                t36 t36Var2 = iw7Var.i;
                t36 t36Var3 = iw7Var.k;
                byte b3 = 3;
                g91 g91Var = new g91(b3, numA, (byte) 4);
                yi yiVar = new yi(iw7Var, b2);
                this.n = true;
                Object objI = hm3.i(x00.t, this, yiVar, new cp2(g91Var, (hc1) numA, b3), new go2[]{t36Var2, t36Var3});
                if (objI != obj3) {
                    objI = obj2;
                }
                return objI == obj3 ? obj3 : obj2;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                zf3 zf3Var = (zf3) this.f2567o;
                boolean z19 = this.n;
                if (z19) {
                    if (!z19) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                r36 r36Var = ((tf3) zf3Var.x0.getValue()).q;
                yf3 yf3Var = new yf3(zf3Var);
                this.n = true;
                if (r36Var.m.b(yf3Var, this) == obj3) {
                    return obj3;
                }
                hk0.b();
                return null;
            case 17:
                boolean z20 = this.n;
                if (z20) {
                    if (z20) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var3 = (yx6) ((cg3) this.f2567o).f;
                Boolean bool2 = Boolean.FALSE;
                this.n = true;
                return yx6Var3.c(bool2, this) == obj3 ? obj3 : obj2;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                boolean z21 = this.n;
                if (z21) {
                    if (z21) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var4 = ((dg3) this.f2567o).p;
                Boolean bool3 = Boolean.TRUE;
                this.n = true;
                return yx6Var4.c(bool3, this) == obj3 ? obj3 : obj2;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                boolean z22 = this.n;
                if (!z22) {
                    ct1.a0(obj);
                    wm3 wm3Var = (wm3) this.f2567o;
                    this.n = true;
                    return wm3Var.a(this) == obj3 ? obj3 : obj2;
                }
                if (z22) {
                    ct1.a0(obj);
                    return obj2;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z23 = this.n;
                if (z23) {
                    if (z23) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ko koVar = (ko) ((yt2) this.f2567o).f2642o;
                Float f2 = new Float(0.0f);
                e87 e87VarA0 = db8.A0(0.0f, 400.0f, new Float(0.5f), 1);
                this.n = true;
                return i67.g(koVar, f2, e87VarA0, true, null, this, 8) == obj3 ? obj3 : obj2;
            case 21:
                boolean z24 = this.n;
                if (z24) {
                    if (z24) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                tk1 tk1Var = g22.a;
                ac acVar = new ac((qb3) this.f2567o, numA, b2);
                this.n = true;
                return im3.j0(tk1Var, acVar, this) == obj3 ? obj3 : obj2;
            case 22:
                boolean z25 = this.n;
                if (z25) {
                    if (z25) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                kf0 kf0Var = ((nu4) this.f2567o).g;
                this.n = true;
                Object objJ = hm3.j(new vt4(kf0Var, numA, (byte) 5), this);
                return objJ == obj3 ? obj3 : objJ;
            case 23:
                boolean z26 = this.n;
                if (!z26) {
                    ct1.a0(obj);
                    me1Var = (me1) this.f2567o;
                } else {
                    if (!z26) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    me1Var = (me1) this.f2567o;
                    ct1.a0(obj);
                }
                while (ds1.R(me1Var.getCoroutineContext())) {
                    at4 at4Var = new at4((byte) 9);
                    this.f2567o = me1Var;
                    this.n = true;
                    if (qs1.O(getContext()).a(at4Var, this) == obj3) {
                        return obj3;
                    }
                }
                return obj2;
            case 24:
                boolean z27 = this.n;
                if (!z27) {
                    ct1.a0(obj);
                    go2 go2Var = (go2) this.f2567o;
                    this.n = true;
                    return go2Var.b(p85.m, this) == obj3 ? obj3 : obj2;
                }
                if (z27) {
                    ct1.a0(obj);
                    return obj2;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                boolean z28 = this.n;
                if (z28) {
                    if (z28) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                km kmVar2 = ((RippleNode) this.f2567o).L;
                Float f3 = new Float(0.0f);
                this.n = true;
                return kmVar2.e(f3, this) == obj3 ? obj3 : obj2;
            case 26:
                boolean z29 = this.n;
                if (z29) {
                    if (z29) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                qx0 qx0Var = (qx0) this.f2567o;
                this.n = true;
                Object objH3 = qx0Var.h(this);
                return objH3 == obj3 ? obj3 : objH3;
            case 27:
                boolean z30 = this.n;
                if (z30) {
                    if (z30) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var5 = ((e67) this.f2567o).r;
                Boolean bool4 = Boolean.TRUE;
                this.n = true;
                return yx6Var5.c(bool4, this) == obj3 ? obj3 : obj2;
            case 28:
                boolean z31 = this.n;
                if (z31) {
                    if (z31) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                sf1 sf1Var = (sf1) this.f2567o;
                this.n = true;
                sf1Var.getClass();
                Object objJ2 = hm3.j(new i9(sf1Var, numA, (byte) 6), this);
                if (objJ2 != obj3) {
                    objJ2 = obj2;
                }
                return objJ2 == obj3 ? obj3 : obj2;
            default:
                pr7 pr7Var = (pr7) this.f2567o;
                boolean z32 = this.n;
                if (z32) {
                    if (z32) {
                        ct1.a0(obj);
                        return obj2;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                if (!gt7.c(pr7Var.l().b) && pr7Var.h() && !(pr7Var.f instanceof vg5)) {
                    xoVarV = r47.v(pr7Var.l());
                    xo xoVarX = r47.x(pr7Var.l(), pr7Var.l().a.n.length());
                    xo xoVarW = r47.w(pr7Var.l(), pr7Var.l().a.n.length());
                    vo voVar = new vo(xoVarX);
                    voVar.c(xoVarW);
                    xo xoVarG = voVar.g();
                    int iF = gt7.f(pr7Var.l().b);
                    pr7Var.c.invoke(pr7.b(xoVarG, h57.a(iF, iF)));
                    pr7Var.r(n43.m);
                    pr7Var.a.e = true;
                }
                if (xoVarV == null || (au0Var = pr7Var.h) == null) {
                    return obj2;
                }
                zt0 zt0VarT = au8.T(xoVarV);
                this.n = true;
                ((gg) au0Var).a(zt0VarT);
                return obj2 == obj3 ? obj3 : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, hc1 hc1Var) {
        super(i, hc1Var);
        this.m = (byte) 23;
    }
}
