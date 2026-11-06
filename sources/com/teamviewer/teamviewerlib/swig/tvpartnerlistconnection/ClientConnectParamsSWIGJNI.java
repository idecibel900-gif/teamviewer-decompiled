package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

import com.teamviewer.teamviewerlib.swig.tvcrypto.ICryptoKey;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public class ClientConnectParamsSWIGJNI {
    public static final native String ClientConnectParams_activeDeviceName_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_activeDeviceName_set(long j, ClientConnectParams clientConnectParams, String str);

    public static final native boolean ClientConnectParams_autoTryLastPassword_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_autoTryLastPassword_set(long j, ClientConnectParams clientConnectParams, boolean z);

    public static final native int ClientConnectParams_connectionMode_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_connectionMode_set(long j, ClientConnectParams clientConnectParams, int i);

    public static final native String ClientConnectParams_destination_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_destination_set(long j, ClientConnectParams clientConnectParams, String str);

    public static final native String ClientConnectParams_getInstantSupportSessionId(long j, ClientConnectParams clientConnectParams);

    public static final native int ClientConnectParams_instantSupportFlags_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_instantSupportFlags_set(long j, ClientConnectParams clientConnectParams, int i);

    public static final native boolean ClientConnectParams_instantSupportIsOemLicensed_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_instantSupportIsOemLicensed_set(long j, ClientConnectParams clientConnectParams, boolean z);

    public static final native long ClientConnectParams_instantSupportType_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_instantSupportType_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native boolean ClientConnectParams_isCompanyAddressBookInvitation_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_isCompanyAddressBookInvitation_set(long j, ClientConnectParams clientConnectParams, boolean z);

    public static final native boolean ClientConnectParams_managedDeviceEasyAccessV2_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_managedDeviceEasyAccessV2_set(long j, ClientConnectParams clientConnectParams, boolean z);

    public static final native boolean ClientConnectParams_managedDeviceV2PromptForConfirmation_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_managedDeviceV2PromptForConfirmation_set(long j, ClientConnectParams clientConnectParams, boolean z);

    public static final native long ClientConnectParams_managerID_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_managerID_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native long ClientConnectParams_managerSigningKey_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_managerSigningKey_set(long j, ClientConnectParams clientConnectParams, long j2, ICryptoKey iCryptoKey);

    public static final native long ClientConnectParams_modularSessionInfo_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_modularSessionInfo_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native long ClientConnectParams_partnerBuddyID_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_partnerBuddyID_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native int ClientConnectParams_partnerSessionID_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_partnerSessionID_set(long j, ClientConnectParams clientConnectParams, int i);

    public static final native long ClientConnectParams_reconnectToken_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_reconnectToken_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native long ClientConnectParams_serviceCaseId_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_serviceCaseId_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native void ClientConnectParams_setInstantSupportSessionId(long j, ClientConnectParams clientConnectParams, String str);

    public static final native void ClientConnectParams_setManagerId(long j, ClientConnectParams clientConnectParams, String str);

    public static final native void ClientConnectParams_setPartnerDyngateId(long j, ClientConnectParams clientConnectParams, long j2, DyngateID dyngateID);

    public static final native void ClientConnectParams_setUseEasyAccess(long j, ClientConnectParams clientConnectParams, String str);

    public static final native long ClientConnectParams_thirdPartyId_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_thirdPartyId_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native long ClientConnectParams_thirdPartyName_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_thirdPartyName_set(long j, ClientConnectParams clientConnectParams, long j2);

    public static final native String ClientConnectParams_webClientUITab_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_webClientUITab_set(long j, ClientConnectParams clientConnectParams, String str);

    public static final native boolean ClientConnectParams_winAuthOnly_get(long j, ClientConnectParams clientConnectParams);

    public static final native void ClientConnectParams_winAuthOnly_set(long j, ClientConnectParams clientConnectParams, boolean z);

    public static final native void delete_ClientConnectParams(long j);

    public static final native long new_ClientConnectParams();
}
