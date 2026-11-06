package o;

import com.teamviewer.chatviewlib.view.MultipleElementsPicker;
import com.teamviewer.chatviewmodel.swig.IChatEndpointListUIModel;
import com.teamviewer.chatviewmodel.swig.IChatEndpointUIModel;

/* JADX INFO: loaded from: classes.dex */
public final class qo0 implements cw4, lp0 {
    public final /* synthetic */ so0 a;

    @Override // o.cw4
    public void a(CharSequence charSequence) {
        IChatEndpointListUIModel iChatEndpointListUIModel = this.a.n;
        if (iChatEndpointListUIModel != null) {
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            iChatEndpointListUIModel.SetFilter(string);
        }
    }

    @Override // o.lp0
    public void b(IChatEndpointUIModel iChatEndpointUIModel, int i) {
        so0 so0Var = this.a;
        IChatEndpointListUIModel iChatEndpointListUIModel = so0Var.n;
        if (iChatEndpointListUIModel != null) {
            iChatEndpointListUIModel.SelectChatEndpointAtPosition(i);
        }
        MultipleElementsPicker multipleElementsPicker = so0Var.t;
        if (multipleElementsPicker != null) {
            String strGetDisplayName = iChatEndpointUIModel.GetDisplayName();
            strGetDisplayName.getClass();
            multipleElementsPicker.t.add(strGetDisplayName);
            multipleElementsPicker.c();
            so0Var.c(multipleElementsPicker.getElementsSize());
        }
    }

    @Override // o.cw4
    public void c(int i) {
        so0 so0Var = this.a;
        IChatEndpointListUIModel iChatEndpointListUIModel = so0Var.n;
        if (iChatEndpointListUIModel != null) {
            iChatEndpointListUIModel.DeselectChatEndpointAtPosition(i);
        }
        MultipleElementsPicker multipleElementsPicker = so0Var.t;
        if (multipleElementsPicker != null) {
            so0Var.c(multipleElementsPicker.getElementsSize());
        }
    }
}
