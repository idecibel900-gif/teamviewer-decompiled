package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final class mq1 extends BaseAdapter {
    public final GroupListViewModel m;

    public mq1(GroupListViewModel groupListViewModel) {
        this.m = groupListViewModel;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        GroupListViewModel groupListViewModel = this.m;
        return GroupListViewModelSWIGJNI.GroupListViewModel_GetSize(groupListViewModel.a, groupListViewModel);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        String strGroupListElementViewModel_GetName;
        viewGroup.getClass();
        db4 db4Var = view instanceof db4 ? (db4) view : null;
        if (db4Var == null) {
            Context context = viewGroup.getContext();
            context.getClass();
            db4Var = new db4(context);
        }
        GroupListElementViewModel groupListElementViewModelK = ds1.k(this.m.a(i));
        db4Var.m = groupListElementViewModelK;
        TextView textView = db4Var.n.a;
        if (groupListElementViewModelK == null || (strGroupListElementViewModel_GetName = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK)) == null) {
            strGroupListElementViewModel_GetName = "";
        }
        textView.setText(strGroupListElementViewModel_GetName);
        return db4Var;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.m.a(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String strGroupListElementViewModel_GetName;
        viewGroup.getClass();
        cb4 cb4Var = view instanceof cb4 ? (cb4) view : null;
        if (cb4Var == null) {
            Context context = viewGroup.getContext();
            context.getClass();
            cb4Var = new cb4(context);
        }
        PListGroupID pListGroupIDA = this.m.a(i);
        GroupListElementViewModel groupListElementViewModelK = cb4Var.m;
        if (groupListElementViewModelK == null) {
            groupListElementViewModelK = ds1.k(pListGroupIDA);
            cb4Var.m = groupListElementViewModelK;
        }
        if (!im3.n(groupListElementViewModelK != null ? new PListGroupID(0, GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetID(groupListElementViewModelK.c, groupListElementViewModelK)) : null, pListGroupIDA)) {
            TextView textView = cb4Var.n.a;
            GroupListElementViewModel groupListElementViewModel = cb4Var.m;
            if (groupListElementViewModel == null || (strGroupListElementViewModel_GetName = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModel.c, groupListElementViewModel)) == null) {
                strGroupListElementViewModel_GetName = "";
            }
            textView.setText(strGroupListElementViewModel_GetName);
        }
        return cb4Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        GroupListViewModel groupListViewModel = this.m;
        return GroupListViewModelSWIGJNI.GroupListViewModel_IsEnabled(groupListViewModel.a, groupListViewModel, i);
    }
}
