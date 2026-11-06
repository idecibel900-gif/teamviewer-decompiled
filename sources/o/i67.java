package o;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i67 {
    public static void A(TextView textView, int i) {
        if (i < 0) {
            yq4.f();
            return;
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static final lc6 B(lc6 lc6Var) {
        lc6Var.getClass();
        jc6 jc6VarE = lc6Var.e();
        nc6 nc6Var = lc6Var.s;
        jc6VarE.g = new w88(nc6Var.q(), nc6Var.j());
        return jc6VarE.a();
    }

    public static final g48 C(up upVar) {
        upVar.getClass();
        if (upVar.isEmpty()) {
            g48.n.getClass();
            return g48.f858o;
        }
        lh7 lh7Var = g48.n;
        List listK = qf0.K(new xp(upVar));
        lh7Var.getClass();
        return lh7.n(listK);
    }

    public static ActionMode.Callback D(ActionMode.Callback callback) {
        return callback instanceof st7 ? ((st7) callback).a : callback;
    }

    public static final void E(io ioVar, ko koVar) {
        koVar.n.setValue(ioVar.e.getValue());
        qo qoVar = koVar.f1284o;
        qo qoVar2 = ioVar.f;
        int iB = qoVar.b();
        for (int i = 0; i < iB; i++) {
            qoVar.e(i, qoVar2.a(i));
        }
        koVar.q = ioVar.h;
        koVar.p = ioVar.g;
        koVar.r = ((Boolean) ioVar.i.getValue()).booleanValue();
    }

    public static final void F(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static ActionMode.Callback G(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof st7) || callback == null) ? callback : new st7(callback, textView);
    }

    public static void H(int i, int i2) {
        String strZ;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strZ = n67.z("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strZ = n67.z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static void I(int i, int i2, int i3) {
        String strJ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strJ = J(i, i3, "start index");
            } else {
                strJ = (i2 < 0 || i2 > i3) ? J(i2, i3, "end index") : n67.z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static String J(int i, int i2, String str) {
        if (i < 0) {
            return n67.z("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return n67.z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void a(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-678607755);
        int i2 = i | 6;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            h72 h72Var = un4.a;
            List listL = qf0.L(new rv0(((rn4) ux2Var2.j(h72Var)).a.B), new rv0(((rn4) ux2Var2.j(h72Var)).a.r), new rv0(((rn4) ux2Var2.j(h72Var)).a.B));
            rh3 rh3VarK = nv1.k(nv1.G("shimmer", ux2Var2, 0), 0.0f, 1000.0f, db8.J(db8.I0(1200, 2, q72.c), 4), m77.z(R.string.solutions_screen_loading_animation_content_description, ux2Var2), ux2Var2, 4536, 0);
            float fFloatValue = ((Number) rh3VarK.f1923o.getValue()).floatValue();
            bg5 bg5Var = rh3VarK.f1923o;
            t94 t94Var = new t94(listL, null, (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue)) << 32), (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) << 32) | (((long) Float.floatToRawIntBits(((Number) bg5Var.getValue()).floatValue() + 200.0f)) & 4294967295L), 0);
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            hk6 hk6VarW = im3.W(ux2Var2);
            Object objK = ux2Var2.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var2);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarF = ka0.F(o77.t(fillElement, hk6VarW, (me1) objK), 24.0f, 12.0f, 24.0f, 0.0f, 8);
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
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
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            qs7.b(m77.z(R.string.solutions_page_description, ux2Var2), null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            fs4Var2 = cs4.b;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(fs4Var2, 24.0f));
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4Var2);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            ux2Var2.W(1235421663);
            for (int i3 = 0; i3 < 4; i3++) {
                ua0.a(au8.r(iq8.j(ka0.F(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f), 60.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7), sf6.a), t94Var, null, 6), ux2Var2, 0);
            }
            ux2Var2.p(false);
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 8);
        }
    }

    public static final void b(String str, List list, fs4 fs4Var, Boolean bool, String str2, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        Boolean bool2;
        String str3;
        ux2 ux2Var2 = ux2Var;
        str.getClass();
        ux2Var2.Y(-118637372);
        int i2 = i | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.f(list) ? 32 : 16) | 28032;
        if (ux2Var2.N(i2 & 1, (i2 & 9363) != 9362)) {
            Boolean bool3 = Boolean.FALSE;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
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
            if (im3.n(bool3, Boolean.TRUE)) {
                ux2Var2.W(8091913);
                lv1.k(null, 0.0f, 0L, ux2Var2, 0, 7);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(8133236);
                ux2Var2.p(false);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 16.0f, 16.0f, 0.0f, 16.0f, 4), "-TVSettingsSectionTitle");
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            h72 h72Var = un4.a;
            qs7.b(upperCase, fs4VarA, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.i, ux2Var, 0, 0, 131064);
            ux2Var2 = ux2Var;
            ux2Var2.W(-415367726);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((hw2) it.next()).invoke(ux2Var2, 0);
            }
            ux2Var2.p(false);
            ux2Var2.p(true);
            bool2 = bool3;
            str3 = "";
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            bool2 = bool;
            str3 = str2;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new o31((Object) str, (Object) list, fs4Var2, (Object) bool2, (Object) str3, i, (byte) 12);
        }
    }

    public static final Object c(float f, float f2, float f3, jo joVar, hw2 hw2Var, og7 og7Var) {
        yn1 yn1Var = vn4.j0;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Function1 function1 = yn1Var.b;
        qo qoVarC = (qo) function1.invoke(f6);
        if (qoVarC == null) {
            qoVarC = ((qo) function1.invoke(f4)).c();
        }
        qo qoVar = qoVarC;
        Object objD = d(new ko(yn1Var, f4, qoVar, 56), new wn7(joVar, yn1Var, f4, f5, qoVar), Long.MIN_VALUE, new q64(hw2Var, (byte) 4), og7Var);
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        if (objD != ne1Var) {
            objD = f88Var;
        }
        return objD == ne1Var ? objD : f88Var;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object d(ko koVar, eo eoVar, long j, final Function1 function1, jc1 jc1Var) {
        lg7 lg7Var;
        final k76 k76Var;
        final ko koVar2;
        ko koVar3;
        k76 k76Var2;
        Object objA;
        Function1 function2;
        io ioVar;
        io ioVar2;
        Object objA2;
        final eo eoVar2 = eoVar;
        if (jc1Var instanceof lg7) {
            lg7Var = (lg7) jc1Var;
            int i = lg7Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                lg7Var.r = i - Integer.MIN_VALUE;
            } else {
                lg7Var = new lg7(jc1Var);
            }
        } else {
            lg7Var = new lg7(jc1Var);
        }
        lg7 lg7Var2 = lg7Var;
        Object obj = lg7Var2.q;
        int i2 = lg7Var2.r;
        byte b = 16;
        byte b2 = 0;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj);
            final Object objG = eoVar2.g(0L);
            final qo qoVarD = eoVar2.d(0L);
            k76Var = new k76();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fP = p(lg7Var2.getContext());
                    koVar2 = koVar;
                    try {
                        Function1 function3 = new Function1() { // from class: o.jg7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                eo eoVar3 = eoVar2;
                                yn1 yn1VarC = eoVar3.c();
                                Object objH = eoVar3.h();
                                ko koVar4 = koVar2;
                                io ioVar3 = new io(objG, yn1VarC, qoVarD, jLongValue, objH, jLongValue, new kg7(koVar4, (byte) 1));
                                i67.n(ioVar3, jLongValue, fP, eoVar3, koVar4, function1);
                                k76Var.m = ioVar3;
                                return f88.a;
                            }
                        };
                        k76Var2 = k76Var;
                        try {
                            lg7Var2.m = koVar2;
                            lg7Var2.n = eoVar2;
                            lg7Var2.f1359o = function1;
                            lg7Var2.p = k76Var2;
                            lg7Var2.r = 1;
                            if (eoVar2.a()) {
                                objA = lv1.X(function3, lg7Var2);
                            } else {
                                objA = qs1.O(lg7Var2.getContext()).a(new jb(function3, b), lg7Var2);
                            }
                            if (objA != ne1Var) {
                                koVar3 = koVar2;
                                function2 = function1;
                                k76Var = k76Var2;
                            }
                            return ne1Var;
                        } catch (CancellationException e) {
                            e = e;
                            koVar3 = koVar2;
                            k76Var = k76Var2;
                            ioVar = (io) k76Var.m;
                            if (ioVar != null) {
                                ioVar.i.setValue(Boolean.FALSE);
                            }
                            ioVar2 = (io) k76Var.m;
                            if (ioVar2 != null) {
                                koVar3.r = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        koVar3 = koVar2;
                        ioVar = (io) k76Var.m;
                        if (ioVar != null) {
                            ioVar.i.setValue(Boolean.FALSE);
                        }
                        ioVar2 = (io) k76Var.m;
                        if (ioVar2 != null) {
                            koVar3.r = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    koVar2 = koVar;
                }
            } else {
                k76Var2 = k76Var;
                try {
                    io ioVar3 = new io(objG, eoVar2.c(), qoVarD, j, eoVar2.h(), j, new kg7(koVar, b2));
                    n(ioVar3, j, p(lg7Var2.getContext()), eoVar2, koVar, function1);
                    k76Var2.m = ioVar3;
                    koVar3 = koVar;
                    eoVar2 = eoVar;
                    function2 = function1;
                    k76Var = k76Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    koVar3 = koVar;
                    k76Var = k76Var2;
                    ioVar = (io) k76Var.m;
                    if (ioVar != null) {
                        ioVar.i.setValue(Boolean.FALSE);
                    }
                    ioVar2 = (io) k76Var.m;
                    if (ioVar2 != null && ioVar2.g == koVar3.p) {
                        koVar3.r = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k76Var = lg7Var2.p;
            function2 = lg7Var2.f1359o;
            eoVar2 = lg7Var2.n;
            koVar3 = lg7Var2.m;
            try {
                ct1.a0(obj);
            } catch (CancellationException e5) {
                e = e5;
                ioVar = (io) k76Var.m;
                if (ioVar != null) {
                    ioVar.i.setValue(Boolean.FALSE);
                }
                ioVar2 = (io) k76Var.m;
                if (ioVar2 != null) {
                    koVar3.r = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = k76Var.m;
            obj2.getClass();
            if (!((Boolean) ((io) obj2).i.getValue()).booleanValue()) {
                return f88.a;
            }
            k76 k76Var3 = k76Var;
            Function1 function4 = function2;
            eo eoVar3 = eoVar2;
            ko koVar4 = koVar3;
            try {
                y80 y80Var = new y80(k76Var3, p(lg7Var2.getContext()), eoVar3, koVar4, function4);
                k76Var = k76Var3;
                eoVar2 = eoVar3;
                koVar3 = koVar4;
                function2 = function4;
                lg7Var2.m = koVar3;
                lg7Var2.n = eoVar2;
                lg7Var2.f1359o = function2;
                lg7Var2.p = k76Var;
                lg7Var2.r = 2;
                if (eoVar2.a()) {
                    objA2 = lv1.X(y80Var, lg7Var2);
                } else {
                    objA2 = qs1.O(lg7Var2.getContext()).a(new jb(y80Var, b), lg7Var2);
                }
            } catch (CancellationException e6) {
                e = e6;
                k76Var = k76Var3;
                koVar3 = koVar4;
                ioVar = (io) k76Var.m;
                if (ioVar != null) {
                    ioVar.i.setValue(Boolean.FALSE);
                }
                ioVar2 = (io) k76Var.m;
                if (ioVar2 != null) {
                    koVar3.r = false;
                }
                throw e;
            }
        } while (objA2 != ne1Var);
        return ne1Var;
    }

    public static final Object e(ko koVar, ei1 ei1Var, boolean z, Function1 function1, jc1 jc1Var) {
        Object objD = d(koVar, new io.sentry.android.core.v1(ei1Var, koVar.m, koVar.n.getValue(), koVar.f1284o), z ? koVar.p : Long.MIN_VALUE, function1, jc1Var);
        return objD == ne1.m ? objD : f88.a;
    }

    public static final Object f(ko koVar, Float f, jo joVar, boolean z, Function1 function1, jc1 jc1Var) {
        Object objD = d(koVar, new wn7(joVar, koVar.m, koVar.n.getValue(), f, koVar.f1284o), z ? koVar.p : Long.MIN_VALUE, function1, jc1Var);
        return objD == ne1.m ? objD : f88.a;
    }

    public static /* synthetic */ Object g(ko koVar, Float f, e87 e87Var, boolean z, Function1 function1, jc1 jc1Var, int i) {
        if ((i & 2) != 0) {
            e87Var = db8.A0(0.0f, 0.0f, null, 7);
        }
        e87 e87Var2 = e87Var;
        if ((i & 8) != 0) {
            function1 = new vs6((byte) 15);
        }
        return f(koVar, f, e87Var2, z, function1, jc1Var);
    }

    public static final void h(nm nmVar, String str, String str2) {
        nmVar.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = nmVar.a;
        arrayList.add(str);
        arrayList.add(ub7.x0(str2).toString());
    }

    public static final k53 i(nm nmVar) {
        nmVar.getClass();
        return new k53((String[]) nmVar.a.toArray(new String[0]));
    }

    public static final String j(k53 k53Var, int i) {
        k53Var.getClass();
        String str = (String) cx.V0(i * 2, k53Var.m);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final nm k(k53 k53Var) {
        k53Var.getClass();
        nm nmVar = new nm((byte) 5);
        String[] strArr = k53Var.m;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        nmVar.a.addAll(listAsList);
        return nmVar;
    }

    public static final String l(k53 k53Var, int i) {
        k53Var.getClass();
        String str = (String) cx.V0((i * 2) + 1, k53Var.m);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bj8 m(ux2 ux2Var) {
        go2 go2VarD;
        tz6 tz6Var;
        hr2 hr2Var = hr2.r;
        hr2 hr2Var2 = hr2.q;
        ux2Var.W(760658738);
        long jR = ((in1) ux2Var.j(b11.h)).r(xs1.a0(((n54) ((mj8) ux2Var.j(b11.u))).a()));
        byte b = 0;
        ux2Var.p(false);
        List list = ll8.c;
        Set set = c42.a;
        Set set2 = y32.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (w32.a(a42.b(jR), ((w32) obj).m) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            yq4.p();
            return null;
        }
        float fMax = ((w32) it.next()).m;
        while (it.hasNext()) {
            fMax = Math.max(fMax, ((w32) it.next()).m);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (w32.a(a42.a(jR), ((w32) obj2).m) >= 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            yq4.p();
            return null;
        }
        float fMax2 = ((w32) it2.next()).m;
        while (it2.hasNext()) {
            fMax2 = Math.max(fMax2, ((w32) it2.next()).m);
        }
        ll8 ll8Var = new ll8((int) fMax, (int) fMax2);
        Context context = (Context) ux2Var.j(lh.b);
        boolean zF = ux2Var.f(context);
        Object objK = ux2Var.K();
        if (zF || objK == e01.a) {
            pj8.k.getClass();
            context.getClass();
            ej8 ej8Var = (ej8) oj8.b.getValue();
            if (ej8Var == null) {
                vz6 vz6Var = vz6.c;
                if (vz6.c == null) {
                    ReentrantLock reentrantLock = vz6.d;
                    reentrantLock.lock();
                    try {
                        if (vz6.c == null) {
                            try {
                                yc8 yc8VarB = sz6.b();
                                if (yc8VarB != null) {
                                    yc8 yc8Var = yc8.r;
                                    yc8Var.getClass();
                                    Object value = yc8VarB.q.getValue();
                                    value.getClass();
                                    Object value2 = yc8Var.q.getValue();
                                    value2.getClass();
                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                        tz6Var = new tz6(context);
                                        if (!tz6Var.e()) {
                                        }
                                    }
                                    vz6.c = new vz6(tz6Var);
                                }
                            } catch (Throwable unused) {
                            }
                            tz6Var = null;
                            vz6.c = new vz6(tz6Var);
                        }
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                ej8Var = vz6.c;
                ej8Var.getClass();
            }
            fl8 fl8Var = new fl8();
            wj5 wj5Var = new wj5((byte) 18);
            pg2.a();
            hj8 hj8Var = new hj8(fl8Var, ej8Var, wj5Var);
            oj8.c.getClass();
            fj0 fj0VarQ = it1.q(new yh8(hj8Var, context, null));
            tk1 tk1Var = g22.a;
            q43 q43Var = ok4.a;
            if (q43Var.l0(z06.z) != null) {
                yq4.q(q43Var, "Flow context cannot contain job in it. Had ");
                return null;
            }
            if (!q43Var.equals(ba2.m)) {
                go2VarD = fj0VarQ;
                go2VarD = nx2.d(fj0VarQ, q43Var, 0, null, 6);
            }
            go2VarD = fj0VarQ;
            objK = new fm(go2VarD, b);
            ux2Var.g0(objK);
        }
        List<z43> list2 = (List) g57.f((go2) objK, ea2.m, ux2Var, 48, 2).getValue();
        hr2 hr2Var3 = hr2.p;
        hr2 hr2Var4 = hr2.t;
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        for (z43 z43Var : list2) {
            ma0 ma0Var = z43Var.a;
            hr2 hr2Var5 = ma0Var.b() > ma0Var.a() ? hr2Var : hr2Var2;
            ma0 ma0Var2 = z43Var.a;
            hr2 hr2Var6 = z43Var.c;
            if (hr2Var5 == hr2Var && hr2Var6 == hr2Var4) {
                z = true;
            }
            v56 v56VarL0 = ds1.l0(ma0Var2.c());
            boolean z2 = hr2Var6 != hr2.s ? b : 1;
            ma0 ma0Var3 = z43Var.a;
            boolean z3 = (ma0Var3.b() > ma0Var3.a() ? hr2Var : hr2Var2) == hr2Var2;
            hr2 hr2Var7 = z43Var.b;
            arrayList3.add(new s53(v56VarL0, z2, z3, hr2Var7 == hr2.v || (hr2Var7 == hr2.u && hr2Var6 == hr2Var4), ((ma0Var2.b() == 0 || ma0Var2.a() == 0) ? hr2.f1001o : hr2Var3) == hr2Var3));
            b = 0;
        }
        return new bj8(ll8Var, new np5(arrayList3, z));
    }

    public static final void n(io ioVar, long j, float f, eo eoVar, ko koVar, Function1 function1) {
        long jB = f == 0.0f ? eoVar.b() : (long) ((j - ioVar.c) / f);
        ioVar.g = j;
        ioVar.e.setValue(eoVar.g(jB));
        ioVar.f = eoVar.d(jB);
        if (eoVar.e(jB)) {
            ioVar.h = ioVar.g;
            ioVar.i.setValue(Boolean.FALSE);
        }
        E(ioVar, koVar);
        function1.invoke(ioVar);
    }

    public static final void o(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = r53.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final float p(de1 de1Var) {
        ut4 ut4Var = (ut4) de1Var.l0(jk0.D);
        float fG = ut4Var != null ? ut4Var.G() : 1.0f;
        if (fG >= 0.0f) {
            return fG;
        }
        wp5.b("negative scale factor");
        return fG;
    }

    public static final ViewParent q(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static sp5 r(yt ytVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new sp5(dq.q(ytVar));
        }
        TextPaint textPaint = new TextPaint(ytVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = ytVar.getBreakStrategy();
        int hyphenationFrequency = ytVar.getHyphenationFrequency();
        if (ytVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (ytVar.getInputType() & 15) != 3) {
            boolean z = ytVar.getLayoutDirection() == 1;
            switch (ytVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(dq.f(DecimalFormatSymbols.getInstance(ytVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new sp5(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final Object s(f55 f55Var, fw3 fw3Var) {
        f55Var.getClass();
        fw3Var.getClass();
        return f55Var.a();
    }

    public static final void t(String str) {
        str.getClass();
        if (str.length() <= 0) {
            hk0.g("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                qf0.s(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void u(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                qf0.s(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(po8.j(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static final g48 x(g48 g48Var, up upVar) {
        g48 g48VarN;
        g48Var.getClass();
        if (yp.a(g48Var) == upVar) {
            return g48Var;
        }
        xp xpVar = (xp) yp.b.a(g48Var, yp.a[0]);
        if (xpVar != null) {
            if (g48Var.isEmpty()) {
                g48VarN = g48Var;
            } else {
                uw uwVar = g48Var.m;
                ArrayList arrayList = new ArrayList();
                for (Object obj : uwVar) {
                    if (!im3.n((xp) obj, xpVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == g48Var.m.a()) {
                    g48VarN = g48Var;
                } else {
                    g48.n.getClass();
                    g48VarN = lh7.n(arrayList);
                }
            }
            if (g48VarN != null) {
                g48Var = g48VarN;
            }
        }
        if (upVar.iterator().hasNext() || !upVar.isEmpty()) {
            xp xpVar2 = new xp(upVar);
            lh7 lh7Var = g48.n;
            wt3 wt3VarB = w86.a.b(xp.class);
            lh7Var.getClass();
            String strC = wt3VarB.c();
            strC.getClass();
            if (g48Var.m.get(lh7Var.r(strC)) == null) {
                return g48Var.isEmpty() ? new g48(qf0.K(xpVar2)) : lh7.n(lv0.B0(lv0.P0(g48Var), xpVar2));
            }
        }
        return g48Var;
    }

    public static void y(TextView textView, int i) {
        if (i < 0) {
            yq4.f();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            dq.t(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(TextView textView, int i) {
        if (i < 0) {
            yq4.f();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public abstract void v(int i);

    public abstract void w(Typeface typeface, boolean z);
}
