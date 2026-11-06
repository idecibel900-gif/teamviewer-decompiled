package o;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class kq0 {
    public final sy4 a;
    public final e96 b;
    public final Collection c;
    public final Function1 d;
    public final zp0[] e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kq0(sy4 sy4Var, zp0[] zp0VarArr, Function1 function1) {
        this(sy4Var, null, null, function1, (zp0[]) Arrays.copyOf(zp0VarArr, zp0VarArr.length));
        sy4Var.getClass();
    }

    public /* synthetic */ kq0(sy4 sy4Var, zp0[] zp0VarArr) {
        this(sy4Var, zp0VarArr, ek.u);
    }

    public kq0(sy4 sy4Var, e96 e96Var, Collection collection, Function1 function1, zp0... zp0VarArr) {
        this.a = sy4Var;
        this.b = e96Var;
        this.c = collection;
        this.d = function1;
        this.e = zp0VarArr;
    }

    public /* synthetic */ kq0(Collection collection, zp0[] zp0VarArr) {
        this(collection, zp0VarArr, ek.w);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kq0(Collection collection, zp0[] zp0VarArr, Function1 function1) {
        this(null, null, collection, function1, (zp0[]) Arrays.copyOf(zp0VarArr, zp0VarArr.length));
        collection.getClass();
    }
}
