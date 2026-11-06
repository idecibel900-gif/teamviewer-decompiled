package io.sentry.android.core;

import io.sentry.l5;
import io.sentry.o6;
import io.sentry.r3;
import io.sentry.t3;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes.dex */
public final class u2 implements io.sentry.android.core.internal.util.s, io.sentry.i1 {
    public static final o6 h = new o6(0, 0);
    public final boolean a;
    public final io.sentry.android.core.internal.util.t c;
    public volatile String d;
    public final io.sentry.util.a b = new io.sentry.util.a();
    public final TreeSet e = new TreeSet(new s2((byte) 0));
    public final ConcurrentSkipListSet f = new ConcurrentSkipListSet();
    public long g = 16666666;

    public u2(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.t tVar) {
        boolean z = false;
        this.c = tVar;
        if (sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking()) {
            z = true;
        }
        this.a = z;
    }

    public static long g(l5 l5Var) {
        if (l5Var instanceof o6) {
            return l5Var.b(h);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - l5Var.d());
    }

    @Override // io.sentry.android.core.internal.util.s
    public final void b(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (1.0E9d / ((double) f));
        this.g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new t2(j, j2, j3, j4, z, z2, j5));
        }
    }

    public final void d() {
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            if (this.d != null) {
                this.c.b(this.d);
                this.d = null;
            }
            this.f.clear();
            this.e.clear();
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    public final void e(io.sentry.v1 v1Var) throws Throwable {
        io.sentry.util.a aVar;
        l5 l5VarW;
        ConcurrentSkipListSet concurrentSkipListSet;
        TreeSet treeSet;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long jLongValue;
        ConcurrentSkipListSet concurrentSkipListSet2;
        ConcurrentSkipListSet concurrentSkipListSet3 = this.f;
        io.sentry.util.a aVar2 = this.b;
        TreeSet treeSet2 = this.e;
        if (!this.a || (v1Var instanceof r3) || (v1Var instanceof t3)) {
            return;
        }
        aVar2.e();
        try {
            if (!treeSet2.contains(v1Var)) {
                aVar2.close();
                return;
            }
            aVar2.close();
            aVar2.e();
            try {
                if (treeSet2.remove(v1Var) && (l5VarW = v1Var.w()) != null) {
                    long jG = g(v1Var.z());
                    long jG2 = g(l5VarW);
                    long j4 = jG2 - jG;
                    if (j4 <= 0) {
                        aVar2.close();
                        concurrentSkipListSet = concurrentSkipListSet3;
                        aVar = aVar2;
                        treeSet = treeSet2;
                    } else {
                        long j5 = this.g;
                        int i3 = 1;
                        if (concurrentSkipListSet3.isEmpty()) {
                            concurrentSkipListSet = concurrentSkipListSet3;
                            aVar = aVar2;
                            treeSet = treeSet2;
                            i = 0;
                            i2 = 0;
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                        } else {
                            Iterator it = concurrentSkipListSet3.tailSet(new t2(jG)).iterator();
                            j = 0;
                            j2 = 0;
                            j3 = 0;
                            i = 0;
                            i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    aVar = aVar2;
                                    treeSet = treeSet2;
                                    break;
                                }
                                t2 t2Var = (t2) it.next();
                                aVar = aVar2;
                                treeSet = treeSet2;
                                try {
                                    long j6 = t2Var.m;
                                    long j7 = t2Var.p;
                                    long j8 = t2Var.s;
                                    long j9 = t2Var.n;
                                    if (j6 > jG2) {
                                        break;
                                    }
                                    if (j6 < jG || j9 > jG2) {
                                        if ((jG > j6 && jG < j9) || (jG2 > j6 && jG2 < j9)) {
                                            concurrentSkipListSet2 = concurrentSkipListSet3;
                                            long jMin = Math.min(j7 - Math.max(0L, Math.max(0L, jG - j6) - j8), j4);
                                            long jMin2 = Math.min(jG2, j9) - Math.max(jG, t2Var.m);
                                            boolean z = jMin2 > j8;
                                            j3 += jMin2;
                                            if (jMin2 > 700000000) {
                                                j2 += jMin;
                                                i2++;
                                            } else if (z) {
                                                j += jMin;
                                                i++;
                                            }
                                        }
                                        aVar2 = aVar;
                                        treeSet2 = treeSet;
                                        concurrentSkipListSet3 = concurrentSkipListSet2;
                                        j5 = j8;
                                    } else {
                                        long j10 = t2Var.f126o;
                                        boolean z2 = t2Var.q;
                                        j3 += j10;
                                        if (t2Var.r) {
                                            j2 += j7;
                                            i2++;
                                        } else if (z2) {
                                            j += j7;
                                            i++;
                                        }
                                    }
                                    concurrentSkipListSet2 = concurrentSkipListSet3;
                                    aVar2 = aVar;
                                    treeSet2 = treeSet;
                                    concurrentSkipListSet3 = concurrentSkipListSet2;
                                    j5 = j8;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        aVar.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            concurrentSkipListSet = concurrentSkipListSet3;
                        }
                        int iCeil = i + i2;
                        io.sentry.android.core.internal.util.t tVar = this.c;
                        if (tVar.w == null || tVar.x == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l = (Long) tVar.x.get(tVar.w);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jG2 - jLongValue);
                            if (jMax > j5) {
                                boolean z3 = jMax > 700000000;
                                long jMax2 = Math.max(0L, jMax - j5);
                                j3 += jMax;
                                if (z3) {
                                    j2 += jMax2;
                                    i2++;
                                } else {
                                    j += jMax2;
                                    i++;
                                }
                            } else {
                                i3 = 0;
                            }
                            long j11 = j4 - j3;
                            iCeil = iCeil + i3 + (j11 > 0 ? (int) Math.ceil(j11 / j5) : 0);
                        }
                        double d = (j + j2) / 1.0E9d;
                        v1Var.m(Integer.valueOf(iCeil), "frames.total");
                        v1Var.m(Integer.valueOf(i), "frames.slow");
                        v1Var.m(Integer.valueOf(i2), "frames.frozen");
                        v1Var.m(Double.valueOf(d), "frames.delay");
                        if (v1Var instanceof io.sentry.x1) {
                            v1Var.f(Integer.valueOf(iCeil), "frames_total");
                            v1Var.f(Integer.valueOf(i), "frames_slow");
                            v1Var.f(Integer.valueOf(i2), "frames_frozen");
                            v1Var.f(Double.valueOf(d), "frames_delay");
                        }
                        aVar.close();
                    }
                } else {
                    aVar2.close();
                    concurrentSkipListSet = concurrentSkipListSet3;
                    aVar = aVar2;
                    treeSet = treeSet2;
                }
                aVar.e();
                try {
                    if (treeSet.isEmpty()) {
                        d();
                    } else {
                        concurrentSkipListSet.headSet(new t2(g(((io.sentry.v1) treeSet.first()).z()))).clear();
                    }
                    aVar.close();
                } catch (Throwable th4) {
                    try {
                        aVar.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                aVar = aVar2;
            }
        } catch (Throwable th7) {
            try {
                aVar2.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    public final void f(io.sentry.v1 v1Var) {
        if (!this.a || (v1Var instanceof r3) || (v1Var instanceof t3)) {
            return;
        }
        io.sentry.util.a aVar = this.b;
        aVar.e();
        try {
            this.e.add(v1Var);
            if (this.d == null) {
                this.d = this.c.a(this);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
