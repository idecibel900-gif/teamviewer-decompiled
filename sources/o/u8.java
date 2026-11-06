package o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends v8 {
    public final /* synthetic */ byte h;
    public vp3 i;
    public final /* synthetic */ Type[] j;
    public final /* synthetic */ Type k;
    public final /* synthetic */ Set l;
    public final /* synthetic */ Set m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(Type type, Set set, Object obj, Method method, int i, boolean z, Type[] typeArr, Type type2, Set set2, Set set3, byte b) {
        super(type, set, obj, method, i, 1, z);
        this.h = b;
        this.j = typeArr;
        this.k = type2;
        this.l = set2;
        this.m = set3;
    }

    @Override // o.v8
    public final void a(pt4 pt4Var, w8 w8Var) {
        byte b = this.h;
        Set set = this.m;
        Type type = this.k;
        Type[] typeArr = this.j;
        Set set2 = this.l;
        switch (b) {
            case 0:
                super.a(pt4Var, w8Var);
                this.i = (f57.h(typeArr[0], type) && set2.equals(set)) ? pt4Var.b(w8Var, type, set) : pt4Var.a(type, set, null);
                break;
            default:
                super.a(pt4Var, w8Var);
                this.i = (f57.h(typeArr[0], type) && set2.equals(set)) ? pt4Var.b(w8Var, typeArr[0], set2) : pt4Var.a(typeArr[0], set2, null);
                break;
        }
    }

    @Override // o.v8
    public Object b(nr3 nr3Var) {
        switch (this.h) {
            case 1:
                return c(this.i.a(nr3Var));
            default:
                return super.b(nr3Var);
        }
    }

    @Override // o.v8
    public void d(pr3 pr3Var, Object obj) {
        switch (this.h) {
            case 0:
                this.i.c(pr3Var, c(obj));
                break;
            default:
                super.d(pr3Var, obj);
                break;
        }
    }
}
