package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/PromptForConfirmationContext;", "", "accountId", "", "accountName", "accountPictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAccountName", "getAccountPictureUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromptForConfirmationContext {
    private final String accountId;
    private final String accountName;
    private final String accountPictureUrl;

    public PromptForConfirmationContext(@sp3(name = "accountId") String str, @sp3(name = "accountName") String str2, @sp3(name = "accountPictureUrl") String str3) {
        str.getClass();
        str2.getClass();
        this.accountId = str;
        this.accountName = str2;
        this.accountPictureUrl = str3;
    }

    public static /* synthetic */ PromptForConfirmationContext copy$default(PromptForConfirmationContext promptForConfirmationContext, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promptForConfirmationContext.accountId;
        }
        if ((i & 2) != 0) {
            str2 = promptForConfirmationContext.accountName;
        }
        if ((i & 4) != 0) {
            str3 = promptForConfirmationContext.accountPictureUrl;
        }
        return promptForConfirmationContext.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountPictureUrl() {
        return this.accountPictureUrl;
    }

    public final PromptForConfirmationContext copy(@sp3(name = "accountId") String accountId, @sp3(name = "accountName") String accountName, @sp3(name = "accountPictureUrl") String accountPictureUrl) {
        accountId.getClass();
        accountName.getClass();
        return new PromptForConfirmationContext(accountId, accountName, accountPictureUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptForConfirmationContext)) {
            return false;
        }
        PromptForConfirmationContext promptForConfirmationContext = (PromptForConfirmationContext) other;
        return im3.n(this.accountId, promptForConfirmationContext.accountId) && im3.n(this.accountName, promptForConfirmationContext.accountName) && im3.n(this.accountPictureUrl, promptForConfirmationContext.accountPictureUrl);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getAccountPictureUrl() {
        return this.accountPictureUrl;
    }

    public int hashCode() {
        int iE = to7.e(this.accountId.hashCode() * 31, 31, this.accountName);
        String str = this.accountPictureUrl;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.accountId;
        String str2 = this.accountName;
        return e41.l(e41.o("PromptForConfirmationContext(accountId=", str, ", accountName=", str2, ", accountPictureUrl="), this.accountPictureUrl, ")");
    }

    public /* synthetic */ PromptForConfirmationContext(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
