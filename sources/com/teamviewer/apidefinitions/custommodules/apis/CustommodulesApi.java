package com.teamviewer.apidefinitions.custommodules.apis;

import com.teamviewer.apidefinitions.custommodules.models.AliasAvailabilityParams;
import com.teamviewer.apidefinitions.custommodules.models.AliasAvailabilityResult;
import com.teamviewer.apidefinitions.custommodules.models.CustomLogoCreationParams;
import com.teamviewer.apidefinitions.custommodules.models.CustomLogoCreationResult;
import com.teamviewer.apidefinitions.custommodules.models.CustomModule;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleMetaDataList;
import com.teamviewer.apidefinitions.custommodules.models.TeamViewerModuleUrls;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;
import o.zc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H'¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/teamviewer/apidefinitions/custommodules/apis/CustommodulesApi;", "", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;", "customModule", "Lo/qi0;", "addCustomModule", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;)Lo/qi0;", "", "moduleid", "changeCustomModule", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/custommodules/models/CustomModule;)Lo/qi0;", "Lo/f88;", "deleteCustomModule", "(Ljava/lang/String;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/custommodules/models/AliasAvailabilityParams;", "aliasAvailabilityParams", "Lcom/teamviewer/apidefinitions/custommodules/models/AliasAvailabilityResult;", "getAliasAvailability", "(Lcom/teamviewer/apidefinitions/custommodules/models/AliasAvailabilityParams;)Lo/qi0;", "getCustomModuleDetails", "Lcom/teamviewer/apidefinitions/custommodules/models/TeamViewerModuleUrls;", "getTeamViewerModuleUrls", "()Lo/qi0;", "paginationToken", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomModuleMetaDataList;", "listCustomModules", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoCreationParams;", "customLogoCreationParams", "Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoCreationResult;", "uploadCustomLogo", "(Lcom/teamviewer/apidefinitions/custommodules/models/CustomLogoCreationParams;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CustommodulesApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 listCustomModules$default(CustommodulesApi custommodulesApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: listCustomModules");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return custommodulesApi.listCustomModules(str);
        }
    }

    @yc5("custommodules")
    qi0<CustomModule> addCustomModule(@j80 CustomModule customModule);

    @zc5("custommodule/{moduleid}")
    qi0<CustomModule> changeCustomModule(@xg5("moduleid") String moduleid, @j80 CustomModule customModule);

    @jg1("custommodule/{moduleid}")
    qi0<f88> deleteCustomModule(@xg5("moduleid") String moduleid);

    @yc5("aliasavailability")
    qi0<AliasAvailabilityResult> getAliasAvailability(@j80 AliasAvailabilityParams aliasAvailabilityParams);

    @ox2("custommodule/{moduleid}")
    qi0<CustomModule> getCustomModuleDetails(@xg5("moduleid") String moduleid);

    @ox2("teamviewermoduleurls")
    qi0<TeamViewerModuleUrls> getTeamViewerModuleUrls();

    @ox2("custommodules")
    qi0<CustomModuleMetaDataList> listCustomModules(@sy5("paginationToken") String paginationToken);

    @yc5("customlogo")
    qi0<CustomLogoCreationResult> uploadCustomLogo(@j80 CustomLogoCreationParams customLogoCreationParams);
}
