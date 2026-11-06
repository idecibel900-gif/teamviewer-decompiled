package com.teamviewer.apidefinitions.custommodules.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0090\u0002\u0010U\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020\rHÖ\u0001J\t\u0010\\\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b2\u0010,R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(¨\u0006]"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleAndroidHost;", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;", "moduleType", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "editorVersion", "Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "status", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "moduleId", "", "name", "owner", "ownerId", "", "lastUpdated", "Ljava/time/OffsetDateTime;", "lastUpdatedBy", "alias", "intendedTeamViewerVersion", "title", "text", "backgroundColor", "textColor", "logoFileName", "logoUrl", "downloadUrlType", "Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "downloadConfigurationUrl", "downloadModuleViaConfigIdUrl", "downloadModuleViaAliasUrl", "deploymentString", "<init>", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModuleType", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "getEditorVersion", "()Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "getStatus", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "getModuleId", "()Ljava/lang/String;", "getName", "getOwner", "getOwnerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastUpdated", "()Ljava/time/OffsetDateTime;", "getLastUpdatedBy", "getAlias", "getIntendedTeamViewerVersion", "getTitle", "getText", "getBackgroundColor", "getTextColor", "getLogoFileName", "getLogoUrl", "getDownloadUrlType", "()Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "getDownloadConfigurationUrl", "getDownloadModuleViaConfigIdUrl", "getDownloadModuleViaAliasUrl", "getDeploymentString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleAndroidHost;", "equals", "", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomModuleAndroidHost implements CustomModule {
    private final String alias;
    private final String backgroundColor;
    private final String deploymentString;
    private final String downloadConfigurationUrl;
    private final String downloadModuleViaAliasUrl;
    private final String downloadModuleViaConfigIdUrl;
    private final DownloadUrlType downloadUrlType;
    private final EditorVersion editorVersion;
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
    private final CustomModuleStatus status;
    private final String text;
    private final String textColor;
    private final String title;

    public /* synthetic */ CustomModuleAndroidHost(CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(customModuleType, editorVersion, customModuleStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : offsetDateTime, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : downloadUrlType, (262144 & i) != 0 ? null : str12, (524288 & i) != 0 ? null : str13, (1048576 & i) != 0 ? null : str14, (i & 2097152) != 0 ? null : str15);
    }

    public static /* synthetic */ CustomModuleAndroidHost copy$default(CustomModuleAndroidHost customModuleAndroidHost, CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, String str15, int i, Object obj) {
        String str16;
        String str17;
        CustomModuleType customModuleType2 = (i & 1) != 0 ? customModuleAndroidHost.moduleType : customModuleType;
        EditorVersion editorVersion2 = (i & 2) != 0 ? customModuleAndroidHost.editorVersion : editorVersion;
        CustomModuleStatus customModuleStatus2 = (i & 4) != 0 ? customModuleAndroidHost.status : customModuleStatus;
        String str18 = (i & 8) != 0 ? customModuleAndroidHost.moduleId : str;
        String str19 = (i & 16) != 0 ? customModuleAndroidHost.name : str2;
        String str20 = (i & 32) != 0 ? customModuleAndroidHost.owner : str3;
        Integer num3 = (i & 64) != 0 ? customModuleAndroidHost.ownerId : num;
        OffsetDateTime offsetDateTime2 = (i & 128) != 0 ? customModuleAndroidHost.lastUpdated : offsetDateTime;
        String str21 = (i & 256) != 0 ? customModuleAndroidHost.lastUpdatedBy : str4;
        String str22 = (i & 512) != 0 ? customModuleAndroidHost.alias : str5;
        Integer num4 = (i & 1024) != 0 ? customModuleAndroidHost.intendedTeamViewerVersion : num2;
        String str23 = (i & 2048) != 0 ? customModuleAndroidHost.title : str6;
        String str24 = (i & 4096) != 0 ? customModuleAndroidHost.text : str7;
        String str25 = (i & 8192) != 0 ? customModuleAndroidHost.backgroundColor : str8;
        CustomModuleType customModuleType3 = customModuleType2;
        String str26 = (i & 16384) != 0 ? customModuleAndroidHost.textColor : str9;
        String str27 = (i & 32768) != 0 ? customModuleAndroidHost.logoFileName : str10;
        String str28 = (i & 65536) != 0 ? customModuleAndroidHost.logoUrl : str11;
        DownloadUrlType downloadUrlType2 = (i & 131072) != 0 ? customModuleAndroidHost.downloadUrlType : downloadUrlType;
        String str29 = (i & 262144) != 0 ? customModuleAndroidHost.downloadConfigurationUrl : str12;
        String str30 = (i & 524288) != 0 ? customModuleAndroidHost.downloadModuleViaConfigIdUrl : str13;
        String str31 = (i & 1048576) != 0 ? customModuleAndroidHost.downloadModuleViaAliasUrl : str14;
        if ((i & 2097152) != 0) {
            str17 = str31;
            str16 = customModuleAndroidHost.deploymentString;
        } else {
            str16 = str15;
            str17 = str31;
        }
        return customModuleAndroidHost.copy(customModuleType3, editorVersion2, customModuleStatus2, str18, str19, str20, num3, offsetDateTime2, str21, str22, num4, str23, str24, str25, str26, str27, str28, downloadUrlType2, str29, str30, str17, str16);
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
    public final String getDeploymentString() {
        return this.deploymentString;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomModuleStatus getStatus() {
        return this.status;
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

    public final CustomModuleAndroidHost copy(@sp3(name = "moduleType") CustomModuleType moduleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus status, @sp3(name = "moduleId") String moduleId, @sp3(name = "name") String name, @sp3(name = "owner") String owner, @sp3(name = "ownerId") Integer ownerId, @sp3(name = "lastUpdated") OffsetDateTime lastUpdated, @sp3(name = "lastUpdatedBy") String lastUpdatedBy, @sp3(name = "alias") String alias, @sp3(name = "intendedTeamViewerVersion") Integer intendedTeamViewerVersion, @sp3(name = "title") String title, @sp3(name = "text") String text, @sp3(name = "backgroundColor") String backgroundColor, @sp3(name = "textColor") String textColor, @sp3(name = "logoFileName") String logoFileName, @sp3(name = "logoUrl") String logoUrl, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String downloadConfigurationUrl, @sp3(name = "downloadModuleViaConfigIdUrl") String downloadModuleViaConfigIdUrl, @sp3(name = "downloadModuleViaAliasUrl") String downloadModuleViaAliasUrl, @sp3(name = "deploymentString") String deploymentString) {
        moduleType.getClass();
        editorVersion.getClass();
        status.getClass();
        return new CustomModuleAndroidHost(moduleType, editorVersion, status, moduleId, name, owner, ownerId, lastUpdated, lastUpdatedBy, alias, intendedTeamViewerVersion, title, text, backgroundColor, textColor, logoFileName, logoUrl, downloadUrlType, downloadConfigurationUrl, downloadModuleViaConfigIdUrl, downloadModuleViaAliasUrl, deploymentString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleAndroidHost)) {
            return false;
        }
        CustomModuleAndroidHost customModuleAndroidHost = (CustomModuleAndroidHost) other;
        return this.moduleType == customModuleAndroidHost.moduleType && this.editorVersion == customModuleAndroidHost.editorVersion && this.status == customModuleAndroidHost.status && im3.n(this.moduleId, customModuleAndroidHost.moduleId) && im3.n(this.name, customModuleAndroidHost.name) && im3.n(this.owner, customModuleAndroidHost.owner) && im3.n(this.ownerId, customModuleAndroidHost.ownerId) && im3.n(this.lastUpdated, customModuleAndroidHost.lastUpdated) && im3.n(this.lastUpdatedBy, customModuleAndroidHost.lastUpdatedBy) && im3.n(this.alias, customModuleAndroidHost.alias) && im3.n(this.intendedTeamViewerVersion, customModuleAndroidHost.intendedTeamViewerVersion) && im3.n(this.title, customModuleAndroidHost.title) && im3.n(this.text, customModuleAndroidHost.text) && im3.n(this.backgroundColor, customModuleAndroidHost.backgroundColor) && im3.n(this.textColor, customModuleAndroidHost.textColor) && im3.n(this.logoFileName, customModuleAndroidHost.logoFileName) && im3.n(this.logoUrl, customModuleAndroidHost.logoUrl) && this.downloadUrlType == customModuleAndroidHost.downloadUrlType && im3.n(this.downloadConfigurationUrl, customModuleAndroidHost.downloadConfigurationUrl) && im3.n(this.downloadModuleViaConfigIdUrl, customModuleAndroidHost.downloadModuleViaConfigIdUrl) && im3.n(this.downloadModuleViaAliasUrl, customModuleAndroidHost.downloadModuleViaAliasUrl) && im3.n(this.deploymentString, customModuleAndroidHost.deploymentString);
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

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public EditorVersion getEditorVersion() {
        return this.editorVersion;
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

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public CustomModuleStatus getStatus() {
        return this.status;
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
        String str15 = this.deploymentString;
        return iHashCode19 + (str15 != null ? str15.hashCode() : 0);
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
        String str15 = this.deploymentString;
        StringBuilder sb = new StringBuilder("CustomModuleAndroidHost(moduleType=");
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
        return e41.m(sb, str14, ", deploymentString=", str15, ")");
    }

    public CustomModuleAndroidHost(@sp3(name = "moduleType") CustomModuleType customModuleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus customModuleStatus, @sp3(name = "moduleId") String str, @sp3(name = "name") String str2, @sp3(name = "owner") String str3, @sp3(name = "ownerId") Integer num, @sp3(name = "lastUpdated") OffsetDateTime offsetDateTime, @sp3(name = "lastUpdatedBy") String str4, @sp3(name = "alias") String str5, @sp3(name = "intendedTeamViewerVersion") Integer num2, @sp3(name = "title") String str6, @sp3(name = "text") String str7, @sp3(name = "backgroundColor") String str8, @sp3(name = "textColor") String str9, @sp3(name = "logoFileName") String str10, @sp3(name = "logoUrl") String str11, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String str12, @sp3(name = "downloadModuleViaConfigIdUrl") String str13, @sp3(name = "downloadModuleViaAliasUrl") String str14, @sp3(name = "deploymentString") String str15) {
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
        this.deploymentString = str15;
    }
}
