package o;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oy2 extends t1 implements Serializable {
    public static my2 g(t1 t1Var, t1 t1Var2, int i, yl8 yl8Var, Class cls) {
        return new my2(t1Var, Collections.EMPTY_LIST, t1Var2, new ly2(i, yl8Var, true), cls);
    }

    public static my2 h(t1 t1Var, Object obj, t1 t1Var2, int i, yl8 yl8Var, Class cls) {
        return new my2(t1Var, obj, t1Var2, new ly2(i, yl8Var, false), cls);
    }
}
