package o;

import com.teamviewer.apidefinitions.contacts.models.PersonalContact;
import com.teamviewer.apidefinitions.contacts.models.PersonalContactList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class la1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qa1 f1345o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ la1(qa1 qa1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1345o = qa1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        qa1 qa1Var = this.f1345o;
        switch (b) {
            case 0:
                return new la1(qa1Var, hc1Var, (byte) 0);
            case 1:
                return new la1(qa1Var, hc1Var, (byte) 1);
            case 2:
                return new la1(qa1Var, hc1Var, (byte) 2);
            case 3:
                return new la1(qa1Var, hc1Var, (byte) 3);
            case 4:
                return new la1(qa1Var, hc1Var, (byte) 4);
            case 5:
                return new la1(qa1Var, hc1Var, (byte) 5);
            default:
                return new la1(qa1Var, hc1Var, (byte) 6);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((la1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objQ;
        byte b = this.m;
        e27 e27Var = e27.a;
        f88 f88Var = f88.a;
        qa1 qa1Var = this.f1345o;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar = (fm) qa1Var.f1814o.n;
                yi yiVar = new yi(qa1Var, (byte) 3);
                this.n = true;
                return fmVar.b(yiVar, this) == ne1Var ? ne1Var : f88Var;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    yx6 yx6Var = qa1Var.x;
                    this.n = true;
                    return yx6Var.c(j27.a, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z2) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    if (qa1Var.u.isEmpty()) {
                        qa1Var.Y0(b91.m);
                    }
                    xc0 xc0Var = qa1Var.f1814o;
                    this.n = true;
                    objQ = xc0Var.Q(this);
                    if (objQ == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objQ = ((tc6) obj).m;
                }
                Throwable thA = tc6.a(objQ);
                if (thA == null) {
                    List<PersonalContact> items = ((PersonalContactList) objQ).getItems();
                    ArrayList arrayList = new ArrayList(mv0.Z(items, 10));
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        arrayList.add(di1.E((PersonalContact) it.next()));
                    }
                    qa1Var.u = arrayList;
                } else {
                    ua5.v("Failed to fetch personal contacts: ", thA.getMessage(), "ContactsScreenViewModel");
                }
                qa1.b1(qa1Var, 6);
                return f88Var;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    yx6 yx6Var2 = qa1Var.x;
                    this.n = true;
                    return yx6Var2.c(d27.a, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z4) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    yx6 yx6Var3 = qa1Var.x;
                    this.n = true;
                    return yx6Var3.c(e27Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z5) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    yx6 yx6Var4 = qa1Var.x;
                    this.n = true;
                    return yx6Var4.c(e27Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z6) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    yx6 yx6Var5 = qa1Var.x;
                    this.n = true;
                    return yx6Var5.c(e27Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z7) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
