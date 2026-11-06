package o;

import com.teamviewer.apidefinitions.legacydevices.models.GroupAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.DirectlyManagedDevicesCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupsCacheLoadedEvent;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsChangedEvent;
import com.teamviewer.apidefinitions.recentconnections.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionChangeEvent;

/* JADX INFO: loaded from: classes.dex */
public final class u31 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ y31 n;

    public /* synthetic */ u31(y31 y31Var, byte b) {
        this.m = b;
        this.n = y31Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        y31 y31Var = this.n;
        switch (b) {
            case 0:
                if (((TeamViewerEvent) obj) instanceof RecentConnectionsChangedEvent) {
                    y31Var.f1();
                }
                break;
            case 1:
                if (((com.teamviewer.apidefinitions.supportsessions.models.TeamViewerEvent) obj) instanceof SupportSessionChangeEvent) {
                    gu0 gu0VarN = e8.n(y31Var);
                    tk1 tk1Var = g22.a;
                    im3.R(gu0VarN, gk1.f901o, null, new h0(y31Var, null, (byte) 22), 2);
                }
                break;
            case 2:
                com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent teamViewerEvent = (com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent) obj;
                if (teamViewerEvent != null && ((teamViewerEvent instanceof GroupAddedEvent) || (teamViewerEvent instanceof GroupChangedEvent) || (teamViewerEvent instanceof GroupRemovedEvent))) {
                    iw7.b((iw7) y31Var.R.q);
                }
                break;
            default:
                com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent) obj;
                if (teamViewerEvent2 != null) {
                    if (teamViewerEvent2 instanceof ManagedGroupsCacheLoadedEvent) {
                        y31Var.g1(ci3.n);
                    } else if (teamViewerEvent2 instanceof DirectlyManagedDevicesCacheLoadedEvent) {
                        y31Var.g1(ci3.f529o);
                    } else if ((teamViewerEvent2 instanceof ManagedGroupAddedEvent) || (teamViewerEvent2 instanceof ManagedGroupChangedEvent) || (teamViewerEvent2 instanceof ManagedGroupRemovedEvent)) {
                        iw7.b((iw7) y31Var.R.p);
                    }
                }
                break;
        }
        return f88Var;
    }
}
