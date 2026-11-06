package com.teamviewer.apidefinitions.remotecontrol.apis;

import com.teamviewer.apidefinitions.remotecontrol.models.PreferenceGroupInvitationTemplates;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.ox2;
import o.qc5;
import o.qi0;
import o.yc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\t\u001a\u00020\u0003H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/apis/InvitationApi;", "", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceGroupInvitationTemplates;", "getInvitationTemplates", "()Lo/qi0;", "Lo/f88;", "openNativeInvitationDialog", "resetInvitationTemplatesToDefault", "preferenceGroupInvitationTemplates", "setInvitationTemplates", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceGroupInvitationTemplates;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InvitationApi {
    @ox2("preferences/invitationtemplates")
    qi0<PreferenceGroupInvitationTemplates> getInvitationTemplates();

    @yc5("preferences/invitationtemplates/native")
    qi0<f88> openNativeInvitationDialog();

    @yc5("preferences/invitationtemplates")
    qi0<PreferenceGroupInvitationTemplates> resetInvitationTemplatesToDefault();

    @qc5("preferences/invitationtemplates")
    qi0<PreferenceGroupInvitationTemplates> setInvitationTemplates(@j80 PreferenceGroupInvitationTemplates preferenceGroupInvitationTemplates);
}
