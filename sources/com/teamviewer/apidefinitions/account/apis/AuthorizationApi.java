package com.teamviewer.apidefinitions.account.apis;

import com.teamviewer.apidefinitions.account.models.LoginWithTokenParams;
import com.teamviewer.apidefinitions.account.models.SessionToken;
import com.teamviewer.apidefinitions.account.models.TokenParams;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.ox2;
import o.qi0;
import o.xg5;
import o.yc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/teamviewer/apidefinitions/account/apis/AuthorizationApi;", "", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/TokenParams;", "createLoginToken", "()Lo/qi0;", "", "sessioncode", "Lcom/teamviewer/apidefinitions/account/models/SessionToken;", "getSessionToken", "(I)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/LoginWithTokenParams;", "loginWithTokenParams", "Lo/f88;", "withToken", "(Lcom/teamviewer/apidefinitions/account/models/LoginWithTokenParams;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AuthorizationApi {
    @yc5("authorize/token")
    qi0<TokenParams> createLoginToken();

    @ox2("authorize/sessiontoken/{sessioncode}")
    qi0<SessionToken> getSessionToken(@xg5("sessioncode") int sessioncode);

    @yc5("authorize/withtoken")
    qi0<f88> withToken(@j80 LoginWithTokenParams loginWithTokenParams);
}
