package o;

import com.teamviewer.apidefinitions.contacts.models.AccountContactDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j81 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1137o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j81(Object obj, int i, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.f1137o = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        int i = this.f1137o;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new j81((n81) obj2, i, hc1Var, (byte) 0);
            case 1:
                return new j81((qa1) obj2, i, hc1Var, (byte) 1);
            case 2:
                return new j81((f44) obj2, i, hc1Var, (byte) 2);
            case 3:
                return new j81((tx5) obj2, i, hc1Var, (byte) 3);
            default:
                return new j81((bn6) obj2, i, hc1Var, (byte) 4);
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
        }
        return ((j81) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objN;
        Object objN2;
        Object objN3;
        byte b = this.m;
        List list = ea2.m;
        f88 f88Var = f88.a;
        int i = this.f1137o;
        ne1 ne1Var = ne1.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                n81 n81Var = (n81) obj2;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    xc0 xc0Var = n81Var.p;
                    this.n = true;
                    objN = xc0Var.N(i, this);
                    if (objN == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objN = ((tc6) obj).m;
                }
                List list2 = (List) (objN instanceof sc6 ? null : objN);
                if (list2 != null) {
                    list = list2;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    String strL = bc7.L(String.valueOf(((AccountContactDeviceInfo) obj3).getTeamviewerId()), " ", "");
                    Pattern patternCompile = Pattern.compile("^[0-9]{7,}$");
                    patternCompile.getClass();
                    if (patternCompile.matcher(strL).matches()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(db8.E0((AccountContactDeviceInfo) it.next()));
                }
                l97 l97Var = n81Var.r;
                while (true) {
                    Object value = l97Var.getValue();
                    ArrayList arrayList3 = arrayList2;
                    if (l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, arrayList3, n81Var.A, true, false, false, 1599))) {
                        return f88Var;
                    }
                    arrayList2 = arrayList3;
                }
                break;
            case 1:
                qa1 qa1Var = (qa1) obj2;
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    xc0 xc0Var2 = qa1Var.f1814o;
                    this.n = true;
                    objN2 = xc0Var2.N(i, this);
                    if (objN2 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objN2 = ((tc6) obj).m;
                }
                List list3 = (List) (objN2 instanceof sc6 ? null : objN2);
                if (list3 != null) {
                    list = list3;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    String strL2 = bc7.L(String.valueOf(((AccountContactDeviceInfo) obj4).getTeamviewerId()), " ", "");
                    Pattern patternCompile2 = Pattern.compile("^[0-9]{7,}$");
                    patternCompile2.getClass();
                    if (patternCompile2.matcher(strL2).matches()) {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayList5 = new ArrayList(mv0.Z(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(db8.E0((AccountContactDeviceInfo) it2.next()));
                }
                l97 l97Var2 = qa1Var.r;
                while (true) {
                    Object value2 = l97Var2.getValue();
                    ArrayList arrayList6 = arrayList5;
                    if (l97Var2.j(value2, ka1.a((ka1) value2, null, null, false, false, false, false, false, false, null, null, 0, 0, false, null, true, arrayList6, qa1Var.C, false, 147455))) {
                        return f88Var;
                    }
                    arrayList5 = arrayList6;
                }
                break;
            case 2:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                b44 b44Var = ((f44) obj2).B;
                this.n = true;
                Object objL = w44.l(b44Var.b, i, this);
                if (objL != ne1Var) {
                    objL = f88Var;
                }
                return objL == ne1Var ? ne1Var : f88Var;
            case 3:
                tx5 tx5Var = (tx5) obj2;
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
                tx5Var.u.setValue(Boolean.FALSE);
                yx6 yx6Var = tx5Var.v;
                Integer num = new Integer(i);
                this.n = true;
                return yx6Var.c(num, this) == ne1Var ? ne1Var : f88Var;
            default:
                bn6 bn6Var = (bn6) obj2;
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    xc0 xc0Var3 = bn6Var.q;
                    this.n = true;
                    objN3 = xc0Var3.N(i, this);
                    if (objN3 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objN3 = ((tc6) obj).m;
                }
                List list4 = (List) (objN3 instanceof sc6 ? null : objN3);
                if (list4 != null) {
                    list = list4;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : list) {
                    if (ds1.T(String.valueOf(((AccountContactDeviceInfo) obj5).getTeamviewerId()))) {
                        arrayList7.add(obj5);
                    }
                }
                ArrayList arrayList8 = new ArrayList(mv0.Z(arrayList7, 10));
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(db8.E0((AccountContactDeviceInfo) it3.next()));
                }
                l97 l97Var3 = bn6Var.u;
                while (true) {
                    Object value3 = l97Var3.getValue();
                    ArrayList arrayList9 = arrayList8;
                    if (l97Var3.j(value3, yl6.a((yl6) value3, null, null, null, false, null, null, null, null, null, null, null, true, arrayList9, bn6Var.D, false, false, null, null, false, 2082815))) {
                        return f88Var;
                    }
                    arrayList8 = arrayList9;
                }
                break;
        }
    }
}
