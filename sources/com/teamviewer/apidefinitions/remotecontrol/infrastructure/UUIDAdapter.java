package com.teamviewer.apidefinitions.remotecontrol.infrastructure;

import java.util.UUID;
import kotlin.Metadata;
import o.sv2;
import o.tv7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/infrastructure/UUIDAdapter;", "", "<init>", "()V", "toJson", "", "uuid", "Ljava/util/UUID;", "fromJson", "s", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UUIDAdapter {
    @sv2
    public final UUID fromJson(String s) {
        s.getClass();
        UUID uuidFromString = UUID.fromString(s);
        uuidFromString.getClass();
        return uuidFromString;
    }

    @tv7
    public final String toJson(UUID uuid) {
        uuid.getClass();
        String string = uuid.toString();
        string.getClass();
        return string;
    }
}
