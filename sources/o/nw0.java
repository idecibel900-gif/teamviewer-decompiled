package o;

import com.teamviewer.apidefinitions.contacts.models.PersonalContactChangedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationRemovedEvent;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactRemovedEvent;
import com.teamviewer.apidefinitions.contacts.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionChangeEvent;

/* JADX INFO: loaded from: classes.dex */
public final class nw0 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1606o;

    public nw0(kf0 kf0Var, int i) {
        this.m = (byte) 0;
        this.f1606o = kf0Var;
        this.n = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
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
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        mw0 mw0Var;
        Object obj2;
        Object value;
        Object value2;
        Object value3;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj3 = this.f1606o;
        int i = this.n;
        switch (b) {
            case 0:
                if (hc1Var instanceof mw0) {
                    mw0Var = (mw0) hc1Var;
                    int i2 = mw0Var.f1517o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mw0Var.f1517o = i2 - Integer.MIN_VALUE;
                    } else {
                        mw0Var = new mw0(this, hc1Var);
                    }
                } else {
                    mw0Var = new mw0(this, hc1Var);
                }
                Object obj4 = mw0Var.m;
                int i3 = mw0Var.f1517o;
                ne1 ne1Var = ne1.m;
                if (i3 == 0) {
                    ct1.a0(obj4);
                    sg3 sg3Var = new sg3(i, obj);
                    mw0Var.f1517o = 1;
                    if (((kf0) obj3).a(sg3Var, mw0Var) != ne1Var) {
                    }
                    return ne1Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ct1.a0(obj4);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj4);
                mw0Var.f1517o = 2;
                de1 context = mw0Var.getContext();
                ds1.H(context);
                hc1 hc1VarA = vt1.A(mw0Var);
                a22 a22Var = hc1VarA instanceof a22 ? (a22) hc1VarA : null;
                if (a22Var != null) {
                    fe1 fe1Var = a22Var.p;
                    if (ga0.v(fe1Var, context)) {
                        a22Var.r = f88Var;
                        a22Var.f478o = 1;
                        fe1Var.L0(context, a22Var);
                    } else {
                        fo8 fo8Var = new fo8(fo8.f819o);
                        de1 de1VarH0 = context.H0(fo8Var);
                        a22Var.r = f88Var;
                        a22Var.f478o = 1;
                        fe1Var.L0(de1VarH0, a22Var);
                        if (fo8Var.n) {
                            be2 be2VarA = du7.a();
                            kw kwVar = be2VarA.q;
                            if (!(kwVar != null ? kwVar.isEmpty() : true)) {
                                if (be2VarA.f416o >= 4294967296L) {
                                    a22Var.r = f88Var;
                                    a22Var.f478o = 1;
                                    be2VarA.P0(a22Var);
                                } else {
                                    be2VarA.Q0(true);
                                    try {
                                        a22Var.run();
                                        do {
                                        } while (be2VarA.S0());
                                    } catch (Throwable th) {
                                        try {
                                            a22Var.h(th);
                                        } catch (Throwable th2) {
                                            be2VarA.O0(true);
                                            throw th2;
                                        }
                                    }
                                    be2VarA.O0(true);
                                }
                            }
                            obj2 = f88Var;
                        }
                    }
                    obj2 = ne1Var;
                    break;
                } else {
                    obj2 = f88Var;
                }
                if (obj2 != ne1Var) {
                    obj2 = f88Var;
                }
                if (obj2 != ne1Var) {
                    return f88Var;
                }
                return ne1Var;
            case 1:
                TeamViewerEvent teamViewerEvent = (TeamViewerEvent) obj;
                n81 n81Var = (n81) obj3;
                l97 l97Var = n81Var.r;
                if (teamViewerEvent instanceof PersonalContactChangedEvent) {
                    PersonalContactChangedEvent personalContactChangedEvent = (PersonalContactChangedEvent) teamViewerEvent;
                    if (personalContactChangedEvent.getContact().getPersonalContactId() == i) {
                        do {
                            value3 = l97Var.getValue();
                        } while (!l97Var.j(value3, i81.a((i81) value3, di1.E(personalContactChangedEvent.getContact()), false, null, null, false, false, null, false, false, false, false, 2046)));
                    } else if ((teamViewerEvent instanceof PersonalContactRemovedEvent) || ((PersonalContactRemovedEvent) teamViewerEvent).getPersonalContactId() != i) {
                        if ((teamViewerEvent instanceof PersonalContactInvitationRemovedEvent) && ((PersonalContactInvitationRemovedEvent) teamViewerEvent).getPersonalInvitationId() == i && !n81Var.B) {
                            do {
                                value = l97Var.getValue();
                            } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, true, false, 1535)));
                        }
                    } else if (!n81Var.B) {
                        do {
                            value2 = l97Var.getValue();
                        } while (!l97Var.j(value2, i81.a((i81) value2, null, false, null, null, false, false, null, false, false, true, false, 1535)));
                    }
                } else if (teamViewerEvent instanceof PersonalContactRemovedEvent) {
                    if (teamViewerEvent instanceof PersonalContactInvitationRemovedEvent) {
                        do {
                            value = l97Var.getValue();
                        } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, true, false, 1535)));
                    }
                } else if (teamViewerEvent instanceof PersonalContactInvitationRemovedEvent) {
                    do {
                        value = l97Var.getValue();
                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, true, false, 1535)));
                }
                return f88Var;
            default:
                com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent) obj;
                if (teamViewerEvent2 instanceof SupportSessionChangeEvent) {
                    SupportSessionChangeEvent supportSessionChangeEvent = (SupportSessionChangeEvent) teamViewerEvent2;
                    if (supportSessionChangeEvent.getSessioncode() == i) {
                        su6 su6Var = (su6) obj3;
                        SupportSession supportSession = supportSessionChangeEvent.getSupportSession();
                        if (supportSession == null || h57.o(supportSession, su6Var.s)) {
                            su6Var.d1(supportSessionChangeEvent.getSessioncode());
                        } else {
                            su6Var.g1(supportSession, true, new jp6(su6Var, (byte) 17));
                        }
                    }
                }
                return f88Var;
        }
    }

    public /* synthetic */ nw0(int i, oe8 oe8Var, byte b) {
        this.m = b;
        this.n = i;
        this.f1606o = oe8Var;
    }
}
