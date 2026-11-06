package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class go7 {
    public final io7 a;
    public final String b;
    public boolean c;
    public ao7 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public go7(io7 io7Var, String str) {
        this.a = io7Var;
        this.b = str;
    }

    public static void b(go7 go7Var, String str, Function0 function0) {
        go7Var.getClass();
        str.getClass();
        function0.getClass();
        go7Var.c(new c46(str, function0), 0L);
    }

    public final boolean a() {
        ao7 ao7Var = this.d;
        if (ao7Var != null && ao7Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ao7) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                ao7 ao7Var2 = (ao7) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    g57.m(logger, ao7Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(ao7 ao7Var, long j) {
        ao7Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(ao7Var, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = ao7Var.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    g57.m(logger, ao7Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    g57.m(logger, ao7Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[LOOP:0: B:23:0x0062->B:28:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[EDGE_INSN: B:40:0x007a->B:30:0x007a BREAK  A[LOOP:0: B:23:0x0062->B:28:0x0076], SYNTHETIC] */
    public final boolean d(ao7 ao7Var, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        Logger logger = this.a.b;
        ao7Var.getClass();
        go7 go7Var = ao7Var.c;
        if (go7Var != this) {
            if (go7Var != null) {
                hk0.l("task is in multiple queues");
                return false;
            }
            ao7Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(ao7Var);
        if (iIndexOf == -1) {
            ao7Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(g57.j(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(g57.j(j2 - jNanoTime));
                }
                g57.m(logger, ao7Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((ao7) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, ao7Var);
            if (size == 0) {
                return true;
            }
        } else if (ao7Var.d > j2) {
            arrayList.remove(iIndexOf);
            ao7Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(g57.j(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(g57.j(j2 - jNanoTime));
                }
                g57.m(logger, ao7Var, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((ao7) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, ao7Var);
            if (size == 0) {
                return true;
            }
        } else if (logger.isLoggable(Level.FINE)) {
            g57.m(logger, ao7Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        io7 io7Var = this.a;
        TimeZone timeZone = ro8.a;
        synchronized (io7Var) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
