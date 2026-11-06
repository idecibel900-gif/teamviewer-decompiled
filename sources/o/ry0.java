package o;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry0 implements ComponentFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ry0(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
        this.c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        byte b = this.a;
        Object obj = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                return ComponentMonitor.lambda$processRegistrar$0(str, (Component) obj, componentContainer);
            default:
                return LibraryVersionComponent.lambda$fromContext$0(str, (LibraryVersionComponent.VersionExtractor) obj, componentContainer);
        }
    }
}
