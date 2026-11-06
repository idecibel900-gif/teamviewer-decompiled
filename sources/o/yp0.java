package o;

import android.view.MenuItem;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;

/* JADX INFO: loaded from: classes.dex */
public final class yp0 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public yp0(IConversationListUIModel iConversationListUIModel) {
        iConversationListUIModel.getClass();
        this.b = iConversationListUIModel;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        byte b = this.a;
        Object obj = this.b;
        menuItem.getClass();
        switch (b) {
            case 0:
                ((IConversationListUIModel) obj).ResetRoomSearch();
                return true;
            default:
                bb5 bb5Var = ((ue0) ((iu) obj).p).m.r0;
                if (bb5Var == null) {
                    return false;
                }
                bb5Var.G0();
                return false;
        }
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        byte b = this.a;
        menuItem.getClass();
        return true;
    }

    public yp0(iu iuVar) {
        this.b = iuVar;
    }
}
