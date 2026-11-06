package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m20 extends es4 implements r04, t52, dp6, ln5, is4, eg5, g04, gz2, xp2, qq2, uq2, oc5, sf0 {
    public ds4 A;
    public l20 B;
    public HashSet C;

    @Override // o.xp2
    public final void D(wq2 wq2Var) {
        ds4 ds4Var = this.A;
        ki3.c("onFocusEvent called on wrong node");
        ds4Var.getClass();
        throw new ClassCastException();
    }

    @Override // o.ln5
    public final void D0(bn5 bn5Var, cn5 cn5Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        pn5 pn5Var = ((qn5) ds4Var).e;
        qn5 qn5Var = (qn5) pn5Var.p;
        List list = bn5Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            in5 in5Var = (in5) list.get(i);
            if (qs1.D(in5Var) || qs1.F(in5Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((in5) list.get(i2)).c()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (qn5Var.d) {
            z3 = true;
            break;
        }
        int size3 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                in5 in5Var2 = (in5) list.get(i3);
                if (!qs1.D(in5Var2) && !qs1.F(in5Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        on5 on5Var = (on5) pn5Var.n;
        on5 on5Var2 = on5.f1662o;
        cn5 cn5Var2 = cn5.f544o;
        if (on5Var != on5Var2) {
            if (cn5Var == cn5.m && z3) {
                pn5Var.f1752o = bn5Var;
                pn5Var.f(bn5Var, !z || qn5Var.d);
            }
            if (cn5Var == cn5.n && z && bn5Var == ((bn5) pn5Var.f1752o) && qn5Var.d) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((in5) list.get(i4)).a();
                }
            }
            if (cn5Var == cn5Var2 && !z3 && bn5Var != ((bn5) pn5Var.f1752o)) {
                pn5Var.f(bn5Var, true);
            }
        }
        if (cn5Var == cn5Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    pn5Var.n = on5.m;
                    ((qn5) pn5Var.p).d = false;
                    pn5Var.f1752o = null;
                    break;
                } else if (!qs1.F((in5) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (bn5Var == ((bn5) pn5Var.f1752o) && z) {
                int size6 = list.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((in5) list.get(i6)).c()) {
                        if (qn5Var.d) {
                            break;
                        }
                        pn5Var.D(bn5Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((in5) list.get(i7)).a();
                }
            }
        }
    }

    @Override // o.ln5
    public final void E() {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        pn5 pn5Var = ((qn5) ds4Var).e;
        on5 on5Var = (on5) pn5Var.n;
        qn5 qn5Var = (qn5) pn5Var.p;
        if (on5Var == on5.n) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((rl) qn5Var.e()).invoke(motionEventObtain);
            motionEventObtain.recycle();
            pn5Var.n = on5.m;
            qn5Var.d = false;
            pn5Var.f1752o = null;
        }
    }

    @Override // o.r04
    public final int H(rg4 rg4Var, zn4 zn4Var, int i) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        return ((p04) ds4Var).a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, ho4.m, io4.m, (byte) 1), t61.b(0, 0, 0, i, 7)).b();
    }

    @Override // o.t52
    public final void K() {
        yo1.H(this);
    }

    @Override // o.ln5
    public final void M() {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        ((qn5) ds4Var).e.getClass();
    }

    @Override // o.es4
    public final void M0() {
        U0(true);
    }

    @Override // o.es4
    public final void N0() {
        V0();
    }

    public final void U0(boolean z) {
        if (!this.z) {
            ki3.c("initializeModifier called on unattached node");
        }
        ds4 ds4Var = this.A;
        if ((this.f737o & 32) != 0 && (ds4Var instanceof js4)) {
            js4 js4Var = (js4) ds4Var;
            ax5 ax5Var = im1.a;
            l20 l20Var = this.B;
            if (l20Var == null || !l20Var.o(ax5Var)) {
                l20 l20Var2 = new l20();
                l20Var2.d = js4Var;
                this.B = l20Var2;
                kn7 kn7Var = (kn7) vn4.p0(this).S.f;
                kn7Var.getClass();
                if (kn7Var.A) {
                    hs4 modifierLocalManager = vn4.q0(this).getModifierLocalManager();
                    zw4 zw4Var = modifierLocalManager.b;
                    if (zw4Var == null) {
                        zw4Var = new zw4();
                        modifierLocalManager.b = zw4Var;
                    }
                    zw4Var.a(this);
                    zw4 zw4Var2 = modifierLocalManager.c;
                    if (zw4Var2 == null) {
                        zw4Var2 = new zw4();
                        modifierLocalManager.c = zw4Var2;
                    }
                    zw4Var2.a(ax5Var);
                    modifierLocalManager.a();
                }
            } else {
                l20Var.d = js4Var;
                hs4 modifierLocalManager2 = vn4.q0(this).getModifierLocalManager();
                zw4 zw4Var3 = modifierLocalManager2.b;
                if (zw4Var3 == null) {
                    zw4Var3 = new zw4();
                    modifierLocalManager2.b = zw4Var3;
                }
                zw4Var3.a(this);
                zw4 zw4Var4 = modifierLocalManager2.c;
                if (zw4Var4 == null) {
                    zw4Var4 = new zw4();
                    modifierLocalManager2.c = zw4Var4;
                }
                zw4Var4.a(ax5Var);
                modifierLocalManager2.a();
            }
        }
        if ((this.f737o & 4) != 0 && !z) {
            vn4.n0(this, 2).i1();
        }
        if ((this.f737o & 2) != 0) {
            kn7 kn7Var2 = (kn7) vn4.p0(this).S.f;
            kn7Var2.getClass();
            if (kn7Var2.A) {
                e45 e45Var = this.t;
                e45Var.getClass();
                ((u04) e45Var).E1(this);
                nc5 nc5Var = e45Var.h0;
                if (nc5Var != null) {
                    ((o03) nc5Var).c();
                }
            }
            if (!z) {
                vn4.n0(this, 2).i1();
                vn4.p0(this).S();
            }
        }
        if (ds4Var instanceof s44) {
            ((s44) ds4Var).b.l = vn4.p0(this);
        }
        int i = this.f737o;
        if ((i & 16) != 0 && (ds4Var instanceof qn5)) {
            ((qn5) ds4Var).e.m = this.t;
        }
        if ((i & 8) != 0) {
            ((AndroidComposeView) vn4.q0(this)).y();
        }
    }

    @Override // o.is4
    public final lq1 V() {
        l20 l20Var = this.B;
        return l20Var != null ? l20Var : ga2.d;
    }

    public final void V0() {
        if (!this.z) {
            ki3.c("unInitializeModifier called on unattached node");
        }
        ds4 ds4Var = this.A;
        if ((this.f737o & 32) != 0 && (ds4Var instanceof js4)) {
            hs4 modifierLocalManager = vn4.q0(this).getModifierLocalManager();
            ax5 ax5Var = im1.a;
            zw4 zw4Var = modifierLocalManager.d;
            if (zw4Var == null) {
                zw4Var = new zw4();
                modifierLocalManager.d = zw4Var;
            }
            zw4Var.a(vn4.p0(this));
            zw4 zw4Var2 = modifierLocalManager.e;
            if (zw4Var2 == null) {
                zw4Var2 = new zw4();
                modifierLocalManager.e = zw4Var2;
            }
            zw4Var2.a(ax5Var);
            modifierLocalManager.a();
        }
        if ((this.f737o & 8) != 0) {
            ((AndroidComposeView) vn4.q0(this)).y();
        }
    }

    public final void W0() {
        if (this.z) {
            this.C.clear();
            pc5 snapshotObserver = vn4.q0(this).getSnapshotObserver();
            snapshotObserver.a.f(this, kh.b, new y(this, (byte) 11));
        }
    }

    @Override // o.g04
    public final void Y(i04 i04Var) {
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        return ((p04) ds4Var).a(fo4Var, zn4Var, j);
    }

    @Override // o.r04
    public final int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        return ((p04) ds4Var).a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, ho4.n, io4.m, (byte) 1), t61.b(0, 0, 0, i, 7)).b();
    }

    @Override // o.g04, o.go4
    public final void b(long j) {
    }

    @Override // o.um1, o.ln5
    public final void c() {
        if (this.A instanceof qn5) {
            E();
        }
    }

    @Override // o.sf0
    public final long d() {
        return xs1.a0(vn4.n0(this, 128).f1179o);
    }

    @Override // o.r04
    public final int g(rg4 rg4Var, zn4 zn4Var, int i) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        return ((p04) ds4Var).a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, ho4.n, io4.n, (byte) 1), t61.b(0, i, 0, 0, 13)).a();
    }

    @Override // o.sf0
    public final in1 getDensity() {
        return vn4.p0(this).L;
    }

    @Override // o.sf0
    public final j04 getLayoutDirection() {
        return vn4.p0(this).M;
    }

    @Override // o.t52
    public final void j(d14 d14Var) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        d14Var.a();
    }

    @Override // o.eg5
    public final Object l(in1 in1Var, Object obj) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        return ((dg5) ds4Var).d();
    }

    @Override // o.r04
    public final int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        return ((p04) ds4Var).a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, ho4.m, io4.n, (byte) 1), t61.b(0, i, 0, 0, 13)).a();
    }

    @Override // o.oc5
    public final boolean s() {
        return this.z;
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // o.ln5
    public final boolean u0() {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        ((qn5) ds4Var).e.getClass();
        return true;
    }

    @Override // o.qq2
    public final void v0(mq2 mq2Var) {
        ds4 ds4Var = this.A;
        ki3.c("applyFocusProperties called on wrong node");
        ds4Var.getClass();
        throw new ClassCastException();
    }

    @Override // o.gz2
    public final void x0(e45 e45Var) {
        this.A.getClass();
        throw new ClassCastException();
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
        ds4 ds4Var = this.A;
        ds4Var.getClass();
        ap6 ap6VarG = ((bp6) ds4Var).g();
        op6Var.getClass();
        ap6 ap6Var = (ap6) op6Var;
        jx4 jx4Var = ap6Var.m;
        if (ap6VarG.f346o) {
            ap6Var.f346o = true;
        }
        if (ap6VarG.p) {
            ap6Var.p = true;
        }
        jx4 jx4Var2 = ap6VarG.m;
        Object[] objArr = jx4Var2.b;
        Object[] objArr2 = jx4Var2.c;
        long[] jArr = jx4Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        np6 np6Var = (np6) obj;
                        if (!jx4Var.b(np6Var)) {
                            jx4Var.m(np6Var, obj2);
                        } else if (obj2 instanceof m3) {
                            Object objG = jx4Var.g(np6Var);
                            objG.getClass();
                            m3 m3Var = (m3) objG;
                            String str = m3Var.a;
                            if (str == null) {
                                str = ((m3) obj2).a;
                            }
                            pw2 pw2Var = m3Var.b;
                            if (pw2Var == null) {
                                pw2Var = ((m3) obj2).b;
                            }
                            jx4Var.m(np6Var, new m3(str, pw2Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
