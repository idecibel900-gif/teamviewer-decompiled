package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class mm0 implements zo4 {
    public final String b;
    public final zo4[] c;

    public mm0(String str, zo4[] zo4VarArr) {
        this.b = str;
        this.c = zo4VarArr;
    }

    @Override // o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        zo4[] zo4VarArr = this.c;
        int length = zo4VarArr.length;
        if (length == 0) {
            return ea2.m;
        }
        if (length == 1) {
            return zo4VarArr[0].a(sy4Var, t35Var);
        }
        Collection collectionW = null;
        for (zo4 zo4Var : zo4VarArr) {
            collectionW = yo1.w(collectionW, zo4Var.a(sy4Var, t35Var));
        }
        return collectionW == null ? la2.m : collectionW;
    }

    @Override // o.zo4
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zo4 zo4Var : this.c) {
            qv0.c0(linkedHashSet, zo4Var.b());
        }
        return linkedHashSet;
    }

    @Override // o.zo4
    public final Set c() {
        zo4[] zo4VarArr = this.c;
        zo4VarArr.getClass();
        return zu1.t(zo4VarArr.length == 0 ? ea2.m : new ex(zo4VarArr, (byte) 0));
    }

    @Override // o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        zo4[] zo4VarArr = this.c;
        int length = zo4VarArr.length;
        if (length == 0) {
            return ea2.m;
        }
        if (length == 1) {
            return zo4VarArr[0].d(sy4Var, t35Var);
        }
        Collection collectionW = null;
        for (zo4 zo4Var : zo4VarArr) {
            collectionW = yo1.w(collectionW, zo4Var.d(sy4Var, t35Var));
        }
        return collectionW == null ? la2.m : collectionW;
    }

    @Override // o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        zo4[] zo4VarArr = this.c;
        int length = zo4VarArr.length;
        if (length == 0) {
            return ea2.m;
        }
        if (length == 1) {
            return zo4VarArr[0].e(no1Var, function1);
        }
        Collection collectionW = null;
        for (zo4 zo4Var : zo4VarArr) {
            collectionW = yo1.w(collectionW, zo4Var.e(no1Var, function1));
        }
        return collectionW == null ? la2.m : collectionW;
    }

    @Override // o.zo4
    public final Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zo4 zo4Var : this.c) {
            qv0.c0(linkedHashSet, zo4Var.f());
        }
        return linkedHashSet;
    }

    @Override // o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        ys0 ys0Var = null;
        for (zo4 zo4Var : this.c) {
            ys0 ys0VarG = zo4Var.g(sy4Var, t35Var);
            if (ys0VarG != null) {
                if (!(ys0VarG instanceof zs0) || !((qo4) ys0VarG).A()) {
                    return ys0VarG;
                }
                if (ys0Var == null) {
                    ys0Var = ys0VarG;
                }
            }
        }
        return ys0Var;
    }

    public final String toString() {
        return this.b;
    }
}
