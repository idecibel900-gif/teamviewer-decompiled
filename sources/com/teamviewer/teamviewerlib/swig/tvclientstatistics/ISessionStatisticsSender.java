package com.teamviewer.teamviewerlib.swig.tvclientstatistics;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class ISessionStatisticsSender {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ISessionStatisticsSender(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ISessionStatisticsSender iSessionStatisticsSender) {
        if (iSessionStatisticsSender == null) {
            return 0L;
        }
        return iSessionStatisticsSender.swigCPtr;
    }

    public static long swigRelease(ISessionStatisticsSender iSessionStatisticsSender) {
        if (iSessionStatisticsSender != null) {
            if (iSessionStatisticsSender.swigCMemOwn) {
                long j = iSessionStatisticsSender.swigCPtr;
                iSessionStatisticsSender.swigCMemOwn = false;
                iSessionStatisticsSender.delete();
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

    public enum SessionStatisticsInfoType {
        SessionTypeSessionWasInitiatedFrom,
        SupporterAccountId,
        ScamBlockerResult,
        SendFileNumberOfFiles,
        QualityMode,
        SessionType,
        ConcurrentRCSessions,
        ClientScaling,
        WeakPersonalPasswordWasUsed,
        ConnectDeniedWrongVersion,
        ConnectDeniedInvisible,
        RemoteRebootUsed,
        RemoteLogoffUsed,
        RemoteSafeRebootUsed,
        CtrlAltDelUsed,
        RemoteSystemInfoUsed,
        LockWorkStation,
        RemoteResolutionChanged,
        AppSelUsedInSession,
        ScreenSharingIndicatorWasShown,
        DesktopNotAvailable,
        SingleWindowSelected,
        SessionChatUsed,
        ConnectionSmartAccess,
        RemoteRebootReconnect,
        WindowsAuthUsed,
        SessionRecorded,
        RemoteUpdateUsed,
        VoipSent,
        VideoSent,
        FiletransferUsed,
        NetworkTransportType,
        InSessionFabClicked,
        DisableInputUsed,
        BlackScreenUsed,
        ServerPanelWasHidden,
        SessionSummaryManualActivationAvailable,
        ConcurrentPRSessions,
        EnableInputInPres,
        PresentationPaused,
        ConcurrentIncomingSessionIDs,
        ConcurrentOutgoingSessionIDs,
        DirectionWasChanged;

        private final int swigValue;

        public static class SwigNext {
            private static int next;

            private SwigNext() {
            }
        }

        SessionStatisticsInfoType() {
            int i = SwigNext.next;
            SwigNext.next = i + 1;
            this.swigValue = i;
        }

        public static SessionStatisticsInfoType swigToEnum(int i) {
            SessionStatisticsInfoType[] sessionStatisticsInfoTypeArr = (SessionStatisticsInfoType[]) SessionStatisticsInfoType.class.getEnumConstants();
            if (i < sessionStatisticsInfoTypeArr.length && i >= 0) {
                SessionStatisticsInfoType sessionStatisticsInfoType = sessionStatisticsInfoTypeArr[i];
                if (sessionStatisticsInfoType.swigValue == i) {
                    return sessionStatisticsInfoType;
                }
            }
            for (SessionStatisticsInfoType sessionStatisticsInfoType2 : sessionStatisticsInfoTypeArr) {
                if (sessionStatisticsInfoType2.swigValue == i) {
                    return sessionStatisticsInfoType2;
                }
            }
            hk0.g(ua5.k(i, SessionStatisticsInfoType.class, "No enum ", " with value "));
            return null;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        SessionStatisticsInfoType(int i) {
            this.swigValue = i;
            SwigNext.next = i + 1;
        }

        SessionStatisticsInfoType(SessionStatisticsInfoType sessionStatisticsInfoType) {
            int i = sessionStatisticsInfoType.swigValue;
            this.swigValue = i;
            SwigNext.next = i + 1;
        }
    }
}
