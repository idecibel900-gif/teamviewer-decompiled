package com.teamviewer.apidefinitions.supportsessions.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionFilterResponse;", "", "isLastPage", "", "supportSessions", "", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;", "<init>", "(ZLjava/util/List;)V", "()Z", "getSupportSessions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionFilterResponse {
    private final boolean isLastPage;
    private final List<SupportSession> supportSessions;

    public SupportSessionFilterResponse(@sp3(name = "isLastPage") boolean z, @sp3(name = "supportSessions") List<SupportSession> list) {
        list.getClass();
        this.isLastPage = z;
        this.supportSessions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportSessionFilterResponse copy$default(SupportSessionFilterResponse supportSessionFilterResponse, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = supportSessionFilterResponse.isLastPage;
        }
        if ((i & 2) != 0) {
            list = supportSessionFilterResponse.supportSessions;
        }
        return supportSessionFilterResponse.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLastPage() {
        return this.isLastPage;
    }

    public final List<SupportSession> component2() {
        return this.supportSessions;
    }

    public final SupportSessionFilterResponse copy(@sp3(name = "isLastPage") boolean isLastPage, @sp3(name = "supportSessions") List<SupportSession> supportSessions) {
        supportSessions.getClass();
        return new SupportSessionFilterResponse(isLastPage, supportSessions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionFilterResponse)) {
            return false;
        }
        SupportSessionFilterResponse supportSessionFilterResponse = (SupportSessionFilterResponse) other;
        return this.isLastPage == supportSessionFilterResponse.isLastPage && im3.n(this.supportSessions, supportSessionFilterResponse.supportSessions);
    }

    public final List<SupportSession> getSupportSessions() {
        return this.supportSessions;
    }

    public int hashCode() {
        return this.supportSessions.hashCode() + (Boolean.hashCode(this.isLastPage) * 31);
    }

    public final boolean isLastPage() {
        return this.isLastPage;
    }

    public String toString() {
        return "SupportSessionFilterResponse(isLastPage=" + this.isLastPage + ", supportSessions=" + this.supportSessions + ")";
    }
}
