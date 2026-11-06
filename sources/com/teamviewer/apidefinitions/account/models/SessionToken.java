package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/SessionToken;", "", "sessionToken", "", "<init>", "(Ljava/lang/String;)V", "getSessionToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionToken {
    private final String sessionToken;

    public SessionToken(@sp3(name = "sessionToken") String str) {
        str.getClass();
        this.sessionToken = str;
    }

    public static /* synthetic */ SessionToken copy$default(SessionToken sessionToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionToken.sessionToken;
        }
        return sessionToken.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final SessionToken copy(@sp3(name = "sessionToken") String sessionToken) {
        sessionToken.getClass();
        return new SessionToken(sessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionToken) && im3.n(this.sessionToken, ((SessionToken) other).sessionToken);
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        return this.sessionToken.hashCode();
    }

    public String toString() {
        return fx3.g("SessionToken(sessionToken=", this.sessionToken, ")");
    }
}
