package o;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class q82 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, long[]] */
    public q82(fq6 fq6Var, ea1 ea1Var) {
        fq6Var.getClass();
        this.b = fq6Var;
        this.c = ea1Var;
        int iE = fq6Var.e();
        if (iE <= 64) {
            this.a = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iE - 1) >>> 6;
        ?? r3 = new long[i];
        if ((iE & 63) != 0) {
            r3[i - 1] = (-1) << iE;
        }
        this.d = r3;
    }

    public int a(b46 b46Var, long j) {
        TimeZone timeZone = ro8.a;
        ArrayList arrayList = b46Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + b46Var.c.a.h + " was leaked. Did you forget to close a response body?";
                ql5 ql5Var = ql5.a;
                ql5.a.k(((y36) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    b46Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public q82(io7 io7Var) {
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = io7Var.d();
        this.c = new c46(this, e41.l(new StringBuilder(), ro8.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }
}
