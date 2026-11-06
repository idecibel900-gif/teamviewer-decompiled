package com.teamviewer.apidefinitions.account.apis;

import com.teamviewer.apidefinitions.account.models.SessionToken;
import kotlin.Metadata;
import o.ox2;
import o.qi0;
import o.xg5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/apidefinitions/account/apis/SessioncodeApi;", "", "", "sessioncode", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/SessionToken;", "getSessionToken", "(I)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SessioncodeApi {
    @ox2("authorize/sessiontoken/{sessioncode}")
    qi0<SessionToken> getSessionToken(@xg5("sessioncode") int sessioncode);
}
