package o;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j51 {
    public static final jp6 A;
    public static final xt7 B;
    public static final yy0 f;
    public static final yy0 h;
    public static final yy0 i;
    public static final yy0 j;
    public static final yy0 k;
    public static final yy0 l;
    public static final int[] m;
    public static final long[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object[] f1132o;
    public static final hk p;
    public static final ju q;
    public static final float r;
    public static final ax6 s;
    public static final StackTraceElement[] t;
    public static final el5 u;
    public static final ol5 v;
    public static final yi5 w;
    public static final Object x;
    public static final hr2 y;
    public static final jp6 z;
    public static final yl a = new yl();
    public static final ax6 b = ax6.q;
    public static final float c = 1.0f;
    public static final yy0 d = new yy0(2079397133, false, new p20(23));
    public static final yy0 e = new yy0(576298827, false, new p20(24));
    public static final yy0 g = new yy0(761782661, false, new zy0(16));

    static {
        byte b2 = 15;
        f = new yy0(1513331814, false, new zy0(b2));
        new yy0(-1510559068, false, new zy0((byte) 17));
        h = new yy0(-969967911, false, new bz0((byte) 20));
        byte b3 = 21;
        i = new yy0(-273744100, false, new fz0(b3));
        j = new yy0(-21624197, false, new gz0(b2));
        k = new yy0(-17171900, false, new hz0((byte) 26));
        l = new yy0(684762693, false, new hz0((byte) 27));
        byte b4 = 28;
        new yy0(1822932154, false, new hz0(b4));
        m = new int[0];
        n = new long[0];
        f1132o = new Object[0];
        p = new hk((byte) 3);
        q = new ju(b3);
        r = 3.0f;
        s = ax6.f371o;
        t = new StackTraceElement[0];
        byte b5 = 6;
        u = new el5(b5);
        v = new ol5(b5);
        w = new yi5((byte) 7);
        x = new Object();
        y = new hr2("NO_THREAD_ELEMENTS", (byte) 14);
        z = new jp6(b4);
        A = new jp6((byte) 29);
        B = new xt7((byte) 0);
    }

    public static final rh6 A(hw4 hw4Var) {
        rh6 rh6Var;
        LinkedHashMap linkedHashMap = hw4Var.a;
        ai6 ai6Var = (ai6) linkedHashMap.get(u);
        Bundle bundle = null;
        if (ai6Var == null) {
            hk0.g("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        we8 we8Var = (we8) linkedHashMap.get(v);
        if (we8Var == null) {
            hk0.g("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(w);
        String str = (String) linkedHashMap.get(ue8.b);
        if (str == null) {
            hk0.g("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        xh6 xh6VarD0 = ai6Var.r().D0("androidx.lifecycle.internal.SavedStateHandlesProvider");
        uh6 uh6Var = xh6VarD0 instanceof uh6 ? (uh6) xh6VarD0 : null;
        if (uh6Var == null) {
            hk0.l("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = I(we8Var).n;
        rh6 rh6Var2 = (rh6) linkedHashMap2.get(str);
        if (rh6Var2 != null) {
            return rh6Var2;
        }
        uh6Var.b();
        Bundle bundle3 = uh6Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = mo8.g((vd5[]) Arrays.copyOf(new vd5[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                uh6Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            rh6Var = new rh6();
        } else {
            ClassLoader classLoader = rh6.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            im4 im4Var = new im4(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                im4Var.put(str2, bundle2.get(str2));
            }
            rh6Var = new rh6(im4Var.b());
        }
        linkedHashMap2.put(str, rh6Var);
        return rh6Var;
    }

    public static final fs4 B(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new p52(function1));
    }

    public static final fs4 C(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new x52(function1));
    }

    public static final fs4 D(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new y52(function1));
    }

    public static final void E(ai6 ai6Var) {
        m84 m84Var = ai6Var.getR().i;
        if (m84Var == m84.n || m84Var == m84.f1446o) {
            if (ai6Var.r().D0("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                uh6 uh6Var = new uh6(ai6Var.r(), (we8) ai6Var);
                ai6Var.r().Q0("androidx.lifecycle.internal.SavedStateHandlesProvider", uh6Var);
                ai6Var.getR().a(new u56(uh6Var, (byte) 4));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + ai6Var + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + m84Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    }

    public static final int F(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iT = im3.t(((tm3) list.get(i4)).b, i2);
            if (iT < 0) {
                i3 = i4 + 1;
            } else {
                if (iT <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final de1 G(de1 de1Var, de1 de1Var2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        byte b2 = 25;
        boolean zBooleanValue = ((Boolean) de1Var.b0(bool, new iz0(b2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) de1Var2.b0(bool, new iz0(b2))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return de1Var.H0(de1Var2);
        }
        iz0 iz0Var = new iz0((byte) 26);
        ba2 ba2Var = ba2.m;
        de1 de1Var3 = (de1) de1Var.b0(ba2Var, iz0Var);
        Object objB0 = de1Var2;
        if (zBooleanValue2) {
            objB0 = de1Var2.b0(ba2Var, new iz0((byte) 27));
        }
        return de1Var3.H0((de1) objB0);
    }

    public static kj0 H(ij0 ij0Var) {
        gj0 gj0Var = new gj0();
        gj0Var.c = new ob6();
        kj0 kj0Var = new kj0(gj0Var);
        gj0Var.b = kj0Var;
        gj0Var.a = ij0Var.getClass();
        try {
            Object objH = ij0Var.h(gj0Var);
            if (objH == null) {
                return kj0Var;
            }
            gj0Var.a = objH;
            return kj0Var;
        } catch (Exception e2) {
            kj0Var.n.setException(e2);
            return kj0Var;
        }
    }

    public static final vh6 I(we8 we8Var) {
        th6 th6Var = new th6();
        bf1 bf1VarK = h57.k(we8Var);
        bf1VarK.getClass();
        ve8 ve8VarO = we8Var.getG0();
        ve8VarO.getClass();
        return (vh6) new pn5(ve8VarO, th6Var, bf1VarK).j("androidx.lifecycle.internal.SavedStateHandlesVM", w86.a.b(vh6.class));
    }

    public static final void J(ge8 ge8Var, LayoutNode layoutNode) {
        long jP = ((ti3) layoutNode.S.d).P(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jP >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jP & 4294967295L)));
        ge8Var.layout(iRound, iRound2, ge8Var.getMeasuredWidth() + iRound, ge8Var.getMeasuredHeight() + iRound2);
    }

    public static final long K(long j2, long j3, float f2) {
        e75 e75Var = ew0.x;
        long jA = rv0.a(j2, e75Var);
        long jA2 = rv0.a(j3, e75Var);
        float fC = rv0.c(jA);
        float fG = rv0.g(jA);
        float f3 = rv0.f(jA);
        float fD = rv0.d(jA);
        float fC2 = rv0.c(jA2);
        float fG2 = rv0.g(jA2);
        float f4 = rv0.f(jA2);
        float fD2 = rv0.d(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return rv0.a(r(vs1.G(fG, fG2, f2), vs1.G(f3, f4, f2), vs1.G(fD, fD2, f2), vs1.G(fC, fC2, f2), e75Var), rv0.e(j3));
    }

    public static final ArrayList L(List list, Function0 function0) {
        io.sentry.android.replay.screenshot.h hVar;
        if (!((Boolean) function0.a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zn4 zn4Var = (zn4) list.get(i2);
            Object objE = zn4Var.E();
            objE.getClass();
            io.sentry.q7 q7Var = ((ht7) objE).b;
            at7 at7Var = (at7) q7Var.f253o;
            wo woVar = (wo) q7Var.n;
            vs7 vs7Var = (vs7) at7Var.a.getValue();
            if (vs7Var == null) {
                hVar = new io.sentry.android.replay.screenshot.h(0, 0, new jv6((byte) 23));
            } else {
                wo woVarC = at7.c(woVar, vs7Var);
                if (woVarC == null) {
                    hVar = new io.sentry.android.replay.screenshot.h(0, 0, new jv6((byte) 24));
                } else {
                    zk3 zk3VarT = vs1.T(vs7Var.i(woVarC.b, woVarC.c).d());
                    hVar = new io.sentry.android.replay.screenshot.h(zk3VarT.f(), zk3VarT.c(), new ks7(zk3VarT, (byte) 1));
                }
            }
            int i3 = hVar.m;
            int i4 = hVar.n;
            arrayList.add(new vd5(zn4Var.C(kh.t(i3, i3, i4, i4)), (Function0) hVar.f166o));
        }
        return arrayList;
    }

    public static final de1 M(me1 me1Var, de1 de1Var) {
        de1 de1VarG = G(me1Var.getCoroutineContext(), de1Var, true);
        tk1 tk1Var = g22.a;
        return (de1VarG == tk1Var || de1VarG.l0(d82.y) != null) ? de1VarG : de1VarG.H0(tk1Var);
    }

    public static final el N(Function0 function0, ux2 ux2Var, int i2) {
        View view = (View) ux2Var.j(lh.f);
        boolean zF = ux2Var.f(view);
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (zF || objK == obj) {
            objK = new el(view, null, function0);
            ux2Var.g0(objK);
        }
        el elVar = (el) objK;
        boolean zH = ux2Var.h(elVar);
        Object objK2 = ux2Var.K();
        if (zH || objK2 == obj) {
            objK2 = new zk(elVar, (byte) 3);
            ux2Var.g0(objK2);
        }
        ck3.e(elVar, (Function1) objK2, ux2Var);
        return elVar;
    }

    public static final void O(k17 k17Var, int i2, Object obj) {
        int iG = k17Var.g(i2);
        Object[] objArr = k17Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = e01.a;
        if (obj == obj2) {
            return;
        }
        i01.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final void P(List list, int i2, int i3) {
        int iF = F(i2, list);
        if (iF < 0) {
            iF = -(iF + 1);
        }
        while (iF < list.size() && ((tm3) list.get(iF)).b < i3) {
        }
    }

    public static final void Q(de1 de1Var, Object obj) {
        if (obj == y) {
            return;
        }
        if (!(obj instanceof hu7)) {
            Object objB0 = de1Var.b0(null, A);
            objB0.getClass();
            ((cu7) objB0).a(obj);
            return;
        }
        hu7 hu7Var = (hu7) obj;
        cu7[] cu7VarArr = hu7Var.c;
        int length = cu7VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            cu7 cu7Var = cu7VarArr[length];
            cu7Var.getClass();
            cu7Var.a(hu7Var.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final fs4 R(fs4 fs4Var, xo xoVar, ot7 ot7Var, Function1 function1, int i2, boolean z2, int i3, int i4, mr2 mr2Var, List list, Function1 function2, Function1 function3) {
        return fs4Var.f(cs4.b).f(new TextAnnotatedStringElement(xoVar, ot7Var, mr2Var, function1, i2, z2, i3, i4, list, function2, function3));
    }

    public static final Object S(de1 de1Var) {
        Object objB0 = de1Var.b0(0, z);
        objB0.getClass();
        return objB0;
    }

    public static final BlendMode T(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final int U(long j2) {
        float[] fArr = ew0.a;
        return (int) (rv0.a(j2, ew0.e) >>> 32);
    }

    public static final PorterDuff.Mode V(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static int W(j12 j12Var, oi6 oi6Var) {
        if (j12Var instanceof g12) {
            return ((g12) j12Var).a;
        }
        int iOrdinal = oi6Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        gk0.s();
        return 0;
    }

    public static final void X() {
        throw new UnsupportedOperationException();
    }

    public static final Object Y(de1 de1Var, Object obj) {
        if (obj == null) {
            obj = S(de1Var);
        }
        if (obj == 0) {
            return y;
        }
        return obj instanceof Integer ? de1Var.b0(new hu7(((Number) obj).intValue(), de1Var), B) : ((cu7) obj).b();
    }

    public static final t78 Z(hc1 hc1Var, de1 de1Var, Object obj) {
        t78 t78Var = null;
        if ((hc1Var instanceof oe1) && de1Var.l0(kl0.f1277o) != null) {
            oe1 callerFrame = (oe1) hc1Var;
            while (!(callerFrame instanceof b22) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof t78) {
                    t78Var = (t78) callerFrame;
                    break;
                }
            }
            if (t78Var != null) {
                t78Var.i0(de1Var, obj);
            }
        }
        return t78Var;
    }

    public static final void a(final String str, final boolean z2, final boolean z3, final boolean z4, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final fs4 fs4Var, ux2 ux2Var, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        byte b2;
        str.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        ux2Var.Y(-728635211);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z3;
            i3 |= ux2Var.g(z5) ? 256 : 128;
        } else {
            z5 = z3;
        }
        if ((i2 & 3072) == 0) {
            z6 = z4;
            i3 |= ux2Var.g(z6) ? 2048 : 1024;
        } else {
            z6 = z4;
        }
        if ((i2 & 24576) == 0) {
            function4 = function0;
            i3 |= ux2Var.h(function4) ? 16384 : 8192;
        } else {
            function4 = function0;
        }
        if ((196608 & i2) == 0) {
            i3 |= ux2Var.h(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            function5 = function2;
            i3 |= ux2Var.h(function5) ? 1048576 : 524288;
        } else {
            function5 = function2;
        }
        if ((12582912 & i2) == 0) {
            function6 = function3;
            i3 |= ux2Var.h(function6) ? 8388608 : 4194304;
        } else {
            function6 = function3;
        }
        if ((100663296 & i2) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 67108864 : 33554432;
        }
        if (ux2Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new t2((byte) 29);
                ux2Var.g0(objK);
            }
            fs4 fs4VarA = cp6.a(fs4Var, false, (Function1) objK);
            boolean z7 = (i3 & 112) == 32;
            Object objK2 = ux2Var.K();
            if (z7 || objK2 == awVar) {
                b2 = 0;
                objK2 = new qu(b2, z2);
                ux2Var.g0(objK2);
            } else {
                b2 = 0;
            }
            xy6 xy6VarR = yo1.R((Function1) objK2, ux2Var, 6, b2);
            xr4 xr4Var = new xr4(2, !z2);
            boolean z8 = (458752 & i3) == 131072;
            Object objK3 = ux2Var.K();
            if (z8 || objK3 == awVar) {
                objK3 = new a9(function1, (byte) 7);
                ux2Var.g0(objK3);
            }
            Function0 function7 = (Function0) objK3;
            final boolean z9 = z5;
            final boolean z10 = z6;
            final Function0 function8 = function4;
            final Function0 function9 = function5;
            final Function0 function10 = function6;
            yo1.k(function7, fs4VarA, xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, xr4Var, au8.O(-891799533, new iw2() { // from class: o.ru
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) {
                    ux2 ux2Var2 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((lw0) obj).getClass();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        j51.f(str, z2, z9, z10, function8, function1, function9, function10, null, ux2Var2, 0);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, 0, 3072, 4088);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.su
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j51.a(str, z2, z3, z4, function0, function1, function2, function3, fs4Var, (ux2) obj, yo1.Y(i2 | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void b(String str, boolean z2, boolean z3, Function0 function0, Function0 function1, ux2 ux2Var, int i2) {
        Object obj;
        int i3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-493883690);
        if ((i2 & 6) == 0) {
            obj = str;
            i3 = (ux2Var2.f(obj) ? 4 : 2) | i2;
        } else {
            obj = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.g(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.h(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ux2Var2.h(function1) ? 16384 : 8192;
        }
        if (ux2Var2.N(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = z2 ? R.string.app_update_required_bottom_sheet_description : R.string.app_update_bottom_sheet_description;
            int i5 = z3 ? R.string.app_update_download_in_progress_label : R.string.app_update_primary_button_label;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            int i6 = i5;
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
            String strA = m77.A(i4, new Object[]{obj}, ux2Var2);
            int i7 = i3;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            h72 h72Var = un4.a;
            qs7.b(strA, fs4VarC, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 48, 0, 130040);
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 24.0f));
            boolean z4 = !z3;
            m77.g(function0, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 44.0f), null, z4, null, null, au8.O(-780908015, new oa(i6, (byte) 2), ux2Var), ux2Var, ((i7 >> 9) & 14) | 1572912, 52);
            ux2Var2 = ux2Var;
            if (z2) {
                ux2Var2.W(846099874);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(845594388);
                b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 10.0f));
                v67.d(function1, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 44.0f), null, z4, "TVTA-appUpdate-maybeLaterButton", au8.a, ux2Var2, ((i7 >> 12) & 14) | 221232, 4);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new pu(str, z2, z3, function0, function1, i2);
        }
    }

    public static final void c(String str, boolean z2, Function0 function0, Function0 function1, ux2 ux2Var, int i2) {
        int i3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(2121854089);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var2.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var2.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var2.h(function1) ? 2048 : 1024;
        }
        if (ux2Var2.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = z2 ? R.string.app_update_required_bottom_sheet_description : R.string.app_update_bottom_sheet_description_without_store;
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
            String strA = m77.A(i4, new Object[]{str}, ux2Var2);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            h72 h72Var = un4.a;
            qs7.b(strA, fs4VarC, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 48, 0, 130040);
            ux2Var2 = ux2Var;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 24.0f));
            int i5 = z2 ? R.string.app_update_exit_app_button_label : R.string.app_update_ok_button_label;
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objK = ux2Var2.K();
            if (z3 || objK == e01.a) {
                objK = new tu(z2, function1, function0, (byte) 0);
                ux2Var2.g0(objK);
            }
            m77.g((Function0) objK, androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 44.0f), null, false, null, null, au8.O(-1717235708, new oa(i5, (byte) 1), ux2Var2), ux2Var2, 1572912, 60);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new uu((byte) 0, i2, (Object) str, (Object) function0, (Object) function1, z2);
        }
    }

    public static final void d(final xo xoVar, final fs4 fs4Var, final ot7 ot7Var, final Function1 function1, final int i2, final boolean z2, final int i3, final int i4, final Map map, ux2 ux2Var, final int i5, final int i6) {
        int i7;
        ot7 ot7Var2;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1343466571);
        if ((i5 & 6) == 0) {
            i7 = (ux2Var2.f(xoVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= ux2Var2.f(fs4Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            ot7Var2 = ot7Var;
            i7 |= ux2Var2.f(ot7Var2) ? 256 : 128;
        } else {
            ot7Var2 = ot7Var;
        }
        if ((i5 & 3072) == 0) {
            i7 |= ux2Var2.h(function1) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= ux2Var2.d(i2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            z3 = z2;
            i7 |= ux2Var2.g(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        if ((1572864 & i5) == 0) {
            i7 |= ux2Var2.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= ux2Var2.d(i4) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= ux2Var2.h(map) ? 67108864 : 33554432;
        }
        int i10 = i7 | 805306368;
        if ((i6 & 6) == 0) {
            i8 = i6 | ((i6 & 8) == 0 ? ux2Var2.f(null) : ux2Var2.h(null) ? 4 : 2);
        } else {
            i8 = i6;
        }
        boolean z5 = false;
        if (ux2Var2.N(i10 & 1, ((306783379 & i10) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            vs1.X(i4, i3);
            if (ux2Var2.j(wo6.a) != null) {
                io.sentry.h2.f();
                return;
            }
            ux2Var2.W(1588900273);
            ux2Var2.p(false);
            vd5 vd5Var = zo.a;
            int length = xoVar.n.length();
            List list = xoVar.m;
            if (list == null) {
                i9 = i10;
                z4 = z5;
                break;
            }
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i9 = i10;
                    z4 = z5;
                    break;
                }
                wo woVar = (wo) list.get(i11);
                i9 = i10;
                if ((woVar.a instanceof db7) && "androidx.compose.foundation.text.inlineContent".equals(woVar.d)) {
                    int i12 = woVar.b;
                    int i13 = woVar.c;
                    z5 = false;
                    if (yo.b(0, length, i12, i13)) {
                        z4 = true;
                        break;
                    }
                } else {
                    z5 = false;
                }
                i11++;
                i10 = i9;
            }
            boolean zL = h67.l(xoVar);
            mr2 mr2Var = (mr2) ux2Var2.j(b11.k);
            if (z4 || zL) {
                boolean z6 = z5;
                ux2Var2.W(1590195670);
                boolean z7 = (i9 & 14) == 4 ? true : z6;
                Object objK = ux2Var2.K();
                aw awVar = e01.a;
                if (z7 || objK == awVar) {
                    objK = h57.p(xoVar);
                    ux2Var2.g0(objK);
                }
                px4 px4Var = (px4) objK;
                xo xoVar2 = (xo) px4Var.getValue();
                boolean zF = ux2Var2.f(px4Var);
                Object objK2 = ux2Var2.K();
                if (zF || objK2 == awVar) {
                    objK2 = new va(px4Var, (byte) 7);
                    ux2Var2.g0(objK2);
                }
                int i14 = i9 << 6;
                o(fs4Var, xoVar2, function1, z4, map, ot7Var, i2, z2, i3, i4, mr2Var, (Function1) objK2, ux2Var2, ((i9 >> 3) & 910) | ((i9 >> 12) & 57344) | ((i9 << 9) & 458752) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), ((i9 >> 21) & 896) | (57344 & (i8 << 12)));
                ux2Var2 = ux2Var2;
                ux2Var2.p(z6);
            } else {
                ux2Var2.W(1589148149);
                y40.a(xoVar, ot7Var2, mr2Var, null, z3, ux2Var2);
                boolean z8 = z5;
                fs4 fs4VarR = R(fs4Var, xoVar, ot7Var, function1, i2, z2, i3, i4, mr2Var, null, null, null);
                ei eiVar = ei.f;
                int iHashCode = Long.hashCode(ux2Var2.T);
                fs4 fs4VarS = uf0.s(ux2Var2, fs4VarR);
                yj5 yj5VarL = ux2Var2.l();
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(LayoutNode.e0);
                } else {
                    ux2Var2.j0();
                }
                o67.n(eiVar, d82.v, ux2Var2);
                o67.n(yj5VarL, d82.u, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS, d82.t, ux2Var2);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                ux2Var2.p(true);
                ux2Var2.p(z8);
                ux2Var2 = ux2Var2;
            }
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.r40
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i5 | 1);
                    int iY2 = yo1.Y(i6);
                    xo xoVar3 = xoVar;
                    fs4 fs4Var2 = fs4Var;
                    ot7 ot7Var3 = ot7Var;
                    Function1 function2 = function1;
                    byte b2 = i2;
                    boolean z9 = z2;
                    int i15 = i3;
                    boolean z10 = i4;
                    Map map2 = map;
                    j51.d(xoVar3, fs4Var2, ot7Var3, function2, b2, z9, i15, z10 ? 1 : 0, map2, (ux2) obj, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0122  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:110:0x0134  */
    /* JADX WARN: Code duplicated, block: B:111:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x013b  */
    /* JADX WARN: Code duplicated, block: B:114:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0140  */
    /* JADX WARN: Code duplicated, block: B:120:0x0148  */
    /* JADX WARN: Code duplicated, block: B:123:0x0155  */
    /* JADX WARN: Code duplicated, block: B:125:0x0172  */
    /* JADX WARN: Code duplicated, block: B:136:0x01af  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0225  */
    /* JADX WARN: Code duplicated, block: B:143:0x022b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0253  */
    /* JADX WARN: Code duplicated, block: B:147:0x0257  */
    /* JADX WARN: Code duplicated, block: B:150:0x026a  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void e(final String str, fs4 fs4Var, final ot7 ot7Var, Function1 function1, int i2, boolean z2, int i3, int i4, ux2 ux2Var, final int i5, final int i6) {
        int i7;
        fs4 fs4Var2;
        int i8;
        Function1 function2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean zH;
        int i21;
        boolean z4;
        final String str2;
        final int i22;
        final fs4 fs4Var3;
        final Function1 function3;
        final boolean z5;
        final int i23;
        final int i24;
        j56 j56VarR;
        int i25;
        fs4 fs4Var4;
        Function1 function4;
        int i26;
        boolean z6;
        int i27;
        final mr2 mr2Var;
        Executor executor;
        boolean z7;
        int i28;
        int i29;
        fs4 fs4VarR;
        int i30;
        ux2Var.Y(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (ux2Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i31 = i6 & 2;
        if (i31 == 0) {
            if ((i5 & 48) == 0) {
                fs4Var2 = fs4Var;
                i7 |= ux2Var.f(fs4Var2) ? 32 : 16;
            }
            if ((i5 & 384) == 0) {
                if (ux2Var.f(ot7Var)) {
                    i30 = 256;
                } else {
                    i30 = 128;
                }
                i7 |= i30;
            }
            i8 = i6 & 8;
            if (i8 != 0) {
                if ((i5 & 3072) == 0) {
                    function2 = function1;
                    if (ux2Var.h(function2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 16;
                if (i10 != 0) {
                    if ((i5 & 24576) == 0) {
                        if (ux2Var.d(i2)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i7 |= i11;
                    }
                    i12 = i6 & 32;
                    if (i12 != 0) {
                        if ((196608 & i5) == 0) {
                            z3 = z2;
                            if (ux2Var.g(z3)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i7 |= i13;
                        }
                        i14 = i6 & 64;
                        if (i14 != 0) {
                            if ((1572864 & i5) == 0) {
                                i15 = i3;
                                if (ux2Var.d(i15)) {
                                    i16 = 1048576;
                                } else {
                                    i16 = 524288;
                                }
                                i7 |= i16;
                            }
                            i17 = i7;
                            i18 = i6 & 128;
                            if (i18 != 0) {
                                if ((i5 & 12582912) == 0) {
                                    if (ux2Var.d(i4)) {
                                        i19 = 8388608;
                                    } else {
                                        i19 = 4194304;
                                    }
                                    i17 |= i19;
                                }
                                i20 = i17 | 100663296;
                                if ((i6 & 512) != 0) {
                                    i20 = i17 | 905969664;
                                } else if ((i5 & 805306368) == 0) {
                                    if ((i5 & 1073741824) == 0) {
                                        zH = ux2Var.f(null);
                                    } else {
                                        zH = ux2Var.h(null);
                                    }
                                    if (zH) {
                                        i21 = 536870912;
                                    } else {
                                        i21 = 268435456;
                                    }
                                    i20 |= i21;
                                }
                                if ((i20 & 306783379) != 306783378) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (ux2Var.N(i20 & 1, z4)) {
                                    if (i31 != 0) {
                                        fs4Var4 = cs4.b;
                                        i25 = i12;
                                    } else {
                                        i25 = i12;
                                        fs4Var4 = fs4Var2;
                                    }
                                    if (i8 != 0) {
                                        function4 = null;
                                    } else {
                                        function4 = function2;
                                    }
                                    if (i10 != 0) {
                                        i26 = 1;
                                    } else {
                                        i26 = i2;
                                    }
                                    if (i25 != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z3;
                                    }
                                    if (i14 != 0) {
                                        i15 = Integer.MAX_VALUE;
                                    }
                                    i27 = i18 == 0 ? i4 : 1;
                                    vs1.X(i27, i15);
                                    if (ux2Var.j(wo6.a) == null) {
                                        io.sentry.h2.f();
                                        return;
                                    }
                                    ux2Var.W(357055103);
                                    ux2Var.p(false);
                                    mr2Var = (mr2) ux2Var.j(b11.k);
                                    executor = (Executor) ux2Var.j(y40.a);
                                    if (executor == null && y40.b(str.length())) {
                                        ux2Var.W(-1250263182);
                                        final j04 j04Var = (j04) ux2Var.j(b11.n);
                                        final in1 in1Var = (in1) ux2Var.j(b11.h);
                                        try {
                                            final boolean z8 = z6;
                                            try {
                                                Runnable runnable = new Runnable() { // from class: o.x40
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ox4 ox4VarC;
                                                        ot7 ot7Var2 = ot7Var;
                                                        j04 j04Var2 = j04Var;
                                                        String str3 = str;
                                                        in1 in1Var2 = in1Var;
                                                        mr2 mr2Var2 = mr2Var;
                                                        boolean z9 = z8;
                                                        Trace.beginSection("BackgroundTextMeasurement");
                                                        try {
                                                            n47 n47VarH = v47.h();
                                                            ox4 ox4Var = n47VarH instanceof ox4 ? (ox4) n47VarH : null;
                                                            if (ox4Var == null || (ox4VarC = ox4Var.C(null, null)) == null) {
                                                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                            }
                                                            try {
                                                                n47 n47VarJ = ox4VarC.j();
                                                                try {
                                                                    ot7 ot7VarC = y57.C(ot7Var2, j04Var2);
                                                                    ea2 ea2Var = ea2.m;
                                                                    qj qjVar = new qj(str3, ot7VarC, ea2Var, ea2Var, mr2Var2, in1Var2, z9);
                                                                    qjVar.i();
                                                                    qjVar.c();
                                                                    n47.q(n47VarJ);
                                                                    ox4VarC.w().j();
                                                                    ox4VarC.c();
                                                                    Trace.endSection();
                                                                } catch (Throwable th) {
                                                                    n47.q(n47VarJ);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                try {
                                                                    throw th2;
                                                                } catch (Throwable th3) {
                                                                    ox4VarC.c();
                                                                    throw th3;
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            Trace.endSection();
                                                            throw th4;
                                                        }
                                                    }
                                                };
                                                mr2Var = mr2Var;
                                                z6 = z8;
                                                executor.execute(runnable);
                                            } catch (RejectedExecutionException unused) {
                                                mr2Var = mr2Var;
                                                z6 = z8;
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                        }
                                        z7 = false;
                                        ux2Var.p(false);
                                    } else {
                                        z7 = false;
                                        ux2Var.W(-1248455541);
                                        ux2Var.p(false);
                                    }
                                    if (function4 == null) {
                                        ux2Var.W(358076243);
                                        ux2Var.p(z7);
                                        str2 = str;
                                        i28 = i15;
                                        int i32 = i26;
                                        i29 = i32;
                                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i32, z6, i28, i27));
                                    } else {
                                        str2 = str;
                                        i28 = i15;
                                        i29 = i26;
                                        ux2Var.W(357432497);
                                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                        ux2Var.p(false);
                                    }
                                    ei eiVar = ei.f;
                                    int iHashCode = Long.hashCode(ux2Var.T);
                                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarR);
                                    yj5 yj5VarL = ux2Var.l();
                                    yz0.c.getClass();
                                    ux2Var.a0();
                                    if (ux2Var.S) {
                                        ux2Var.k(LayoutNode.e0);
                                    } else {
                                        ux2Var.j0();
                                    }
                                    o67.n(eiVar, d82.v, ux2Var);
                                    o67.n(yj5VarL, d82.u, ux2Var);
                                    o67.l(ux2Var);
                                    o67.n(fs4VarS, d82.t, ux2Var);
                                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                                    ux2Var.p(true);
                                    i22 = i27;
                                    fs4Var3 = fs4Var4;
                                    function3 = function4;
                                    i23 = i28;
                                    z5 = z6;
                                    i24 = i29;
                                } else {
                                    str2 = str;
                                    ux2Var.Q();
                                    i22 = i4;
                                    fs4Var3 = fs4Var2;
                                    function3 = function2;
                                    z5 = z3;
                                    i23 = i15;
                                    i24 = i2;
                                }
                                j56VarR = ux2Var.r();
                                if (j56VarR != null) {
                                    j56VarR.d = new hw2() { // from class: o.v40
                                        @Override // o.hw2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                            return f88.a;
                                        }
                                    };
                                }
                            }
                            i17 |= 12582912;
                            i20 = i17 | 100663296;
                            if ((i6 & 512) != 0) {
                                i20 = i17 | 905969664;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zH = ux2Var.f(null);
                                } else {
                                    zH = ux2Var.h(null);
                                }
                                if (zH) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i20 |= i21;
                            }
                            if ((i20 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (ux2Var.N(i20 & 1, z4)) {
                                if (i31 != 0) {
                                    fs4Var4 = cs4.b;
                                    i25 = i12;
                                } else {
                                    i25 = i12;
                                    fs4Var4 = fs4Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i2;
                                }
                                if (i25 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i18 == 0) {
                                }
                                vs1.X(i27, i15);
                                if (ux2Var.j(wo6.a) == null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                                ux2Var.W(357055103);
                                ux2Var.p(false);
                                mr2Var = (mr2) ux2Var.j(b11.k);
                                executor = (Executor) ux2Var.j(y40.a);
                                if (executor == null) {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                } else {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                }
                                if (function4 == null) {
                                    ux2Var.W(358076243);
                                    ux2Var.p(z7);
                                    str2 = str;
                                    i28 = i15;
                                    int i33 = i26;
                                    i29 = i33;
                                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i33, z6, i28, i27));
                                } else {
                                    str2 = str;
                                    i28 = i15;
                                    i29 = i26;
                                    ux2Var.W(357432497);
                                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                    ux2Var.p(false);
                                }
                                ei eiVar2 = ei.f;
                                int iHashCode2 = Long.hashCode(ux2Var.T);
                                fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarR);
                                yj5 yj5VarL2 = ux2Var.l();
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(eiVar2, d82.v, ux2Var);
                                o67.n(yj5VarL2, d82.u, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS2, d82.t, ux2Var);
                                o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
                                ux2Var.p(true);
                                i22 = i27;
                                fs4Var3 = fs4Var4;
                                function3 = function4;
                                i23 = i28;
                                z5 = z6;
                                i24 = i29;
                            } else {
                                str2 = str;
                                ux2Var.Q();
                                i22 = i4;
                                fs4Var3 = fs4Var2;
                                function3 = function2;
                                z5 = z3;
                                i23 = i15;
                                i24 = i2;
                            }
                            j56VarR = ux2Var.r();
                            if (j56VarR != null) {
                                j56VarR.d = new hw2() { // from class: o.v40
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                        return f88.a;
                                    }
                                };
                            }
                        }
                        i7 |= 1572864;
                        i15 = i3;
                        i17 = i7;
                        i18 = i6 & 128;
                        if (i18 != 0) {
                            if ((i5 & 12582912) == 0) {
                                if (ux2Var.d(i4)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i17 |= i19;
                            }
                            i20 = i17 | 100663296;
                            if ((i6 & 512) != 0) {
                                i20 = i17 | 905969664;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zH = ux2Var.f(null);
                                } else {
                                    zH = ux2Var.h(null);
                                }
                                if (zH) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i20 |= i21;
                            }
                            if ((i20 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (ux2Var.N(i20 & 1, z4)) {
                                if (i31 != 0) {
                                    fs4Var4 = cs4.b;
                                    i25 = i12;
                                } else {
                                    i25 = i12;
                                    fs4Var4 = fs4Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i2;
                                }
                                if (i25 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i18 == 0) {
                                }
                                vs1.X(i27, i15);
                                if (ux2Var.j(wo6.a) == null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                                ux2Var.W(357055103);
                                ux2Var.p(false);
                                mr2Var = (mr2) ux2Var.j(b11.k);
                                executor = (Executor) ux2Var.j(y40.a);
                                if (executor == null) {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                } else {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                }
                                if (function4 == null) {
                                    ux2Var.W(358076243);
                                    ux2Var.p(z7);
                                    str2 = str;
                                    i28 = i15;
                                    int i34 = i26;
                                    i29 = i34;
                                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i34, z6, i28, i27));
                                } else {
                                    str2 = str;
                                    i28 = i15;
                                    i29 = i26;
                                    ux2Var.W(357432497);
                                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                    ux2Var.p(false);
                                }
                                ei eiVar3 = ei.f;
                                int iHashCode3 = Long.hashCode(ux2Var.T);
                                fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarR);
                                yj5 yj5VarL3 = ux2Var.l();
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(eiVar3, d82.v, ux2Var);
                                o67.n(yj5VarL3, d82.u, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS3, d82.t, ux2Var);
                                o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var);
                                ux2Var.p(true);
                                i22 = i27;
                                fs4Var3 = fs4Var4;
                                function3 = function4;
                                i23 = i28;
                                z5 = z6;
                                i24 = i29;
                            } else {
                                str2 = str;
                                ux2Var.Q();
                                i22 = i4;
                                fs4Var3 = fs4Var2;
                                function3 = function2;
                                z5 = z3;
                                i23 = i15;
                                i24 = i2;
                            }
                            j56VarR = ux2Var.r();
                            if (j56VarR != null) {
                                j56VarR.d = new hw2() { // from class: o.v40
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                        return f88.a;
                                    }
                                };
                            }
                        }
                        i17 |= 12582912;
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i35 = i26;
                                i29 = i35;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i35, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar4 = ei.f;
                            int iHashCode4 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL4 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar4, d82.v, ux2Var);
                            o67.n(yj5VarL4, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS4, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i7 |= 196608;
                    z3 = z2;
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        if ((1572864 & i5) == 0) {
                            i15 = i3;
                            if (ux2Var.d(i15)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i7 |= i16;
                        }
                        i17 = i7;
                        i18 = i6 & 128;
                        if (i18 != 0) {
                            if ((i5 & 12582912) == 0) {
                                if (ux2Var.d(i4)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i17 |= i19;
                            }
                            i20 = i17 | 100663296;
                            if ((i6 & 512) != 0) {
                                i20 = i17 | 905969664;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zH = ux2Var.f(null);
                                } else {
                                    zH = ux2Var.h(null);
                                }
                                if (zH) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i20 |= i21;
                            }
                            if ((i20 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (ux2Var.N(i20 & 1, z4)) {
                                if (i31 != 0) {
                                    fs4Var4 = cs4.b;
                                    i25 = i12;
                                } else {
                                    i25 = i12;
                                    fs4Var4 = fs4Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i2;
                                }
                                if (i25 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i18 == 0) {
                                }
                                vs1.X(i27, i15);
                                if (ux2Var.j(wo6.a) == null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                                ux2Var.W(357055103);
                                ux2Var.p(false);
                                mr2Var = (mr2) ux2Var.j(b11.k);
                                executor = (Executor) ux2Var.j(y40.a);
                                if (executor == null) {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                } else {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                }
                                if (function4 == null) {
                                    ux2Var.W(358076243);
                                    ux2Var.p(z7);
                                    str2 = str;
                                    i28 = i15;
                                    int i36 = i26;
                                    i29 = i36;
                                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i36, z6, i28, i27));
                                } else {
                                    str2 = str;
                                    i28 = i15;
                                    i29 = i26;
                                    ux2Var.W(357432497);
                                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                    ux2Var.p(false);
                                }
                                ei eiVar5 = ei.f;
                                int iHashCode5 = Long.hashCode(ux2Var.T);
                                fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarR);
                                yj5 yj5VarL5 = ux2Var.l();
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(eiVar5, d82.v, ux2Var);
                                o67.n(yj5VarL5, d82.u, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS5, d82.t, ux2Var);
                                o67.n(Integer.valueOf(iHashCode5), d82.w, ux2Var);
                                ux2Var.p(true);
                                i22 = i27;
                                fs4Var3 = fs4Var4;
                                function3 = function4;
                                i23 = i28;
                                z5 = z6;
                                i24 = i29;
                            } else {
                                str2 = str;
                                ux2Var.Q();
                                i22 = i4;
                                fs4Var3 = fs4Var2;
                                function3 = function2;
                                z5 = z3;
                                i23 = i15;
                                i24 = i2;
                            }
                            j56VarR = ux2Var.r();
                            if (j56VarR != null) {
                                j56VarR.d = new hw2() { // from class: o.v40
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                        return f88.a;
                                    }
                                };
                            }
                        }
                        i17 |= 12582912;
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i37 = i26;
                                i29 = i37;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i37, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar6 = ei.f;
                            int iHashCode6 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL6 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar6, d82.v, ux2Var);
                            o67.n(yj5VarL6, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS6, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode6), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i7 |= 1572864;
                    i15 = i3;
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i38 = i26;
                                i29 = i38;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i38, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar7 = ei.f;
                            int iHashCode7 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS7 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL7 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar7, d82.v, ux2Var);
                            o67.n(yj5VarL7, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS7, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode7), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i39 = i26;
                            i29 = i39;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i39, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar8 = ei.f;
                        int iHashCode8 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS8 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL8 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar8, d82.v, ux2Var);
                        o67.n(yj5VarL8, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS8, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode8), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 24576;
                i12 = i6 & 32;
                if (i12 != 0) {
                    if ((196608 & i5) == 0) {
                        z3 = z2;
                        if (ux2Var.g(z3)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        if ((1572864 & i5) == 0) {
                            i15 = i3;
                            if (ux2Var.d(i15)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i7 |= i16;
                        }
                        i17 = i7;
                        i18 = i6 & 128;
                        if (i18 != 0) {
                            if ((i5 & 12582912) == 0) {
                                if (ux2Var.d(i4)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i17 |= i19;
                            }
                            i20 = i17 | 100663296;
                            if ((i6 & 512) != 0) {
                                i20 = i17 | 905969664;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zH = ux2Var.f(null);
                                } else {
                                    zH = ux2Var.h(null);
                                }
                                if (zH) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i20 |= i21;
                            }
                            if ((i20 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (ux2Var.N(i20 & 1, z4)) {
                                if (i31 != 0) {
                                    fs4Var4 = cs4.b;
                                    i25 = i12;
                                } else {
                                    i25 = i12;
                                    fs4Var4 = fs4Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i2;
                                }
                                if (i25 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i18 == 0) {
                                }
                                vs1.X(i27, i15);
                                if (ux2Var.j(wo6.a) == null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                                ux2Var.W(357055103);
                                ux2Var.p(false);
                                mr2Var = (mr2) ux2Var.j(b11.k);
                                executor = (Executor) ux2Var.j(y40.a);
                                if (executor == null) {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                } else {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                }
                                if (function4 == null) {
                                    ux2Var.W(358076243);
                                    ux2Var.p(z7);
                                    str2 = str;
                                    i28 = i15;
                                    int i310 = i26;
                                    i29 = i310;
                                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i310, z6, i28, i27));
                                } else {
                                    str2 = str;
                                    i28 = i15;
                                    i29 = i26;
                                    ux2Var.W(357432497);
                                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                    ux2Var.p(false);
                                }
                                ei eiVar9 = ei.f;
                                int iHashCode9 = Long.hashCode(ux2Var.T);
                                fs4 fs4VarS9 = uf0.s(ux2Var, fs4VarR);
                                yj5 yj5VarL9 = ux2Var.l();
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(eiVar9, d82.v, ux2Var);
                                o67.n(yj5VarL9, d82.u, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS9, d82.t, ux2Var);
                                o67.n(Integer.valueOf(iHashCode9), d82.w, ux2Var);
                                ux2Var.p(true);
                                i22 = i27;
                                fs4Var3 = fs4Var4;
                                function3 = function4;
                                i23 = i28;
                                z5 = z6;
                                i24 = i29;
                            } else {
                                str2 = str;
                                ux2Var.Q();
                                i22 = i4;
                                fs4Var3 = fs4Var2;
                                function3 = function2;
                                z5 = z3;
                                i23 = i15;
                                i24 = i2;
                            }
                            j56VarR = ux2Var.r();
                            if (j56VarR != null) {
                                j56VarR.d = new hw2() { // from class: o.v40
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                        return f88.a;
                                    }
                                };
                            }
                        }
                        i17 |= 12582912;
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i311 = i26;
                                i29 = i311;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar10 = ei.f;
                            int iHashCode10 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS10 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL10 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar10, d82.v, ux2Var);
                            o67.n(yj5VarL10, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS10, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode10), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i7 |= 1572864;
                    i15 = i3;
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i312 = i26;
                                i29 = i312;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i312, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar11 = ei.f;
                            int iHashCode11 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS11 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL11 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar11, d82.v, ux2Var);
                            o67.n(yj5VarL11, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS11, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode11), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i313 = i26;
                            i29 = i313;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i313, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar12 = ei.f;
                        int iHashCode12 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS12 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL12 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar12, d82.v, ux2Var);
                        o67.n(yj5VarL12, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS12, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode12), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                z3 = z2;
                i14 = i6 & 64;
                if (i14 != 0) {
                    if ((1572864 & i5) == 0) {
                        i15 = i3;
                        if (ux2Var.d(i15)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i314 = i26;
                                i29 = i314;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i314, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar13 = ei.f;
                            int iHashCode13 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS13 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL13 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar13, d82.v, ux2Var);
                            o67.n(yj5VarL13, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS13, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode13), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i315 = i26;
                            i29 = i315;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i315, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar14 = ei.f;
                        int iHashCode14 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS14 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL14 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar14, d82.v, ux2Var);
                        o67.n(yj5VarL14, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS14, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode14), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 1572864;
                i15 = i3;
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i316 = i26;
                            i29 = i316;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i316, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar15 = ei.f;
                        int iHashCode15 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS15 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL15 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar15, d82.v, ux2Var);
                        o67.n(yj5VarL15, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS15, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode15), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i317 = i26;
                        i29 = i317;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i317, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar16 = ei.f;
                    int iHashCode16 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS16 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL16 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar16, d82.v, ux2Var);
                    o67.n(yj5VarL16, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS16, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode16), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 3072;
            function2 = function1;
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i5 & 24576) == 0) {
                    if (ux2Var.d(i2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    if ((196608 & i5) == 0) {
                        z3 = z2;
                        if (ux2Var.g(z3)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        if ((1572864 & i5) == 0) {
                            i15 = i3;
                            if (ux2Var.d(i15)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i7 |= i16;
                        }
                        i17 = i7;
                        i18 = i6 & 128;
                        if (i18 != 0) {
                            if ((i5 & 12582912) == 0) {
                                if (ux2Var.d(i4)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i17 |= i19;
                            }
                            i20 = i17 | 100663296;
                            if ((i6 & 512) != 0) {
                                i20 = i17 | 905969664;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zH = ux2Var.f(null);
                                } else {
                                    zH = ux2Var.h(null);
                                }
                                if (zH) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i20 |= i21;
                            }
                            if ((i20 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (ux2Var.N(i20 & 1, z4)) {
                                if (i31 != 0) {
                                    fs4Var4 = cs4.b;
                                    i25 = i12;
                                } else {
                                    i25 = i12;
                                    fs4Var4 = fs4Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i2;
                                }
                                if (i25 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i18 == 0) {
                                }
                                vs1.X(i27, i15);
                                if (ux2Var.j(wo6.a) == null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                                ux2Var.W(357055103);
                                ux2Var.p(false);
                                mr2Var = (mr2) ux2Var.j(b11.k);
                                executor = (Executor) ux2Var.j(y40.a);
                                if (executor == null) {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                } else {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                }
                                if (function4 == null) {
                                    ux2Var.W(358076243);
                                    ux2Var.p(z7);
                                    str2 = str;
                                    i28 = i15;
                                    int i318 = i26;
                                    i29 = i318;
                                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i318, z6, i28, i27));
                                } else {
                                    str2 = str;
                                    i28 = i15;
                                    i29 = i26;
                                    ux2Var.W(357432497);
                                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                    ux2Var.p(false);
                                }
                                ei eiVar17 = ei.f;
                                int iHashCode17 = Long.hashCode(ux2Var.T);
                                fs4 fs4VarS17 = uf0.s(ux2Var, fs4VarR);
                                yj5 yj5VarL17 = ux2Var.l();
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(eiVar17, d82.v, ux2Var);
                                o67.n(yj5VarL17, d82.u, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS17, d82.t, ux2Var);
                                o67.n(Integer.valueOf(iHashCode17), d82.w, ux2Var);
                                ux2Var.p(true);
                                i22 = i27;
                                fs4Var3 = fs4Var4;
                                function3 = function4;
                                i23 = i28;
                                z5 = z6;
                                i24 = i29;
                            } else {
                                str2 = str;
                                ux2Var.Q();
                                i22 = i4;
                                fs4Var3 = fs4Var2;
                                function3 = function2;
                                z5 = z3;
                                i23 = i15;
                                i24 = i2;
                            }
                            j56VarR = ux2Var.r();
                            if (j56VarR != null) {
                                j56VarR.d = new hw2() { // from class: o.v40
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                        return f88.a;
                                    }
                                };
                            }
                        }
                        i17 |= 12582912;
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i319 = i26;
                                i29 = i319;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i319, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar18 = ei.f;
                            int iHashCode18 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS18 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL18 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar18, d82.v, ux2Var);
                            o67.n(yj5VarL18, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS18, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode18), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i7 |= 1572864;
                    i15 = i3;
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i3110 = i26;
                                i29 = i3110;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3110, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar19 = ei.f;
                            int iHashCode19 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS19 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL19 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar19, d82.v, ux2Var);
                            o67.n(yj5VarL19, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS19, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode19), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3111 = i26;
                            i29 = i3111;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar110 = ei.f;
                        int iHashCode110 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS110 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL110 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar110, d82.v, ux2Var);
                        o67.n(yj5VarL110, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS110, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode110), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                z3 = z2;
                i14 = i6 & 64;
                if (i14 != 0) {
                    if ((1572864 & i5) == 0) {
                        i15 = i3;
                        if (ux2Var.d(i15)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i3112 = i26;
                                i29 = i3112;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3112, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar111 = ei.f;
                            int iHashCode111 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS111 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL111 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar111, d82.v, ux2Var);
                            o67.n(yj5VarL111, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS111, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode111), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3113 = i26;
                            i29 = i3113;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3113, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar112 = ei.f;
                        int iHashCode112 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS112 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL112 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar112, d82.v, ux2Var);
                        o67.n(yj5VarL112, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS112, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode112), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 1572864;
                i15 = i3;
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3114 = i26;
                            i29 = i3114;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3114, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar113 = ei.f;
                        int iHashCode113 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS113 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL113 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar113, d82.v, ux2Var);
                        o67.n(yj5VarL113, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS113, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode113), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i3115 = i26;
                        i29 = i3115;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3115, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar114 = ei.f;
                    int iHashCode114 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS114 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL114 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar114, d82.v, ux2Var);
                    o67.n(yj5VarL114, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS114, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode114), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            i12 = i6 & 32;
            if (i12 != 0) {
                if ((196608 & i5) == 0) {
                    z3 = z2;
                    if (ux2Var.g(z3)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                    if ((1572864 & i5) == 0) {
                        i15 = i3;
                        if (ux2Var.d(i15)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i3116 = i26;
                                i29 = i3116;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3116, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar115 = ei.f;
                            int iHashCode115 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS115 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL115 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar115, d82.v, ux2Var);
                            o67.n(yj5VarL115, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS115, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode115), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3117 = i26;
                            i29 = i3117;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3117, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar116 = ei.f;
                        int iHashCode116 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS116 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL116 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar116, d82.v, ux2Var);
                        o67.n(yj5VarL116, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS116, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode116), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 1572864;
                i15 = i3;
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3118 = i26;
                            i29 = i3118;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3118, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar117 = ei.f;
                        int iHashCode117 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS117 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL117 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar117, d82.v, ux2Var);
                        o67.n(yj5VarL117, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS117, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode117), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i3119 = i26;
                        i29 = i3119;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3119, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar118 = ei.f;
                    int iHashCode118 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS118 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL118 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar118, d82.v, ux2Var);
                    o67.n(yj5VarL118, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS118, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode118), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            z3 = z2;
            i14 = i6 & 64;
            if (i14 != 0) {
                if ((1572864 & i5) == 0) {
                    i15 = i3;
                    if (ux2Var.d(i15)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i31110 = i26;
                            i29 = i31110;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31110, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar119 = ei.f;
                        int iHashCode119 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS119 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL119 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar119, d82.v, ux2Var);
                        o67.n(yj5VarL119, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS119, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode119), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i31111 = i26;
                        i29 = i31111;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar1110 = ei.f;
                    int iHashCode1110 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS1110 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL1110 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar1110, d82.v, ux2Var);
                    o67.n(yj5VarL1110, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS1110, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode1110), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 1572864;
            i15 = i3;
            i17 = i7;
            i18 = i6 & 128;
            if (i18 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (ux2Var.d(i4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i17 |= i19;
                }
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i31112 = i26;
                        i29 = i31112;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31112, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar1111 = ei.f;
                    int iHashCode1111 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS1111 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL1111 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar1111, d82.v, ux2Var);
                    o67.n(yj5VarL1111, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS1111, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode1111), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i17 |= 12582912;
            i20 = i17 | 100663296;
            if ((i6 & 512) != 0) {
                i20 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zH = ux2Var.f(null);
                } else {
                    zH = ux2Var.h(null);
                }
                if (zH) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i20 |= i21;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i20 & 1, z4)) {
                if (i31 != 0) {
                    fs4Var4 = cs4.b;
                    i25 = i12;
                } else {
                    i25 = i12;
                    fs4Var4 = fs4Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                if (i25 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i18 == 0) {
                }
                vs1.X(i27, i15);
                if (ux2Var.j(wo6.a) == null) {
                    io.sentry.h2.f();
                    return;
                }
                ux2Var.W(357055103);
                ux2Var.p(false);
                mr2Var = (mr2) ux2Var.j(b11.k);
                executor = (Executor) ux2Var.j(y40.a);
                if (executor == null) {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                } else {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                }
                if (function4 == null) {
                    ux2Var.W(358076243);
                    ux2Var.p(z7);
                    str2 = str;
                    i28 = i15;
                    int i31113 = i26;
                    i29 = i31113;
                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31113, z6, i28, i27));
                } else {
                    str2 = str;
                    i28 = i15;
                    i29 = i26;
                    ux2Var.W(357432497);
                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                    ux2Var.p(false);
                }
                ei eiVar1112 = ei.f;
                int iHashCode1112 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS1112 = uf0.s(ux2Var, fs4VarR);
                yj5 yj5VarL1112 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(eiVar1112, d82.v, ux2Var);
                o67.n(yj5VarL1112, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS1112, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode1112), d82.w, ux2Var);
                ux2Var.p(true);
                i22 = i27;
                fs4Var3 = fs4Var4;
                function3 = function4;
                i23 = i28;
                z5 = z6;
                i24 = i29;
            } else {
                str2 = str;
                ux2Var.Q();
                i22 = i4;
                fs4Var3 = fs4Var2;
                function3 = function2;
                z5 = z3;
                i23 = i15;
                i24 = i2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.v40
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                        return f88.a;
                    }
                };
            }
        }
        i7 |= 48;
        fs4Var2 = fs4Var;
        if ((i5 & 384) == 0) {
            if (ux2Var.f(ot7Var)) {
                i30 = 256;
            } else {
                i30 = 128;
            }
            i7 |= i30;
        }
        i8 = i6 & 8;
        if (i8 != 0) {
            if ((i5 & 3072) == 0) {
                function2 = function1;
                if (ux2Var.h(function2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i7 |= i9;
            }
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i5 & 24576) == 0) {
                    if (ux2Var.d(i2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    if ((196608 & i5) == 0) {
                        z3 = z2;
                        if (ux2Var.g(z3)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i7 |= i13;
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                        if ((1572864 & i5) == 0) {
                            i15 = i3;
                            if (ux2Var.d(i15)) {
                                i16 = 1048576;
                            } else {
                                i16 = 524288;
                            }
                            i7 |= i16;
                        }
                        i17 = i7;
                        i18 = i6 & 128;
                        if (i18 != 0) {
                            if ((i5 & 12582912) == 0) {
                                if (ux2Var.d(i4)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                                i17 |= i19;
                            }
                            i20 = i17 | 100663296;
                            if ((i6 & 512) != 0) {
                                i20 = i17 | 905969664;
                            } else if ((i5 & 805306368) == 0) {
                                if ((i5 & 1073741824) == 0) {
                                    zH = ux2Var.f(null);
                                } else {
                                    zH = ux2Var.h(null);
                                }
                                if (zH) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i20 |= i21;
                            }
                            if ((i20 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (ux2Var.N(i20 & 1, z4)) {
                                if (i31 != 0) {
                                    fs4Var4 = cs4.b;
                                    i25 = i12;
                                } else {
                                    i25 = i12;
                                    fs4Var4 = fs4Var2;
                                }
                                if (i8 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function2;
                                }
                                if (i10 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i2;
                                }
                                if (i25 != 0) {
                                    z6 = true;
                                } else {
                                    z6 = z3;
                                }
                                if (i14 != 0) {
                                    i15 = Integer.MAX_VALUE;
                                }
                                if (i18 == 0) {
                                }
                                vs1.X(i27, i15);
                                if (ux2Var.j(wo6.a) == null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                                ux2Var.W(357055103);
                                ux2Var.p(false);
                                mr2Var = (mr2) ux2Var.j(b11.k);
                                executor = (Executor) ux2Var.j(y40.a);
                                if (executor == null) {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                } else {
                                    z7 = false;
                                    ux2Var.W(-1248455541);
                                    ux2Var.p(false);
                                }
                                if (function4 == null) {
                                    ux2Var.W(358076243);
                                    ux2Var.p(z7);
                                    str2 = str;
                                    i28 = i15;
                                    int i31114 = i26;
                                    i29 = i31114;
                                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31114, z6, i28, i27));
                                } else {
                                    str2 = str;
                                    i28 = i15;
                                    i29 = i26;
                                    ux2Var.W(357432497);
                                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                    ux2Var.p(false);
                                }
                                ei eiVar1113 = ei.f;
                                int iHashCode1113 = Long.hashCode(ux2Var.T);
                                fs4 fs4VarS1113 = uf0.s(ux2Var, fs4VarR);
                                yj5 yj5VarL1113 = ux2Var.l();
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(eiVar1113, d82.v, ux2Var);
                                o67.n(yj5VarL1113, d82.u, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS1113, d82.t, ux2Var);
                                o67.n(Integer.valueOf(iHashCode1113), d82.w, ux2Var);
                                ux2Var.p(true);
                                i22 = i27;
                                fs4Var3 = fs4Var4;
                                function3 = function4;
                                i23 = i28;
                                z5 = z6;
                                i24 = i29;
                            } else {
                                str2 = str;
                                ux2Var.Q();
                                i22 = i4;
                                fs4Var3 = fs4Var2;
                                function3 = function2;
                                z5 = z3;
                                i23 = i15;
                                i24 = i2;
                            }
                            j56VarR = ux2Var.r();
                            if (j56VarR != null) {
                                j56VarR.d = new hw2() { // from class: o.v40
                                    @Override // o.hw2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                        return f88.a;
                                    }
                                };
                            }
                        }
                        i17 |= 12582912;
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i31115 = i26;
                                i29 = i31115;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31115, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar1114 = ei.f;
                            int iHashCode1114 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS1114 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL1114 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar1114, d82.v, ux2Var);
                            o67.n(yj5VarL1114, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS1114, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode1114), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i7 |= 1572864;
                    i15 = i3;
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i31116 = i26;
                                i29 = i31116;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31116, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar1115 = ei.f;
                            int iHashCode1115 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS1115 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL1115 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar1115, d82.v, ux2Var);
                            o67.n(yj5VarL1115, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS1115, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode1115), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i31117 = i26;
                            i29 = i31117;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31117, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar1116 = ei.f;
                        int iHashCode1116 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS1116 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL1116 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar1116, d82.v, ux2Var);
                        o67.n(yj5VarL1116, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS1116, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode1116), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 196608;
                z3 = z2;
                i14 = i6 & 64;
                if (i14 != 0) {
                    if ((1572864 & i5) == 0) {
                        i15 = i3;
                        if (ux2Var.d(i15)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i31118 = i26;
                                i29 = i31118;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31118, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar1117 = ei.f;
                            int iHashCode1117 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS1117 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL1117 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar1117, d82.v, ux2Var);
                            o67.n(yj5VarL1117, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS1117, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode1117), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i31119 = i26;
                            i29 = i31119;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31119, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar1118 = ei.f;
                        int iHashCode1118 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS1118 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL1118 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar1118, d82.v, ux2Var);
                        o67.n(yj5VarL1118, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS1118, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode1118), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 1572864;
                i15 = i3;
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i311110 = i26;
                            i29 = i311110;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311110, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar1119 = ei.f;
                        int iHashCode1119 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS1119 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL1119 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar1119, d82.v, ux2Var);
                        o67.n(yj5VarL1119, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS1119, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode1119), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i311111 = i26;
                        i29 = i311111;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311111, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar11110 = ei.f;
                    int iHashCode11110 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS11110 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL11110 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar11110, d82.v, ux2Var);
                    o67.n(yj5VarL11110, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS11110, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode11110), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            i12 = i6 & 32;
            if (i12 != 0) {
                if ((196608 & i5) == 0) {
                    z3 = z2;
                    if (ux2Var.g(z3)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                    if ((1572864 & i5) == 0) {
                        i15 = i3;
                        if (ux2Var.d(i15)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i311112 = i26;
                                i29 = i311112;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311112, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar11111 = ei.f;
                            int iHashCode11111 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS11111 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL11111 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar11111, d82.v, ux2Var);
                            o67.n(yj5VarL11111, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS11111, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode11111), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i311113 = i26;
                            i29 = i311113;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311113, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar11112 = ei.f;
                        int iHashCode11112 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS11112 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL11112 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar11112, d82.v, ux2Var);
                        o67.n(yj5VarL11112, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS11112, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode11112), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 1572864;
                i15 = i3;
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i311114 = i26;
                            i29 = i311114;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311114, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar11113 = ei.f;
                        int iHashCode11113 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS11113 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL11113 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar11113, d82.v, ux2Var);
                        o67.n(yj5VarL11113, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS11113, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode11113), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i311115 = i26;
                        i29 = i311115;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311115, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar11114 = ei.f;
                    int iHashCode11114 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS11114 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL11114 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar11114, d82.v, ux2Var);
                    o67.n(yj5VarL11114, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS11114, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode11114), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            z3 = z2;
            i14 = i6 & 64;
            if (i14 != 0) {
                if ((1572864 & i5) == 0) {
                    i15 = i3;
                    if (ux2Var.d(i15)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i311116 = i26;
                            i29 = i311116;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311116, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar11115 = ei.f;
                        int iHashCode11115 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS11115 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL11115 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar11115, d82.v, ux2Var);
                        o67.n(yj5VarL11115, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS11115, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode11115), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i311117 = i26;
                        i29 = i311117;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311117, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar11116 = ei.f;
                    int iHashCode11116 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS11116 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL11116 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar11116, d82.v, ux2Var);
                    o67.n(yj5VarL11116, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS11116, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode11116), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 1572864;
            i15 = i3;
            i17 = i7;
            i18 = i6 & 128;
            if (i18 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (ux2Var.d(i4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i17 |= i19;
                }
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i311118 = i26;
                        i29 = i311118;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311118, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar11117 = ei.f;
                    int iHashCode11117 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS11117 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL11117 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar11117, d82.v, ux2Var);
                    o67.n(yj5VarL11117, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS11117, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode11117), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i17 |= 12582912;
            i20 = i17 | 100663296;
            if ((i6 & 512) != 0) {
                i20 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zH = ux2Var.f(null);
                } else {
                    zH = ux2Var.h(null);
                }
                if (zH) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i20 |= i21;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i20 & 1, z4)) {
                if (i31 != 0) {
                    fs4Var4 = cs4.b;
                    i25 = i12;
                } else {
                    i25 = i12;
                    fs4Var4 = fs4Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                if (i25 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i18 == 0) {
                }
                vs1.X(i27, i15);
                if (ux2Var.j(wo6.a) == null) {
                    io.sentry.h2.f();
                    return;
                }
                ux2Var.W(357055103);
                ux2Var.p(false);
                mr2Var = (mr2) ux2Var.j(b11.k);
                executor = (Executor) ux2Var.j(y40.a);
                if (executor == null) {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                } else {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                }
                if (function4 == null) {
                    ux2Var.W(358076243);
                    ux2Var.p(z7);
                    str2 = str;
                    i28 = i15;
                    int i311119 = i26;
                    i29 = i311119;
                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i311119, z6, i28, i27));
                } else {
                    str2 = str;
                    i28 = i15;
                    i29 = i26;
                    ux2Var.W(357432497);
                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                    ux2Var.p(false);
                }
                ei eiVar11118 = ei.f;
                int iHashCode11118 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS11118 = uf0.s(ux2Var, fs4VarR);
                yj5 yj5VarL11118 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(eiVar11118, d82.v, ux2Var);
                o67.n(yj5VarL11118, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS11118, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode11118), d82.w, ux2Var);
                ux2Var.p(true);
                i22 = i27;
                fs4Var3 = fs4Var4;
                function3 = function4;
                i23 = i28;
                z5 = z6;
                i24 = i29;
            } else {
                str2 = str;
                ux2Var.Q();
                i22 = i4;
                fs4Var3 = fs4Var2;
                function3 = function2;
                z5 = z3;
                i23 = i15;
                i24 = i2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.v40
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                        return f88.a;
                    }
                };
            }
        }
        i7 |= 3072;
        function2 = function1;
        i10 = i6 & 16;
        if (i10 != 0) {
            if ((i5 & 24576) == 0) {
                if (ux2Var.d(i2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
            }
            i12 = i6 & 32;
            if (i12 != 0) {
                if ((196608 & i5) == 0) {
                    z3 = z2;
                    if (ux2Var.g(z3)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                    if ((1572864 & i5) == 0) {
                        i15 = i3;
                        if (ux2Var.d(i15)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i7 |= i16;
                    }
                    i17 = i7;
                    i18 = i6 & 128;
                    if (i18 != 0) {
                        if ((i5 & 12582912) == 0) {
                            if (ux2Var.d(i4)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i17 |= i19;
                        }
                        i20 = i17 | 100663296;
                        if ((i6 & 512) != 0) {
                            i20 = i17 | 905969664;
                        } else if ((i5 & 805306368) == 0) {
                            if ((i5 & 1073741824) == 0) {
                                zH = ux2Var.f(null);
                            } else {
                                zH = ux2Var.h(null);
                            }
                            if (zH) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i20 |= i21;
                        }
                        if ((i20 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (ux2Var.N(i20 & 1, z4)) {
                            if (i31 != 0) {
                                fs4Var4 = cs4.b;
                                i25 = i12;
                            } else {
                                i25 = i12;
                                fs4Var4 = fs4Var2;
                            }
                            if (i8 != 0) {
                                function4 = null;
                            } else {
                                function4 = function2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i2;
                            }
                            if (i25 != 0) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (i14 != 0) {
                                i15 = Integer.MAX_VALUE;
                            }
                            if (i18 == 0) {
                            }
                            vs1.X(i27, i15);
                            if (ux2Var.j(wo6.a) == null) {
                                io.sentry.h2.f();
                                return;
                            }
                            ux2Var.W(357055103);
                            ux2Var.p(false);
                            mr2Var = (mr2) ux2Var.j(b11.k);
                            executor = (Executor) ux2Var.j(y40.a);
                            if (executor == null) {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            } else {
                                z7 = false;
                                ux2Var.W(-1248455541);
                                ux2Var.p(false);
                            }
                            if (function4 == null) {
                                ux2Var.W(358076243);
                                ux2Var.p(z7);
                                str2 = str;
                                i28 = i15;
                                int i3111110 = i26;
                                i29 = i3111110;
                                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111110, z6, i28, i27));
                            } else {
                                str2 = str;
                                i28 = i15;
                                i29 = i26;
                                ux2Var.W(357432497);
                                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                                ux2Var.p(false);
                            }
                            ei eiVar11119 = ei.f;
                            int iHashCode11119 = Long.hashCode(ux2Var.T);
                            fs4 fs4VarS11119 = uf0.s(ux2Var, fs4VarR);
                            yj5 yj5VarL11119 = ux2Var.l();
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(eiVar11119, d82.v, ux2Var);
                            o67.n(yj5VarL11119, d82.u, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS11119, d82.t, ux2Var);
                            o67.n(Integer.valueOf(iHashCode11119), d82.w, ux2Var);
                            ux2Var.p(true);
                            i22 = i27;
                            fs4Var3 = fs4Var4;
                            function3 = function4;
                            i23 = i28;
                            z5 = z6;
                            i24 = i29;
                        } else {
                            str2 = str;
                            ux2Var.Q();
                            i22 = i4;
                            fs4Var3 = fs4Var2;
                            function3 = function2;
                            z5 = z3;
                            i23 = i15;
                            i24 = i2;
                        }
                        j56VarR = ux2Var.r();
                        if (j56VarR != null) {
                            j56VarR.d = new hw2() { // from class: o.v40
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i17 |= 12582912;
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3111111 = i26;
                            i29 = i3111111;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111111, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar111110 = ei.f;
                        int iHashCode111110 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS111110 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL111110 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar111110, d82.v, ux2Var);
                        o67.n(yj5VarL111110, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS111110, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode111110), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i7 |= 1572864;
                i15 = i3;
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3111112 = i26;
                            i29 = i3111112;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111112, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar111111 = ei.f;
                        int iHashCode111111 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS111111 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL111111 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar111111, d82.v, ux2Var);
                        o67.n(yj5VarL111111, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS111111, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode111111), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i3111113 = i26;
                        i29 = i3111113;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111113, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar111112 = ei.f;
                    int iHashCode111112 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS111112 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL111112 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar111112, d82.v, ux2Var);
                    o67.n(yj5VarL111112, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS111112, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode111112), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            z3 = z2;
            i14 = i6 & 64;
            if (i14 != 0) {
                if ((1572864 & i5) == 0) {
                    i15 = i3;
                    if (ux2Var.d(i15)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3111114 = i26;
                            i29 = i3111114;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111114, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar111113 = ei.f;
                        int iHashCode111113 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS111113 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL111113 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar111113, d82.v, ux2Var);
                        o67.n(yj5VarL111113, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS111113, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode111113), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i3111115 = i26;
                        i29 = i3111115;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111115, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar111114 = ei.f;
                    int iHashCode111114 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS111114 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL111114 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar111114, d82.v, ux2Var);
                    o67.n(yj5VarL111114, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS111114, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode111114), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 1572864;
            i15 = i3;
            i17 = i7;
            i18 = i6 & 128;
            if (i18 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (ux2Var.d(i4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i17 |= i19;
                }
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i3111116 = i26;
                        i29 = i3111116;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111116, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar111115 = ei.f;
                    int iHashCode111115 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS111115 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL111115 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar111115, d82.v, ux2Var);
                    o67.n(yj5VarL111115, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS111115, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode111115), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i17 |= 12582912;
            i20 = i17 | 100663296;
            if ((i6 & 512) != 0) {
                i20 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zH = ux2Var.f(null);
                } else {
                    zH = ux2Var.h(null);
                }
                if (zH) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i20 |= i21;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i20 & 1, z4)) {
                if (i31 != 0) {
                    fs4Var4 = cs4.b;
                    i25 = i12;
                } else {
                    i25 = i12;
                    fs4Var4 = fs4Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                if (i25 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i18 == 0) {
                }
                vs1.X(i27, i15);
                if (ux2Var.j(wo6.a) == null) {
                    io.sentry.h2.f();
                    return;
                }
                ux2Var.W(357055103);
                ux2Var.p(false);
                mr2Var = (mr2) ux2Var.j(b11.k);
                executor = (Executor) ux2Var.j(y40.a);
                if (executor == null) {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                } else {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                }
                if (function4 == null) {
                    ux2Var.W(358076243);
                    ux2Var.p(z7);
                    str2 = str;
                    i28 = i15;
                    int i3111117 = i26;
                    i29 = i3111117;
                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111117, z6, i28, i27));
                } else {
                    str2 = str;
                    i28 = i15;
                    i29 = i26;
                    ux2Var.W(357432497);
                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                    ux2Var.p(false);
                }
                ei eiVar111116 = ei.f;
                int iHashCode111116 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS111116 = uf0.s(ux2Var, fs4VarR);
                yj5 yj5VarL111116 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(eiVar111116, d82.v, ux2Var);
                o67.n(yj5VarL111116, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS111116, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode111116), d82.w, ux2Var);
                ux2Var.p(true);
                i22 = i27;
                fs4Var3 = fs4Var4;
                function3 = function4;
                i23 = i28;
                z5 = z6;
                i24 = i29;
            } else {
                str2 = str;
                ux2Var.Q();
                i22 = i4;
                fs4Var3 = fs4Var2;
                function3 = function2;
                z5 = z3;
                i23 = i15;
                i24 = i2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.v40
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                        return f88.a;
                    }
                };
            }
        }
        i7 |= 24576;
        i12 = i6 & 32;
        if (i12 != 0) {
            if ((196608 & i5) == 0) {
                z3 = z2;
                if (ux2Var.g(z3)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i7 |= i13;
            }
            i14 = i6 & 64;
            if (i14 != 0) {
                if ((1572864 & i5) == 0) {
                    i15 = i3;
                    if (ux2Var.d(i15)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i7 |= i16;
                }
                i17 = i7;
                i18 = i6 & 128;
                if (i18 != 0) {
                    if ((i5 & 12582912) == 0) {
                        if (ux2Var.d(i4)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i17 |= i19;
                    }
                    i20 = i17 | 100663296;
                    if ((i6 & 512) != 0) {
                        i20 = i17 | 905969664;
                    } else if ((i5 & 805306368) == 0) {
                        if ((i5 & 1073741824) == 0) {
                            zH = ux2Var.f(null);
                        } else {
                            zH = ux2Var.h(null);
                        }
                        if (zH) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i20 |= i21;
                    }
                    if ((i20 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (ux2Var.N(i20 & 1, z4)) {
                        if (i31 != 0) {
                            fs4Var4 = cs4.b;
                            i25 = i12;
                        } else {
                            i25 = i12;
                            fs4Var4 = fs4Var2;
                        }
                        if (i8 != 0) {
                            function4 = null;
                        } else {
                            function4 = function2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i2;
                        }
                        if (i25 != 0) {
                            z6 = true;
                        } else {
                            z6 = z3;
                        }
                        if (i14 != 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        if (i18 == 0) {
                        }
                        vs1.X(i27, i15);
                        if (ux2Var.j(wo6.a) == null) {
                            io.sentry.h2.f();
                            return;
                        }
                        ux2Var.W(357055103);
                        ux2Var.p(false);
                        mr2Var = (mr2) ux2Var.j(b11.k);
                        executor = (Executor) ux2Var.j(y40.a);
                        if (executor == null) {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        } else {
                            z7 = false;
                            ux2Var.W(-1248455541);
                            ux2Var.p(false);
                        }
                        if (function4 == null) {
                            ux2Var.W(358076243);
                            ux2Var.p(z7);
                            str2 = str;
                            i28 = i15;
                            int i3111118 = i26;
                            i29 = i3111118;
                            fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111118, z6, i28, i27));
                        } else {
                            str2 = str;
                            i28 = i15;
                            i29 = i26;
                            ux2Var.W(357432497);
                            fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                            ux2Var.p(false);
                        }
                        ei eiVar111117 = ei.f;
                        int iHashCode111117 = Long.hashCode(ux2Var.T);
                        fs4 fs4VarS111117 = uf0.s(ux2Var, fs4VarR);
                        yj5 yj5VarL111117 = ux2Var.l();
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(eiVar111117, d82.v, ux2Var);
                        o67.n(yj5VarL111117, d82.u, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS111117, d82.t, ux2Var);
                        o67.n(Integer.valueOf(iHashCode111117), d82.w, ux2Var);
                        ux2Var.p(true);
                        i22 = i27;
                        fs4Var3 = fs4Var4;
                        function3 = function4;
                        i23 = i28;
                        z5 = z6;
                        i24 = i29;
                    } else {
                        str2 = str;
                        ux2Var.Q();
                        i22 = i4;
                        fs4Var3 = fs4Var2;
                        function3 = function2;
                        z5 = z3;
                        i23 = i15;
                        i24 = i2;
                    }
                    j56VarR = ux2Var.r();
                    if (j56VarR != null) {
                        j56VarR.d = new hw2() { // from class: o.v40
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                                return f88.a;
                            }
                        };
                    }
                }
                i17 |= 12582912;
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i3111119 = i26;
                        i29 = i3111119;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i3111119, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar111118 = ei.f;
                    int iHashCode111118 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS111118 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL111118 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar111118, d82.v, ux2Var);
                    o67.n(yj5VarL111118, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS111118, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode111118), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i7 |= 1572864;
            i15 = i3;
            i17 = i7;
            i18 = i6 & 128;
            if (i18 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (ux2Var.d(i4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i17 |= i19;
                }
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i31111110 = i26;
                        i29 = i31111110;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111110, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar111119 = ei.f;
                    int iHashCode111119 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS111119 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL111119 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar111119, d82.v, ux2Var);
                    o67.n(yj5VarL111119, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS111119, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode111119), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i17 |= 12582912;
            i20 = i17 | 100663296;
            if ((i6 & 512) != 0) {
                i20 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zH = ux2Var.f(null);
                } else {
                    zH = ux2Var.h(null);
                }
                if (zH) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i20 |= i21;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i20 & 1, z4)) {
                if (i31 != 0) {
                    fs4Var4 = cs4.b;
                    i25 = i12;
                } else {
                    i25 = i12;
                    fs4Var4 = fs4Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                if (i25 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i18 == 0) {
                }
                vs1.X(i27, i15);
                if (ux2Var.j(wo6.a) == null) {
                    io.sentry.h2.f();
                    return;
                }
                ux2Var.W(357055103);
                ux2Var.p(false);
                mr2Var = (mr2) ux2Var.j(b11.k);
                executor = (Executor) ux2Var.j(y40.a);
                if (executor == null) {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                } else {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                }
                if (function4 == null) {
                    ux2Var.W(358076243);
                    ux2Var.p(z7);
                    str2 = str;
                    i28 = i15;
                    int i31111111 = i26;
                    i29 = i31111111;
                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111111, z6, i28, i27));
                } else {
                    str2 = str;
                    i28 = i15;
                    i29 = i26;
                    ux2Var.W(357432497);
                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                    ux2Var.p(false);
                }
                ei eiVar1111110 = ei.f;
                int iHashCode1111110 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS1111110 = uf0.s(ux2Var, fs4VarR);
                yj5 yj5VarL1111110 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(eiVar1111110, d82.v, ux2Var);
                o67.n(yj5VarL1111110, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS1111110, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode1111110), d82.w, ux2Var);
                ux2Var.p(true);
                i22 = i27;
                fs4Var3 = fs4Var4;
                function3 = function4;
                i23 = i28;
                z5 = z6;
                i24 = i29;
            } else {
                str2 = str;
                ux2Var.Q();
                i22 = i4;
                fs4Var3 = fs4Var2;
                function3 = function2;
                z5 = z3;
                i23 = i15;
                i24 = i2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.v40
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                        return f88.a;
                    }
                };
            }
        }
        i7 |= 196608;
        z3 = z2;
        i14 = i6 & 64;
        if (i14 != 0) {
            if ((1572864 & i5) == 0) {
                i15 = i3;
                if (ux2Var.d(i15)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i7 |= i16;
            }
            i17 = i7;
            i18 = i6 & 128;
            if (i18 != 0) {
                if ((i5 & 12582912) == 0) {
                    if (ux2Var.d(i4)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i17 |= i19;
                }
                i20 = i17 | 100663296;
                if ((i6 & 512) != 0) {
                    i20 = i17 | 905969664;
                } else if ((i5 & 805306368) == 0) {
                    if ((i5 & 1073741824) == 0) {
                        zH = ux2Var.f(null);
                    } else {
                        zH = ux2Var.h(null);
                    }
                    if (zH) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i20 |= i21;
                }
                if ((i20 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ux2Var.N(i20 & 1, z4)) {
                    if (i31 != 0) {
                        fs4Var4 = cs4.b;
                        i25 = i12;
                    } else {
                        i25 = i12;
                        fs4Var4 = fs4Var2;
                    }
                    if (i8 != 0) {
                        function4 = null;
                    } else {
                        function4 = function2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i2;
                    }
                    if (i25 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    if (i14 != 0) {
                        i15 = Integer.MAX_VALUE;
                    }
                    if (i18 == 0) {
                    }
                    vs1.X(i27, i15);
                    if (ux2Var.j(wo6.a) == null) {
                        io.sentry.h2.f();
                        return;
                    }
                    ux2Var.W(357055103);
                    ux2Var.p(false);
                    mr2Var = (mr2) ux2Var.j(b11.k);
                    executor = (Executor) ux2Var.j(y40.a);
                    if (executor == null) {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    } else {
                        z7 = false;
                        ux2Var.W(-1248455541);
                        ux2Var.p(false);
                    }
                    if (function4 == null) {
                        ux2Var.W(358076243);
                        ux2Var.p(z7);
                        str2 = str;
                        i28 = i15;
                        int i31111112 = i26;
                        i29 = i31111112;
                        fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111112, z6, i28, i27));
                    } else {
                        str2 = str;
                        i28 = i15;
                        i29 = i26;
                        ux2Var.W(357432497);
                        fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                        ux2Var.p(false);
                    }
                    ei eiVar1111111 = ei.f;
                    int iHashCode1111111 = Long.hashCode(ux2Var.T);
                    fs4 fs4VarS1111111 = uf0.s(ux2Var, fs4VarR);
                    yj5 yj5VarL1111111 = ux2Var.l();
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(eiVar1111111, d82.v, ux2Var);
                    o67.n(yj5VarL1111111, d82.u, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS1111111, d82.t, ux2Var);
                    o67.n(Integer.valueOf(iHashCode1111111), d82.w, ux2Var);
                    ux2Var.p(true);
                    i22 = i27;
                    fs4Var3 = fs4Var4;
                    function3 = function4;
                    i23 = i28;
                    z5 = z6;
                    i24 = i29;
                } else {
                    str2 = str;
                    ux2Var.Q();
                    i22 = i4;
                    fs4Var3 = fs4Var2;
                    function3 = function2;
                    z5 = z3;
                    i23 = i15;
                    i24 = i2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.v40
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                            return f88.a;
                        }
                    };
                }
            }
            i17 |= 12582912;
            i20 = i17 | 100663296;
            if ((i6 & 512) != 0) {
                i20 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zH = ux2Var.f(null);
                } else {
                    zH = ux2Var.h(null);
                }
                if (zH) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i20 |= i21;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i20 & 1, z4)) {
                if (i31 != 0) {
                    fs4Var4 = cs4.b;
                    i25 = i12;
                } else {
                    i25 = i12;
                    fs4Var4 = fs4Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                if (i25 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i18 == 0) {
                }
                vs1.X(i27, i15);
                if (ux2Var.j(wo6.a) == null) {
                    io.sentry.h2.f();
                    return;
                }
                ux2Var.W(357055103);
                ux2Var.p(false);
                mr2Var = (mr2) ux2Var.j(b11.k);
                executor = (Executor) ux2Var.j(y40.a);
                if (executor == null) {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                } else {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                }
                if (function4 == null) {
                    ux2Var.W(358076243);
                    ux2Var.p(z7);
                    str2 = str;
                    i28 = i15;
                    int i31111113 = i26;
                    i29 = i31111113;
                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111113, z6, i28, i27));
                } else {
                    str2 = str;
                    i28 = i15;
                    i29 = i26;
                    ux2Var.W(357432497);
                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                    ux2Var.p(false);
                }
                ei eiVar1111112 = ei.f;
                int iHashCode1111112 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS1111112 = uf0.s(ux2Var, fs4VarR);
                yj5 yj5VarL1111112 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(eiVar1111112, d82.v, ux2Var);
                o67.n(yj5VarL1111112, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS1111112, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode1111112), d82.w, ux2Var);
                ux2Var.p(true);
                i22 = i27;
                fs4Var3 = fs4Var4;
                function3 = function4;
                i23 = i28;
                z5 = z6;
                i24 = i29;
            } else {
                str2 = str;
                ux2Var.Q();
                i22 = i4;
                fs4Var3 = fs4Var2;
                function3 = function2;
                z5 = z3;
                i23 = i15;
                i24 = i2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.v40
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                        return f88.a;
                    }
                };
            }
        }
        i7 |= 1572864;
        i15 = i3;
        i17 = i7;
        i18 = i6 & 128;
        if (i18 != 0) {
            if ((i5 & 12582912) == 0) {
                if (ux2Var.d(i4)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i17 |= i19;
            }
            i20 = i17 | 100663296;
            if ((i6 & 512) != 0) {
                i20 = i17 | 905969664;
            } else if ((i5 & 805306368) == 0) {
                if ((i5 & 1073741824) == 0) {
                    zH = ux2Var.f(null);
                } else {
                    zH = ux2Var.h(null);
                }
                if (zH) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i20 |= i21;
            }
            if ((i20 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ux2Var.N(i20 & 1, z4)) {
                if (i31 != 0) {
                    fs4Var4 = cs4.b;
                    i25 = i12;
                } else {
                    i25 = i12;
                    fs4Var4 = fs4Var2;
                }
                if (i8 != 0) {
                    function4 = null;
                } else {
                    function4 = function2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i2;
                }
                if (i25 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i14 != 0) {
                    i15 = Integer.MAX_VALUE;
                }
                if (i18 == 0) {
                }
                vs1.X(i27, i15);
                if (ux2Var.j(wo6.a) == null) {
                    io.sentry.h2.f();
                    return;
                }
                ux2Var.W(357055103);
                ux2Var.p(false);
                mr2Var = (mr2) ux2Var.j(b11.k);
                executor = (Executor) ux2Var.j(y40.a);
                if (executor == null) {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                } else {
                    z7 = false;
                    ux2Var.W(-1248455541);
                    ux2Var.p(false);
                }
                if (function4 == null) {
                    ux2Var.W(358076243);
                    ux2Var.p(z7);
                    str2 = str;
                    i28 = i15;
                    int i31111114 = i26;
                    i29 = i31111114;
                    fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111114, z6, i28, i27));
                } else {
                    str2 = str;
                    i28 = i15;
                    i29 = i26;
                    ux2Var.W(357432497);
                    fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                    ux2Var.p(false);
                }
                ei eiVar1111113 = ei.f;
                int iHashCode1111113 = Long.hashCode(ux2Var.T);
                fs4 fs4VarS1111113 = uf0.s(ux2Var, fs4VarR);
                yj5 yj5VarL1111113 = ux2Var.l();
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(eiVar1111113, d82.v, ux2Var);
                o67.n(yj5VarL1111113, d82.u, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS1111113, d82.t, ux2Var);
                o67.n(Integer.valueOf(iHashCode1111113), d82.w, ux2Var);
                ux2Var.p(true);
                i22 = i27;
                fs4Var3 = fs4Var4;
                function3 = function4;
                i23 = i28;
                z5 = z6;
                i24 = i29;
            } else {
                str2 = str;
                ux2Var.Q();
                i22 = i4;
                fs4Var3 = fs4Var2;
                function3 = function2;
                z5 = z3;
                i23 = i15;
                i24 = i2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.v40
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                        return f88.a;
                    }
                };
            }
        }
        i17 |= 12582912;
        i20 = i17 | 100663296;
        if ((i6 & 512) != 0) {
            i20 = i17 | 905969664;
        } else if ((i5 & 805306368) == 0) {
            if ((i5 & 1073741824) == 0) {
                zH = ux2Var.f(null);
            } else {
                zH = ux2Var.h(null);
            }
            if (zH) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i20 |= i21;
        }
        if ((i20 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ux2Var.N(i20 & 1, z4)) {
            if (i31 != 0) {
                fs4Var4 = cs4.b;
                i25 = i12;
            } else {
                i25 = i12;
                fs4Var4 = fs4Var2;
            }
            if (i8 != 0) {
                function4 = null;
            } else {
                function4 = function2;
            }
            if (i10 != 0) {
                i26 = 1;
            } else {
                i26 = i2;
            }
            if (i25 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i14 != 0) {
                i15 = Integer.MAX_VALUE;
            }
            if (i18 == 0) {
            }
            vs1.X(i27, i15);
            if (ux2Var.j(wo6.a) == null) {
                io.sentry.h2.f();
                return;
            }
            ux2Var.W(357055103);
            ux2Var.p(false);
            mr2Var = (mr2) ux2Var.j(b11.k);
            executor = (Executor) ux2Var.j(y40.a);
            if (executor == null) {
                z7 = false;
                ux2Var.W(-1248455541);
                ux2Var.p(false);
            } else {
                z7 = false;
                ux2Var.W(-1248455541);
                ux2Var.p(false);
            }
            if (function4 == null) {
                ux2Var.W(358076243);
                ux2Var.p(z7);
                str2 = str;
                i28 = i15;
                int i31111115 = i26;
                i29 = i31111115;
                fs4VarR = fs4Var4.f(new TextStringSimpleElement(str2, ot7Var, mr2Var, i31111115, z6, i28, i27));
            } else {
                str2 = str;
                i28 = i15;
                i29 = i26;
                ux2Var.W(357432497);
                fs4VarR = R(fs4Var4, new xo(str2), ot7Var, function4, i29, z6, i28, i27, (mr2) ux2Var.j(b11.k), null, null, null);
                ux2Var.p(false);
            }
            ei eiVar1111114 = ei.f;
            int iHashCode1111114 = Long.hashCode(ux2Var.T);
            fs4 fs4VarS1111114 = uf0.s(ux2Var, fs4VarR);
            yj5 yj5VarL1111114 = ux2Var.l();
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(eiVar1111114, d82.v, ux2Var);
            o67.n(yj5VarL1111114, d82.u, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS1111114, d82.t, ux2Var);
            o67.n(Integer.valueOf(iHashCode1111114), d82.w, ux2Var);
            ux2Var.p(true);
            i22 = i27;
            fs4Var3 = fs4Var4;
            function3 = function4;
            i23 = i28;
            z5 = z6;
            i24 = i29;
        } else {
            str2 = str;
            ux2Var.Q();
            i22 = i4;
            fs4Var3 = fs4Var2;
            function3 = function2;
            z5 = z3;
            i23 = i15;
            i24 = i2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.v40
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j51.e(str2, fs4Var3, ot7Var, function3, i24, z5, i23, i22, (ux2) obj, yo1.Y(i5 | 1), i6);
                    return f88.a;
                }
            };
        }
    }

    public static final void f(String str, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fs4 fs4Var, ux2 ux2Var, int i2) {
        ux2 ux2Var2;
        fs4 fs4Var2;
        boolean z5;
        ux2Var.Y(30761338);
        int i3 = i2 | (ux2Var.f(str) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.g(z3) ? 256 : 128) | (ux2Var.g(z4) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.h(function1) ? 131072 : 65536) | (ux2Var.h(function2) ? 1048576 : 524288) | (ux2Var.h(function3) ? 8388608 : 4194304) | 100663296;
        if (ux2Var.N(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = z2 ? R.string.app_update_required_bottom_sheet_title : R.string.app_update_bottom_sheet_title;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
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
            String strZ = m77.z(i4, ux2Var);
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 0.0f, 2);
            h72 h72Var = un4.a;
            qs7.b(strZ, fs4VarD, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.g, ux2Var, 48, 0, 130040);
            ux2Var2 = ux2Var;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            lv1.k(null, 0.0f, 0L, ux2Var2, 0, 7);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            if (z4) {
                ux2Var2.W(-359620221);
                int i5 = i3 & 126;
                int i6 = i3 >> 12;
                z5 = true;
                c(str, z2, function2, function3, ux2Var2, (i6 & 7168) | i5 | (i6 & 896));
                ux2Var2.p(false);
            } else {
                z5 = true;
                ux2Var2.W(-359375414);
                int i7 = i3 >> 3;
                b(str, z2, z3, function0, function1, ux2Var2, (i3 & 1022) | (i7 & 7168) | (i7 & 57344));
                ux2Var2.p(false);
            }
            ux2Var2.p(z5);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new s9(str, z2, z3, z4, function0, function1, function2, function3, fs4Var2, i2);
        }
    }

    public static final void g(fs4 fs4Var, he heVar, boolean z2, yy0 yy0Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        boolean z3;
        ux2Var.Y(380139498);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.f(fs4Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= ux2Var.f(heVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(yy0Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            if (i5 != 0) {
                heVar = xz2.f2564o;
            }
            boolean z4 = i6 != 0 ? false : z2;
            do4 do4VarC = ua0.c(heVar, z4);
            boolean zF = ux2Var.f(do4VarC) | ((i4 & 7168) == 2048);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new c9((Object) do4VarC, (Object) yy0Var, (byte) 7);
                ux2Var.g0(objK);
            }
            g68.e(fs4Var, (hw2) objK, ux2Var, i4 & 14, 0);
            z3 = z4;
        } else {
            ux2Var.Q();
            z3 = z2;
        }
        he heVar2 = heVar;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new za0(fs4Var, heVar2, z3, yy0Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0186  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    public static final long h(float f2, float f3, float f4, float f5, cw0 cw0Var) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (cw0Var.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = rv0.i;
            return j2;
        }
        int i25 = cw0Var.c;
        if (i25 == -1) {
            ji3.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = cw0Var.b(0);
        float fA3 = cw0Var.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s2 = (short) i4;
                    fB = cw0Var.b(1);
                    fA = cw0Var.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                fB2 = cw0Var.b(2);
                                fA2 = cw0Var.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s4 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = rv0.i;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s5 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s5)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = rv0.i;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s6 = (short) i11;
                    fB2 = cw0Var.b(2);
                    fA2 = cw0Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s7 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = rv0.i;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s8 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s8)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = rv0.i;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s9 = (short) i4;
        fB = cw0Var.b(1);
        fA = cw0Var.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s10 = (short) i11;
                    fB2 = cw0Var.b(2);
                    fA2 = cw0Var.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s11 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = rv0.i;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s12 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = rv0.i;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s13 = (short) i11;
        fB2 = cw0Var.b(2);
        fA2 = cw0Var.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s14 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = rv0.i;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s15 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = rv0.i;
        return j10;
    }

    public static final long i(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = rv0.i;
        return j2;
    }

    public static final long j(long j2) {
        long j3 = j2 << 32;
        int i2 = rv0.i;
        return j3;
    }

    public static long k(int i2, int i3, int i4) {
        return i(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void l(dx5 dx5Var, hw2 hw2Var, ux2 ux2Var, int i2) {
        lb8 lb8Var;
        boolean z2;
        j56 j56VarR;
        ux2Var.Y(-149765515);
        r94 r94Var = ux2Var.x;
        yj5 yj5VarL = ux2Var.l();
        ux2Var.T(201, i01.b);
        Object objK = ux2Var.K();
        if (im3.n(objK, e01.a)) {
            lb8Var = null;
        } else {
            objK.getClass();
            lb8Var = (lb8) objK;
        }
        zw5 zw5Var = dx5Var.a;
        lb8 lb8VarD = zw5Var.d(dx5Var, lb8Var);
        boolean zEquals = lb8VarD.equals(lb8Var);
        if (!zEquals) {
            ux2Var.g0(lb8VarD);
        }
        if (!ux2Var.S) {
            g17 g17Var = ux2Var.G;
            Object objB = g17Var.b(g17Var.b, g17Var.g);
            objB.getClass();
            yj5 yj5Var = (yj5) objB;
            if (!(ux2Var.z() && zEquals) && (dx5Var.g || !yj5VarL.containsKey(zw5Var))) {
                yj5VarL = yj5VarL.d(zw5Var, lb8VarD);
            } else if ((zEquals && !ux2Var.w) || !ux2Var.w) {
                yj5VarL = yj5Var;
            }
            if (ux2Var.y || yj5Var != yj5VarL) {
                z2 = true;
            }
            if (z2 && !ux2Var.S) {
                ux2Var.I(yj5VarL);
            }
            r94Var.c(ux2Var.w ? 1 : 0);
            ux2Var.w = z2;
            ux2Var.K = yj5VarL;
            ux2Var.R(202, 0, i01.c, yj5VarL);
            hw2Var.invoke(ux2Var, Integer.valueOf((i2 >> 3) & 14));
            ux2Var.p(false);
            ux2Var.p(false);
            ux2Var.w = r94Var.b() != 0;
            ux2Var.K = null;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new pa((byte) 6, i2, (Object) dx5Var, (Object) hw2Var);
            }
        }
        if (dx5Var.g || !yj5VarL.containsKey(zw5Var)) {
            yj5VarL = yj5VarL.d(zw5Var, lb8VarD);
        }
        ux2Var.J = true;
        z2 = false;
        if (z2) {
            ux2Var.I(yj5VarL);
        }
        r94Var.c(ux2Var.w ? 1 : 0);
        ux2Var.w = z2;
        ux2Var.K = yj5VarL;
        ux2Var.R(202, 0, i01.c, yj5VarL);
        hw2Var.invoke(ux2Var, Integer.valueOf((i2 >> 3) & 14));
        ux2Var.p(false);
        ux2Var.p(false);
        ux2Var.w = r94Var.b() != 0;
        ux2Var.K = null;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 6, i2, (Object) dx5Var, (Object) hw2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void m(dx5[] dx5VarArr, hw2 hw2Var, ux2 ux2Var, int i2) {
        yj5 yj5VarH;
        boolean z2;
        j56 j56VarR;
        ux2Var.Y(415205898);
        r94 r94Var = ux2Var.x;
        yj5 yj5VarL = ux2Var.l();
        ux2Var.T(201, i01.b);
        boolean z3 = ux2Var.S;
        h95 h95Var = i01.d;
        if (z3) {
            yj5 yj5VarK = di1.K(dx5VarArr, yj5VarL, yj5.p);
            yj5VarL.getClass();
            xj5 xj5Var = new xj5(yj5VarL);
            xj5Var.s = yj5VarL;
            xj5Var.putAll(yj5VarK);
            yj5VarH = xj5Var.e();
            ux2Var.T(204, h95Var);
            ux2Var.C();
            ux2Var.h0(yj5VarH);
            ux2Var.C();
            ux2Var.h0(yj5VarK);
            ux2Var.p(false);
            ux2Var.J = true;
        } else {
            g17 g17Var = ux2Var.G;
            Object objH = g17Var.h(g17Var.g, 0);
            objH.getClass();
            yj5 yj5Var = (yj5) objH;
            g17 g17Var2 = ux2Var.G;
            Object objH2 = g17Var2.h(g17Var2.g, 1);
            objH2.getClass();
            yj5 yj5Var2 = (yj5) objH2;
            yj5 yj5VarK2 = di1.K(dx5VarArr, yj5VarL, yj5Var2);
            if (!ux2Var.z() || ux2Var.y || !yj5Var2.equals(yj5VarK2)) {
                yj5VarL.getClass();
                xj5 xj5Var2 = new xj5(yj5VarL);
                xj5Var2.s = yj5VarL;
                xj5Var2.putAll(yj5VarK2);
                yj5VarH = xj5Var2.e();
                ux2Var.T(204, h95Var);
                ux2Var.C();
                ux2Var.h0(yj5VarH);
                ux2Var.C();
                ux2Var.h0(yj5VarK2);
                ux2Var.p(false);
                if (ux2Var.y || !yj5VarH.equals(yj5Var)) {
                    z2 = true;
                }
                if (z2 && !ux2Var.S) {
                    ux2Var.I(yj5VarH);
                }
                r94Var.c(ux2Var.w ? 1 : 0);
                ux2Var.w = z2;
                ux2Var.K = yj5VarH;
                ux2Var.R(202, 0, i01.c, yj5VarH);
                hw2Var.invoke(ux2Var, Integer.valueOf((i2 >> 3) & 14));
                ux2Var.p(false);
                ux2Var.p(false);
                ux2Var.w = r94Var.b() != 0;
                ux2Var.K = null;
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new pa((byte) 5, i2, (Object) dx5VarArr, (Object) hw2Var);
                }
            }
            ux2Var.l = ux2Var.G.s() + ux2Var.l;
            yj5VarH = yj5Var;
        }
        z2 = false;
        if (z2) {
            ux2Var.I(yj5VarH);
        }
        r94Var.c(ux2Var.w ? 1 : 0);
        ux2Var.w = z2;
        ux2Var.K = yj5VarH;
        ux2Var.R(202, 0, i01.c, yj5VarH);
        hw2Var.invoke(ux2Var, Integer.valueOf((i2 >> 3) & 14));
        ux2Var.p(false);
        ux2Var.p(false);
        ux2Var.w = r94Var.b() != 0;
        ux2Var.K = null;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 5, i2, (Object) dx5VarArr, (Object) hw2Var);
        }
    }

    public static final void n(Function0 function0, ux2 ux2Var, int i2) {
        function0.getClass();
        ux2Var.Y(2018358799);
        int i3 = i2 | (ux2Var.h(function0) ? 4 : 2);
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            uf0.b(function0, au8.O(-482714937, new v4(function0, (byte) 6), ux2Var), null, null, db8.j, db8.k, null, 0L, 0L, 0L, 0L, null, ux2Var, (i3 & 14) | 1769520, 0, 16284);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new v4(function0, i2, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r39v0, types: [o.ux2] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, o.px4] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void o(final fs4 fs4Var, xo xoVar, final Function1 function1, final boolean z2, final Map map, final ot7 ot7Var, final int i2, final boolean z3, final int i3, final int i4, final mr2 mr2Var, final Function1 function2, ux2 ux2Var, final int i5, final int i6) {
        at7 at7Var;
        Function0 function0;
        Function0 function3;
        vd5 vd5Var;
        Function1 function4;
        ?? r9;
        Object obj;
        Object qa4Var;
        boolean z4;
        ?? r1;
        Object obj2;
        Object obj3;
        Object obj4;
        List list;
        final xo xoVar2 = xoVar;
        ux2Var.Y(-2118572703);
        int i7 = (i5 & 6) == 0 ? (ux2Var.f(fs4Var) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i7 |= ux2Var.f(xoVar2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= ux2Var.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= ux2Var.h(map) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= ux2Var.f(ot7Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= ux2Var.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= ux2Var.g(z3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= ux2Var.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= ux2Var.d(i4) ? 536870912 : 268435456;
        }
        int i8 = (i6 & 6) == 0 ? i6 | (ux2Var.h(mr2Var) ? 4 : 2) : i6;
        if ((i6 & 48) == 0) {
            i8 |= ux2Var.h(null) ? 32 : 16;
        }
        int i9 = i7;
        if ((i6 & 384) == 0) {
            i8 |= ux2Var.h(null) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= ux2Var.h(function2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? ux2Var.f(null) : ux2Var.h(null) ? 16384 : 8192;
        }
        if (ux2Var.N(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zL = h67.l(xoVar2);
            aw awVar = e01.a;
            if (zL) {
                ux2Var.W(145641571);
                boolean z5 = (i9 & 112) == 32;
                Object objK = ux2Var.K();
                Object obj5 = objK;
                if (z5 || objK == awVar) {
                    at7 at7Var2 = new at7(xoVar2);
                    ux2Var.g0(at7Var2);
                    obj5 = at7Var2;
                }
                at7Var = (at7) obj5;
                ux2Var.p(false);
            } else {
                ux2Var.W(145707228);
                ux2Var.p(false);
                at7Var = null;
            }
            if (h67.l(xoVar2)) {
                ux2Var.W(145905443);
                boolean zF = ((i9 & 112) == 32) | ux2Var.f(at7Var);
                Object objK2 = ux2Var.K();
                Object obj6 = objK2;
                if (zF || objK2 == awVar) {
                    x8 x8Var = new x8(at7Var, xoVar2, (byte) 10);
                    ux2Var.g0(x8Var);
                    obj6 = x8Var;
                }
                function0 = (Function0) obj6;
                ux2Var.p(false);
            } else {
                ux2Var.W(146002721);
                boolean z6 = (i9 & 112) == 32;
                Object objK3 = ux2Var.K();
                Object obj7 = objK3;
                if (z6 || objK3 == awVar) {
                    y yVar = new y(xoVar2, (byte) 12);
                    ux2Var.g0(yVar);
                    obj7 = yVar;
                }
                function0 = (Function0) obj7;
                ux2Var.p(false);
            }
            if (z2) {
                if (map != null) {
                    vd5 vd5Var2 = zo.a;
                    if (map.isEmpty()) {
                        function3 = function0;
                        vd5Var = zo.a;
                    } else {
                        int length = xoVar2.n.length();
                        List list2 = xoVar2.m;
                        if (list2 != null) {
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size = list2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                List list3 = list2;
                                wo woVar = (wo) list2.get(i10);
                                int i11 = size;
                                Object obj8 = woVar.a;
                                int i12 = i10;
                                int i13 = woVar.c;
                                Function0 function5 = function0;
                                int i14 = woVar.b;
                                String str = woVar.d;
                                if ((obj8 instanceof db7) && "androidx.compose.foundation.text.inlineContent".equals(str) && yo.b(0, length, i14, i13)) {
                                    Object obj9 = woVar.a;
                                    obj9.getClass();
                                    arrayList.add(new wo(((db7) obj9).a, i14, i13, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list2 = list3;
                                function0 = function5;
                            }
                            function3 = function0;
                            list = arrayList;
                        } else {
                            function3 = function0;
                            list = ea2.m;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = list.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            if (map.get(((wo) list.get(i15)).a) != null) {
                                io.sentry.h2.f();
                                return;
                            }
                        }
                        vd5Var = new vd5(arrayList2, arrayList3);
                    }
                } else {
                    function3 = function0;
                    vd5Var = zo.a;
                }
                function4 = null;
            } else {
                at7Var = at7Var;
                function3 = function0;
                function4 = null;
                vd5Var = new vd5(null, null);
            }
            List list4 = (List) vd5Var.m;
            List list5 = (List) vd5Var.n;
            if (z2) {
                ux2Var.W(146318828);
                Object objK4 = ux2Var.K();
                if (objK4 == awVar) {
                    obj4 = objK4;
                    bg5 bg5VarP = h57.p(function4);
                    ux2Var.g0(bg5VarP);
                    obj4 = bg5VarP;
                }
                obj4 = objK4;
                ux2Var.p(false);
                r9 = (px4) obj4;
            } else {
                ux2Var.W(146406588);
                ux2Var.p(false);
                r9 = function4;
            }
            if (z2) {
                ux2Var.W(146499837);
                boolean zF2 = ux2Var.f(r9);
                Object objK5 = ux2Var.K();
                if (zF2 || objK5 == awVar) {
                    obj3 = objK5;
                    va vaVar = new va(r9, (byte) 6);
                    ux2Var.g0(vaVar);
                    obj3 = vaVar;
                }
                function4 = (Function1) obj3;
                ux2Var.p(false);
            } else {
                ux2Var.W(146571260);
                ux2Var.p(false);
            }
            Function1 function6 = function4;
            int i16 = (i9 >> 3) & 14;
            at7 at7Var3 = at7Var;
            y40.a(xoVar, ot7Var, mr2Var, list4, z3, ux2Var);
            xoVar2 = xoVar;
            xo xoVar3 = (xo) function3.a();
            boolean zH = ux2Var.h(at7Var3) | ((i9 & 896) == 256);
            Object objK6 = ux2Var.K();
            Object obj10 = objK6;
            if (zH || objK6 == awVar) {
                s40 s40Var = new s40(at7Var3, function1, (byte) 0);
                ux2Var.g0(s40Var);
                obj10 = s40Var;
            }
            fs4 fs4VarR = R(fs4Var, xoVar3, ot7Var, (Function1) obj10, i2, z3, i3, i4, mr2Var, list4, function6, function2);
            if (z2) {
                ux2Var.W(147956465);
                boolean zH2 = ux2Var.h(at7Var3);
                Object objK7 = ux2Var.K();
                if (zH2 || objK7 == awVar) {
                    obj = objK7;
                    t40 t40Var = new t40(at7Var3, (byte) 1);
                    ux2Var.g0(t40Var);
                    obj = t40Var;
                }
                Function0 function7 = (Function0) obj;
                boolean zF3 = ux2Var.f(r9);
                Object objK8 = ux2Var.K();
                Object obj11 = objK8;
                if (zF3 || objK8 == awVar) {
                    la laVar = new la(r9, (byte) 4);
                    ux2Var.g0(laVar);
                    obj11 = laVar;
                }
                dk dkVar = new dk(function7, (Function0) obj11, (byte) 1);
                ux2Var.p(false);
                qa4Var = dkVar;
            } else {
                ux2Var.W(147779703);
                boolean zH3 = ux2Var.h(at7Var3);
                Object objK9 = ux2Var.K();
                if (zH3 || objK9 == awVar) {
                    r1 = 0;
                    t40 t40Var2 = new t40(at7Var3, false ? 1 : 0);
                    ux2Var.g0(t40Var2);
                    obj2 = t40Var2;
                } else {
                    r1 = 0;
                    obj2 = objK9;
                }
                qa4Var = new qa4((Function0) obj2, r1);
                ux2Var.p(r1);
            }
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
            o67.n(qa4Var, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            if (at7Var3 == null) {
                ux2Var.W(-433557001);
                z4 = false;
            } else {
                z4 = false;
                ux2Var.W(-291080374);
                at7Var3.a(0, ux2Var);
            }
            ux2Var.p(z4);
            if (list5 == null) {
                ux2Var.W(-433506223);
            } else {
                ux2Var.W(-433506222);
                zo.a(xoVar2, list5, ux2Var, i16);
            }
            ux2Var.p(z4);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.u40
                @Override // o.hw2
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).getClass();
                    int iY = yo1.Y(i5 | 1);
                    int iY2 = yo1.Y(i6);
                    fs4 fs4Var2 = fs4Var;
                    xo xoVar4 = xoVar2;
                    Function1 function8 = function1;
                    boolean z7 = z2;
                    Map map2 = map;
                    ot7 ot7Var2 = ot7Var;
                    byte b2 = i2;
                    boolean z8 = z3;
                    int i17 = i3;
                    boolean z9 = i4;
                    mr2 mr2Var2 = mr2Var;
                    Function1 function9 = function2;
                    j51.o(fs4Var2, xoVar4, function8, z7, map2, ot7Var2, b2, z8, i17, z9 ? 1 : 0, mr2Var2, function9, (ux2) obj12, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    public static final void p(fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            q(fs4Var, yy0Var, ux2Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new fl(fs4Var, yy0Var, i2, b2);
        }
    }

    public static final void q(fs4 fs4Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(771959668);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        byte b3 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                bg5 bg5Var = new bg5(null, xz2.P);
                ux2Var.g0(bg5Var);
                objK = bg5Var;
            }
            px4 px4Var = (px4) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new la(px4Var, b3);
                ux2Var.g0(objK2);
            }
            l(pp7.b.a(N((Function0) objK2, ux2Var, 0)), au8.O(-291176396, new f9(fs4Var, (Object) px4Var, yy0Var, b2), ux2Var), ux2Var, 56);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new fl(fs4Var, yy0Var, i2, b3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long r(float f2, float f3, float f4, float f5, cw0 cw0Var) {
        int i2;
        int i3;
        int i4;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (cw0Var.c()) {
            long j2 = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i19 = rv0.i;
            return j2;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        int i20 = iFloatToRawIntBits3 >>> 31;
        int i21 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = 49;
        int i24 = 0;
        if (i21 == 255) {
            i3 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else {
                if (i2 > 0) {
                    int i25 = i22 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i25) + 1) | (i20 << 15);
                    } else {
                        i3 = i25;
                    }
                    short s2 = (short) i4;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i16 = i14 - 112;
                                    if (i16 < 31) {
                                        if (i16 <= 0) {
                                            i24 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                            } else {
                                                i23 = i16;
                                            }
                                        } else if (i16 >= -10) {
                                            i18 = (i15 | 8388608) >> (1 - i16);
                                            if ((i18 & 4096) != 0) {
                                                i18 += 8192;
                                            }
                                            i23 = 0;
                                            i24 = i18 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
                                    int i26 = rv0.i;
                                    return jMax;
                                }
                                i24 = i15 == 0 ? 0 : 512;
                                i23 = 31;
                                i17 = (i13 << 15) | (i23 << 10) | i24;
                                long jMax2 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
                                int i27 = rv0.i;
                                return jMax2;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s4 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
                        int i28 = rv0.i;
                        return jMax3;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax4 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
                    int i29 = rv0.i;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i30 = (i22 | 8388608) >> (1 - i2);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i3 = i30 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i20 << 15) | (i2 << 10);
        short s5 = (short) i4;
        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s6 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
                        int i210 = rv0.i;
                        return jMax5;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax6 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
                    int i211 = rv0.i;
                    return jMax6;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s7 = (short) i11;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i16 = i14 - 112;
            if (i16 < 31) {
                if (i16 <= 0) {
                    i24 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                    } else {
                        i23 = i16;
                    }
                } else if (i16 >= -10) {
                    i18 = (i15 | 8388608) >> (1 - i16);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i23 = 0;
                    i24 = i18 >> 13;
                } else {
                    i23 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
            int i212 = rv0.i;
            return jMax7;
        }
        i24 = i15 == 0 ? 0 : 512;
        i23 = 31;
        i17 = (i13 << 15) | (i23 << 10) | i24;
        long jMax8 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cw0Var.c) & 63);
        int i213 = rv0.i;
        return jMax8;
    }

    public static final int s(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int t(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void u(g17 g17Var, ArrayList arrayList, int i2) {
        boolean zL = g17Var.l(i2);
        int[] iArr = g17Var.b;
        if (zL) {
            arrayList.add(g17Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            u(g17Var, arrayList, i4);
        }
    }

    public static eq0 v(ux2 ux2Var) {
        zv0 zv0Var = ((rn4) ux2Var.j(un4.a)).a;
        eq0 eq0Var = zv0Var.b0;
        if (eq0Var != null) {
            return eq0Var;
        }
        long jB = bw0.b(zv0Var, jq0.e);
        long j2 = rv0.g;
        long jB2 = bw0.b(zv0Var, jq0.d);
        aw0 aw0Var = jq0.a;
        long jB3 = bw0.b(zv0Var, aw0Var);
        aw0 aw0Var2 = jq0.b;
        long jB4 = bw0.b(zv0Var, aw0Var2);
        float f2 = jq0.c;
        eq0 eq0Var2 = new eq0(jB, j2, jB3, j2, rv0.b(f2, jB4), j2, rv0.b(f2, bw0.b(zv0Var, aw0Var2)), bw0.b(zv0Var, aw0Var), bw0.b(zv0Var, jq0.i), rv0.b(f2, bw0.b(zv0Var, aw0Var2)), rv0.b(jq0.g, bw0.b(zv0Var, jq0.h)), rv0.b(f2, bw0.b(zv0Var, aw0Var2)), jB2);
        zv0Var.b0 = eq0Var2;
        return eq0Var2;
    }

    public static final long w(w36 w36Var, ai0 ai0Var, int i2, long j2) {
        ai0 ai0Var2;
        bf0 bf0Var = w36Var.n;
        ai0Var.getClass();
        long j3 = i2;
        ck3.p(ai0Var.d(), 0L, j3);
        long jMax = 0;
        if (w36Var.f2372o) {
            hk0.l("closed");
            return 0L;
        }
        int i3 = i2;
        ai0 ai0Var3 = ai0Var;
        while (true) {
            long j4 = jMax;
            long jA = b.a(bf0Var, ai0Var3, j4, j2, i3);
            if (jA != -1) {
                return jA;
            }
            long j5 = bf0Var.n;
            long j6 = (j5 - j3) + 1;
            if (j6 < j2) {
                if (j5 < j2) {
                    ai0Var2 = ai0Var;
                } else {
                    int iMax = (int) Math.max(1L, (j5 - j2) + 1);
                    int iMin = ((int) Math.min(j3, (bf0Var.n - j4) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            ai0Var2 = ai0Var;
                            if (bf0Var.Y(bf0Var.n - ((long) iMin), ai0Var2, iMin)) {
                                break;
                            }
                            if (iMin != iMax) {
                                iMin--;
                            }
                        }
                    }
                }
                if (w36Var.m.i0(bf0Var, 8192L) != -1) {
                    jMax = Math.max(j4, j6);
                    i3 = i2;
                    ai0Var3 = ai0Var2;
                }
            }
            return -1L;
        }
    }

    public static final long x(long j2, long j3) {
        float f2;
        float f3;
        long jA = rv0.a(j2, rv0.e(j3));
        float fC = rv0.c(j3);
        float fC2 = rv0.c(jA);
        float f4 = 1.0f - fC2;
        float f5 = (fC * f4) + fC2;
        float fG = rv0.g(jA);
        float fG2 = rv0.g(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fC) * f4) + (fG * fC2)) / f5;
        }
        float f7 = rv0.f(jA);
        float f8 = rv0.f(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((f8 * fC) * f4) + (f7 * fC2)) / f5;
        }
        float fD = rv0.d(jA);
        float fD2 = rv0.d(j3);
        if (f5 != 0.0f) {
            f6 = (((fD2 * fC) * f4) + (fD * fC2)) / f5;
        }
        return r(f2, f3, f6, f5, rv0.e(j3));
    }

    public static final long y(int i2, int i3, w07 w07Var, oi6 oi6Var, w07 w07Var2) {
        int i4;
        int i5;
        if (!im3.n(w07Var, w07.c)) {
            i2 = W(w07Var.a, oi6Var);
            i3 = W(w07Var.b, oi6Var);
        }
        j12 j12Var = w07Var2.a;
        j12 j12Var2 = w07Var2.b;
        if ((j12Var instanceof g12) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((g12) j12Var).a)) {
            i2 = i5;
        }
        if ((j12Var2 instanceof g12) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((g12) j12Var2).a)) {
            i3 = i4;
        }
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final double z(int i2, int i3, int i4, int i5, oi6 oi6Var, w07 w07Var) {
        double dMax;
        double d2 = i2;
        double d3 = ((double) i4) / d2;
        double d4 = i3;
        double d5 = ((double) i5) / d4;
        int iOrdinal = oi6Var.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d3, d5);
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return 0.0d;
            }
            dMax = Math.min(d3, d5);
        }
        j12 j12Var = w07Var.a;
        if (j12Var instanceof g12) {
            double d6 = ((double) ((g12) j12Var).a) / d2;
            if (dMax > d6) {
                dMax = d6;
            }
        }
        j12 j12Var2 = w07Var.b;
        if (j12Var2 instanceof g12) {
            double d7 = ((double) ((g12) j12Var2).a) / d4;
            if (dMax > d7) {
                return d7;
            }
        }
        return dMax;
    }
}
