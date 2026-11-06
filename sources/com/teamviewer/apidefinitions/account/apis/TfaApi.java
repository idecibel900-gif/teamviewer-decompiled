package com.teamviewer.apidefinitions.account.apis;

import com.teamviewer.apidefinitions.account.models.ConfirmTfaActivationRequestBody;
import com.teamviewer.apidefinitions.account.models.DeactivateTfaWithRecoveryCodeRequestBody;
import com.teamviewer.apidefinitions.account.models.DeactivateTfaWithSecurityCodeRequestBody;
import com.teamviewer.apidefinitions.account.models.RequestTfaActivationResponseBody;
import com.teamviewer.apidefinitions.account.models.TfaRecoveryCodeResponseBody;
import com.teamviewer.apidefinitions.account.models.TfaStatusData;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.ox2;
import o.qi0;
import o.sy5;
import o.yc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H'¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/account/apis/TfaApi;", "", "Lcom/teamviewer/apidefinitions/account/models/ConfirmTfaActivationRequestBody;", "confirmTfaActivationRequestBody", "Lo/qi0;", "Lo/f88;", "confirmActivation", "(Lcom/teamviewer/apidefinitions/account/models/ConfirmTfaActivationRequestBody;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/DeactivateTfaWithRecoveryCodeRequestBody;", "deactivateTfaWithRecoveryCodeRequestBody", "deactivateWithRecoveryCode", "(Lcom/teamviewer/apidefinitions/account/models/DeactivateTfaWithRecoveryCodeRequestBody;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/DeactivateTfaWithSecurityCodeRequestBody;", "deactivateTfaWithSecurityCodeRequestBody", "deactivateWithSecurityCode", "(Lcom/teamviewer/apidefinitions/account/models/DeactivateTfaWithSecurityCodeRequestBody;)Lo/qi0;", "", "securityCode", "Lcom/teamviewer/apidefinitions/account/models/TfaRecoveryCodeResponseBody;", "getRecoveryCode", "(Ljava/lang/String;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/TfaStatusData;", "getStatus", "()Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/RequestTfaActivationResponseBody;", "requestActivation", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TfaApi {
    @yc5("tfa/confirmactivation")
    qi0<f88> confirmActivation(@j80 ConfirmTfaActivationRequestBody confirmTfaActivationRequestBody);

    @yc5("tfa/deactivatewithrecoverycode")
    qi0<f88> deactivateWithRecoveryCode(@j80 DeactivateTfaWithRecoveryCodeRequestBody deactivateTfaWithRecoveryCodeRequestBody);

    @yc5("tfa/deactivatewithsecuritycode")
    qi0<f88> deactivateWithSecurityCode(@j80 DeactivateTfaWithSecurityCodeRequestBody deactivateTfaWithSecurityCodeRequestBody);

    @ox2("tfa/recoverycode")
    qi0<TfaRecoveryCodeResponseBody> getRecoveryCode(@sy5("securityCode") String securityCode);

    @ox2("tfa/status")
    qi0<TfaStatusData> getStatus();

    @ox2("tfa/requestactivation")
    qi0<RequestTfaActivationResponseBody> requestActivation();
}
