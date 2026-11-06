package o;

/* JADX INFO: loaded from: classes2.dex */
public class x86 {
    public pu3 a(bx2 bx2Var) {
        return bx2Var;
    }

    public wt3 b(Class cls) {
        return new qs0(cls);
    }

    public ku3 c(Class cls, String str) {
        return new hd5(cls, str);
    }

    public wu3 d(oq7 oq7Var) {
        return oq7Var;
    }

    public zu3 e(gx4 gx4Var) {
        return gx4Var;
    }

    public sv3 f(k44 k44Var) {
        return k44Var;
    }

    public xv3 g(fu5 fu5Var) {
        return fu5Var;
    }

    public bw3 h(hu5 hu5Var) {
        return hu5Var;
    }

    public String i(rw2 rw2Var) {
        String string = rw2Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(yz3 yz3Var) {
        return i(yz3Var);
    }
}
