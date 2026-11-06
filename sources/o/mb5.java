package o;

import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvpartnerlistconnection.ClientConnectorAndroid;

/* JADX INFO: loaded from: classes.dex */
public abstract class mb5 extends pt6 {
    public String b;
    public Boolean c;
    public boolean d;
    public String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb5(String str, String str2) {
        super(str);
        str.getClass();
        str2.getClass();
        this.b = str2;
        this.e = "";
    }

    public boolean a() {
        ClientConnectorAndroid clientConnectorAndroidGetClientConnector;
        BackendContainerAndroid backendContainerAndroidGetInstance = BackendContainerAndroid.GetInstance();
        return (backendContainerAndroidGetInstance == null || (clientConnectorAndroidGetClientConnector = backendContainerAndroidGetInstance.GetClientConnector()) == null || !clientConnectorAndroidGetClientConnector.GetHasEasyAccess()) ? false : true;
    }

    public void b(String str) {
        this.e = str;
    }

    public boolean c() {
        return this.a.length() > 0;
    }
}
