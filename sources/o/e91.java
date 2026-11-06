package o;

import com.teamviewer.apidefinitions.contacts.models.OrganizationContactList;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitationList;

/* JADX INFO: loaded from: classes.dex */
public final class e91 extends og7 implements iw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f695o;
    public /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e91(iu iuVar, hc1 hc1Var, byte b) {
        super(3, hc1Var);
        this.m = b;
        this.p = iuVar;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                e91 e91Var = new e91((iu) this.p, (hc1) obj3, (byte) 0);
                e91Var.f695o = (String) obj;
                return e91Var.invokeSuspend(f88Var);
            case 1:
                ((Number) obj2).intValue();
                e91 e91Var2 = new e91((iu) this.p, (hc1) obj3, (byte) 1);
                e91Var2.f695o = (String) obj;
                return e91Var2.invokeSuspend(f88Var);
            default:
                e91 e91Var3 = new e91(3, (hc1) obj3);
                e91Var3.f695o = (ho2) obj;
                e91Var3.p = (Object[]) obj2;
                return e91Var3.invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objP;
        Object objR;
        y61 y61Var;
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        y61 y61Var2 = null;
        switch (b) {
            case 0:
                String str = (String) this.f695o;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    xc0 xc0Var = (xc0) ((iu) this.p).f1103o;
                    this.f695o = null;
                    this.n = true;
                    objP = xc0Var.P(str, this);
                    if (objP == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objP = ((tc6) obj).m;
                }
                if (!(objP instanceof sc6)) {
                    OrganizationContactList organizationContactList = (OrganizationContactList) objP;
                    objP = new hw7(organizationContactList.getItems(), organizationContactList.getNextPaginationToken());
                }
                return new tc6(objP);
            case 1:
                String str2 = (String) this.f695o;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    xc0 xc0Var2 = (xc0) ((iu) this.p).f1103o;
                    this.f695o = null;
                    this.n = true;
                    objR = xc0Var2.R(str2, this);
                    if (objR == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objR = ((tc6) obj).m;
                }
                if (!(objR instanceof sc6)) {
                    PersonalContactInvitationList personalContactInvitationList = (PersonalContactInvitationList) objR;
                    objR = new hw7(personalContactInvitationList.getItems(), personalContactInvitationList.getNextPaginationToken());
                }
                return new tc6(objR);
            default:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    ho2 ho2Var = (ho2) this.f695o;
                    y61[] y61VarArr = (y61[]) ((Object[]) this.p);
                    int length = y61VarArr.length;
                    int i = 0;
                    while (true) {
                        y61Var = w61.a;
                        if (i < length) {
                            y61 y61Var3 = y61VarArr[i];
                            if (im3.n(y61Var3, y61Var)) {
                                i++;
                            } else {
                                y61Var2 = y61Var3;
                            }
                        }
                    }
                    if (y61Var2 != null) {
                        y61Var = y61Var2;
                    }
                    this.n = true;
                    if (ho2Var.c(y61Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e91(int i, hc1 hc1Var) {
        super(i, hc1Var);
        this.m = (byte) 2;
    }
}
