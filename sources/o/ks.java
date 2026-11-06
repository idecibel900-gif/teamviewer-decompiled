package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ks extends y57 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ks(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // o.y57, o.ef8
    public void b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((is) obj).n.G.setVisibility(0);
                break;
            case 1:
                qs qsVar = (qs) obj;
                qsVar.G.setVisibility(0);
                if (qsVar.G.getParent() instanceof View) {
                    View view = (View) qsVar.G.getParent();
                    WeakHashMap weakHashMap = be8.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // o.ef8
    public final void c() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                qs qsVar = ((is) obj).n;
                qsVar.G.setAlpha(1.0f);
                qsVar.J.d(null);
                qsVar.J = null;
                break;
            case 1:
                qs qsVar2 = (qs) obj;
                qsVar2.G.setAlpha(1.0f);
                qsVar2.J.d(null);
                qsVar2.J = null;
                break;
            default:
                qs qsVar3 = (qs) ((cj3) obj).f531o;
                qsVar3.G.setVisibility(8);
                PopupWindow popupWindow = qsVar3.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qsVar3.G.getParent() instanceof View) {
                    View view = (View) qsVar3.G.getParent();
                    WeakHashMap weakHashMap = be8.a;
                    view.requestApplyInsets();
                }
                qsVar3.G.e();
                qsVar3.J.d(null);
                qsVar3.J = null;
                ViewGroup viewGroup = qsVar3.L;
                WeakHashMap weakHashMap2 = be8.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
