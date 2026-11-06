package o;

import android.view.ViewGroup;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b28 {
    public static final c00 a = new c00();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, s18 s18Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = be8.a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (s18Var == null) {
                s18Var = a;
            }
            s18 s18VarClone = s18Var.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((s18) it.next()).u(viewGroup);
                }
            }
            if (s18VarClone != null) {
                s18VarClone.h(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                io.sentry.h2.f();
                return;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (s18VarClone != null) {
                a28 a28Var = new a28();
                a28Var.m = s18VarClone;
                a28Var.n = viewGroup;
                viewGroup.addOnAttachStateChangeListener(a28Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(a28Var);
            }
        }
    }

    public static vw b() {
        vw vwVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (vwVar = (vw) weakReference.get()) != null) {
            return vwVar;
        }
        vw vwVar2 = new vw(0);
        threadLocal.set(new WeakReference(vwVar2));
        return vwVar2;
    }
}
