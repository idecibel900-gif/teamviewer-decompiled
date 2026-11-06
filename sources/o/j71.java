package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j71 extends oe8 implements la3 {
    public final ContactEditViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ContactDetailsViewModel f1136o;
    public final GroupListViewModel p = ds1.l(true);
    public final HashMap q = new HashMap();
    public final io.sentry.android.core.u0 r = new io.sentry.android.core.u0((byte) 5);
    public final VoidSignalCallback s;

    public j71(ContactEditViewModel contactEditViewModel, ContactDetailsViewModel contactDetailsViewModel) {
        this.n = contactEditViewModel;
        this.f1136o = contactDetailsViewModel;
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new zz0(this, (byte) 4));
        this.s = voidSignalCallback;
        ContactDetailsViewModelSWIGJNI.ContactDetailsViewModel_RegisterForContactDelete(contactDetailsViewModel.a, contactDetailsViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // o.oe8
    public final void U0() {
        this.s.Disconnect();
        this.n.a();
        this.f1136o.a();
        this.p.b();
    }
}
