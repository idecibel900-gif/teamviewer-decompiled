package com.teamviewer.apidefinitions.supportsessions.apis;

import com.teamviewer.apidefinitions.supportsessions.models.SendEmailInviteResponse;
import com.teamviewer.apidefinitions.supportsessions.models.SendSMSInviteResponse;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionCreationParams;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilter;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilterResponse;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionSendMailParams;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionSendSMSParams;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionUpdateParams;
import java.util.List;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qc5;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\"\u001a\u00020!H'¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/apis/SupportsessionsApi;", "", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionCreationParams;", "supportSessionCreationParams", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;", "createSupportSession", "(Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionCreationParams;)Lo/qi0;", "", "sessioncode", "Lo/f88;", "deleteSupportSession", "(I)Lo/qi0;", "", "includeAssistAr", "", "getSupportSessions", "(Ljava/lang/Boolean;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionFilter;", "supportSessionFilter", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionFilterResponse;", "getSupportSessionsFiltered", "(Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionFilter;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionSendMailParams;", "supportSessionSendMailParams", "Lcom/teamviewer/apidefinitions/supportsessions/models/SendEmailInviteResponse;", "supportsessionsendmail", "(ILcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionSendMailParams;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionSendSMSParams;", "supportSessionSendSMSParams", "Lcom/teamviewer/apidefinitions/supportsessions/models/SendSMSInviteResponse;", "supportsessionsendsms", "(ILcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionSendSMSParams;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionUpdateParams;", "supportSessionUpdateParams", "updateSupportSession", "(ILcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionUpdateParams;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SupportsessionsApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 getSupportSessions$default(SupportsessionsApi supportsessionsApi, Boolean bool, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getSupportSessions");
                return null;
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            return supportsessionsApi.getSupportSessions(bool);
        }
    }

    @yc5("supportsessions")
    qi0<SupportSession> createSupportSession(@j80 SupportSessionCreationParams supportSessionCreationParams);

    @jg1("supportsessions/{sessioncode}")
    qi0<f88> deleteSupportSession(@xg5("sessioncode") int sessioncode);

    @ox2("supportsessions")
    qi0<List<SupportSession>> getSupportSessions(@sy5("includeAssistAr") Boolean includeAssistAr);

    @yc5("supportsessions/filtered")
    qi0<SupportSessionFilterResponse> getSupportSessionsFiltered(@j80 SupportSessionFilter supportSessionFilter);

    @yc5("supportsessions/{sessioncode}/sendmail")
    qi0<SendEmailInviteResponse> supportsessionsendmail(@xg5("sessioncode") int sessioncode, @j80 SupportSessionSendMailParams supportSessionSendMailParams);

    @yc5("supportsessions/{sessioncode}/sendsms")
    qi0<SendSMSInviteResponse> supportsessionsendsms(@xg5("sessioncode") int sessioncode, @j80 SupportSessionSendSMSParams supportSessionSendSMSParams);

    @qc5("supportsessions/{sessioncode}")
    qi0<SupportSession> updateSupportSession(@xg5("sessioncode") int sessioncode, @j80 SupportSessionUpdateParams supportSessionUpdateParams);
}
