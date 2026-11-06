package com.teamviewer.apidefinitions.account.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010 Jj\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/LoginTokenMetadata;", "", "tokenId", "", "tokenType", "Lcom/teamviewer/apidefinitions/account/models/LoginTokenType;", "operatingSystem", "", "teamviewerId", "", "lastLogin", "Ljava/time/OffsetDateTime;", "country", "city", "usedByCurrentSession", "", "<init>", "(ILcom/teamviewer/apidefinitions/account/models/LoginTokenType;Ljava/lang/String;Ljava/lang/Long;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTokenId", "()I", "getTokenType", "()Lcom/teamviewer/apidefinitions/account/models/LoginTokenType;", "getOperatingSystem", "()Ljava/lang/String;", "getTeamviewerId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastLogin", "()Ljava/time/OffsetDateTime;", "getCountry", "getCity", "getUsedByCurrentSession", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILcom/teamviewer/apidefinitions/account/models/LoginTokenType;Ljava/lang/String;Ljava/lang/Long;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/account/models/LoginTokenMetadata;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginTokenMetadata {
    private final String city;
    private final String country;
    private final OffsetDateTime lastLogin;
    private final String operatingSystem;
    private final Long teamviewerId;
    private final int tokenId;
    private final LoginTokenType tokenType;
    private final Boolean usedByCurrentSession;

    public /* synthetic */ LoginTokenMetadata(int i, LoginTokenType loginTokenType, String str, Long l, OffsetDateTime offsetDateTime, String str2, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, loginTokenType, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : offsetDateTime, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : bool);
    }

    public static /* synthetic */ LoginTokenMetadata copy$default(LoginTokenMetadata loginTokenMetadata, int i, LoginTokenType loginTokenType, String str, Long l, OffsetDateTime offsetDateTime, String str2, String str3, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = loginTokenMetadata.tokenId;
        }
        if ((i2 & 2) != 0) {
            loginTokenType = loginTokenMetadata.tokenType;
        }
        if ((i2 & 4) != 0) {
            str = loginTokenMetadata.operatingSystem;
        }
        if ((i2 & 8) != 0) {
            l = loginTokenMetadata.teamviewerId;
        }
        if ((i2 & 16) != 0) {
            offsetDateTime = loginTokenMetadata.lastLogin;
        }
        if ((i2 & 32) != 0) {
            str2 = loginTokenMetadata.country;
        }
        if ((i2 & 64) != 0) {
            str3 = loginTokenMetadata.city;
        }
        if ((i2 & 128) != 0) {
            bool = loginTokenMetadata.usedByCurrentSession;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        String str5 = str2;
        return loginTokenMetadata.copy(i, loginTokenType, str, l, offsetDateTime2, str5, str4, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTokenId() {
        return this.tokenId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LoginTokenType getTokenType() {
        return this.tokenType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTeamviewerId() {
        return this.teamviewerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getLastLogin() {
        return this.lastLogin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getUsedByCurrentSession() {
        return this.usedByCurrentSession;
    }

    public final LoginTokenMetadata copy(@sp3(name = "tokenId") int tokenId, @sp3(name = "tokenType") LoginTokenType tokenType, @sp3(name = "operatingSystem") String operatingSystem, @sp3(name = "teamviewerId") Long teamviewerId, @sp3(name = "lastLogin") OffsetDateTime lastLogin, @sp3(name = "country") String country, @sp3(name = "city") String city, @sp3(name = "usedByCurrentSession") Boolean usedByCurrentSession) {
        tokenType.getClass();
        return new LoginTokenMetadata(tokenId, tokenType, operatingSystem, teamviewerId, lastLogin, country, city, usedByCurrentSession);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginTokenMetadata)) {
            return false;
        }
        LoginTokenMetadata loginTokenMetadata = (LoginTokenMetadata) other;
        return this.tokenId == loginTokenMetadata.tokenId && this.tokenType == loginTokenMetadata.tokenType && im3.n(this.operatingSystem, loginTokenMetadata.operatingSystem) && im3.n(this.teamviewerId, loginTokenMetadata.teamviewerId) && im3.n(this.lastLogin, loginTokenMetadata.lastLogin) && im3.n(this.country, loginTokenMetadata.country) && im3.n(this.city, loginTokenMetadata.city) && im3.n(this.usedByCurrentSession, loginTokenMetadata.usedByCurrentSession);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final OffsetDateTime getLastLogin() {
        return this.lastLogin;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final Long getTeamviewerId() {
        return this.teamviewerId;
    }

    public final int getTokenId() {
        return this.tokenId;
    }

    public final LoginTokenType getTokenType() {
        return this.tokenType;
    }

    public final Boolean getUsedByCurrentSession() {
        return this.usedByCurrentSession;
    }

    public int hashCode() {
        int iHashCode = (this.tokenType.hashCode() + (Integer.hashCode(this.tokenId) * 31)) * 31;
        String str = this.operatingSystem;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.teamviewerId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.lastLogin;
        int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str2 = this.country;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.usedByCurrentSession;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "LoginTokenMetadata(tokenId=" + this.tokenId + ", tokenType=" + this.tokenType + ", operatingSystem=" + this.operatingSystem + ", teamviewerId=" + this.teamviewerId + ", lastLogin=" + this.lastLogin + ", country=" + this.country + ", city=" + this.city + ", usedByCurrentSession=" + this.usedByCurrentSession + ")";
    }

    public LoginTokenMetadata(@sp3(name = "tokenId") int i, @sp3(name = "tokenType") LoginTokenType loginTokenType, @sp3(name = "operatingSystem") String str, @sp3(name = "teamviewerId") Long l, @sp3(name = "lastLogin") OffsetDateTime offsetDateTime, @sp3(name = "country") String str2, @sp3(name = "city") String str3, @sp3(name = "usedByCurrentSession") Boolean bool) {
        loginTokenType.getClass();
        this.tokenId = i;
        this.tokenType = loginTokenType;
        this.operatingSystem = str;
        this.teamviewerId = l;
        this.lastLogin = offsetDateTime;
        this.country = str2;
        this.city = str3;
        this.usedByCurrentSession = bool;
    }
}
