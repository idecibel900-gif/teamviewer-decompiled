package com.teamviewer.teamviewerlib.swig.tvbackendcontainer;

import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import com.teamviewer.teamviewerlib.swig.tvclientlicensing.ILicensing;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ClientConnectorAndroid;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.IPListClientConnector;

/* JADX INFO: loaded from: classes.dex */
public class BackendContainerAndroid {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public BackendContainerAndroid(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static BackendContainerAndroid GetInstance() {
        long jBackendContainerAndroid_GetInstance = BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetInstance();
        if (jBackendContainerAndroid_GetInstance == 0) {
            return null;
        }
        return new BackendContainerAndroid(jBackendContainerAndroid_GetInstance, true);
    }

    public static long getCPtr(BackendContainerAndroid backendContainerAndroid) {
        if (backendContainerAndroid == null) {
            return 0L;
        }
        return backendContainerAndroid.swigCPtr;
    }

    public IAccountAndroid GetAccount() {
        long jBackendContainerAndroid_GetAccount = BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetAccount(this.swigCPtr, this);
        if (jBackendContainerAndroid_GetAccount == 0) {
            return null;
        }
        return new IAccountAndroid(jBackendContainerAndroid_GetAccount, true);
    }

    public ClientConnectorAndroid GetClientConnector() {
        long jBackendContainerAndroid_GetClientConnector = BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetClientConnector(this.swigCPtr, this);
        if (jBackendContainerAndroid_GetClientConnector == 0) {
            return null;
        }
        return new ClientConnectorAndroid(jBackendContainerAndroid_GetClientConnector, true);
    }

    public SWIGTYPE_p_tvaddressbook__ICompanyAddressBookPtr GetCompanyAddressBook() {
        return new SWIGTYPE_p_tvaddressbook__ICompanyAddressBookPtr(BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetCompanyAddressBook(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_tvstd__IDispatcherPtr GetFrontendDispatcher() {
        return new SWIGTYPE_p_tvstd__IDispatcherPtr(BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetFrontendDispatcher(this.swigCPtr, this), true);
    }

    public ILicensing GetLicensing() {
        long jBackendContainerAndroid_GetLicensing = BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetLicensing(this.swigCPtr, this);
        if (jBackendContainerAndroid_GetLicensing == 0) {
            return null;
        }
        return new ILicensing(jBackendContainerAndroid_GetLicensing, true);
    }

    public SWIGTYPE_p_tvpartnerlistconnection__IPLStartConnectionFactoryPtr GetPLStartConnectionFactory() {
        return new SWIGTYPE_p_tvpartnerlistconnection__IPLStartConnectionFactoryPtr(BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetPLStartConnectionFactory(this.swigCPtr, this), true);
    }

    public IPListClientConnector GetPartnerlistClientConnector() {
        long jBackendContainerAndroid_GetPartnerlistClientConnector = BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetPartnerlistClientConnector(this.swigCPtr, this);
        if (jBackendContainerAndroid_GetPartnerlistClientConnector == 0) {
            return null;
        }
        return new IPListClientConnector(jBackendContainerAndroid_GetPartnerlistClientConnector, true);
    }

    public SWIGTYPE_p_tvclientstatistics__IClientStatisticsConfigurationPtr GetStatisticsConfiguration() {
        return new SWIGTYPE_p_tvclientstatistics__IClientStatisticsConfigurationPtr(BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetStatisticsConfiguration(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_tvinterprocessbase__IWorkingProxyPtr GetWorkingProxy() {
        return new SWIGTYPE_p_tvinterprocessbase__IWorkingProxyPtr(BackendContainerAndroidSWIGJNI.BackendContainerAndroid_GetWorkingProxy(this.swigCPtr, this), true);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    BackendContainerAndroidSWIGJNI.delete_BackendContainerAndroid(j);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
