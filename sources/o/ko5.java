package o;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ko5 {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final f51[] f;
    public final tp6 g;
    public final rr0 h;

    public ko5(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.f = new f51[i];
        int i2 = up6.a;
        this.g = new tp6(i);
        rr0 rr0Var = new rr0((byte) 0);
        if (i < 1) {
            hk0.g("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            hk0.g("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        rr0Var.d = i - 1;
        rr0Var.e = new Object[i];
        this.h = rr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(jc1 jc1Var) {
        jo5 jo5Var;
        if (jc1Var instanceof jo5) {
            jo5Var = (jo5) jc1Var;
            int i = jo5Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                jo5Var.p = i - Integer.MIN_VALUE;
            } else {
                jo5Var = new jo5(this, jc1Var);
            }
        } else {
            jo5Var = new jo5(this, jc1Var);
        }
        Object obj = jo5Var.n;
        int i2 = jo5Var.p;
        if (i2 == 0) {
            ct1.a0(obj);
            jo5Var.m = this;
            jo5Var.p = 1;
            Object objA = this.g.a(jo5Var);
            ne1 ne1Var = ne1.m;
            if (objA == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = jo5Var.m;
            ct1.a0(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            rr0 rr0Var = this.h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    us1.P(21, "Connection pool is closed");
                    throw null;
                }
                if (rr0Var.b == rr0Var.c && this.d < this.a) {
                    f51 f51Var = new f51((pg6) this.b.a());
                    f51[] f51VarArr = this.f;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    f51VarArr[i3] = f51Var;
                    rr0Var.b(f51Var);
                }
                int i4 = rr0Var.b;
                if (i4 == rr0Var.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) rr0Var.e;
                Object obj2 = objArr[i4];
                objArr[i4] = null;
                rr0Var.b = (i4 + 1) & rr0Var.d;
                f51 f51Var2 = (f51) obj2;
                reentrantLock.unlock();
                return f51Var2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.g.c();
            throw th2;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (f51 f51Var : this.f) {
                if (f51Var != null) {
                    f51Var.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(StringBuilder sb) {
        rr0 rr0Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            sa4 sa4VarT = qf0.t();
            int i = (rr0Var.c - rr0Var.b) & rr0Var.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = rr0Var.c;
                    int i4 = rr0Var.b;
                    int i5 = rr0Var.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) rr0Var.e)[(i4 + i2) & i5];
                        obj.getClass();
                        sa4VarT.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            sa4 sa4VarR = qf0.r(sa4VarT);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(defpackage.a.a.getIntVolatile(this.g, sp6.r), 0) + ", ");
            sb.append("queue=(size=" + sa4VarR.a() + ")[" + lv0.t0(sa4VarR, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            f51[] f51VarArr = this.f;
            int length = f51VarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                f51 f51Var = f51VarArr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(f51Var != null ? f51Var.m.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (f51Var != null) {
                    f51Var.q(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(f51 f51Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.b(f51Var);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
