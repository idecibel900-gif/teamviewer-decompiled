package o;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class yk6 {
    public tk6 a;
    public li b;
    public ym2 c;
    public gb5 d;
    public boolean e;
    public x15 f;
    public final sk6 g;
    public final rk6 h;
    public boolean i;
    public byte j = 1;
    public dk6 k = ok6.a;
    public final wk6 l = new wk6(this);
    public final y46 m = new y46((Object) this, (byte) 9);

    public yk6(tk6 tk6Var, li liVar, ym2 ym2Var, gb5 gb5Var, boolean z, x15 x15Var, sk6 sk6Var, rk6 rk6Var) {
        this.a = tk6Var;
        this.b = liVar;
        this.c = ym2Var;
        this.d = gb5Var;
        this.e = z;
        this.f = x15Var;
        this.g = sk6Var;
        this.h = rk6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, jc1 jc1Var) throws Throwable {
        uk6 uk6Var;
        yk6 yk6Var;
        Throwable th;
        j76 j76Var;
        if (jc1Var instanceof uk6) {
            uk6Var = (uk6) jc1Var;
            int i = uk6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk6Var.p = i - Integer.MIN_VALUE;
            } else {
                uk6Var = new uk6(this, jc1Var);
            }
        } else {
            uk6Var = new uk6(this, jc1Var);
        }
        Object obj = uk6Var.n;
        int i2 = uk6Var.p;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j76Var = uk6Var.m;
            try {
                ct1.a0(obj);
                yk6Var = this;
                yk6Var.i = false;
                return new nc8(j76Var.m);
            } catch (Throwable th2) {
                th = th2;
                yk6Var = this;
                yk6Var.i = false;
                throw th;
            }
        }
        ct1.a0(obj);
        j76 j76Var2 = new j76();
        j76Var2.m = j;
        this.i = true;
        try {
            ay4 ay4Var = ay4.m;
            yk6Var = this;
            try {
                vk6 vk6Var = new vk6(yk6Var, j76Var2, j, null);
                uk6Var.m = j76Var2;
                uk6Var.p = 1;
                Object objG = yk6Var.g(ay4Var, vk6Var, uk6Var);
                ne1 ne1Var = ne1.m;
                if (objG == ne1Var) {
                    return ne1Var;
                }
                j76Var = j76Var2;
                yk6Var.i = false;
                return new nc8(j76Var.m);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                yk6Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            yk6Var = this;
        }
    }

    public final boolean b() {
        li liVar;
        return this.a.c() || this.a.b() || ((liVar = this.b) != null && liVar.e());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final Object c(long j, boolean z, og7 og7Var) {
        int i;
        long jA;
        li liVar;
        ne1 ne1Var;
        Object objInvokeSuspend;
        f88 f88Var = f88.a;
        if (z) {
            ym2 ym2Var = this.c;
            lk6 lk6Var = ok6.a;
            if (!(ym2Var instanceof zj1)) {
                if (this.d == gb5.n) {
                    i = 1;
                } else {
                    i = 2;
                }
                jA = nc8.a(j, 0.0f, 0.0f, i);
                xk6 xk6Var = new xk6(this, null);
                liVar = this.b;
                ne1Var = ne1.m;
                if (liVar == null && b()) {
                    Object objB = liVar.b(jA, xk6Var, og7Var);
                    if (objB == ne1Var) {
                        return objB;
                    }
                } else {
                    xk6 xk6Var2 = new xk6(this, og7Var);
                    xk6Var2.f2527o = jA;
                    objInvokeSuspend = xk6Var2.invokeSuspend(f88Var);
                    if (objInvokeSuspend == ne1Var) {
                        return objInvokeSuspend;
                    }
                }
            }
        } else {
            if (this.d == gb5.n) {
                i = 1;
            } else {
                i = 2;
            }
            jA = nc8.a(j, 0.0f, 0.0f, i);
            xk6 xk6Var3 = new xk6(this, null);
            liVar = this.b;
            ne1Var = ne1.m;
            if (liVar == null) {
                xk6 xk6Var4 = new xk6(this, og7Var);
                xk6Var4.f2527o = jA;
                objInvokeSuspend = xk6Var4.invokeSuspend(f88Var);
                if (objInvokeSuspend == ne1Var) {
                    return objInvokeSuspend;
                }
            } else {
                xk6 xk6Var5 = new xk6(this, og7Var);
                xk6Var5.f2527o = jA;
                objInvokeSuspend = xk6Var5.invokeSuspend(f88Var);
                if (objInvokeSuspend == ne1Var) {
                    return objInvokeSuspend;
                }
            }
        }
        return f88Var;
    }

    public final long d(dk6 dk6Var, long j, int i) {
        b25 b25Var = this.f.a;
        b25 b25VarV0 = b25Var != null ? b25Var.V0() : null;
        long J = b25VarV0 != null ? b25VarV0.J(i, j) : 0L;
        long jD = t65.d(j, J);
        long jF = f(i(dk6Var.a(h(f(this.d == gb5.n ? t65.a(0.0f, 1, jD) : t65.a(0.0f, 2, jD))))));
        sk6 sk6Var = this.g;
        if (sk6Var.z) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) vn4.q0(sk6Var)).getViewTreeObserver();
            try {
                Method declaredMethod = AndroidComposeView.Z0;
                if (declaredMethod == null) {
                    declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.Z0 = declaredMethod;
                }
                declaredMethod.invoke(viewTreeObserver, null);
            } catch (Exception unused) {
            }
        }
        long jD2 = t65.d(jD, jF);
        b25 b25Var2 = this.f.a;
        b25 b25VarV1 = b25Var2 != null ? b25Var2.V0() : null;
        return t65.e(t65.e(J, jF), b25VarV1 != null ? b25VarV1.p0(i, jF, jD2) : 0L);
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? t65.f(-1.0f, j) : j;
    }

    public final Object g(ay4 ay4Var, hw2 hw2Var, jc1 jc1Var) {
        Object objE = this.a.e(ay4Var, new ko2(this, hw2Var, null, (byte) 18), jc1Var);
        return objE == ne1.m ? objE : f88.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == gb5.n ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == gb5.n) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        gb5 gb5Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (gb5Var == gb5.m) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (gb5Var == gb5.n) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
