package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sq7 {
    public final j64 a;
    public final pr7 b;
    public final zr7 c;
    public final boolean d;
    public final boolean e;
    public final ft7 f;
    public final v65 g;
    public final u78 h;
    public final bi1 i;
    public final Function1 j;
    public final int k;

    public sq7(j64 j64Var, pr7 pr7Var, zr7 zr7Var, boolean z, boolean z2, ft7 ft7Var, v65 v65Var, u78 u78Var, bi1 bi1Var, Function1 function1, int i) {
        this.a = j64Var;
        this.b = pr7Var;
        this.c = zr7Var;
        this.d = z;
        this.e = z2;
        this.f = ft7Var;
        this.g = v65Var;
        this.h = u78Var;
        this.i = bi1Var;
        this.j = function1;
        this.k = i;
    }

    public final void a(List list) {
        wk0 wk0Var = this.a.d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new ql2());
        this.j.invoke(wk0Var.j(arrayList));
    }
}
