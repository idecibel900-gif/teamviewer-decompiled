package o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xt7 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ xt7(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                hu7 hu7Var = (hu7) obj;
                be1 be1Var = (be1) obj2;
                if (be1Var instanceof cu7) {
                    cu7 cu7Var = (cu7) be1Var;
                    de1 de1Var = hu7Var.a;
                    Object objB = cu7Var.b();
                    Object[] objArr = hu7Var.b;
                    int i = hu7Var.d;
                    objArr[i] = objB;
                    cu7[] cu7VarArr = hu7Var.c;
                    hu7Var.d = i + 1;
                    cu7VarArr[i] = cu7Var;
                }
                return hu7Var;
            case 1:
                qu7 qu7Var = (qu7) obj2;
                return qf0.L(qu7Var.a, qu7Var.b);
            case 2:
                b48 b48Var = (b48) obj2;
                return qf0.L(b48Var.a, b48Var.b);
            default:
                d82.x.invoke(obj);
                return f88.a;
        }
    }
}
