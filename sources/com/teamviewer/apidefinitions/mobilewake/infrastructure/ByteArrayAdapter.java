package com.teamviewer.apidefinitions.mobilewake.infrastructure;

import kotlin.Metadata;
import o.sv2;
import o.tv7;
import o.vn0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/teamviewer/apidefinitions/mobilewake/infrastructure/ByteArrayAdapter;", "", "<init>", "()V", "toJson", "", "data", "", "fromJson", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteArrayAdapter {
    @sv2
    public final byte[] fromJson(String data) {
        data.getClass();
        byte[] bytes = data.getBytes(vn0.a);
        bytes.getClass();
        return bytes;
    }

    @tv7
    public final String toJson(byte[] data) {
        data.getClass();
        return new String(data, vn0.a);
    }
}
