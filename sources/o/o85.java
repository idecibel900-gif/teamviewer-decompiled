package o;

import com.teamviewer.oneapinetworklib.swig.HttpHeaders;
import com.teamviewer.oneapinetworklib.swig.HttpStatusCode;
import com.teamviewer.oneapinetworklib.swig.IOneAPIResponseListener;
import com.teamviewer.oneapinetworklib.swig.OneAPIResponseAndroid;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o85 extends IOneAPIResponseListener {
    public final /* synthetic */ qx0 a;

    public o85(qx0 qx0Var) {
        this.a = qx0Var;
    }

    @Override // com.teamviewer.oneapinetworklib.swig.IOneAPIResponseListener
    public final void OnResponse(OneAPIResponseAndroid oneAPIResponseAndroid) {
        HttpHeaders headers;
        HttpStatusCode status;
        Map mapV = null;
        Integer numValueOf = (oneAPIResponseAndroid == null || (status = oneAPIResponseAndroid.getStatus()) == null) ? null : Integer.valueOf(status.swigValue());
        String statusText = oneAPIResponseAndroid != null ? oneAPIResponseAndroid.getStatusText() : null;
        String data = oneAPIResponseAndroid != null ? oneAPIResponseAndroid.getData() : null;
        if (oneAPIResponseAndroid != null && (headers = oneAPIResponseAndroid.getHeaders()) != null) {
            mapV = xm4.V(headers);
        }
        this.a.N(new z85(numValueOf, statusText, data, mapV));
    }
}
