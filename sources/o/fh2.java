package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class fh2 extends uc1 {
    public final jo4 a;
    public final g95 b;

    public fh2(jo4 jo4Var, g95 g95Var) {
        this.a = jo4Var;
        this.b = g95Var;
    }

    @Override // o.uc1
    public final vc1 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, d11 d11Var) {
        type.getClass();
        annotationArr2.getClass();
        g95 g95Var = this.b;
        return new ep3(this.a, vt1.I(((rp3) g95Var.m).b, type), g95Var, (byte) 20);
    }

    @Override // o.uc1
    public final vc1 b(Type type, Annotation[] annotationArr, d11 d11Var) {
        annotationArr.getClass();
        g95 g95Var = this.b;
        return new wk0(vt1.I(((rp3) g95Var.m).b, type), g95Var, (byte) 13);
    }
}
