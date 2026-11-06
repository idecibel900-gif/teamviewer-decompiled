package com.teamviewer.apidefinitions.wakeonlan.apis;

import com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceRequest;
import com.teamviewer.apidefinitions.wakeonlan.models.WakeupDeviceResponse;
import kotlin.Metadata;
import o.j80;
import o.qi0;
import o.yc5;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/teamviewer/apidefinitions/wakeonlan/apis/WakeonlanApi;", "", "Lcom/teamviewer/apidefinitions/wakeonlan/models/WakeupDeviceRequest;", "wakeupDeviceRequest", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/wakeonlan/models/WakeupDeviceResponse;", "wakeupDevice", "(Lcom/teamviewer/apidefinitions/wakeonlan/models/WakeupDeviceRequest;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WakeonlanApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 wakeupDevice$default(WakeonlanApi wakeonlanApi, WakeupDeviceRequest wakeupDeviceRequest, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: wakeupDevice");
                return null;
            }
            if ((i & 1) != 0) {
                wakeupDeviceRequest = null;
            }
            return wakeonlanApi.wakeupDevice(wakeupDeviceRequest);
        }
    }

    @yc5("wakeupdevice")
    qi0<WakeupDeviceResponse> wakeupDevice(@j80 WakeupDeviceRequest wakeupDeviceRequest);
}
