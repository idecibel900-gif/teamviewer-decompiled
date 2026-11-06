package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ed2 extends g07 {
    public final k48 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cd2 f705o;
    public final gd2 p;
    public final List q;
    public final boolean r;
    public final String[] s;
    public final String t;

    public ed2(k48 k48Var, cd2 cd2Var, gd2 gd2Var, List list, boolean z, String... strArr) {
        gd2Var.getClass();
        list.getClass();
        this.n = k48Var;
        this.f705o = cd2Var;
        this.p = gd2Var;
        this.q = list;
        this.r = z;
        this.s = strArr;
        String str = gd2Var.m;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.t = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // o.oz3
    public final zo4 I() {
        return this.f705o;
    }

    @Override // o.oz3
    public final List m0() {
        return this.q;
    }

    @Override // o.oz3
    public final k48 o0() {
        return this.n;
    }

    @Override // o.oz3
    public final boolean p0() {
        return this.r;
    }

    @Override // o.g07, o.m98
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        String[] strArr = this.s;
        return new ed2(this.n, this.f705o, this.p, this.q, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
