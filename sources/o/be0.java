package o;

import com.teamviewer.swigcallbacklib.IntSignalCallbackImpl;

/* JADX INFO: loaded from: classes.dex */
public final class be0 extends IntSignalCallbackImpl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ be0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.teamviewer.swigcallbacklib.IntSignalCallback
    public final void OnCallback(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ce0) obj).p.setValue(Integer.valueOf(i));
                ye4.a("BuddyListManagerGroupFragmentViewModel", "Received  Managed Group callback");
                break;
            default:
                ((qx5) obj).invoke(Integer.valueOf(i));
                break;
        }
    }
}
