package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd4 {
    public static final h72 a = new h72(new tg3((byte) 24), (byte) 0);

    public static p75 a(ux2 ux2Var) {
        p75 p75Var = (p75) ux2Var.j(a);
        Object obj = null;
        if (p75Var == null) {
            ux2Var.W(1208426157);
            View view = (View) ux2Var.j(lh.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    p75Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                p75 p75Var2 = tag instanceof p75 ? (p75) tag : null;
                if (p75Var2 != null) {
                    p75Var = p75Var2;
                    break;
                }
                Object objQ = i67.q(view);
                view = objQ instanceof View ? (View) objQ : null;
            }
        } else {
            ux2Var.W(1208423708);
        }
        ux2Var.p(false);
        if (p75Var != null) {
            ux2Var.W(1208423789);
            ux2Var.p(false);
            return p75Var;
        }
        ux2Var.W(1208428160);
        for (Context baseContext = (Context) ux2Var.j(lh.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof p75) {
                obj = baseContext;
                break;
            }
        }
        p75 p75Var3 = (p75) obj;
        ux2Var.p(false);
        return p75Var3;
    }
}
