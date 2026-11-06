package o;

import com.teamviewer.apidefinitions.contacts.models.TeamViewerEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class em implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ho2 n;

    public /* synthetic */ em(ho2 ho2Var, byte b) {
        this.m = b;
        this.n = ho2Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x022c  */
    /* JADX WARN: Code duplicated, block: B:166:0x026a  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:212:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) throws Throwable {
        dm dmVar;
        v91 v91Var;
        hh1 hh1Var;
        bz1 bz1Var;
        ez1 ez1Var;
        gz1 gz1Var;
        d33 d33Var;
        e64 e64Var;
        vl4 vl4Var;
        vn5 vn5Var;
        c56 c56Var;
        cg7 cg7Var;
        byte b = this.m;
        f88 f88Var = f88.a;
        ho2 ho2Var = this.n;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                if (hc1Var instanceof dm) {
                    dmVar = (dm) hc1Var;
                    int i = dmVar.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dmVar.n = i - Integer.MIN_VALUE;
                    } else {
                        dmVar = new dm(this, hc1Var);
                    }
                } else {
                    dmVar = new dm(this, hc1Var);
                }
                Object obj2 = dmVar.m;
                int i2 = dmVar.n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ct1.a0(obj2);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj2);
                List list = ((bl8) obj).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof z43) {
                        arrayList.add(obj3);
                    }
                }
                dmVar.n = 1;
                return ho2Var.c(arrayList, dmVar) == ne1Var ? ne1Var : f88Var;
            case 1:
                if (hc1Var instanceof v91) {
                    v91Var = (v91) hc1Var;
                    int i3 = v91Var.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        v91Var.n = i3 - Integer.MIN_VALUE;
                    } else {
                        v91Var = new v91(this, hc1Var);
                    }
                } else {
                    v91Var = new v91(this, hc1Var);
                }
                Object obj4 = v91Var.m;
                int i4 = v91Var.n;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ct1.a0(obj4);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj4);
                if (!(obj instanceof TeamViewerEvent)) {
                    return f88Var;
                }
                v91Var.n = 1;
                return ho2Var.c(obj, v91Var) == ne1Var ? ne1Var : f88Var;
            case 2:
                if (hc1Var instanceof hh1) {
                    hh1Var = (hh1) hc1Var;
                    int i5 = hh1Var.n;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        hh1Var.n = i5 - Integer.MIN_VALUE;
                    } else {
                        hh1Var = new hh1(this, hc1Var);
                    }
                } else {
                    hh1Var = new hh1(this, hc1Var);
                }
                Object obj5 = hh1Var.m;
                int i6 = hh1Var.n;
                if (i6 == 0) {
                    ct1.a0(obj5);
                    g97 g97Var = (g97) obj;
                    if (g97Var instanceof h36) {
                        throw ((h36) g97Var).b;
                    }
                    if (g97Var instanceof qg1) {
                        Object obj6 = ((qg1) g97Var).b;
                        hh1Var.n = 1;
                        return ho2Var.c(obj6, hh1Var) == ne1Var ? ne1Var : f88Var;
                    }
                    if (g97Var instanceof gl2 ? true : g97Var instanceof p78) {
                        hk0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        gk0.s();
                    }
                } else {
                    if (i6 == 1) {
                        ct1.a0(obj5);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                if (hc1Var instanceof bz1) {
                    bz1Var = (bz1) hc1Var;
                    int i7 = bz1Var.n;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        bz1Var.n = i7 - Integer.MIN_VALUE;
                    } else {
                        bz1Var = new bz1(this, hc1Var);
                    }
                } else {
                    bz1Var = new bz1(this, hc1Var);
                }
                Object obj7 = bz1Var.m;
                int i8 = bz1Var.n;
                if (i8 == 0) {
                    ct1.a0(obj7);
                    Boolean boolValueOf = Boolean.valueOf(((gl4) obj).c());
                    bz1Var.n = 1;
                    return ho2Var.c(boolValueOf, bz1Var) == ne1Var ? ne1Var : f88Var;
                }
                if (i8 == 1) {
                    ct1.a0(obj7);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (hc1Var instanceof ez1) {
                    ez1Var = (ez1) hc1Var;
                    int i9 = ez1Var.n;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ez1Var.n = i9 - Integer.MIN_VALUE;
                    } else {
                        ez1Var = new ez1(this, hc1Var);
                    }
                } else {
                    ez1Var = new ez1(this, hc1Var);
                }
                Object obj8 = ez1Var.m;
                int i10 = ez1Var.n;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ct1.a0(obj8);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj8);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj9 : (List) obj) {
                    if (hashSet.add(((l33) obj9).a)) {
                        arrayList2.add(obj9);
                    }
                }
                ez1Var.n = 1;
                return ho2Var.c(arrayList2, ez1Var) == ne1Var ? ne1Var : f88Var;
            case 5:
                if (hc1Var instanceof gz1) {
                    gz1Var = (gz1) hc1Var;
                    int i11 = gz1Var.n;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        gz1Var.n = i11 - Integer.MIN_VALUE;
                    } else {
                        gz1Var = new gz1(this, hc1Var);
                    }
                } else {
                    gz1Var = new gz1(this, hc1Var);
                }
                Object obj10 = gz1Var.m;
                int i12 = gz1Var.n;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ct1.a0(obj10);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj10);
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj11 : (List) obj) {
                    if (hashSet2.add(((l33) obj11).a)) {
                        arrayList3.add(obj11);
                    }
                }
                gz1Var.n = 1;
                return ho2Var.c(arrayList3, gz1Var) == ne1Var ? ne1Var : f88Var;
            case 6:
                if (hc1Var instanceof d33) {
                    d33Var = (d33) hc1Var;
                    int i13 = d33Var.n;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        d33Var.n = i13 - Integer.MIN_VALUE;
                    } else {
                        d33Var = new d33(this, hc1Var);
                    }
                } else {
                    d33Var = new d33(this, hc1Var);
                }
                Object obj12 = d33Var.m;
                int i14 = d33Var.n;
                if (i14 == 0) {
                    ct1.a0(obj12);
                    String str = ((v23) obj).e;
                    d33Var.n = 1;
                    return ho2Var.c(str, d33Var) == ne1Var ? ne1Var : f88Var;
                }
                if (i14 == 1) {
                    ct1.a0(obj12);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (hc1Var instanceof e64) {
                    e64Var = (e64) hc1Var;
                    int i15 = e64Var.n;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        e64Var.n = i15 - Integer.MIN_VALUE;
                    } else {
                        e64Var = new e64(this, hc1Var);
                    }
                } else {
                    e64Var = new e64(this, hc1Var);
                }
                Object obj13 = e64Var.m;
                int i16 = e64Var.n;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ct1.a0(obj13);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj13);
                if (!(obj instanceof com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent)) {
                    return f88Var;
                }
                e64Var.n = 1;
                return ho2Var.c(obj, e64Var) == ne1Var ? ne1Var : f88Var;
            case 8:
                if (hc1Var instanceof vl4) {
                    vl4Var = (vl4) hc1Var;
                    int i17 = vl4Var.n;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        vl4Var.n = i17 - Integer.MIN_VALUE;
                    } else {
                        vl4Var = new vl4(this, hc1Var);
                    }
                } else {
                    vl4Var = new vl4(this, hc1Var);
                }
                Object obj14 = vl4Var.m;
                int i18 = vl4Var.n;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ct1.a0(obj14);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj14);
                if (!(obj instanceof com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent)) {
                    return f88Var;
                }
                vl4Var.n = 1;
                return ho2Var.c(obj, vl4Var) == ne1Var ? ne1Var : f88Var;
            case ep1.b /* 9 */:
                if (hc1Var instanceof vn5) {
                    vn5Var = (vn5) hc1Var;
                    int i19 = vn5Var.n;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        vn5Var.n = i19 - Integer.MIN_VALUE;
                    } else {
                        vn5Var = new vn5(this, hc1Var);
                    }
                } else {
                    vn5Var = new vn5(this, hc1Var);
                }
                Object obj15 = vn5Var.m;
                int i20 = vn5Var.n;
                if (i20 != 0) {
                    if (i20 == 1) {
                        ct1.a0(obj15);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj15);
                if (!(obj instanceof com.teamviewer.apidefinitions.policies.models.TeamViewerEvent)) {
                    return f88Var;
                }
                vn5Var.n = 1;
                return ho2Var.c(obj, vn5Var) == ne1Var ? ne1Var : f88Var;
            case ep1.c /* 10 */:
                if (hc1Var instanceof c56) {
                    c56Var = (c56) hc1Var;
                    int i21 = c56Var.n;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c56Var.n = i21 - Integer.MIN_VALUE;
                    } else {
                        c56Var = new c56(this, hc1Var);
                    }
                } else {
                    c56Var = new c56(this, hc1Var);
                }
                Object obj16 = c56Var.m;
                int i22 = c56Var.n;
                if (i22 != 0) {
                    if (i22 == 1) {
                        ct1.a0(obj16);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj16);
                if (!(obj instanceof com.teamviewer.apidefinitions.recentconnections.models.TeamViewerEvent)) {
                    return f88Var;
                }
                c56Var.n = 1;
                return ho2Var.c(obj, c56Var) == ne1Var ? ne1Var : f88Var;
            default:
                if (hc1Var instanceof cg7) {
                    cg7Var = (cg7) hc1Var;
                    int i23 = cg7Var.n;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        cg7Var.n = i23 - Integer.MIN_VALUE;
                    } else {
                        cg7Var = new cg7(this, hc1Var);
                    }
                } else {
                    cg7Var = new cg7(this, hc1Var);
                }
                Object obj17 = cg7Var.m;
                int i24 = cg7Var.n;
                if (i24 != 0) {
                    if (i24 == 1) {
                        ct1.a0(obj17);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj17);
                if (!(obj instanceof com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent)) {
                    return f88Var;
                }
                cg7Var.n = 1;
                return ho2Var.c(obj, cg7Var) == ne1Var ? ne1Var : f88Var;
        }
    }
}
