package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class cp6 {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final fs4 a(fs4 fs4Var, boolean z, Function1 function1) {
        return fs4Var.f(new iv(function1, z));
    }
}
