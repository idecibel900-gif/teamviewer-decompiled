package o;

import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class da0 {
    public static final long a = u47.c(0.5f, 0.0f);

    public static final void a(final fs4 fs4Var, final xy6 xy6Var, final Function0 function0, final float f, final boolean z, final boolean z2, final hw2 hw2Var, final hw2 hw2Var2, final pw6 pw6Var, final long j, final long j2, final float f2, final yy0 yy0Var, ux2 ux2Var, final int i) {
        Object n5Var;
        Object obj;
        int i2;
        int i3;
        ux2Var.Y(57000307);
        int i4 = i | (ux2Var.f(fs4Var) ? 4 : 2) | (ux2Var.f(xy6Var) ? 32 : 16) | (ux2Var.h(function0) ? 256 : 128) | (ux2Var.c(f) ? 2048 : 1024) | (ux2Var.g(z) ? 16384 : 8192) | (ux2Var.g(z2) ? 131072 : 65536) | (ux2Var.h(hw2Var) ? 1048576 : 524288) | (ux2Var.h(hw2Var2) ? 8388608 : 4194304) | (ux2Var.f(pw6Var) ? 67108864 : 33554432) | (ux2Var.e(j) ? 536870912 : 268435456);
        int i5 = (ux2Var.e(j2) ? 4 : 2) | (ux2Var.c(f2) ? 32 : 16) | 384 | (ux2Var.h(yy0Var) ? 2048 : 1024);
        if (ux2Var.N(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            zw5 zw5Var = un4.a;
            ((rn4) ux2Var.j(zw5Var)).d.getClass();
            Object obj2 = cu4.b;
            obj2.getClass();
            ((rn4) ux2Var.j(zw5Var)).d.getClass();
            Object obj3 = cu4.f;
            obj3.getClass();
            ((rn4) ux2Var.j(zw5Var)).d.getClass();
            int i6 = (i4 & 112) ^ 48;
            boolean zH = ((i6 > 32 && ux2Var.f(xy6Var)) || (i4 & 48) == 32) | ux2Var.h(obj2) | ux2Var.h(obj3) | ux2Var.h(obj2);
            Object objK = ux2Var.K();
            Object obj4 = e01.a;
            if (zH || objK == obj4) {
                obj = obj4;
                i2 = i4;
                i3 = i6;
                n5Var = new n5(xy6Var, obj2, obj3, obj2, (byte) 7);
                ux2Var.g0(n5Var);
            } else {
                obj = obj4;
                i2 = i4;
                n5Var = objK;
                i3 = i6;
            }
            ck3.k((Function0) n5Var, ux2Var);
            Object objK2 = ux2Var.K();
            if (objK2 == obj) {
                objK2 = ck3.a(0.0f);
                ux2Var.g0(objK2);
            }
            km kmVar = (km) objK2;
            Object objK3 = ux2Var.K();
            if (objK3 == obj) {
                objK3 = ck3.w(ux2Var);
                ux2Var.g0(objK3);
            }
            Object obj5 = (me1) objK3;
            boolean zH2 = ux2Var.h(obj5) | ((i3 > 32 && ux2Var.f(xy6Var)) || (i2 & 48) == 32) | ux2Var.h(kmVar) | ((i2 & 896) == 256);
            Object objK4 = ux2Var.K();
            if (zH2 || objK4 == obj) {
                Object ebVar = new eb((Object) xy6Var, obj5, (Object) kmVar, function0, (byte) 3);
                ux2Var.g0(ebVar);
                objK4 = ebVar;
            }
            Object obj6 = (Function0) objK4;
            boolean z3 = z2 && xy6Var.e();
            boolean zH3 = ux2Var.h(kmVar) | ux2Var.f(obj6);
            Object objK5 = ux2Var.K();
            if (zH3 || objK5 == obj) {
                objK5 = new tx(obj6, kmVar, null, (byte) 2);
                ux2Var.g0(objK5);
            }
            ga0.e(z3, (hw2) objK5, ux2Var, 0);
            float fFloatValue = ((Number) kmVar.d()).floatValue();
            int i7 = i2 >> 6;
            int i8 = i5 << 24;
            int i9 = i2 >> 15;
            b(fFloatValue, fs4Var, xy6Var, function0, f, z, pw6Var, j, j2, f2, hw2Var, hw2Var2, yy0Var, ux2Var, ((i2 << 3) & 524272) | (3670016 & i7) | (i7 & 29360128) | (234881024 & i8) | (i8 & 1879048192), (i9 & 896) | (i9 & 112) | 6 | (i5 & 7168));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(xy6Var, function0, f, z, z2, hw2Var, hw2Var2, pw6Var, j, j2, f2, yy0Var, i) { // from class: o.u90
                public final /* synthetic */ xy6 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ Function0 f2186o;
                public final /* synthetic */ float p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ boolean r;
                public final /* synthetic */ hw2 s;
                public final /* synthetic */ hw2 t;
                public final /* synthetic */ pw6 u;
                public final /* synthetic */ long v;
                public final /* synthetic */ long w;
                public final /* synthetic */ float x;
                public final /* synthetic */ yy0 y;

                @Override // o.hw2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int iY = yo1.Y(1);
                    da0.a(this.m, this.n, this.f2186o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (ux2) obj7, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void b(final float f, final fs4 fs4Var, final xy6 xy6Var, final Function0 function0, final float f2, final boolean z, final pw6 pw6Var, final long j, final long j2, final float f3, final hw2 hw2Var, final hw2 hw2Var2, final yy0 yy0Var, ux2 ux2Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function0 function1;
        fs4 fs4VarT;
        final xy6 xy6Var2 = xy6Var;
        ux2Var.Y(-780255289);
        if ((i & 6) == 0) {
            i3 = (ux2Var.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.f(xy6Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.c(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ux2Var.f(pw6Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.e(j) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.e(j2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ux2Var.c(f3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.c(0.0f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(hw2Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            String strO = n37.o(R.string.m3c_bottom_sheet_pane_title, ux2Var);
            ee8 ee8Var = (ee8) ux2Var.j(b11.t);
            ((rn4) ux2Var.j(un4.a)).d.getClass();
            e87 e87Var = cu4.b;
            e87Var.getClass();
            zw5 zw5Var = b11.h;
            in1 in1Var = (in1) ux2Var.j(zw5Var);
            z38 z38Var = ve.a;
            Object obj = xy6Var2.g;
            nf nfVar = xy6Var2.g;
            int i6 = i4;
            int i7 = (i3 & 896) ^ 384;
            boolean z2 = (i7 > 256 && ux2Var.f(xy6Var2)) || (i3 & 384) == 256;
            Object objK = ux2Var.K();
            boolean z3 = z2;
            Object obj2 = e01.a;
            if (z3 || objK == obj2) {
                objK = new v90(xy6Var2, (byte) 0);
                ux2Var.g0(objK);
            }
            Object obj3 = (Function1) objK;
            z38 z38Var2 = ve.a;
            Object obj4 = (in1) ux2Var.j(zw5Var);
            boolean zF = ux2Var.f(obj4) | ux2Var.f(obj) | ux2Var.f(obj3) | ux2Var.f(e87Var);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == obj2) {
                objK2 = new h47(new iu(obj, obj3, new y(obj4, (byte) 4), (byte) 3), e87Var);
                ux2Var.g0(objK2);
            }
            h47 h47Var = (h47) objK2;
            boolean zF2 = ux2Var.f(h47Var) | ((i7 > 256 && ux2Var.f(xy6Var2)) || (i3 & 384) == 256) | ux2Var.f(ee8Var) | ux2Var.f(in1Var);
            Object objK3 = ux2Var.K();
            if (zF2 || objK3 == obj2) {
                i5 = i3;
                Object ca0Var = new ca0(ee8Var, xy6Var2, in1Var, h47Var, function0);
                xy6Var2 = xy6Var2;
                function1 = function0;
                ux2Var.g0(ca0Var);
                objK3 = ca0Var;
            } else {
                function1 = function0;
                i5 = i3;
            }
            ca0 ca0Var2 = (ca0) objK3;
            Object objK4 = ux2Var.K();
            if (objK4 == obj2) {
                objK4 = ck3.w(ux2Var);
                ux2Var.g0(objK4);
            }
            final me1 me1Var = (me1) objK4;
            boolean zH = ((i7 > 256 && ux2Var.f(xy6Var2)) || (i5 & 384) == 256) | ux2Var.h(me1Var) | ((i5 & 7168) == 2048);
            Object objK5 = ux2Var.K();
            if (zH || objK5 == obj2) {
                objK5 = new f70(xy6Var2, me1Var, function1, (byte) 2);
                ux2Var.g0(objK5);
            }
            final Function0 function2 = (Function0) objK5;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.q(fs4Var, f2, 1), 1.0f);
            if (z) {
                ux2Var.W(1794078218);
                boolean z4 = (i7 > 256 && ux2Var.f(xy6Var2)) || (i5 & 384) == 256;
                Object objK6 = ux2Var.K();
                if (z4 || objK6 == obj2) {
                    float f4 = uy6.a;
                    objK6 = new ty6(xy6Var2, ca0Var2);
                    ux2Var.g0(objK6);
                }
                fs4VarT = im3.T((u15) objK6, null);
                ux2Var.p(false);
            } else {
                ux2Var.W(1794093039);
                ux2Var.p(false);
                fs4VarT = cs4.b;
            }
            fs4 fs4VarF = fs4VarC.f(fs4VarT);
            boolean z5 = (i7 > 256 && ux2Var.f(xy6Var2)) || (i5 & 384) == 256;
            Object objK7 = ux2Var.K();
            if (z5 || objK7 == obj2) {
                objK7 = new t0(xy6Var2, (byte) 6);
                ux2Var.g0(objK7);
            }
            fs4 fs4VarF2 = uf0.m(fs4VarF, nfVar, (hw2) objK7).f(new we(nfVar, z && xy6Var2.c() != yy6.m, ca0Var2));
            boolean zF3 = ux2Var.f(strO);
            Object objK8 = ux2Var.K();
            if (zF3 || objK8 == obj2) {
                objK8 = new fy(strO, (byte) 3);
                ux2Var.g0(objK8);
            }
            fs4 fs4VarT2 = di1.t(cp6.a(fs4VarF2, false, (Function1) objK8), new z90(xy6Var2, f, (byte) 0));
            float f5 = uy6.a;
            int i8 = i5 >> 15;
            ig7.a(di1.t(fs4VarT2, new v90(xy6Var2, (byte) 1)), pw6Var, j, j2, f3, 0.0f, au8.O(1483196812, new hw2() { // from class: o.w90
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // o.hw2
                public final Object invoke(Object obj5, Object obj6) {
                    ux2 ux2Var2 = (ux2) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        cs4 cs4Var = cs4.b;
                        fs4 fs4VarL = pm8.L(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), (qj8) hw2Var2.invoke(ux2Var2, 0));
                        final float f6 = f;
                        fs4 fs4VarT3 = di1.t(fs4VarL, new Function1() { // from class: o.aa0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                jd6 jd6Var = (jd6) obj7;
                                float f7 = f6;
                                float fC = da0.c(jd6Var, f7);
                                float fD = da0.d(jd6Var, f7);
                                jd6Var.l(fD == 0.0f ? 1.0f : fC / fD);
                                jd6Var.z(da0.a);
                                return f88.a;
                            }
                        });
                        float f7 = uy6.a;
                        xy6 xy6Var3 = xy6Var2;
                        fs4 fs4VarT4 = di1.t(fs4VarT3, new v90(xy6Var3, (byte) 2));
                        kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
                        int iHashCode = Long.hashCode(ux2Var2.T);
                        yj5 yj5VarL = ux2Var2.l();
                        fs4 fs4VarS = uf0.s(ux2Var2, fs4VarT4);
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
                        hw2 hw2Var3 = hw2Var;
                        if (hw2Var3 != null) {
                            ux2Var2.W(-444181086);
                            String strO2 = n37.o(R.string.m3c_bottom_sheet_collapse_description, ux2Var2);
                            String strO3 = n37.o(R.string.m3c_bottom_sheet_dismiss_description, ux2Var2);
                            String strO4 = n37.o(R.string.m3c_bottom_sheet_expand_description, ux2Var2);
                            boolean zF4 = ux2Var2.f(xy6Var3);
                            Function0 function3 = function2;
                            boolean zF5 = zF4 | ux2Var2.f(function3);
                            me1 me1Var2 = me1Var;
                            boolean zH2 = zF5 | ux2Var2.h(me1Var2);
                            Object objK9 = ux2Var2.K();
                            aw awVar = e01.a;
                            if (zH2 || objK9 == awVar) {
                                objK9 = new f70(xy6Var3, function3, me1Var2);
                                ux2Var2.g0(objK9);
                            }
                            fs4 fs4VarB = androidx.compose.foundation.b.b(cs4Var, false, null, null, (Function0) objK9, 15);
                            boolean z6 = z;
                            boolean zG = ux2Var2.g(z6) | ux2Var2.f(xy6Var3) | ux2Var2.f(strO3) | ux2Var2.f(function3) | ux2Var2.f(strO4) | ux2Var2.h(me1Var2) | ux2Var2.f(strO2);
                            Object objK10 = ux2Var2.K();
                            if (zG || objK10 == awVar) {
                                y90 y90Var = new y90(z6, xy6Var3, strO3, strO4, strO2, function3, me1Var2);
                                ux2Var2.g0(y90Var);
                                objK10 = y90Var;
                            }
                            uy6.a(cp6.a(fs4VarB, true, (Function1) objK10), hw2Var3, ux2Var2, 0);
                            ux2Var2.p(false);
                        } else {
                            ux2Var2.W(-441815104);
                            ux2Var2.p(false);
                        }
                        yy0Var.d(lw0.a, ux2Var2, 6);
                        ux2Var2.p(true);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, (i8 & 57344) | (i8 & 112) | 12582912 | (i8 & 896) | (i8 & 7168) | (458752 & (i6 << 15)), 64);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.x90
                @Override // o.hw2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    da0.b(f, fs4Var, xy6Var, function0, f2, z, pw6Var, j, j2, f3, hw2Var, hw2Var2, yy0Var, (ux2) obj5, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    public static final float c(jd6 jd6Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jd6Var.C >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (vs1.G(0.0f, Math.min(jd6Var.E.getDensity() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float d(jd6 jd6Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jd6Var.C & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (vs1.G(0.0f, Math.min(jd6Var.E.getDensity() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }
}
