package o;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jd2 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ td2 b;
    public final /* synthetic */ o82 c;

    public /* synthetic */ jd2(td2 td2Var, o82 o82Var, byte b) {
        this.a = b;
        this.b = td2Var;
        this.c = o82Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        o82 o82Var = this.c;
        td2 td2Var = this.b;
        switch (b) {
            case 0:
                return td2Var.b(o82Var, (o82) obj);
            default:
                return td2Var.d((i32) o82Var, (x35) obj);
        }
    }
}
