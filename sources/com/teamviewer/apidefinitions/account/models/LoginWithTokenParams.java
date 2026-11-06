package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JD\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/LoginWithTokenParams;", "", "token", "", "tokenId", "", "accountId", "ssoVerificationToken", "keepMeSignedIn", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Boolean;)V", "getToken", "()Ljava/lang/String;", "getTokenId", "()I", "getAccountId", "getSsoVerificationToken", "getKeepMeSignedIn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/account/models/LoginWithTokenParams;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginWithTokenParams {
    private final int accountId;
    private final Boolean keepMeSignedIn;
    private final String ssoVerificationToken;
    private final String token;
    private final int tokenId;

    public LoginWithTokenParams(@sp3(name = "token") String str, @sp3(name = "tokenId") int i, @sp3(name = "accountId") int i2, @sp3(name = "ssoVerificationToken") String str2, @sp3(name = "keepMeSignedIn") Boolean bool) {
        str.getClass();
        this.token = str;
        this.tokenId = i;
        this.accountId = i2;
        this.ssoVerificationToken = str2;
        this.keepMeSignedIn = bool;
    }

    public static /* synthetic */ LoginWithTokenParams copy$default(LoginWithTokenParams loginWithTokenParams, String str, int i, int i2, String str2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = loginWithTokenParams.token;
        }
        if ((i3 & 2) != 0) {
            i = loginWithTokenParams.tokenId;
        }
        if ((i3 & 4) != 0) {
            i2 = loginWithTokenParams.accountId;
        }
        if ((i3 & 8) != 0) {
            str2 = loginWithTokenParams.ssoVerificationToken;
        }
        if ((i3 & 16) != 0) {
            bool = loginWithTokenParams.keepMeSignedIn;
        }
        Boolean bool2 = bool;
        int i4 = i2;
        return loginWithTokenParams.copy(str, i, i4, str2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTokenId() {
        return this.tokenId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSsoVerificationToken() {
        return this.ssoVerificationToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getKeepMeSignedIn() {
        return this.keepMeSignedIn;
    }

    public final LoginWithTokenParams copy(@sp3(name = "token") String token, @sp3(name = "tokenId") int tokenId, @sp3(name = "accountId") int accountId, @sp3(name = "ssoVerificationToken") String ssoVerificationToken, @sp3(name = "keepMeSignedIn") Boolean keepMeSignedIn) {
        token.getClass();
        return new LoginWithTokenParams(token, tokenId, accountId, ssoVerificationToken, keepMeSignedIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginWithTokenParams)) {
            return false;
        }
        LoginWithTokenParams loginWithTokenParams = (LoginWithTokenParams) other;
        return im3.n(this.token, loginWithTokenParams.token) && this.tokenId == loginWithTokenParams.tokenId && this.accountId == loginWithTokenParams.accountId && im3.n(this.ssoVerificationToken, loginWithTokenParams.ssoVerificationToken) && im3.n(this.keepMeSignedIn, loginWithTokenParams.keepMeSignedIn);
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final Boolean getKeepMeSignedIn() {
        return this.keepMeSignedIn;
    }

    public final String getSsoVerificationToken() {
        return this.ssoVerificationToken;
    }

    public final String getToken() {
        return this.token;
    }

    public final int getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        int iA = fx3.a(this.accountId, fx3.a(this.tokenId, this.token.hashCode() * 31, 31), 31);
        String str = this.ssoVerificationToken;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.keepMeSignedIn;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "LoginWithTokenParams(token=" + this.token + ", tokenId=" + this.tokenId + ", accountId=" + this.accountId + ", ssoVerificationToken=" + this.ssoVerificationToken + ", keepMeSignedIn=" + this.keepMeSignedIn + ")";
    }

    public /* synthetic */ LoginWithTokenParams(String str, int i, int i2, String str2, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : bool);
    }
}
