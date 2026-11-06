package com.teamviewer.apidefinitions.custommodules.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoCreationResult;", "", "resultCode", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoResultCode;", "tmpLogoFileName", "", "previewUrl", "<init>", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoResultCode;Ljava/lang/String;Ljava/lang/String;)V", "getResultCode", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoResultCode;", "getTmpLogoFileName", "()Ljava/lang/String;", "getPreviewUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomLogoCreationResult {
    private final String previewUrl;
    private final CustomLogoResultCode resultCode;
    private final String tmpLogoFileName;

    public /* synthetic */ CustomLogoCreationResult(CustomLogoResultCode customLogoResultCode, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(customLogoResultCode, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ CustomLogoCreationResult copy$default(CustomLogoCreationResult customLogoCreationResult, CustomLogoResultCode customLogoResultCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            customLogoResultCode = customLogoCreationResult.resultCode;
        }
        if ((i & 2) != 0) {
            str = customLogoCreationResult.tmpLogoFileName;
        }
        if ((i & 4) != 0) {
            str2 = customLogoCreationResult.previewUrl;
        }
        return customLogoCreationResult.copy(customLogoResultCode, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomLogoResultCode getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTmpLogoFileName() {
        return this.tmpLogoFileName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final CustomLogoCreationResult copy(@sp3(name = "resultCode") CustomLogoResultCode resultCode, @sp3(name = "tmpLogoFileName") String tmpLogoFileName, @sp3(name = "previewUrl") String previewUrl) {
        resultCode.getClass();
        return new CustomLogoCreationResult(resultCode, tmpLogoFileName, previewUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomLogoCreationResult)) {
            return false;
        }
        CustomLogoCreationResult customLogoCreationResult = (CustomLogoCreationResult) other;
        return this.resultCode == customLogoCreationResult.resultCode && im3.n(this.tmpLogoFileName, customLogoCreationResult.tmpLogoFileName) && im3.n(this.previewUrl, customLogoCreationResult.previewUrl);
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final CustomLogoResultCode getResultCode() {
        return this.resultCode;
    }

    public final String getTmpLogoFileName() {
        return this.tmpLogoFileName;
    }

    public int hashCode() {
        int iHashCode = this.resultCode.hashCode() * 31;
        String str = this.tmpLogoFileName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previewUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        CustomLogoResultCode customLogoResultCode = this.resultCode;
        String str = this.tmpLogoFileName;
        String str2 = this.previewUrl;
        StringBuilder sb = new StringBuilder("CustomLogoCreationResult(resultCode=");
        sb.append(customLogoResultCode);
        sb.append(", tmpLogoFileName=");
        sb.append(str);
        sb.append(", previewUrl=");
        return e41.l(sb, str2, ")");
    }

    public CustomLogoCreationResult(@sp3(name = "resultCode") CustomLogoResultCode customLogoResultCode, @sp3(name = "tmpLogoFileName") String str, @sp3(name = "previewUrl") String str2) {
        customLogoResultCode.getClass();
        this.resultCode = customLogoResultCode;
        this.tmpLogoFileName = str;
        this.previewUrl = str2;
    }
}
