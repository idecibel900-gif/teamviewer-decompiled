package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rt8 {
    public static final rt8 b;
    public static final rt8 c;
    public final Throwable a;

    static {
        if (rx8.p) {
            c = null;
            b = null;
        } else {
            c = new rt8(null);
            b = new rt8(null);
        }
    }

    public rt8(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
