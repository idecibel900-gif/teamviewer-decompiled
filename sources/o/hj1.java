package o;

import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hj1 implements u20 {
    public final sl0 a;
    public final /* synthetic */ DecoratedBarcodeView b;

    public hj1(DecoratedBarcodeView decoratedBarcodeView, sl0 sl0Var) {
        this.b = decoratedBarcodeView;
        this.a = sl0Var;
    }

    @Override // o.u20
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wc6 wc6Var = (wc6) it.next();
            ViewfinderView viewfinderView = this.b.n;
            if (viewfinderView.s.size() < 20) {
                viewfinderView.s.add(wc6Var);
            }
        }
    }

    @Override // o.u20
    public final void b(x20 x20Var) {
        this.a.b(x20Var);
    }
}
