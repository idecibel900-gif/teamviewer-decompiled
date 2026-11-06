package o;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class zc0 extends c76 implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final View G;
    public final rd0 H;
    public final TextView I;
    public final ImageView J;
    public GroupListElementViewModel K;
    public final VoidSignalCallback L;

    public zc0(View view, rd0 rd0Var) {
        super(view);
        this.G = view;
        this.H = rd0Var;
        View viewFindViewById = view.findViewById(R.id.group_name);
        viewFindViewById.getClass();
        this.I = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.group_shared);
        viewFindViewById2.getClass();
        this.J = (ImageView) viewFindViewById2;
        this.L = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y(this, (byte) 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GroupListElementViewModel groupListElementViewModel = this.K;
        if (groupListElementViewModel != null) {
            PListGroupID pListGroupID = new PListGroupID(0, GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetID(groupListElementViewModel.c, groupListElementViewModel));
            bb5 bb5Var = this.H.a.r0;
            if (bb5Var != null) {
                int i = yc0.G0;
                long jPListGroupID_GetInternalID = PListGroupIDSWIGJNI.PListGroupID_GetInternalID(pListGroupID.a, pListGroupID);
                yc0 yc0Var = new yc0();
                Bundle bundle = new Bundle();
                bundle.putLong("groupId", jPListGroupID_GetInternalID);
                yc0Var.u0(bundle);
                bb5Var.I0(yc0Var, true);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        GroupListElementViewModel groupListElementViewModel;
        view.getClass();
        if (this.L.IsConnected() || (groupListElementViewModel = this.K) == null) {
            return;
        }
        long j = groupListElementViewModel.c;
        VoidSignalCallback voidSignalCallback = this.L;
        GroupListElementViewModelSWIGJNI.GroupListElementViewModel_RegisterForChanges(j, groupListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.L.Disconnect();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[LOOP:0: B:11:0x0023->B:27:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x002b A[SYNTHETIC] */
    public final void r() {
        int length;
        int i;
        w33 w33Var;
        w33 w33Var2;
        GroupListElementViewModel groupListElementViewModel = this.K;
        if (groupListElementViewModel != null) {
            int iGroupListElementViewModel_GetGroupSharingStatus = GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetGroupSharingStatus(groupListElementViewModel.c, groupListElementViewModel);
            w33 w33Var3 = w33.NotShared;
            w33[] w33VarArr = (w33[]) w33.class.getEnumConstants();
            if (iGroupListElementViewModel_GetGroupSharingStatus >= w33VarArr.length || iGroupListElementViewModel_GetGroupSharingStatus < 0) {
                length = w33VarArr.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        hk0.g(ua5.k(iGroupListElementViewModel_GetGroupSharingStatus, w33.class, "No enum ", " with value "));
                        return;
                    }
                    w33Var = w33VarArr[i];
                    if (w33Var.m == iGroupListElementViewModel_GetGroupSharingStatus) {
                        w33Var2 = w33Var;
                        break;
                    }
                    i++;
                }
            } else {
                w33Var2 = w33VarArr[iGroupListElementViewModel_GetGroupSharingStatus];
                if (w33Var2.m != iGroupListElementViewModel_GetGroupSharingStatus) {
                    length = w33VarArr.length;
                    i = 0;
                    while (true) {
                        if (i < length) {
                            hk0.g(ua5.k(iGroupListElementViewModel_GetGroupSharingStatus, w33.class, "No enum ", " with value "));
                            return;
                        }
                        w33Var = w33VarArr[i];
                        if (w33Var.m == iGroupListElementViewModel_GetGroupSharingStatus) {
                            w33Var2 = w33Var;
                            break;
                        }
                        i++;
                    }
                }
            }
            w33 w33Var4 = w33.NotShared;
            ImageView imageView = this.J;
            if (w33Var2 == w33Var4) {
                imageView.setVisibility(4);
                return;
            }
            imageView.setVisibility(0);
            if (w33Var2 == w33.Shared) {
                imageView.setImageResource(R.drawable.ic_cloud_outline);
            } else if (w33Var2 == w33.SharedAndOwned) {
                imageView.setImageResource(R.drawable.ic_cloud);
            }
        }
    }
}
