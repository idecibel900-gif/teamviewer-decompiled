package o;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h3 implements ComponentFactory {
    public final /* synthetic */ byte a;

    public /* synthetic */ h3(byte b) {
        this.a = b;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.a) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case 1:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            case 2:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 4:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 5:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 6:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 7:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 8:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            default:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
        }
    }
}
