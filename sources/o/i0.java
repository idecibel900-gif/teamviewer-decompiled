package o;

import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfiguration;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 extends cx2 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        ob obVar;
        int length;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Account account;
        RolloutConfiguration rolloutConfiguration;
        Object value11;
        Object value12;
        Object value13;
        Object value14;
        Object value15;
        Object value16;
        du1 du1Var;
        byte b = this.n;
        hc1 hc1Var = null;
        byte b2 = 0;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p0 p0Var = (p0) this.receiver;
                pw4 pw4Var = p0Var.Q;
                if (zBooleanValue) {
                    p0Var.f1();
                } else {
                    if (p0Var.C != null) {
                        Object[] objArr2 = pw4Var.c;
                        long[] jArr = pw4Var.a;
                        int length2 = jArr.length - 2;
                        if (length2 >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8;
                                    int i3 = 8 - ((~(i - length2)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((j & 255) < 128) {
                                            im3.R(p0Var.I0(), null, null, new n0(p0Var, (yr5) objArr2[(i << 3) + i4], hc1Var, b2), 3);
                                        }
                                        j >>= i2;
                                        i4++;
                                        i2 = i2;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i3 == i2) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i != length2) {
                                    i++;
                                    objArr2 = objArr;
                                }
                            }
                        }
                        yr5 yr5Var = p0Var.S;
                        if (yr5Var != null) {
                            im3.R(p0Var.I0(), null, null, new n0(p0Var, yr5Var, hc1Var, (byte) 1), 3);
                        }
                    }
                    pw4Var.a();
                    p0Var.S = null;
                    p0Var.g1();
                }
                return f88Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                p9 p9Var = (p9) this.receiver;
                p9Var.getClass();
                l97 l97Var = p9Var.p;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, o9.a((o9) value, null, str, null, null, (ub7.b0(str) || wh5.a.matcher(str).matches()) ? false : true, false, false, false, 493)));
                return f88Var;
            case 2:
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                ((p9) this.receiver).Y0(l33Var);
                return f88Var;
            case 3:
                l33 l33Var2 = (l33) obj;
                l33Var2.getClass();
                p9 p9Var2 = (p9) this.receiver;
                p9Var2.getClass();
                l97 l97Var2 = p9Var2.p;
                do {
                    value2 = l97Var2.getValue();
                } while (!l97Var2.j(value2, o9.a((o9) value2, null, null, null, null, false, false, false, false, 255)));
                p9Var2.Y0(l33Var2);
                return f88Var;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                p9 p9Var3 = (p9) this.receiver;
                p9Var3.getClass();
                l97 l97Var3 = p9Var3.p;
                do {
                    value3 = l97Var3.getValue();
                } while (!l97Var3.j(value3, o9.a((o9) value3, null, null, null, str2, false, str2.length() > 500, false, false, 471)));
                return f88Var;
            case 5:
                ea0 ea0Var = (ea0) obj;
                ea0Var.getClass();
                p9 p9Var4 = (p9) this.receiver;
                p9Var4.getClass();
                l97 l97Var4 = p9Var4.p;
                do {
                    value4 = l97Var4.getValue();
                } while (!l97Var4.j(value4, o9.a((o9) value4, ea0Var, null, null, null, false, false, false, false, 510)));
                return f88Var;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                vb vbVar = (vb) this.receiver;
                vbVar.getClass();
                l97 l97Var5 = vbVar.s;
                do {
                    value5 = l97Var5.getValue();
                    obVar = (ob) value5;
                    length = str3.length();
                } while (!l97Var5.j(value5, ob.a(obVar, str3, null, null, null, null, !(3 <= length && length < 51), false, false, false, false, false, 4062)));
                return f88Var;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                vb vbVar2 = (vb) this.receiver;
                vbVar2.getClass();
                String strL = bc7.L(str4, " ", "");
                boolean z = (ub7.b0(strL) || ds1.T(strL)) ? false : true;
                l97 l97Var6 = vbVar2.s;
                do {
                    value6 = l97Var6.getValue();
                } while (!l97Var6.j(value6, ob.a((ob) value6, null, strL, null, null, null, false, z, false, false, false, false, 4029)));
                if (!z && !ub7.b0(strL)) {
                    im3.R(e8.n(vbVar2), vbVar2.r, null, new h0((Object) vbVar2, (Object) strL, hc1Var, (byte) 9), 2);
                }
                return f88Var;
            case 8:
                l33 l33Var3 = (l33) obj;
                l33Var3.getClass();
                ((vb) this.receiver).g1(l33Var3);
                return f88Var;
            case ep1.b /* 9 */:
                l33 l33Var4 = (l33) obj;
                l33Var4.getClass();
                vb vbVar3 = (vb) this.receiver;
                vbVar3.getClass();
                l97 l97Var7 = vbVar3.s;
                do {
                    value7 = l97Var7.getValue();
                } while (!l97Var7.j(value7, ob.a((ob) value7, null, null, null, null, null, false, false, false, false, false, false, 2047)));
                vbVar3.g1(l33Var4);
                return f88Var;
            case ep1.c /* 10 */:
                String str5 = (String) obj;
                str5.getClass();
                vb vbVar4 = (vb) this.receiver;
                vbVar4.getClass();
                l97 l97Var8 = vbVar4.s;
                do {
                    value8 = l97Var8.getValue();
                } while (!l97Var8.j(value8, ob.a((ob) value8, null, null, null, str5, null, false, false, false, false, false, false, 4087)));
                return f88Var;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                vb vbVar5 = (vb) this.receiver;
                vbVar5.getClass();
                l97 l97Var9 = vbVar5.s;
                do {
                    value9 = l97Var9.getValue();
                } while (!l97Var9.j(value9, ob.a((ob) value9, null, null, null, null, str6, false, false, false, false, str6.length() > 500, false, 3567)));
                return f88Var;
            case ep1.d /* 12 */:
                String str7 = (String) obj;
                str7.getClass();
                vb vbVar6 = (vb) this.receiver;
                vbVar6.getClass();
                int length3 = str7.length();
                boolean z2 = (3 > length3 || length3 >= 51) && str7.length() > 0;
                l97 l97Var10 = vbVar6.u;
                do {
                    value10 = l97Var10.getValue();
                } while (!l97Var10.j(value10, ib.a((ib) value10, false, false, str7, null, null, null, z2, 187)));
                if (!z2 && (account = vbVar6.A) != null && (rolloutConfiguration = vbVar6.B) != null) {
                    im3.R(e8.n(vbVar6), vbVar6.r, null, new j0((Object) vbVar6, (Object) account, (Object) rolloutConfiguration, (hc1) null, (byte) 3), 2);
                }
                return f88Var;
            case 13:
                List list = (List) obj;
                list.getClass();
                ((vb) this.receiver).f1(list);
                return f88Var;
            case 14:
                l33 l33Var5 = (l33) obj;
                l33Var5.getClass();
                vb vbVar7 = (vb) this.receiver;
                vbVar7.getClass();
                l97 l97Var11 = vbVar7.u;
                do {
                    value11 = l97Var11.getValue();
                } while (!l97Var11.j(value11, ib.a((ib) value11, false, false, null, null, null, null, false, 127)));
                vbVar7.f1(qf0.K(l33Var5));
                return f88Var;
            case 15:
                String str8 = (String) obj;
                str8.getClass();
                vb vbVar8 = (vb) this.receiver;
                vbVar8.getClass();
                qi7 qi7Var = qi7.g;
                if (qi7Var == null) {
                    im3.e0("instance");
                    throw null;
                }
                qi7Var.a();
                qi7 qi7Var2 = qi7.g;
                if (qi7Var2 == null) {
                    im3.e0("instance");
                    throw null;
                }
                qi7Var2.c(str8);
                vbVar8.X0(b27.a);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((mj) this.receiver).d((ll0) obj);
                return f88Var;
            case 17:
                ((mj) this.receiver).d((ll0) obj);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((nw4) this.receiver).postValue((Boolean) obj);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((nw4) this.receiver).postValue((Boolean) obj);
                return f88Var;
            case 20:
                ((nw4) this.receiver).postValue((Boolean) obj);
                return f88Var;
            case 21:
                String str9 = (String) obj;
                str9.getClass();
                n81 n81Var = (n81) this.receiver;
                n81Var.getClass();
                l97 l97Var12 = n81Var.r;
                do {
                    value12 = l97Var12.getValue();
                } while (!l97Var12.j(value12, i81.a((i81) value12, null, false, str9, null, !ub7.b0(str9) && str9.length() <= 50, false, null, false, false, false, false, 2027)));
                return f88Var;
            case 22:
                String str10 = (String) obj;
                str10.getClass();
                n81 n81Var2 = (n81) this.receiver;
                n81Var2.getClass();
                l97 l97Var13 = n81Var2.r;
                do {
                    value13 = l97Var13.getValue();
                } while (!l97Var13.j(value13, i81.a((i81) value13, null, false, null, str10, false, str10.length() <= 500, null, false, false, false, false, 2007)));
                return f88Var;
            case 23:
                String str11 = (String) obj;
                str11.getClass();
                ru1 ru1Var = (ru1) this.receiver;
                ru1Var.getClass();
                l97 l97Var14 = ru1Var.z;
                do {
                    value14 = l97Var14.getValue();
                } while (!l97Var14.j(value14, wt1.a((wt1) value14, false, null, null, false, false, false, false, false, false, false, false, str11, null, null, null, false, null, false, null, null, false, str11.length() <= 50, false, 12578815)));
                return f88Var;
            case 24:
                String str12 = (String) obj;
                str12.getClass();
                ru1 ru1Var2 = (ru1) this.receiver;
                ru1Var2.getClass();
                l97 l97Var15 = ru1Var2.z;
                do {
                    value15 = l97Var15.getValue();
                } while (!l97Var15.j(value15, wt1.a((wt1) value15, false, null, null, false, false, false, false, false, false, false, false, null, str12, null, null, false, null, false, null, null, false, false, false, 16769023)));
                return f88Var;
            case 25:
                String str13 = (String) obj;
                str13.getClass();
                ru1 ru1Var3 = (ru1) this.receiver;
                ru1Var3.getClass();
                l97 l97Var16 = ru1Var3.z;
                do {
                    value16 = l97Var16.getValue();
                } while (!l97Var16.j(value16, wt1.a((wt1) value16, false, null, null, false, false, false, false, false, false, false, false, null, null, str13, null, false, null, false, null, null, false, false, str13.length() <= 500, 8372223)));
                return f88Var;
            case 26:
                Set set = (Set) obj;
                set.getClass();
                ru1 ru1Var4 = (ru1) this.receiver;
                ru1Var4.getClass();
                Collection collectionZ = ru1Var4.R != null ? fv6.Z(set, ru1Var4.S) : la2.m;
                n87 n87Var = ru1Var4.U;
                hc1 hc1Var2 = null;
                if (n87Var != null) {
                    n87Var.j(null);
                }
                ru1Var4.U = null;
                l97 l97Var17 = ru1Var4.z;
                while (true) {
                    Object value17 = l97Var17.getValue();
                    wt1 wt1Var = (wt1) value17;
                    Collection collection = collectionZ;
                    Set set2 = set;
                    if (l97Var17.j(value17, wt1.a(wt1Var, false, null, null, false, false, false, false, false, false, false, false, null, null, null, set2, !set.equals(ru1Var4.S), lv0.q0(wt1Var.q, collectionZ), !collection.isEmpty(), null, null, false, false, false, 16285695))) {
                        if (!collection.isEmpty() && (du1Var = ru1Var4.R) != null) {
                            ru1Var4.U = im3.R(e8.n(ru1Var4), ru1Var4.x, null, new j0((Object) ru1Var4, (Object) collectionZ, (Object) du1Var, hc1Var2, (byte) 25), 2);
                        }
                        return f88Var;
                    }
                    set = set2;
                }
                break;
            case 27:
                UUID uuid = (UUID) obj;
                ru1 ru1Var5 = (ru1) this.receiver;
                l97 l97Var18 = ru1Var5.z;
                while (true) {
                    Object value18 = l97Var18.getValue();
                    wt1 wt1Var2 = (wt1) value18;
                    ns1 ns1VarY0 = ru1Var5.Y0();
                    UUID uuid2 = uuid;
                    if (l97Var18.j(value18, wt1.a(wt1Var2, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, uuid2, !im3.n(ns1VarY0 != null ? ns1VarY0.f1598o : null, uuid), false, false, 13631487))) {
                        return f88Var;
                    }
                    uuid = uuid2;
                }
                break;
            case 28:
                d37 d37Var = (d37) obj;
                d37Var.getClass();
                ((hz1) this.receiver).W0(d37Var);
                return f88Var;
            default:
                ((hz1) this.receiver).K.k((l33) obj);
                return f88Var;
        }
    }
}
