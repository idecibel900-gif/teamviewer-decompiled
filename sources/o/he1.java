package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class he1 {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new ni()).iterator();
            it.getClass();
            a = bq6.l0(new v51(new fx(it, (byte) 4)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
