package com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection;

import com.teamviewer.teamviewerlib.swig.tvcrypto.ICryptoKey;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public class ClientConnectParams {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ClientConnectParams() {
        this(ClientConnectParamsSWIGJNI.new_ClientConnectParams(), true);
    }

    public static long getCPtr(ClientConnectParams clientConnectParams) {
        if (clientConnectParams == null) {
            return 0L;
        }
        return clientConnectParams.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ClientConnectParamsSWIGJNI.delete_ClientConnectParams(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public String getActiveDeviceName() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_activeDeviceName_get(this.swigCPtr, this);
    }

    public boolean getAutoTryLastPassword() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_autoTryLastPassword_get(this.swigCPtr, this);
    }

    public int getConnectionMode() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_connectionMode_get(this.swigCPtr, this);
    }

    public String getDestination() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_destination_get(this.swigCPtr, this);
    }

    public int getInstantSupportFlags() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_instantSupportFlags_get(this.swigCPtr, this);
    }

    public boolean getInstantSupportIsOemLicensed() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_instantSupportIsOemLicensed_get(this.swigCPtr, this);
    }

    public String getInstantSupportSessionId() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_getInstantSupportSessionId(this.swigCPtr, this);
    }

    public SWIGTYPE_p_tvproviderapi__InstantSupportManagementCommands__InstantSupportType getInstantSupportType() {
        return new SWIGTYPE_p_tvproviderapi__InstantSupportManagementCommands__InstantSupportType(ClientConnectParamsSWIGJNI.ClientConnectParams_instantSupportType_get(this.swigCPtr, this), true);
    }

    public boolean getIsCompanyAddressBookInvitation() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_isCompanyAddressBookInvitation_get(this.swigCPtr, this);
    }

    public boolean getManagedDeviceEasyAccessV2() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_managedDeviceEasyAccessV2_get(this.swigCPtr, this);
    }

    public boolean getManagedDeviceV2PromptForConfirmation() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_managedDeviceV2PromptForConfirmation_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_boost__uuids__uuid getManagerID() {
        return new SWIGTYPE_p_boost__uuids__uuid(ClientConnectParamsSWIGJNI.ClientConnectParams_managerID_get(this.swigCPtr, this), true);
    }

    public ICryptoKey getManagerSigningKey() {
        long jClientConnectParams_managerSigningKey_get = ClientConnectParamsSWIGJNI.ClientConnectParams_managerSigningKey_get(this.swigCPtr, this);
        if (jClientConnectParams_managerSigningKey_get == 0) {
            return null;
        }
        return new ICryptoKey(jClientConnectParams_managerSigningKey_get, true);
    }

    public SWIGTYPE_p_tvmodularsessiontypes__IModularSessionInfoPtr getModularSessionInfo() {
        return new SWIGTYPE_p_tvmodularsessiontypes__IModularSessionInfoPtr(ClientConnectParamsSWIGJNI.ClientConnectParams_modularSessionInfo_get(this.swigCPtr, this), true);
    }

    public long getPartnerBuddyID() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_partnerBuddyID_get(this.swigCPtr, this);
    }

    public int getPartnerSessionID() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_partnerSessionID_get(this.swigCPtr, this);
    }

    public long getReconnectToken() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_reconnectToken_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_tvtypes__ServiceCaseId getServiceCaseId() {
        return new SWIGTYPE_p_tvtypes__ServiceCaseId(ClientConnectParamsSWIGJNI.ClientConnectParams_serviceCaseId_get(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_std__optionalT_std__string_t getThirdPartyId() {
        long jClientConnectParams_thirdPartyId_get = ClientConnectParamsSWIGJNI.ClientConnectParams_thirdPartyId_get(this.swigCPtr, this);
        if (jClientConnectParams_thirdPartyId_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_std__optionalT_std__string_t(jClientConnectParams_thirdPartyId_get, false);
    }

    public SWIGTYPE_p_std__optionalT_std__string_t getThirdPartyName() {
        long jClientConnectParams_thirdPartyName_get = ClientConnectParamsSWIGJNI.ClientConnectParams_thirdPartyName_get(this.swigCPtr, this);
        if (jClientConnectParams_thirdPartyName_get == 0) {
            return null;
        }
        return new SWIGTYPE_p_std__optionalT_std__string_t(jClientConnectParams_thirdPartyName_get, false);
    }

    public String getWebClientUITab() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_webClientUITab_get(this.swigCPtr, this);
    }

    public boolean getWinAuthOnly() {
        return ClientConnectParamsSWIGJNI.ClientConnectParams_winAuthOnly_get(this.swigCPtr, this);
    }

    public void setActiveDeviceName(String str) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_activeDeviceName_set(this.swigCPtr, this, str);
    }

    public void setAutoTryLastPassword(boolean z) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_autoTryLastPassword_set(this.swigCPtr, this, z);
    }

    public void setConnectionMode(int i) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_connectionMode_set(this.swigCPtr, this, i);
    }

    public void setDestination(String str) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_destination_set(this.swigCPtr, this, str);
    }

    public void setInstantSupportFlags(int i) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_instantSupportFlags_set(this.swigCPtr, this, i);
    }

    public void setInstantSupportIsOemLicensed(boolean z) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_instantSupportIsOemLicensed_set(this.swigCPtr, this, z);
    }

    public void setInstantSupportSessionId(String str) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_setInstantSupportSessionId(this.swigCPtr, this, str);
    }

    public void setInstantSupportType(SWIGTYPE_p_tvproviderapi__InstantSupportManagementCommands__InstantSupportType sWIGTYPE_p_tvproviderapi__InstantSupportManagementCommands__InstantSupportType) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_instantSupportType_set(this.swigCPtr, this, SWIGTYPE_p_tvproviderapi__InstantSupportManagementCommands__InstantSupportType.getCPtr(sWIGTYPE_p_tvproviderapi__InstantSupportManagementCommands__InstantSupportType));
    }

    public void setIsCompanyAddressBookInvitation(boolean z) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_isCompanyAddressBookInvitation_set(this.swigCPtr, this, z);
    }

    public void setManagedDeviceEasyAccessV2(boolean z) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_managedDeviceEasyAccessV2_set(this.swigCPtr, this, z);
    }

    public void setManagedDeviceV2PromptForConfirmation(boolean z) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_managedDeviceV2PromptForConfirmation_set(this.swigCPtr, this, z);
    }

    public void setManagerID(SWIGTYPE_p_boost__uuids__uuid sWIGTYPE_p_boost__uuids__uuid) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_managerID_set(this.swigCPtr, this, SWIGTYPE_p_boost__uuids__uuid.getCPtr(sWIGTYPE_p_boost__uuids__uuid));
    }

    public void setManagerId(String str) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_setManagerId(this.swigCPtr, this, str);
    }

    public void setManagerSigningKey(ICryptoKey iCryptoKey) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_managerSigningKey_set(this.swigCPtr, this, ICryptoKey.getCPtr(iCryptoKey), iCryptoKey);
    }

    public void setModularSessionInfo(SWIGTYPE_p_tvmodularsessiontypes__IModularSessionInfoPtr sWIGTYPE_p_tvmodularsessiontypes__IModularSessionInfoPtr) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_modularSessionInfo_set(this.swigCPtr, this, SWIGTYPE_p_tvmodularsessiontypes__IModularSessionInfoPtr.getCPtr(sWIGTYPE_p_tvmodularsessiontypes__IModularSessionInfoPtr));
    }

    public void setPartnerBuddyID(long j) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_partnerBuddyID_set(this.swigCPtr, this, j);
    }

    public void setPartnerDyngateId(DyngateID dyngateID) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_setPartnerDyngateId(this.swigCPtr, this, DyngateID.getCPtr(dyngateID), dyngateID);
    }

    public void setPartnerSessionID(int i) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_partnerSessionID_set(this.swigCPtr, this, i);
    }

    public void setReconnectToken(long j) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_reconnectToken_set(this.swigCPtr, this, j);
    }

    public void setServiceCaseId(SWIGTYPE_p_tvtypes__ServiceCaseId sWIGTYPE_p_tvtypes__ServiceCaseId) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_serviceCaseId_set(this.swigCPtr, this, SWIGTYPE_p_tvtypes__ServiceCaseId.getCPtr(sWIGTYPE_p_tvtypes__ServiceCaseId));
    }

    public void setThirdPartyId(SWIGTYPE_p_std__optionalT_std__string_t sWIGTYPE_p_std__optionalT_std__string_t) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_thirdPartyId_set(this.swigCPtr, this, SWIGTYPE_p_std__optionalT_std__string_t.getCPtr(sWIGTYPE_p_std__optionalT_std__string_t));
    }

    public void setThirdPartyName(SWIGTYPE_p_std__optionalT_std__string_t sWIGTYPE_p_std__optionalT_std__string_t) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_thirdPartyName_set(this.swigCPtr, this, SWIGTYPE_p_std__optionalT_std__string_t.getCPtr(sWIGTYPE_p_std__optionalT_std__string_t));
    }

    public void setUseEasyAccess(String str) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_setUseEasyAccess(this.swigCPtr, this, str);
    }

    public void setWebClientUITab(String str) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_webClientUITab_set(this.swigCPtr, this, str);
    }

    public void setWinAuthOnly(boolean z) {
        ClientConnectParamsSWIGJNI.ClientConnectParams_winAuthOnly_set(this.swigCPtr, this, z);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ClientConnectParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
