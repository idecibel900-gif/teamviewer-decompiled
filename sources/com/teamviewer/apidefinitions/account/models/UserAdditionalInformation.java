package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010'\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/UserAdditionalInformation;", "", "email", "", "countryCode", "requestOrigin", "productLine", "source", "subject", "companyName", "salutation", "firstName", "lastName", "businessPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getCountryCode", "getRequestOrigin", "getProductLine", "getSource", "getSubject", "getCompanyName", "getSalutation", "getFirstName", "getLastName", "getBusinessPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserAdditionalInformation {
    private final String businessPhoneNumber;
    private final String companyName;
    private final String countryCode;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String productLine;
    private final String requestOrigin;
    private final String salutation;
    private final String source;
    private final String subject;

    public /* synthetic */ UserAdditionalInformation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11);
    }

    public static /* synthetic */ UserAdditionalInformation copy$default(UserAdditionalInformation userAdditionalInformation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAdditionalInformation.email;
        }
        if ((i & 2) != 0) {
            str2 = userAdditionalInformation.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = userAdditionalInformation.requestOrigin;
        }
        if ((i & 8) != 0) {
            str4 = userAdditionalInformation.productLine;
        }
        if ((i & 16) != 0) {
            str5 = userAdditionalInformation.source;
        }
        if ((i & 32) != 0) {
            str6 = userAdditionalInformation.subject;
        }
        if ((i & 64) != 0) {
            str7 = userAdditionalInformation.companyName;
        }
        if ((i & 128) != 0) {
            str8 = userAdditionalInformation.salutation;
        }
        if ((i & 256) != 0) {
            str9 = userAdditionalInformation.firstName;
        }
        if ((i & 512) != 0) {
            str10 = userAdditionalInformation.lastName;
        }
        if ((i & 1024) != 0) {
            str11 = userAdditionalInformation.businessPhoneNumber;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return userAdditionalInformation.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestOrigin() {
        return this.requestOrigin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductLine() {
        return this.productLine;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSalutation() {
        return this.salutation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final UserAdditionalInformation copy(@sp3(name = "email") String email, @sp3(name = "countryCode") String countryCode, @sp3(name = "requestOrigin") String requestOrigin, @sp3(name = "productLine") String productLine, @sp3(name = "source") String source, @sp3(name = "subject") String subject, @sp3(name = "companyName") String companyName, @sp3(name = "salutation") String salutation, @sp3(name = "firstName") String firstName, @sp3(name = "lastName") String lastName, @sp3(name = "businessPhoneNumber") String businessPhoneNumber) {
        return new UserAdditionalInformation(email, countryCode, requestOrigin, productLine, source, subject, companyName, salutation, firstName, lastName, businessPhoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdditionalInformation)) {
            return false;
        }
        UserAdditionalInformation userAdditionalInformation = (UserAdditionalInformation) other;
        return im3.n(this.email, userAdditionalInformation.email) && im3.n(this.countryCode, userAdditionalInformation.countryCode) && im3.n(this.requestOrigin, userAdditionalInformation.requestOrigin) && im3.n(this.productLine, userAdditionalInformation.productLine) && im3.n(this.source, userAdditionalInformation.source) && im3.n(this.subject, userAdditionalInformation.subject) && im3.n(this.companyName, userAdditionalInformation.companyName) && im3.n(this.salutation, userAdditionalInformation.salutation) && im3.n(this.firstName, userAdditionalInformation.firstName) && im3.n(this.lastName, userAdditionalInformation.lastName) && im3.n(this.businessPhoneNumber, userAdditionalInformation.businessPhoneNumber);
    }

    public final String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getProductLine() {
        return this.productLine;
    }

    public final String getRequestOrigin() {
        return this.requestOrigin;
    }

    public final String getSalutation() {
        return this.salutation;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestOrigin;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productLine;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.source;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subject;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.companyName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.salutation;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.firstName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastName;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.businessPhoneNumber;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.countryCode;
        String str3 = this.requestOrigin;
        String str4 = this.productLine;
        String str5 = this.source;
        String str6 = this.subject;
        String str7 = this.companyName;
        String str8 = this.salutation;
        String str9 = this.firstName;
        String str10 = this.lastName;
        String str11 = this.businessPhoneNumber;
        StringBuilder sbO = e41.o("UserAdditionalInformation(email=", str, ", countryCode=", str2, ", requestOrigin=");
        e41.t(sbO, str3, ", productLine=", str4, ", source=");
        e41.t(sbO, str5, ", subject=", str6, ", companyName=");
        e41.t(sbO, str7, ", salutation=", str8, ", firstName=");
        e41.t(sbO, str9, ", lastName=", str10, ", businessPhoneNumber=");
        return e41.l(sbO, str11, ")");
    }

    public UserAdditionalInformation(@sp3(name = "email") String str, @sp3(name = "countryCode") String str2, @sp3(name = "requestOrigin") String str3, @sp3(name = "productLine") String str4, @sp3(name = "source") String str5, @sp3(name = "subject") String str6, @sp3(name = "companyName") String str7, @sp3(name = "salutation") String str8, @sp3(name = "firstName") String str9, @sp3(name = "lastName") String str10, @sp3(name = "businessPhoneNumber") String str11) {
        this.email = str;
        this.countryCode = str2;
        this.requestOrigin = str3;
        this.productLine = str4;
        this.source = str5;
        this.subject = str6;
        this.companyName = str7;
        this.salutation = str8;
        this.firstName = str9;
        this.lastName = str10;
        this.businessPhoneNumber = str11;
    }

    public UserAdditionalInformation() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
