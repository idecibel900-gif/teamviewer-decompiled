package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf7 {
    public static final e96 a = new e96("^https?://");

    public static final void a(final int i, final String str, final Function0 function0, final Function0 function1, final String str2, final String str3, String str4, fs4 fs4Var, ux2 ux2Var, final int i2) {
        int i3;
        String str5;
        final fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-771261864);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var2.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.h(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var2.f(str2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var2.f(str3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ux2Var2.f(str4) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if (ux2Var2.N(i4 & 1, (4793491 & i4) != 4793490)) {
            dg6 dg6VarA = cg6.a(iq8.a, xz2.z, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            fs4 fs4VarJ = iq8.j(ka0.F(new s14(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), sf6.a(8.0f));
            boolean z2 = (i4 & 896) == 256;
            Object objK = ux2Var2.K();
            boolean z3 = z2;
            aw awVar = e01.a;
            if (z3 || objK == awVar) {
                objK = new yd7(function0, (byte) 5);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(androidx.compose.foundation.b.b(fs4VarJ, false, null, null, (Function0) objK, 15), str3);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            String strZ = m77.z(i, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, null, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.l, ux2Var2, 0, 0, 131066);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, str2);
            boolean z4 = (i4 & 112) == 32;
            Object objK2 = ux2Var2.K();
            if (z4 || objK2 == awVar) {
                objK2 = new fy(str, (byte) 19);
                ux2Var2.g0(objK2);
            }
            qs7.b(str, cp6.a(fs4VarA2, false, (Function1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, (i4 >> 3) & 14, 0, 131068);
            ux2Var.p(true);
            lv1.B(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.p(cs4Var, 1.0f), 40.0f), 0.0f, ((rn4) ux2Var.j(h72Var)).a.B, ux2Var, 6);
            ux2Var2 = ux2Var;
            ud5 ud5VarT = lv1.T(R.drawable.ic_share, ux2Var2, 0);
            String strZ2 = m77.z(R.string.share_link_content_description, ux2Var2);
            long j = ((rn4) ux2Var2.j(h72Var)).a.s;
            fs4 fs4VarJ2 = iq8.j(ka0.F(cs4Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), sf6.a);
            boolean z5 = (i4 & 7168) == 2048;
            Object objK3 = ux2Var2.K();
            if (z5 || objK3 == awVar) {
                objK3 = new yd7(function1, (byte) 6);
                ux2Var2.g0(objK3);
            }
            fs4 fs4VarB = ka0.B(androidx.compose.foundation.b.b(fs4VarJ2, false, null, null, (Function0) objK3, 15), 8.0f);
            str5 = str4;
            td3.b(ud5VarT, strZ2, androidx.compose.foundation.layout.b.l(androidx.compose.ui.platform.a.a(fs4VarB, str5), 24.0f), j, ux2Var2, 8, 0);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            str5 = str4;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final String str6 = str5;
            j56VarR.d = new hw2() { // from class: o.vf7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wf7.a(i, str, function0, function1, str2, str3, str6, fs4Var2, (ux2) obj, yo1.Y(i2 | 1));
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0292  */
    /* JADX WARN: Code duplicated, block: B:132:0x0294  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final String str2, fs4 fs4Var, final Function0 function0, Function0 function1, final Function0 function2, final Function0 function3, Function0 function4, ux2 ux2Var, final int i, final int i2) {
        final Function0 function5;
        int i3;
        fs4 fs4Var2;
        final Function0 function6;
        final byte b;
        Object obj;
        final Context context;
        final Function0 function7;
        Object obj2;
        final byte b2;
        Object obj3;
        byte b3;
        int i4;
        Object objK;
        final Function0 function8;
        str.getClass();
        ux2Var.Y(-1336781103);
        int i5 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.f(str2) ? 32 : 16);
        if ((i & 3072) == 0) {
            i5 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= ux2Var.h(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= ux2Var.h(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= ux2Var.h(function3) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        int i7 = i5;
        if (i6 != 0) {
            i3 = i7 | 12582912;
            function5 = function4;
        } else {
            function5 = function4;
            i3 = i7 | (ux2Var.h(function5) ? 8388608 : 4194304);
        }
        int i8 = i3;
        if (ux2Var.N(i8 & 1, (i8 & 4793491) != 4793490)) {
            if (i6 != 0) {
                function5 = null;
            }
            Context context2 = (Context) ux2Var.j(lh.b);
            Resources resources = (Resources) ux2Var.j(lh.c);
            int i9 = i8 & 14;
            boolean z = i9 == 4;
            Object objK2 = ux2Var.K();
            Object obj4 = e01.a;
            Object obj5 = objK2;
            if (z || objK2 == obj4) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                Object objI = o67.i(resources, locale, R.string.session_share_session_link_text, str);
                ux2Var.g0(objI);
                obj5 = objI;
            }
            final String str3 = (String) obj5;
            int i10 = i8 & 112;
            boolean z2 = i10 == 32;
            Object objK3 = ux2Var.K();
            Object obj6 = objK3;
            if (z2 || objK3 == obj4) {
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                Object objI2 = o67.i(resources, locale2, R.string.session_share_session_code_text, str2);
                ux2Var.g0(objI2);
                obj6 = objI2;
            }
            final String str4 = (String) obj6;
            ew ewVar = new ew(8.0f, new hk0((byte) 2));
            w50 w50Var = xz2.B;
            zw5 zw5Var = un4.a;
            fs4Var2 = fs4Var;
            fs4 fs4VarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(ka0.C(au8.s(fs4Var2, ((rn4) ux2Var.j(zw5Var)).a.H, sf6.a(16.0f)), 16.0f, 12.0f), 1.0f));
            kw0 kw0VarA = iw0.a(ewVar, w50Var, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarR);
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
            int i11 = i8 & 29360128;
            boolean z3 = (i9 == 4) | ((i8 & 7168) == 2048) | (i11 == 8388608);
            Object objK4 = ux2Var.K();
            if (z3 || objK4 == obj4) {
                b = 0;
                Object obj7 = new Function0() { // from class: o.sf7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b;
                        f88 f88Var = f88.a;
                        Function0 function9 = function5;
                        Function0 function10 = function0;
                        String str5 = str;
                        switch (b4) {
                            case 0:
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
                                qi7Var2.c(str5);
                                function10.a();
                                if (function9 != null) {
                                    function9.a();
                                }
                                return f88Var;
                            default:
                                qi7 qi7Var3 = qi7.g;
                                if (qi7Var3 == null) {
                                    im3.e0("instance");
                                    throw null;
                                }
                                qi7Var3.a();
                                qi7 qi7Var4 = qi7.g;
                                if (qi7Var4 == null) {
                                    im3.e0("instance");
                                    throw null;
                                }
                                qi7Var4.c(str5);
                                function10.a();
                                if (function9 != null) {
                                    function9.a();
                                }
                                return f88Var;
                        }
                    }
                };
                ux2Var.g0(obj7);
                obj = obj7;
            } else {
                b = 0;
                obj = objK4;
            }
            Function0 function9 = (Function0) obj;
            int i12 = ((((458752 & i8) == 131072 ? (byte) 1 : b) | (ux2Var.h(context2) ? 1 : 0)) == true ? 1 : 0) | (ux2Var.f(str3) ? 1 : 0) | (i11 == 8388608 ? (byte) 1 : b);
            Object objK5 = ux2Var.K();
            if (i12 != 0 || objK5 == obj4) {
                final byte b4 = 0;
                context = context2;
                function7 = function5;
                objK5 = new Function0() { // from class: o.tf7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b5 = b4;
                        f88 f88Var = f88.a;
                        Function0 function10 = function7;
                        String str5 = str3;
                        Context context3 = context;
                        Function0 function11 = function2;
                        switch (b5) {
                            case 0:
                                function11.a();
                                wf7.c(R.string.session_share_session_link_apps_not_found_exception, context3, str5);
                                if (function10 != null) {
                                    function10.a();
                                }
                                break;
                            default:
                                function11.a();
                                wf7.c(R.string.session_share_session_code_apps_not_found_exception, context3, str5);
                                if (function10 != null) {
                                    function10.a();
                                }
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var.g0(objK5);
            } else {
                context = context2;
                function7 = function5;
            }
            byte b5 = b;
            final Context context3 = context;
            final Function0 function10 = function7;
            a(R.string.session_share_link_label, str, function9, (Function0) objK5, "TVTA-session-sessionLink", "TVTA-session-copySessionLink", "TVTA-session-shareSessionLink", null, ux2Var, ((i8 << 3) & 112) | 1794048);
            lv1.k(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), 0.0f, ((rn4) ux2Var.j(zw5Var)).a.B, ux2Var, 6, 2);
            int i13 = ((i8 & 57344) == 16384 ? (byte) 1 : b5) | (i10 == 32 ? (byte) 1 : b5) | (i11 == 8388608 ? (byte) 1 : b5);
            Object objK6 = ux2Var.K();
            if (i13 == 0) {
                obj2 = obj4;
                if (objK6 != obj2) {
                    function6 = function1;
                    b2 = 1;
                    obj3 = objK6;
                }
                Function0 function11 = (Function0) obj3;
                if ((i8 & 3670016) == 1048576) {
                    b3 = b2;
                } else {
                    b3 = b5;
                }
                int i14 = ((b3 | (ux2Var.h(context3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var.f(str4) ? 1 : 0);
                if (i11 == 8388608) {
                    b5 = b2;
                }
                i4 = i14 | b5;
                objK = ux2Var.K();
                if (i4 == 0 || objK == obj2) {
                    final byte b6 = 1;
                    function8 = function10;
                    objK = new Function0() { // from class: o.tf7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b7 = b6;
                            f88 f88Var = f88.a;
                            Function0 function12 = function8;
                            String str5 = str4;
                            Context context4 = context3;
                            Function0 function13 = function3;
                            switch (b7) {
                                case 0:
                                    function13.a();
                                    wf7.c(R.string.session_share_session_link_apps_not_found_exception, context4, str5);
                                    if (function12 != null) {
                                        function12.a();
                                    }
                                    break;
                                default:
                                    function13.a();
                                    wf7.c(R.string.session_share_session_code_apps_not_found_exception, context4, str5);
                                    if (function12 != null) {
                                        function12.a();
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK);
                } else {
                    function8 = function10;
                }
                a(R.string.session_share_code_label, str2, function11, (Function0) objK, "TVTA-session-sessionCode", "TVTA-session-copySessionCode", "TVTA-session-shareSessionCode", null, ux2Var, i10 | 1794048);
                ux2Var.p(b2);
                function5 = function8;
            } else {
                obj2 = obj4;
            }
            function6 = function1;
            b2 = 1;
            Object obj8 = new Function0() { // from class: o.sf7
                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    byte b7 = b2;
                    f88 f88Var = f88.a;
                    Function0 function12 = function10;
                    Function0 function13 = function6;
                    String str5 = str2;
                    switch (b7) {
                        case 0:
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
                            qi7Var2.c(str5);
                            function13.a();
                            if (function12 != null) {
                                function12.a();
                            }
                            return f88Var;
                        default:
                            qi7 qi7Var3 = qi7.g;
                            if (qi7Var3 == null) {
                                im3.e0("instance");
                                throw null;
                            }
                            qi7Var3.a();
                            qi7 qi7Var4 = qi7.g;
                            if (qi7Var4 == null) {
                                im3.e0("instance");
                                throw null;
                            }
                            qi7Var4.c(str5);
                            function13.a();
                            if (function12 != null) {
                                function12.a();
                            }
                            return f88Var;
                    }
                }
            };
            ux2Var.g0(obj8);
            obj3 = obj8;
            Function0 function12 = (Function0) obj3;
            if ((i8 & 3670016) == 1048576) {
                b3 = b2;
            } else {
                b3 = b5;
            }
            int i15 = ((b3 | (ux2Var.h(context3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var.f(str4) ? 1 : 0);
            if (i11 == 8388608) {
                b5 = b2;
            }
            i4 = i15 | b5;
            objK = ux2Var.K();
            if (i4 == 0) {
                final byte b7 = 1;
                function8 = function10;
                objK = new Function0() { // from class: o.tf7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b8 = b7;
                        f88 f88Var = f88.a;
                        Function0 function13 = function8;
                        String str5 = str4;
                        Context context4 = context3;
                        Function0 function14 = function3;
                        switch (b8) {
                            case 0:
                                function14.a();
                                wf7.c(R.string.session_share_session_link_apps_not_found_exception, context4, str5);
                                if (function13 != null) {
                                    function13.a();
                                }
                                break;
                            default:
                                function14.a();
                                wf7.c(R.string.session_share_session_code_apps_not_found_exception, context4, str5);
                                if (function13 != null) {
                                    function13.a();
                                }
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var.g0(objK);
            } else {
                final byte b8 = 1;
                function8 = function10;
                objK = new Function0() { // from class: o.tf7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b9 = b8;
                        f88 f88Var = f88.a;
                        Function0 function13 = function8;
                        String str5 = str4;
                        Context context4 = context3;
                        Function0 function14 = function3;
                        switch (b9) {
                            case 0:
                                function14.a();
                                wf7.c(R.string.session_share_session_link_apps_not_found_exception, context4, str5);
                                if (function13 != null) {
                                    function13.a();
                                }
                                break;
                            default:
                                function14.a();
                                wf7.c(R.string.session_share_session_code_apps_not_found_exception, context4, str5);
                                if (function13 != null) {
                                    function13.a();
                                }
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var.g0(objK);
            }
            a(R.string.session_share_code_label, str2, function12, (Function0) objK, "TVTA-session-sessionCode", "TVTA-session-copySessionCode", "TVTA-session-shareSessionCode", null, ux2Var, i10 | 1794048);
            ux2Var.p(b2);
            function5 = function8;
        } else {
            fs4Var2 = fs4Var;
            function6 = function1;
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            final Function0 function13 = function5;
            final fs4 fs4Var3 = fs4Var2;
            final Function0 function14 = function6;
            j56VarR.d = new hw2() { // from class: o.uf7
                @Override // o.hw2
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    wf7.b(str, str2, fs4Var3, function0, function14, function2, function3, function13, (ux2) obj9, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(int i, Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(Intent.createChooser(intent, null));
            return;
        }
        Context context2 = d82.M;
        if (context2 != null) {
            d82.t(context2, i);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }
}
