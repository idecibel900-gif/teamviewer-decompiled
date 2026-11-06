package io.sentry;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.concurrent.Callable;
import o.ep1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p5 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io.sentry.internal.debugmeta.c b;

    public /* synthetic */ p5(io.sentry.internal.debugmeta.c cVar, byte b) {
        this.a = b;
        this.b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        io.sentry.internal.debugmeta.c cVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(cVar.q().length);
            case 1:
                return cVar.q();
            case 2:
                return Integer.valueOf(cVar.q().length);
            case 3:
                return cVar.q();
            case 4:
                return Integer.valueOf(cVar.q().length);
            case 5:
                return cVar.q();
            case 6:
                return Integer.valueOf(cVar.q().length);
            case 7:
                return Integer.valueOf(cVar.q().length);
            case 8:
                return cVar.q();
            case ep1.b /* 9 */:
                return Integer.valueOf(cVar.q().length);
            case ep1.c /* 10 */:
                return cVar.q();
            case 11:
                return Integer.valueOf(cVar.q().length);
            case ep1.d /* 12 */:
                return cVar.q();
            case 13:
                return Integer.valueOf(cVar.q().length);
            case 14:
                return cVar.q();
            case 15:
                return cVar.q();
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return Integer.valueOf(cVar.q().length);
            case 17:
                return cVar.q();
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return Integer.valueOf(cVar.q().length);
            default:
                return cVar.q();
        }
    }
}
