package o;

/* JADX INFO: loaded from: classes2.dex */
public class w83 extends RuntimeException {
    public final int m;

    public w83(kc6 kc6Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        lc6 lc6Var = kc6Var.a;
        int i = lc6Var.p;
        sb.append(i);
        sb.append(" ");
        sb.append(lc6Var.f1350o);
        super(sb.toString());
        this.m = i;
    }
}
