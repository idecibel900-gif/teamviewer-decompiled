package o;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f57 {
    public static boolean a = true;

    public static final bd2 a(ke3 ke3Var, Throwable th) {
        xd3 xd3Var;
        if (th instanceof v55) {
            Function1 function1 = ke3Var.f1255o;
            he3 he3Var = ke3Var.u;
            xd3Var = (xd3) function1.invoke(ke3Var);
            if (xd3Var == null) {
                xd3Var = (xd3) he3Var.j.invoke(ke3Var);
            }
            if (xd3Var == null && (xd3Var = (xd3) ke3Var.n.invoke(ke3Var)) == null) {
                xd3Var = (xd3) he3Var.i.invoke(ke3Var);
            }
        } else {
            xd3Var = (xd3) ke3Var.n.invoke(ke3Var);
            if (xd3Var == null) {
                xd3Var = (xd3) ke3Var.u.i.invoke(ke3Var);
            }
        }
        return new bd2(xd3Var, ke3Var, th);
    }

    public static final void b(eg3 eg3Var, fs4 fs4Var, String str, dg3 dg3Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        String str2;
        dg3 dg3Var2;
        fs4 fs4Var3;
        dg3 dg3Var3;
        String strM;
        int i2;
        int i3;
        ux2Var.Y(1964048855);
        int i4 = i | (ux2Var.d(eg3Var == null ? -1 : eg3Var.ordinal()) ? 4 : 2) | 1456;
        byte b = 1;
        if (ux2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            ux2Var.S();
            byte b2 = 28;
            if ((i & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new uf2(b2), b);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                dg3 dg3Var4 = (dg3) g57.t(w86.a.b(dg3.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                fs4Var3 = cs4.b;
                dg3Var3 = dg3Var4;
                str2 = "TVTA-settings-upgrade";
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                str2 = str;
                dg3Var3 = dg3Var;
            }
            ux2Var.q();
            Activity activity = (Activity) ux2Var.j(tc4.a);
            Context context = (Context) ux2Var.j(lh.b);
            int i5 = eg3Var == null ? -1 : he7.a[eg3Var.ordinal()];
            if (i5 == -1) {
                ux2Var.W(640634567);
                ux2Var.p(false);
                strM = "";
            } else {
                if (i5 == 1) {
                    i2 = 1960322016;
                    i3 = R.string.settings_upgrade;
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        throw fx3.m(1960319793, ux2Var, false);
                    }
                    ux2Var.W(640634567);
                    ux2Var.p(false);
                    strM = "";
                } else {
                    i2 = 1960324812;
                    i3 = R.string.settings_manage_subscription;
                }
                strM = to7.m(ux2Var, i2, i3, ux2Var, false);
            }
            boolean zH = ux2Var.h(dg3Var3) | ux2Var.h(activity);
            Object objK = ux2Var.K();
            hc1 hc1Var = null;
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new vt4(dg3Var3, activity, hc1Var, b2);
                ux2Var.g0(objK);
            }
            f88 f88Var = f88.a;
            ck3.i(f88Var, (hw2) objK, ux2Var);
            boolean zH2 = ux2Var.h(dg3Var3) | ux2Var.h(context);
            Object objK2 = ux2Var.K();
            if (zH2 || objK2 == awVar) {
                objK2 = new vt4(dg3Var3, context, hc1Var, (byte) 29);
                ux2Var.g0(objK2);
            }
            ck3.i(f88Var, (hw2) objK2, ux2Var);
            yk7 yk7Var = new yk7(R.drawable.upgrade);
            strM.getClass();
            sk7 sk7Var = new sk7(new n78(strM), null, yk7Var, null, 26);
            boolean zH3 = ux2Var.h(dg3Var3);
            Object objK3 = ux2Var.K();
            if (zH3 || objK3 == awVar) {
                objK3 = new y26(dg3Var3, (byte) 23);
                ux2Var.g0(objK3);
            }
            x37.e(sk7Var, fs4Var3, null, (Function0) objK3, str2, ux2Var, 24624, 36);
            fs4Var2 = fs4Var3;
            dg3Var2 = dg3Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            str2 = str;
            dg3Var2 = dg3Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) eg3Var, fs4Var2, (Object) str2, (Object) dg3Var2, i, (byte) 18);
        }
    }

    public static final void c(boolean z, yy0 yy0Var, fs4 fs4Var, vk7 vk7Var, gw gwVar, ux2 ux2Var, int i) {
        int i2;
        gw gwVar2;
        gw gwVar3;
        Object next;
        int i3;
        pd5 pd5Var;
        ux2Var.Y(-371712586);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.d(R.raw.lottie_animation_onboarding_tv) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? ux2Var.f(vk7Var) : ux2Var.h(vk7Var) ? 16384 : 8192;
        }
        int i4 = i2 | 1769472;
        if (ux2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                gwVar3 = iq8.g;
            } else {
                ux2Var.Q();
                gwVar3 = gwVar;
            }
            ux2Var.q();
            hk6 hk6VarW = im3.W(ux2Var);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            ux2Var.W(-733493791);
            float fO = ((in1) ux2Var.j(b11.h)).O((int) (((n54) ((mj8) ux2Var.j(b11.u))).a() & 4294967295L));
            ux2Var.p(false);
            Iterator it = rk7.g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (w32.a(fO, ((oj6) next).a) > 0);
            oj6 oj6Var = (oj6) next;
            if (oj6Var == null) {
                oj6Var = rk7.a;
            }
            float f = oj6Var.b * fO;
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarT = o77.t(fs4Var.f(fillElement), hk6VarW, me1Var);
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(gwVar3, w50Var, ux2Var, (((i4 >> 12) & 112) >> 3) & 14);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarT);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z2 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            oj6 oj6Var2 = rk7.a;
            int iA = w32.a(fO, 540.0f);
            cs4 cs4Var = cs4.b;
            if (iA > 0) {
                i3 = i4;
                ux2Var.W(-1007892186);
                fs4 fs4VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), f);
                kw0 kw0VarA2 = iw0.a(iq8.c, w50Var, ux2Var, 0);
                int iHashCode2 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL2 = ux2Var.l();
                fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                o67.n(kw0VarA2, iz0Var, ux2Var);
                o67.n(yj5VarL2, iz0Var2, ux2Var);
                e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                o67.n(fs4VarS2, iz0Var4, ux2Var);
                if (z) {
                    pd5Var = rk7.b;
                } else {
                    pd5Var = w32.a(fO, 540.0f) > 0 ? rk7.c : rk7.d;
                }
                r47.h(vk7Var, ka0.A(fillElement, pd5Var), ux2Var, ((i3 >> 3) & 14) | 64 | ((i3 >> 9) & 112));
                ux2Var.p(true);
                ux2Var.p(false);
            } else {
                i3 = i4;
                ux2Var.W(-1007027038);
                b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, f));
                ux2Var.p(false);
            }
            kw0 kw0VarA3 = iw0.a(iq8.d, w50Var, ux2Var, 6);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS3 = uf0.s(ux2Var, fillElement);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA3, iz0Var, ux2Var);
            o67.n(yj5VarL3, iz0Var2, ux2Var);
            e41.r(iHashCode3, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS3, iz0Var4, ux2Var);
            yy0Var.invoke(ux2Var, Integer.valueOf((i3 >> 6) & 14));
            ux2Var.W(834296207);
            ux2Var.p(false);
            ux2Var.p(true);
            ux2Var.p(true);
            gwVar2 = gwVar3;
        } else {
            ux2Var.Q();
            gwVar2 = gwVar;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new q23(z, yy0Var, fs4Var, vk7Var, gwVar2, i, (byte) 2);
        }
    }

    public static final void d(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var, boolean z) {
        int i2;
        px4 px4Var;
        ux2Var.Y(-315191511);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = h57.p(null);
                ux2Var.g0(objK);
            }
            px4 px4Var2 = (px4) objK;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            boolean zH = ux2Var.h(lifecycleOwner);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == obj) {
                objK2 = new jh8(lifecycleOwner, px4Var2, b2);
                ux2Var.g0(objK2);
            }
            ck3.e(lifecycleOwner, (Function1) objK2, ux2Var);
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 24.0f, 0.0f, 2);
            kw0 kw0VarA = iw0.a(new ew(16.0f, new hk0(b)), xz2.B, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarD);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            boolean z2 = z && ((gf4) px4Var2.getValue()) == null;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z3 = (i2 & 112) == 32;
            Object objK3 = ux2Var.K();
            if (z3 || objK3 == obj) {
                objK3 = new ot1(function0, px4Var2, (byte) 7);
                ux2Var.g0(objK3);
            }
            m77.g((Function0) objK3, fs4VarC, null, z2, "TVTA-connectScreen-AccountRequiredBottomSheet-signIn", null, au8.O(312191332, new kh8(px4Var2, (byte) 2), ux2Var), ux2Var, 1597488, 36);
            boolean z4 = z && ((gf4) px4Var2.getValue()) == null;
            d90 d90Var = new d90(1.0f, new t57(vv0.r));
            fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            boolean z5 = (i2 & 896) == 256;
            Object objK4 = ux2Var.K();
            if (z5 || objK4 == obj) {
                px4Var = px4Var2;
                objK4 = new ot1(function1, px4Var, (byte) 8);
                ux2Var.g0(objK4);
            } else {
                px4Var = px4Var2;
            }
            g57.b((Function0) objK4, fs4VarC2, null, z4, "TVTA-connectScreen-AccountRequiredBottomSheet-createAnAccount", d90Var, au8.O(1091280802, new kh8(px4Var, (byte) 3), ux2Var), ux2Var, 1597488, 4);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new w46(z, function0, function1, fs4Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x011c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0120  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0171  */
    /* JADX WARN: Code duplicated, block: B:92:0x0182  */
    /* JADX WARN: Code duplicated, block: B:93:0x01be  */
    /* JADX WARN: Code duplicated, block: B:96:0x0225  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0241  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    public static final void e(final boolean z, final Function0 function0, final Function0 function1, final String str, final fs4 fs4Var, boolean z2, boolean z3, ux2 ux2Var, final int i, final int i2) {
        int i3;
        Function0 function2;
        Function0 function3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        final boolean z7;
        final boolean z8;
        ux2 ux2Var2;
        j56 j56VarR;
        boolean z9;
        boolean z10;
        Object objK;
        boolean z11;
        Function0 function4;
        cs4 cs4Var;
        fs4 fs4VarQ;
        ?? r1;
        float f;
        ux2 ux2Var3;
        fs4 fs4VarQ2;
        ux2 ux2Var4 = ux2Var;
        function0.getClass();
        function1.getClass();
        str.getClass();
        ux2Var4.Y(-338257876);
        if ((i & 6) == 0) {
            i3 = (ux2Var4.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function2 = function0;
            i3 |= ux2Var4.h(function2) ? 32 : 16;
        } else {
            function2 = function0;
        }
        if ((i & 384) == 0) {
            function3 = function1;
            i3 |= ux2Var4.h(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var4.f(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var4.f(fs4Var) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                z4 = z2;
                i3 |= ux2Var4.g(z4) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z5 = z3;
                    if (ux2Var4.g(z5)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((599187 & i3) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (ux2Var4.N(i3 & 1, z6)) {
                    if (i6 != 0) {
                        z9 = true;
                    } else {
                        z9 = z4;
                    }
                    if (i4 != 0) {
                        z10 = false;
                    } else {
                        z10 = z5;
                    }
                    hk6 hk6VarW = im3.W(ux2Var4);
                    objK = ux2Var4.K();
                    if (objK == e01.a) {
                        objK = ck3.w(ux2Var4);
                        ux2Var4.g0(objK);
                    }
                    fs4 fs4VarB = ka0.B(o77.t(fs4Var.f(androidx.compose.foundation.layout.b.c), hk6VarW, (me1) objK), 24.0f);
                    cw cwVar = iq8.e;
                    w50 w50Var = xz2.B;
                    kw0 kw0VarA = iw0.a(cwVar, w50Var, ux2Var4, 54);
                    int iHashCode = Long.hashCode(ux2Var4.T);
                    yj5 yj5VarL = ux2Var4.l();
                    fs4 fs4VarS = uf0.s(ux2Var4, fs4VarB);
                    yz0.c.getClass();
                    ux2Var4.a0();
                    z11 = ux2Var4.S;
                    function4 = LayoutNode.e0;
                    if (z11) {
                        ux2Var4.k(function4);
                    } else {
                        ux2Var4.j0();
                    }
                    iz0 iz0Var = d82.v;
                    o67.n(kw0VarA, iz0Var, ux2Var4);
                    iz0 iz0Var2 = d82.u;
                    o67.n(yj5VarL, iz0Var2, ux2Var4);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    iz0 iz0Var3 = d82.w;
                    o67.n(numValueOf, iz0Var3, ux2Var4);
                    o67.l(ux2Var4);
                    iz0 iz0Var4 = d82.t;
                    o67.n(fs4VarS, iz0Var4, ux2Var4);
                    cs4Var = cs4.b;
                    if (z10) {
                        fs4VarQ = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, 1);
                    } else {
                        fs4VarQ = cs4Var;
                    }
                    kw0 kw0VarA2 = iw0.a(iq8.c, w50Var, ux2Var4, 48);
                    int i7 = i3;
                    int iHashCode2 = Long.hashCode(ux2Var4.T);
                    yj5 yj5VarL2 = ux2Var4.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarQ);
                    ux2Var4.a0();
                    if (ux2Var4.S) {
                        ux2Var4.k(function4);
                    } else {
                        ux2Var4.j0();
                    }
                    o67.n(kw0VarA2, iz0Var, ux2Var4);
                    o67.n(yj5VarL2, iz0Var2, ux2Var4);
                    e41.r(iHashCode2, ux2Var4, iz0Var3, ux2Var4);
                    o67.n(fs4VarS2, iz0Var4, ux2Var4);
                    if (z9) {
                        ux2Var4.W(-50635988);
                        f = 24.0f;
                        r1 = 1;
                        qs1.l(lv1.T(R.drawable.type_sign_in, ux2Var4, 0), null, ka0.F(androidx.compose.foundation.layout.b.f(cs4Var, 0.0f, 240.0f, 1), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, null, 0.0f, null, ux2Var, 440, 120);
                        ux2 ux2Var5 = ux2Var;
                        ux2Var5.p(false);
                        ux2Var3 = ux2Var5;
                    } else {
                        ux2 ux2Var6 = ux2Var4;
                        r1 = 1;
                        f = 24.0f;
                        ux2Var6.W(-50330390);
                        ux2Var6.p(false);
                        ux2Var3 = ux2Var6;
                    }
                    zw5 zw5Var = un4.a;
                    ux2 ux2Var7 = ux2Var3;
                    qs7.b(str, ka0.F(cs4Var, f, 0.0f, f, f, 2), ((rn4) ux2Var3.j(zw5Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 2, false, 3, 3, null, ((rn4) ux2Var3.j(zw5Var)).b.j, ux2Var7, ((i7 >> 9) & 14) | 48, 221568, 76792);
                    ux2 ux2Var8 = ux2Var7;
                    ux2Var8.p(r1);
                    if (z10) {
                        fs4VarQ2 = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, r1);
                    } else {
                        fs4VarQ2 = cs4Var;
                    }
                    d(i7 & 1022, function2, function3, ux2Var8, fs4VarQ2, z);
                    ux2Var8.p(r1);
                    z7 = z9;
                    z8 = z10;
                    ux2Var2 = ux2Var8;
                } else {
                    ux2Var4.Q();
                    z7 = z4;
                    z8 = z5;
                    ux2Var2 = ux2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.xh8
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            f57.e(z, function0, function1, str, fs4Var, z7, z8, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z5 = z3;
            if ((599187 & i3) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (ux2Var4.N(i3 & 1, z6)) {
                if (i6 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i4 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                hk6 hk6VarW2 = im3.W(ux2Var4);
                objK = ux2Var4.K();
                if (objK == e01.a) {
                    objK = ck3.w(ux2Var4);
                    ux2Var4.g0(objK);
                }
                fs4 fs4VarB2 = ka0.B(o77.t(fs4Var.f(androidx.compose.foundation.layout.b.c), hk6VarW2, (me1) objK), 24.0f);
                cw cwVar2 = iq8.e;
                w50 w50Var2 = xz2.B;
                kw0 kw0VarA3 = iw0.a(cwVar2, w50Var2, ux2Var4, 54);
                int iHashCode3 = Long.hashCode(ux2Var4.T);
                yj5 yj5VarL3 = ux2Var4.l();
                fs4 fs4VarS3 = uf0.s(ux2Var4, fs4VarB2);
                yz0.c.getClass();
                ux2Var4.a0();
                z11 = ux2Var4.S;
                function4 = LayoutNode.e0;
                if (z11) {
                    ux2Var4.k(function4);
                } else {
                    ux2Var4.j0();
                }
                iz0 iz0Var5 = d82.v;
                o67.n(kw0VarA3, iz0Var5, ux2Var4);
                iz0 iz0Var6 = d82.u;
                o67.n(yj5VarL3, iz0Var6, ux2Var4);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                iz0 iz0Var7 = d82.w;
                o67.n(numValueOf2, iz0Var7, ux2Var4);
                o67.l(ux2Var4);
                iz0 iz0Var8 = d82.t;
                o67.n(fs4VarS3, iz0Var8, ux2Var4);
                cs4Var = cs4.b;
                if (z10) {
                    fs4VarQ = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, 1);
                } else {
                    fs4VarQ = cs4Var;
                }
                kw0 kw0VarA4 = iw0.a(iq8.c, w50Var2, ux2Var4, 48);
                int i8 = i3;
                int iHashCode4 = Long.hashCode(ux2Var4.T);
                yj5 yj5VarL4 = ux2Var4.l();
                fs4 fs4VarS4 = uf0.s(ux2Var4, fs4VarQ);
                ux2Var4.a0();
                if (ux2Var4.S) {
                    ux2Var4.k(function4);
                } else {
                    ux2Var4.j0();
                }
                o67.n(kw0VarA4, iz0Var5, ux2Var4);
                o67.n(yj5VarL4, iz0Var6, ux2Var4);
                e41.r(iHashCode4, ux2Var4, iz0Var7, ux2Var4);
                o67.n(fs4VarS4, iz0Var8, ux2Var4);
                if (z9) {
                    ux2Var4.W(-50635988);
                    f = 24.0f;
                    r1 = 1;
                    qs1.l(lv1.T(R.drawable.type_sign_in, ux2Var4, 0), null, ka0.F(androidx.compose.foundation.layout.b.f(cs4Var, 0.0f, 240.0f, 1), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, null, 0.0f, null, ux2Var, 440, 120);
                    ux2 ux2Var9 = ux2Var;
                    ux2Var9.p(false);
                    ux2Var3 = ux2Var9;
                } else {
                    ux2 ux2Var10 = ux2Var4;
                    r1 = 1;
                    f = 24.0f;
                    ux2Var10.W(-50330390);
                    ux2Var10.p(false);
                    ux2Var3 = ux2Var10;
                }
                zw5 zw5Var2 = un4.a;
                ux2 ux2Var11 = ux2Var3;
                qs7.b(str, ka0.F(cs4Var, f, 0.0f, f, f, 2), ((rn4) ux2Var3.j(zw5Var2)).a.s, 0L, null, 0L, new qo7(3), 0L, 2, false, 3, 3, null, ((rn4) ux2Var3.j(zw5Var2)).b.j, ux2Var11, ((i8 >> 9) & 14) | 48, 221568, 76792);
                ux2 ux2Var12 = ux2Var11;
                ux2Var12.p(r1);
                if (z10) {
                    fs4VarQ2 = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, r1);
                } else {
                    fs4VarQ2 = cs4Var;
                }
                d(i8 & 1022, function2, function3, ux2Var12, fs4VarQ2, z);
                ux2Var12.p(r1);
                z7 = z9;
                z8 = z10;
                ux2Var2 = ux2Var12;
            } else {
                ux2Var4.Q();
                z7 = z4;
                z8 = z5;
                ux2Var2 = ux2Var4;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.xh8
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f57.e(z, function0, function1, str, fs4Var, z7, z8, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 196608;
        z4 = z2;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                z5 = z3;
                if (ux2Var4.g(z5)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (ux2Var4.N(i3 & 1, z6)) {
                if (i6 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i4 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                hk6 hk6VarW3 = im3.W(ux2Var4);
                objK = ux2Var4.K();
                if (objK == e01.a) {
                    objK = ck3.w(ux2Var4);
                    ux2Var4.g0(objK);
                }
                fs4 fs4VarB3 = ka0.B(o77.t(fs4Var.f(androidx.compose.foundation.layout.b.c), hk6VarW3, (me1) objK), 24.0f);
                cw cwVar3 = iq8.e;
                w50 w50Var3 = xz2.B;
                kw0 kw0VarA5 = iw0.a(cwVar3, w50Var3, ux2Var4, 54);
                int iHashCode5 = Long.hashCode(ux2Var4.T);
                yj5 yj5VarL5 = ux2Var4.l();
                fs4 fs4VarS5 = uf0.s(ux2Var4, fs4VarB3);
                yz0.c.getClass();
                ux2Var4.a0();
                z11 = ux2Var4.S;
                function4 = LayoutNode.e0;
                if (z11) {
                    ux2Var4.k(function4);
                } else {
                    ux2Var4.j0();
                }
                iz0 iz0Var9 = d82.v;
                o67.n(kw0VarA5, iz0Var9, ux2Var4);
                iz0 iz0Var10 = d82.u;
                o67.n(yj5VarL5, iz0Var10, ux2Var4);
                Integer numValueOf3 = Integer.valueOf(iHashCode5);
                iz0 iz0Var11 = d82.w;
                o67.n(numValueOf3, iz0Var11, ux2Var4);
                o67.l(ux2Var4);
                iz0 iz0Var12 = d82.t;
                o67.n(fs4VarS5, iz0Var12, ux2Var4);
                cs4Var = cs4.b;
                if (z10) {
                    fs4VarQ = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, 1);
                } else {
                    fs4VarQ = cs4Var;
                }
                kw0 kw0VarA6 = iw0.a(iq8.c, w50Var3, ux2Var4, 48);
                int i9 = i3;
                int iHashCode6 = Long.hashCode(ux2Var4.T);
                yj5 yj5VarL6 = ux2Var4.l();
                fs4 fs4VarS6 = uf0.s(ux2Var4, fs4VarQ);
                ux2Var4.a0();
                if (ux2Var4.S) {
                    ux2Var4.k(function4);
                } else {
                    ux2Var4.j0();
                }
                o67.n(kw0VarA6, iz0Var9, ux2Var4);
                o67.n(yj5VarL6, iz0Var10, ux2Var4);
                e41.r(iHashCode6, ux2Var4, iz0Var11, ux2Var4);
                o67.n(fs4VarS6, iz0Var12, ux2Var4);
                if (z9) {
                    ux2Var4.W(-50635988);
                    f = 24.0f;
                    r1 = 1;
                    qs1.l(lv1.T(R.drawable.type_sign_in, ux2Var4, 0), null, ka0.F(androidx.compose.foundation.layout.b.f(cs4Var, 0.0f, 240.0f, 1), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, null, 0.0f, null, ux2Var, 440, 120);
                    ux2 ux2Var13 = ux2Var;
                    ux2Var13.p(false);
                    ux2Var3 = ux2Var13;
                } else {
                    ux2 ux2Var14 = ux2Var4;
                    r1 = 1;
                    f = 24.0f;
                    ux2Var14.W(-50330390);
                    ux2Var14.p(false);
                    ux2Var3 = ux2Var14;
                }
                zw5 zw5Var3 = un4.a;
                ux2 ux2Var15 = ux2Var3;
                qs7.b(str, ka0.F(cs4Var, f, 0.0f, f, f, 2), ((rn4) ux2Var3.j(zw5Var3)).a.s, 0L, null, 0L, new qo7(3), 0L, 2, false, 3, 3, null, ((rn4) ux2Var3.j(zw5Var3)).b.j, ux2Var15, ((i9 >> 9) & 14) | 48, 221568, 76792);
                ux2 ux2Var16 = ux2Var15;
                ux2Var16.p(r1);
                if (z10) {
                    fs4VarQ2 = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, r1);
                } else {
                    fs4VarQ2 = cs4Var;
                }
                d(i9 & 1022, function2, function3, ux2Var16, fs4VarQ2, z);
                ux2Var16.p(r1);
                z7 = z9;
                z8 = z10;
                ux2Var2 = ux2Var16;
            } else {
                ux2Var4.Q();
                z7 = z4;
                z8 = z5;
                ux2Var2 = ux2Var4;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.xh8
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        f57.e(z, function0, function1, str, fs4Var, z7, z8, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        z5 = z3;
        if ((599187 & i3) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (ux2Var4.N(i3 & 1, z6)) {
            if (i6 != 0) {
                z9 = true;
            } else {
                z9 = z4;
            }
            if (i4 != 0) {
                z10 = false;
            } else {
                z10 = z5;
            }
            hk6 hk6VarW4 = im3.W(ux2Var4);
            objK = ux2Var4.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var4);
                ux2Var4.g0(objK);
            }
            fs4 fs4VarB4 = ka0.B(o77.t(fs4Var.f(androidx.compose.foundation.layout.b.c), hk6VarW4, (me1) objK), 24.0f);
            cw cwVar4 = iq8.e;
            w50 w50Var4 = xz2.B;
            kw0 kw0VarA7 = iw0.a(cwVar4, w50Var4, ux2Var4, 54);
            int iHashCode7 = Long.hashCode(ux2Var4.T);
            yj5 yj5VarL7 = ux2Var4.l();
            fs4 fs4VarS7 = uf0.s(ux2Var4, fs4VarB4);
            yz0.c.getClass();
            ux2Var4.a0();
            z11 = ux2Var4.S;
            function4 = LayoutNode.e0;
            if (z11) {
                ux2Var4.k(function4);
            } else {
                ux2Var4.j0();
            }
            iz0 iz0Var13 = d82.v;
            o67.n(kw0VarA7, iz0Var13, ux2Var4);
            iz0 iz0Var14 = d82.u;
            o67.n(yj5VarL7, iz0Var14, ux2Var4);
            Integer numValueOf4 = Integer.valueOf(iHashCode7);
            iz0 iz0Var15 = d82.w;
            o67.n(numValueOf4, iz0Var15, ux2Var4);
            o67.l(ux2Var4);
            iz0 iz0Var16 = d82.t;
            o67.n(fs4VarS7, iz0Var16, ux2Var4);
            cs4Var = cs4.b;
            if (z10) {
                fs4VarQ = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, 1);
            } else {
                fs4VarQ = cs4Var;
            }
            kw0 kw0VarA8 = iw0.a(iq8.c, w50Var4, ux2Var4, 48);
            int i10 = i3;
            int iHashCode8 = Long.hashCode(ux2Var4.T);
            yj5 yj5VarL8 = ux2Var4.l();
            fs4 fs4VarS8 = uf0.s(ux2Var4, fs4VarQ);
            ux2Var4.a0();
            if (ux2Var4.S) {
                ux2Var4.k(function4);
            } else {
                ux2Var4.j0();
            }
            o67.n(kw0VarA8, iz0Var13, ux2Var4);
            o67.n(yj5VarL8, iz0Var14, ux2Var4);
            e41.r(iHashCode8, ux2Var4, iz0Var15, ux2Var4);
            o67.n(fs4VarS8, iz0Var16, ux2Var4);
            if (z9) {
                ux2Var4.W(-50635988);
                f = 24.0f;
                r1 = 1;
                qs1.l(lv1.T(R.drawable.type_sign_in, ux2Var4, 0), null, ka0.F(androidx.compose.foundation.layout.b.f(cs4Var, 0.0f, 240.0f, 1), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, null, 0.0f, null, ux2Var, 440, 120);
                ux2 ux2Var17 = ux2Var;
                ux2Var17.p(false);
                ux2Var3 = ux2Var17;
            } else {
                ux2 ux2Var18 = ux2Var4;
                r1 = 1;
                f = 24.0f;
                ux2Var18.W(-50330390);
                ux2Var18.p(false);
                ux2Var3 = ux2Var18;
            }
            zw5 zw5Var4 = un4.a;
            ux2 ux2Var19 = ux2Var3;
            qs7.b(str, ka0.F(cs4Var, f, 0.0f, f, f, 2), ((rn4) ux2Var3.j(zw5Var4)).a.s, 0L, null, 0L, new qo7(3), 0L, 2, false, 3, 3, null, ((rn4) ux2Var3.j(zw5Var4)).b.j, ux2Var19, ((i10 >> 9) & 14) | 48, 221568, 76792);
            ux2 ux2Var110 = ux2Var19;
            ux2Var110.p(r1);
            if (z10) {
                fs4VarQ2 = androidx.compose.foundation.layout.b.q(cs4Var, 364.0f, r1);
            } else {
                fs4VarQ2 = cs4Var;
            }
            d(i10 & 1022, function2, function3, ux2Var110, fs4VarQ2, z);
            ux2Var110.p(r1);
            z7 = z9;
            z8 = z10;
            ux2Var2 = ux2Var110;
        } else {
            ux2Var4.Q();
            z7 = z4;
            z8 = z5;
            ux2Var2 = ux2Var4;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.xh8
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f57.e(z, function0, function1, str, fs4Var, z7, z8, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final LinkedHashSet f(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new p61(z, uri));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kh.n(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                kh.n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static Type g(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            yq4.f();
            return null;
        }
        Type typeH = ma8.h(type, Collection.class, ma8.d(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeH instanceof WildcardType) {
            typeH = ((WildcardType) typeH).getUpperBounds()[0];
        }
        return typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean h(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? h(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return h(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof ka8 ? ((ka8) parameterizedType).f1247o : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof ka8 ? ((ka8) parameterizedType2).f1247o : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return h(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return h(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String i(wh0 wh0Var) {
        StringBuilder sb = new StringBuilder(wh0Var.size());
        for (int i = 0; i < wh0Var.size(); i++) {
            byte bA = wh0Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case ep1.b /* 9 */:
                        sb.append("\\t");
                        break;
                    case ep1.c /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case ep1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static Class j(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) j(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return j(((WildcardType) type).getUpperBounds()[0]);
        }
        yq4.s("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static final g20 k(int i) {
        if (i == 0) {
            return g20.m;
        }
        if (i == 1) {
            return g20.n;
        }
        hk0.g(fx3.f(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final g35 l(int i) {
        if (i == 0) {
            return g35.m;
        }
        if (i == 1) {
            return g35.n;
        }
        if (i == 2) {
            return g35.f853o;
        }
        if (i == 3) {
            return g35.p;
        }
        if (i == 4) {
            return g35.q;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return g35.r;
        }
        hk0.g(fx3.f(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final jb5 m(int i) {
        if (i == 0) {
            return jb5.m;
        }
        if (i == 1) {
            return jb5.n;
        }
        hk0.g(fx3.f(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final lm8 n(int i) {
        if (i == 0) {
            return lm8.m;
        }
        if (i == 1) {
            return lm8.n;
        }
        if (i == 2) {
            return lm8.f1384o;
        }
        if (i == 3) {
            return lm8.p;
        }
        if (i == 4) {
            return lm8.q;
        }
        if (i == 5) {
            return lm8.r;
        }
        hk0.g(fx3.f(i, "Could not convert ", " to State"));
        return null;
    }

    public static final px4 o(Object obj, hw2 hw2Var, ux2 ux2Var) {
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = h57.p(obj);
            ux2Var.g0(objK);
        }
        px4 px4Var = (px4) objK;
        boolean zH = ux2Var.h(hw2Var);
        Object objK2 = ux2Var.K();
        if (zH || objK2 == awVar) {
            objK2 = new e57(hw2Var, px4Var, null, (byte) 0);
            ux2Var.g0(objK2);
        }
        ck3.i(f88.a, (hw2) objK2, ux2Var);
        return px4Var;
    }

    public static final oz3 p(d58 d58Var) throws l58 {
        d58Var.getClass();
        fi1 fi1VarI = d58Var.i();
        fi1VarI.getClass();
        boolean z = fi1VarI instanceof zs0;
        byte b = 0;
        ub8 ub8Var = ub8.q;
        if (z) {
            List parameters = ((zs0) fi1VarI).q().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(mv0.Z(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                k48 k48VarQ = ((d58) it.next()).q();
                k48VarQ.getClass();
                arrayList.add(k48VarQ);
            }
            List upperBounds = d58Var.getUpperBounds();
            upperBounds.getClass();
            wy3 wy3VarE = bp1.e(d58Var);
            oz3 oz3VarH = new m58(new x87(arrayList, b)).h((oz3) lv0.m0(upperBounds), ub8Var);
            return oz3VarH == null ? wy3VarE.m() : oz3VarH;
        }
        if (!(fi1VarI instanceof xw2)) {
            hk0.g("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List typeParameters = ((xw2) fi1VarI).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(mv0.Z(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            k48 k48VarQ2 = ((d58) it2.next()).q();
            k48VarQ2.getClass();
            arrayList2.add(k48VarQ2);
        }
        List upperBounds2 = d58Var.getUpperBounds();
        upperBounds2.getClass();
        wy3 wy3VarE2 = bp1.e(d58Var);
        oz3 oz3VarH2 = new m58(new x87(arrayList2, b)).h((oz3) lv0.m0(upperBounds2), ub8Var);
        return oz3VarH2 == null ? wy3VarE2.m() : oz3VarH2;
    }

    public static final int q(lm8 lm8Var) {
        lm8Var.getClass();
        int iOrdinal = lm8Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        gk0.s();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static void r(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static final a35 s(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new a35(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                a35 a35VarQ = io1.Q(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return a35VarQ;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kh.n(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                kh.n(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static int t(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
