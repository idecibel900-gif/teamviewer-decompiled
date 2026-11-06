package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2ViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class o26 implements se8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ nc0 c;

    public /* synthetic */ o26(Object obj, nc0 nc0Var, byte b) {
        this.a = b;
        this.b = obj;
        this.c = nc0Var;
    }

    @Override // o.se8
    public final oe8 a(Class cls) {
        byte b = this.a;
        nc0 nc0Var = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new re0((GroupMemberListElementViewModel) obj, nc0Var);
            case 1:
                return new mc0((GroupMemberListElementViewModel) obj, nc0Var);
            default:
                return new xd0((IManagedDeviceV2ViewModel) obj, nc0Var);
        }
    }
}
