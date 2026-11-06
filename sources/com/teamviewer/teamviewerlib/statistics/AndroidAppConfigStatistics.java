package com.teamviewer.teamviewerlib.statistics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001Jh\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/teamviewerlib/statistics/AndroidAppConfigStatistics;", "", "", "conditionalAccessServers", "keepAliveServerName", "partnerListDeviceName", "partnerListApiToken", "partnerListGroupId", "whitelistAccounts", "whitelistCompanies", "sessionRequestConfigurationId", "customModuleConfigId", "enableSessionFeaturesConfigId", "allowAssignmentRemoval", "Lo/f88;", "jniAppConfigStatistics", "(ZZZZZZZZZZZ)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AndroidAppConfigStatistics {
    public static final AndroidAppConfigStatistics a = new AndroidAppConfigStatistics();

    private final native void jniAppConfigStatistics(boolean conditionalAccessServers, boolean keepAliveServerName, boolean partnerListDeviceName, boolean partnerListApiToken, boolean partnerListGroupId, boolean whitelistAccounts, boolean whitelistCompanies, boolean sessionRequestConfigurationId, boolean customModuleConfigId, boolean enableSessionFeaturesConfigId, boolean allowAssignmentRemoval);

    public final void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        jniAppConfigStatistics(z, z2, z3, z4, z5, z6, z7, z8, z9, false, z10);
    }
}
