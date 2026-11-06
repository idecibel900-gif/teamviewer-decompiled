package com.teamviewer.apidefinitions.policies.models;

import java.util.List;
import kotlin.Metadata;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/models/TeamviewerVersion;", "", "version", "", "module", "", "", "operatingSystem", "Lcom/teamviewer/apidefinitions/policies/models/OperatingSystem;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getModule", "()Ljava/util/List;", "getOperatingSystem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TeamviewerVersion {
    private final List<Integer> module;
    private final List<OperatingSystem> operatingSystem;
    private final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public TeamviewerVersion(@sp3(name = "version") String str, @sp3(name = "module") List<Integer> list, @sp3(name = "operatingSystem") List<? extends OperatingSystem> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.version = str;
        this.module = list;
        this.operatingSystem = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamviewerVersion copy$default(TeamviewerVersion teamviewerVersion, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamviewerVersion.version;
        }
        if ((i & 2) != 0) {
            list = teamviewerVersion.module;
        }
        if ((i & 4) != 0) {
            list2 = teamviewerVersion.operatingSystem;
        }
        return teamviewerVersion.copy(str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final List<Integer> component2() {
        return this.module;
    }

    public final List<OperatingSystem> component3() {
        return this.operatingSystem;
    }

    public final TeamviewerVersion copy(@sp3(name = "version") String version, @sp3(name = "module") List<Integer> module, @sp3(name = "operatingSystem") List<? extends OperatingSystem> operatingSystem) {
        version.getClass();
        module.getClass();
        operatingSystem.getClass();
        return new TeamviewerVersion(version, module, operatingSystem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamviewerVersion)) {
            return false;
        }
        TeamviewerVersion teamviewerVersion = (TeamviewerVersion) other;
        return im3.n(this.version, teamviewerVersion.version) && im3.n(this.module, teamviewerVersion.module) && im3.n(this.operatingSystem, teamviewerVersion.operatingSystem);
    }

    public final List<Integer> getModule() {
        return this.module;
    }

    public final List<OperatingSystem> getOperatingSystem() {
        return this.operatingSystem;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.operatingSystem.hashCode() + to7.g(this.module, this.version.hashCode() * 31, 31);
    }

    public String toString() {
        return "TeamviewerVersion(version=" + this.version + ", module=" + this.module + ", operatingSystem=" + this.operatingSystem + ")";
    }
}
