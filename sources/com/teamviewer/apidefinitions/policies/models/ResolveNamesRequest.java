package com.teamviewer.apidefinitions.policies.models;

import java.util.List;
import kotlin.Metadata;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/ResolveNamesRequest;", "", "accountOrCompanyNames", "", "", "<init>", "(Ljava/util/List;)V", "getAccountOrCompanyNames", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResolveNamesRequest {
    private final List<String> accountOrCompanyNames;

    public ResolveNamesRequest(@sp3(name = "accountOrCompanyNames") List<String> list) {
        list.getClass();
        this.accountOrCompanyNames = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolveNamesRequest copy$default(ResolveNamesRequest resolveNamesRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resolveNamesRequest.accountOrCompanyNames;
        }
        return resolveNamesRequest.copy(list);
    }

    public final List<String> component1() {
        return this.accountOrCompanyNames;
    }

    public final ResolveNamesRequest copy(@sp3(name = "accountOrCompanyNames") List<String> accountOrCompanyNames) {
        accountOrCompanyNames.getClass();
        return new ResolveNamesRequest(accountOrCompanyNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResolveNamesRequest) && im3.n(this.accountOrCompanyNames, ((ResolveNamesRequest) other).accountOrCompanyNames);
    }

    public final List<String> getAccountOrCompanyNames() {
        return this.accountOrCompanyNames;
    }

    public int hashCode() {
        return this.accountOrCompanyNames.hashCode();
    }

    public String toString() {
        return fx3.i("ResolveNamesRequest(accountOrCompanyNames=", this.accountOrCompanyNames, ")");
    }
}
