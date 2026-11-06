package com.teamviewer.oneapinetworklib.adapters;

import com.teamviewer.apidefinitions.account.models.CompanyPermission;
import java.util.Iterator;
import kotlin.Metadata;
import o.sv2;
import o.tv7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/teamviewer/oneapinetworklib/adapters/CompanyPermissionAdapter;", "", "", "value", "Lcom/teamviewer/apidefinitions/account/models/CompanyPermission;", "fromJson", "(I)Lcom/teamviewer/apidefinitions/account/models/CompanyPermission;", "permission", "toJson", "(Lcom/teamviewer/apidefinitions/account/models/CompanyPermission;)I", "OneAPINetworkLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CompanyPermissionAdapter {
    @sv2
    public final CompanyPermission fromJson(int value) {
        Object next;
        Iterator<E> it = CompanyPermission.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((CompanyPermission) next).getValue() == value) {
                return (CompanyPermission) next;
            }
        }
        next = null;
        return (CompanyPermission) next;
    }

    @tv7
    public final int toJson(CompanyPermission permission) {
        permission.getClass();
        return permission.getValue();
    }
}
