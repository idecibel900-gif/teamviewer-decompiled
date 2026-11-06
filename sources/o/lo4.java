package o;

import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lo4 extends nw4 {
    public final SafeIterableMap a;

    public lo4(Object obj) {
        super(obj);
        this.a = new SafeIterableMap();
    }

    public final void b(LiveData liveData, Observer observer) {
        if (liveData == null) {
            yq4.l("source cannot be null");
            return;
        }
        ko4 ko4Var = new ko4(liveData, observer);
        ko4 ko4Var2 = (ko4) this.a.a(liveData, ko4Var);
        if (ko4Var2 != null && ko4Var2.n != observer) {
            hk0.g("This source was already added with the different observer");
        } else if (ko4Var2 == null && hasActiveObservers()) {
            liveData.observeForever(ko4Var);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        Iterator it = this.a.iterator();
        while (true) {
            zg6 zg6Var = (zg6) it;
            if (!zg6Var.hasNext()) {
                return;
            }
            ko4 ko4Var = (ko4) ((Map.Entry) zg6Var.next()).getValue();
            ko4Var.m.observeForever(ko4Var);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        Iterator it = this.a.iterator();
        while (true) {
            zg6 zg6Var = (zg6) it;
            if (!zg6Var.hasNext()) {
                return;
            }
            ko4 ko4Var = (ko4) ((Map.Entry) zg6Var.next()).getValue();
            ko4Var.m.removeObserver(ko4Var);
        }
    }

    public lo4() {
        this.a = new SafeIterableMap();
    }
}
