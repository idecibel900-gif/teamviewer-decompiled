package com.teamviewer.apidefinitions.mobilewake.apis;

import com.teamviewer.apidefinitions.mobilewake.models.MobileWakeRequest;
import com.teamviewer.apidefinitions.mobilewake.models.MobileWakeResponse;
import kotlin.Metadata;
import o.j80;
import o.qi0;
import o.yc5;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/apidefinitions/mobilewake/apis/MobilewakeApi;", "", "Lcom/teamviewer/apidefinitions/mobilewake/models/MobileWakeRequest;", "mobileWakeRequest", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/mobilewake/models/MobileWakeResponse;", "mobilewake", "(Lcom/teamviewer/apidefinitions/mobilewake/models/MobileWakeRequest;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MobilewakeApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 mobilewake$default(MobilewakeApi mobilewakeApi, MobileWakeRequest mobileWakeRequest, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: mobilewake");
                return null;
            }
            if ((i & 1) != 0) {
                mobileWakeRequest = null;
            }
            return mobilewakeApi.mobilewake(mobileWakeRequest);
        }
    }

    @yc5("mobilewakeup")
    qi0<MobileWakeResponse> mobilewake(@j80 MobileWakeRequest mobileWakeRequest);
}
