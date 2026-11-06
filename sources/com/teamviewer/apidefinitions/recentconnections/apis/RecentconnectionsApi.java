package com.teamviewer.apidefinitions.recentconnections.apis;

import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsItem;
import java.util.List;
import kotlin.Metadata;
import o.ox2;
import o.qi0;
import o.sy5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/recentconnections/apis/RecentconnectionsApi;", "", "", "maximumNumberOfItems", "Lo/qi0;", "", "Lcom/teamviewer/apidefinitions/recentconnections/models/RecentConnectionsItem;", "recentconnections", "(I)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RecentconnectionsApi {
    @ox2("recentconnections")
    qi0<List<RecentConnectionsItem>> recentconnections(@sy5("maximumNumberOfItems") int maximumNumberOfItems);
}
