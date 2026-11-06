package o;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListAlertID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListAlertIDSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IAlertViewModelWrapperSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ar1 extends oe8 implements qa3 {
    public String A;
    public vq1 B;
    public final VoidSignalCallback C;
    public final VoidSignalCallback D;
    public final VoidSignalCallback E;
    public final g1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ComputerDetailsViewModel f350o;
    public final nw4 p;
    public final nw4 q;
    public final nw4 r;
    public final nw4 s;
    public final nw4 t;
    public final long u;
    public String v;
    public IAlertViewModelWrapper w;
    public final io.sentry.android.core.u0 x;
    public final VoidSignalCallback y;
    public String z;

    public ar1(g1 g1Var, ComputerDetailsViewModel computerDetailsViewModel) {
        this.n = g1Var;
        this.f350o = computerDetailsViewModel;
        nw4 nw4Var = new nw4();
        this.p = nw4Var;
        this.q = new nw4();
        this.r = new nw4();
        this.s = new nw4();
        this.t = new nw4();
        this.u = g1Var.a1();
        this.x = new io.sentry.android.core.u0((byte) 5);
        SignalCallbackFactory.Companion companion = SignalCallbackFactory.INSTANCE;
        final byte b = 0;
        this.y = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.zq1
            public final /* synthetic */ ar1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                vq1 vq1Var;
                byte b2 = b;
                f88 f88Var = f88.a;
                ar1 ar1Var = this.n;
                switch (b2) {
                    case 0:
                        ar1Var.x.d();
                        break;
                    case 1:
                        ar1Var.W0();
                        break;
                    case 2:
                        ar1Var.W0();
                        String str = ar1Var.v;
                        if ((str != null ? ar1Var.V0(str) : null) == null && (vq1Var = ar1Var.B) != null) {
                            vq1Var.a();
                        }
                        break;
                    default:
                        nw4 nw4Var2 = ar1Var.p;
                        ComputerDetailsViewModel computerDetailsViewModel2 = ar1Var.f350o;
                        nw4Var2.postValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        final byte b2 = 1;
        this.C = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.zq1
            public final /* synthetic */ ar1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                vq1 vq1Var;
                byte b3 = b2;
                f88 f88Var = f88.a;
                ar1 ar1Var = this.n;
                switch (b3) {
                    case 0:
                        ar1Var.x.d();
                        break;
                    case 1:
                        ar1Var.W0();
                        break;
                    case 2:
                        ar1Var.W0();
                        String str = ar1Var.v;
                        if ((str != null ? ar1Var.V0(str) : null) == null && (vq1Var = ar1Var.B) != null) {
                            vq1Var.a();
                        }
                        break;
                    default:
                        nw4 nw4Var2 = ar1Var.p;
                        ComputerDetailsViewModel computerDetailsViewModel2 = ar1Var.f350o;
                        nw4Var2.postValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        final byte b3 = 2;
        this.D = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.zq1
            public final /* synthetic */ ar1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                vq1 vq1Var;
                byte b4 = b3;
                f88 f88Var = f88.a;
                ar1 ar1Var = this.n;
                switch (b4) {
                    case 0:
                        ar1Var.x.d();
                        break;
                    case 1:
                        ar1Var.W0();
                        break;
                    case 2:
                        ar1Var.W0();
                        String str = ar1Var.v;
                        if ((str != null ? ar1Var.V0(str) : null) == null && (vq1Var = ar1Var.B) != null) {
                            vq1Var.a();
                        }
                        break;
                    default:
                        nw4 nw4Var2 = ar1Var.p;
                        ComputerDetailsViewModel computerDetailsViewModel2 = ar1Var.f350o;
                        nw4Var2.postValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        final byte b4 = 3;
        this.E = companion.getInstance().voidSignalCallback(new Function0(this) { // from class: o.zq1
            public final /* synthetic */ ar1 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                vq1 vq1Var;
                byte b5 = b4;
                f88 f88Var = f88.a;
                ar1 ar1Var = this.n;
                switch (b5) {
                    case 0:
                        ar1Var.x.d();
                        break;
                    case 1:
                        ar1Var.W0();
                        break;
                    case 2:
                        ar1Var.W0();
                        String str = ar1Var.v;
                        if ((str != null ? ar1Var.V0(str) : null) == null && (vq1Var = ar1Var.B) != null) {
                            vq1Var.a();
                        }
                        break;
                    default:
                        nw4 nw4Var2 = ar1Var.p;
                        ComputerDetailsViewModel computerDetailsViewModel2 = ar1Var.f350o;
                        nw4Var2.postValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel2.a, computerDetailsViewModel2));
                        break;
                }
                return f88Var;
            }
        });
        nw4Var.setValue(ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_GetDisplayName(computerDetailsViewModel.a, computerDetailsViewModel));
    }

    @Override // o.oe8
    public final void U0() {
        VoidSignalCallback voidSignalCallback = this.D;
        voidSignalCallback.Disconnect();
        VoidSignalCallback voidSignalCallback2 = this.E;
        voidSignalCallback2.Disconnect();
        voidSignalCallback.Disconnect();
        this.C.Disconnect();
        voidSignalCallback2.Disconnect();
        this.f350o.b();
        IAlertViewModelWrapper iAlertViewModelWrapper = this.w;
        if (iAlertViewModelWrapper != null) {
            iAlertViewModelWrapper.a();
        }
    }

    public final IAlertViewModelWrapper V0(String str) {
        Iterator<E> it = this.f350o.a().iterator();
        it.getClass();
        while (it.hasNext()) {
            IAlertViewModelWrapper iAlertViewModelWrapper = (IAlertViewModelWrapper) it.next();
            iAlertViewModelWrapper.getClass();
            long jIAlertViewModelWrapper_GetID = IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_GetID(iAlertViewModelWrapper.a, iAlertViewModelWrapper);
            PListAlertID pListAlertID = new PListAlertID();
            pListAlertID.b = true;
            pListAlertID.a = jIAlertViewModelWrapper_GetID;
            if (im3.n(PListAlertIDSWIGJNI.PListAlertID_GetInternalID(jIAlertViewModelWrapper_GetID, pListAlertID), str)) {
                return iAlertViewModelWrapper;
            }
        }
        return null;
    }

    public final void W0() {
        g1 g1Var = this.n;
        GroupMemberListElementViewModel groupMemberListElementViewModel = g1Var.n;
        this.q.postValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowConnect(groupMemberListElementViewModel.a, groupMemberListElementViewModel)));
        GroupMemberListElementViewModel groupMemberListElementViewModel2 = g1Var.n;
        this.r.postValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowConnectConfirm(groupMemberListElementViewModel2.a, groupMemberListElementViewModel2)));
        this.s.postValue(Boolean.valueOf(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_ShowChatTo(groupMemberListElementViewModel2.a, groupMemberListElementViewModel2)));
        IAlertViewModelWrapper iAlertViewModelWrapper = this.w;
        this.t.postValue(iAlertViewModelWrapper != null ? Boolean.valueOf(IAlertViewModelWrapperSWIGJNI.IAlertViewModelWrapper_IsAcknowledged(iAlertViewModelWrapper.a, iAlertViewModelWrapper)) : null);
    }
}
