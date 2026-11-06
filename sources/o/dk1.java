package o;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DefaultHeartBeatController b;

    public /* synthetic */ dk1(DefaultHeartBeatController defaultHeartBeatController, byte b) {
        this.a = b;
        this.b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        DefaultHeartBeatController defaultHeartBeatController = this.b;
        switch (b) {
            case 0:
                return defaultHeartBeatController.lambda$getHeartBeatsHeader$1();
            default:
                return defaultHeartBeatController.lambda$registerHeartBeat$0();
        }
    }
}
