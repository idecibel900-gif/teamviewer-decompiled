package o;

import android.view.MenuItem;
import com.teamviewer.chatviewlib.view.MultipleElementsPicker;
import com.teamviewer.chatviewmodel.swig.IAddChatEndpointListUIModel;
import com.teamviewer.chatviewmodel.swig.IChatEndpointUIModel;

/* JADX INFO: loaded from: classes.dex */
public final class yn0 implements cw4, lp0 {
    public final /* synthetic */ ao0 a;

    @Override // o.cw4
    public void a(CharSequence charSequence) {
        String string;
        IAddChatEndpointListUIModel iAddChatEndpointListUIModel = this.a.r0;
        if (iAddChatEndpointListUIModel != null) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            iAddChatEndpointListUIModel.SetFilter(string);
        }
    }

    @Override // o.lp0
    public void b(IChatEndpointUIModel iChatEndpointUIModel, int i) {
        MultipleElementsPicker multipleElementsPicker;
        ao0 ao0Var = this.a;
        IAddChatEndpointListUIModel iAddChatEndpointListUIModel = ao0Var.r0;
        if (iAddChatEndpointListUIModel != null) {
            iAddChatEndpointListUIModel.SelectChatEndpointAtPosition(i);
        }
        MultipleElementsPicker multipleElementsPicker2 = ao0Var.v0;
        if (multipleElementsPicker2 != null) {
            String strGetDisplayName = iChatEndpointUIModel.GetDisplayName();
            strGetDisplayName.getClass();
            multipleElementsPicker2.t.add(strGetDisplayName);
            multipleElementsPicker2.c();
        }
        MenuItem menuItem = ao0Var.x0;
        if (menuItem != null) {
            MultipleElementsPicker multipleElementsPicker3 = ao0Var.v0;
            menuItem.setEnabled((multipleElementsPicker3 != null ? multipleElementsPicker3.getElementsSize() : 0) > 0);
        }
        IAddChatEndpointListUIModel iAddChatEndpointListUIModel2 = ao0Var.r0;
        if (iAddChatEndpointListUIModel2 == null || !iAddChatEndpointListUIModel2.IsPrivate() || (multipleElementsPicker = ao0Var.v0) == null) {
            return;
        }
        ao0Var.C0(multipleElementsPicker.getElementsSize());
    }

    @Override // o.cw4
    public void c(int i) {
        ao0 ao0Var = this.a;
        IAddChatEndpointListUIModel iAddChatEndpointListUIModel = ao0Var.r0;
        if (iAddChatEndpointListUIModel != null) {
            iAddChatEndpointListUIModel.DeselectChatEndpointAtPosition(i);
        }
        MenuItem menuItem = ao0Var.x0;
        if (menuItem != null) {
            MultipleElementsPicker multipleElementsPicker = ao0Var.v0;
            menuItem.setEnabled((multipleElementsPicker != null ? multipleElementsPicker.getElementsSize() : 0) > 0);
        }
        IAddChatEndpointListUIModel iAddChatEndpointListUIModel2 = ao0Var.r0;
        if (iAddChatEndpointListUIModel2 == null || !iAddChatEndpointListUIModel2.IsPrivate()) {
            return;
        }
        MultipleElementsPicker multipleElementsPicker2 = ao0Var.v0;
        ao0Var.C0(multipleElementsPicker2 != null ? multipleElementsPicker2.getElementsSize() : 0);
    }
}
