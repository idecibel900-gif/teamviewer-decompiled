package androidx.compose.material3.internal.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material3.a;
import androidx.compose.material3.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import o.a65;
import o.an4;
import o.as5;
import o.bg5;
import o.ck3;
import o.d14;
import o.dg;
import o.el5;
import o.es4;
import o.g04;
import o.h57;
import o.im3;
import o.in1;
import o.iu;
import o.je6;
import o.jl3;
import o.ke6;
import o.km;
import o.lh;
import o.lk;
import o.ll0;
import o.mw4;
import o.nl0;
import o.qf0;
import o.rv0;
import o.t52;
import o.t65;
import o.u52;
import o.ua5;
import o.v01;
import o.vn4;
import o.vt4;
import o.wd6;
import o.xc0;
import o.xd6;
import o.xk0;
import o.xr5;
import o.xs1;
import o.xv0;
import o.y;
import o.yo1;
import o.yr5;
import o.zr5;
import o.zw4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material3/internal/ripple/RippleNode;", "Lo/es4;", "Lo/v01;", "Lo/t52;", "Lo/g04;", "Lo/xv0;", "color", "Lo/xv0;", "o/el5", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RippleNode extends es4 implements v01, t52, g04 {
    public final mw4 A;
    public final boolean B;
    public final float C;
    public final a D;
    public float E;
    public boolean G;
    public jl3 K;
    public el5 N;
    private final xv0 color;
    public long F = 0;
    public final zw4 H = new zw4();
    public final km I = ck3.a(0.0f);
    public final ArrayList J = new ArrayList();
    public final km L = ck3.a(0.0f);
    public final bg5 M = h57.p(Boolean.FALSE);

    public RippleNode(mw4 mw4Var, boolean z, float f, b bVar, a aVar) {
        this.A = mw4Var;
        this.B = z;
        this.C = f;
        this.color = bVar;
        this.D = aVar;
    }

    @Override // o.es4
    public final boolean J0() {
        return false;
    }

    @Override // o.es4
    public final void M0() {
        im3.R(I0(), null, null, new vt4(this, null, (byte) 14), 3);
    }

    public final void U0(as5 as5Var) {
        xd6 xd6Var;
        if (!(as5Var instanceof yr5)) {
            if (as5Var instanceof zr5) {
                xd6 xd6Var2 = ((lk) this).P;
                if (xd6Var2 != null) {
                    xd6Var2.d();
                    return;
                }
                return;
            }
            if (!(as5Var instanceof xr5) || (xd6Var = ((lk) this).P) == null) {
                return;
            }
            xd6Var.d();
            return;
        }
        yr5 yr5Var = (yr5) as5Var;
        long j = this.F;
        float f = this.E;
        lk lkVar = (lk) this;
        wd6 wd6Var = lkVar.O;
        if (wd6Var == null) {
            Object obj = (View) xk0.q(lkVar, lh.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    an4.q(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    wd6 wd6Var2 = new wd6(viewGroup.getContext());
                    viewGroup.addView(wd6Var2);
                    wd6Var = wd6Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof wd6) {
                        wd6Var = (wd6) childAt;
                        break;
                    }
                    i++;
                }
            }
            lkVar.O = wd6Var;
        }
        ArrayList arrayList = wd6Var.n;
        a65 a65Var = wd6Var.p;
        LinkedHashMap linkedHashMap = (LinkedHashMap) a65Var.n;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a65Var.n;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) a65Var.f302o;
        xd6 xd6Var3 = (xd6) linkedHashMap.get(lkVar);
        if (xd6Var3 == null) {
            ArrayList arrayList2 = wd6Var.f2400o;
            arrayList2.getClass();
            xd6Var3 = (xd6) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (xd6Var3 == null) {
                if (wd6Var.q > qf0.D(arrayList)) {
                    xd6Var3 = new xd6(wd6Var.getContext());
                    wd6Var.addView(xd6Var3);
                    arrayList.add(xd6Var3);
                } else {
                    xd6Var3 = (xd6) arrayList.get(wd6Var.q);
                    lk lkVar2 = (lk) linkedHashMap3.get(xd6Var3);
                    if (lkVar2 != null) {
                        lkVar2.P = null;
                        yo1.H(lkVar2);
                        xd6 xd6Var4 = (xd6) linkedHashMap2.get(lkVar2);
                        if (xd6Var4 != null) {
                        }
                        linkedHashMap2.remove(lkVar2);
                        xd6Var3.c();
                    }
                }
                int i2 = wd6Var.q;
                if (i2 < wd6Var.m - 1) {
                    wd6Var.q = i2 + 1;
                } else {
                    wd6Var.q = 0;
                }
            }
            linkedHashMap2.put(lkVar, xd6Var3);
            linkedHashMap3.put(xd6Var3, lkVar);
        }
        xd6 xd6Var5 = xd6Var3;
        xd6Var5.b(yr5Var, lkVar.B, j, vn4.s0(f), lkVar.color.a(), ((ke6) lkVar.D.a()).a instanceof je6 ? 0.1f : 0.0f, new y(lkVar, (byte) 7));
        lkVar.P = xd6Var5;
        yo1.H(lkVar);
    }

    @Override // o.g04, o.go4
    public final void b(long j) {
        float fD0;
        this.G = true;
        in1 in1Var = vn4.p0(this).L;
        this.F = xs1.a0(j);
        float f = this.C;
        if (Float.isNaN(f)) {
            long j2 = this.F;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fD0 = t65.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.B) {
                fD0 += in1Var.d0(10.0f);
            }
        } else {
            fD0 = in1Var.d0(f);
        }
        this.E = fD0;
        zw4 zw4Var = this.H;
        Object[] objArr = zw4Var.a;
        int i = zw4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            U0((as5) objArr[i2]);
        }
        zw4Var.d();
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        d14Var.a();
        lk lkVar = (lk) this;
        nl0 nl0Var = d14Var.m;
        ll0 ll0VarX = nl0Var.n.x();
        xd6 xd6Var = lkVar.P;
        if (xd6Var != null) {
            xd6Var.e(lkVar.F, vn4.s0(lkVar.E), lkVar.color.a(), ((ke6) lkVar.D.a()).a instanceof je6 ? 0.1f : 0.0f);
            xd6Var.draw(dg.b(ll0VarX));
        }
        float fFloatValue = ((Number) this.I.d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = rv0.b(fFloatValue, this.color.a());
            if (this.B) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (nl0Var.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nl0Var.d() & 4294967295L));
                iu iuVar = nl0Var.n;
                long jD = iuVar.D();
                iuVar.x().g();
                try {
                    ((xc0) iuVar.f1103o).D(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    u52.t(d14Var, jB, this.E, 0L, null, 124);
                    ua5.x(iuVar, jD);
                } catch (Throwable th) {
                    ua5.x(iuVar, jD);
                    throw th;
                }
            } else {
                u52.t(d14Var, jB, this.E, 0L, null, 124);
            }
        }
        if (((Number) this.L.d()).floatValue() > 0.0f) {
            el5 el5Var = this.N;
            if (el5Var == null) {
                el5Var = new el5((byte) 5);
            }
            this.N = el5Var;
            this.D.a();
        }
    }
}
