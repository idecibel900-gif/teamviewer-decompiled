package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TokenParams;", "", "token", "", "tokenId", "", "accountId", "ssoVerificationToken", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getTokenId", "()I", "getAccountId", "getSsoVerificationToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TokenParams {
    private final int accountId;
    private final String ssoVerificationToken;
    private final String token;
    private final int tokenId;

    public TokenParams(@sp3(name = "token") String str, @sp3(name = "tokenId") int i, @sp3(name = "accountId") int i2, @sp3(name = "ssoVerificationToken") String str2) {
        str.getClass();
        this.token = str;
        this.tokenId = i;
        this.accountId = i2;
        this.ssoVerificationToken = str2;
    }

    public static /* synthetic */ TokenParams copy$default(TokenParams tokenParams, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tokenParams.token;
        }
        if ((i3 & 2) != 0) {
            i = tokenParams.tokenId;
        }
        if ((i3 & 4) != 0) {
            i2 = tokenParams.accountId;
        }
        if ((i3 & 8) != 0) {
            str2 = tokenParams.ssoVerificationToken;
        }
        return tokenParams.copy(str, i, i2, str2);
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

    public final TokenParams copy(@sp3(name = "token") String token, @sp3(name = "tokenId") int tokenId, @sp3(name = "accountId") int accountId, @sp3(name = "ssoVerificationToken") String ssoVerificationToken) {
        token.getClass();
        return new TokenParams(token, tokenId, accountId, ssoVerificationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenParams)) {
            return false;
        }
        TokenParams tokenParams = (TokenParams) other;
        return im3.n(this.token, tokenParams.token) && this.tokenId == tokenParams.tokenId && this.accountId == tokenParams.accountId && im3.n(this.ssoVerificationToken, tokenParams.ssoVerificationToken);
    }

    public final int getAccountId() {
        return this.accountId;
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
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TokenParams(token=" + this.token + ", tokenId=" + this.tokenId + ", accountId=" + this.accountId + ", ssoVerificationToken=" + this.ssoVerificationToken + ")";
    }

    public /* synthetic */ TokenParams(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2);
    }
}
