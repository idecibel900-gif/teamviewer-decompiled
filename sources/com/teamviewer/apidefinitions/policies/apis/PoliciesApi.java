package com.teamviewer.apidefinitions.policies.apis;

import com.teamviewer.apidefinitions.policies.models.CreatePolicyResponse;
import com.teamviewer.apidefinitions.policies.models.DevicesPolicyResponse;
import com.teamviewer.apidefinitions.policies.models.NotificationsRegisterData;
import com.teamviewer.apidefinitions.policies.models.PolicyData;
import com.teamviewer.apidefinitions.policies.models.PolicyLimitResponse;
import com.teamviewer.apidefinitions.policies.models.ResolveNamesRequest;
import com.teamviewer.apidefinitions.policies.models.ResolveNamesResponse;
import com.teamviewer.apidefinitions.policies.models.TeamviewerVersionsResponse;
import java.util.List;
import java.util.UUID;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H'¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H'¢\u0006\u0004\b\u0018\u0010\u000fJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/teamviewer/apidefinitions/policies/apis/PoliciesApi;", "", "Lcom/teamviewer/apidefinitions/policies/models/PolicyData;", "policyData", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/policies/models/CreatePolicyResponse;", "createPolicy", "(Lcom/teamviewer/apidefinitions/policies/models/PolicyData;)Lo/qi0;", "Ljava/util/UUID;", "policyId", "Lo/f88;", "deletePolicy", "(Ljava/util/UUID;)Lo/qi0;", "", "getPolicies", "()Lo/qi0;", "", "paginationToken", "Lcom/teamviewer/apidefinitions/policies/models/DevicesPolicyResponse;", "getPolicyAssignments", "(Ljava/lang/String;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/policies/models/PolicyLimitResponse;", "getPolicyLimit", "Lcom/teamviewer/apidefinitions/policies/models/TeamviewerVersionsResponse;", "getTeamviewerVersions", "Lcom/teamviewer/apidefinitions/policies/models/NotificationsRegisterData;", "notificationsRegisterData", "registerForPolicyNotifications", "(Lcom/teamviewer/apidefinitions/policies/models/NotificationsRegisterData;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/policies/models/ResolveNamesRequest;", "resolveNamesRequest", "Lcom/teamviewer/apidefinitions/policies/models/ResolveNamesResponse;", "resolveNames", "(Lcom/teamviewer/apidefinitions/policies/models/ResolveNamesRequest;)Lo/qi0;", "updatePolicy", "(Ljava/util/UUID;Lcom/teamviewer/apidefinitions/policies/models/PolicyData;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PoliciesApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 getPolicyAssignments$default(PoliciesApi policiesApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getPolicyAssignments");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return policiesApi.getPolicyAssignments(str);
        }
    }

    @yc5("policies")
    qi0<CreatePolicyResponse> createPolicy(@j80 PolicyData policyData);

    @jg1("policies/{policyId}")
    qi0<f88> deletePolicy(@xg5("policyId") UUID policyId);

    @ox2("policies")
    qi0<List<PolicyData>> getPolicies();

    @ox2("policies/assignments/all")
    qi0<DevicesPolicyResponse> getPolicyAssignments(@sy5("paginationToken") String paginationToken);

    @ox2("limit")
    qi0<PolicyLimitResponse> getPolicyLimit();

    @ox2("teamviewerversions")
    qi0<TeamviewerVersionsResponse> getTeamviewerVersions();

    @zc5("notifications")
    qi0<f88> registerForPolicyNotifications(@j80 NotificationsRegisterData notificationsRegisterData);

    @yc5("resolvenames")
    qi0<ResolveNamesResponse> resolveNames(@j80 ResolveNamesRequest resolveNamesRequest);

    @zc5("policies/{policyId}")
    qi0<f88> updatePolicy(@xg5("policyId") UUID policyId, @j80 PolicyData policyData);
}
