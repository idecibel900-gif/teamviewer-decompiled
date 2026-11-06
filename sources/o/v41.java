package o;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class v41 implements s41 {
    public final ko5 m;
    public final ko5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ThreadLocal f2275o;
    public final AtomicBoolean p;
    public final long q;

    public v41(final cj3 cj3Var, final String str, int i) {
        str.getClass();
        this.f2275o = new ThreadLocal();
        final byte b = 0;
        this.p = new AtomicBoolean(false);
        aw awVar = c72.n;
        this.q = lq1.K(30, g72.SECONDS);
        if (i <= 0) {
            hk0.g("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.m = new ko5(i, new Function0() { // from class: o.t41
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b2 = b;
                String str2 = str;
                cj3 cj3Var2 = cj3Var;
                switch (b2) {
                    case 0:
                        pg6 pg6VarK = cj3Var2.k(str2);
                        us1.y(pg6VarK, "PRAGMA query_only = 1");
                        return pg6VarK;
                    default:
                        return cj3Var2.k(str2);
                }
            }
        });
        final byte b2 = 1;
        this.n = new ko5(1, new Function0() { // from class: o.t41
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                String str2 = str;
                cj3 cj3Var2 = cj3Var;
                switch (b3) {
                    case 0:
                        pg6 pg6VarK = cj3Var2.k(str2);
                        us1.y(pg6VarK, "PRAGMA query_only = 1");
                        return pg6VarK;
                    default:
                        return cj3Var2.k(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.p.compareAndSet(false, true)) {
            this.m.b();
            this.n.b();
        }
    }

    public final void e(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.n.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.m.c(sb);
        us1.P(5, sb.toString());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6 A[Catch: all -> 0x01ce, TRY_LEAVE, TryCatch #8 {all -> 0x01ce, blocks: (B:94:0x01b0, B:96:0x01b6, B:98:0x01c0, B:99:0x01c5), top: B:141:0x01b0 }] */
    @Override // o.s41
    public final Object p(boolean z, hw2 hw2Var, jc1 jc1Var) {
        u41 u41Var;
        k76 k76Var;
        Throwable th;
        ko5 ko5Var;
        de1 context;
        k76 k76Var2;
        ko5 ko5Var2;
        k76 k76Var3;
        de1 de1Var;
        v41 v41Var;
        boolean z2;
        k76 k76Var4;
        v41 v41Var2;
        k76 k76Var5;
        to5 to5Var;
        to5 to5Var2;
        v41 v41Var3 = this;
        boolean z3 = z;
        hw2 hw2Var2 = hw2Var;
        if (jc1Var instanceof u41) {
            u41Var = (u41) jc1Var;
            int i = u41Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                u41Var.v = i - Integer.MIN_VALUE;
            } else {
                u41Var = new u41(v41Var3, jc1Var);
            }
        } else {
            u41Var = new u41(v41Var3, jc1Var);
        }
        Object objJ0 = u41Var.t;
        int i2 = u41Var.v;
        hc1 hc1Var = null;
        ne1 ne1Var = ne1.m;
        try {
            if (i2 == 0) {
                ct1.a0(objJ0);
                if (v41Var3.p.get()) {
                    us1.P(21, "Connection pool is closed");
                    throw null;
                }
                ThreadLocal threadLocal = v41Var3.f2275o;
                to5 to5Var3 = (to5) threadLocal.get();
                ir irVar = g41.n;
                if (to5Var3 == null) {
                    g41 g41Var = (g41) u41Var.getContext().l0(irVar);
                    to5Var3 = g41Var != null ? g41Var.m : null;
                }
                if (to5Var3 == null) {
                    ko5 ko5Var3 = z3 ? v41Var3.m : v41Var3.n;
                    k76Var = new k76();
                    try {
                        context = u41Var.getContext();
                        k76Var2 = new k76();
                        try {
                            long j = v41Var3.q;
                            j0 j0Var = new j0(k76Var2, ko5Var3, hc1Var, (byte) 16);
                            u41Var.m = v41Var3;
                            u41Var.n = (Serializable) hw2Var2;
                            u41Var.f2168o = ko5Var3;
                            u41Var.p = k76Var;
                            u41Var.q = context;
                            u41Var.r = k76Var2;
                            u41Var.s = z3;
                            u41Var.v = 3;
                            long jG0 = im3.g0(j);
                            if (jG0 <= 0) {
                                throw new pv7("Timed out immediately", null);
                            }
                            if (g77.r(new qv7(jG0, u41Var), j0Var) != ne1Var) {
                                ko5Var2 = ko5Var3;
                                k76Var3 = k76Var;
                                de1Var = context;
                                v41Var = v41Var3;
                                z2 = z3;
                                k76Var4 = k76Var2;
                                k76Var2 = k76Var4;
                                z3 = z2;
                                k76Var5 = k76Var3;
                                v41Var2 = v41Var;
                                context = de1Var;
                                th = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ko5Var2 = ko5Var3;
                            k76Var3 = k76Var;
                            k76 k76Var6 = k76Var3;
                            v41Var2 = v41Var3;
                            k76Var5 = k76Var6;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ko5Var = ko5Var3;
                        throw th;
                    }
                } else {
                    if (!z3 && to5Var3.b) {
                        us1.P(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (u41Var.getContext().l0(irVar) == null) {
                        de1 de1VarG = xk0.G(new g41(to5Var3), new cu7(to5Var3, threadLocal));
                        h0 h0Var = new h0((Object) hw2Var2, (Object) to5Var3, hc1Var, (byte) 24);
                        u41Var.v = 1;
                        Object objJ1 = im3.j0(de1VarG, h0Var, u41Var);
                        if (objJ1 != ne1Var) {
                            return objJ1;
                        }
                    } else {
                        u41Var.v = 2;
                        Object objInvoke = hw2Var2.invoke(to5Var3, u41Var);
                        if (objInvoke != ne1Var) {
                            return objInvoke;
                        }
                    }
                }
                return ne1Var;
            }
            if (i2 == 1) {
                ct1.a0(objJ0);
                return objJ0;
            }
            if (i2 == 2) {
                ct1.a0(objJ0);
                return objJ0;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k76Var5 = (k76) u41Var.n;
                ko5Var = (ko5) u41Var.m;
                try {
                    ct1.a0(objJ0);
                    try {
                        to5Var2 = (to5) k76Var5.m;
                        if (to5Var2 != null) {
                            if (to5Var2.d.compareAndSet(false, true)) {
                                try {
                                    us1.y(to5Var2.a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused) {
                                }
                            }
                            f51 f51Var = to5Var2.a;
                            f51Var.f770o = null;
                            f51Var.p = null;
                            ko5Var.d(f51Var);
                        }
                    } catch (Throwable unused2) {
                    }
                    return objJ0;
                } catch (Throwable th4) {
                    th = th4;
                    k76Var = k76Var5;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        try {
                            to5 to5Var4 = (to5) k76Var.m;
                            if (to5Var4 == null) {
                                throw th5;
                            }
                            if (to5Var4.d.compareAndSet(false, true)) {
                                try {
                                    us1.y(to5Var4.a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused3) {
                                }
                            }
                            f51 f51Var2 = to5Var4.a;
                            f51Var2.f770o = null;
                            f51Var2.p = null;
                            ko5Var.d(f51Var2);
                            throw th5;
                        } catch (Throwable th6) {
                            ct1.q(th, th6);
                            throw th5;
                        }
                    }
                }
            }
            z2 = u41Var.s;
            k76Var4 = u41Var.r;
            de1 de1Var2 = u41Var.q;
            k76Var3 = u41Var.p;
            ko5Var2 = u41Var.f2168o;
            hw2 hw2Var3 = (hw2) u41Var.n;
            v41Var = (v41) u41Var.m;
            try {
                ct1.a0(objJ0);
                de1Var = de1Var2;
                hw2Var2 = hw2Var3;
                k76Var2 = k76Var4;
                z3 = z2;
                k76Var5 = k76Var3;
                v41Var2 = v41Var;
                context = de1Var;
                th = null;
            } catch (Throwable th7) {
                th = th7;
                k76Var2 = k76Var4;
                z3 = z2;
                v41Var3 = v41Var;
                context = de1Var2;
                hw2Var2 = hw2Var3;
                k76 k76Var7 = k76Var3;
                v41Var2 = v41Var3;
                k76Var5 = k76Var7;
            }
            f51 f51Var3 = (f51) k76Var2.m;
            if (f51Var3 != null) {
                context.getClass();
                f51Var3.f770o = context;
                f51Var3.p = new Throwable();
                to5Var = new to5(f51Var3, v41Var2.m != v41Var2.n && z3);
            } else {
                to5Var = null;
            }
            k76Var5.m = to5Var;
            if (th instanceof pv7) {
                v41Var2.e(z3);
                throw null;
            }
            if (th != null) {
                throw th;
            }
            if (to5Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            v41Var2.getClass();
            de1 de1VarG2 = xk0.G(new g41(to5Var), new cu7(to5Var, v41Var2.f2275o));
            h0 h0Var2 = new h0((Object) hw2Var2, (Object) k76Var5, hc1Var, (byte) 25);
            u41Var.m = ko5Var2;
            u41Var.n = k76Var5;
            u41Var.f2168o = null;
            u41Var.p = null;
            u41Var.q = null;
            u41Var.r = null;
            u41Var.v = 4;
            objJ0 = im3.j0(de1VarG2, h0Var2, u41Var);
            if (objJ0 != ne1Var) {
                ko5Var = ko5Var2;
                to5Var2 = (to5) k76Var5.m;
                if (to5Var2 != null) {
                    if (to5Var2.d.compareAndSet(false, true)) {
                        us1.y(to5Var2.a, "ROLLBACK TRANSACTION");
                    }
                    f51 f51Var4 = to5Var2.a;
                    f51Var4.f770o = null;
                    f51Var4.p = null;
                    ko5Var.d(f51Var4);
                }
                return objJ0;
            }
            return ne1Var;
        } catch (Throwable th8) {
            th = th8;
            k76Var = k76Var5;
            ko5Var = ko5Var2;
            th = th;
            throw th;
        }
    }

    public v41(cj3 cj3Var) {
        this.f2275o = new ThreadLocal();
        this.p = new AtomicBoolean(false);
        aw awVar = c72.n;
        this.q = lq1.K(30, g72.SECONDS);
        ko5 ko5Var = new ko5(1, new zz0(cj3Var, (byte) 2));
        this.m = ko5Var;
        this.n = ko5Var;
    }
}
