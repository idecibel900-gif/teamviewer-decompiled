package o;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class i66 {
    public c66 a;
    public ArrayList b;
    public byte c;
    public byte d;
    public short e;
    public short f;

    public static void b(c76 c76Var) {
        int i = c76Var.v;
        if (!c76Var.g() && (i & 4) == 0) {
            c76Var.b();
        }
    }

    public abstract boolean a(c76 c76Var, c76 c76Var2, lf1 lf1Var, lf1 lf1Var2);

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007c, please report this as an issue */
    public final void c(c76 c76Var) {
        c66 c66Var = this.a;
        if (c66Var != null) {
            RecyclerView recyclerView = c66Var.m;
            boolean z = true;
            c76Var.o(true);
            View view = c76Var.m;
            if (c76Var.t != null && c76Var.u == null) {
                c76Var.t = null;
            }
            c76Var.u = null;
            if ((c76Var.v & 16) != 0) {
                return;
            }
            s66 s66Var = recyclerView.f23o;
            recyclerView.m0();
            rq0 rq0Var = recyclerView.r;
            je0 je0Var = (je0) rq0Var.d;
            c66 c66Var2 = (c66) rq0Var.c;
            byte b = rq0Var.b;
            if (b != 1) {
                if (b == 2) {
                    hk0.l("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    rq0Var.b = (byte) 2;
                    int iIndexOfChild = c66Var2.m.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        rq0Var.n(view);
                    } else if (je0Var.d(iIndexOfChild)) {
                        je0Var.i(iIndexOfChild);
                        rq0Var.n(view);
                        c66Var2.k(iIndexOfChild);
                    } else {
                        rq0Var.b = (byte) 0;
                    }
                    rq0Var.b = (byte) 0;
                    if (z) {
                        c76 c76VarM = RecyclerView.M(view);
                        s66Var.l(c76VarM);
                        s66Var.i(c76VarM);
                        if (RecyclerView.O0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.o0(!z);
                    if (z && c76Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    rq0Var.b = (byte) 0;
                    throw th;
                }
            }
            if (((View) rq0Var.f) != view) {
                hk0.l("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                c76 c76VarM2 = RecyclerView.M(view);
                s66Var.l(c76VarM2);
                s66Var.i(c76VarM2);
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.o0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(c76 c76Var);

    public abstract void e();

    public abstract boolean f();
}
