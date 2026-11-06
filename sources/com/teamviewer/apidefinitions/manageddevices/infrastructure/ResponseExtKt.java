package com.teamviewer.apidefinitions.manageddevices.infrastructure;

import kotlin.Metadata;
import o.fx3;
import o.kc6;
import o.mt4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lo/kc6;", "Lo/mt4;", "serializerBuilder", "getErrorResponse", "(Lo/kc6;Lo/mt4;)Ljava/lang/Object;", "kotlin-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ResponseExtKt {
    public static final <T> T getErrorResponse(kc6<?> kc6Var, mt4 mt4Var) {
        fx3.t(kc6Var, mt4Var, mt4Var);
        throw null;
    }

    public static Object getErrorResponse$default(kc6 kc6Var, mt4 mt4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            mt4Var = Serializer.getMoshiBuilder();
        }
        fx3.t(kc6Var, mt4Var, mt4Var);
        throw null;
    }
}
