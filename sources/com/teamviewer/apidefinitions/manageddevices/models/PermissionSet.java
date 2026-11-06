package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.bq3;
import o.ic2;
import o.qs1;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010#\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006%"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionSet;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ManagerAdministration", "DeviceAdministration", "GroupAdministration", "PolicyAdministration", "RMMonitoringPolicyAdministration", "RMPatchManagementPolicyAdministration", "DeviceDescription", "EasyAccess", "ScriptExecution", "ConditionalAccessSessionApprover", "ConditionalAccessSessionRequester", "SoftwareUpdate", "RMBackupPolicyAdministration", "RMBackupKeys", "InheritDeviceAdministration", "InheritDeviceDescription", "InheritManagerAdministration", "InheritPolicyAdministration", "InheritRMBackupPolicyAdministration", "InheritRMBackupKeys", "InheritScriptExecution", "InheritSoftwareUpdate", "CustomFieldsAdministration", "ManageServiceActivations", "PasswordManagement", "InheritManageServiceActivations", "UnifiedPolicyAdministration", "toString", "Companion", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@bq3(generateAdapter = false)
public enum PermissionSet {
    ManagerAdministration("ManagerAdministration"),
    DeviceAdministration("DeviceAdministration"),
    GroupAdministration("GroupAdministration"),
    PolicyAdministration("PolicyAdministration"),
    RMMonitoringPolicyAdministration("RMMonitoringPolicyAdministration"),
    RMPatchManagementPolicyAdministration("RMPatchManagementPolicyAdministration"),
    DeviceDescription("DeviceDescription"),
    EasyAccess("EasyAccess"),
    ScriptExecution("ScriptExecution"),
    ConditionalAccessSessionApprover("ConditionalAccessSessionApprover"),
    ConditionalAccessSessionRequester("ConditionalAccessSessionRequester"),
    SoftwareUpdate("SoftwareUpdate"),
    RMBackupPolicyAdministration("RMBackupPolicyAdministration"),
    RMBackupKeys("RMBackupKeys"),
    InheritDeviceAdministration("InheritDeviceAdministration"),
    InheritDeviceDescription("InheritDeviceDescription"),
    InheritManagerAdministration("InheritManagerAdministration"),
    InheritPolicyAdministration("InheritPolicyAdministration"),
    InheritRMBackupPolicyAdministration("InheritRMBackupPolicyAdministration"),
    InheritRMBackupKeys("InheritRMBackupKeys"),
    InheritScriptExecution("InheritScriptExecution"),
    InheritSoftwareUpdate("InheritSoftwareUpdate"),
    CustomFieldsAdministration("CustomFieldsAdministration"),
    ManageServiceActivations("ManageServiceActivations"),
    PasswordManagement("PasswordManagement"),
    InheritManageServiceActivations("InheritManageServiceActivations"),
    UnifiedPolicyAdministration("UnifiedPolicyAdministration");

    private final String value;
    private static final /* synthetic */ ic2 $ENTRIES = qs1.K(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    PermissionSet(String str) {
        this.value = str;
    }

    public static ic2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionSet$Companion;", "", "<init>", "()V", "encode", "", "data", "decode", "Lcom/teamviewer/apidefinitions/manageddevices/models/PermissionSet;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PermissionSet decode(Object data) {
            if (data != null) {
                String lowerCase = String.valueOf(data).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                for (PermissionSet permissionSet : PermissionSet.values()) {
                    if (data == permissionSet || ua5.y(String.valueOf(permissionSet), Locale.ROOT, lowerCase)) {
                        return permissionSet;
                    }
                }
            }
            return null;
        }

        public final String encode(Object data) {
            if (data instanceof PermissionSet) {
                return String.valueOf(data);
            }
            return null;
        }

        private Companion() {
        }
    }
}
