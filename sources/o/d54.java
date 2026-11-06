package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class d54 implements zo4 {
    public final /* synthetic */ byte b = 0;
    public final Object c;

    public d54(xd4 xd4Var, Function0 function0) {
        xd4Var.getClass();
        this.c = new vd4(xd4Var, new vp1(function0, (byte) 1));
    }

    @Override // o.zo4
    public Collection a(sy4 sy4Var, t35 t35Var) {
        switch (this.b) {
            case 1:
                sy4Var.getClass();
                return ct1.T(j(sy4Var, t35Var), o48.f1629o);
            default:
                return j(sy4Var, t35Var);
        }
    }

    @Override // o.zo4
    public final Set b() {
        return l().b();
    }

    @Override // o.zo4
    public final Set c() {
        return l().c();
    }

    @Override // o.zo4
    public Collection d(sy4 sy4Var, t35 t35Var) {
        switch (this.b) {
            case 1:
                sy4Var.getClass();
                return ct1.T(k(sy4Var, t35Var), o48.p);
            default:
                return k(sy4Var, t35Var);
        }
    }

    @Override // o.zo4
    public Collection e(no1 no1Var, Function1 function1) {
        switch (this.b) {
            case 1:
                no1Var.getClass();
                Collection collectionI = i(no1Var, function1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((fi1) obj) instanceof xi0) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return lv0.A0(ct1.T(arrayList, o48.q), arrayList2);
            default:
                return i(no1Var, function1);
        }
    }

    @Override // o.zo4
    public final Set f() {
        return l().f();
    }

    @Override // o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return l().g(sy4Var, t35Var);
    }

    public final zo4 h() {
        if (!(l() instanceof d54)) {
            return l();
        }
        zo4 zo4VarL = l();
        zo4VarL.getClass();
        return ((d54) zo4VarL).h();
    }

    public final Collection i(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return l().e(no1Var, function1);
    }

    public final Collection j(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return l().a(sy4Var, t35Var);
    }

    public final Collection k(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return l().d(sy4Var, t35Var);
    }

    public final zo4 l() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (zo4) ((vd4) obj).a();
            default:
                return (zo4) obj;
        }
    }

    public d54(zo4 zo4Var) {
        this.c = zo4Var;
    }
}
