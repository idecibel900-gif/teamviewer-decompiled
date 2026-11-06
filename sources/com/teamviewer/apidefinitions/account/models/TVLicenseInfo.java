package com.teamviewer.apidefinitions.account.models;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\bH\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0003\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0003\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010V\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010W\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010X\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010[\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010]\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010^\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010`\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010d\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010e\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010h\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J\u000b\u0010j\u001a\u0004\u0018\u00010*HÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010?J¤\u0003\u0010l\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0003\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010mJ\u0013\u0010n\u001a\u00020\u00102\b\u0010o\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010p\u001a\u00020\tHÖ\u0001J\t\u0010q\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u000f\u00109R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0015\u00109R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0016\u00109R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0017\u00109R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0018\u00109R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0019\u00109R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001a\u00109R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001b\u00109R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001c\u00109R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001d\u00109R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001e\u00109R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001f\u00109R\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0015\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bB\u0010?R\u0015\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bC\u0010?R\u0015\u0010#\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b#\u00109R\u0015\u0010$\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010:\u001a\u0004\b$\u00109R\u0015\u0010%\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bD\u0010?R\u0015\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bE\u0010?R\u0015\u0010'\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bF\u0010?R\u0015\u0010(\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bG\u0010?R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0015\u0010+\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010@\u001a\u0004\bJ\u0010?¨\u0006r"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/TVLicenseInfo;", "", "teamViewerLicenseId", "Ljava/util/UUID;", "displayName", "", "licenseType", "Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;", "numberOfChannels", "", "licenseFeatures", "", "Lcom/teamviewer/apidefinitions/account/models/LicenseFeature;", "sublicenses", "Lcom/teamviewer/apidefinitions/account/models/TVSublicense;", "isFakeLicense", "", "licenseCodeDisplayName", "licenseCode", "details", "licenseVersion", "isRemoteWorkerLicense", "isRemoteAccessLicense", "isBusinessLicense", "isBusinessAccountLicense", "isPilotLicense", "isIoTRemoteAccessLicense", "isTVMeetingLicense", "isStarterLicense", "isBasicLicense", "isMonitoringLicense", "isTensorLicenseFamily", "assignedAccountIds", "totalTechnicians", "totalEndpoints", "isSubscriptionLicense", "isWebMonitoringLicense", "maxAssignments", "accountActivationLimit", "minimumLicenseChannels", "numberOfManagedDevices", "mdmLicenseType", "Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;", "totalAiTokens", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;ILjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;Ljava/lang/Integer;)V", "getTeamViewerLicenseId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getLicenseType", "()Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;", "getNumberOfChannels", "()I", "getLicenseFeatures", "()Ljava/util/List;", "getSublicenses", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLicenseCodeDisplayName", "getLicenseCode", "getDetails", "getLicenseVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssignedAccountIds", "getTotalTechnicians", "getTotalEndpoints", "getMaxAssignments", "getAccountActivationLimit", "getMinimumLicenseChannels", "getNumberOfManagedDevices", "getMdmLicenseType", "()Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;", "getTotalAiTokens", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lcom/teamviewer/apidefinitions/account/models/TVLicenseType;ILjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/account/models/MDMLicenseType;Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/account/models/TVLicenseInfo;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TVLicenseInfo {
    private final Integer accountActivationLimit;
    private final List<Integer> assignedAccountIds;
    private final String details;
    private final String displayName;
    private final Boolean isBasicLicense;
    private final Boolean isBusinessAccountLicense;
    private final Boolean isBusinessLicense;
    private final Boolean isFakeLicense;
    private final Boolean isIoTRemoteAccessLicense;
    private final Boolean isMonitoringLicense;
    private final Boolean isPilotLicense;
    private final Boolean isRemoteAccessLicense;
    private final Boolean isRemoteWorkerLicense;
    private final Boolean isStarterLicense;
    private final Boolean isSubscriptionLicense;
    private final Boolean isTVMeetingLicense;
    private final Boolean isTensorLicenseFamily;
    private final Boolean isWebMonitoringLicense;
    private final String licenseCode;
    private final String licenseCodeDisplayName;
    private final List<LicenseFeature> licenseFeatures;
    private final TVLicenseType licenseType;
    private final Integer licenseVersion;
    private final Integer maxAssignments;
    private final MDMLicenseType mdmLicenseType;
    private final Integer minimumLicenseChannels;
    private final int numberOfChannels;
    private final Integer numberOfManagedDevices;
    private final List<TVSublicense> sublicenses;
    private final UUID teamViewerLicenseId;
    private final Integer totalAiTokens;
    private final Integer totalEndpoints;
    private final Integer totalTechnicians;

    public /* synthetic */ TVLicenseInfo(UUID uuid, String str, TVLicenseType tVLicenseType, int i, List list, List list2, Boolean bool, String str2, String str3, String str4, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, List list3, Integer num2, Integer num3, Boolean bool13, Boolean bool14, Integer num4, Integer num5, Integer num6, Integer num7, MDMLicenseType mDMLicenseType, Integer num8, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, tVLicenseType, i, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : bool4, (i2 & 16384) != 0 ? null : bool5, (32768 & i2) != 0 ? null : bool6, (65536 & i2) != 0 ? null : bool7, (131072 & i2) != 0 ? null : bool8, (262144 & i2) != 0 ? null : bool9, (524288 & i2) != 0 ? null : bool10, (1048576 & i2) != 0 ? null : bool11, (2097152 & i2) != 0 ? null : bool12, (4194304 & i2) != 0 ? null : list3, (8388608 & i2) != 0 ? null : num2, (16777216 & i2) != 0 ? null : num3, (33554432 & i2) != 0 ? null : bool13, (67108864 & i2) != 0 ? null : bool14, (134217728 & i2) != 0 ? null : num4, (268435456 & i2) != 0 ? null : num5, (536870912 & i2) != 0 ? null : num6, (1073741824 & i2) != 0 ? null : num7, (i2 & Integer.MIN_VALUE) != 0 ? null : mDMLicenseType, (i3 & 1) != 0 ? null : num8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TVLicenseInfo copy$default(TVLicenseInfo tVLicenseInfo, UUID uuid, String str, TVLicenseType tVLicenseType, int i, List list, List list2, Boolean bool, String str2, String str3, String str4, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, List list3, Integer num2, Integer num3, Boolean bool13, Boolean bool14, Integer num4, Integer num5, Integer num6, Integer num7, MDMLicenseType mDMLicenseType, Integer num8, int i2, int i3, Object obj) {
        Integer num9;
        MDMLicenseType mDMLicenseType2;
        UUID uuid2 = (i2 & 1) != 0 ? tVLicenseInfo.teamViewerLicenseId : uuid;
        String str5 = (i2 & 2) != 0 ? tVLicenseInfo.displayName : str;
        TVLicenseType tVLicenseType2 = (i2 & 4) != 0 ? tVLicenseInfo.licenseType : tVLicenseType;
        int i4 = (i2 & 8) != 0 ? tVLicenseInfo.numberOfChannels : i;
        List list4 = (i2 & 16) != 0 ? tVLicenseInfo.licenseFeatures : list;
        List list5 = (i2 & 32) != 0 ? tVLicenseInfo.sublicenses : list2;
        Boolean bool15 = (i2 & 64) != 0 ? tVLicenseInfo.isFakeLicense : bool;
        String str6 = (i2 & 128) != 0 ? tVLicenseInfo.licenseCodeDisplayName : str2;
        String str7 = (i2 & 256) != 0 ? tVLicenseInfo.licenseCode : str3;
        String str8 = (i2 & 512) != 0 ? tVLicenseInfo.details : str4;
        Integer num10 = (i2 & 1024) != 0 ? tVLicenseInfo.licenseVersion : num;
        Boolean bool16 = (i2 & 2048) != 0 ? tVLicenseInfo.isRemoteWorkerLicense : bool2;
        Boolean bool17 = (i2 & 4096) != 0 ? tVLicenseInfo.isRemoteAccessLicense : bool3;
        Boolean bool18 = (i2 & 8192) != 0 ? tVLicenseInfo.isBusinessLicense : bool4;
        UUID uuid3 = uuid2;
        Boolean bool19 = (i2 & 16384) != 0 ? tVLicenseInfo.isBusinessAccountLicense : bool5;
        Boolean bool20 = (i2 & 32768) != 0 ? tVLicenseInfo.isPilotLicense : bool6;
        Boolean bool21 = (i2 & 65536) != 0 ? tVLicenseInfo.isIoTRemoteAccessLicense : bool7;
        Boolean bool22 = (i2 & 131072) != 0 ? tVLicenseInfo.isTVMeetingLicense : bool8;
        Boolean bool23 = (i2 & 262144) != 0 ? tVLicenseInfo.isStarterLicense : bool9;
        Boolean bool24 = (i2 & 524288) != 0 ? tVLicenseInfo.isBasicLicense : bool10;
        Boolean bool25 = (i2 & 1048576) != 0 ? tVLicenseInfo.isMonitoringLicense : bool11;
        Boolean bool26 = (i2 & 2097152) != 0 ? tVLicenseInfo.isTensorLicenseFamily : bool12;
        List list6 = (i2 & 4194304) != 0 ? tVLicenseInfo.assignedAccountIds : list3;
        Integer num11 = (i2 & 8388608) != 0 ? tVLicenseInfo.totalTechnicians : num2;
        Integer num12 = (i2 & 16777216) != 0 ? tVLicenseInfo.totalEndpoints : num3;
        Boolean bool27 = (i2 & 33554432) != 0 ? tVLicenseInfo.isSubscriptionLicense : bool13;
        Boolean bool28 = (i2 & 67108864) != 0 ? tVLicenseInfo.isWebMonitoringLicense : bool14;
        Integer num13 = (i2 & 134217728) != 0 ? tVLicenseInfo.maxAssignments : num4;
        Integer num14 = (i2 & 268435456) != 0 ? tVLicenseInfo.accountActivationLimit : num5;
        Integer num15 = (i2 & 536870912) != 0 ? tVLicenseInfo.minimumLicenseChannels : num6;
        Integer num16 = (i2 & 1073741824) != 0 ? tVLicenseInfo.numberOfManagedDevices : num7;
        MDMLicenseType mDMLicenseType3 = (i2 & Integer.MIN_VALUE) != 0 ? tVLicenseInfo.mdmLicenseType : mDMLicenseType;
        if ((i3 & 1) != 0) {
            mDMLicenseType2 = mDMLicenseType3;
            num9 = tVLicenseInfo.totalAiTokens;
        } else {
            num9 = num8;
            mDMLicenseType2 = mDMLicenseType3;
        }
        return tVLicenseInfo.copy(uuid3, str5, tVLicenseType2, i4, list4, list5, bool15, str6, str7, str8, num10, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, list6, num11, num12, bool27, bool28, num13, num14, num15, num16, mDMLicenseType2, num9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getTeamViewerLicenseId() {
        return this.teamViewerLicenseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getLicenseVersion() {
        return this.licenseVersion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsRemoteWorkerLicense() {
        return this.isRemoteWorkerLicense;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIsRemoteAccessLicense() {
        return this.isRemoteAccessLicense;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsBusinessLicense() {
        return this.isBusinessLicense;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsBusinessAccountLicense() {
        return this.isBusinessAccountLicense;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getIsPilotLicense() {
        return this.isPilotLicense;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsIoTRemoteAccessLicense() {
        return this.isIoTRemoteAccessLicense;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getIsTVMeetingLicense() {
        return this.isTVMeetingLicense;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIsStarterLicense() {
        return this.isStarterLicense;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsBasicLicense() {
        return this.isBasicLicense;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsMonitoringLicense() {
        return this.isMonitoringLicense;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getIsTensorLicenseFamily() {
        return this.isTensorLicenseFamily;
    }

    public final List<Integer> component23() {
        return this.assignedAccountIds;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getTotalTechnicians() {
        return this.totalTechnicians;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getTotalEndpoints() {
        return this.totalEndpoints;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getIsSubscriptionLicense() {
        return this.isSubscriptionLicense;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getIsWebMonitoringLicense() {
        return this.isWebMonitoringLicense;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getMaxAssignments() {
        return this.maxAssignments;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getAccountActivationLimit() {
        return this.accountActivationLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TVLicenseType getLicenseType() {
        return this.licenseType;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getMinimumLicenseChannels() {
        return this.minimumLicenseChannels;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Integer getNumberOfManagedDevices() {
        return this.numberOfManagedDevices;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final MDMLicenseType getMdmLicenseType() {
        return this.mdmLicenseType;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getTotalAiTokens() {
        return this.totalAiTokens;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getNumberOfChannels() {
        return this.numberOfChannels;
    }

    public final List<LicenseFeature> component5() {
        return this.licenseFeatures;
    }

    public final List<TVSublicense> component6() {
        return this.sublicenses;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsFakeLicense() {
        return this.isFakeLicense;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLicenseCodeDisplayName() {
        return this.licenseCodeDisplayName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLicenseCode() {
        return this.licenseCode;
    }

    public final TVLicenseInfo copy(@sp3(name = "teamViewerLicenseId") UUID teamViewerLicenseId, @sp3(name = "displayName") String displayName, @sp3(name = "licenseType") TVLicenseType licenseType, @sp3(name = "numberOfChannels") int numberOfChannels, @sp3(name = "licenseFeatures") List<? extends LicenseFeature> licenseFeatures, @sp3(name = "sublicenses") List<TVSublicense> sublicenses, @sp3(name = "isFakeLicense") Boolean isFakeLicense, @sp3(name = "licenseCodeDisplayName") String licenseCodeDisplayName, @sp3(name = "licenseCode") String licenseCode, @sp3(name = "details") String details, @sp3(name = "licenseVersion") Integer licenseVersion, @sp3(name = "isRemoteWorkerLicense") Boolean isRemoteWorkerLicense, @sp3(name = "isRemoteAccessLicense") Boolean isRemoteAccessLicense, @sp3(name = "isBusinessLicense") Boolean isBusinessLicense, @sp3(name = "isBusinessAccountLicense") Boolean isBusinessAccountLicense, @sp3(name = "isPilotLicense") Boolean isPilotLicense, @sp3(name = "isIoTRemoteAccessLicense") Boolean isIoTRemoteAccessLicense, @sp3(name = "isTVMeetingLicense") Boolean isTVMeetingLicense, @sp3(name = "isStarterLicense") Boolean isStarterLicense, @sp3(name = "isBasicLicense") Boolean isBasicLicense, @sp3(name = "isMonitoringLicense") Boolean isMonitoringLicense, @sp3(name = "isTensorLicenseFamily") Boolean isTensorLicenseFamily, @sp3(name = "assignedAccountIds") List<Integer> assignedAccountIds, @sp3(name = "totalTechnicians") Integer totalTechnicians, @sp3(name = "totalEndpoints") Integer totalEndpoints, @sp3(name = "isSubscriptionLicense") Boolean isSubscriptionLicense, @sp3(name = "isWebMonitoringLicense") Boolean isWebMonitoringLicense, @sp3(name = "maxAssignments") Integer maxAssignments, @sp3(name = "accountActivationLimit") Integer accountActivationLimit, @sp3(name = "minimumLicenseChannels") Integer minimumLicenseChannels, @sp3(name = "numberOfManagedDevices") Integer numberOfManagedDevices, @sp3(name = "mdmLicenseType") MDMLicenseType mdmLicenseType, @sp3(name = "totalAiTokens") Integer totalAiTokens) {
        teamViewerLicenseId.getClass();
        displayName.getClass();
        licenseType.getClass();
        return new TVLicenseInfo(teamViewerLicenseId, displayName, licenseType, numberOfChannels, licenseFeatures, sublicenses, isFakeLicense, licenseCodeDisplayName, licenseCode, details, licenseVersion, isRemoteWorkerLicense, isRemoteAccessLicense, isBusinessLicense, isBusinessAccountLicense, isPilotLicense, isIoTRemoteAccessLicense, isTVMeetingLicense, isStarterLicense, isBasicLicense, isMonitoringLicense, isTensorLicenseFamily, assignedAccountIds, totalTechnicians, totalEndpoints, isSubscriptionLicense, isWebMonitoringLicense, maxAssignments, accountActivationLimit, minimumLicenseChannels, numberOfManagedDevices, mdmLicenseType, totalAiTokens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TVLicenseInfo)) {
            return false;
        }
        TVLicenseInfo tVLicenseInfo = (TVLicenseInfo) other;
        return im3.n(this.teamViewerLicenseId, tVLicenseInfo.teamViewerLicenseId) && im3.n(this.displayName, tVLicenseInfo.displayName) && this.licenseType == tVLicenseInfo.licenseType && this.numberOfChannels == tVLicenseInfo.numberOfChannels && im3.n(this.licenseFeatures, tVLicenseInfo.licenseFeatures) && im3.n(this.sublicenses, tVLicenseInfo.sublicenses) && im3.n(this.isFakeLicense, tVLicenseInfo.isFakeLicense) && im3.n(this.licenseCodeDisplayName, tVLicenseInfo.licenseCodeDisplayName) && im3.n(this.licenseCode, tVLicenseInfo.licenseCode) && im3.n(this.details, tVLicenseInfo.details) && im3.n(this.licenseVersion, tVLicenseInfo.licenseVersion) && im3.n(this.isRemoteWorkerLicense, tVLicenseInfo.isRemoteWorkerLicense) && im3.n(this.isRemoteAccessLicense, tVLicenseInfo.isRemoteAccessLicense) && im3.n(this.isBusinessLicense, tVLicenseInfo.isBusinessLicense) && im3.n(this.isBusinessAccountLicense, tVLicenseInfo.isBusinessAccountLicense) && im3.n(this.isPilotLicense, tVLicenseInfo.isPilotLicense) && im3.n(this.isIoTRemoteAccessLicense, tVLicenseInfo.isIoTRemoteAccessLicense) && im3.n(this.isTVMeetingLicense, tVLicenseInfo.isTVMeetingLicense) && im3.n(this.isStarterLicense, tVLicenseInfo.isStarterLicense) && im3.n(this.isBasicLicense, tVLicenseInfo.isBasicLicense) && im3.n(this.isMonitoringLicense, tVLicenseInfo.isMonitoringLicense) && im3.n(this.isTensorLicenseFamily, tVLicenseInfo.isTensorLicenseFamily) && im3.n(this.assignedAccountIds, tVLicenseInfo.assignedAccountIds) && im3.n(this.totalTechnicians, tVLicenseInfo.totalTechnicians) && im3.n(this.totalEndpoints, tVLicenseInfo.totalEndpoints) && im3.n(this.isSubscriptionLicense, tVLicenseInfo.isSubscriptionLicense) && im3.n(this.isWebMonitoringLicense, tVLicenseInfo.isWebMonitoringLicense) && im3.n(this.maxAssignments, tVLicenseInfo.maxAssignments) && im3.n(this.accountActivationLimit, tVLicenseInfo.accountActivationLimit) && im3.n(this.minimumLicenseChannels, tVLicenseInfo.minimumLicenseChannels) && im3.n(this.numberOfManagedDevices, tVLicenseInfo.numberOfManagedDevices) && this.mdmLicenseType == tVLicenseInfo.mdmLicenseType && im3.n(this.totalAiTokens, tVLicenseInfo.totalAiTokens);
    }

    public final Integer getAccountActivationLimit() {
        return this.accountActivationLimit;
    }

    public final List<Integer> getAssignedAccountIds() {
        return this.assignedAccountIds;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getLicenseCode() {
        return this.licenseCode;
    }

    public final String getLicenseCodeDisplayName() {
        return this.licenseCodeDisplayName;
    }

    public final List<LicenseFeature> getLicenseFeatures() {
        return this.licenseFeatures;
    }

    public final TVLicenseType getLicenseType() {
        return this.licenseType;
    }

    public final Integer getLicenseVersion() {
        return this.licenseVersion;
    }

    public final Integer getMaxAssignments() {
        return this.maxAssignments;
    }

    public final MDMLicenseType getMdmLicenseType() {
        return this.mdmLicenseType;
    }

    public final Integer getMinimumLicenseChannels() {
        return this.minimumLicenseChannels;
    }

    public final int getNumberOfChannels() {
        return this.numberOfChannels;
    }

    public final Integer getNumberOfManagedDevices() {
        return this.numberOfManagedDevices;
    }

    public final List<TVSublicense> getSublicenses() {
        return this.sublicenses;
    }

    public final UUID getTeamViewerLicenseId() {
        return this.teamViewerLicenseId;
    }

    public final Integer getTotalAiTokens() {
        return this.totalAiTokens;
    }

    public final Integer getTotalEndpoints() {
        return this.totalEndpoints;
    }

    public final Integer getTotalTechnicians() {
        return this.totalTechnicians;
    }

    public int hashCode() {
        int iA = fx3.a(this.numberOfChannels, (this.licenseType.hashCode() + to7.e(this.teamViewerLicenseId.hashCode() * 31, 31, this.displayName)) * 31, 31);
        List<LicenseFeature> list = this.licenseFeatures;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        List<TVSublicense> list2 = this.sublicenses;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isFakeLicense;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.licenseCodeDisplayName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.licenseCode;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.details;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.licenseVersion;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isRemoteWorkerLicense;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isRemoteAccessLicense;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBusinessLicense;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isBusinessAccountLicense;
        int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isPilotLicense;
        int iHashCode12 = (iHashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isIoTRemoteAccessLicense;
        int iHashCode13 = (iHashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isTVMeetingLicense;
        int iHashCode14 = (iHashCode13 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isStarterLicense;
        int iHashCode15 = (iHashCode14 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isBasicLicense;
        int iHashCode16 = (iHashCode15 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isMonitoringLicense;
        int iHashCode17 = (iHashCode16 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isTensorLicenseFamily;
        int iHashCode18 = (iHashCode17 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        List<Integer> list3 = this.assignedAccountIds;
        int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.totalTechnicians;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalEndpoints;
        int iHashCode21 = (iHashCode20 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool13 = this.isSubscriptionLicense;
        int iHashCode22 = (iHashCode21 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.isWebMonitoringLicense;
        int iHashCode23 = (iHashCode22 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Integer num4 = this.maxAssignments;
        int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.accountActivationLimit;
        int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.minimumLicenseChannels;
        int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.numberOfManagedDevices;
        int iHashCode27 = (iHashCode26 + (num7 == null ? 0 : num7.hashCode())) * 31;
        MDMLicenseType mDMLicenseType = this.mdmLicenseType;
        int iHashCode28 = (iHashCode27 + (mDMLicenseType == null ? 0 : mDMLicenseType.hashCode())) * 31;
        Integer num8 = this.totalAiTokens;
        return iHashCode28 + (num8 != null ? num8.hashCode() : 0);
    }

    public final Boolean isBasicLicense() {
        return this.isBasicLicense;
    }

    public final Boolean isBusinessAccountLicense() {
        return this.isBusinessAccountLicense;
    }

    public final Boolean isBusinessLicense() {
        return this.isBusinessLicense;
    }

    public final Boolean isFakeLicense() {
        return this.isFakeLicense;
    }

    public final Boolean isIoTRemoteAccessLicense() {
        return this.isIoTRemoteAccessLicense;
    }

    public final Boolean isMonitoringLicense() {
        return this.isMonitoringLicense;
    }

    public final Boolean isPilotLicense() {
        return this.isPilotLicense;
    }

    public final Boolean isRemoteAccessLicense() {
        return this.isRemoteAccessLicense;
    }

    public final Boolean isRemoteWorkerLicense() {
        return this.isRemoteWorkerLicense;
    }

    public final Boolean isStarterLicense() {
        return this.isStarterLicense;
    }

    public final Boolean isSubscriptionLicense() {
        return this.isSubscriptionLicense;
    }

    public final Boolean isTVMeetingLicense() {
        return this.isTVMeetingLicense;
    }

    public final Boolean isTensorLicenseFamily() {
        return this.isTensorLicenseFamily;
    }

    public final Boolean isWebMonitoringLicense() {
        return this.isWebMonitoringLicense;
    }

    public String toString() {
        UUID uuid = this.teamViewerLicenseId;
        String str = this.displayName;
        TVLicenseType tVLicenseType = this.licenseType;
        int i = this.numberOfChannels;
        List<LicenseFeature> list = this.licenseFeatures;
        List<TVSublicense> list2 = this.sublicenses;
        Boolean bool = this.isFakeLicense;
        String str2 = this.licenseCodeDisplayName;
        String str3 = this.licenseCode;
        String str4 = this.details;
        Integer num = this.licenseVersion;
        Boolean bool2 = this.isRemoteWorkerLicense;
        Boolean bool3 = this.isRemoteAccessLicense;
        Boolean bool4 = this.isBusinessLicense;
        Boolean bool5 = this.isBusinessAccountLicense;
        Boolean bool6 = this.isPilotLicense;
        Boolean bool7 = this.isIoTRemoteAccessLicense;
        Boolean bool8 = this.isTVMeetingLicense;
        Boolean bool9 = this.isStarterLicense;
        Boolean bool10 = this.isBasicLicense;
        Boolean bool11 = this.isMonitoringLicense;
        Boolean bool12 = this.isTensorLicenseFamily;
        List<Integer> list3 = this.assignedAccountIds;
        Integer num2 = this.totalTechnicians;
        Integer num3 = this.totalEndpoints;
        Boolean bool13 = this.isSubscriptionLicense;
        Boolean bool14 = this.isWebMonitoringLicense;
        Integer num4 = this.maxAssignments;
        Integer num5 = this.accountActivationLimit;
        Integer num6 = this.minimumLicenseChannels;
        Integer num7 = this.numberOfManagedDevices;
        MDMLicenseType mDMLicenseType = this.mdmLicenseType;
        Integer num8 = this.totalAiTokens;
        StringBuilder sb = new StringBuilder("TVLicenseInfo(teamViewerLicenseId=");
        sb.append(uuid);
        sb.append(", displayName=");
        sb.append(str);
        sb.append(", licenseType=");
        sb.append(tVLicenseType);
        sb.append(", numberOfChannels=");
        sb.append(i);
        sb.append(", licenseFeatures=");
        sb.append(list);
        sb.append(", sublicenses=");
        sb.append(list2);
        sb.append(", isFakeLicense=");
        sb.append(bool);
        sb.append(", licenseCodeDisplayName=");
        sb.append(str2);
        sb.append(", licenseCode=");
        e41.t(sb, str3, ", details=", str4, ", licenseVersion=");
        sb.append(num);
        sb.append(", isRemoteWorkerLicense=");
        sb.append(bool2);
        sb.append(", isRemoteAccessLicense=");
        ua5.w(sb, bool3, ", isBusinessLicense=", bool4, ", isBusinessAccountLicense=");
        ua5.w(sb, bool5, ", isPilotLicense=", bool6, ", isIoTRemoteAccessLicense=");
        ua5.w(sb, bool7, ", isTVMeetingLicense=", bool8, ", isStarterLicense=");
        ua5.w(sb, bool9, ", isBasicLicense=", bool10, ", isMonitoringLicense=");
        ua5.w(sb, bool11, ", isTensorLicenseFamily=", bool12, ", assignedAccountIds=");
        sb.append(list3);
        sb.append(", totalTechnicians=");
        sb.append(num2);
        sb.append(", totalEndpoints=");
        sb.append(num3);
        sb.append(", isSubscriptionLicense=");
        sb.append(bool13);
        sb.append(", isWebMonitoringLicense=");
        sb.append(bool14);
        sb.append(", maxAssignments=");
        sb.append(num4);
        sb.append(", accountActivationLimit=");
        sb.append(num5);
        sb.append(", minimumLicenseChannels=");
        sb.append(num6);
        sb.append(", numberOfManagedDevices=");
        sb.append(num7);
        sb.append(", mdmLicenseType=");
        sb.append(mDMLicenseType);
        sb.append(", totalAiTokens=");
        sb.append(num8);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TVLicenseInfo(@sp3(name = "teamViewerLicenseId") UUID uuid, @sp3(name = "displayName") String str, @sp3(name = "licenseType") TVLicenseType tVLicenseType, @sp3(name = "numberOfChannels") int i, @sp3(name = "licenseFeatures") List<? extends LicenseFeature> list, @sp3(name = "sublicenses") List<TVSublicense> list2, @sp3(name = "isFakeLicense") Boolean bool, @sp3(name = "licenseCodeDisplayName") String str2, @sp3(name = "licenseCode") String str3, @sp3(name = "details") String str4, @sp3(name = "licenseVersion") Integer num, @sp3(name = "isRemoteWorkerLicense") Boolean bool2, @sp3(name = "isRemoteAccessLicense") Boolean bool3, @sp3(name = "isBusinessLicense") Boolean bool4, @sp3(name = "isBusinessAccountLicense") Boolean bool5, @sp3(name = "isPilotLicense") Boolean bool6, @sp3(name = "isIoTRemoteAccessLicense") Boolean bool7, @sp3(name = "isTVMeetingLicense") Boolean bool8, @sp3(name = "isStarterLicense") Boolean bool9, @sp3(name = "isBasicLicense") Boolean bool10, @sp3(name = "isMonitoringLicense") Boolean bool11, @sp3(name = "isTensorLicenseFamily") Boolean bool12, @sp3(name = "assignedAccountIds") List<Integer> list3, @sp3(name = "totalTechnicians") Integer num2, @sp3(name = "totalEndpoints") Integer num3, @sp3(name = "isSubscriptionLicense") Boolean bool13, @sp3(name = "isWebMonitoringLicense") Boolean bool14, @sp3(name = "maxAssignments") Integer num4, @sp3(name = "accountActivationLimit") Integer num5, @sp3(name = "minimumLicenseChannels") Integer num6, @sp3(name = "numberOfManagedDevices") Integer num7, @sp3(name = "mdmLicenseType") MDMLicenseType mDMLicenseType, @sp3(name = "totalAiTokens") Integer num8) {
        uuid.getClass();
        str.getClass();
        tVLicenseType.getClass();
        this.teamViewerLicenseId = uuid;
        this.displayName = str;
        this.licenseType = tVLicenseType;
        this.numberOfChannels = i;
        this.licenseFeatures = list;
        this.sublicenses = list2;
        this.isFakeLicense = bool;
        this.licenseCodeDisplayName = str2;
        this.licenseCode = str3;
        this.details = str4;
        this.licenseVersion = num;
        this.isRemoteWorkerLicense = bool2;
        this.isRemoteAccessLicense = bool3;
        this.isBusinessLicense = bool4;
        this.isBusinessAccountLicense = bool5;
        this.isPilotLicense = bool6;
        this.isIoTRemoteAccessLicense = bool7;
        this.isTVMeetingLicense = bool8;
        this.isStarterLicense = bool9;
        this.isBasicLicense = bool10;
        this.isMonitoringLicense = bool11;
        this.isTensorLicenseFamily = bool12;
        this.assignedAccountIds = list3;
        this.totalTechnicians = num2;
        this.totalEndpoints = num3;
        this.isSubscriptionLicense = bool13;
        this.isWebMonitoringLicense = bool14;
        this.maxAssignments = num4;
        this.accountActivationLimit = num5;
        this.minimumLicenseChannels = num6;
        this.numberOfManagedDevices = num7;
        this.mdmLicenseType = mDMLicenseType;
        this.totalAiTokens = num8;
    }
}
