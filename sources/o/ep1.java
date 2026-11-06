package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ep1 {
    public static we3 a = null;
    public static final int b = 9;
    public static final int c = 10;
    public static final int d = 12;

    public static String A(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        List listN0 = ub7.n0(strReplaceAll, new String[]{"."}, 6);
        if (listN0.size() == 4) {
            try {
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    int i = Integer.parseInt((String) it.next());
                    if (i < 0 || i > 255) {
                    }
                }
                return strReplaceAll;
            } catch (NumberFormatException e) {
                e41.s("parseIp4Address ", e.getMessage(), "ParsingHelper");
                return null;
            }
        }
        return null;
    }

    public static final void B(k17 k17Var, jv jvVar, int i) {
        while (true) {
            int i2 = k17Var.v;
            if (i > i2 && i < k17Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            k17Var.L();
            if (k17Var.x(k17Var.v)) {
                jvVar.i();
            }
            k17Var.i();
        }
    }

    public static void C(el5 el5Var) {
        l97 l97Var;
        ik5 ik5Var;
        ik5 ik5Var2;
        do {
            l97Var = p56.z;
            ik5Var = (ik5) l97Var.getValue();
            zj5 zj5VarC = ik5Var.f1071o;
            pa4 pa4Var = (pa4) zj5VarC.get(el5Var);
            if (pa4Var == null) {
                ik5Var2 = ik5Var;
            } else {
                Object obj = pa4Var.a;
                Object obj2 = pa4Var.b;
                s28 s28Var = zj5VarC.m;
                s28 s28VarV = s28Var.v(el5Var != null ? el5Var.hashCode() : 0, 0, el5Var);
                if (s28Var != s28VarV) {
                    zj5VarC = s28VarV == null ? zj5.f2711o : new zj5(s28VarV, zj5VarC.n - 1);
                }
                d82 d82Var = d82.B;
                if (obj != d82Var) {
                    Object obj3 = zj5VarC.get(obj);
                    obj3.getClass();
                    zj5VarC = zj5VarC.c(obj, new pa4(((pa4) obj3).a, obj2));
                }
                if (obj2 != d82Var) {
                    Object obj4 = zj5VarC.get(obj2);
                    obj4.getClass();
                    zj5VarC = zj5VarC.c(obj2, new pa4(obj, ((pa4) obj4).b));
                }
                Object obj5 = obj != d82Var ? ik5Var.m : obj2;
                if (obj2 != d82Var) {
                    obj = ik5Var.n;
                }
                ik5Var2 = new ik5(obj5, obj, zj5VarC);
            }
            if (ik5Var == ik5Var2) {
                return;
            }
        } while (!l97Var.j(ik5Var, ik5Var2));
    }

    public static final z14 D(yc4 yc4Var, rn3 rn3Var) {
        yc4Var.getClass();
        rn3Var.getClass();
        return new z14(yc4Var, rn3Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final bb2 E(bb2 bb2Var, ke3 ke3Var, za5 za5Var, z06 z06Var, jc1 jc1Var) {
        ib2 ib2Var;
        List list;
        int i;
        boolean z;
        Bitmap bitmapN;
        int size;
        Bitmap bitmap;
        z06 z06Var2;
        bb2 bb2Var2 = bb2Var;
        ke3 ke3Var2 = ke3Var;
        za5 za5Var2 = za5Var;
        if (jc1Var instanceof ib2) {
            ib2Var = (ib2) jc1Var;
            int i2 = ib2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ib2Var.u = i2 - Integer.MIN_VALUE;
            } else {
                ib2Var = new ib2(jc1Var);
            }
        } else {
            ib2Var = new ib2(jc1Var);
        }
        Object obj = ib2Var.t;
        int i3 = ib2Var.u;
        if (i3 == 0) {
            ct1.a0(obj);
            list = (List) nv1.w(ke3Var2, me3.a);
            if (list.isEmpty()) {
                return bb2Var2;
            }
            xd3 xd3Var = bb2Var2.a;
            boolean z2 = xd3Var instanceof r70;
            if (!z2 && !((Boolean) nv1.w(ke3Var2, me3.d)).booleanValue()) {
                return bb2Var2;
            }
            i = 0;
            if (z2) {
                Bitmap bitmap2 = ((r70) xd3Var).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (cx.B0(config, ya8.a)) {
                    bitmapN = bitmap2;
                } else {
                    Drawable drawableO = bt1.o(xd3Var, za5Var2.a.getResources());
                    Bitmap.Config config2 = (Bitmap.Config) nv1.x(za5Var2, ne3.b);
                    w07 w07Var = za5Var2.b;
                    oi6 oi6Var = za5Var2.c;
                    w07 w07Var2 = (w07) nv1.x(za5Var2, me3.b);
                    if (za5Var2.d == pp5.n) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bitmapN = n(drawableO, config2, w07Var, oi6Var, w07Var2, z);
                }
            } else {
                Drawable drawableO2 = bt1.o(xd3Var, za5Var2.a.getResources());
                Bitmap.Config config3 = (Bitmap.Config) nv1.x(za5Var2, ne3.b);
                w07 w07Var3 = za5Var2.b;
                oi6 oi6Var2 = za5Var2.c;
                w07 w07Var4 = (w07) nv1.x(za5Var2, me3.b);
                if (za5Var2.d == pp5.n) {
                    z = true;
                } else {
                    z = false;
                }
                bitmapN = n(drawableO2, config3, w07Var3, oi6Var2, w07Var4, z);
            }
            z06Var.getClass();
            size = list.size();
            bitmap = bitmapN;
            z06Var2 = z06Var;
        } else {
            if (i3 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = ib2Var.s;
            int i5 = ib2Var.r;
            List list2 = ib2Var.q;
            z06Var2 = ib2Var.p;
            za5 za5Var3 = ib2Var.f1047o;
            ke3 ke3Var3 = ib2Var.n;
            bb2 bb2Var3 = ib2Var.m;
            ct1.a0(obj);
            ds1.H(ib2Var.getContext());
            size = i4;
            bb2Var2 = bb2Var3;
            bitmap = (Bitmap) obj;
            list = list2;
            za5Var2 = za5Var3;
            i = i5 + 1;
            ke3Var2 = ke3Var3;
        }
        if (i >= size) {
            z06Var2.getClass();
            return new bb2(new r70(bitmap), bb2Var2.b, bb2Var2.c, bb2Var2.d);
        }
        if (list.get(i) != null) {
            io.sentry.h2.f();
            return null;
        }
        w07 w07Var5 = za5Var2.b;
        ib2Var.m = bb2Var2;
        ib2Var.n = ke3Var2;
        ib2Var.f1047o = za5Var2;
        ib2Var.p = z06Var2;
        ib2Var.q = list;
        ib2Var.r = i;
        ib2Var.s = size;
        ib2Var.u = 1;
        throw null;
    }

    public static final v56 F(i04 i04Var) {
        v56 v56VarM = vt1.m(i04Var, true);
        long jD = i04Var.D(v56VarM.d());
        float f = v56VarM.c;
        float f2 = v56VarM.d;
        long jD2 = i04Var.D((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new v56(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (jD2 >> 32)), Float.intBitsToFloat((int) (jD2 & 4294967295L)));
    }

    public static final void a(final boolean z, final Function0 function0, final Function1 function1, final Function0 function2, final Function0 function3, final tx1 tx1Var, final Function1 function4, final Function1 function5, final bl6 bl6Var, final boolean z2, fs4 fs4Var, final gl4 gl4Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        Function1 function6;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        function0.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        ux2Var2.Y(-1501206060);
        if ((i & 6) == 0) {
            i3 = (ux2Var2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function6 = function1;
            i3 |= ux2Var2.h(function6) ? 256 : 128;
        } else {
            function6 = function1;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var2.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var2.h(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? ux2Var2.f(tx1Var) : ux2Var2.h(tx1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ux2Var2.h(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ux2Var2.h(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= (134217728 & i) == 0 ? ux2Var2.f(bl6Var) : ux2Var2.h(bl6Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ux2Var2.g(z2) ? 536870912 : 268435456;
        }
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= ux2Var2.h(gl4Var) ? 32 : 16;
        }
        if (ux2Var2.N(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                fs4Var2 = cs4.b;
            } else {
                ux2Var2.Q();
                fs4Var2 = fs4Var;
            }
            ux2Var2.q();
            fs4 fs4VarF = fs4Var2.f(androidx.compose.foundation.layout.b.c);
            fs4Var = fs4Var2;
            h72 h72Var = un4.a;
            fs4 fs4VarS = au8.s(fs4VarF, ((rn4) ux2Var2.j(h72Var)).a.p, kh.V);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarS);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS2, d82.t, ux2Var2);
            bt1.k(z, function0, function6, function2, new pl6(function3, tx1Var, function4, function5), new s14(1.0f, true), bl6Var, gl4Var, null, ux2Var, (i3 & 8190) | 32768 | (3670016 & (i3 >> 6)) | (29360128 & (i4 << 18)), 256);
            ux2Var2 = ux2Var;
            if (!z2 || tx1Var == null) {
                ux2Var2.W(-1457458646);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1457663649);
                lv1.B(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.b.b, 2.0f), 0.0f, ((rn4) ux2Var2.j(h72Var)).a.B, ux2Var2, 6);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        final fs4 fs4Var3 = fs4Var;
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.px1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    ep1.a(z, function0, function1, function2, function3, tx1Var, function4, function5, bl6Var, z2, fs4Var3, gl4Var, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final boolean z, final String str, final String str2, final Function1 function1, final Function0 function0, final Function0 function2, fs4 fs4Var, mi2 mi2Var, ux2 ux2Var, final int i) {
        final fs4 fs4Var2;
        final mi2 mi2Var2;
        int i2;
        mi2 mi2Var3;
        int i3;
        fs4 fs4Var3;
        mi2 mi2Var4;
        str.getClass();
        str2.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        ux2Var.Y(1154181194);
        byte b2 = 4;
        int i4 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.f(str) ? 32 : 16) | (ux2Var.f(str2) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.h(function2) ? 131072 : 65536) | 47710208;
        byte b3 = 1;
        if (ux2Var.N(i4 & 1, (38347923 & i4) != 38347922 ? b3 : 0)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new uf2(b3), b3);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                i2 = 0;
                mi2Var3 = (mi2) g57.t(w86.a.b(mi2.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                i3 = i4 & (-234881025);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                i3 = i4 & (-234881025);
                fs4Var3 = fs4Var;
                mi2Var3 = mi2Var;
                i2 = 0;
            }
            ux2Var.q();
            Context context = (Context) ux2Var.j(lh.b);
            px4 px4VarG = g57.g(mi2Var3.q, ux2Var);
            Object[] objArr = new Object[i2];
            boolean z2 = i2;
            Object objK = ux2Var.K();
            Object obj = e01.a;
            Object obj2 = objK;
            if (objK == obj) {
                Object uf2Var = new uf2(b2);
                ux2Var.g0(uf2Var);
                obj2 = uf2Var;
            }
            Object obj3 = (px4) zu1.L(objArr, (Function0) obj2, ux2Var, 48);
            boolean zF = ux2Var.f(obj3) | ux2Var.h(mi2Var3);
            Object objK2 = ux2Var.K();
            hc1 hc1Var = null;
            Object obj4 = objK2;
            if (zF || objK2 == obj) {
                Object i9Var = new i9(mi2Var3, obj3, hc1Var, (byte) 10);
                ux2Var.g0(i9Var);
                obj4 = i9Var;
            }
            ck3.i(f88.a, (hw2) obj4, ux2Var);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = ux2Var.h(mi2Var3);
            Object objK3 = ux2Var.K();
            Object obj5 = objK3;
            if (zH || objK3 == obj) {
                Object acVar = new ac(mi2Var3, hc1Var, (byte) 7);
                ux2Var.g0(acVar);
                obj5 = acVar;
            }
            ck3.i(boolValueOf, (hw2) obj5, ux2Var);
            oi2 oi2Var = (oi2) px4VarG.getValue();
            boolean zH2 = ux2Var.h(mi2Var3);
            Object objK4 = ux2Var.K();
            if (zH2 || objK4 == obj) {
                objK4 = new ew1(1, mi2Var3, mi2.class, "setFeedbackRating", "setFeedbackRating(I)V", 0, (byte) 11);
                ux2Var.g0(objK4);
            }
            Function1 function3 = (Function1) ((pu3) objK4);
            boolean zH3 = ux2Var.h(mi2Var3);
            Object objK5 = ux2Var.K();
            if (zH3 || objK5 == obj) {
                objK5 = new ew1(1, mi2Var3, mi2.class, "setFeedbackComment", "setFeedbackComment(Ljava/lang/String;)V", 0, (byte) 12);
                ux2Var.g0(objK5);
            }
            Function1 function4 = (Function1) ((pu3) objK5);
            Object objK6 = ux2Var.K();
            Object obj6 = objK6;
            if (objK6 == obj) {
                Object ji2Var = new ji2((byte) 2);
                ux2Var.g0(ji2Var);
                obj6 = ji2Var;
            }
            Function1 function5 = (Function1) obj6;
            boolean zH4 = ux2Var.h(mi2Var3);
            Object objK7 = ux2Var.K();
            if (zH4 || objK7 == obj) {
                objK7 = new ew1(1, mi2Var3, mi2.class, "setCategory", "setCategory(Z)V", 0, (byte) 13);
                ux2Var.g0(objK7);
            }
            Function1 function6 = (Function1) ((pu3) objK7);
            boolean zH5 = ux2Var.h(mi2Var3);
            Object objK8 = ux2Var.K();
            if (zH5 || objK8 == obj) {
                objK8 = new ew1(1, mi2Var3, mi2.class, "setSubcategory", "setSubcategory(Lcom/teamviewer/feedbacklib/data/Subcategory;)V", 0, (byte) 14);
                ux2Var.g0(objK8);
            }
            Function1 function7 = (Function1) ((pu3) objK8);
            boolean zH6 = ux2Var.h(mi2Var3);
            Object objK9 = ux2Var.K();
            if (zH6 || objK9 == obj) {
                objK9 = new ew1(1, mi2Var3, mi2.class, "onLogFileAttachChanged", "onLogFileAttachChanged(Z)V", 0, (byte) 15);
                ux2Var.g0(objK9);
            }
            Function1 function8 = (Function1) ((pu3) objK9);
            boolean zH7 = ux2Var.h(mi2Var3);
            Object objK10 = ux2Var.K();
            if (zH7 || objK10 == obj) {
                objK10 = new ew1(1, mi2Var3, mi2.class, "reportActionEvent", "reportActionEvent(Z)V", 0, (byte) 16);
                ux2Var.g0(objK10);
            }
            Function1 function9 = (Function1) ((pu3) objK10);
            boolean zH8 = ux2Var.h(mi2Var3);
            Object objK11 = ux2Var.K();
            if (zH8 || objK11 == obj) {
                objK11 = new ax1(0, mi2Var3, mi2.class, "clearForm", "clearForm()V", 0, (byte) 3);
                ux2Var.g0(objK11);
            }
            Function0 function10 = (Function0) ((pu3) objK11);
            boolean zH9 = ux2Var.h(mi2Var3);
            Object objK12 = ux2Var.K();
            if (zH9 || objK12 == obj) {
                mi2Var4 = mi2Var3;
                objK12 = new rg(3, mi2Var4, mi2.class, "upload", "upload(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", 0);
                ux2Var.g0(objK12);
            } else {
                mi2Var4 = mi2Var3;
            }
            ci2 ci2Var = new ci2(function3, function4, function5, function6, function7, function8, function9, function10, (iw2) ((pu3) objK12));
            int i5 = (ux2Var.h(context) ? 1 : 0) | ((i3 & 7168) == 2048 ? b3 : z2 ? 1 : 0) | ((57344 & i3) != 16384 ? z2 ? 1 : 0 : (byte) 1);
            Object objK13 = ux2Var.K();
            Object obj7 = objK13;
            if (i5 != 0 || objK13 == obj) {
                Object m5Var = new m5(context, function1, function0);
                ux2Var.g0(m5Var);
                obj7 = m5Var;
            }
            fs4 fs4Var4 = fs4Var3;
            yo1.h(z, str, str2, oi2Var, ci2Var, (Function1) obj7, function2, fs4Var4, ux2Var, ((i3 << 3) & 3670016) | (i3 & 1022) | 12582912);
            fs4Var2 = fs4Var4;
            mi2Var2 = mi2Var4;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            mi2Var2 = mi2Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(z, str, str2, function1, function0, function2, fs4Var2, mi2Var2, i) { // from class: o.ni2
                public final /* synthetic */ boolean m;
                public final /* synthetic */ String n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f1568o;
                public final /* synthetic */ Function1 p;
                public final /* synthetic */ Function0 q;
                public final /* synthetic */ Function0 r;
                public final /* synthetic */ fs4 s;
                public final /* synthetic */ mi2 t;

                @Override // o.hw2
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int iY = yo1.Y(1);
                    ep1.b(this.m, this.n, this.f1568o, this.p, this.q, this.r, this.s, this.t, (ux2) obj8, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(String str, String str2, hw2 hw2Var, Function0 function0, xy6 xy6Var, fs4 fs4Var, ux2 ux2Var, int i) {
        xy6 xy6Var2;
        Function0 function1;
        me1 me1Var;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(625626453);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.f(str2) ? 32 : 16) | (ux2Var2.h(hw2Var) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024) | (ux2Var2.f(xy6Var) ? 16384 : 8192);
        if (ux2Var2.N(i2 & 1, (74899 & i2) != 74898)) {
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            me1 me1Var2 = (me1) objK;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            int i3 = 57344 & i2;
            int i4 = i2 & 7168;
            boolean zH = ((i2 & 896) == 256) | ux2Var2.h(me1Var2) | (i3 == 16384) | (i4 == 2048) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar) {
                me1Var = me1Var2;
                zw1 zw1Var = new zw1(me1Var, xy6Var, function0, hw2Var, str, str2);
                ux2Var2.g0(zw1Var);
                objK2 = zw1Var;
            } else {
                me1Var = me1Var2;
            }
            me1 me1Var3 = me1Var;
            m77.g((Function0) objK2, fs4VarF, null, false, "TVTA-settings-interactionMethod-continueButton", null, pm8.e, ux2Var2, 1597488, 44);
            fs4 fs4VarF2 = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            boolean zH2 = ux2Var2.h(me1Var3) | (i3 == 16384) | (i4 == 2048);
            Object objK3 = ux2Var2.K();
            if (zH2 || objK3 == awVar) {
                xy6Var2 = xy6Var;
                objK3 = new f70(me1Var3, xy6Var2, function0, (byte) 4);
                ux2Var2.g0(objK3);
            } else {
                xy6Var2 = xy6Var;
            }
            v67.d((Function0) objK3, fs4VarF2, null, false, "TVTA-settings-interactionMethod-cancelButton", pm8.f, ux2Var, 221232, 12);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            xy6Var2 = xy6Var;
            function1 = function0;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q41(str, str2, (Object) hw2Var, function1, (Object) xy6Var2, fs4Var, i, (byte) 1);
        }
    }

    public static final void d(String str, String str2, final hw2 hw2Var, final Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        str.getClass();
        str2.getClass();
        hw2Var.getClass();
        function0.getClass();
        ux2Var.Y(-1843047176);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.f(str2) ? 32 : 16) | (ux2Var.h(hw2Var) ? 256 : 128) | (ux2Var.h(function0) ? 2048 : 1024) | 24576;
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            final xy6 xy6VarR = yo1.R(null, ux2Var, 6, 2);
            final List listL = qf0.L(new vv6(m77.z(R.string.tv_options_InputMethodMouse, ux2Var), m77.z(R.string.settings_interaction_mouse_mode_subtitle, ux2Var), ew6.OnInteractionMethodAdjustedMouseMode, "TVTA-settings-interactionMethod-mouse"), new vv6(m77.z(R.string.tv_options_InputMethodTouch, ux2Var), m77.z(R.string.settings_interaction_touchscreen_mode_subtitle, ux2Var), ew6.OnInteractionMethodAdjustedTouchMode, "TVTA-settings-interactionMethod-touchscreen"));
            Object[] objArr = {str};
            boolean z = (i2 & 14) == 4;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = new lz1(str, b2);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 0);
            final String str3 = (String) px4Var.j();
            final Function1 function1C = px4Var.c();
            ew6 ew6Var = null;
            int i3 = 6;
            final List listL2 = qf0.L(new vv6(m77.z(R.string.tv_options_PreferredResolutionDontChange, ux2Var), ew6Var, "TVTA-settings-interactionMethod-touchscreen-dontChange", i3), new vv6(m77.z(R.string.tv_options_PreferredResolutionBestFit, ux2Var), ew6Var, "TVTA-settings-interactionMethod-touchscreen-bestFit", i3));
            Object[] objArr2 = {str2};
            boolean z2 = (i2 & 112) == 32;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                objK2 = new lz1(str2, (byte) 2);
                ux2Var.g0(objK2);
            }
            px4 px4Var2 = (px4) zu1.L(objArr2, (Function0) objK2, ux2Var, 0);
            final String str4 = (String) px4Var2.j();
            final Function1 function1C2 = px4Var2.c();
            cs4 cs4Var = cs4.b;
            yo1.k(function0, cs4Var, xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(1226469978, new iw2() { // from class: o.bj3
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) {
                    ux2 ux2Var2 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((lw0) obj).getClass();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        bw bwVar = iq8.c;
                        w50 w50Var = xz2.B;
                        cs4 cs4Var2 = cs4.b;
                        fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), "TVTA-settings-interactionMethod-bottomSheet");
                        Object objK3 = ux2Var2.K();
                        aw awVar2 = e01.a;
                        if (objK3 == awVar2) {
                            objK3 = new ji2((byte) 24);
                            ux2Var2.g0(objK3);
                        }
                        fs4 fs4VarA2 = cp6.a(fs4VarA, false, (Function1) objK3);
                        hk6 hk6VarW = im3.W(ux2Var2);
                        Object objK4 = ux2Var2.K();
                        if (objK4 == awVar2) {
                            objK4 = ck3.w(ux2Var2);
                            ux2Var2.g0(objK4);
                        }
                        fs4 fs4VarT = o77.t(fs4VarA2, hk6VarW, (me1) objK4);
                        kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 54);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarT);
                        yz0.c.getClass();
                        ux2Var2.a0();
                        if (ux2Var2.S) {
                            ux2Var2.k(LayoutNode.e0);
                        } else {
                            ux2Var2.j0();
                        }
                        o67.n(kw0VarA, d82.v, ux2Var2);
                        o67.n(yj5VarL, d82.u, ux2Var2);
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                        o67.l(ux2Var2);
                        o67.n(fs4VarS, d82.t, ux2Var2);
                        vn4.T(48, m77.z(R.string.settings_interaction, ux2Var2), ux2Var2, ka0.D(cs4Var2, 16.0f, 0.0f, 2));
                        lv1.k(ka0.E(cs4Var2, 16.0f, 16.0f, 16.0f, 8.0f), 0.0f, 0L, ux2Var2, 0, 6);
                        pd5 pd5VarI = ka0.i(2, 16.0f);
                        fs4 fs4VarD = ka0.D(cs4Var2, 0.0f, 8.0f, 1);
                        Function1 function1 = function1C;
                        boolean zF = ux2Var2.f(function1);
                        Object objK5 = ux2Var2.K();
                        if (zF || objK5 == awVar2) {
                            objK5 = new jb(function1, (byte) 5);
                            ux2Var2.g0(objK5);
                        }
                        Function1 function2 = (Function1) objK5;
                        List list = listL;
                        String str5 = str3;
                        vn4.R(list, str5, fs4VarD, null, null, pd5VarI, function2, ux2Var2, 196992, 24);
                        boolean zN = im3.n(str5, m77.z(R.string.tv_options_InputMethodTouch, ux2Var2));
                        List list2 = listL2;
                        String str6 = str4;
                        vn4.H(zN, null, null, null, null, au8.O(-1141415768, new c91(list2, str6, function1C2, (byte) 4), ux2Var2), ux2Var2, 1572870, 30);
                        ep1.c(str5, str6, hw2Var, function0, xy6VarR, ka0.D(cs4Var2, 16.0f, 0.0f, 2), ux2Var2, 196608);
                        ux2Var2.p(true);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, (i2 >> 9) & 126, 3072, 8184);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Object) str, (Object) str2, (Object) hw2Var, (Object) function0, (Object) fs4Var2, i, (byte) 5);
        }
    }

    public static final void e(final List list, final String str, final Function1 function1, final yy0 yy0Var, final fs4 fs4Var, final w44 w44Var, final nd5 nd5Var, final r74 r74Var, final Function1 function2, final Function1 function3, final Function1 function4, final li liVar, ux2 ux2Var, final int i, final int i2) {
        int i3;
        String str2;
        Function1 function5;
        yy0 yy0Var2;
        int i4;
        li liVar2;
        function1.getClass();
        ux2Var.Y(-279169494);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= ux2Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            function5 = function1;
            i3 |= ux2Var.h(function5) ? 256 : 128;
        } else {
            function5 = function1;
        }
        if ((i & 3072) == 0) {
            yy0Var2 = yy0Var;
            i3 |= ux2Var.h(yy0Var2) ? 2048 : 1024;
        } else {
            yy0Var2 = yy0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var.f(w44Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.f(nd5Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.c(0.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ux2Var.d(r74Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ux2Var.h(function2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.h(function3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(function4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.h(null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            liVar2 = liVar;
            i4 |= ux2Var.f(liVar2) ? 131072 : 65536;
        } else {
            liVar2 = liVar;
        }
        int i5 = i4;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            boolean z = (29360128 & i3) == 8388608;
            Object objK = ux2Var.K();
            boolean z2 = z;
            aw awVar = e01.a;
            if (z2 || objK == awVar) {
                objK = iq8.c;
                ux2Var.g0(objK);
            }
            gw gwVar = (gw) objK;
            boolean z3 = ((i5 & 896) == 256) | ((i3 & 14) == 4) | ((i3 & 234881024) == 67108864) | ((1879048192 & i3) == 536870912) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384);
            Object objK2 = ux2Var.K();
            if (z3 || objK2 == awVar) {
                hq0 hq0Var = new hq0(list, r74Var, function2, function3, function4, function5, str2, yy0Var2);
                ux2Var.g0(hq0Var);
                objK2 = hq0Var;
            }
            yo1.i(((i3 >> 12) & 1022) | ((i5 << 9) & 234881024), 232, (Function1) objK2, null, liVar2, gwVar, null, ux2Var, w44Var, fs4Var, nd5Var, false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.u74
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    ep1.e(list, str, function1, yy0Var, fs4Var, w44Var, nd5Var, r74Var, function2, function3, function4, liVar, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    public static final void f(final List list, final yy0 yy0Var, final fs4 fs4Var, final w44 w44Var, final nd5 nd5Var, final r74 r74Var, final Function1 function1, final Function1 function2, final Function1 function3, final li liVar, ux2 ux2Var, final int i, final int i2) {
        int i3;
        yy0 yy0Var2;
        fs4 fs4Var2;
        w44 w44Var2;
        nd5 nd5Var2;
        Function1 function4;
        int i4;
        li liVar2;
        ux2Var.Y(-1936338774);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            yy0Var2 = yy0Var;
            i3 |= ux2Var.h(yy0Var2) ? 32 : 16;
        } else {
            yy0Var2 = yy0Var;
        }
        if ((i & 384) == 0) {
            fs4Var2 = fs4Var;
            i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
        } else {
            fs4Var2 = fs4Var;
        }
        if ((i & 3072) == 0) {
            w44Var2 = w44Var;
            i3 |= ux2Var.f(w44Var2) ? 2048 : 1024;
        } else {
            w44Var2 = w44Var;
        }
        if ((i & 24576) == 0) {
            nd5Var2 = nd5Var;
            i3 |= ux2Var.f(nd5Var2) ? 16384 : 8192;
        } else {
            nd5Var2 = nd5Var;
        }
        if ((i & 196608) == 0) {
            i3 |= ux2Var.c(0.0f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ux2Var.d(r74Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function4 = function1;
            i3 |= ux2Var.h(function4) ? 8388608 : 4194304;
        } else {
            function4 = function1;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.h(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.h(function3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.h(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            liVar2 = liVar;
            i4 |= ux2Var.f(liVar2) ? 2048 : 1024;
        } else {
            liVar2 = liVar;
        }
        int i5 = i4;
        if (ux2Var.N(i3 & 1, ((306783379 & i3) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (objK == obj) {
                objK = new tg3((byte) 17);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 48);
            String str = (String) px4Var.getValue();
            boolean zF = ux2Var.f(px4Var);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == obj) {
                objK2 = new va(px4Var, (byte) 16);
                ux2Var.g0(objK2);
            }
            int i6 = i3 << 6;
            int i7 = (i3 & 14) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192);
            int i8 = i5 << 6;
            int i9 = ((i3 >> 24) & 126) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752);
            e(list, str, (Function1) objK2, yy0Var2, fs4Var2, w44Var2, nd5Var2, r74Var, function4, function2, function3, liVar2, ux2Var, i7, i9);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.v74
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ep1.f(list, yy0Var, fs4Var, w44Var, nd5Var, r74Var, function1, function2, function3, liVar, (ux2) obj2, yo1.Y(i | 1), yo1.Y(i2));
                    return f88.a;
                }
            };
        }
    }

    public static final void g(final Function0 function0, final long j, final xr4 xr4Var, final yy0 yy0Var, ux2 ux2Var, final int i) {
        int i2;
        xr4 xr4Var2;
        final j04 j04Var;
        boolean z;
        boolean z2;
        Object obj;
        long j2 = j;
        ux2Var.Y(-85756322);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xr4Var2 = xr4Var;
            i2 |= ux2Var.f(xr4Var2) ? 256 : 128;
        } else {
            xr4Var2 = xr4Var;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            View view = (View) ux2Var.j(lh.f);
            in1 in1Var = (in1) ux2Var.j(b11.h);
            j04 j04Var2 = (j04) ux2Var.j(b11.n);
            sx2 sx2VarY = kh.y(ux2Var);
            px4 px4VarT = h57.t(yy0Var, ux2Var);
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            Object obj2 = e01.a;
            if (objK == obj2) {
                objK = new ti4((byte) 6);
                ux2Var.g0(objK);
            }
            UUID uuid = (UUID) zu1.L(objArr, (Function0) objK, ux2Var, 48);
            boolean zF = ux2Var.f(view) | ux2Var.f(in1Var);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == obj2) {
                j04Var = j04Var2;
                z = true;
                z2 = false;
                tr4 tr4Var = new tr4(function0, xr4Var2, j2, view, j04Var, in1Var, uuid);
                j2 = j2;
                yy0 yy0Var2 = new yy0(1379699857, true, new ai(px4VarT, (byte) 2));
                sr4 sr4Var = tr4Var.u;
                sr4Var.setParentCompositionContext(sx2VarY);
                sr4Var.v.setValue(yy0Var2);
                sr4Var.w = true;
                sr4Var.d();
                ux2Var.g0(tr4Var);
                obj = tr4Var;
            } else {
                j04Var = j04Var2;
                z = true;
                z2 = false;
                obj = objK2;
            }
            final tr4 tr4Var2 = (tr4) obj;
            boolean zH = ux2Var.h(tr4Var2);
            Object objK3 = ux2Var.K();
            if (zH || objK3 == obj2) {
                objK3 = new fj3((Object) tr4Var2, (byte) 12);
                ux2Var.g0(objK3);
            }
            ck3.e(tr4Var2, (Function1) objK3, ux2Var);
            boolean zH2 = ux2Var.h(tr4Var2) | ((i2 & 14) == 4 ? z : z2) | ((i2 & 896) == 256 ? z : z2) | (((((i2 & 112) ^ 48) <= 32 || !ux2Var.e(j2)) && (i2 & 48) != 32) ? z2 : z) | ux2Var.d(j04Var.ordinal());
            Object objK4 = ux2Var.K();
            if (zH2 || objK4 == obj2) {
                final long j3 = j2;
                Object obj3 = new Function0() { // from class: o.yr4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        tr4Var2.i(function0, xr4Var, j3, j04Var);
                        return f88.a;
                    }
                };
                ux2Var.g0(obj3);
                objK4 = obj3;
            }
            ck3.k((Function0) objK4, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.zr4
                @Override // o.hw2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    ep1.g(function0, j, xr4Var, yy0Var, (ux2) obj4, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void h(fs4 fs4Var, fl7 fl7Var, String str, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        fl7 fl7Var2;
        String str2;
        fs4 fs4Var3;
        final fl7 fl7Var3;
        String str3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1301955320);
        int i2 = i | 406;
        final byte b2 = 0;
        final byte b3 = 1;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                dl5 dl5Var = new dl5(new jv6((byte) 18), (byte) 1);
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                fl7 fl7Var4 = (fl7) g57.t(w86.a.b(fl7.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var2);
                fs4Var3 = cs4.b;
                fl7Var3 = fl7Var4;
                str3 = "TVTA-settings-quality";
            } else {
                ux2Var2.Q();
                fs4Var3 = fs4Var;
                fl7Var3 = fl7Var;
                str3 = str;
            }
            ux2Var2.q();
            Context context = (Context) ux2Var2.j(lh.b);
            int iIntValue = ((Number) fl7Var3.r.getValue()).intValue();
            sk7 sk7Var = new sk7(y57.g(R.string.settings_quality), y57.g(iIntValue), new yk7(R.drawable.quality), null, 8);
            boolean zH = ux2Var2.h(fl7Var3);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new Function0() { // from class: o.oy5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        fl7 fl7Var5 = fl7Var3;
                        switch (b4) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(ew6.OnQualityClicked);
                                fl7Var5.q.setValue(Boolean.TRUE);
                                break;
                            default:
                                fl7Var5.q.setValue(Boolean.FALSE);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK);
            }
            x37.e(sk7Var, fs4Var3, null, (Function0) objK, str3, ux2Var2, 24624, 36);
            fs4 fs4Var4 = fs4Var3;
            String str4 = str3;
            if (((Boolean) fl7Var3.q.getValue()).booleanValue()) {
                ux2Var2.W(-1297833390);
                String strZ = m77.z(iIntValue, ux2Var2);
                boolean zH2 = ux2Var2.h(fl7Var3) | ux2Var2.h(context);
                Object objK2 = ux2Var2.K();
                if (zH2 || objK2 == awVar) {
                    objK2 = new py5(fl7Var3, context, b2);
                    ux2Var2.g0(objK2);
                }
                Function1 function1 = (Function1) objK2;
                boolean zH3 = ux2Var2.h(fl7Var3);
                Object objK3 = ux2Var2.K();
                if (zH3 || objK3 == awVar) {
                    objK3 = new Function0() { // from class: o.oy5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            fl7 fl7Var5 = fl7Var3;
                            switch (b4) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(ew6.OnQualityClicked);
                                    fl7Var5.q.setValue(Boolean.TRUE);
                                    break;
                                default:
                                    fl7Var5.q.setValue(Boolean.FALSE);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK3);
                }
                yo1.p(strZ, function1, (Function0) objK3, null, ux2Var, 0);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1297533558);
                ux2Var2.p(false);
            }
            fs4Var2 = fs4Var4;
            str2 = str4;
            fl7Var2 = fl7Var3;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            fl7Var2 = fl7Var;
            str2 = str;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(fs4Var2, (Object) fl7Var2, (Object) str2, i, (byte) 20);
        }
    }

    public static final void i(String str, Function1 function1, Function0 function0, Function0 function2, ux2 ux2Var, int i) {
        function1.getClass();
        function0.getClass();
        function2.getClass();
        ux2Var.Y(1152078411);
        byte b2 = 2;
        int i2 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function2) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            String strValueOf = String.valueOf(str.length());
            Character chV = ub7.V(str);
            boolean z = chV != null && qf0.J(chV.charValue());
            boolean z2 = str.length() > 50;
            boolean z3 = (str.length() <= 0 || z || z2) ? false : true;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new l5(b2, null, (byte) 14);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            boolean z4 = (i2 & 7168) == 2048;
            Object objK2 = ux2Var.K();
            if (z4 || objK2 == awVar) {
                objK2 = new yv1(function2, (byte) 21);
                ux2Var.g0(objK2);
            }
            uf0.b((Function0) objK2, au8.O(1708267667, new r9(b2, function0, z3), ux2Var), null, au8.O(1798327957, new v4(function2, (byte) 29), ux2Var), mo8.h, au8.O(-214065256, new kb(z3, str, z2, strValueOf, function1), ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, 1772592, 0, 16276);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new n71(str, function1, function0, function2, i, (byte) 2);
        }
    }

    public static final void j(String str, fs4 fs4Var, Function0 function0, Function0 function1, long j, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        fs4 fs4Var3;
        ux2Var.Y(-2078815310);
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | 48 | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.h(function1) ? 2048 : 1024) | (ux2Var.e(j) ? 16384 : 8192);
        byte b2 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            ux2Var.S();
            int i3 = i & 1;
            fs4 fs4VarA = cs4.b;
            if (i3 == 0 || ux2Var.x()) {
                fs4Var3 = fs4VarA;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            if (j != 16) {
                ux2Var.W(-853219337);
                aw awVar = e01.a;
                if (function0 != null) {
                    ux2Var.W(-853120974);
                    int i4 = i2 & 896;
                    boolean z = i4 == 256;
                    Object objK = ux2Var.K();
                    if (z || objK == awVar) {
                        objK = new ki(function0, b2);
                        ux2Var.g0(objK);
                    }
                    fs4 fs4VarA2 = qg7.a(fs4VarA, function0, (PointerInputEventHandler) objK);
                    boolean z2 = ((i2 & 14) == 4) | (i4 == 256);
                    Object objK2 = ux2Var.K();
                    if (z2 || objK2 == awVar) {
                        objK2 = new py5((Object) str, (Object) function0, (byte) 5);
                        ux2Var.g0(objK2);
                    }
                    fs4VarA = cp6.a(fs4VarA2, true, (Function1) objK2);
                    ux2Var.p(false);
                } else {
                    ux2Var.W(-852623672);
                    ux2Var.p(false);
                }
                fs4 fs4VarF = fs4Var3.f(androidx.compose.foundation.layout.b.c).f(fs4VarA);
                int i5 = (((((57344 & i2) ^ 24576) <= 16384 || !ux2Var.e(j)) && (i2 & 24576) != 16384) ? (byte) 0 : (byte) 1) | ((i2 & 7168) != 2048 ? (byte) 0 : (byte) 1);
                Object objK3 = ux2Var.K();
                if (i5 != 0 || objK3 == awVar) {
                    objK3 = new x23((byte) 2, j, function1);
                    ux2Var.g0(objK3);
                }
                vn4.K(0, (Function1) objK3, ux2Var, fs4VarF);
                ux2Var.p(false);
            } else {
                ux2Var.W(-852426512);
                ux2Var.p(false);
            }
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new dx0(str, fs4Var2, function0, function1, j, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    public static final void k(boolean z, fs4 fs4Var, SupportSession supportSession, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, xr6 xr6Var, ux2 ux2Var, int i) {
        int i2;
        Function1 function6;
        xr6 xr6Var2;
        ux2 ux2Var2;
        Object obj;
        ux2 ux2Var3;
        int i3;
        final xr6 xr6Var3;
        Function1 function7;
        xr6 xr6Var4;
        yr6 yr6Var;
        Object next;
        xr6 xr6Var5;
        Object ko2Var;
        Object obj2;
        f88 f88Var;
        yr6 yr6Var2;
        hc1 hc1Var;
        boolean z2;
        Object obj3;
        xr6 xr6Var6;
        ?? r3;
        xr6 xr6Var7;
        xr6 xr6Var8;
        SupportSession supportSession2 = supportSession;
        ux2Var.Y(-1792638790);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(supportSession2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.h(function3) ? 131072 : 65536;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= ux2Var.h(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        int i5 = i4;
        if (ux2Var.N(i5 & 1, (i5 & 38347923) != 38347922)) {
            ux2Var.S();
            int i6 = i & 1;
            Object obj4 = e01.a;
            if (i6 == 0 || ux2Var.x()) {
                Object objK = ux2Var.K();
                if (objK == obj4) {
                    objK = new fk6((byte) 14);
                    ux2Var.g0(objK);
                }
                Function1 function8 = (Function1) objK;
                dl5 dl5Var = new dl5(new oq6((byte) 20), (byte) 1);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                obj = obj4;
                oe8 oe8VarT = g57.t(w86.a.b(xr6.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                ux2Var3 = ux2Var;
                i3 = i5 & (-234881025);
                xr6Var3 = (xr6) oe8VarT;
                function7 = function8;
            } else {
                ux2Var.Q();
                i3 = i5 & (-234881025);
                obj = obj4;
                ux2Var3 = ux2Var;
                function7 = function4;
                xr6Var3 = xr6Var;
            }
            ux2Var3.q();
            px4 px4VarG = g57.g(xr6Var3.s, ux2Var3);
            Object objT = h57.t(function1, ux2Var3);
            Object objT2 = h57.t(function2, ux2Var3);
            px4 px4VarT = h57.t(function5, ux2Var3);
            boolean zH = ux2Var3.h(xr6Var3);
            Object objK2 = ux2Var3.K();
            if (zH || objK2 == obj) {
                objK2 = new mr6(0, xr6Var3, xr6.class, "toggleSorting", "toggleSorting()V", 0, (byte) 2);
                ux2Var3.g0(objK2);
            }
            Function0 function0 = (Function0) ((pu3) objK2);
            boolean zH2 = ux2Var3.h(xr6Var3);
            Object objK3 = ux2Var3.K();
            if (zH2 || objK3 == obj) {
                objK3 = new ew1(1, xr6Var3, xr6.class, "changeSortOrder", "changeSortOrder(Lcom/teamviewer/remotecontrolviewmodellib/devicetab/servicequeue/data/ServiceQueueSortValue;)V", 0, (byte) 27);
                ux2Var3.g0(objK3);
            }
            Function1 function9 = (Function1) ((pu3) objK3);
            boolean zH3 = ux2Var3.h(xr6Var3);
            Object objK4 = ux2Var3.K();
            if (zH3 || objK4 == obj) {
                final byte b2 = 4;
                objK4 = new Function1() { // from class: o.kr6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        byte b3 = b2;
                        hc1 hc1Var2 = null;
                        f88 f88Var2 = f88.a;
                        xr6 xr6Var9 = xr6Var3;
                        switch (b3) {
                            case 0:
                                SupportSession supportSession3 = (SupportSession) obj5;
                                supportSession3.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession3, xr6Var9, hc1Var2, (byte) 0), 2);
                                break;
                            case 1:
                                SupportSession supportSession4 = (SupportSession) obj5;
                                supportSession4.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession4, xr6Var9, hc1Var2, (byte) 1), 2);
                                break;
                            case 2:
                                SupportSession supportSession5 = (SupportSession) obj5;
                                supportSession5.getClass();
                                xr6Var9.b1(supportSession5);
                                xr6Var9.d1();
                                break;
                            case 3:
                                SupportSession supportSession6 = (SupportSession) obj5;
                                supportSession6.getClass();
                                l97 l97Var = xr6Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, or6.a((or6) value, null, supportSession6, false, false, false, false, true, false, null, 0, 0, 1981)));
                                break;
                            default:
                                SupportSession supportSession7 = (SupportSession) obj5;
                                supportSession7.getClass();
                                xr6Var9.b1(supportSession7);
                                l97 l97Var2 = xr6Var9.r;
                                do {
                                    value2 = l97Var2.getValue();
                                } while (!l97Var2.j(value2, or6.a((or6) value2, null, null, false, false, false, true, false, false, null, 0, 0, 2015)));
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var3.g0(objK4);
            }
            Function1 function10 = (Function1) objK4;
            boolean zH4 = ux2Var3.h(xr6Var3) | ((i3 & 3670016) == 1048576);
            Object objK5 = ux2Var3.K();
            if (zH4 || objK5 == obj) {
                objK5 = new py5((Object) xr6Var3, (Object) function7, (byte) 11);
                ux2Var3.g0(objK5);
            }
            Function1 function11 = (Function1) objK5;
            boolean zH5 = ux2Var3.h(xr6Var3);
            Object objK6 = ux2Var3.K();
            if (zH5 || objK6 == obj) {
                objK6 = new ew1(1, xr6Var3, xr6.class, "onSessionMoreMenuClosed", "onSessionMoreMenuClosed(Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;)V", 0, (byte) 28);
                ux2Var3.g0(objK6);
            }
            Function1 function12 = (Function1) ((pu3) objK6);
            boolean zH6 = ux2Var3.h(xr6Var3);
            Object objK7 = ux2Var3.K();
            if (zH6 || objK7 == obj) {
                final byte b3 = 0;
                objK7 = new Function1() { // from class: o.kr6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        byte b4 = b3;
                        hc1 hc1Var2 = null;
                        f88 f88Var2 = f88.a;
                        xr6 xr6Var9 = xr6Var3;
                        switch (b4) {
                            case 0:
                                SupportSession supportSession3 = (SupportSession) obj5;
                                supportSession3.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession3, xr6Var9, hc1Var2, (byte) 0), 2);
                                break;
                            case 1:
                                SupportSession supportSession4 = (SupportSession) obj5;
                                supportSession4.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession4, xr6Var9, hc1Var2, (byte) 1), 2);
                                break;
                            case 2:
                                SupportSession supportSession5 = (SupportSession) obj5;
                                supportSession5.getClass();
                                xr6Var9.b1(supportSession5);
                                xr6Var9.d1();
                                break;
                            case 3:
                                SupportSession supportSession6 = (SupportSession) obj5;
                                supportSession6.getClass();
                                l97 l97Var = xr6Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, or6.a((or6) value, null, supportSession6, false, false, false, false, true, false, null, 0, 0, 1981)));
                                break;
                            default:
                                SupportSession supportSession7 = (SupportSession) obj5;
                                supportSession7.getClass();
                                xr6Var9.b1(supportSession7);
                                l97 l97Var2 = xr6Var9.r;
                                do {
                                    value2 = l97Var2.getValue();
                                } while (!l97Var2.j(value2, or6.a((or6) value2, null, null, false, false, false, true, false, false, null, 0, 0, 2015)));
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var3.g0(objK7);
            }
            Function1 function13 = (Function1) objK7;
            boolean zH7 = ux2Var3.h(xr6Var3);
            Object objK8 = ux2Var3.K();
            if (zH7 || objK8 == obj) {
                final byte b4 = 1;
                objK8 = new Function1() { // from class: o.kr6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        byte b5 = b4;
                        hc1 hc1Var2 = null;
                        f88 f88Var2 = f88.a;
                        xr6 xr6Var9 = xr6Var3;
                        switch (b5) {
                            case 0:
                                SupportSession supportSession3 = (SupportSession) obj5;
                                supportSession3.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession3, xr6Var9, hc1Var2, (byte) 0), 2);
                                break;
                            case 1:
                                SupportSession supportSession4 = (SupportSession) obj5;
                                supportSession4.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession4, xr6Var9, hc1Var2, (byte) 1), 2);
                                break;
                            case 2:
                                SupportSession supportSession5 = (SupportSession) obj5;
                                supportSession5.getClass();
                                xr6Var9.b1(supportSession5);
                                xr6Var9.d1();
                                break;
                            case 3:
                                SupportSession supportSession6 = (SupportSession) obj5;
                                supportSession6.getClass();
                                l97 l97Var = xr6Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, or6.a((or6) value, null, supportSession6, false, false, false, false, true, false, null, 0, 0, 1981)));
                                break;
                            default:
                                SupportSession supportSession7 = (SupportSession) obj5;
                                supportSession7.getClass();
                                xr6Var9.b1(supportSession7);
                                l97 l97Var2 = xr6Var9.r;
                                do {
                                    value2 = l97Var2.getValue();
                                } while (!l97Var2.j(value2, or6.a((or6) value2, null, null, false, false, false, true, false, false, null, 0, 0, 2015)));
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var3.g0(objK8);
            }
            Function1 function14 = (Function1) objK8;
            boolean zH8 = ux2Var3.h(xr6Var3);
            Object objK9 = ux2Var3.K();
            if (zH8 || objK9 == obj) {
                final byte b5 = 2;
                objK9 = new Function1() { // from class: o.kr6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        byte b6 = b5;
                        hc1 hc1Var2 = null;
                        f88 f88Var2 = f88.a;
                        xr6 xr6Var9 = xr6Var3;
                        switch (b6) {
                            case 0:
                                SupportSession supportSession3 = (SupportSession) obj5;
                                supportSession3.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession3, xr6Var9, hc1Var2, (byte) 0), 2);
                                break;
                            case 1:
                                SupportSession supportSession4 = (SupportSession) obj5;
                                supportSession4.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession4, xr6Var9, hc1Var2, (byte) 1), 2);
                                break;
                            case 2:
                                SupportSession supportSession5 = (SupportSession) obj5;
                                supportSession5.getClass();
                                xr6Var9.b1(supportSession5);
                                xr6Var9.d1();
                                break;
                            case 3:
                                SupportSession supportSession6 = (SupportSession) obj5;
                                supportSession6.getClass();
                                l97 l97Var = xr6Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, or6.a((or6) value, null, supportSession6, false, false, false, false, true, false, null, 0, 0, 1981)));
                                break;
                            default:
                                SupportSession supportSession7 = (SupportSession) obj5;
                                supportSession7.getClass();
                                xr6Var9.b1(supportSession7);
                                l97 l97Var2 = xr6Var9.r;
                                do {
                                    value2 = l97Var2.getValue();
                                } while (!l97Var2.j(value2, or6.a((or6) value2, null, null, false, false, false, true, false, false, null, 0, 0, 2015)));
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var3.g0(objK9);
            }
            Function1 function15 = (Function1) objK9;
            boolean zH9 = ux2Var3.h(xr6Var3);
            Object objK10 = ux2Var3.K();
            final byte b6 = 3;
            if (zH9 || objK10 == obj) {
                objK10 = new Function1() { // from class: o.kr6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        Object value;
                        Object value2;
                        byte b7 = b6;
                        hc1 hc1Var2 = null;
                        f88 f88Var2 = f88.a;
                        xr6 xr6Var9 = xr6Var3;
                        switch (b7) {
                            case 0:
                                SupportSession supportSession3 = (SupportSession) obj5;
                                supportSession3.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession3, xr6Var9, hc1Var2, (byte) 0), 2);
                                break;
                            case 1:
                                SupportSession supportSession4 = (SupportSession) obj5;
                                supportSession4.getClass();
                                im3.R(e8.n(xr6Var9), xr6Var9.f2546o, null, new ur6(supportSession4, xr6Var9, hc1Var2, (byte) 1), 2);
                                break;
                            case 2:
                                SupportSession supportSession5 = (SupportSession) obj5;
                                supportSession5.getClass();
                                xr6Var9.b1(supportSession5);
                                xr6Var9.d1();
                                break;
                            case 3:
                                SupportSession supportSession6 = (SupportSession) obj5;
                                supportSession6.getClass();
                                l97 l97Var = xr6Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, or6.a((or6) value, null, supportSession6, false, false, false, false, true, false, null, 0, 0, 1981)));
                                break;
                            default:
                                SupportSession supportSession7 = (SupportSession) obj5;
                                supportSession7.getClass();
                                xr6Var9.b1(supportSession7);
                                l97 l97Var2 = xr6Var9.r;
                                do {
                                    value2 = l97Var2.getValue();
                                } while (!l97Var2.j(value2, or6.a((or6) value2, null, null, false, false, false, true, false, false, null, 0, 0, 2015)));
                                break;
                        }
                        return f88Var2;
                    }
                };
                ux2Var3.g0(objK10);
            }
            Function1 function16 = (Function1) objK10;
            boolean zH10 = ux2Var3.h(xr6Var3);
            Object objK11 = ux2Var3.K();
            if (zH10 || objK11 == obj) {
                xr6Var4 = xr6Var3;
                objK11 = new ea1(2, xr6Var4, xr6.class, "saveScrollPosition", "saveScrollPosition(II)V", 0, (byte) 7);
                ux2Var3.g0(objK11);
            } else {
                xr6Var4 = xr6Var3;
            }
            Function1 function17 = function7;
            px4 px4Var = px4VarG;
            ux2 ux2Var4 = ux2Var3;
            xr6 xr6Var9 = xr6Var4;
            nr6 nr6Var = new nr6(function0, function9, function2, function10, function11, function12, function13, function14, function2, function3, function15, function16, (hw2) ((pu3) objK11));
            SupportSession supportSession3 = ((or6) px4Var.getValue()).b;
            byte b7 = 15;
            if (!((or6) px4Var.getValue()).f || supportSession3 == null) {
                ux2Var4.W(-876330988);
                ux2Var4.p(false);
                yr6Var = null;
            } else {
                ux2Var4.W(-876565317);
                boolean zH11 = ux2Var4.h(xr6Var9);
                Object objK12 = ux2Var4.K();
                if (zH11 || objK12 == obj) {
                    objK12 = new y26(xr6Var9, b7);
                    ux2Var4.g0(objK12);
                }
                Function0 function18 = (Function0) objK12;
                function18.getClass();
                yr6Var = new yr6(supportSession3, new xg8(function18, new j68((byte) 3), new j68((byte) 4)));
                ux2Var4.p(false);
            }
            Object objK13 = ux2Var4.K();
            if (objK13 == obj) {
                objK13 = new l5(2, null, (byte) 15);
                ux2Var4.g0(objK13);
            }
            f88 f88Var2 = f88.a;
            ck3.i(f88Var2, (hw2) objK13, ux2Var4);
            boolean zH12 = ux2Var4.h(xr6Var9);
            Object objK14 = ux2Var4.K();
            if (zH12 || objK14 == obj) {
                objK14 = new ac(xr6Var9, null, (byte) 13);
                ux2Var4.g0(objK14);
            }
            ck3.i(xr6Var9, (hw2) objK14, ux2Var4);
            boolean zF = ux2Var4.f(((or6) px4Var.getValue()).a);
            Object objK15 = ux2Var4.K();
            if (zF || objK15 == obj) {
                Iterator it = ((or6) px4Var.getValue()).a.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Instant instant = ((SupportSession) next).getValidUntil().toInstant();
                        while (true) {
                            Object next2 = it.next();
                            Instant instant2 = ((SupportSession) next2).getValidUntil().toInstant();
                            if (instant.compareTo(instant2) > 0) {
                                next = next2;
                                instant = instant2;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            px4Var = px4Var;
                            xr6Var9 = xr6Var9;
                            supportSession2 = supportSession;
                        }
                    }
                } else {
                    next = null;
                }
                objK15 = (SupportSession) next;
                ux2Var4.g0(objK15);
            }
            SupportSession supportSession4 = (SupportSession) objK15;
            Integer numValueOf = supportSession4 != null ? Integer.valueOf(supportSession4.getSessioncode()) : null;
            OffsetDateTime validUntil = supportSession4 != null ? supportSession4.getValidUntil() : null;
            boolean zH13 = ux2Var4.h(xr6Var9);
            Object objK16 = ux2Var4.K();
            if (zH13 || objK16 == obj) {
                xr6 xr6Var10 = xr6Var9;
                objK16 = new mr6(0, xr6Var10, xr6.class, "onSessionsExpired", "onSessionsExpired()V", 0, (byte) 1);
                xr6Var5 = xr6Var10;
                ux2Var4.g0(objK16);
            } else {
                xr6Var5 = xr6Var9;
            }
            yr6 yr6Var3 = yr6Var;
            us1.l(numValueOf, validUntil, null, (Function0) ((pu3) objK16), ux2Var4, 0);
            boolean zH14 = ux2Var4.h(xr6Var5) | ux2Var4.f(objT);
            Object objK17 = ux2Var4.K();
            if (zH14 || objK17 == obj) {
                objK17 = new vt4(xr6Var5, objT, null, (byte) 18);
                ux2Var4.g0(objK17);
            }
            ck3.i(f88Var2, (hw2) objK17, ux2Var4);
            Boolean boolValueOf = Boolean.valueOf(z);
            List list = ((or6) px4Var.getValue()).a;
            int i7 = i3 & 14;
            boolean zH15 = (i7 == 4) | ux2Var4.h(supportSession2) | ux2Var4.f(px4Var) | ux2Var4.f(objT2);
            Object objK18 = ux2Var4.K();
            if (zH15 || objK18 == obj) {
                obj2 = obj;
                f88Var = f88Var2;
                yr6Var2 = yr6Var3;
                ko2Var = new ko2(z, supportSession2, objT2, px4Var, null, (byte) 21);
                ux2Var4.g0(ko2Var);
            } else {
                yr6Var2 = yr6Var3;
                ko2Var = objK18;
                f88Var = f88Var2;
                obj2 = obj;
            }
            ck3.g(boolValueOf, list, supportSession2, (hw2) ko2Var, ux2Var4);
            boolean zF2 = ux2Var4.f(px4VarT) | ux2Var4.h(yr6Var2);
            Object objK19 = ux2Var4.K();
            if (zF2 || objK19 == obj2) {
                hc1Var = null;
                objK19 = new lr6(px4VarT, yr6Var2, hc1Var, (byte) 0);
                ux2Var4.g0(objK19);
            } else {
                hc1Var = null;
            }
            ck3.i(yr6Var2, (hw2) objK19, ux2Var4);
            boolean zF3 = ux2Var4.f(px4VarT);
            Object objK20 = ux2Var4.K();
            if (zF3 || objK20 == obj2) {
                objK20 = new va(px4VarT, (byte) 27);
                ux2Var4.g0(objK20);
            }
            ck3.e(f88Var, (Function1) objK20, ux2Var4);
            byte b8 = 6;
            int i8 = i3 << 6;
            ux2 ux2Var5 = ux2Var4;
            io1.s(z, nr6Var, (or6) px4Var.getValue(), fs4Var, supportSession2, ux2Var5, i7 | (i8 & 7168) | (i8 & 57344));
            if (((or6) px4Var.getValue()).d) {
                ux2Var5.W(-874671899);
                ds1.x(null, null, nr6Var.b, nr6Var.a, ((or6) px4Var.getValue()).i, ux2Var5, 0);
                z2 = false;
                ux2Var5.p(false);
            } else {
                z2 = false;
                ux2Var5.W(-874447800);
                ux2Var5.p(false);
            }
            if (((or6) px4Var.getValue()).e) {
                ux2Var5.W(-874373028);
                SupportSession supportSession5 = ((or6) px4Var.getValue()).b;
                boolean zF4 = ux2Var5.f(r1);
                Object objK21 = ux2Var5.K();
                if (zF4 || objK21 == obj2) {
                    objK21 = new j44(r1, b8);
                    ux2Var5.g0(objK21);
                }
                Function0 function19 = (Function0) objK21;
                boolean zF5 = ux2Var5.f(r1);
                Object objK22 = ux2Var5.K();
                if (zF5 || objK22 == obj2) {
                    objK22 = new j44(objT, (byte) 7);
                    ux2Var5.g0(objK22);
                }
                Function0 function20 = (Function0) objK22;
                boolean zH16 = ux2Var5.h(xr6Var5);
                Object objK23 = ux2Var5.K();
                if (zH16 || objK23 == obj2) {
                    xr6 xr6Var11 = xr6Var5;
                    objK23 = new ax1(0, xr6Var11, xr6.class, "toggleShareBottomSheet", "toggleShareBottomSheet()V", 0, (byte) 27);
                    xr6Var6 = xr6Var11;
                    ux2Var5.g0(objK23);
                } else {
                    xr6Var6 = xr6Var5;
                }
                Function0 function21 = (Function0) ((pu3) objK23);
                Object objK24 = ux2Var5.K();
                if (objK24 == obj2) {
                    objK24 = new oq6((byte) 16);
                    ux2Var5.g0(objK24);
                }
                Function0 function22 = (Function0) objK24;
                Object objK25 = ux2Var5.K();
                if (objK25 == obj2) {
                    objK25 = new oq6((byte) 17);
                    ux2Var5.g0(objK25);
                }
                obj3 = obj2;
                boolean z3 = z2;
                lq1.g(supportSession5, null, null, function19, function20, function21, function22, (Function0) objK25, ux2Var5, 14155776);
                ux2Var5.p(z3);
                r3 = z3;
            } else {
                boolean z4 = z2;
                obj3 = obj2;
                xr6Var6 = xr6Var5;
                ux2Var5.W(-873469688);
                ux2Var5.p(z4);
                r3 = z4;
            }
            if (((or6) px4Var.getValue()).h) {
                ux2Var5.W(-873421204);
                boolean zH17 = ux2Var5.h(xr6Var6);
                Object objK26 = ux2Var5.K();
                if (zH17 || objK26 == obj3) {
                    xr6 xr6Var12 = xr6Var6;
                    objK26 = new ax1(0, xr6Var12, xr6.class, "dismissSessionNotInListDialog", "dismissSessionNotInListDialog()V", 0, (byte) 28);
                    xr6Var7 = xr6Var12;
                    ux2Var5.g0(objK26);
                } else {
                    xr6Var7 = xr6Var6;
                }
                ct1.o(r3, (Function0) ((pu3) objK26), ux2Var5, hc1Var);
                ux2Var5.p(r3);
            } else {
                xr6Var7 = xr6Var6;
                ux2Var5.W(-873332792);
                ux2Var5.p(r3);
            }
            if (((or6) px4Var.getValue()).g) {
                ux2Var5.W(-873276961);
                String strZ = m77.z(R.string.service_queue_more_actions_remove_session, ux2Var5);
                String strZ2 = m77.z(R.string.service_queue_remove_session_dialog_message, ux2Var5);
                boolean zH18 = ux2Var5.h(xr6Var7);
                Object objK27 = ux2Var5.K();
                if (zH18 || objK27 == obj3) {
                    objK27 = new ax1(0, xr6Var7, xr6.class, "confirmRemoveSession", "confirmRemoveSession()V", 0, (byte) 29);
                    ux2Var5.g0(objK27);
                }
                Function0 function23 = (Function0) ((pu3) objK27);
                boolean zH19 = ux2Var5.h(xr6Var7);
                Object objK28 = ux2Var5.K();
                if (zH19 || objK28 == obj3) {
                    xr6Var8 = xr6Var7;
                    objK28 = new mr6(0, xr6Var8, xr6.class, "dismissRemoveSessionDialog", "dismissRemoveSessionDialog()V", 0, (byte) 0);
                    ux2Var5.g0(objK28);
                } else {
                    xr6Var8 = xr6Var7;
                }
                yo1.q(strZ, strZ2, "TVTA-devicesScreen-removeContactDialog", function23, (Function0) ((pu3) objK28), null, ux2Var5, 384);
                ux2Var5.p(r3);
            } else {
                xr6Var8 = xr6Var7;
                ux2Var5.W(-872868536);
                ux2Var5.p(r3);
            }
            xr6Var2 = xr6Var8;
            function6 = function17;
            ux2Var2 = ux2Var5;
        } else {
            ux2 ux2Var6 = ux2Var;
            ux2Var6.Q();
            function6 = function4;
            xr6Var2 = xr6Var;
            ux2Var2 = ux2Var6;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new x91(z, fs4Var, supportSession, function1, function2, function3, function6, function5, xr6Var2, i);
        }
    }

    public static final px2 l(px2 px2Var) {
        if (px2Var == null) {
            px2Var = null;
        }
        if (px2Var != null) {
            return px2Var;
        }
        i01.b("Inconsistent composition");
        hk0.b();
        return null;
    }

    public static final void m(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.getClass();
        new pn5(sharedPreferences, str, Boolean.valueOf(z), wq5.n, xq5.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (o.j51.z(r12.getWidth(), r12.getHeight(), (int) (r3 >> 32), (int) (r3 & 4294967295L), r20, r7) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap n(android.graphics.drawable.Drawable r17, android.graphics.Bitmap.Config r18, o.w07 r19, o.oi6 r20, o.w07 r21, boolean r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r6 = r20
            r7 = r21
            boolean r3 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r3 == 0) goto L5a
            r3 = r0
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r12 = r3.getBitmap()
            android.graphics.Bitmap$Config r3 = r12.getConfig()
            if (r1 == 0) goto L29
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r4) goto L27
            goto L29
        L27:
            r4 = r1
            goto L2b
        L29:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L2b:
            if (r3 != r4) goto L5a
            if (r22 == 0) goto L30
            goto L59
        L30:
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            long r3 = o.j51.y(r3, r4, r2, r6, r7)
            long r13 = r3 >> r11
            int r5 = (int) r13
            long r3 = r3 & r9
            int r3 = (int) r3
            r6 = r3
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            r8 = r7
            r7 = r20
            double r3 = o.j51.z(r3, r4, r5, r6, r7, r8)
            r6 = r7
            r7 = r8
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L5a
        L59:
            return r12
        L5a:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = o.ya8.b(r0)
            r4 = 512(0x200, float:7.175E-43)
            if (r3 <= 0) goto L67
            goto L68
        L67:
            r3 = r4
        L68:
            int r5 = o.ya8.a(r0)
            if (r5 <= 0) goto L6f
            r4 = r5
        L6f:
            long r12 = o.j51.y(r3, r4, r2, r6, r7)
            long r14 = r12 >> r11
            int r2 = (int) r14
            long r8 = r12 & r9
            int r5 = (int) r8
            r16 = r4
            r4 = r2
            r2 = r3
            r3 = r16
            double r4 = o.j51.z(r2, r3, r4, r5, r6, r7)
            double r6 = (double) r2
            double r6 = r6 * r4
            int r2 = o.vn4.r0(r6)
            double r6 = (double) r3
            double r4 = r4 * r6
            int r3 = o.vn4.r0(r4)
            if (r1 == 0) goto L95
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r4) goto L97
        L95:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L97:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r1)
            android.graphics.Rect r4 = r0.getBounds()
            int r5 = r4.left
            int r6 = r4.top
            int r7 = r4.right
            int r4 = r4.bottom
            r8 = 0
            r0.setBounds(r8, r8, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            r0.draw(r2)
            r0.setBounds(r5, r6, r7, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep1.n(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, o.w07, o.oi6, o.w07, boolean):android.graphics.Bitmap");
    }

    public static void o(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    public static void p(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            io.sentry.android.core.v0.d(strConcat, str2, exc);
        }
    }

    public static s43 q(SSLSession sSLSession) throws IOException {
        Object objK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            hk0.l("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            gk0.l("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        mr0 mr0VarL = mr0.b.l(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            hk0.l("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            gk0.l("tlsVersion == NONE");
            return null;
        }
        sv7.n.getClass();
        sv7 sv7VarB = el5.b(protocol);
        try {
            objK = ro8.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objK = ea2.m;
        }
        return new s43(sv7VarB, mr0VarL, ro8.k(sSLSession.getLocalCertificates()), new zz0(objK, (byte) 22));
    }

    public static zv0 r(ux2 ux2Var) {
        return ((rn4) ux2Var.j(un4.a)).a;
    }

    public static h68 s(ux2 ux2Var) {
        return ((rn4) ux2Var.j(un4.a)).b;
    }

    public static final nw3 t(Object obj, nw3... nw3VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (nw3VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = nw3VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = nw3.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(nw3VarArr, nw3VarArr.length));
            if (objInvoke instanceof nw3) {
                return (nw3) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean u(long j) {
        if (z68.a(j, rv0.g)) {
            return false;
        }
        cw0 cw0VarE = rv0.e(j);
        if (!di1.q(cw0VarE.b, 12884901888L)) {
            ji3.a("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(di1.H(cw0VarE.b)));
        }
        pd6 pd6Var = ((td6) cw0VarE).p;
        float fE = (float) ((pd6Var.e(rv0.d(j)) * 0.0722d) + (pd6Var.e(rv0.f(j)) * 0.7152d) + (pd6Var.e(rv0.g(j)) * 0.2126d));
        if (fE < 0.0f) {
            fE = 0.0f;
        }
        if (fE > 1.0f) {
            fE = 1.0f;
        }
        return ((double) fE) <= 0.5d;
    }

    public static boolean v(String str) {
        str.getClass();
        return A(str) != null;
    }

    public static final lw6 w(lw6 lw6Var, lw6 lw6Var2, float f) {
        return new lw6(j51.K(lw6Var.a, lw6Var2.a, f), ct1.N(lw6Var.b, lw6Var2.b, f), vs1.G(lw6Var.c, lw6Var2.c, f));
    }

    public static final eo4 x(ag6 ag6Var, int i, int i2, int i3, int i4, int i5, fo4 fo4Var, List list, jl5[] jl5VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            zn4 zn4Var = (zn4) list2.get(i14);
            float fG = yo1.G(yo1.C(zn4Var));
            if (fG > 0.0f) {
                f2 += fG;
                i15++;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                jl5 jl5VarC = jl5VarArr[i14];
                if (jl5VarC == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    jl5VarC = zn4Var.C(ag6Var.h(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                jl5 jl5Var = jl5VarC;
                int i18 = ag6Var.i(jl5Var);
                int iF = ag6Var.f(jl5Var);
                iArr2[i10 - i6] = i18;
                int i19 = i17 - i18;
                if (i19 < 0) {
                    i19 = 0;
                }
                iMin = Math.min(i5, i19);
                i16 += i18 + iMin;
                iMax = Math.max(iMax, iF);
                jl5VarArr[i10] = jl5Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j = j;
        }
        long j2 = j;
        int i20 = i15;
        if (i20 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j3 = ((long) (i20 - 1)) * j2;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j3;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                jRound -= (long) Math.round(yo1.G(yo1.C((zn4) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = iMax;
            int i24 = 0;
            while (i22 < i7) {
                if (jl5VarArr[i22] == null) {
                    zn4 zn4Var2 = (zn4) list2.get(i22);
                    f = f3;
                    bg6 bg6VarC = yo1.C(zn4Var2);
                    float fG2 = yo1.G(bg6VarC);
                    if (fG2 <= 0.0f) {
                        ii3.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j4 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fG2 * f) + iSignum);
                    jl5 jl5VarC2 = zn4Var2.C(ag6Var.h((!(bg6VarC != null ? bg6VarC.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int i25 = ag6Var.i(jl5VarC2);
                    int iF2 = ag6Var.f(jl5VarC2);
                    iArr2[i22 - i6] = i25;
                    i24 += i25;
                    int iMax3 = Math.max(i23, iF2);
                    jl5VarArr[i22] = jl5VarC2;
                    i23 = iMax3;
                    jRound = j4;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i24) + j3);
            int i26 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i26) {
                i9 = i26;
            }
            iMax = i23;
        }
        int i27 = i9 + i16;
        if (i27 < 0) {
            i27 = 0;
        }
        int iMax4 = Math.max(i27, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        ag6Var.g(iMax4, iArr2, iArr3, fo4Var);
        return ag6Var.j(jl5VarArr, fo4Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static final es4 y(um1 um1Var, int i) {
        es4 es4Var = um1Var.f0().r;
        if (es4Var == null || (es4Var.p & i) == 0) {
            return null;
        }
        while (es4Var != null) {
            int i2 = es4Var.f737o;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return es4Var;
            }
            es4Var = es4Var.r;
        }
        return null;
    }

    public static DyngateID z(String str) {
        str.getClass();
        try {
            Pattern patternCompile = Pattern.compile("\\s|[,\\.\\-_\\(\\)\\+\\*#;:]");
            patternCompile.getClass();
            String strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
            DyngateID dyngateIDFromLong = DyngateID.FromLong(Long.parseLong(strReplaceAll));
            dyngateIDFromLong.getClass();
            return dyngateIDFromLong;
        } catch (NumberFormatException e) {
            ye4.c("ParsingHelper", "parseDyngateId " + e.getMessage());
            DyngateID dyngateIDInvalidDyngateID = DyngateID.InvalidDyngateID();
            dyngateIDInvalidDyngateID.getClass();
            return dyngateIDInvalidDyngateID;
        }
    }
}
