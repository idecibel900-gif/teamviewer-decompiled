package o;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.provider.Settings;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.appbar.AppBarLayout;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g68 {
    public static int A;
    public static final aw0 a = aw0.D;
    public static final aw0 b;
    public static final aw0 c;
    public static final aw0 d;
    public static final aw0 e;
    public static final aw0 f;
    public static final yy0 g;
    public static final yy0 h;
    public static final yy0 i;
    public static final yy0 j;
    public static final yy0 k;
    public static final yy0 l;
    public static final yy0 m;
    public static final yy0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wm5 f867o;
    public static final i68 p;
    public static final cr q;
    public static final i34[] r;
    public static final hr2 s;
    public static final hr2 t;
    public static final hr2 u;
    public static final le5 v;
    public static final dz0 w;
    public static final wj5 x;
    public static final Object y;
    public static final int[] z;

    static {
        aw0 aw0Var = aw0.t;
        b = aw0Var;
        c = aw0.E;
        aw0 aw0Var2 = aw0.u;
        d = aw0Var2;
        e = aw0Var;
        f = aw0Var2;
        g = new yy0(1569727314, false, new p20((byte) 9));
        h = new yy0(-1689715384, false, new p20((byte) 10));
        i = new yy0(557658587, false, new bz0((byte) 0));
        j = new yy0(-770371327, false, new fz0((byte) 4));
        k = new yy0(-2000141764, false, new fz0((byte) 5));
        byte b2 = 6;
        l = new yy0(1062975900, false, new fz0(b2));
        m = new yy0(-1436750523, false, new gz0(b2));
        n = new yy0(1662840598, false, new gz0((byte) 22));
        f867o = new wm5(null, new gm5());
        p = i68.q;
        q = new cr((byte) 20);
        r = new i34[0];
        byte b3 = 14;
        s = new hr2("NULL", b3);
        t = new hr2("UNINITIALIZED", b3);
        u = new hr2("DONE", b3);
        v = new le5((byte) 8);
        w = new dz0((byte) 2);
        x = new wj5((byte) 11);
        y = new Object();
        z = new int[]{R.attr.stateListAnimator};
    }

    public static fs4 A(fs4 fs4Var, boolean z2, pe6 pe6Var, Function0 function0) {
        return fs4Var.f(new do6(z2, null, null, true, true, pe6Var, function0));
    }

    public static void B(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(com.teamviewer.teamviewer.market.mobile.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, com.teamviewer.teamviewer.market.mobile.R.attr.state_liftable, -com.teamviewer.teamviewer.market.mobile.R.attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final String C(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final String D(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        zp6 zp6VarH0 = bq6.h0(type, f68.n);
        StringBuilder sb = new StringBuilder();
        Iterator it = zp6VarH0.iterator();
        if (!it.hasNext()) {
            an4.j("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb.append(((Class) next).getName());
        Iterator it2 = zp6VarH0.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        sb.append(bc7.K(i2, "[]"));
        return sb.toString();
    }

    public static final rh a(String str) {
        return new rh(lv1.V(str));
    }

    public static final void b(int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(1292138908);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new y01((byte) 28);
                ux2Var.g0(objK);
            }
            yy0 yy0VarO = au8.O(-1731967916, new v4(function0, (byte) 10), ux2Var);
            yy0 yy0Var = kh.i;
            yy0 yy0Var2 = kh.j;
            fs4Var2 = cs4.b;
            uf0.b((Function0) objK, yy0VarO, fs4Var2, null, yy0Var, yy0Var2, null, 0L, 0L, 0L, 0L, null, ux2Var, 1769910, 0, 16280);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a20(function0, fs4Var2, i2, (byte) 2);
        }
    }

    public static final void c(Function0 function0, a12 a12Var, yy0 yy0Var, ux2 ux2Var, int i2) {
        int i3;
        Object obj;
        byte b2;
        byte b3;
        Object obj2;
        ux2Var.Y(826668973);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(a12Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(yy0Var) ? 256 : 128;
        }
        int i4 = i3;
        if (ux2Var.N(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) ux2Var.j(lh.f);
            in1 in1Var = (in1) ux2Var.j(b11.h);
            j04 j04Var = (j04) ux2Var.j(b11.n);
            sx2 sx2VarY = kh.y(ux2Var);
            px4 px4VarT = h57.t(yy0Var, ux2Var);
            Object[] objArr = new Object[0];
            Object objK = ux2Var.K();
            Object obj3 = e01.a;
            if (objK == obj3) {
                obj = objK;
                Object e5Var = new e5((byte) 13);
                ux2Var.g0(e5Var);
                obj = e5Var;
            }
            obj = objK;
            UUID uuid = (UUID) zu1.L(objArr, (Function0) obj, ux2Var, 48);
            a12Var.getClass();
            boolean zD = ux2Var.d(2) | ux2Var.f(view) | ux2Var.f(in1Var) | ux2Var.f(null);
            Object objK2 = ux2Var.K();
            if (zD || objK2 == obj3) {
                d12 d12Var = new d12(function0, a12Var, view, j04Var, in1Var, uuid);
                b2 = 1;
                yy0 yy0Var2 = new yy0(-1338939603, true, new ai(px4VarT, (byte) 0));
                y02 y02Var = d12Var.t;
                y02Var.setParentCompositionContext(sx2VarY);
                y02Var.w.setValue(yy0Var2);
                y02Var.A = true;
                y02Var.d();
                ux2Var.g0(d12Var);
                objK2 = d12Var;
            } else {
                b2 = 1;
            }
            d12 d12Var2 = (d12) objK2;
            boolean zH = ux2Var.h(d12Var2);
            Object objK3 = ux2Var.K();
            if (zH || objK3 == obj3) {
                b3 = 0;
                Object biVar = new bi(d12Var2, b3);
                ux2Var.g0(biVar);
                obj2 = biVar;
            } else {
                b3 = 0;
                obj2 = objK3;
            }
            ck3.e(d12Var2, (Function1) obj2, ux2Var);
            int i5 = (ux2Var.h(d12Var2) ? 1 : 0) | ((i4 & 14) == 4 ? b2 : b3);
            if ((i4 & 112) == 32) {
                b3 = b2;
            }
            int i6 = i5 | b3 | (ux2Var.d(j04Var.ordinal()) ? 1 : 0);
            Object objK4 = ux2Var.K();
            Object obj4 = objK4;
            if (i6 != 0 || objK4 == obj3) {
                Object ebVar = new eb(d12Var2, function0, a12Var, j04Var);
                ux2Var.g0(ebVar);
                obj4 = ebVar;
            }
            ck3.k((Function0) obj4, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) function0, (Object) a12Var, (Object) yy0Var, i2, (byte) 0);
        }
    }

    public static final void d(fs4 fs4Var, hw2 hw2Var, ux2 ux2Var, int i2) {
        ux2Var.Y(1090521195);
        int i3 = (ux2Var.f(fs4Var) ? 4 : 2) | i2 | (ux2Var.h(hw2Var) ? 32 : 16);
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ei.b;
                ux2Var.g0(objK);
            }
            do4 do4Var = (do4) objK;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            int i4 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4Var, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            hw2Var.invoke(ux2Var, Integer.valueOf((i4 >> 6) & 14));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new zh(fs4Var, hw2Var, i2, b2);
        }
    }

    public static final void e(fs4 fs4Var, hw2 hw2Var, ux2 ux2Var, int i2, int i3) {
        int i4;
        ux2Var.Y(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (ux2Var.f(fs4Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if (ux2Var.N(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                fs4Var = cs4.b;
            }
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new ld7(z06.B);
                ux2Var.g0(objK);
            }
            f((ld7) objK, fs4Var, hw2Var, ux2Var, (i4 << 3) & 1008);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(fs4Var, hw2Var, i2, i3);
        }
    }

    public static final void f(ld7 ld7Var, fs4 fs4Var, hw2 hw2Var, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.h(ld7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(hw2Var) ? 256 : 128;
        }
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(ux2Var.T);
            sx2 sx2VarY = kh.y(ux2Var);
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yj5 yj5VarL = ux2Var.l();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(ld7Var, ld7Var.c, ux2Var);
            o67.n(sx2VarY, ld7Var.d, ux2Var);
            o67.n(hw2Var, ld7Var.e, ux2Var);
            yz0.c.getClass();
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            ux2Var.p(true);
            if (ux2Var.z()) {
                ux2Var.W(-1259187287);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1259245908);
                boolean zH = ux2Var.h(ld7Var);
                Object objK = ux2Var.K();
                if (zH || objK == e01.a) {
                    objK = new y26(ld7Var, (byte) 21);
                    ux2Var.g0(objK);
                }
                ck3.k((Function0) objK, ux2Var);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) ld7Var, (Object) fs4Var, (Object) hw2Var, i2, (byte) 24);
        }
    }

    public static final kh4 g(qh4 qh4Var, int i2, ux2 ux2Var, int i3) {
        ux2Var.X(683659508);
        boolean z2 = (i3 & 4) != 0;
        if (i2 <= 0) {
            gk0.h(fx3.f(i2, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            gk0.h("Speed must be a finite number. It is 1.0.");
            return null;
        }
        ux2Var.X(2024497114);
        ux2Var.X(-610207850);
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (objK == awVar) {
            objK = new kh4();
            ux2Var.g0(objK);
        }
        kh4 kh4Var = (kh4) objK;
        ux2Var.p(false);
        ux2Var.p(false);
        ux2Var.X(-180606964);
        Object objK2 = ux2Var.K();
        if (objK2 == awVar) {
            objK2 = h57.p(true);
            ux2Var.g0(objK2);
        }
        px4 px4Var = (px4) objK2;
        ux2Var.p(false);
        ux2Var.X(-180606834);
        Context context = (Context) ux2Var.j(lh.b);
        Matrix matrix = ta8.a;
        float f2 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        ux2Var.p(false);
        ck3.j(new Object[]{qh4Var, true, null, Float.valueOf(f2), Integer.valueOf(i2)}, new ym(z2, kh4Var, qh4Var, i2, false, f2, px4Var, null), ux2Var);
        ux2Var.p(false);
        return kh4Var;
    }

    public static xx h() throws InterruptedException {
        nd ndVar = xx.h;
        xx xxVar = ((xx[]) ndVar.f1562o)[1];
        if (xxVar == null) {
            long jNanoTime = System.nanoTime();
            xx.k.await(xx.l, TimeUnit.MILLISECONDS);
            if (((xx[]) ndVar.f1562o)[1] != null || System.nanoTime() - jNanoTime < xx.m) {
                return null;
            }
            return xx.i;
        }
        long jNanoTime2 = xxVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            xx.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        ndVar.r(xxVar);
        xxVar.e = (byte) 2;
        return xxVar;
    }

    public static final String i(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static void j(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            an4.f(i4, fx3.j(i2, i3, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            hk0.g(ua5.l("startIndex: ", i2, i3, " > endIndex: "));
        }
    }

    public static void k(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            an4.f(i4, fx3.j(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            hk0.g(ua5.l("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    public static final Type l(ow3 ow3Var, boolean z2) {
        qw3 qw3Var = (qw3) ow3Var;
        ju3 ju3VarH = qw3Var.h();
        if (ju3VarH instanceof rw3) {
            return new r65((rw3) ju3VarH);
        }
        if (!(ju3VarH instanceof wt3)) {
            an4.u(qw3Var, "Unsupported type classifier: ");
            return null;
        }
        wt3 wt3Var = (wt3) ju3VarH;
        Class clsA = z2 ? et1.A(wt3Var) : et1.z(wt3Var);
        List listD = qw3Var.d();
        if (listD.isEmpty()) {
            return clsA;
        }
        if (!clsA.isArray()) {
            return o(clsA, listD);
        }
        if (clsA.getComponentType().isPrimitive()) {
            return clsA;
        }
        uw3 uw3Var = (uw3) lv0.H0(listD);
        if (uw3Var == null) {
            an4.i(qw3Var, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        vw3 vw3Var = uw3Var.a;
        ow3 ow3Var2 = uw3Var.b;
        int i2 = vw3Var == null ? -1 : e68.a[vw3Var.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return clsA;
        }
        if (i2 != 2 && i2 != 3) {
            gk0.s();
            return null;
        }
        ow3Var2.getClass();
        Type typeL = l(ow3Var2, false);
        return typeL instanceof Class ? clsA : new uy2(typeL);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0006, B:10:0x0024, B:12:0x003d, B:13:0x0040, B:15:0x0046, B:17:0x004a, B:18:0x005a, B:20:0x005c, B:21:0x005f), top: B:35:0x0006, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0006, B:10:0x0024, B:12:0x003d, B:13:0x0040, B:15:0x0046, B:17:0x004a, B:18:0x005a, B:20:0x005c, B:21:0x005f), top: B:35:0x0006, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    public static eg0 m(ht2 ht2Var, xd4 xd4Var, ps4 ps4Var, InputStream inputStream) throws IOException {
        ov5 ov5Var;
        t1 t1Var;
        ht2Var.getClass();
        ps4Var.getClass();
        try {
            zf0 zf0Var = zf0.f;
            zf0 zf0VarX = e8.x(inputStream);
            zf0 zf0Var2 = zf0.f;
            int i2 = zf0VarX.c;
            zf0Var2.getClass();
            int i3 = zf0Var2.c;
            int i4 = zf0VarX.b;
            int i5 = zf0Var2.b;
            if (i4 == 0) {
                if (i5 == 0 && i2 == i3) {
                    dg2 dg2Var = new dg2();
                    fg0.a(dg2Var);
                    ys3 ys3Var = ov5.w;
                    ys3Var.getClass();
                    vu0 vu0Var = new vu0(inputStream);
                    t1Var = (t1) ys3Var.b(vu0Var, dg2Var);
                    try {
                        vu0Var.a(0);
                        if (t1Var.a()) {
                            rm3 rm3Var = new rm3(new z78().getMessage());
                            rm3Var.m = t1Var;
                            throw rm3Var;
                        }
                        ov5Var = (ov5) t1Var;
                    } catch (rm3 e2) {
                        e2.m = t1Var;
                        throw e2;
                    }
                } else {
                    ov5Var = null;
                }
            } else if (i4 != i5 || i2 > i3) {
                ov5Var = null;
            } else {
                dg2 dg2Var2 = new dg2();
                fg0.a(dg2Var2);
                ys3 ys3Var2 = ov5.w;
                ys3Var2.getClass();
                vu0 vu0Var2 = new vu0(inputStream);
                t1Var = (t1) ys3Var2.b(vu0Var2, dg2Var2);
                vu0Var2.a(0);
                if (t1Var.a()) {
                    rm3 rm3Var2 = new rm3(new z78().getMessage());
                    rm3Var2.m = t1Var;
                    throw rm3Var2;
                }
                ov5Var = (ov5) t1Var;
            }
            ov5 ov5Var2 = ov5Var;
            inputStream.close();
            if (ov5Var2 != null) {
                return new eg0(ht2Var, xd4Var, ps4Var, ov5Var2, zf0VarX);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + zf0Var2 + ", actual " + zf0VarX + ". Please update Kotlin");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kh.n(inputStream, th);
                throw th2;
            }
        }
    }

    public static i48 n(boolean z2, tz3 tz3Var, int i2) {
        xz2 xz2Var = xz2.W;
        if ((i2 & 8) != 0) {
            tz3Var = tz3.a;
        }
        return new i48(z2, true, xz2Var, tz3Var, uz3.a);
    }

    public static final vf5 o(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q((uw3) it.next()));
            }
            return new vf5(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(q((uw3) it2.next()));
            }
            return new vf5(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        vf5 vf5VarO = o(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(mv0.Z(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(q((uw3) it3.next()));
        }
        return new vf5(cls, vf5VarO, arrayList3);
    }

    public static final String[] p(vb1 vb1Var) {
        vb1Var.getClass();
        return (String[]) ((rh) vb1Var).b.toArray(new String[0]);
    }

    public static final Type q(uw3 uw3Var) {
        vw3 vw3Var = uw3Var.a;
        if (vw3Var == null) {
            return aj8.f330o;
        }
        ow3 ow3Var = uw3Var.b;
        ow3Var.getClass();
        int iOrdinal = vw3Var.ordinal();
        if (iOrdinal == 0) {
            return l(ow3Var, true);
        }
        if (iOrdinal == 1) {
            return new aj8(null, l(ow3Var, true));
        }
        if (iOrdinal == 2) {
            return new aj8(l(ow3Var, true), null);
        }
        gk0.s();
        return null;
    }

    public static String r(d8 d8Var) {
        if (d8Var instanceof c8) {
            return "image/*";
        }
        if (d8Var instanceof b8) {
            return null;
        }
        gk0.s();
        return null;
    }

    public static final boolean s(z31 z31Var, z31 z31Var2) {
        z31Var.getClass();
        z31Var2.getClass();
        return im3.n(z31Var.d, z31Var2.d) && im3.n(z31Var.e, z31Var2.e) && z31Var.j == z31Var2.j && z31Var.m == z31Var2.m;
    }

    public static void t(xx xxVar) {
        if (xx.i == null) {
            xx.i = new xx();
            io.sentry.x5 x5Var = new io.sentry.x5("Okio Watchdog");
            x5Var.setDaemon(true);
            x5Var.start();
        }
        long jNanoTime = System.nanoTime();
        long j2 = xxVar.c;
        boolean z2 = xxVar.a;
        if (j2 != 0 && z2) {
            xxVar.g = Math.min(j2, xxVar.c() - jNanoTime) + jNanoTime;
        } else if (j2 != 0) {
            xxVar.g = jNanoTime + j2;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            xxVar.g = xxVar.c();
        }
        nd ndVar = xx.h;
        int i2 = ndVar.n + 1;
        ndVar.n = i2;
        xx[] xxVarArr = (xx[]) ndVar.f1562o;
        if (i2 == xxVarArr.length) {
            xx[] xxVarArr2 = new xx[i2 * 2];
            cx.J0(0, 0, 14, xxVarArr, xxVarArr2);
            ndVar.f1562o = xxVarArr2;
        }
        ndVar.j(i2, xxVar);
        if (xxVar.f == 1) {
            xx.k.signal();
        }
    }

    public static final boolean u(ns4 ns4Var) {
        LinkedHashSet linkedHashSet = nx0.a;
        if (!zo1.l(ns4Var)) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = nx0.a;
        js0 js0VarF = bp1.f(ns4Var);
        return lv0.h0(linkedHashSet2, js0VarF != null ? js0VarF.e() : null);
    }

    public static final boolean v(int i2, String str) {
        char cCharAt = str.charAt(i2);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final fs4 z(fs4 fs4Var, boolean z2, mw4 mw4Var, xg3 xg3Var, boolean z3, pe6 pe6Var, Function0 function0) {
        fs4 fs4VarF;
        if (xg3Var != null) {
            fs4VarF = new do6(z2, mw4Var, xg3Var, false, z3, pe6Var, function0);
        } else if (xg3Var == null) {
            fs4VarF = new do6(z2, mw4Var, null, false, z3, pe6Var, function0);
        } else {
            cs4 cs4Var = cs4.b;
            fs4VarF = mw4Var != null ? ug3.a(cs4Var, mw4Var, xg3Var).f(new do6(z2, mw4Var, null, false, z3, pe6Var, function0)) : uf0.k(cs4Var, new eo6(xg3Var, z2, z3, pe6Var, function0));
        }
        return fs4Var.f(fs4VarF);
    }

    public void w(CharSequence charSequence) {
    }

    public void x() {
    }

    public void y(u60 u60Var) {
    }
}
