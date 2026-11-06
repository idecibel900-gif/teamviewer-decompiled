package com.teamviewer.apidefinitions.recentconnections.apis;

import com.teamviewer.apidefinitions.recentconnections.models.GetLocalRecentConnectionsResponse;
import kotlin.Metadata;
import o.f88;
import o.jg1;
import o.ox2;
import o.qi0;
import o.xg5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H'¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/apis/LocalrecentconnectionsApi;", "", "", "connectionId", "Lo/qi0;", "Lo/f88;", "deleteLocalRecentConnection", "(Ljava/lang/String;)Lo/qi0;", "deleteLocalRecentConnections", "()Lo/qi0;", "Lcom/teamviewer/apidefinitions/recentconnections/models/GetLocalRecentConnectionsResponse;", "getLocalRecentConnections", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocalrecentconnectionsApi {
    @jg1("local/{connectionId}")
    qi0<f88> deleteLocalRecentConnection(@xg5("connectionId") String connectionId);

    @jg1("local")
    qi0<f88> deleteLocalRecentConnections();

    @ox2("local")
    qi0<GetLocalRecentConnectionsResponse> getLocalRecentConnections();
}
