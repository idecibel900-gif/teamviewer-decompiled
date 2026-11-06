package o;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o03 implements nc5 {
    public vs1 B;
    public boolean C;
    public boolean D;
    public boolean F;
    public l03 m;
    public final k03 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AndroidComposeView f1617o;
    public hw2 p;
    public Function0 q;
    public boolean s;
    public float[] u;
    public boolean v;
    public int z;
    public long r = 9223372034707292159L;
    public final float[] t = wn4.a();
    public in1 w = mo8.b();
    public j04 x = j04.m;
    public final nl0 y = new nl0();
    public long A = d18.b;
    public boolean E = true;
    public final a81 G = new a81(this, 21);

    public o03(l03 l03Var, k03 k03Var, AndroidComposeView androidComposeView, hw2 hw2Var, Function0 function0) {
        this.m = l03Var;
        this.n = k03Var;
        this.f1617o = androidComposeView;
        this.p = hw2Var;
        this.q = function0;
    }

    public final float[] a() {
        float[] fArrA = this.u;
        if (fArrA == null) {
            fArrA = wn4.a();
            this.u = fArrA;
        }
        if (this.D) {
            this.D = false;
            float[] fArrB = b();
            if (this.E) {
                return fArrB;
            }
            if (!zu1.x(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.C;
        float[] fArr = this.t;
        if (z) {
            l03 l03Var = this.m;
            long jU = l03Var.z;
            n03 n03Var = l03Var.a;
            if ((9223372034707292159L & jU) == 9205357640488583168L) {
                jU = vt1.u(xs1.a0(this.r));
            }
            wn4.e(this.t, Float.intBitsToFloat((int) (jU >> 32)), Float.intBitsToFloat((int) (jU & 4294967295L)), n03Var.A(), n03Var.v(), n03Var.D(), n03Var.n(), n03Var.p(), n03Var.c(), n03Var.L(), 1040);
            this.C = false;
            this.E = ct1.L(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.v || this.s) {
            return;
        }
        this.f1617o.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zL = AndroidComposeView.l();
        AndroidComposeView androidComposeView = this.f1617o;
        if (zL) {
            androidComposeView.M(-4.0f);
        }
        l03 l03Var = this.m;
        if (!vk3.a(l03Var.t, j)) {
            l03Var.t = j;
            l03Var.a.m((int) (j >> 32), (int) (j & 4294967295L), l03Var.u);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public final void e(long j) {
        if (dl3.b(j, this.r)) {
            return;
        }
        if (AndroidComposeView.l()) {
            this.f1617o.M(-4.0f);
        }
        this.r = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.v) {
            this.v = z;
            AndroidComposeView androidComposeView = this.f1617o;
            zw4 zw4Var = androidComposeView.M;
            boolean z2 = androidComposeView.O;
            if (!z) {
                if (z2) {
                    return;
                }
                zw4Var.j(this);
                zw4 zw4Var2 = androidComposeView.N;
                if (zw4Var2 != null) {
                    zw4Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                zw4Var.a(this);
                return;
            }
            zw4 zw4Var3 = androidComposeView.N;
            if (zw4Var3 == null) {
                zw4Var3 = new zw4();
                androidComposeView.N = zw4Var3;
            }
            zw4Var3.a(this);
        }
    }

    public final void g() {
        AndroidComposeView.l();
        if (this.v) {
            if (!d18.a(this.A, d18.b) && !dl3.b(this.m.u, this.r)) {
                l03 l03Var = this.m;
                float fB = d18.b(this.A) * ((int) (this.r >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(d18.c(this.A) * ((int) (this.r & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!t65.b(l03Var.z, jFloatToRawIntBits)) {
                    l03Var.z = jFloatToRawIntBits;
                    l03Var.a.q(jFloatToRawIntBits);
                }
            }
            this.m.e(this.w, this.x, this.r, this.G);
            f(false);
        }
    }
}
