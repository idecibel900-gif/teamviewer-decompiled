package com.teamviewer.apidefinitions.remotecontrol.apis;

import com.teamviewer.apidefinitions.remotecontrol.models.PreferenceGroupRemoteControl;
import kotlin.Metadata;
import o.j80;
import o.ox2;
import o.qc5;
import o.qi0;
import o.yc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0003H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/apis/PreferencesApi;", "", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceGroupRemoteControl;", "getRemoteControlPreferences", "()Lo/qi0;", "resetRemoteControlPreferencesToDefault", "preferenceGroupRemoteControl", "setRemoteControlPreferences", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/PreferenceGroupRemoteControl;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PreferencesApi {
    @ox2("preferences")
    qi0<PreferenceGroupRemoteControl> getRemoteControlPreferences();

    @yc5("preferences")
    qi0<PreferenceGroupRemoteControl> resetRemoteControlPreferencesToDefault();

    @qc5("preferences")
    qi0<PreferenceGroupRemoteControl> setRemoteControlPreferences(@j80 PreferenceGroupRemoteControl preferenceGroupRemoteControl);
}
