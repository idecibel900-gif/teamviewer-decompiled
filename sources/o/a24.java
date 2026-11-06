package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class a24 implements Function0 {
    public final /* synthetic */ byte m;
    public final b24 n;

    public /* synthetic */ a24(b24 b24Var, byte b) {
        this.m = b;
        this.n = b24Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        b24 b24Var = this.n;
        switch (b) {
            case 0:
                if (bp1.f(b24Var) == null) {
                    return null;
                }
                Object obj = b24Var.s.m;
                return null;
            case 1:
                a86 a86Var = b24Var.t;
                ArrayList<o86> typeParameters = a86Var.getTypeParameters();
                ArrayList arrayList = new ArrayList(mv0.Z(typeParameters, 10));
                for (o86 o86Var : typeParameters) {
                    d58 d58VarB = ((f58) b24Var.v.n).b(o86Var);
                    if (d58VarB == null) {
                        throw new AssertionError("Parameter " + o86Var + " surely belongs to class " + a86Var + ", so it must be resolved");
                    }
                    arrayList.add(d58VarB);
                }
                return arrayList;
            default:
                return b77.f(b24Var);
        }
    }
}
