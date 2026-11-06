package o;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kr8 {
    public final b77 a;
    public boolean b;
    public long c;
    public long d;

    public kr8(b77 b77Var) {
        if (b77Var != null) {
            this.a = b77Var;
        } else {
            yq4.l("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            hk0.l("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.q();
        }
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jQ = this.b ? (this.a.q() - this.d) + this.c : this.c;
        long j = jQ / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jQ / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jQ / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jQ / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jQ / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jQ / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jQ / timeUnit2.convert(1L, timeUnit)));
        switch (jr8.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return fx3.g(str2, " ", str);
    }
}
