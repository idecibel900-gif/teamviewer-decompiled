package com.teamviewer.apidefinitions.rolloutconfigurations.apis;

import com.teamviewer.apidefinitions.rolloutconfigurations.models.OnboardingDevicesSendEmailInvitationsParams;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.OnboardingDevicesSendEmailInvitationsResponse;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfiguration;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfigurationsGetResponse;
import java.util.UUID;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;
import o.zc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u0011\u0010\u0010J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/rolloutconfigurations/apis/RolloutconfigurationsApi;", "", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;", "rolloutConfiguration", "Lo/qi0;", "createRolloutConfiguration", "(Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfiguration;)Lo/qi0;", "Ljava/util/UUID;", "rolloutConfigurationId", "Lo/f88;", "deleteRolloutConfiguration", "(Ljava/util/UUID;)Lo/qi0;", "", "continuationToken", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/RolloutConfigurationsGetResponse;", "getRolloutConfigurations", "(Ljava/lang/String;)Lo/qi0;", "getUnencryptedDataRolloutConfigurations", "configId", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/OnboardingDevicesSendEmailInvitationsParams;", "onboardingDevicesSendEmailInvitationsParams", "Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/OnboardingDevicesSendEmailInvitationsResponse;", "onboardingDevicesSendEmailInvitations", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/OnboardingDevicesSendEmailInvitationsParams;)Lo/qi0;", "updateRolloutConfiguration", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RolloutconfigurationsApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 getRolloutConfigurations$default(RolloutconfigurationsApi rolloutconfigurationsApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getRolloutConfigurations");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return rolloutconfigurationsApi.getRolloutConfigurations(str);
        }

        public static /* synthetic */ qi0 getUnencryptedDataRolloutConfigurations$default(RolloutconfigurationsApi rolloutconfigurationsApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getUnencryptedDataRolloutConfigurations");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return rolloutconfigurationsApi.getUnencryptedDataRolloutConfigurations(str);
        }
    }

    @yc5("rolloutconfigurations")
    qi0<RolloutConfiguration> createRolloutConfiguration(@j80 RolloutConfiguration rolloutConfiguration);

    @jg1("rolloutconfigurations")
    qi0<f88> deleteRolloutConfiguration(@sy5("rolloutConfigurationId") UUID rolloutConfigurationId);

    @ox2("rolloutconfigurations")
    qi0<RolloutConfigurationsGetResponse> getRolloutConfigurations(@sy5("continuationToken") String continuationToken);

    @ox2("rolloutconfigurationsunencrypted")
    qi0<RolloutConfigurationsGetResponse> getUnencryptedDataRolloutConfigurations(@sy5("continuationToken") String continuationToken);

    @yc5("onboarding/devices/send-email-invitations/{configId}")
    qi0<OnboardingDevicesSendEmailInvitationsResponse> onboardingDevicesSendEmailInvitations(@xg5("configId") String configId, @j80 OnboardingDevicesSendEmailInvitationsParams onboardingDevicesSendEmailInvitationsParams);

    @zc5("rolloutconfigurations")
    qi0<RolloutConfiguration> updateRolloutConfiguration(@j80 RolloutConfiguration rolloutConfiguration);
}
