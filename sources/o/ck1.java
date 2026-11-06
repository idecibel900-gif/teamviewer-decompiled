package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck1 implements ComponentFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Qualified b;

    public /* synthetic */ ck1(Qualified qualified, byte b) {
        this.a = b;
        this.b = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        byte b = this.a;
        Qualified qualified = this.b;
        switch (b) {
            case 0:
                return DefaultHeartBeatController.lambda$component$3(qualified, componentContainer);
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(qualified, componentContainer);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(qualified, componentContainer);
        }
    }
}
