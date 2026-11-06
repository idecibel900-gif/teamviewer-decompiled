package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gp6 {
    public final ap6 a;
    public final lw4 b;

    public gp6(fp6 fp6Var, tk3 tk3Var) {
        this.a = fp6Var.d;
        List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
        this.b = new lw4(listI.size());
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            fp6 fp6Var2 = (fp6) listI.get(i);
            if (tk3Var.a(fp6Var2.f)) {
                this.b.a(fp6Var2.f);
            }
        }
    }
}
