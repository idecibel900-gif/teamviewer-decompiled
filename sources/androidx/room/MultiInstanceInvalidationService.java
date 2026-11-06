package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import o.vu4;
import o.wu4;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int m;
    public final LinkedHashMap n = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wu4 f25o = new wu4(this);
    public final vu4 p = new vu4(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.p;
    }
}
