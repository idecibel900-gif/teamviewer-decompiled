package o;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import org.jetbrains.compose.resources.AndroidContextProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class sh {
    public static final void a(int i, ux2 ux2Var) {
        ux2Var.Y(1587247798);
        if (!ux2Var.N(i & 1, i != 0)) {
            ux2Var.Q();
        } else if (((Boolean) ux2Var.j(xj3.a)).booleanValue()) {
            ux2Var.W(-1890697985);
            Context context = AndroidContextProvider.m;
            AndroidContextProvider.m = (Context) ux2Var.j(lh.b);
            ux2Var.p(false);
        } else {
            ux2Var.W(-1890623988);
            ux2Var.p(false);
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new g9(i);
        }
    }

    public static final Context b() {
        return InstrumentationRegistry.getInstrumentation().getContext();
    }
}
