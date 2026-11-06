package com.teamviewer.oneapinetworklib.adapters;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import o.sv2;
import o.tv7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/teamviewer/oneapinetworklib/adapters/OffsetDateTimeAdapter;", "", "Ljava/time/OffsetDateTime;", "value", "", "toJson", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;)Ljava/time/OffsetDateTime;", "OneAPINetworkLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OffsetDateTimeAdapter {
    @sv2
    public final OffsetDateTime fromJson(String value) {
        value.getClass();
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(value);
        offsetDateTime.getClass();
        return offsetDateTime;
    }

    @tv7
    public final String toJson(OffsetDateTime value) {
        value.getClass();
        String string = value.toString();
        string.getClass();
        return string;
    }
}
