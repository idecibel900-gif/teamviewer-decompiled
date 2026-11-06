package o;

import android.database.Observable;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e66 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((u66) ((Observable) this).mObservers.get(size)).a;
            recyclerView.j(null);
            recyclerView.s0.f = true;
            recyclerView.Z(true);
            if (!recyclerView.q.w()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            u66 u66Var = (u66) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u66Var.a;
            recyclerView.j(null);
            r8 r8Var = recyclerView.q;
            ArrayList arrayList = (ArrayList) r8Var.d;
            if (i != i2) {
                arrayList.add(r8Var.y(null, 8, i, i2));
                r8Var.b |= 8;
                if (arrayList.size() == 1) {
                    u66Var.a();
                }
            }
        }
    }

    public final void d(int i, int i2, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            u66 u66Var = (u66) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u66Var.a;
            recyclerView.j(null);
            r8 r8Var = recyclerView.q;
            ArrayList arrayList = (ArrayList) r8Var.d;
            if (i2 >= 1) {
                arrayList.add(r8Var.y(preference, 4, i, i2));
                r8Var.b = 4 | r8Var.b;
                if (arrayList.size() == 1) {
                    u66Var.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            u66 u66Var = (u66) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u66Var.a;
            recyclerView.j(null);
            r8 r8Var = recyclerView.q;
            ArrayList arrayList = (ArrayList) r8Var.d;
            if (i2 >= 1) {
                arrayList.add(r8Var.y(null, 1, i, i2));
                r8Var.b |= 1;
                if (arrayList.size() == 1) {
                    u66Var.a();
                }
            }
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            u66 u66Var = (u66) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = u66Var.a;
            recyclerView.j(null);
            r8 r8Var = recyclerView.q;
            ArrayList arrayList = (ArrayList) r8Var.d;
            if (i2 >= 1) {
                arrayList.add(r8Var.y(null, 2, i, i2));
                r8Var.b |= 2;
                if (arrayList.size() == 1) {
                    u66Var.a();
                }
            }
        }
    }
}
