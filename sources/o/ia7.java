package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ia7 implements nb0 {
    public final Function0 b;
    public final nb0 c;

    public ia7(Function0 function0, j04 j04Var, nb0 nb0Var) {
        this.b = function0;
        this.c = nb0Var;
    }

    @Override // o.nb0
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.b.a()).intValue();
        return this.c.a(f - fIntValue, f2, f3 - fIntValue);
    }
}
