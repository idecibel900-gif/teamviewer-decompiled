package com.teamviewer.apidefinitions.policies.models;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/ResolveNamesResponse;", "", "resolvedAccounts", "", "", "", "resolvedCompanies", "unknown", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getResolvedAccounts", "()Ljava/util/Map;", "getResolvedCompanies", "getUnknown", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResolveNamesResponse {
    private final Map<String, Integer> resolvedAccounts;
    private final Map<String, Integer> resolvedCompanies;
    private final List<String> unknown;

    public ResolveNamesResponse(@sp3(name = "resolvedAccounts") Map<String, Integer> map, @sp3(name = "resolvedCompanies") Map<String, Integer> map2, @sp3(name = "unknown") List<String> list) {
        map.getClass();
        map2.getClass();
        list.getClass();
        this.resolvedAccounts = map;
        this.resolvedCompanies = map2;
        this.unknown = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolveNamesResponse copy$default(ResolveNamesResponse resolveNamesResponse, Map map, Map map2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = resolveNamesResponse.resolvedAccounts;
        }
        if ((i & 2) != 0) {
            map2 = resolveNamesResponse.resolvedCompanies;
        }
        if ((i & 4) != 0) {
            list = resolveNamesResponse.unknown;
        }
        return resolveNamesResponse.copy(map, map2, list);
    }

    public final Map<String, Integer> component1() {
        return this.resolvedAccounts;
    }

    public final Map<String, Integer> component2() {
        return this.resolvedCompanies;
    }

    public final List<String> component3() {
        return this.unknown;
    }

    public final ResolveNamesResponse copy(@sp3(name = "resolvedAccounts") Map<String, Integer> resolvedAccounts, @sp3(name = "resolvedCompanies") Map<String, Integer> resolvedCompanies, @sp3(name = "unknown") List<String> unknown) {
        resolvedAccounts.getClass();
        resolvedCompanies.getClass();
        unknown.getClass();
        return new ResolveNamesResponse(resolvedAccounts, resolvedCompanies, unknown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveNamesResponse)) {
            return false;
        }
        ResolveNamesResponse resolveNamesResponse = (ResolveNamesResponse) other;
        return im3.n(this.resolvedAccounts, resolveNamesResponse.resolvedAccounts) && im3.n(this.resolvedCompanies, resolveNamesResponse.resolvedCompanies) && im3.n(this.unknown, resolveNamesResponse.unknown);
    }

    public final Map<String, Integer> getResolvedAccounts() {
        return this.resolvedAccounts;
    }

    public final Map<String, Integer> getResolvedCompanies() {
        return this.resolvedCompanies;
    }

    public final List<String> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return this.unknown.hashCode() + ((this.resolvedCompanies.hashCode() + (this.resolvedAccounts.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ResolveNamesResponse(resolvedAccounts=" + this.resolvedAccounts + ", resolvedCompanies=" + this.resolvedCompanies + ", unknown=" + this.unknown + ")";
    }
}
