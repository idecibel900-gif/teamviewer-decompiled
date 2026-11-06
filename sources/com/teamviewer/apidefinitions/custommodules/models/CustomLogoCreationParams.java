package com.teamviewer.apidefinitions.custommodules.models;

import java.util.Arrays;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoCreationParams;", "", "moduleType", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "data", "", "<init>", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;[B)V", "getModuleType", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "getData", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomLogoCreationParams {
    private final byte[] data;
    private final CustomModuleType moduleType;

    public CustomLogoCreationParams(@sp3(name = "moduleType") CustomModuleType customModuleType, @sp3(name = "data") byte[] bArr) {
        customModuleType.getClass();
        bArr.getClass();
        this.moduleType = customModuleType;
        this.data = bArr;
    }

    public static /* synthetic */ CustomLogoCreationParams copy$default(CustomLogoCreationParams customLogoCreationParams, CustomModuleType customModuleType, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            customModuleType = customLogoCreationParams.moduleType;
        }
        if ((i & 2) != 0) {
            bArr = customLogoCreationParams.data;
        }
        return customLogoCreationParams.copy(customModuleType, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomModuleType getModuleType() {
        return this.moduleType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final CustomLogoCreationParams copy(@sp3(name = "moduleType") CustomModuleType moduleType, @sp3(name = "data") byte[] data) {
        moduleType.getClass();
        data.getClass();
        return new CustomLogoCreationParams(moduleType, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomLogoCreationParams)) {
            return false;
        }
        CustomLogoCreationParams customLogoCreationParams = (CustomLogoCreationParams) other;
        return this.moduleType == customLogoCreationParams.moduleType && im3.n(this.data, customLogoCreationParams.data);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final CustomModuleType getModuleType() {
        return this.moduleType;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + (this.moduleType.hashCode() * 31);
    }

    public String toString() {
        return "CustomLogoCreationParams(moduleType=" + this.moduleType + ", data=" + Arrays.toString(this.data) + ")";
    }
}
