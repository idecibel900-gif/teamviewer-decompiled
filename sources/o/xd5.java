package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xd5 implements h84 {
    public final vm4 a;
    public final List b;

    public xd5(vm4 vm4Var, List list) {
        this.a = vm4Var;
        this.b = list;
        if (list.isEmpty()) {
            hk0.g("LicensePalette must not be empty");
            throw null;
        }
    }

    @Override // o.h84
    public final rv0 a(String str) {
        if (str == null || ub7.b0(str)) {
            return null;
        }
        rv0 rv0VarA = this.a.a(str);
        if (rv0VarA != null) {
            return rv0VarA;
        }
        int iAbs = Math.abs(str.hashCode());
        List list = this.b;
        return (rv0) list.get(iAbs % list.size());
    }
}
