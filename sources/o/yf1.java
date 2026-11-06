package o;

import com.teamviewer.apidefinitions.custommodules.models.CustomModule;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleAndroidHost;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleAndroidQuickSupport;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleFull;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleHost;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleMobileQuickSupport;
import com.teamviewer.apidefinitions.custommodules.models.CustomModulePilot;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleQuickJoin;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleQuickSupport;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yf1 {
    public static final do5 a;

    static {
        List list = Collections.EMPTY_LIST;
        String value = CustomModuleType.CustomModuleAndroidHost.getValue();
        if (value == null) {
            yq4.l("label == null");
            return;
        }
        if (list.contains(value)) {
            hk0.g("Labels must be unique.");
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(value);
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(CustomModuleAndroidHost.class);
        a = new do5(CustomModule.class, "moduleType", arrayList, arrayList2).b(CustomModuleAndroidQuickSupport.class, CustomModuleType.CustomModuleAndroidQuickSupport.getValue()).b(CustomModuleFull.class, CustomModuleType.CustomModuleFull.getValue()).b(CustomModuleHost.class, CustomModuleType.CustomModuleHost.getValue()).b(CustomModuleMobileQuickSupport.class, CustomModuleType.CustomModuleMobileQuickSupport.getValue()).b(CustomModulePilot.class, CustomModuleType.CustomModulePilot.getValue()).b(CustomModuleQuickJoin.class, CustomModuleType.CustomModuleQuickJoin.getValue()).b(CustomModuleQuickSupport.class, CustomModuleType.CustomModuleQuickSupport.getValue());
    }
}
