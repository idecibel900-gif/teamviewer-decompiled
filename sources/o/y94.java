package o;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y94 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iC;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((c76) this.k.get(i2)).m;
            m66 m66Var = (m66) view3.getLayoutParams();
            if (view3 != view && !m66Var.m.i() && (iC = (m66Var.m.c() - this.d) * this.e) >= 0 && iC < i) {
                view2 = view3;
                if (iC == 0) {
                    break;
                } else {
                    i = iC;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((m66) view2.getLayoutParams()).m.c();
        }
    }

    public final View b(s66 s66Var) {
        List list = this.k;
        if (list == null) {
            View view = s66Var.k(this.d, Long.MAX_VALUE).m;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((c76) this.k.get(i)).m;
            m66 m66Var = (m66) view2.getLayoutParams();
            if (!m66Var.m.i() && this.d == m66Var.m.c()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
