package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class g18 implements Iterator, su3 {
    public final /* synthetic */ byte m = 1;
    public Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f846o;

    public g18(Iterator it) {
        it.getClass();
        this.f846o = new ArrayList();
        this.n = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.m;
        Object obj = this.f846o;
        switch (b) {
            case 0:
                return ((h18) obj).b.invoke(this.n.next());
            default:
                Object next = this.n.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                j1 j1Var = viewGroup != null ? new j1(viewGroup, (byte) 7) : null;
                if (j1Var == null || !j1Var.hasNext()) {
                    while (!this.n.hasNext() && !arrayList.isEmpty()) {
                        this.n = (Iterator) lv0.v0(arrayList);
                        qv0.e0(arrayList);
                    }
                } else {
                    arrayList.add(this.n);
                    this.n = j1Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g18(h18 h18Var) {
        this.f846o = h18Var;
        this.n = h18Var.a.iterator();
    }
}
