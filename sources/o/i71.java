package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class i71 extends BaseAdapter {
    public final MachineListViewModel m;
    public final VoidSignalCallback n;

    public i71(MachineListViewModel machineListViewModel) {
        this.m = machineListViewModel;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new zz0(this, (byte) 3));
        this.n = voidSignalCallback;
        MachineListViewModelSWIGJNI.MachineListViewModel_RegisterForChanges(machineListViewModel.a, machineListViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        MachineListViewModel machineListViewModel = this.m;
        return (int) MachineListViewModelSWIGJNI.MachineListViewModel_GetSize(machineListViewModel.a, machineListViewModel);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        MachineId machineIdA = this.m.a(i);
        machineIdA.getClass();
        return machineIdA;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        MachineId machineIdA = this.m.a(i);
        if (machineIdA == null) {
            ye4.c("ContactComputerAdapter", "machine id was null");
            return Long.MIN_VALUE;
        }
        PListDyngateID pListDyngateIDA = machineIdA.a();
        pListDyngateIDA.getClass();
        return new DyngateID(PListDyngateIDSWIGJNI.PListDyngateID_GetInternalID(pListDyngateIDA.a, pListDyngateIDA), true).ToLong();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        MachineListElementViewModel machineListElementViewModelN;
        String strMachineListElementViewModel_GetDisplayName;
        viewGroup.getClass();
        yt2 yt2VarF = view == null ? yt2.f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_computerselection, viewGroup, false)) : yt2.f(view);
        TextView textView = (TextView) yt2VarF.f2642o;
        MachineId machineIdA = this.m.a(i);
        String str = "";
        if (machineIdA != null && (machineListElementViewModelN = ds1.n(machineIdA)) != null && (strMachineListElementViewModel_GetDisplayName = MachineListElementViewModelSWIGJNI.MachineListElementViewModel_GetDisplayName(machineListElementViewModelN.a, machineListElementViewModelN)) != null) {
            str = strMachineListElementViewModel_GetDisplayName;
        }
        textView.setText(str);
        LinearLayout linearLayout = (LinearLayout) yt2VarF.n;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
