package com.teamviewer.apidefinitions.account.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/LoginTokenMetadataPage;", "", "tokens", "", "Lcom/teamviewer/apidefinitions/account/models/LoginTokenMetadata;", "continuationToken", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTokens", "()Ljava/util/List;", "getContinuationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginTokenMetadataPage {
    private final String continuationToken;
    private final List<LoginTokenMetadata> tokens;

    public LoginTokenMetadataPage(@sp3(name = "tokens") List<LoginTokenMetadata> list, @sp3(name = "continuationToken") String str) {
        list.getClass();
        this.tokens = list;
        this.continuationToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginTokenMetadataPage copy$default(LoginTokenMetadataPage loginTokenMetadataPage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loginTokenMetadataPage.tokens;
        }
        if ((i & 2) != 0) {
            str = loginTokenMetadataPage.continuationToken;
        }
        return loginTokenMetadataPage.copy(list, str);
    }

    public final List<LoginTokenMetadata> component1() {
        return this.tokens;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final LoginTokenMetadataPage copy(@sp3(name = "tokens") List<LoginTokenMetadata> tokens, @sp3(name = "continuationToken") String continuationToken) {
        tokens.getClass();
        return new LoginTokenMetadataPage(tokens, continuationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginTokenMetadataPage)) {
            return false;
        }
        LoginTokenMetadataPage loginTokenMetadataPage = (LoginTokenMetadataPage) other;
        return im3.n(this.tokens, loginTokenMetadataPage.tokens) && im3.n(this.continuationToken, loginTokenMetadataPage.continuationToken);
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final List<LoginTokenMetadata> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        int iHashCode = this.tokens.hashCode() * 31;
        String str = this.continuationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LoginTokenMetadataPage(tokens=" + this.tokens + ", continuationToken=" + this.continuationToken + ")";
    }

    public /* synthetic */ LoginTokenMetadataPage(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
