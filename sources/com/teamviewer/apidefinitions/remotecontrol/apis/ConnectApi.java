package com.teamviewer.apidefinitions.remotecontrol.apis;

import com.teamviewer.apidefinitions.remotecontrol.models.CapabilitiesByKnownDeviceTeamViewerIdResponse;
import com.teamviewer.apidefinitions.remotecontrol.models.CapabilitiesBySessionCodeResponse;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByIPAddressOrHostNameRequest;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByKnownDeviceTeamViewerIdRequest;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByOrganizationContactRequest;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByPersonalContactRequest;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectBySessionCodeRequest;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByTeamViewerIdAvailability;
import com.teamviewer.apidefinitions.remotecontrol.models.ConnectByTeamViewerIdRequest;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.ox2;
import o.qi0;
import o.xg5;
import o.yc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00022\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0002H'¢\u0006\u0004\b)\u0010\u0005¨\u0006*"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/apis/ConnectApi;", "", "Lo/qi0;", "Lo/f88;", "cancelPendingConnections", "()Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByIPAddressOrHostNameRequest;", "connectByIPAddressOrHostNameRequest", "connectByIPAddressOrHostName", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByIPAddressOrHostNameRequest;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceTeamViewerIdRequest;", "connectByKnownDeviceTeamViewerIdRequest", "connectByKnownDeviceTeamViewerId", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByKnownDeviceTeamViewerIdRequest;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByOrganizationContactRequest;", "connectByOrganizationContactRequest", "connectByOrganizationContact", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByOrganizationContactRequest;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByPersonalContactRequest;", "connectByPersonalContactRequest", "connectByPersonalContact", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByPersonalContactRequest;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectBySessionCodeRequest;", "connectBySessionCodeRequest", "connectBySessionCode", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectBySessionCodeRequest;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdRequest;", "connectByTeamViewerIdRequest", "connectByTeamViewerId", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdRequest;)Lo/qi0;", "", "teamviewerId", "Lcom/teamviewer/apidefinitions/remotecontrol/models/CapabilitiesByKnownDeviceTeamViewerIdResponse;", "getCapabilitiesByKnownDeviceTeamViewerId", "(J)Lo/qi0;", "", "sessioncode", "Lcom/teamviewer/apidefinitions/remotecontrol/models/CapabilitiesBySessionCodeResponse;", "getCapabilitiesBySessionCode", "(I)Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectByTeamViewerIdAvailability;", "getConnectByTeamViewerIdAvailability", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ConnectApi {
    @yc5("connect/cancellation")
    qi0<f88> cancelPendingConnections();

    @yc5("connect/ipaddressorhostname")
    qi0<f88> connectByIPAddressOrHostName(@j80 ConnectByIPAddressOrHostNameRequest connectByIPAddressOrHostNameRequest);

    @yc5("connect/knowndevice")
    qi0<f88> connectByKnownDeviceTeamViewerId(@j80 ConnectByKnownDeviceTeamViewerIdRequest connectByKnownDeviceTeamViewerIdRequest);

    @yc5("connect/contact/organization")
    qi0<f88> connectByOrganizationContact(@j80 ConnectByOrganizationContactRequest connectByOrganizationContactRequest);

    @yc5("connect/contact/personal")
    qi0<f88> connectByPersonalContact(@j80 ConnectByPersonalContactRequest connectByPersonalContactRequest);

    @yc5("connect/sessioncode")
    qi0<f88> connectBySessionCode(@j80 ConnectBySessionCodeRequest connectBySessionCodeRequest);

    @yc5("connect/teamviewer")
    qi0<f88> connectByTeamViewerId(@j80 ConnectByTeamViewerIdRequest connectByTeamViewerIdRequest);

    @ox2("connect/knowndevice/{teamviewerId}/capabilities")
    qi0<CapabilitiesByKnownDeviceTeamViewerIdResponse> getCapabilitiesByKnownDeviceTeamViewerId(@xg5("teamviewerId") long teamviewerId);

    @ox2("connect/sessioncode/{sessioncode}/capabilities")
    qi0<CapabilitiesBySessionCodeResponse> getCapabilitiesBySessionCode(@xg5("sessioncode") int sessioncode);

    @ox2("connect/teamviewer/availability")
    qi0<ConnectByTeamViewerIdAvailability> getConnectByTeamViewerIdAvailability();
}
