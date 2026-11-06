package o;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r25 implements ui2 {
    public final kh7 a;
    public final kh7 b;
    public final a65 c;
    public final kh7 d;

    public r25(ti4 ti4Var) {
        ti4 ti4Var2 = new ti4((byte) 16);
        q25 q25Var = q25.n;
        ti4 ti4Var3 = new ti4((byte) 17);
        this.a = new kh7(ti4Var);
        this.b = ds1.Y(ti4Var2);
        a65 a65Var = new a65((byte) 24, false);
        a65Var.n = q25Var;
        a65Var.f302o = yl7.Z;
        this.c = a65Var;
        this.d = ds1.Y(ti4Var3);
    }

    @Override // o.ui2
    public final vi2 a(Object obj, za5 za5Var, i46 i46Var) {
        x98 x98Var = (x98) obj;
        if (!im3.n(x98Var.c, "http") && !im3.n(x98Var.c, "https")) {
            return null;
        }
        String str = x98Var.a;
        kh7 kh7Var = this.a;
        kh7 kh7Var2 = new kh7(new vm3((Object) i46Var, (byte) 19));
        kh7 kh7Var3 = this.b;
        a65 a65Var = this.c;
        Context context = za5Var.a;
        Object obj2 = a65Var.f302o;
        yl7 yl7Var = yl7.Z;
        if (obj2 == yl7Var) {
            synchronized (a65Var) {
                obj2 = a65Var.f302o;
                if (obj2 == yl7Var) {
                    Function1 function1 = (Function1) a65Var.n;
                    function1.getClass();
                    Object objInvoke = function1.invoke(context);
                    a65Var.f302o = objInvoke;
                    a65Var.n = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new v25(str, za5Var, kh7Var, kh7Var2, kh7Var3, new di3(obj2), this.d);
    }
}
