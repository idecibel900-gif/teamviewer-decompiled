package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface ds4 extends fs4 {
    @Override // o.fs4
    default boolean b(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // o.fs4
    default Object c(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }
}
