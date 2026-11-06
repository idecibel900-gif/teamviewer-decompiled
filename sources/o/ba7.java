package o;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ba7 extends ap4 {
    public static final /* synthetic */ fw3[] f;
    public final pp1 b;
    public final boolean c;
    public final vd4 d;
    public final vd4 e;

    static {
        x86 x86Var = w86.a;
        f = new fw3[]{x86Var.g(new gu5(x86Var.b(ba7.class), "functions", "getFunctions()Ljava/util/List;")), x86Var.g(new gu5(x86Var.b(ba7.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public ba7(xd4 xd4Var, pp1 pp1Var, boolean z) {
        xd4Var.getClass();
        this.b = pp1Var;
        this.c = z;
        this.d = new vd4(xd4Var, new aa7(this, (byte) 0));
        this.e = new vd4(xd4Var, new aa7(this, (byte) 1));
    }

    @Override // o.ap4, o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        List list = (List) i67.s(this.d, f[0]);
        u17 u17Var = new u17();
        for (Object obj : list) {
            if (im3.n(((c07) obj).getName(), sy4Var)) {
                u17Var.add(obj);
            }
        }
        return u17Var;
    }

    @Override // o.ap4, o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        List list = (List) i67.s(this.e, f[1]);
        u17 u17Var = new u17();
        for (Object obj : list) {
            if (im3.n(((bu5) obj).getName(), sy4Var)) {
                u17Var.add(obj);
            }
        }
        return u17Var;
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        fw3[] fw3VarArr = f;
        return lv0.A0((List) i67.s(this.d, fw3VarArr[0]), (List) i67.s(this.e, fw3VarArr[1]));
    }

    @Override // o.ap4, o.zo4
    public final ys0 g(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        t35Var.getClass();
        return null;
    }
}
