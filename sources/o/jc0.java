package o;

import com.teamviewer.swigcallbacklib.VoidSignalCallbackImpl;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends VoidSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ jc0(WeakReference weakReference, byte b) {
        this.a = b;
        this.b = weakReference;
    }

    @Override // com.teamviewer.swigcallbacklib.VoidSignalCallback
    public final void OnCallback() {
        Function0 function0;
        Function0 function1;
        byte b = this.a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                if (weakReference.get() != null && (function0 = (Function0) weakReference.get()) != null) {
                    function0.a();
                    break;
                }
                break;
            default:
                if (weakReference.get() != null && (function1 = (Function0) weakReference.get()) != null) {
                    function1.a();
                    break;
                }
                break;
        }
    }
}
