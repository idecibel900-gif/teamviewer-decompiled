package com.teamviewer.apidefinitions.custommodules.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bc\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0003\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b-\u0010.J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0007HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010c\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010:J\u000b\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010r\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010s\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010t\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010u\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010v\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010w\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010x\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010y\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010z\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010{\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010|\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010}\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010~\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010MJ\u00ad\u0003\u0010\u007f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0003\u0010\u0080\u0001J\u0016\u0010\u0081\u0001\u001a\u00020\u001f2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020\rHÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010;\u001a\u0004\b@\u0010:R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0015\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bO\u0010MR\u0015\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bP\u0010MR\u0015\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bQ\u0010MR\u0015\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bR\u0010MR\u0015\u0010$\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bS\u0010MR\u0015\u0010%\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bT\u0010MR\u0015\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bU\u0010MR\u0015\u0010'\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bV\u0010MR\u0015\u0010(\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bW\u0010MR\u0015\u0010)\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bX\u0010MR\u0015\u0010*\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bY\u0010MR\u0015\u0010+\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\bZ\u0010MR\u0015\u0010,\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010N\u001a\u0004\b[\u0010M¨\u0006\u0086\u0001"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleMobileQuickSupport;", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;", "moduleType", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "editorVersion", "Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "status", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "moduleId", "", "name", "owner", "ownerId", "", "lastUpdated", "Ljava/time/OffsetDateTime;", "lastUpdatedBy", "alias", "intendedTeamViewerVersion", "title", "text", "backgroundColor", "textColor", "logoFileName", "logoUrl", "downloadUrlType", "Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "downloadConfigurationUrl", "downloadModuleViaConfigIdUrl", "downloadModuleViaAliasUrl", "enableApps", "", "enableChat", "enableClipboard", "enableFileTransfer", "enableMonitoring", "enableNudge", "enableOpenUri", "enableProcesses", "enableScreen", "enableScreenshot", "enableWifiConfiguration", "enableEmailConfiguration", "enableExchangeConfiguration", "enableConfigurationProfileImport", "<init>", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getModuleType", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "getEditorVersion", "()Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "getStatus", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "getModuleId", "()Ljava/lang/String;", "getName", "getOwner", "getOwnerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastUpdated", "()Ljava/time/OffsetDateTime;", "getLastUpdatedBy", "getAlias", "getIntendedTeamViewerVersion", "getTitle", "getText", "getBackgroundColor", "getTextColor", "getLogoFileName", "getLogoUrl", "getDownloadUrlType", "()Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "getDownloadConfigurationUrl", "getDownloadModuleViaConfigIdUrl", "getDownloadModuleViaAliasUrl", "getEnableApps", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableChat", "getEnableClipboard", "getEnableFileTransfer", "getEnableMonitoring", "getEnableNudge", "getEnableOpenUri", "getEnableProcesses", "getEnableScreen", "getEnableScreenshot", "getEnableWifiConfiguration", "getEnableEmailConfiguration", "getEnableExchangeConfiguration", "getEnableConfigurationProfileImport", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleMobileQuickSupport;", "equals", "other", "", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CustomModuleMobileQuickSupport implements CustomModule {
    private final String alias;
    private final String backgroundColor;
    private final String downloadConfigurationUrl;
    private final String downloadModuleViaAliasUrl;
    private final String downloadModuleViaConfigIdUrl;
    private final DownloadUrlType downloadUrlType;
    private final EditorVersion editorVersion;
    private final Boolean enableApps;
    private final Boolean enableChat;
    private final Boolean enableClipboard;
    private final Boolean enableConfigurationProfileImport;
    private final Boolean enableEmailConfiguration;
    private final Boolean enableExchangeConfiguration;
    private final Boolean enableFileTransfer;
    private final Boolean enableMonitoring;
    private final Boolean enableNudge;
    private final Boolean enableOpenUri;
    private final Boolean enableProcesses;
    private final Boolean enableScreen;
    private final Boolean enableScreenshot;
    private final Boolean enableWifiConfiguration;
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

    public /* synthetic */ CustomModuleMobileQuickSupport(CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(customModuleType, editorVersion, customModuleStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : offsetDateTime, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : downloadUrlType, (262144 & i) != 0 ? null : str12, (524288 & i) != 0 ? null : str13, (1048576 & i) != 0 ? null : str14, (2097152 & i) != 0 ? null : bool, (4194304 & i) != 0 ? null : bool2, (8388608 & i) != 0 ? null : bool3, (16777216 & i) != 0 ? null : bool4, (33554432 & i) != 0 ? null : bool5, (67108864 & i) != 0 ? null : bool6, (134217728 & i) != 0 ? null : bool7, (268435456 & i) != 0 ? null : bool8, (536870912 & i) != 0 ? null : bool9, (1073741824 & i) != 0 ? null : bool10, (i & Integer.MIN_VALUE) != 0 ? null : bool11, (i2 & 1) != 0 ? null : bool12, (i2 & 2) != 0 ? null : bool13, (i2 & 4) != 0 ? null : bool14);
    }

    public static /* synthetic */ CustomModuleMobileQuickSupport copy$default(CustomModuleMobileQuickSupport customModuleMobileQuickSupport, CustomModuleType customModuleType, EditorVersion editorVersion, CustomModuleStatus customModuleStatus, String str, String str2, String str3, Integer num, OffsetDateTime offsetDateTime, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, DownloadUrlType downloadUrlType, String str12, String str13, String str14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, int i, int i2, Object obj) {
        Boolean bool15;
        Boolean bool16;
        CustomModuleType customModuleType2 = (i & 1) != 0 ? customModuleMobileQuickSupport.moduleType : customModuleType;
        EditorVersion editorVersion2 = (i & 2) != 0 ? customModuleMobileQuickSupport.editorVersion : editorVersion;
        CustomModuleStatus customModuleStatus2 = (i & 4) != 0 ? customModuleMobileQuickSupport.status : customModuleStatus;
        String str15 = (i & 8) != 0 ? customModuleMobileQuickSupport.moduleId : str;
        String str16 = (i & 16) != 0 ? customModuleMobileQuickSupport.name : str2;
        String str17 = (i & 32) != 0 ? customModuleMobileQuickSupport.owner : str3;
        Integer num3 = (i & 64) != 0 ? customModuleMobileQuickSupport.ownerId : num;
        OffsetDateTime offsetDateTime2 = (i & 128) != 0 ? customModuleMobileQuickSupport.lastUpdated : offsetDateTime;
        String str18 = (i & 256) != 0 ? customModuleMobileQuickSupport.lastUpdatedBy : str4;
        String str19 = (i & 512) != 0 ? customModuleMobileQuickSupport.alias : str5;
        Integer num4 = (i & 1024) != 0 ? customModuleMobileQuickSupport.intendedTeamViewerVersion : num2;
        String str20 = (i & 2048) != 0 ? customModuleMobileQuickSupport.title : str6;
        String str21 = (i & 4096) != 0 ? customModuleMobileQuickSupport.text : str7;
        String str22 = (i & 8192) != 0 ? customModuleMobileQuickSupport.backgroundColor : str8;
        CustomModuleType customModuleType3 = customModuleType2;
        String str23 = (i & 16384) != 0 ? customModuleMobileQuickSupport.textColor : str9;
        String str24 = (i & 32768) != 0 ? customModuleMobileQuickSupport.logoFileName : str10;
        String str25 = (i & 65536) != 0 ? customModuleMobileQuickSupport.logoUrl : str11;
        DownloadUrlType downloadUrlType2 = (i & 131072) != 0 ? customModuleMobileQuickSupport.downloadUrlType : downloadUrlType;
        String str26 = (i & 262144) != 0 ? customModuleMobileQuickSupport.downloadConfigurationUrl : str12;
        String str27 = (i & 524288) != 0 ? customModuleMobileQuickSupport.downloadModuleViaConfigIdUrl : str13;
        String str28 = (i & 1048576) != 0 ? customModuleMobileQuickSupport.downloadModuleViaAliasUrl : str14;
        Boolean bool17 = (i & 2097152) != 0 ? customModuleMobileQuickSupport.enableApps : bool;
        Boolean bool18 = (i & 4194304) != 0 ? customModuleMobileQuickSupport.enableChat : bool2;
        Boolean bool19 = (i & 8388608) != 0 ? customModuleMobileQuickSupport.enableClipboard : bool3;
        Boolean bool20 = (i & 16777216) != 0 ? customModuleMobileQuickSupport.enableFileTransfer : bool4;
        Boolean bool21 = (i & 33554432) != 0 ? customModuleMobileQuickSupport.enableMonitoring : bool5;
        Boolean bool22 = (i & 67108864) != 0 ? customModuleMobileQuickSupport.enableNudge : bool6;
        Boolean bool23 = (i & 134217728) != 0 ? customModuleMobileQuickSupport.enableOpenUri : bool7;
        Boolean bool24 = (i & 268435456) != 0 ? customModuleMobileQuickSupport.enableProcesses : bool8;
        Boolean bool25 = (i & 536870912) != 0 ? customModuleMobileQuickSupport.enableScreen : bool9;
        Boolean bool26 = (i & 1073741824) != 0 ? customModuleMobileQuickSupport.enableScreenshot : bool10;
        Boolean bool27 = (i & Integer.MIN_VALUE) != 0 ? customModuleMobileQuickSupport.enableWifiConfiguration : bool11;
        Boolean bool28 = (i2 & 1) != 0 ? customModuleMobileQuickSupport.enableEmailConfiguration : bool12;
        Boolean bool29 = (i2 & 2) != 0 ? customModuleMobileQuickSupport.enableExchangeConfiguration : bool13;
        if ((i2 & 4) != 0) {
            bool16 = bool29;
            bool15 = customModuleMobileQuickSupport.enableConfigurationProfileImport;
        } else {
            bool15 = bool14;
            bool16 = bool29;
        }
        return customModuleMobileQuickSupport.copy(customModuleType3, editorVersion2, customModuleStatus2, str15, str16, str17, num3, offsetDateTime2, str18, str19, num4, str20, str21, str22, str23, str24, str25, downloadUrlType2, str26, str27, str28, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool16, bool15);
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
    public final Boolean getEnableApps() {
        return this.enableApps;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getEnableChat() {
        return this.enableChat;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getEnableClipboard() {
        return this.enableClipboard;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getEnableFileTransfer() {
        return this.enableFileTransfer;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Boolean getEnableNudge() {
        return this.enableNudge;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getEnableOpenUri() {
        return this.enableOpenUri;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Boolean getEnableProcesses() {
        return this.enableProcesses;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomModuleStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getEnableScreen() {
        return this.enableScreen;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getEnableScreenshot() {
        return this.enableScreenshot;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Boolean getEnableWifiConfiguration() {
        return this.enableWifiConfiguration;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Boolean getEnableEmailConfiguration() {
        return this.enableEmailConfiguration;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Boolean getEnableExchangeConfiguration() {
        return this.enableExchangeConfiguration;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Boolean getEnableConfigurationProfileImport() {
        return this.enableConfigurationProfileImport;
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

    public final CustomModuleMobileQuickSupport copy(@sp3(name = "moduleType") CustomModuleType moduleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus status, @sp3(name = "moduleId") String moduleId, @sp3(name = "name") String name, @sp3(name = "owner") String owner, @sp3(name = "ownerId") Integer ownerId, @sp3(name = "lastUpdated") OffsetDateTime lastUpdated, @sp3(name = "lastUpdatedBy") String lastUpdatedBy, @sp3(name = "alias") String alias, @sp3(name = "intendedTeamViewerVersion") Integer intendedTeamViewerVersion, @sp3(name = "title") String title, @sp3(name = "text") String text, @sp3(name = "backgroundColor") String backgroundColor, @sp3(name = "textColor") String textColor, @sp3(name = "logoFileName") String logoFileName, @sp3(name = "logoUrl") String logoUrl, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String downloadConfigurationUrl, @sp3(name = "downloadModuleViaConfigIdUrl") String downloadModuleViaConfigIdUrl, @sp3(name = "downloadModuleViaAliasUrl") String downloadModuleViaAliasUrl, @sp3(name = "enableApps") Boolean enableApps, @sp3(name = "enableChat") Boolean enableChat, @sp3(name = "enableClipboard") Boolean enableClipboard, @sp3(name = "enableFileTransfer") Boolean enableFileTransfer, @sp3(name = "enableMonitoring") Boolean enableMonitoring, @sp3(name = "enableNudge") Boolean enableNudge, @sp3(name = "enableOpenUri") Boolean enableOpenUri, @sp3(name = "enableProcesses") Boolean enableProcesses, @sp3(name = "enableScreen") Boolean enableScreen, @sp3(name = "enableScreenshot") Boolean enableScreenshot, @sp3(name = "enableWifiConfiguration") Boolean enableWifiConfiguration, @sp3(name = "enableEmailConfiguration") Boolean enableEmailConfiguration, @sp3(name = "enableExchangeConfiguration") Boolean enableExchangeConfiguration, @sp3(name = "enableConfigurationProfileImport") Boolean enableConfigurationProfileImport) {
        moduleType.getClass();
        editorVersion.getClass();
        status.getClass();
        return new CustomModuleMobileQuickSupport(moduleType, editorVersion, status, moduleId, name, owner, ownerId, lastUpdated, lastUpdatedBy, alias, intendedTeamViewerVersion, title, text, backgroundColor, textColor, logoFileName, logoUrl, downloadUrlType, downloadConfigurationUrl, downloadModuleViaConfigIdUrl, downloadModuleViaAliasUrl, enableApps, enableChat, enableClipboard, enableFileTransfer, enableMonitoring, enableNudge, enableOpenUri, enableProcesses, enableScreen, enableScreenshot, enableWifiConfiguration, enableEmailConfiguration, enableExchangeConfiguration, enableConfigurationProfileImport);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomModuleMobileQuickSupport)) {
            return false;
        }
        CustomModuleMobileQuickSupport customModuleMobileQuickSupport = (CustomModuleMobileQuickSupport) other;
        return this.moduleType == customModuleMobileQuickSupport.moduleType && this.editorVersion == customModuleMobileQuickSupport.editorVersion && this.status == customModuleMobileQuickSupport.status && im3.n(this.moduleId, customModuleMobileQuickSupport.moduleId) && im3.n(this.name, customModuleMobileQuickSupport.name) && im3.n(this.owner, customModuleMobileQuickSupport.owner) && im3.n(this.ownerId, customModuleMobileQuickSupport.ownerId) && im3.n(this.lastUpdated, customModuleMobileQuickSupport.lastUpdated) && im3.n(this.lastUpdatedBy, customModuleMobileQuickSupport.lastUpdatedBy) && im3.n(this.alias, customModuleMobileQuickSupport.alias) && im3.n(this.intendedTeamViewerVersion, customModuleMobileQuickSupport.intendedTeamViewerVersion) && im3.n(this.title, customModuleMobileQuickSupport.title) && im3.n(this.text, customModuleMobileQuickSupport.text) && im3.n(this.backgroundColor, customModuleMobileQuickSupport.backgroundColor) && im3.n(this.textColor, customModuleMobileQuickSupport.textColor) && im3.n(this.logoFileName, customModuleMobileQuickSupport.logoFileName) && im3.n(this.logoUrl, customModuleMobileQuickSupport.logoUrl) && this.downloadUrlType == customModuleMobileQuickSupport.downloadUrlType && im3.n(this.downloadConfigurationUrl, customModuleMobileQuickSupport.downloadConfigurationUrl) && im3.n(this.downloadModuleViaConfigIdUrl, customModuleMobileQuickSupport.downloadModuleViaConfigIdUrl) && im3.n(this.downloadModuleViaAliasUrl, customModuleMobileQuickSupport.downloadModuleViaAliasUrl) && im3.n(this.enableApps, customModuleMobileQuickSupport.enableApps) && im3.n(this.enableChat, customModuleMobileQuickSupport.enableChat) && im3.n(this.enableClipboard, customModuleMobileQuickSupport.enableClipboard) && im3.n(this.enableFileTransfer, customModuleMobileQuickSupport.enableFileTransfer) && im3.n(this.enableMonitoring, customModuleMobileQuickSupport.enableMonitoring) && im3.n(this.enableNudge, customModuleMobileQuickSupport.enableNudge) && im3.n(this.enableOpenUri, customModuleMobileQuickSupport.enableOpenUri) && im3.n(this.enableProcesses, customModuleMobileQuickSupport.enableProcesses) && im3.n(this.enableScreen, customModuleMobileQuickSupport.enableScreen) && im3.n(this.enableScreenshot, customModuleMobileQuickSupport.enableScreenshot) && im3.n(this.enableWifiConfiguration, customModuleMobileQuickSupport.enableWifiConfiguration) && im3.n(this.enableEmailConfiguration, customModuleMobileQuickSupport.enableEmailConfiguration) && im3.n(this.enableExchangeConfiguration, customModuleMobileQuickSupport.enableExchangeConfiguration) && im3.n(this.enableConfigurationProfileImport, customModuleMobileQuickSupport.enableConfigurationProfileImport);
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getAlias() {
        return this.alias;
    }

    @Override // com.teamviewer.apidefinitions.custommodules.models.CustomModule
    public String getBackgroundColor() {
        return this.backgroundColor;
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

    public final Boolean getEnableApps() {
        return this.enableApps;
    }

    public final Boolean getEnableChat() {
        return this.enableChat;
    }

    public final Boolean getEnableClipboard() {
        return this.enableClipboard;
    }

    public final Boolean getEnableConfigurationProfileImport() {
        return this.enableConfigurationProfileImport;
    }

    public final Boolean getEnableEmailConfiguration() {
        return this.enableEmailConfiguration;
    }

    public final Boolean getEnableExchangeConfiguration() {
        return this.enableExchangeConfiguration;
    }

    public final Boolean getEnableFileTransfer() {
        return this.enableFileTransfer;
    }

    public final Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }

    public final Boolean getEnableNudge() {
        return this.enableNudge;
    }

    public final Boolean getEnableOpenUri() {
        return this.enableOpenUri;
    }

    public final Boolean getEnableProcesses() {
        return this.enableProcesses;
    }

    public final Boolean getEnableScreen() {
        return this.enableScreen;
    }

    public final Boolean getEnableScreenshot() {
        return this.enableScreenshot;
    }

    public final Boolean getEnableWifiConfiguration() {
        return this.enableWifiConfiguration;
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
        Boolean bool = this.enableApps;
        int iHashCode20 = (iHashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableChat;
        int iHashCode21 = (iHashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableClipboard;
        int iHashCode22 = (iHashCode21 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enableFileTransfer;
        int iHashCode23 = (iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enableMonitoring;
        int iHashCode24 = (iHashCode23 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableNudge;
        int iHashCode25 = (iHashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enableOpenUri;
        int iHashCode26 = (iHashCode25 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableProcesses;
        int iHashCode27 = (iHashCode26 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.enableScreen;
        int iHashCode28 = (iHashCode27 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.enableScreenshot;
        int iHashCode29 = (iHashCode28 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.enableWifiConfiguration;
        int iHashCode30 = (iHashCode29 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.enableEmailConfiguration;
        int iHashCode31 = (iHashCode30 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.enableExchangeConfiguration;
        int iHashCode32 = (iHashCode31 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.enableConfigurationProfileImport;
        return iHashCode32 + (bool14 != null ? bool14.hashCode() : 0);
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
        Boolean bool = this.enableApps;
        Boolean bool2 = this.enableChat;
        Boolean bool3 = this.enableClipboard;
        Boolean bool4 = this.enableFileTransfer;
        Boolean bool5 = this.enableMonitoring;
        Boolean bool6 = this.enableNudge;
        Boolean bool7 = this.enableOpenUri;
        Boolean bool8 = this.enableProcesses;
        Boolean bool9 = this.enableScreen;
        Boolean bool10 = this.enableScreenshot;
        Boolean bool11 = this.enableWifiConfiguration;
        Boolean bool12 = this.enableEmailConfiguration;
        Boolean bool13 = this.enableExchangeConfiguration;
        Boolean bool14 = this.enableConfigurationProfileImport;
        StringBuilder sb = new StringBuilder("CustomModuleMobileQuickSupport(moduleType=");
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
        sb.append(str14);
        sb.append(", enableApps=");
        sb.append(bool);
        sb.append(", enableChat=");
        ua5.w(sb, bool2, ", enableClipboard=", bool3, ", enableFileTransfer=");
        ua5.w(sb, bool4, ", enableMonitoring=", bool5, ", enableNudge=");
        ua5.w(sb, bool6, ", enableOpenUri=", bool7, ", enableProcesses=");
        ua5.w(sb, bool8, ", enableScreen=", bool9, ", enableScreenshot=");
        ua5.w(sb, bool10, ", enableWifiConfiguration=", bool11, ", enableEmailConfiguration=");
        ua5.w(sb, bool12, ", enableExchangeConfiguration=", bool13, ", enableConfigurationProfileImport=");
        sb.append(bool14);
        sb.append(")");
        return sb.toString();
    }

    public CustomModuleMobileQuickSupport(@sp3(name = "moduleType") CustomModuleType customModuleType, @sp3(name = "editorVersion") EditorVersion editorVersion, @sp3(name = "status") CustomModuleStatus customModuleStatus, @sp3(name = "moduleId") String str, @sp3(name = "name") String str2, @sp3(name = "owner") String str3, @sp3(name = "ownerId") Integer num, @sp3(name = "lastUpdated") OffsetDateTime offsetDateTime, @sp3(name = "lastUpdatedBy") String str4, @sp3(name = "alias") String str5, @sp3(name = "intendedTeamViewerVersion") Integer num2, @sp3(name = "title") String str6, @sp3(name = "text") String str7, @sp3(name = "backgroundColor") String str8, @sp3(name = "textColor") String str9, @sp3(name = "logoFileName") String str10, @sp3(name = "logoUrl") String str11, @sp3(name = "downloadUrlType") DownloadUrlType downloadUrlType, @sp3(name = "downloadConfigurationUrl") String str12, @sp3(name = "downloadModuleViaConfigIdUrl") String str13, @sp3(name = "downloadModuleViaAliasUrl") String str14, @sp3(name = "enableApps") Boolean bool, @sp3(name = "enableChat") Boolean bool2, @sp3(name = "enableClipboard") Boolean bool3, @sp3(name = "enableFileTransfer") Boolean bool4, @sp3(name = "enableMonitoring") Boolean bool5, @sp3(name = "enableNudge") Boolean bool6, @sp3(name = "enableOpenUri") Boolean bool7, @sp3(name = "enableProcesses") Boolean bool8, @sp3(name = "enableScreen") Boolean bool9, @sp3(name = "enableScreenshot") Boolean bool10, @sp3(name = "enableWifiConfiguration") Boolean bool11, @sp3(name = "enableEmailConfiguration") Boolean bool12, @sp3(name = "enableExchangeConfiguration") Boolean bool13, @sp3(name = "enableConfigurationProfileImport") Boolean bool14) {
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
        this.enableApps = bool;
        this.enableChat = bool2;
        this.enableClipboard = bool3;
        this.enableFileTransfer = bool4;
        this.enableMonitoring = bool5;
        this.enableNudge = bool6;
        this.enableOpenUri = bool7;
        this.enableProcesses = bool8;
        this.enableScreen = bool9;
        this.enableScreenshot = bool10;
        this.enableWifiConfiguration = bool11;
        this.enableEmailConfiguration = bool12;
        this.enableExchangeConfiguration = bool13;
        this.enableConfigurationProfileImport = bool14;
    }
}
