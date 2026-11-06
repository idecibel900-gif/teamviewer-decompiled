package com.teamviewer.apidefinitions.custommodules.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0005\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0005\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0005\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#8&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0016R\u001c\u0010*\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0005\u001a\u0004\b,\u0010\u0016R\u001c\u0010-\u001a\u0004\u0018\u00010\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0005\u001a\u0004\b/\u0010!R\u001c\u00100\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0005\u001a\u0004\b2\u0010\u0016R\u001c\u00103\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0005\u001a\u0004\b5\u0010\u0016R\u001c\u00106\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0005\u001a\u0004\b8\u0010\u0016R\u001c\u00109\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0005\u001a\u0004\b;\u0010\u0016R\u001c\u0010<\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0005\u001a\u0004\b>\u0010\u0016R\u001c\u0010?\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0005\u001a\u0004\bA\u0010\u0016R\u001c\u0010B\u001a\u0004\u0018\u00010C8&X§\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0005\u001a\u0004\bE\u0010FR\u001c\u0010G\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0005\u001a\u0004\bI\u0010\u0016R\u001c\u0010J\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0005\u001a\u0004\bL\u0010\u0016R\u001c\u0010M\u001a\u0004\u0018\u00010\u00138&X§\u0004¢\u0006\f\u0012\u0004\bN\u0010\u0005\u001a\u0004\bO\u0010\u0016¨\u0006P"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;", "", "moduleType", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "getModuleType$annotations", "()V", "getModuleType", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleType;", "editorVersion", "Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "getEditorVersion$annotations", "getEditorVersion", "()Lcom/teamviewer/apidefinitions/custommodules/models/EditorVersion;", "status", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "getStatus$annotations", "getStatus", "()Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleStatus;", "moduleId", "", "getModuleId$annotations", "getModuleId", "()Ljava/lang/String;", "name", "getName$annotations", "getName", "owner", "getOwner$annotations", "getOwner", "ownerId", "", "getOwnerId$annotations", "getOwnerId", "()Ljava/lang/Integer;", "lastUpdated", "Ljava/time/OffsetDateTime;", "getLastUpdated$annotations", "getLastUpdated", "()Ljava/time/OffsetDateTime;", "lastUpdatedBy", "getLastUpdatedBy$annotations", "getLastUpdatedBy", "alias", "getAlias$annotations", "getAlias", "intendedTeamViewerVersion", "getIntendedTeamViewerVersion$annotations", "getIntendedTeamViewerVersion", "title", "getTitle$annotations", "getTitle", "text", "getText$annotations", "getText", "backgroundColor", "getBackgroundColor$annotations", "getBackgroundColor", "textColor", "getTextColor$annotations", "getTextColor", "logoFileName", "getLogoFileName$annotations", "getLogoFileName", "logoUrl", "getLogoUrl$annotations", "getLogoUrl", "downloadUrlType", "Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "getDownloadUrlType$annotations", "getDownloadUrlType", "()Lcom/teamviewer/apidefinitions/custommodules/models/DownloadUrlType;", "downloadConfigurationUrl", "getDownloadConfigurationUrl$annotations", "getDownloadConfigurationUrl", "downloadModuleViaConfigIdUrl", "getDownloadModuleViaConfigIdUrl$annotations", "getDownloadModuleViaConfigIdUrl", "downloadModuleViaAliasUrl", "getDownloadModuleViaAliasUrl$annotations", "getDownloadModuleViaAliasUrl", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CustomModule {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @sp3(name = "alias")
        public static /* synthetic */ void getAlias$annotations() {
        }

        @sp3(name = "backgroundColor")
        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        @sp3(name = "downloadConfigurationUrl")
        public static /* synthetic */ void getDownloadConfigurationUrl$annotations() {
        }

        @sp3(name = "downloadModuleViaAliasUrl")
        public static /* synthetic */ void getDownloadModuleViaAliasUrl$annotations() {
        }

        @sp3(name = "downloadModuleViaConfigIdUrl")
        public static /* synthetic */ void getDownloadModuleViaConfigIdUrl$annotations() {
        }

        @sp3(name = "downloadUrlType")
        public static /* synthetic */ void getDownloadUrlType$annotations() {
        }

        @sp3(name = "editorVersion")
        public static /* synthetic */ void getEditorVersion$annotations() {
        }

        @sp3(name = "intendedTeamViewerVersion")
        public static /* synthetic */ void getIntendedTeamViewerVersion$annotations() {
        }

        @sp3(name = "lastUpdated")
        public static /* synthetic */ void getLastUpdated$annotations() {
        }

        @sp3(name = "lastUpdatedBy")
        public static /* synthetic */ void getLastUpdatedBy$annotations() {
        }

        @sp3(name = "logoFileName")
        public static /* synthetic */ void getLogoFileName$annotations() {
        }

        @sp3(name = "logoUrl")
        public static /* synthetic */ void getLogoUrl$annotations() {
        }

        @sp3(name = "moduleId")
        public static /* synthetic */ void getModuleId$annotations() {
        }

        @sp3(name = "moduleType")
        public static /* synthetic */ void getModuleType$annotations() {
        }

        @sp3(name = "name")
        public static /* synthetic */ void getName$annotations() {
        }

        @sp3(name = "owner")
        public static /* synthetic */ void getOwner$annotations() {
        }

        @sp3(name = "ownerId")
        public static /* synthetic */ void getOwnerId$annotations() {
        }

        @sp3(name = "status")
        public static /* synthetic */ void getStatus$annotations() {
        }

        @sp3(name = "text")
        public static /* synthetic */ void getText$annotations() {
        }

        @sp3(name = "textColor")
        public static /* synthetic */ void getTextColor$annotations() {
        }

        @sp3(name = "title")
        public static /* synthetic */ void getTitle$annotations() {
        }
    }

    String getAlias();

    String getBackgroundColor();

    String getDownloadConfigurationUrl();

    String getDownloadModuleViaAliasUrl();

    String getDownloadModuleViaConfigIdUrl();

    DownloadUrlType getDownloadUrlType();

    EditorVersion getEditorVersion();

    Integer getIntendedTeamViewerVersion();

    OffsetDateTime getLastUpdated();

    String getLastUpdatedBy();

    String getLogoFileName();

    String getLogoUrl();

    String getModuleId();

    CustomModuleType getModuleType();

    String getName();

    String getOwner();

    Integer getOwnerId();

    CustomModuleStatus getStatus();

    String getText();

    String getTextColor();

    String getTitle();
}
