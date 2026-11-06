package o;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jo7 implements Iterable {
    public final ArrayList m = new ArrayList();
    public final xr n;

    public jo7(xr xrVar) {
        this.n = xrVar;
    }

    public final void a(ComponentName componentName) {
        xr xrVar = this.n;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        try {
            for (Intent intentW = vt1.w(xrVar, componentName); intentW != null; intentW = vt1.w(xrVar, intentW.getComponent())) {
                arrayList.add(size, intentW);
            }
        } catch (PackageManager.NameNotFoundException e) {
            io.sentry.android.core.v0.c("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList arrayList = this.m;
        if (arrayList.isEmpty()) {
            hk0.l("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.n.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.m.iterator();
    }
}
