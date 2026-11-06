package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class io7 {
    public static final Logger k;
    public static final io7 l;
    public final l07 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final mt8 j;

    static {
        Logger logger = Logger.getLogger(io7.class.getName());
        logger.getClass();
        k = logger;
        l = new io7(new l07(new qo8(e41.l(new StringBuilder(), ro8.b, " TaskRunner"), true)));
    }

    public io7(l07 l07Var) {
        Logger logger = k;
        logger.getClass();
        this.a = l07Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new mt8((Object) this, (byte) 17);
    }

    public final void a(ao7 ao7Var, long j, boolean z) {
        TimeZone timeZone = ro8.a;
        go7 go7Var = ao7Var.c;
        go7Var.getClass();
        if (go7Var.d != ao7Var) {
            hk0.l("Check failed.");
            return;
        }
        boolean z2 = go7Var.f;
        go7Var.f = false;
        go7Var.d = null;
        this.h.remove(go7Var);
        if (j != -1 && !z2 && !go7Var.c) {
            go7Var.d(ao7Var, j, true);
        }
        if (go7Var.e.isEmpty()) {
            return;
        }
        this.i.add(go7Var);
        if (z) {
            return;
        }
        e();
    }

    public final ao7 b() {
        boolean z;
        TimeZone timeZone = ro8.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            ao7 ao7Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ao7 ao7Var2 = (ao7) ((go7) it.next()).e.get(0);
                long jMax = Math.max(0L, ao7Var2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (ao7Var != null) {
                        z = true;
                        break;
                    }
                    ao7Var = ao7Var2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (ao7Var != null) {
                TimeZone timeZone2 = ro8.a;
                ao7Var.d = -1L;
                go7 go7Var = ao7Var.c;
                go7Var.getClass();
                go7Var.e.remove(ao7Var);
                arrayList.remove(go7Var);
                go7Var.d = ao7Var;
                arrayList2.add(go7Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return ao7Var;
            }
            if (this.d) {
                if (jMin >= this.e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.d = true;
            this.e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = ro8.a;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = ro8.a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((go7) arrayList2.get(size)).a();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        go7 go7Var2 = (go7) arrayList.get(size2);
                        go7Var2.a();
                        if (go7Var2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.d = false;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
        return null;
    }

    public final void c(go7 go7Var) {
        go7Var.getClass();
        TimeZone timeZone = ro8.a;
        if (go7Var.d == null) {
            boolean zIsEmpty = go7Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(go7Var);
            } else {
                byte[] bArr = po8.a;
                if (!arrayList.contains(go7Var)) {
                    arrayList.add(go7Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final go7 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new go7(this, fx3.e(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = ro8.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        ((ThreadPoolExecutor) this.a.n).execute(this.j);
    }
}
