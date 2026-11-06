package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class cd2 implements zo4 {
    public final String b;

    public cd2(dd2 dd2Var, String... strArr) {
        String str = dd2Var.m;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // o.zo4
    public Set b() {
        return la2.m;
    }

    @Override // o.zo4
    public Set c() {
        return la2.m;
    }

    @Override // o.zo4
    public Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        return ea2.m;
    }

    @Override // o.zo4
    public Set f() {
        return la2.m;
    }

    @Override // o.zo4
    public ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return new sc2(sy4.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{sy4Var}, 1))));
    }

    @Override // o.zo4
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        sc2 sc2Var = hd2.c;
        sc2Var.getClass();
        xc2 xc2Var = new xc2(sc2Var, null, yl7.p, sy4.g("<Error function>"), 1, s67.h);
        ed2 ed2VarC = hd2.c(gd2.q, new String[0]);
        as4 as4Var = as4.p;
        cp1 cp1Var = dp1.e;
        ea2 ea2Var = ea2.m;
        xc2Var.H0(null, null, ea2Var, ea2Var, ea2Var, ed2VarC, as4Var, cp1Var);
        return lv1.V(xc2Var);
    }

    @Override // o.zo4
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        return hd2.f;
    }

    public String toString() {
        return "ErrorScope{" + this.b + '}';
    }
}
