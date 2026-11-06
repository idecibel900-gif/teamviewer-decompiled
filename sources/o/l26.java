package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IGroupMemberListSearchViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewEndpointListViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class l26 implements se8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l26(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new oc0((IMonitoringOverviewEndpointListViewModel) obj);
            case 1:
                return new we0((IGroupMemberListSearchViewModel) obj);
            default:
                return new yt0((wc3) ((mo7) obj));
        }
    }
}
