package o;

import android.content.res.Resources;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o77 {
    public static final void a(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function1 function2;
        fs4 fs4Var2;
        ux2Var.Y(-96571520);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= ux2Var.h(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f("TVTA-settings-hideWallpaper") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
        } else {
            fs4Var2 = fs4Var;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            l47.d(new sk7(y57.g(R.string.settings_hide_wallpaper), y57.g(R.string.settings_hide_wallpaper_subtitle), new yk7(R.drawable.wallpaper), null, 24), z, function2, fs4Var2, "TVTA-settings-hideWallpaper", m77.z(R.string.settings_hide_wallpaper, ux2Var), ux2Var, ((i2 << 3) & 1008) | (i2 & 7168) | ((i2 << 6) & 57344), 32);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kc(z, function1, fs4Var, i, (byte) 5);
        }
    }

    public static final void b(int i, int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        Function0 function1;
        ux2Var.Y(1426729155);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f("TVTA-settings-hideWallpaper") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 >> 6) & 112;
            int i5 = i3 << 6;
            x37.e(new sk7(y57.g(R.string.settings_hide_wallpaper), y57.g(i), new yk7(R.drawable.wallpaper), null, 24), fs4Var, null, function1, "TVTA-settings-hideWallpaper", ux2Var, (i5 & 57344) | i4 | (i5 & 7168), 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jc(i, function0, fs4Var, i2, (byte) 5);
        }
    }

    public static final void c(final zr7 zr7Var, final Function1 function1, final fs4 fs4Var, boolean z, ot7 ot7Var, final hw2 hw2Var, final hw2 hw2Var2, tg8 tg8Var, final yx3 yx3Var, final xx3 xx3Var, final boolean z2, int i, int i2, pw6 pw6Var, final cq7 cq7Var, ux2 ux2Var, final int i3) {
        ux2 ux2Var2;
        final boolean z3;
        final ot7 ot7Var2;
        final tg8 tg8Var2;
        final int i4;
        final int i5;
        final pw6 pw6Var2;
        ot7 ot7Var3;
        final int i6;
        final pw6 pw6VarB;
        tg8 tg8Var3;
        final boolean z4;
        ux2Var.Y(-1126989771);
        int i7 = i3 | (ux2Var.f(zr7Var) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128) | 102329344;
        final int i8 = 1;
        if (ux2Var.N(i7 & 1, ((i7 & 306783379) == 306783378 && (((ux2Var.f(xx3Var) ? (char) 0 : (char) 0) | 28086) & 306783379) == 306783378 && (((ux2Var.f(cq7Var) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            ux2Var.S();
            if ((i3 & 1) == 0 || ux2Var.x()) {
                ot7Var3 = (ot7) ux2Var.j(qs7.a);
                yq4 yq4Var = xz2.Z;
                i6 = z2 ? 1 : Integer.MAX_VALUE;
                pw6VarB = ux6.b(au8.w, ux2Var);
                tg8Var3 = yq4Var;
                z4 = true;
            } else {
                ux2Var.Q();
                z4 = z;
                ot7Var3 = ot7Var;
                tg8Var3 = tg8Var;
                i6 = i;
                i8 = i2;
                pw6VarB = pw6Var;
            }
            ux2Var.q();
            ux2Var.W(-391753178);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ua5.s(ux2Var);
            }
            final mw4 mw4Var = (mw4) objK;
            ux2Var.p(false);
            ux2Var.W(-705368401);
            long jC = ot7Var3.c();
            if (jC == 16) {
                jC = cq7Var.e(z4, false, ((Boolean) qs1.H(mw4Var, ux2Var, 0).getValue()).booleanValue());
            }
            long j = jC;
            ux2Var.p(false);
            final ot7 ot7VarE = ot7Var3.e(new ot7(j, 0L, null, 0L, 0, 0L, 16777214));
            ot7 ot7Var4 = ot7Var3;
            final tg8 tg8Var4 = tg8Var3;
            ux2Var2 = ux2Var;
            j51.l(kt7.a.a(cq7Var.k), au8.O(-306109195, new hw2() { // from class: o.uq7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ux2 ux2Var3 = (ux2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ux2Var3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        n37.o(R.string.default_error_message, ux2Var3);
                        fs4 fs4VarA = androidx.compose.foundation.layout.b.a(fs4Var, 280.0f, 56.0f);
                        cq7 cq7Var2 = cq7Var;
                        t57 t57Var = new t57(cq7Var2.i);
                        zr7 zr7Var2 = zr7Var;
                        boolean z5 = z4;
                        boolean z6 = z2;
                        tg8 tg8Var5 = tg8Var4;
                        mw4 mw4Var2 = mw4Var;
                        q40.b(zr7Var2, function1, fs4VarA, z5, false, ot7VarE, yx3Var, xx3Var, z6, i6, i8 ? 1 : 0, tg8Var5, null, mw4Var2, t57Var, au8.O(-609710734, new dy(zr7Var2, z5, z6, tg8Var5, mw4Var2, hw2Var, hw2Var2, pw6VarB, cq7Var2), ux2Var3), ux2Var3, 0, 196608, 4096);
                    } else {
                        ux2Var3.Q();
                    }
                    return f88.a;
                }
            }, ux2Var2), ux2Var2, 56);
            z3 = z4;
            i5 = i8;
            tg8Var2 = tg8Var4;
            pw6Var2 = pw6VarB;
            ot7Var2 = ot7Var4;
            i4 = i6;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            z3 = z;
            ot7Var2 = ot7Var;
            tg8Var2 = tg8Var;
            i4 = i;
            i5 = i2;
            pw6Var2 = pw6Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(function1, fs4Var, z3, ot7Var2, hw2Var, hw2Var2, tg8Var2, yx3Var, xx3Var, z2, i4, i5, pw6Var2, cq7Var, i3) { // from class: o.vq7
                public final /* synthetic */ cq7 A;
                public final /* synthetic */ Function1 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ fs4 f2336o;
                public final /* synthetic */ boolean p;
                public final /* synthetic */ ot7 q;
                public final /* synthetic */ hw2 r;
                public final /* synthetic */ hw2 s;
                public final /* synthetic */ tg8 t;
                public final /* synthetic */ yx3 u;
                public final /* synthetic */ xx3 v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ int x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ pw6 z;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(817889281);
                    zr7 zr7Var2 = this.m;
                    Function1 function2 = this.n;
                    fs4 fs4Var2 = this.f2336o;
                    boolean z5 = this.p;
                    ot7 ot7Var5 = this.q;
                    hw2 hw2Var3 = this.r;
                    hw2 hw2Var4 = this.s;
                    tg8 tg8Var5 = this.t;
                    yx3 yx3Var2 = this.u;
                    xx3 xx3Var2 = this.v;
                    boolean z6 = this.w;
                    int i9 = this.x;
                    boolean z7 = this.y;
                    pw6 pw6Var3 = this.z;
                    cq7 cq7Var2 = this.A;
                    o77.c(zr7Var2, function2, fs4Var2, z5, ot7Var5, hw2Var3, hw2Var4, tg8Var5, yx3Var2, xx3Var2, z6, i9, z7 ? 1 : 0, pw6Var3, cq7Var2, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void d(boolean z, boolean z2, Function1 function1, int i, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i2) {
        String str2;
        function1.getClass();
        function0.getClass();
        ux2Var.Y(239071692);
        int i3 = i2 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.d(i) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.f(fs4Var) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                ux2Var.W(1129282388);
                b(i, ((i3 >> 6) & 7168) | ((i3 >> 9) & 126) | 384, function0, ux2Var, fs4Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(1129449571);
                a(z2, function1, fs4Var, ux2Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | 384);
                ux2Var.p(false);
            }
            str2 = "TVTA-settings-hideWallpaper";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ic(z, z2, function1, i, function0, fs4Var, str2, i2, (byte) 5);
        }
    }

    public static void e(Appendable appendable, Object obj, Function1 function1) {
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final q58 f(ub8 ub8Var) {
        int iOrdinal = ub8Var.ordinal();
        if (iOrdinal == 0) {
            return q58.INV;
        }
        if (iOrdinal == 1) {
            return q58.IN;
        }
        if (iOrdinal == 2) {
            return q58.OUT;
        }
        gk0.s();
        return null;
    }

    public static k20 g(l70 l70Var) {
        long jI = 0;
        long jI2 = 0;
        String strG = "";
        String strG2 = strG;
        String strG3 = strG2;
        while (true) {
            int iH = l70Var.h();
            if (iH == 0) {
                return new k20(strG, strG2, jI, strG3, jI2);
            }
            int i = iH >>> 3;
            int i2 = iH & 7;
            switch (i) {
                case 1:
                    l70.b(i, 0, i2);
                    jI = l70Var.i();
                    break;
                case 2:
                    l70.b(i, 0, i2);
                    jI2 = l70Var.i();
                    break;
                case 3:
                    l70.b(i, 0, i2);
                    l70Var.i();
                    break;
                case 4:
                    l70.b(i, 2, i2);
                    strG = l70Var.g();
                    break;
                case 5:
                    l70.b(i, 0, i2);
                    l70Var.i();
                    break;
                case 6:
                    l70.b(i, 2, i2);
                    strG2 = l70Var.g();
                    break;
                case 7:
                    l70.b(i, 0, i2);
                    l70Var.i();
                    break;
                case 8:
                    l70.b(i, 2, i2);
                    strG3 = l70Var.g();
                    break;
                default:
                    l70Var.j(i2);
                    break;
            }
        }
    }

    public static aw h(l70 l70Var) {
        while (true) {
            int iH = l70Var.h();
            if (iH == 0) {
                return new aw((byte) 26);
            }
            int i = iH >>> 3;
            int i2 = iH & 7;
            if (i == 1) {
                l70.b(i, 2, i2);
                l70Var.g();
            } else if (i == 2) {
                l70.b(i, 2, i2);
                l70Var.g();
            } else if (i == 3) {
                l70.b(i, 0, i2);
                l70Var.i();
            } else if (i == 4) {
                l70.b(i, 2, i2);
                l70Var.e();
            } else if (i != 6) {
                l70Var.j(i2);
            } else {
                l70.b(i, 2, i2);
                l70 l70VarF = l70Var.f();
                while (true) {
                    int iH2 = l70VarF.h();
                    if (iH2 != 0) {
                        int i3 = iH2 >>> 3;
                        int i4 = iH2 & 7;
                        if (i3 != 1) {
                            l70VarF.j(i4);
                        } else {
                            l70.b(i3, 2, i4);
                            l70VarF.e();
                        }
                    }
                }
            }
        }
    }

    public static void i(l70 l70Var, HashMap map) {
        int i;
        int i2;
        l70 l70Var2;
        int i3 = 0;
        dz7 dz7Var = null;
        int i4 = 0;
        while (true) {
            int iH = l70Var.h();
            if (iH == 0) {
                if (dz7Var != null) {
                    map.put(Integer.valueOf(i4), dz7Var);
                    return;
                }
                return;
            }
            int i5 = iH >>> 3;
            int i6 = iH & 7;
            int i7 = 1;
            if (i5 == 1) {
                i = i3;
                l70.b(i5, i, i6);
                i4 = (int) l70Var.i();
            } else if (i5 != 2) {
                l70Var.j(i6);
                i = i3;
            } else {
                l70.b(i5, 2, i6);
                l70 l70VarF = l70Var.f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i8 = i3;
                String strG = "";
                while (true) {
                    int iH2 = l70VarF.h();
                    if (iH2 != 0) {
                        int i9 = iH2 >>> 3;
                        int i10 = iH2 & 7;
                        switch (i9) {
                            case 1:
                                i2 = i3;
                                l70Var2 = l70VarF;
                                l70.b(i9, i2, i10);
                                i8 = (int) l70Var2.i();
                                break;
                            case 2:
                                l70Var2 = l70VarF;
                                l70.b(i9, 2, i10);
                                strG = l70Var2.g();
                                i2 = 0;
                                break;
                            case 3:
                                l70.b(i9, 2, i10);
                                l70 l70VarF2 = l70VarF.f();
                                String strG2 = "";
                                long jI = 0;
                                while (true) {
                                    int iH3 = l70VarF2.h();
                                    if (iH3 == 0) {
                                        l70Var2 = l70VarF;
                                        arrayList.add(new g96(strG2, jI));
                                        i2 = 0;
                                    } else {
                                        int i11 = iH3 >>> 3;
                                        l70 l70Var3 = l70VarF;
                                        int i12 = iH3 & 7;
                                        if (i11 == i7) {
                                            l70.b(i11, 2, i12);
                                            strG2 = l70VarF2.g();
                                        } else if (i11 != 2) {
                                            l70VarF2.j(i12);
                                        } else {
                                            l70.b(i11, 0, i12);
                                            jI = l70VarF2.i();
                                        }
                                        l70VarF = l70Var3;
                                        i7 = 1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                l70.b(i9, 2, i10);
                                arrayList4.add(g(l70VarF.f()));
                                l70Var2 = l70VarF;
                                i2 = 0;
                                break;
                            case 5:
                                l70.b(i9, 2, i10);
                                arrayList5.add(h(l70VarF.f()));
                                l70Var2 = l70VarF;
                                i2 = 0;
                                break;
                            case 6:
                                l70.b(i9, i3, i10);
                                l70VarF.i();
                                i2 = i3;
                                l70Var2 = l70VarF;
                                break;
                            case 7:
                                l70.b(i9, 2, i10);
                                arrayList2.add(l70VarF.g());
                                l70Var2 = l70VarF;
                                i2 = 0;
                                break;
                            case 8:
                                l70.b(i9, i3, i10);
                                l70VarF.i();
                                i2 = i3;
                                l70Var2 = l70VarF;
                                break;
                            case ep1.b /* 9 */:
                                l70.b(i9, 2, i10);
                                arrayList3.add(l70VarF.g());
                                l70Var2 = l70VarF;
                                i2 = 0;
                                break;
                            default:
                                l70VarF.j(i10);
                                l70Var2 = l70VarF;
                                i2 = 0;
                                break;
                        }
                        i3 = i2;
                        l70VarF = l70Var2;
                        i7 = 1;
                    } else {
                        i = i3;
                        dz7Var = new dz7(i8, strG, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                    }
                }
            }
            i3 = i;
        }
    }

    public static final String l(j22 j22Var, Resources resources, int i) {
        j22Var.getClass();
        resources.getClass();
        return String.format("%s (%s)", Arrays.copyOf(new Object[]{resources.getString(i), j22Var.a()}, 2));
    }

    public static final String m(xw2 xw2Var) {
        sy4 sy4Var;
        zi0 zi0VarN = wy3.z(xw2Var) ? n(xw2Var) : null;
        if (zi0VarN != null) {
            zi0 zi0VarI = bp1.i(zi0VarN);
            if (zi0VarI instanceof bu5) {
                wy3.z(zi0VarI);
                zi0 zi0VarB = bp1.b(bp1.i(zi0VarI), ek.x);
                if (zi0VarB != null && (sy4Var = (sy4) jg0.a.get(bp1.g(zi0VarB))) != null) {
                    return sy4Var.b();
                }
            } else if (zi0VarI instanceof c07) {
                int i = hg0.l;
                LinkedHashMap linkedHashMap = y77.i;
                String strF = io1.F((c07) zi0VarI);
                sy4 sy4Var2 = strF == null ? null : (sy4) linkedHashMap.get(strF);
                if (sy4Var2 != null) {
                    return sy4Var2.b();
                }
            }
        }
        return null;
    }

    public static final zi0 n(zi0 zi0Var) {
        zi0Var.getClass();
        if (!y77.j.contains(zi0Var.getName()) && !jg0.d.contains(bp1.i(zi0Var).getName())) {
            return null;
        }
        if ((zi0Var instanceof bu5) || (zi0Var instanceof zt5)) {
            return bp1.b(zi0Var, e24.O);
        }
        if (zi0Var instanceof c07) {
            return bp1.b(zi0Var, e24.P);
        }
        return null;
    }

    public static final zi0 o(zi0 zi0Var) {
        zi0Var.getClass();
        zi0 zi0VarN = n(zi0Var);
        if (zi0VarN != null) {
            return zi0VarN;
        }
        int i = ig0.l;
        sy4 name = zi0Var.getName();
        name.getClass();
        if (y77.e.contains(name)) {
            return bp1.b(zi0Var, e24.Q);
        }
        return null;
    }

    public static final boolean p(ns4 ns4Var, zi0 zi0Var) {
        ns4Var.getClass();
        zi0Var.getClass();
        fi1 fi1VarI = zi0Var.i();
        fi1VarI.getClass();
        g07 g07VarW = ((ns4) fi1VarI).W();
        g07VarW.getClass();
        for (ns4 ns4VarJ = zo1.j(ns4Var); ns4VarJ != null; ns4VarJ = zo1.j(ns4VarJ)) {
            if (!(ns4VarJ instanceof b24)) {
                g07 g07VarW2 = ns4VarJ.W();
                if (g07VarW2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                m98 m98VarH = null;
                arrayDeque.add(new ke7(g07VarW2, null));
                k48 k48VarO0 = g07VarW.o0();
                while (!arrayDeque.isEmpty()) {
                    ke7 ke7Var = (ke7) arrayDeque.poll();
                    oz3 oz3VarF = ke7Var.a;
                    k48 k48VarO1 = oz3VarF.o0();
                    if (k48VarO1 == null) {
                        n67.a(3);
                        throw null;
                    }
                    if (k48VarO0 == null) {
                        n67.a(4);
                        throw null;
                    }
                    if (k48VarO1.equals(k48VarO0)) {
                        boolean zP0 = oz3VarF.p0();
                        for (ke7 ke7Var2 = ke7Var.b; ke7Var2 != null; ke7Var2 = ke7Var2.b) {
                            oz3 oz3Var = ke7Var2.a;
                            List listM0 = oz3Var.m0();
                            ub8 ub8Var = ub8.f2197o;
                            rk5 rk5Var = m48.b;
                            if (listM0 != null && listM0.isEmpty()) {
                                oz3VarF = new m58(rk5Var.e(oz3Var.o0(), oz3Var.m0())).f(oz3VarF, ub8Var);
                                break;
                            }
                            Iterator it = listM0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    oz3VarF = new m58(rk5Var.e(oz3Var.o0(), oz3Var.m0())).f(oz3VarF, ub8Var);
                                    break;
                                }
                                if (((h58) it.next()).a() != ub8Var) {
                                    oz3VarF = (oz3) db8.f(new m58(pm8.M(rk5Var.e(oz3Var.o0(), oz3Var.m0()))).f(oz3VarF, ub8Var)).b;
                                    break;
                                }
                            }
                            zP0 = zP0 || oz3Var.p0();
                        }
                        k48 k48VarO2 = oz3VarF.o0();
                        if (k48VarO2 == null) {
                            n67.a(3);
                            throw null;
                        }
                        if (k48VarO2.equals(k48VarO0)) {
                            m98VarH = p58.h(oz3VarF, zP0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + y57.n(k48VarO2) + ", \n\nsupertype: " + y57.n(k48VarO0) + " \n" + k48VarO2.equals(k48VarO0));
                    }
                    for (oz3 oz3Var2 : k48VarO1.b()) {
                        oz3Var2.getClass();
                        arrayDeque.add(new ke7(oz3Var2, ke7Var));
                    }
                }
                if (m98VarH != null) {
                    return !wy3.z(ns4VarJ);
                }
            }
        }
        return false;
    }

    public static yc8 r(String str) {
        String strGroup;
        if (str == null || ub7.b0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i2 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i3 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
        strGroup4.getClass();
        return new yc8(strGroup4, i, i2, i3);
    }

    public static fs4 t(fs4 fs4Var, final hk6 hk6Var, me1 me1Var) {
        final long j = rv0.c;
        fs4Var.getClass();
        hk6Var.getClass();
        me1Var.getClass();
        final km kmVarA = ck3.a(0.3f);
        im3.R(me1Var, null, null, new mf7(hk6Var, kmVarA, null, (byte) 2), 3);
        return j51.B(im3.Z(fs4Var, hk6Var, true), new Function1() { // from class: o.cm7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                u52 u52Var = (u52) obj;
                u52Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) / 8.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) - fIntBitsToFloat;
                hk6 hk6Var2 = hk6Var;
                float fZ = fIntBitsToFloat2 / hk6Var2.f.z();
                boolean zA = hk6Var2.h.a();
                km kmVar = kmVarA;
                if (zA || ((Number) kmVar.d()).floatValue() > 0.0f) {
                    float fMin = Math.min(u52Var.d0(4.0f) + (hk6Var2.a.z() * fZ), (Float.intBitsToFloat((int) (u52Var.d() & 4294967295L)) - fIntBitsToFloat) - u52Var.d0(4.0f));
                    long jB = rv0.b(((Number) kmVar.d()).floatValue(), j);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (u52Var.d() >> 32)) - u52Var.d0(8.0f)) - u52Var.d0(4.0f))) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(u52Var.d0(8.0f))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    float fD0 = u52Var.d0(8.0f);
                    u52.p(u52Var, jB, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fD0)) << 32) | (((long) Float.floatToRawIntBits(fD0)) & 4294967295L), null, 240);
                }
                return f88.a;
            }
        });
    }

    public boolean A(vs8 vs8Var, us8 us8Var, us8 us8Var2) {
        return n37.u(rs8.c, vs8Var, us8Var, us8Var2);
    }

    public abstract String j(byte[] bArr, int i, int i2);

    public abstract int k(int i, int i2, String str, byte[] bArr);

    public boolean q(byte[] bArr, int i, int i2) {
        return s(bArr, i, i2) == 0;
    }

    public abstract int s(byte[] bArr, int i, int i2);

    public qs8 u(ot8 ot8Var) {
        return (qs8) rs8.d.getAndSet(ot8Var, qs8.d);
    }

    public us8 v(ot8 ot8Var) {
        return (us8) rs8.c.getAndSet(ot8Var, us8.c);
    }

    public void w(us8 us8Var, us8 us8Var2) {
        rs8.b.lazySet(us8Var, us8Var2);
    }

    public void x(us8 us8Var, Thread thread) {
        rs8.a.lazySet(us8Var, thread);
    }

    public boolean y(ot8 ot8Var, qs8 qs8Var, qs8 qs8Var2) {
        return n37.u(rs8.d, ot8Var, qs8Var, qs8Var2);
    }

    public boolean z(vs8 vs8Var, Object obj, Object obj2) {
        return n37.u(rs8.e, vs8Var, obj, obj2);
    }
}
