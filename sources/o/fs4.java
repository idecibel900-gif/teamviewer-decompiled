package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface fs4 {
    boolean b(Function1 function1);

    Object c(Object obj, hw2 hw2Var);

    default fs4 f(fs4 fs4Var) {
        return fs4Var == cs4.b ? this : new uw0(this, fs4Var);
    }
}
