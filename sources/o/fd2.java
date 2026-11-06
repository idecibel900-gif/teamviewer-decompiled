package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fd2 implements k48 {
    public final gd2 a;
    public final String[] b;
    public final String c;

    public fd2(gd2 gd2Var, String... strArr) {
        gd2Var.getClass();
        this.a = gd2Var;
        this.b = strArr;
        String str = gd2Var.m;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // o.k48
    public final ys0 a() {
        hd2.a.getClass();
        return hd2.c;
    }

    @Override // o.k48
    public final Collection b() {
        return ea2.m;
    }

    @Override // o.k48
    public final boolean c() {
        return false;
    }

    @Override // o.k48
    public final List getParameters() {
        return ea2.m;
    }

    @Override // o.k48
    public final wy3 h() {
        return (oj1) oj1.f.getValue();
    }

    public final String toString() {
        return this.c;
    }
}
