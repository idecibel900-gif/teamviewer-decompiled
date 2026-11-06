package o;

import android.app.Dialog;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class qd0 implements hk7 {
    public final /* synthetic */ sd0 a;

    public qd0(sd0 sd0Var) {
        this.a = sd0Var;
    }

    @Override // o.hk7
    public final void a(gk7 gk7Var) {
        sd0 sd0Var = this.a;
        w93 w93Var = sd0Var.y0;
        if (w93Var == null) {
            im3.e0("buddyListMainFragmentViewModel");
            throw null;
        }
        Dialog dialog = gk7Var.A0;
        EditText editText = dialog != null ? (EditText) dialog.findViewById(R.id.tv_new_group_name) : null;
        if (editText != null) {
            String string = editText.getText().toString();
            Context context = editText.getContext();
            context.getClass();
            vy2 vy2Var = new vy2(context, "BuddyListMainFragment", "create group failed");
            string.getClass();
            GroupListViewModel groupListViewModel = ((ud0) w93Var).f2200o;
            if (groupListViewModel != null) {
                GroupListViewModelSWIGJNI.GroupListViewModel_CreateGroup(groupListViewModel.a, groupListViewModel, string, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) vy2Var), vy2Var);
            }
            Object systemService = sd0Var.p0().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        } else {
            ye4.c("BuddyListMainFragment", "newGroupPositive: can't find correct view");
        }
        gk7Var.A0();
        sd0Var.K0();
    }
}
