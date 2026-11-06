package o;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ss3 implements zo4 {
    public static final /* synthetic */ fw3[] f;
    public final yc4 b;
    public final i24 c;
    public final o24 d;
    public final vd4 e;

    static {
        x86 x86Var = w86.a;
        f = new fw3[]{x86Var.g(new gu5(x86Var.b(ss3.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public ss3(yc4 yc4Var, k86 k86Var, i24 i24Var) {
        this.b = yc4Var;
        this.c = i24Var;
        this.d = new o24(yc4Var, k86Var, i24Var);
        this.e = new vd4(((io3) yc4Var.m).a, new a3(this, (byte) 20));
    }

    @Override // o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        i(sy4Var, t35Var);
        zo4[] zo4VarArrH = h();
        Collection collectionA = this.d.a(sy4Var, t35Var);
        for (zo4 zo4Var : zo4VarArrH) {
            collectionA = yo1.w(collectionA, zo4Var.a(sy4Var, t35Var));
        }
        return collectionA == null ? la2.m : collectionA;
    }

    @Override // o.zo4
    public final Set b() {
        zo4[] zo4VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zo4 zo4Var : zo4VarArrH) {
            qv0.c0(linkedHashSet, zo4Var.b());
        }
        linkedHashSet.addAll(this.d.b());
        return linkedHashSet;
    }

    @Override // o.zo4
    public final Set c() {
        zo4[] zo4VarArrH = h();
        zo4VarArrH.getClass();
        HashSet hashSetT = zu1.t(zo4VarArrH.length == 0 ? ea2.m : new ex(zo4VarArrH, (byte) 0));
        if (hashSetT == null) {
            return null;
        }
        hashSetT.addAll(this.d.c());
        return hashSetT;
    }

    @Override // o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        i(sy4Var, t35Var);
        zo4[] zo4VarArrH = h();
        this.d.getClass();
        Collection collectionW = ea2.m;
        for (zo4 zo4Var : zo4VarArrH) {
            collectionW = yo1.w(collectionW, zo4Var.d(sy4Var, t35Var));
        }
        return collectionW == null ? la2.m : collectionW;
    }

    @Override // o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        zo4[] zo4VarArrH = h();
        Collection collectionE = this.d.e(no1Var, function1);
        for (zo4 zo4Var : zo4VarArrH) {
            collectionE = yo1.w(collectionE, zo4Var.e(no1Var, function1));
        }
        return collectionE == null ? la2.m : collectionE;
    }

    @Override // o.zo4
    public final Set f() {
        zo4[] zo4VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zo4 zo4Var : zo4VarArrH) {
            qv0.c0(linkedHashSet, zo4Var.f());
        }
        linkedHashSet.addAll(this.d.f());
        return linkedHashSet;
    }

    @Override // o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        i(sy4Var, t35Var);
        o24 o24Var = this.d;
        o24Var.getClass();
        ys0 ys0Var = null;
        ns4 ns4VarV = o24Var.v(sy4Var, null);
        if (ns4VarV != null) {
            return ns4VarV;
        }
        for (zo4 zo4Var : h()) {
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

    public final zo4[] h() {
        return (zo4[]) i67.s(this.e, f[0]);
    }

    public final void i(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        this.c.q.b();
        sy4Var.b().getClass();
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
