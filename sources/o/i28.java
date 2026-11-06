package o;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i28 implements h28 {
    public final Set a;
    public final u00 b;
    public final j28 c;

    public i28(Set set, u00 u00Var, j28 j28Var) {
        this.a = set;
        this.b = u00Var;
        this.c = j28Var;
    }

    public final yc4 a(String str, ta2 ta2Var, f18 f18Var) {
        Set set = this.a;
        if (set.contains(ta2Var)) {
            return new yc4(this.b, str, ta2Var, f18Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", ta2Var, set));
    }
}
