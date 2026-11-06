package o;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public enum g72 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    public final TimeUnit m;

    g72(TimeUnit timeUnit) {
        this.m = timeUnit;
    }
}
