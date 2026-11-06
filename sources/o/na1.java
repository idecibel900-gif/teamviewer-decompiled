package o;

import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.apidefinitions.contacts.models.OrganizationContact;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactInvitation;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class na1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public qa1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1556o;
    public final /* synthetic */ qa1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na1(qa1 qa1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = qa1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        qa1 qa1Var = this.p;
        switch (b) {
            case 0:
                return new na1(qa1Var, hc1Var, (byte) 0);
            default:
                return new na1(qa1Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((na1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objR;
        qa1 qa1Var;
        Object objS;
        qa1 qa1Var2;
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        qa1 qa1Var3 = this.p;
        switch (b) {
            case 0:
                boolean z = this.f1556o;
                if (!z) {
                    ct1.a0(obj);
                    iu iuVar = qa1Var3.t;
                    this.n = qa1Var3;
                    this.f1556o = true;
                    objR = iuVar.r(this);
                    if (objR == ne1Var) {
                        return ne1Var;
                    }
                    qa1Var = qa1Var3;
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qa1 qa1Var4 = this.n;
                    ct1.a0(obj);
                    qa1Var = qa1Var4;
                    objR = obj;
                }
                Iterable<OrganizationContact> iterable = (Iterable) objR;
                ArrayList arrayList = new ArrayList(mv0.Z(iterable, 10));
                for (OrganizationContact organizationContact : iterable) {
                    organizationContact.getClass();
                    arrayList.add(new h71(organizationContact.getAccountId(), Integer.valueOf(organizationContact.getAccountId()), ub7.x0(organizationContact.getName()).toString(), organizationContact.getEmail(), organizationContact.getPictureUrl(), (ContactOnlineStatus) null, b91.n, 80));
                }
                qa1Var.v = arrayList;
                qa1.b1(qa1Var3, 5);
                return f88Var;
            default:
                boolean z2 = this.f1556o;
                if (!z2) {
                    ct1.a0(obj);
                    iu iuVar2 = qa1Var3.t;
                    this.n = qa1Var3;
                    this.f1556o = true;
                    objS = iuVar2.s(this);
                    if (objS == ne1Var) {
                        return ne1Var;
                    }
                    qa1Var2 = qa1Var3;
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qa1 qa1Var5 = this.n;
                    ct1.a0(obj);
                    qa1Var2 = qa1Var5;
                    objS = obj;
                }
                Iterable iterable2 = (Iterable) objS;
                ArrayList arrayList2 = new ArrayList(mv0.Z(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(di1.F((PersonalContactInvitation) it.next()));
                }
                qa1Var2.w = arrayList2;
                qa1.b1(qa1Var3, 3);
                return f88Var;
        }
    }
}
