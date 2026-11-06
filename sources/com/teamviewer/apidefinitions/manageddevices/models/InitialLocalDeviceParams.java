package com.teamviewer.apidefinitions.manageddevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/InitialLocalDeviceParams;", "", "displayName", "", "<init>", "(Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InitialLocalDeviceParams {
    private final String displayName;

    public /* synthetic */ InitialLocalDeviceParams(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ InitialLocalDeviceParams copy$default(InitialLocalDeviceParams initialLocalDeviceParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initialLocalDeviceParams.displayName;
        }
        return initialLocalDeviceParams.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final InitialLocalDeviceParams copy(@sp3(name = "displayName") String displayName) {
        return new InitialLocalDeviceParams(displayName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InitialLocalDeviceParams) && im3.n(this.displayName, ((InitialLocalDeviceParams) other).displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public int hashCode() {
        String str = this.displayName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return fx3.g("InitialLocalDeviceParams(displayName=", this.displayName, ")");
    }

    public InitialLocalDeviceParams(@sp3(name = "displayName") String str) {
        this.displayName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InitialLocalDeviceParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
