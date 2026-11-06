package o;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class wu4 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public wu4(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((wb3) iInterface).getClass();
        obj.getClass();
        this.a.n.remove((Integer) obj);
    }
}
