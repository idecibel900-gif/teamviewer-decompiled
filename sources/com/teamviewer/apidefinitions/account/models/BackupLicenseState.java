package com.teamviewer.apidefinitions.account.models;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.bq3;
import o.ic2;
import o.qs1;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Invalid", "Active", "Suspended", "Cancelled", "Deactivated", "toString", "Companion", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@bq3(generateAdapter = false)
public enum BackupLicenseState {
    Invalid("Invalid"),
    Active("Active"),
    Suspended("Suspended"),
    Cancelled("Cancelled"),
    Deactivated("Deactivated");

    private final String value;
    private static final /* synthetic */ ic2 $ENTRIES = qs1.K(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    BackupLicenseState(String str) {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState$Companion;", "", "<init>", "()V", "encode", "", "data", "decode", "Lcom/teamviewer/apidefinitions/account/models/BackupLicenseState;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BackupLicenseState decode(Object data) {
            if (data != null) {
                String lowerCase = String.valueOf(data).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                for (BackupLicenseState backupLicenseState : BackupLicenseState.values()) {
                    if (data == backupLicenseState || ua5.y(String.valueOf(backupLicenseState), Locale.ROOT, lowerCase)) {
                        return backupLicenseState;
                    }
                }
            }
            return null;
        }

        public final String encode(Object data) {
            if (data instanceof BackupLicenseState) {
                return String.valueOf(data);
            }
            return null;
        }

        private Companion() {
        }
    }
}
