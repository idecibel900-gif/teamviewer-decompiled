package o;

import com.teamviewer.apidefinitions.remotecontrol.models.CapabilitiesByKnownDeviceTeamViewerIdResponse;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByKnownDeviceMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wl extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2425o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl(Object obj, long j, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
        this.f2425o = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new wl((xl) obj2, this.f2425o, hc1Var, (byte) 0);
            case 1:
                return new wl((ru1) obj2, this.f2425o, hc1Var, (byte) 1);
            default:
                return new wl((km) obj2, this.f2425o, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((wl) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        Object objK;
        byte b = this.m;
        f88 f88Var = f88.a;
        long j = this.f2425o;
        Object obj2 = this.p;
        ne1 ne1Var = ne1.m;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    x15 x15Var = ((xl) obj2).m;
                    this.n = true;
                    return x15Var.b(j, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.n;
                if (!z2) {
                    ct1.a0(obj);
                    cr crVar = ((ru1) obj2).u;
                    this.n = true;
                    objK = crVar.k(j, this);
                    if (objK == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z2) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                    objK = ((tc6) obj).m;
                }
                Throwable thA = tc6.a(objK);
                if (thA != null) {
                    ye4.a("DeviceInfoScreenViewModel", "Failed to load connection options for " + j + ": " + thA.getMessage());
                }
                if (objK instanceof sc6) {
                    objK = null;
                }
                CapabilitiesByKnownDeviceTeamViewerIdResponse capabilitiesByKnownDeviceTeamViewerIdResponse = (CapabilitiesByKnownDeviceTeamViewerIdResponse) objK;
                List<ConnectByKnownDeviceMode> connectionModes = capabilitiesByKnownDeviceTeamViewerIdResponse != null ? capabilitiesByKnownDeviceTeamViewerIdResponse.getConnectionModes() : null;
                return connectionModes == null ? ea2.m : connectionModes;
            default:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                km kmVar = (km) obj2;
                t65 t65Var = new t65(j);
                e87 e87Var = vo6.d;
                this.n = true;
                return km.a(kmVar, t65Var, e87Var, null, null, this, 12) == ne1Var ? ne1Var : f88Var;
        }
    }
}
