package com.teamviewer.apidefinitions.manageddevices.models;

import kotlin.Metadata;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/CacheLoadedResponse;", "", "directlyCacheLoaded", "", "groupedCacheLoaded", "managedGroupsCacheLoaded", "unmanagedCacheLoaded", "<init>", "(ZZZZ)V", "getDirectlyCacheLoaded", "()Z", "getGroupedCacheLoaded", "getManagedGroupsCacheLoaded", "getUnmanagedCacheLoaded", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CacheLoadedResponse {
    private final boolean directlyCacheLoaded;
    private final boolean groupedCacheLoaded;
    private final boolean managedGroupsCacheLoaded;
    private final boolean unmanagedCacheLoaded;

    public CacheLoadedResponse(@sp3(name = "directlyCacheLoaded") boolean z, @sp3(name = "groupedCacheLoaded") boolean z2, @sp3(name = "managedGroupsCacheLoaded") boolean z3, @sp3(name = "unmanagedCacheLoaded") boolean z4) {
        this.directlyCacheLoaded = z;
        this.groupedCacheLoaded = z2;
        this.managedGroupsCacheLoaded = z3;
        this.unmanagedCacheLoaded = z4;
    }

    public static /* synthetic */ CacheLoadedResponse copy$default(CacheLoadedResponse cacheLoadedResponse, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cacheLoadedResponse.directlyCacheLoaded;
        }
        if ((i & 2) != 0) {
            z2 = cacheLoadedResponse.groupedCacheLoaded;
        }
        if ((i & 4) != 0) {
            z3 = cacheLoadedResponse.managedGroupsCacheLoaded;
        }
        if ((i & 8) != 0) {
            z4 = cacheLoadedResponse.unmanagedCacheLoaded;
        }
        return cacheLoadedResponse.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDirectlyCacheLoaded() {
        return this.directlyCacheLoaded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getGroupedCacheLoaded() {
        return this.groupedCacheLoaded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getManagedGroupsCacheLoaded() {
        return this.managedGroupsCacheLoaded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUnmanagedCacheLoaded() {
        return this.unmanagedCacheLoaded;
    }

    public final CacheLoadedResponse copy(@sp3(name = "directlyCacheLoaded") boolean directlyCacheLoaded, @sp3(name = "groupedCacheLoaded") boolean groupedCacheLoaded, @sp3(name = "managedGroupsCacheLoaded") boolean managedGroupsCacheLoaded, @sp3(name = "unmanagedCacheLoaded") boolean unmanagedCacheLoaded) {
        return new CacheLoadedResponse(directlyCacheLoaded, groupedCacheLoaded, managedGroupsCacheLoaded, unmanagedCacheLoaded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheLoadedResponse)) {
            return false;
        }
        CacheLoadedResponse cacheLoadedResponse = (CacheLoadedResponse) other;
        return this.directlyCacheLoaded == cacheLoadedResponse.directlyCacheLoaded && this.groupedCacheLoaded == cacheLoadedResponse.groupedCacheLoaded && this.managedGroupsCacheLoaded == cacheLoadedResponse.managedGroupsCacheLoaded && this.unmanagedCacheLoaded == cacheLoadedResponse.unmanagedCacheLoaded;
    }

    public final boolean getDirectlyCacheLoaded() {
        return this.directlyCacheLoaded;
    }

    public final boolean getGroupedCacheLoaded() {
        return this.groupedCacheLoaded;
    }

    public final boolean getManagedGroupsCacheLoaded() {
        return this.managedGroupsCacheLoaded;
    }

    public final boolean getUnmanagedCacheLoaded() {
        return this.unmanagedCacheLoaded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.unmanagedCacheLoaded) + to7.f(to7.f(Boolean.hashCode(this.directlyCacheLoaded) * 31, 31, this.groupedCacheLoaded), 31, this.managedGroupsCacheLoaded);
    }

    public String toString() {
        return "CacheLoadedResponse(directlyCacheLoaded=" + this.directlyCacheLoaded + ", groupedCacheLoaded=" + this.groupedCacheLoaded + ", managedGroupsCacheLoaded=" + this.managedGroupsCacheLoaded + ", unmanagedCacheLoaded=" + this.unmanagedCacheLoaded + ")";
    }
}
