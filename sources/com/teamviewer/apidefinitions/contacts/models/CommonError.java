package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/CommonError;", "", "type", "", "title", "status", "", "detail", "instance", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTitle", "getStatus", "()I", "getDetail", "getInstance", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonError {
    private final String detail;
    private final String instance;
    private final int status;
    private final String title;
    private final String type;

    public CommonError(@sp3(name = "type") String str, @sp3(name = "title") String str2, @sp3(name = "status") int i, @sp3(name = "detail") String str3, @sp3(name = "instance") String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.type = str;
        this.title = str2;
        this.status = i;
        this.detail = str3;
        this.instance = str4;
    }

    public static /* synthetic */ CommonError copy$default(CommonError commonError, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = commonError.type;
        }
        if ((i2 & 2) != 0) {
            str2 = commonError.title;
        }
        if ((i2 & 4) != 0) {
            i = commonError.status;
        }
        if ((i2 & 8) != 0) {
            str3 = commonError.detail;
        }
        if ((i2 & 16) != 0) {
            str4 = commonError.instance;
        }
        String str5 = str4;
        int i3 = i;
        return commonError.copy(str, str2, i3, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInstance() {
        return this.instance;
    }

    public final CommonError copy(@sp3(name = "type") String type, @sp3(name = "title") String title, @sp3(name = "status") int status, @sp3(name = "detail") String detail, @sp3(name = "instance") String instance) {
        type.getClass();
        title.getClass();
        detail.getClass();
        instance.getClass();
        return new CommonError(type, title, status, detail, instance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonError)) {
            return false;
        }
        CommonError commonError = (CommonError) other;
        return im3.n(this.type, commonError.type) && im3.n(this.title, commonError.title) && this.status == commonError.status && im3.n(this.detail, commonError.detail) && im3.n(this.instance, commonError.instance);
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getInstance() {
        return this.instance;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.instance.hashCode() + to7.e(fx3.a(this.status, to7.e(this.type.hashCode() * 31, 31, this.title), 31), 31, this.detail);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.title;
        int i = this.status;
        String str3 = this.detail;
        String str4 = this.instance;
        StringBuilder sbO = e41.o("CommonError(type=", str, ", title=", str2, ", status=");
        sbO.append(i);
        sbO.append(", detail=");
        sbO.append(str3);
        sbO.append(", instance=");
        return e41.l(sbO, str4, ")");
    }
}
