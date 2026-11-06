package o;

/* JADX INFO: loaded from: classes.dex */
public final class pr4 extends zi1 {
    public boolean c;

    @Override // o.zi1
    public final cj3 b(nl5 nl5Var) {
        byte b = 25;
        if (this.c) {
            this.c = false;
            return new cj3(new j93(new ym3(nl5Var)), b);
        }
        this.c = true;
        return new cj3(new j93(nl5Var), b);
    }
}
