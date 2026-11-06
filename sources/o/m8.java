package o;

import android.view.ActionMode;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m8 implements q22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.q22
    public final void a() {
        Object value;
        wt1 wt1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k8 k8Var = ((g8) obj).a;
                if (k8Var == null) {
                    hk0.l("Launcher has not been initialized");
                } else {
                    k8Var.b();
                }
                break;
            case 1:
                d12 d12Var = (d12) obj;
                d12Var.dismiss();
                d12Var.t.e();
                break;
            case 2:
                yo5 yo5Var = (yo5) obj;
                yo5Var.e();
                yo5Var.setTag(R.id.view_tree_lifecycle_owner, null);
                yo5Var.B.removeViewImmediate(yo5Var);
                break;
            case 3:
                el elVar = (el) obj;
                br5 br5Var = elVar.e;
                ar arVar = (ar) br5Var.i;
                if (arVar != null) {
                    arVar.n();
                }
                br5Var.a();
                ActionMode actionMode = elVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                elVar.h = null;
                break;
            case 4:
                m40 m40Var = (m40) ((n40) obj).c.getValue();
                if (m40Var != null) {
                    m40Var.close();
                }
                break;
            case 5:
                gl0 gl0Var = ((k08) obj).c;
                if (gl0Var != null) {
                    gl0Var.f(null);
                }
                break;
            case 6:
                ((pr7) obj).m();
                break;
            case 7:
                ru1 ru1Var = (ru1) obj;
                ru1Var.O = null;
                ru1Var.P++;
                l97 l97Var = ru1Var.z;
                do {
                    value = l97Var.getValue();
                    wt1Var = (wt1) value;
                } while (!l97Var.j(value, new wt1(null, wt1Var.f, false, wt1Var.s, 16252863)));
                break;
            case 8:
                ((n34) obj).d = null;
                break;
            case ep1.b /* 9 */:
                x34 x34Var = (x34) obj;
                io.sentry.z7 z7Var = x34Var.c;
                if (z7Var != null) {
                    z7Var.a = false;
                }
                x34Var.c = null;
                break;
            case ep1.c /* 10 */:
                t34 t34Var = (t34) obj;
                t34Var.f = true;
                t34Var.d = 0;
                t34Var.b.m.remove(t34Var);
                t34 t34Var2 = t34Var.e;
                if (t34Var2 != null) {
                    t34Var2.b();
                }
                t34Var.e = null;
                break;
            case 11:
                tr4 tr4Var = (tr4) obj;
                tr4Var.dismiss();
                tr4Var.u.e();
                break;
            case ep1.d /* 12 */:
                ((tw4) obj).e = null;
                break;
            case 13:
                ((Function1) ((px4) obj).getValue()).invoke(null);
                break;
            default:
                ((rn6) ((g2) obj)).G0(null);
                break;
        }
    }
}
