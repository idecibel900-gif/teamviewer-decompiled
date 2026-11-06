package com.teamviewer.teamviewerlib.swig.tvclientstatistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class IGeneralStatisticsSender {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IGeneralStatisticsSender(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IGeneralStatisticsSender iGeneralStatisticsSender) {
        if (iGeneralStatisticsSender == null) {
            return 0L;
        }
        return iGeneralStatisticsSender.swigCPtr;
    }

    public static long swigRelease(IGeneralStatisticsSender iGeneralStatisticsSender) {
        if (iGeneralStatisticsSender != null) {
            if (iGeneralStatisticsSender.swigCMemOwn) {
                long j = iGeneralStatisticsSender.swigCPtr;
                iGeneralStatisticsSender.swigCMemOwn = false;
                iGeneralStatisticsSender.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            if (this.swigCPtr != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    throw new UnsupportedOperationException("C++ destructor does not have public access");
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public enum GeneralStatisticsInfoType {
        AutoStartAsService,
        BlacklistUsed,
        WhitelistUsed,
        BlackWhitelistAccounts,
        OptionsOnlyAdmin,
        UserIsAdministrator,
        DisplayNameUsed,
        PresAutostart,
        MultiUserSupport,
        ListenPort80Deactivated,
        OptionsPasswordSafe,
        UseOldPresentationMode,
        ChatToMachineDisabled,
        ClientTabsEnabled,
        VideoCamIsPresent,
        MonitorDriverInstalled,
        AddPartnerButtonUsed,
        CQSWithAccount,
        CQSWithDisclamer,
        BuddyListLoggedIn,
        BuddyChatUsed,
        DisableInputUsed,
        BlackScreenUsed,
        MinimizeToTray,
        RemoteAccessWizardAccountCreated,
        RemoteAccessWizardUsed,
        RemoteAccessWizardAddedComputerToAccount,
        ProxyFoundInPAC,
        PermanentPassword,
        TVLanguage,
        WindowsLanguage,
        WindowsCountry,
        DynGateID,
        VersionMajor,
        VersionMinor,
        VersionBuild,
        Edition,
        WindowsVersion,
        PasswordStrength,
        PreferredConnectionMode,
        NumberOfMonitors,
        RemoteAccessWizardAccountCreatedVia,
        AccessControlsIncoming,
        AccessControlsOutgoing,
        AndroidModel,
        LocalScreenWidth,
        LocalScreenHeight;

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        GeneralStatisticsInfoType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static GeneralStatisticsInfoType swigToEnum(int i) {
            GeneralStatisticsInfoType[] generalStatisticsInfoTypeArr = (GeneralStatisticsInfoType[]) GeneralStatisticsInfoType.class.getEnumConstants();
            if (i < generalStatisticsInfoTypeArr.length && i >= 0) {
                GeneralStatisticsInfoType generalStatisticsInfoType = generalStatisticsInfoTypeArr[i];
                if (generalStatisticsInfoType.swigValue == i) {
                    return generalStatisticsInfoType;
                }
            }
            for (GeneralStatisticsInfoType generalStatisticsInfoType2 : generalStatisticsInfoTypeArr) {
                if (generalStatisticsInfoType2.swigValue == i) {
                    return generalStatisticsInfoType2;
                }
            }
            hk0.g(ua5.k(i, GeneralStatisticsInfoType.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        GeneralStatisticsInfoType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        GeneralStatisticsInfoType(GeneralStatisticsInfoType generalStatisticsInfoType) {
            int i = generalStatisticsInfoType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }
}
