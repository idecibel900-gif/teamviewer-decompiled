package o;

import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class og5 implements vd2 {
    public final /* synthetic */ pg5 a;

    public og5(pg5 pg5Var) {
        this.a = pg5Var;
    }

    @Override // o.vd2
    public final void a(EventType eventType, he2 he2Var) {
        eventType.getClass();
        he2Var.getClass();
        ParticipantIdentifier participantIdentifierDeserialize = ParticipantIdentifier.Deserialize(he2Var.d(EventParam.EPARAM_PARTICIPANT_ID));
        pg5 pg5Var = this.a;
        if (im3.n(participantIdentifierDeserialize, pg5Var.b())) {
            IAccountAndroid iAccountAndroidGetAccount = BackendContainerAndroid.GetInstance().GetAccount();
            if (iAccountAndroidGetAccount != null && iAccountAndroidGetAccount.IsLoggedIn()) {
                ye4.a.b("JParticipantManager", "Set account data");
                pg5Var.a.SetMyAccountData(iAccountAndroidGetAccount.GetAccountID(), iAccountAndroidGetAccount.GetAccountPictureUrl(), iAccountAndroidGetAccount.GetDisplayName());
            }
            EventHub.e.f().f(this);
        }
    }
}
