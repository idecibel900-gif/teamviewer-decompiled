package o;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0016²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"Lo/fw1;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "<init>", "()V", "Lo/j35;", "newGroupState", "", "Lo/l33;", "allGroups", "Lo/gl4;", "cacheState", "", "isManagedDevicesCacheSnackbarRequested", "areGroupsLoading", "legacyGroups", "managedGroups", "shouldShowSearchView", "hasInternet", "Lo/yr6;", "serviceQueueWaitingRoomState", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fw1 extends ut2 implements oq0 {
    public bb5 p0;

    public final void A0(fs4 fs4Var, hz1 hz1Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        hz1 hz1Var2;
        fs4 fs4Var3;
        hz1 hz1Var3;
        boolean z;
        aw awVar;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1124767309);
        int i2 = i | 22 | (ux2Var2.h(this) ? 256 : 128);
        byte b = 1;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                dl5 dl5Var = new dl5(new vr1((byte) 17), (byte) 1);
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    hz1 hz1Var4 = (hz1) g57.t(w86.a.b(hz1.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var2);
                    fs4Var3 = cs4.b;
                    hz1Var3 = hz1Var4;
                }
            } else {
                ux2Var2.Q();
                fs4Var3 = fs4Var;
                hz1Var3 = hz1Var;
            }
            ux2Var2.q();
            final px4 px4VarG = g57.g(hz1Var3.u, ux2Var2);
            final px4 px4VarG2 = g57.g(hz1Var3.w, ux2Var2);
            final px4 px4VarG3 = g57.g(hz1Var3.y, ux2Var2);
            final px4 px4VarV = et1.v(hz1Var3.s, ux2Var2);
            final a06 a06VarD0 = ds1.d0((Configuration) ux2Var2.j(lh.a), vn4.Y(p0(), ux2Var2), new l51(p0()), ux2Var2);
            final px4 px4VarV2 = et1.v(hz1Var3.L, ux2Var2);
            final px4 px4VarV3 = et1.v(hz1Var3.F, ux2Var2);
            px4 px4VarV4 = et1.v(hz1Var3.H, ux2Var2);
            final px4 px4VarV5 = et1.v(hz1Var3.M, ux2Var2);
            final px4 px4VarV6 = et1.v(hz1Var3.N, ux2Var2);
            final px4 px4VarV7 = et1.v(hz1Var3.O, ux2Var2);
            final px4 px4VarV8 = et1.v(hz1Var3.K, ux2Var2);
            final px4 px4VarV9 = et1.v(hz1Var3.A, ux2Var2);
            final px4 px4VarV10 = et1.v(a06VarD0.f, ux2Var2);
            Object objK = ux2Var2.K();
            aw awVar2 = e01.a;
            if (objK == awVar2) {
                objK = h57.p(null);
                ux2Var2.g0(objK);
            }
            final px4 px4Var = (px4) objK;
            boolean z2 = ((yr6) px4Var.getValue()) != null;
            Object objK2 = ux2Var2.K();
            if (objK2 == awVar2) {
                objK2 = new q37();
                ux2Var2.g0(objK2);
            }
            final q37 q37Var = (q37) objK2;
            boolean zF = ux2Var2.f(a06VarD0);
            Object objK3 = ux2Var2.K();
            if (zF || objK3 == awVar2) {
                objK3 = new s21(q37Var, a06VarD0, b);
                ux2Var2.g0(objK3);
            }
            final Function1 function1 = (Function1) objK3;
            Object objK4 = ux2Var2.K();
            if (objK4 == awVar2) {
                objK4 = new t21(q37Var, (byte) 1);
                ux2Var2.g0(objK4);
            }
            final Function0 function0 = (Function0) objK4;
            boolean zH = ux2Var2.h(this);
            Object objK5 = ux2Var2.K();
            if (zH || objK5 == awVar2) {
                objK5 = new m5((Object) q37Var, (Object) this, (Object) function0, (byte) 17);
                ux2Var2.g0(objK5);
            }
            Function1 function2 = (Function1) objK5;
            io1.i(hz1Var3.C, function1, function2, ux2Var2, 0);
            boolean zBooleanValue = ((Boolean) px4VarV4.getValue()).booleanValue();
            boolean zH2 = ux2Var2.h(hz1Var3);
            Object objK6 = ux2Var2.K();
            if (zH2 || objK6 == awVar2) {
                z = z2;
                awVar = awVar2;
                objK6 = new i0(1, hz1Var3, hz1.class, "showSnackbar", "showSnackbar(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/main/data/SnackBarType;)V", 0, (byte) 28);
                ux2Var2.g0(objK6);
            } else {
                awVar = awVar2;
                z = z2;
            }
            xo1.j(zBooleanValue, (Function1) ((pu3) objK6), function2, ux2Var2, 0);
            boolean zH3 = ux2Var2.h(hz1Var3);
            Object objK7 = ux2Var2.K();
            if (zH3 || objK7 == awVar) {
                objK7 = new ac(hz1Var3, null, (byte) 5);
                ux2Var2.g0(objK7);
            }
            ck3.i(f88.a, (hw2) objK7, ux2Var2);
            Boolean bool = (Boolean) r33.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(z);
            final boolean z3 = z;
            boolean zH4 = ux2Var2.h(this) | ux2Var2.f(r33) | ux2Var2.g(z3);
            Object objK8 = ux2Var2.K();
            if (zH4 || objK8 == awVar) {
                objK8 = new oa1(this, z3, (px4) r33, (hc1) null);
                ux2Var2.g0(objK8);
            }
            ck3.h(bool, boolValueOf, (hw2) objK8, ux2Var2);
            final fs4 fs4Var4 = fs4Var3;
            final hz1 hz1Var5 = hz1Var3;
            hw2 hw2Var = new hw2() { // from class: o.cw1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4;
                    aw awVar3;
                    hz1 hz1Var6;
                    byte b2;
                    ux2 ux2Var3 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objK9 = ux2Var3.K();
                        aw awVar4 = e01.a;
                        if (objK9 == awVar4) {
                            objK9 = new h31((byte) 23);
                            ux2Var3.g0(objK9);
                        }
                        fs4 fs4VarS = au8.s(cp6.a(fs4Var4, false, (Function1) objK9), ((rn4) ux2Var3.j(un4.a)).a.p, kh.V);
                        WeakHashMap weakHashMap = wk8.w;
                        h94 h94Var = new h94(b77.g(ux2Var3).l, 15 | 16);
                        yy0 yy0VarO = au8.O(847472371, new l21(q37Var, (byte) 1), ux2Var3);
                        boolean z5 = z3;
                        i97 i97Var = px4VarG2;
                        i97 i97Var2 = px4VarG;
                        hz1 hz1Var7 = hz1Var5;
                        px4 px4Var2 = px4VarV9;
                        yy0 yy0VarO2 = au8.O(289488308, new xa(z5, i97Var, i97Var2, hz1Var7, px4Var2), ux2Var3);
                        i97 i97Var3 = px4VarV8;
                        nv1.g(fs4VarS, null, null, yy0VarO, yy0VarO2, 0, 0L, 0L, h94Var, au8.O(929269884, new dw1(i97Var2, hz1Var7, i97Var3, this, function1, function0, px4VarV3, px4VarV2, px4Var2, px4VarV5, px4VarV10, px4Var, a06VarD0), ux2Var3), ux2Var3, 805334016, 230);
                        mv1 mv1Var = (mv1) px4VarG3.getValue();
                        if (mv1Var == null) {
                            ux2Var3.W(-185030112);
                            z4 = false;
                            ux2Var3.p(false);
                            hz1Var6 = hz1Var7;
                            awVar3 = awVar4;
                        } else {
                            z4 = false;
                            ux2Var3.W(-185030111);
                            int iOrdinal = mv1Var.ordinal();
                            i97 i97Var4 = px4VarV6;
                            if (iOrdinal == 0) {
                                awVar3 = awVar4;
                                ux2Var3.W(-177267692);
                                Object value = i97Var3.getValue();
                                l33 l33Var = (l33) value;
                                if ((l33Var != null ? l33Var.a : null) instanceof h33) {
                                    value = null;
                                }
                                l33 l33Var2 = (l33) value;
                                boolean zContains = ((ch2) i97Var.getValue()).b.contains(bh2.n);
                                List list = (List) i97Var4.getValue();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj3 : list) {
                                    if (((l33) obj3).d) {
                                        arrayList.add(obj3);
                                    }
                                }
                                List list2 = (List) px4VarV7.getValue();
                                boolean zH5 = ux2Var3.h(hz1Var7);
                                Object objK10 = ux2Var3.K();
                                if (zH5 || objK10 == awVar3) {
                                    objK10 = new m9(0, hz1Var7, hz1.class, "openAddGroupDialog", "openAddGroupDialog()V", 0, (byte) 27);
                                    hz1Var6 = hz1Var7;
                                    ux2Var3.g0(objK10);
                                } else {
                                    hz1Var6 = hz1Var7;
                                }
                                Function0 function3 = (Function0) ((pu3) objK10);
                                boolean zH6 = ux2Var3.h(hz1Var6);
                                Object objK11 = ux2Var3.K();
                                if (zH6 || objK11 == awVar3) {
                                    objK11 = new aw1(hz1Var6, (byte) 0);
                                    ux2Var3.g0(objK11);
                                }
                                Function0 function4 = (Function0) objK11;
                                boolean zH7 = ux2Var3.h(hz1Var6);
                                Object objK12 = ux2Var3.K();
                                if (zH7 || objK12 == awVar3) {
                                    objK12 = new bw1(hz1Var6, (byte) 0);
                                    ux2Var3.g0(objK12);
                                }
                                lv1.i(zContains, l33Var2, arrayList, list2, function3, function4, (Function1) objK12, null, null, ux2Var3, 0);
                                ux2Var3.p(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw fx3.m(-1391193355, ux2Var3, false);
                                }
                                ux2Var3.W(-176398080);
                                List list3 = (List) i97Var4.getValue();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj4 : list3) {
                                    if (((l33) obj4).d) {
                                        arrayList2.add(obj4);
                                    }
                                }
                                boolean zH8 = ux2Var3.h(hz1Var7);
                                Object objK13 = ux2Var3.K();
                                awVar3 = awVar4;
                                if (zH8 || objK13 == awVar3) {
                                    objK13 = new aw1(hz1Var7, (byte) 1);
                                    ux2Var3.g0(objK13);
                                }
                                Function0 function5 = (Function0) objK13;
                                boolean zH9 = ux2Var3.h(hz1Var7);
                                Object objK14 = ux2Var3.K();
                                if (zH9 || objK14 == awVar3) {
                                    objK14 = new bw1(hz1Var7, (byte) 1);
                                    ux2Var3.g0(objK14);
                                }
                                ck3.c(arrayList2, function5, (Function1) objK14, null, null, ux2Var3, 0);
                                ux2Var3.p(false);
                                hz1Var6 = hz1Var7;
                            }
                            ux2Var3.p(false);
                        }
                        i97 i97Var5 = px4VarV;
                        if (((j35) i97Var5.getValue()).e) {
                            ux2Var3.W(-183629841);
                            String str = ((j35) i97Var5.getValue()).a;
                            boolean zH10 = ux2Var3.h(hz1Var6);
                            Object objK15 = ux2Var3.K();
                            if (zH10 || objK15 == awVar3) {
                                objK15 = new ew1(1, hz1Var6, hz1.class, "setGroupName", "setGroupName(Ljava/lang/String;)V", 0, (byte) 0);
                                ux2Var3.g0(objK15);
                            }
                            boolean z6 = ((j35) i97Var5.getValue()).c;
                            boolean z7 = ((j35) i97Var5.getValue()).b;
                            boolean z8 = ((j35) i97Var5.getValue()).d;
                            Function1 function6 = (Function1) ((pu3) objK15);
                            boolean zH11 = ux2Var3.h(hz1Var6);
                            Object objK16 = ux2Var3.K();
                            if (zH11 || objK16 == awVar3) {
                                b2 = 2;
                                objK16 = new aw1(hz1Var6, (byte) 2);
                                ux2Var3.g0(objK16);
                            } else {
                                b2 = 2;
                            }
                            Function0 function7 = (Function0) objK16;
                            boolean zH12 = ux2Var3.h(hz1Var6);
                            Object objK17 = ux2Var3.K();
                            if (zH12 || objK17 == awVar3) {
                                objK17 = new bw1(hz1Var6, b2);
                                ux2Var3.g0(objK17);
                            }
                            mo8.a(str, function6, z6, z7, z8, function7, (Function1) objK17, ux2Var3, 0);
                            ux2Var3.p(z4);
                        } else {
                            ux2Var3.W(-183148907);
                            ux2Var3.p(z4);
                        }
                    } else {
                        ux2Var3.Q();
                    }
                    return f88.a;
                }
            };
            ux2Var2 = ux2Var;
            ut7.a(au8.O(418230701, hw2Var, ux2Var2), ux2Var2, 48);
            hz1Var2 = hz1Var5;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            hz1Var2 = hz1Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((byte) 11, i, this, fs4Var2, hz1Var2, false);
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        KeyEvent.Callback callbackC = C();
        jd3 jd3Var = callbackC instanceof jd3 ? (jd3) callbackC : null;
        if (jd3Var != null) {
            ((MainActivity) jd3Var).Y();
        }
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setContent(new yy0(-519376741, true, new t0(this, (byte) 21)));
        return composeView;
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Partnerlist;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
        this.p0 = bb5Var;
    }
}
