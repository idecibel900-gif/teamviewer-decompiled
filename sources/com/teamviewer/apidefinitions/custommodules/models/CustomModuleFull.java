package com.teamviewer.apidefinitions.custommodules.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\bN\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bï\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0003\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)¢\u0006\u0004\b*\u0010+J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0007HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010]\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010o\u001a\u0004\u0018\u00010#HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0002\u0010PJ\u000b\u0010q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)HÆ\u0003Jö\u0002\u0010t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020%2\b\u0010w\u001a\u0004\u0018\u00010xHÖ\u0003J\t\u0010y\u001a\u00020\rHÖ\u0001J\t\u0010z\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b=\u00107R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0013\u0010 \u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0015\u0010!\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00108\u001a\u0004\bL\u00107R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0015\u0010$\u001a\u0004\u0018\u00010%¢\u0006\n\n\u0002\u0010Q\u001a\u0004\bO\u0010PR\u0013\u0010&\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0013\u0010'\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0019\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010)¢\u0006\b\n\u0000\u001a\u0004\bT\u0010U¨\u0006{"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleFull;", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;", "moduleType", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "editorVersion", "Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "status", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "moduleId", "", "name", "owner", "ownerId", "", "lastUpdated", "Ljava/time/OffsetDateTime;", "lastUpdatedBy", "alias", "intendedTeamViewerVersion", "title", "text", "backgroundColor", "textColor", "logoFileName", "logoUrl", "downloadUrlType", "Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "downloadConfigurationUrl", "downloadModuleViaConfigIdUrl", "downloadModuleViaAliasUrl", "disclaimer", "termsOfService", "groupToAddTo", "groupIdToAddTo", "tvClientSettingsPolicyId", "Ljava/util/UUID;", "accountAssignmentWithoutConfirmation", "", "easyRolloutAccessToken", "deploymentString", "routerDnsNames", "", "<init>", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getModuleType", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "getEditorVersion", "()Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "getStatus", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "getModuleId", "()Ljava/lang/String;", "getName", "getOwner", "getOwnerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastUpdated", "()Ljava/time/OffsetDateTime;", "getLastUpdatedBy", "getAlias", "getIntendedTeamViewerVersion", "getTitle", "getText", "getBackgroundColor", "getTextColor", "getLogoFileName", "getLogoUrl", "getDownloadUrlType", "()Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "getDownloadConfigurationUrl", "getDownloadModuleViaConfigIdUrl", "getDownloadModuleViaAliasUrl", "getDisclaimer", "getTermsOfService", "getGroupToAddTo", "getGroupIdToAddTo", "getTvClientSettingsPolicyId", "()Ljava/util/UUID;", "getAccountAssignmentWithoutConfirmation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEasyRolloutAccessToken", "getDeploymentString", "getRouterDnsNames", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleFull;", "equals", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomModuleFull implements CustomModule {
    private final Boolean accountAssignmentWithoutConfirmation;
    private final String alias;
    private final String backgroundColor;
    private final String deploymentString;
    private final String disclaimer;
    private final String downloadConfigurationUrl;
    private final String downloadModuleViaAliasUrl;
    private final String downloadModuleViaConfigIdUrl;
    private final DownloadUrlType downloadUrlType;
    private final String easyRolloutAccessToken;
    private final EditorVersion editorVersion;
    private final Integer groupIdToAddTo;
    private final String groupToAddTo;
    private final Integer intendedTeamViewerVersion;
    private final OffsetDateTime lastUpdated;
    private final String lastUpdatedBy;
    private final String logoFileName;
    private final String logoUrl;
    private final String moduleId;
    private final CustomModuleType moduleType;
    private final String name;
    private final String owner;
    private final Integer ownerId;
    private final List<String> routerDnsNames;
    private final CustomModuleStatus status;
    private final String termsOfService;
    private final String text;
    private final String textColor;
    private final String title;
    private final UUID tvClientSettingsPolicyId;

    public /* synthetic */ CustomModuleFull(CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, String str15, String str16, String str17, Integer num3, UUID uuid, Boolean bool, String str18, String str19, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(customModuleType, editorVersion, customModuleStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : offsetDateTime, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : downloadUrlType, (262144 & i) != 0 ? null : str12, (524288 & i) != 0 ? null : str13, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : str15, (4194304 & i) != 0 ? null : str16, (8388608 & i) != 0 ? null : str17, (16777216 & i) != 0 ? null : num3, (33554432 & i) != 0 ? null : uuid, (67108864 & i) != 0 ? null : bool, (134217728 & i) != 0 ? null : str18, (268435456 & i) != 0 ? null : str19, (i & 536870912) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomModuleFull copy$default(CustomModuleFull customModuleFull, CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, String str15, String str16, String str17, Integer num3, UUID uuid, Boolean bool, String str18, String str19, List list, int i, Object obj) {
        List list2;
        String str20;
        CustomModuleType customModuleType2 = (i & 1) != 0 ? customModuleFull.moduleType : customModuleType;
        EditorVersion editorVersion2 = (i & 2) != 0 ? customModuleFull.editorVersion : editorVersion;
        CustomModuleStatus customModuleStatus2 = (i & 4) != 0 ? customModuleFull.status : customModuleStatus;
        String str21 = (i & 8) != 0 ? customModuleFull.moduleId : str;
        String str22 = (i & 16) != 0 ? customModuleFull.name : str2;
        String str23 = (i & 32) != 0 ? customModuleFull.owner : str3;
        Integer num4 = (i & 64) != 0 ? customModuleFull.ownerId : num;
        OffsetDateTime offsetDateTime2 = (i & 128) != 0 ? customModuleFull.lastUpdated : offsetDateTime;
        String str24 = (i & 256) != 0 ? customModuleFull.lastUpdatedBy : str4;
        String str25 = (i & 512) != 0 ? customModuleFull.alias : str5;
        Integer num5 = (i & 1024) != 0 ? customModuleFull.intendedTeamViewerVersion : num2;
        String str26 = (i & 2048) != 0 ? customModuleFull.title : str6;
        String str27 = (i & 4096) != 0 ? customModuleFull.text : str7;
        String str28 = (i & 8192) != 0 ? customModuleFull.backgroundColor : str8;
        CustomModuleType customModuleType3 = customModuleType2;
        String str29 = (i & 16384) != 0 ? customModuleFull.textColor : str9;
        String str30 = (i & 32768) != 0 ? customModuleFull.logoFileName : str10;
        String str31 = (i & 65536) != 0 ? customModuleFull.logoUrl : str11;
        DownloadUrlType downloadUrlType2 = (i & 131072) != 0 ? customModuleFull.downloadUrlType : downloadUrlType;
        String str32 = (i & 262144) != 0 ? customModuleFull.downloadConfigurationUrl : str12;
        String str33 = (i & 524288) != 0 ? customModuleFull.downloadModuleViaConfigIdUrl : str13;
        String str34 = (i & 1048576) != 0 ? customModuleFull.downloadModuleViaAliasUrl : str14;
        String str35 = (i & 2097152) != 0 ? customModuleFull.disclaimer : str15;
        String str36 = (i & 4194304) != 0 ? customModuleFull.termsOfService : str16;
        String str37 = (i & 8388608) != 0 ? customModuleFull.groupToAddTo : str17;
        Integer num6 = (i & 16777216) != 0 ? customModuleFull.groupIdToAddTo : num3;
        UUID uuid2 = (i & 33554432) != 0 ? customModuleFull.tvClientSettingsPolicyId : uuid;
        Boolean bool2 = (i & 67108864) != 0 ? customModuleFull.accountAssignmentWithoutConfirmation : bool;
        String str38 = (i & 134217728) != 0 ? customModuleFull.easyRolloutAccessToken : str18;
        String str39 = (i & 268435456) != 0 ? customModuleFull.deploymentString : str19;
        if ((i & 536870912) != 0) {
            str20 = str39;
            list2 = customModuleFull.routerDnsNames;
        } else {
            list2 = list;
            str20 = str39;
        }
        return customModuleFull.copy(customModuleType3, editorVersion2, customModuleStatus2, str21, str22, str23, num4, offsetDateTime2, str24, str25, num5, str26, str27, str28, str29, str30, str31, downloadUrlType2, str32, str33, str34, str35, str36, str37, num6, uuid2, bool2, str38, str20, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CustomModuleType getModuleType() {
        return this.moduleType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getIntendedTeamViewerVersion() {
        return this.intendedTeamViewerVersion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLogoFileName() {
        return this.logoFileName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final DownloadUrlType getDownloadUrlType() {
        return this.downloadUrlType;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDownloadConfigurationUrl() {
        return this.downloadConfigurationUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EditorVersion getEditorVersion() {
        return this.editorVersion;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getDownloadModuleViaConfigIdUrl() {
        return this.downloadModuleViaConfigIdUrl;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getDownloadModuleViaAliasUrl() {
        return this.downloadModuleViaAliasUrl;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTermsOfService() {
        return this.termsOfService;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getGroupToAddTo() {
        return this.groupToAddTo;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getGroupIdToAddTo() {
        return this.groupIdToAddTo;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final UUID getTvClientSettingsPolicyId() {
        return this.tvClientSettingsPolicyId;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getAccountAssignmentWithoutConfirmation() {
        return this.accountAssignmentWithoutConfirmation;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getEasyRolloutAccessToken() {
        return this.easyRolloutAccessToken;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getDeploymentString() {
        return this.deploymentString;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomModuleStatus getStatus() {
        return this.status;
    }

    public final List<String> component30() {
        return this.routerDnsNames;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OffsetDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public final CustomModuleFull copy(@sp3(name = "moduleType") CustomModuleType moduleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus status, @sp3(name = "moduleId") String moduleId, @sp3(name = "name") String name, @sp3(name = "owner") String owner, @sp3(name = "ownerId") Integer ownerId, @sp3(name = "lastUpdated") OffsetDateTime lastUpdated, @sp3(name = "lastUpdatedBy") String lastUpdatedBy, @sp3(name = "alias") String alias, @sp3(name = "intendedTeamViewerVersion") Integer intendedTeamViewerVersion, @sp3(name = "title") String title, @sp3(name = "text") String text, @sp3(name = "backgroundColor") String backgroundColor, @sp3(name = "textColor") String textColor, @sp3(name = "logoFileName") String logoFileName, @sp3(name = "logoUrl") String logoUrl, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String downloadConfigurationUrl, @sp3(name = "downloadModuleViaConfigIdUrl") String downloadModuleViaConfigIdUrl, @sp3(name = "downloadModuleViaAliasUrl") String downloadModuleViaAliasUrl, @sp3(name = "disclaimer") String disclaimer, @sp3(name = "termsOfService") String termsOfService, @sp3(name = "groupToAddTo") String groupToAddTo, @sp3(name = "groupIdToAddTo") Integer groupIdToAddTo, @sp3(name = "tvClientSettingsPolicyId") UUID tvClientSettingsPolicyId, @sp3(name = "accountAssignmentWithoutConfirmation") Boolean accountAssignmentWithoutConfirmation, @sp3(name = "easyRolloutAccessToken") String easyRolloutAccessToken, @sp3(name = "deploymentString") String deploymentString, @sp3(name = "routerDnsNames") List<String> routerDnsNames) {
        moduleType.getClass();
        editorVersion.getClass();
        status.getClass();
        return new CustomModuleFull(moduleType, editorVersion, status, moduleId, name, owner, ownerId, lastUpdated, lastUpdatedBy, alias, intendedTeamViewerVersion, title, text, backgroundColor, textColor, logoFileName, logoUrl, downloadUrlType, downloadConfigurationUrl, downloadModuleViaConfigIdUrl, downloadModuleViaAliasUrl, disclaimer, termsOfService, groupToAddTo, groupIdToAddTo, tvClientSettingsPolicyId, accountAssignmentWithoutConfirmation, easyRolloutAccessToken, deploymentString, routerDnsNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleFull)) {
            return false;
        }
        CustomModuleFull customModuleFull = (CustomModuleFull) other;
        return this.moduleType == customModuleFull.moduleType && this.editorVersion == customModuleFull.editorVersion && this.status == customModuleFull.status && im3.n(this.moduleId, customModuleFull.moduleId) && im3.n(this.name, customModuleFull.name) && im3.n(this.owner, customModuleFull.owner) && im3.n(this.ownerId, customModuleFull.ownerId) && im3.n(this.lastUpdated, customModuleFull.lastUpdated) && im3.n(this.lastUpdatedBy, customModuleFull.lastUpdatedBy) && im3.n(this.alias, customModuleFull.alias) && im3.n(this.intendedTeamViewerVersion, customModuleFull.intendedTeamViewerVersion) && im3.n(this.title, customModuleFull.title) && im3.n(this.text, customModuleFull.text) && im3.n(this.backgroundColor, customModuleFull.backgroundColor) && im3.n(this.textColor, customModuleFull.textColor) && im3.n(this.logoFileName, customModuleFull.logoFileName) && im3.n(this.logoUrl, customModuleFull.logoUrl) && this.downloadUrlType == customModuleFull.downloadUrlType && im3.n(this.downloadConfigurationUrl, customModuleFull.downloadConfigurationUrl) && im3.n(this.downloadModuleViaConfigIdUrl, customModuleFull.downloadModuleViaConfigIdUrl) && im3.n(this.downloadModuleViaAliasUrl, customModuleFull.downloadModuleViaAliasUrl) && im3.n(this.disclaimer, customModuleFull.disclaimer) && im3.n(this.termsOfService, customModuleFull.termsOfService) && im3.n(this.groupToAddTo, customModuleFull.groupToAddTo) && im3.n(this.groupIdToAddTo, customModuleFull.groupIdToAddTo) && im3.n(this.tvClientSettingsPolicyId, customModuleFull.tvClientSettingsPolicyId) && im3.n(this.accountAssignmentWithoutConfirmation, customModuleFull.accountAssignmentWithoutConfirmation) && im3.n(this.easyRolloutAccessToken, customModuleFull.easyRolloutAccessToken) && im3.n(this.deploymentString, customModuleFull.deploymentString) && im3.n(this.routerDnsNames, customModuleFull.routerDnsNames);
    }

    public final Boolean getAccountAssignmentWithoutConfirmation() {
        return this.accountAssignmentWithoutConfirmation;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getAlias() {
        return this.alias;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDeploymentString() {
        return this.deploymentString;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getDownloadConfigurationUrl() {
        return this.downloadConfigurationUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getDownloadModuleViaAliasUrl() {
        return this.downloadModuleViaAliasUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getDownloadModuleViaConfigIdUrl() {
        return this.downloadModuleViaConfigIdUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public DownloadUrlType getDownloadUrlType() {
        return this.downloadUrlType;
    }

    public final String getEasyRolloutAccessToken() {
        return this.easyRolloutAccessToken;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public EditorVersion getEditorVersion() {
        return this.editorVersion;
    }

    public final Integer getGroupIdToAddTo() {
        return this.groupIdToAddTo;
    }

    public final String getGroupToAddTo() {
        return this.groupToAddTo;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public Integer getIntendedTeamViewerVersion() {
        return this.intendedTeamViewerVersion;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public OffsetDateTime getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getLogoFileName() {
        return this.logoFileName;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getLogoUrl() {
        return this.logoUrl;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public CustomModuleType getModuleType() {
        return this.moduleType;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getName() {
        return this.name;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getOwner() {
        return this.owner;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public Integer getOwnerId() {
        return this.ownerId;
    }

    public final List<String> getRouterDnsNames() {
        return this.routerDnsNames;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public CustomModuleStatus getStatus() {
        return this.status;
    }

    public final String getTermsOfService() {
        return this.termsOfService;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getText() {
        return this.text;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getTextColor() {
        return this.textColor;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getTitle() {
        return this.title;
    }

    public final UUID getTvClientSettingsPolicyId() {
        return this.tvClientSettingsPolicyId;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + ((this.editorVersion.hashCode() + (this.moduleType.hashCode() * 31)) * 31)) * 31;
        String str = this.moduleId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.owner;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.ownerId;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.lastUpdated;
        int iHashCode6 = (iHashCode5 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str4 = this.lastUpdatedBy;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alias;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.intendedTeamViewerVersion;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.text;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.backgroundColor;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.textColor;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.logoFileName;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.logoUrl;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        DownloadUrlType downloadUrlType = this.downloadUrlType;
        int iHashCode16 = (iHashCode15 + (downloadUrlType == null ? 0 : downloadUrlType.hashCode())) * 31;
        String str12 = this.downloadConfigurationUrl;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.downloadModuleViaConfigIdUrl;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.downloadModuleViaAliasUrl;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.disclaimer;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.termsOfService;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.groupToAddTo;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num3 = this.groupIdToAddTo;
        int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UUID uuid = this.tvClientSettingsPolicyId;
        int iHashCode24 = (iHashCode23 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Boolean bool = this.accountAssignmentWithoutConfirmation;
        int iHashCode25 = (iHashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str18 = this.easyRolloutAccessToken;
        int iHashCode26 = (iHashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.deploymentString;
        int iHashCode27 = (iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List<String> list = this.routerDnsNames;
        return iHashCode27 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        CustomModuleType customModuleType = this.moduleType;
        EditorVersion editorVersion = this.editorVersion;
        CustomModuleStatus customModuleStatus = this.status;
        String str = this.moduleId;
        String str2 = this.name;
        String str3 = this.owner;
        Integer num = this.ownerId;
        OffsetDateTime offsetDateTime = this.lastUpdated;
        String str4 = this.lastUpdatedBy;
        String str5 = this.alias;
        Integer num2 = this.intendedTeamViewerVersion;
        String str6 = this.title;
        String str7 = this.text;
        String str8 = this.backgroundColor;
        String str9 = this.textColor;
        String str10 = this.logoFileName;
        String str11 = this.logoUrl;
        DownloadUrlType downloadUrlType = this.downloadUrlType;
        String str12 = this.downloadConfigurationUrl;
        String str13 = this.downloadModuleViaConfigIdUrl;
        String str14 = this.downloadModuleViaAliasUrl;
        String str15 = this.disclaimer;
        String str16 = this.termsOfService;
        String str17 = this.groupToAddTo;
        Integer num3 = this.groupIdToAddTo;
        UUID uuid = this.tvClientSettingsPolicyId;
        Boolean bool = this.accountAssignmentWithoutConfirmation;
        String str18 = this.easyRolloutAccessToken;
        String str19 = this.deploymentString;
        List<String> list = this.routerDnsNames;
        StringBuilder sb = new StringBuilder("CustomModuleFull(moduleType=");
        sb.append(customModuleType);
        sb.append(", editorVersion=");
        sb.append(editorVersion);
        sb.append(", status=");
        sb.append(customModuleStatus);
        sb.append(", moduleId=");
        sb.append(str);
        sb.append(", name=");
        e41.t(sb, str2, ", owner=", str3, ", ownerId=");
        sb.append(num);
        sb.append(", lastUpdated=");
        sb.append(offsetDateTime);
        sb.append(", lastUpdatedBy=");
        e41.t(sb, str4, ", alias=", str5, ", intendedTeamViewerVersion=");
        sb.append(num2);
        sb.append(", title=");
        sb.append(str6);
        sb.append(", text=");
        e41.t(sb, str7, ", backgroundColor=", str8, ", textColor=");
        e41.t(sb, str9, ", logoFileName=", str10, ", logoUrl=");
        sb.append(str11);
        sb.append(", downloadUrlType=");
        sb.append(downloadUrlType);
        sb.append(", downloadConfigurationUrl=");
        e41.t(sb, str12, ", downloadModuleViaConfigIdUrl=", str13, ", downloadModuleViaAliasUrl=");
        e41.t(sb, str14, ", disclaimer=", str15, ", termsOfService=");
        e41.t(sb, str16, ", groupToAddTo=", str17, ", groupIdToAddTo=");
        sb.append(num3);
        sb.append(", tvClientSettingsPolicyId=");
        sb.append(uuid);
        sb.append(", accountAssignmentWithoutConfirmation=");
        sb.append(bool);
        sb.append(", easyRolloutAccessToken=");
        sb.append(str18);
        sb.append(", deploymentString=");
        sb.append(str19);
        sb.append(", routerDnsNames=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public CustomModuleFull(@sp3(name = "moduleType") CustomModuleType customModuleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus customModuleStatus, @sp3(name = "moduleId") String str, @sp3(name = "name") String str2, @sp3(name = "owner") String str3, @sp3(name = "ownerId") Integer num, @sp3(name = "lastUpdated") OffsetDateTime offsetDateTime, @sp3(name = "lastUpdatedBy") String str4, @sp3(name = "alias") String str5, @sp3(name = "intendedTeamViewerVersion") Integer num2, @sp3(name = "title") String str6, @sp3(name = "text") String str7, @sp3(name = "backgroundColor") String str8, @sp3(name = "textColor") String str9, @sp3(name = "logoFileName") String str10, @sp3(name = "logoUrl") String str11, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String str12, @sp3(name = "downloadModuleViaConfigIdUrl") String str13, @sp3(name = "downloadModuleViaAliasUrl") String str14, @sp3(name = "disclaimer") String str15, @sp3(name = "termsOfService") String str16, @sp3(name = "groupToAddTo") String str17, @sp3(name = "groupIdToAddTo") Integer num3, @sp3(name = "tvClientSettingsPolicyId") UUID uuid, @sp3(name = "accountAssignmentWithoutConfirmation") Boolean bool, @sp3(name = "easyRolloutAccessToken") String str18, @sp3(name = "deploymentString") String str19, @sp3(name = "routerDnsNames") List<String> list) {
        customModuleType.getClass();
        editorVersion.getClass();
        customModuleStatus.getClass();
        this.moduleType = customModuleType;
        this.editorVersion = editorVersion;
        this.status = customModuleStatus;
        this.moduleId = str;
        this.name = str2;
        this.owner = str3;
        this.ownerId = num;
        this.lastUpdated = offsetDateTime;
        this.lastUpdatedBy = str4;
        this.alias = str5;
        this.intendedTeamViewerVersion = num2;
        this.title = str6;
        this.text = str7;
        this.backgroundColor = str8;
        this.textColor = str9;
        this.logoFileName = str10;
        this.logoUrl = str11;
        this.downloadUrlType = downloadUrlType;
        this.downloadConfigurationUrl = str12;
        this.downloadModuleViaConfigIdUrl = str13;
        this.downloadModuleViaAliasUrl = str14;
        this.disclaimer = str15;
        this.termsOfService = str16;
        this.groupToAddTo = str17;
        this.groupIdToAddTo = num3;
        this.tvClientSettingsPolicyId = uuid;
        this.accountAssignmentWithoutConfirmation = bool;
        this.easyRolloutAccessToken = str18;
        this.deploymentString = str19;
        this.routerDnsNames = list;
    }
}
