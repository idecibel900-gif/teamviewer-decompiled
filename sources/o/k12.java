package o;

/* JADX INFO: loaded from: classes.dex */
public class k12 extends tn1 {
    public int m;

    public k12(zi8 zi8Var) {
        super(zi8Var);
        if (zi8Var instanceof g63) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // o.tn1
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (pn1 pn1Var : this.k) {
            pn1Var.a(pn1Var);
        }
    }
}
