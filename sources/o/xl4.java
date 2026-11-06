package o;

import com.teamviewer.apidefinitions.manageddevices.apis.ManageddevicesApi;
import com.teamviewer.apidefinitions.manageddevices.models.CacheLoadedResponse;
import com.teamviewer.apidefinitions.manageddevices.models.Device;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceIdList;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceStateDetailModel;
import com.teamviewer.apidefinitions.manageddevices.models.FilterPaginationModel;
import com.teamviewer.apidefinitions.manageddevices.models.Group;
import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailModel;
import com.teamviewer.apidefinitions.manageddevices.models.GroupDetailsList;
import com.teamviewer.apidefinitions.manageddevices.models.GroupIdList;
import com.teamviewer.apidefinitions.manageddevices.models.GroupListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.Me;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class xl4 implements hl4 {
    public final fm a = new fm(q85.e, (byte) 7);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, jc1 jc1Var) {
        il4 il4Var;
        long j;
        if (jc1Var instanceof il4) {
            il4Var = (il4) jc1Var;
            int i = il4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                il4Var.q = i - Integer.MIN_VALUE;
            } else {
                il4Var = new il4(this, jc1Var);
            }
        } else {
            il4Var = new il4(this, jc1Var);
        }
        Object objA = il4Var.f1073o;
        int i2 = il4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            il4Var.m = list;
            j = 30000;
            il4Var.n = 30000L;
            il4Var.q = 1;
            objA = n85Var.a(30000L, il4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = il4Var.n;
        List list2 = il4Var.m;
        ct1.a0(objA);
        j = j2;
        list = list2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarBulkDeleteDevices = y85.m.t().d().bulkDeleteDevices(new DeviceIdList(list));
        il4Var.m = null;
        il4Var.n = j;
        il4Var.q = 2;
        Object objL = nv1.l(qi0VarBulkDeleteDevices, il4Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(GroupDetailModel groupDetailModel, jc1 jc1Var) {
        jl4 jl4Var;
        long j;
        if (jc1Var instanceof jl4) {
            jl4Var = (jl4) jc1Var;
            int i = jl4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                jl4Var.q = i - Integer.MIN_VALUE;
            } else {
                jl4Var = new jl4(this, jc1Var);
            }
        } else {
            jl4Var = new jl4(this, jc1Var);
        }
        Object objA = jl4Var.f1178o;
        int i2 = jl4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            jl4Var.m = groupDetailModel;
            j = 30000;
            jl4Var.n = 30000L;
            jl4Var.q = 1;
            objA = n85Var.a(30000L, jl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = jl4Var.n;
        GroupDetailModel groupDetailModel2 = jl4Var.m;
        ct1.a0(objA);
        j = j2;
        groupDetailModel = groupDetailModel2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Group> qi0VarCreateGroup = y85.m.t().d().createGroup(groupDetailModel);
        jl4Var.m = null;
        jl4Var.n = j;
        jl4Var.q = 2;
        Object objM = nv1.m(qi0VarCreateGroup, jl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(UUID uuid, jc1 jc1Var) {
        kl4 kl4Var;
        long j;
        if (jc1Var instanceof kl4) {
            kl4Var = (kl4) jc1Var;
            int i = kl4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                kl4Var.q = i - Integer.MIN_VALUE;
            } else {
                kl4Var = new kl4(this, jc1Var);
            }
        } else {
            kl4Var = new kl4(this, jc1Var);
        }
        Object objA = kl4Var.f1278o;
        int i2 = kl4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            kl4Var.m = uuid;
            j = 30000;
            kl4Var.n = 30000L;
            kl4Var.q = 1;
            objA = n85Var.a(30000L, kl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = kl4Var.n;
        UUID uuid2 = kl4Var.m;
        ct1.a0(objA);
        j = j2;
        uuid = uuid2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarDeleteGroup = y85.m.t().d().deleteGroup(uuid);
        kl4Var.m = null;
        kl4Var.n = j;
        kl4Var.q = 2;
        Object objL = nv1.l(qi0VarDeleteGroup, kl4Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(DeviceFilteringModel deviceFilteringModel, jc1 jc1Var) {
        ll4 ll4Var;
        long j;
        if (jc1Var instanceof ll4) {
            ll4Var = (ll4) jc1Var;
            int i = ll4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll4Var.q = i - Integer.MIN_VALUE;
            } else {
                ll4Var = new ll4(this, jc1Var);
            }
        } else {
            ll4Var = new ll4(this, jc1Var);
        }
        Object objA = ll4Var.f1376o;
        int i2 = ll4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            ll4Var.m = deviceFilteringModel;
            j = 30000;
            ll4Var.n = 30000L;
            ll4Var.q = 1;
            objA = n85Var.a(30000L, ll4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = ll4Var.n;
        DeviceFilteringModel deviceFilteringModel2 = ll4Var.m;
        ct1.a0(objA);
        j = j2;
        deviceFilteringModel = deviceFilteringModel2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<DeviceListResponse> qi0VarFilterManagedDevices = y85.m.t().d().filterManagedDevices(deviceFilteringModel);
        ll4Var.m = null;
        ll4Var.n = j;
        ll4Var.q = 2;
        Object objM = nv1.m(qi0VarFilterManagedDevices, ll4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(FilterPaginationModel filterPaginationModel, jc1 jc1Var) {
        ml4 ml4Var;
        long j;
        if (jc1Var instanceof ml4) {
            ml4Var = (ml4) jc1Var;
            int i = ml4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml4Var.q = i - Integer.MIN_VALUE;
            } else {
                ml4Var = new ml4(this, jc1Var);
            }
        } else {
            ml4Var = new ml4(this, jc1Var);
        }
        Object objA = ml4Var.f1481o;
        int i2 = ml4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            ml4Var.m = filterPaginationModel;
            j = 30000;
            ml4Var.n = 30000L;
            ml4Var.q = 1;
            objA = n85Var.a(30000L, ml4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = ml4Var.n;
        FilterPaginationModel filterPaginationModel2 = ml4Var.m;
        ct1.a0(objA);
        j = j2;
        filterPaginationModel = filterPaginationModel2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<DeviceListResponse> qi0VarFilterManagedDevicesNext = y85.m.t().d().filterManagedDevicesNext(filterPaginationModel);
        ml4Var.m = null;
        ml4Var.n = j;
        ml4Var.q = 2;
        Object objM = nv1.m(qi0VarFilterManagedDevicesNext, ml4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(jc1 jc1Var) {
        nl4 nl4Var;
        long j;
        if (jc1Var instanceof nl4) {
            nl4Var = (nl4) jc1Var;
            int i = nl4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                nl4Var.p = i - Integer.MIN_VALUE;
            } else {
                nl4Var = new nl4(this, jc1Var);
            }
        } else {
            nl4Var = new nl4(this, jc1Var);
        }
        Object objA = nl4Var.n;
        int i2 = nl4Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            j = 30000;
            nl4Var.m = 30000L;
            nl4Var.p = 1;
            objA = n85Var.a(30000L, nl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = nl4Var.m;
        ct1.a0(objA);
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<CacheLoadedResponse> qi0VarLoadedStatus = y85.m.t().d().loadedStatus();
        nl4Var.m = j;
        nl4Var.p = 2;
        Object objM = nv1.m(qi0VarLoadedStatus, nl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(jc1 jc1Var) {
        ol4 ol4Var;
        long j;
        if (jc1Var instanceof ol4) {
            ol4Var = (ol4) jc1Var;
            int i = ol4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ol4Var.p = i - Integer.MIN_VALUE;
            } else {
                ol4Var = new ol4(this, jc1Var);
            }
        } else {
            ol4Var = new ol4(this, jc1Var);
        }
        Object objA = ol4Var.n;
        int i2 = ol4Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            j = 30000;
            ol4Var.m = 30000L;
            ol4Var.p = 1;
            objA = n85Var.a(30000L, ol4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = ol4Var.m;
        ct1.a0(objA);
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Me> currentSessionInformation = y85.m.t().d().getCurrentSessionInformation();
        ol4Var.m = j;
        ol4Var.p = 2;
        Object objM = nv1.m(currentSessionInformation, ol4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(UUID uuid, List list, jc1 jc1Var) {
        pl4 pl4Var;
        UUID uuid2;
        List list2;
        long j;
        if (jc1Var instanceof pl4) {
            pl4Var = (pl4) jc1Var;
            int i = pl4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                pl4Var.r = i - Integer.MIN_VALUE;
            } else {
                pl4Var = new pl4(this, jc1Var);
            }
        } else {
            pl4Var = new pl4(this, jc1Var);
        }
        Object objA = pl4Var.p;
        int i2 = pl4Var.r;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            pl4Var.m = uuid;
            pl4Var.n = list;
            pl4Var.f1746o = 30000L;
            pl4Var.r = 1;
            objA = n85Var.a(30000L, pl4Var);
            if (objA != ne1Var) {
                uuid2 = uuid;
                list2 = list;
                j = 30000;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = pl4Var.f1746o;
        List list3 = pl4Var.n;
        UUID uuid3 = pl4Var.m;
        ct1.a0(objA);
        list2 = list3;
        uuid2 = uuid3;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0 device$default = ManageddevicesApi.DefaultImpls.getDevice$default(y85.m.t().d(), uuid2, list2, null, 4, null);
        pl4Var.m = null;
        pl4Var.n = null;
        pl4Var.f1746o = j;
        pl4Var.r = 2;
        Object objM = nv1.m(device$default, pl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(UUID uuid, jc1 jc1Var) {
        ql4 ql4Var;
        long j;
        if (jc1Var instanceof ql4) {
            ql4Var = (ql4) jc1Var;
            int i = ql4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql4Var.q = i - Integer.MIN_VALUE;
            } else {
                ql4Var = new ql4(this, jc1Var);
            }
        } else {
            ql4Var = new ql4(this, jc1Var);
        }
        Object objA = ql4Var.f1843o;
        int i2 = ql4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            ql4Var.m = uuid;
            j = 30000;
            ql4Var.n = 30000L;
            ql4Var.q = 1;
            objA = n85Var.a(30000L, ql4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = ql4Var.n;
        UUID uuid2 = ql4Var.m;
        ct1.a0(objA);
        j = j2;
        uuid = uuid2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Group> group = y85.m.t().d().getGroup(uuid);
        ql4Var.m = null;
        ql4Var.n = j;
        ql4Var.q = 2;
        Object objM = nv1.m(group, ql4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(GroupIdList groupIdList, jc1 jc1Var) {
        rl4 rl4Var;
        long j;
        if (jc1Var instanceof rl4) {
            rl4Var = (rl4) jc1Var;
            int i = rl4Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                rl4Var.q = i - Integer.MIN_VALUE;
            } else {
                rl4Var = new rl4(this, jc1Var);
            }
        } else {
            rl4Var = new rl4(this, jc1Var);
        }
        Object objA = rl4Var.f1929o;
        int i2 = rl4Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            rl4Var.m = groupIdList;
            j = 30000;
            rl4Var.n = 30000L;
            rl4Var.q = 1;
            objA = n85Var.a(30000L, rl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = rl4Var.n;
        GroupIdList groupIdList2 = rl4Var.m;
        ct1.a0(objA);
        j = j2;
        groupIdList = groupIdList2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<GroupDetailsList> groupsDetails = y85.m.t().d().getGroupsDetails(groupIdList);
        rl4Var.m = null;
        rl4Var.n = j;
        rl4Var.q = 2;
        Object objM = nv1.m(groupsDetails, rl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, Integer num, jc1 jc1Var) {
        sl4 sl4Var;
        long j;
        if (jc1Var instanceof sl4) {
            sl4Var = (sl4) jc1Var;
            int i = sl4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                sl4Var.r = i - Integer.MIN_VALUE;
            } else {
                sl4Var = new sl4(this, jc1Var);
            }
        } else {
            sl4Var = new sl4(this, jc1Var);
        }
        Object objA = sl4Var.p;
        int i2 = sl4Var.r;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            sl4Var.m = str;
            sl4Var.n = num;
            j = 30000;
            sl4Var.f2029o = 30000L;
            sl4Var.r = 1;
            objA = n85Var.a(30000L, sl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = sl4Var.f2029o;
        Integer num2 = sl4Var.n;
        String str2 = sl4Var.m;
        ct1.a0(objA);
        j = j2;
        num = num2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<GroupListResponse> qi0VarListGroups = y85.m.t().d().listGroups(str, num);
        sl4Var.m = null;
        sl4Var.n = null;
        sl4Var.f2029o = j;
        sl4Var.r = 2;
        Object objM = nv1.m(qi0VarListGroups, sl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(UUID uuid, GroupDetailModel groupDetailModel, jc1 jc1Var) {
        tl4 tl4Var;
        long j;
        if (jc1Var instanceof tl4) {
            tl4Var = (tl4) jc1Var;
            int i = tl4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                tl4Var.r = i - Integer.MIN_VALUE;
            } else {
                tl4Var = new tl4(this, jc1Var);
            }
        } else {
            tl4Var = new tl4(this, jc1Var);
        }
        Object objA = tl4Var.p;
        int i2 = tl4Var.r;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            tl4Var.m = uuid;
            tl4Var.n = groupDetailModel;
            j = 30000;
            tl4Var.f2122o = 30000L;
            tl4Var.r = 1;
            objA = n85Var.a(30000L, tl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = tl4Var.f2122o;
        GroupDetailModel groupDetailModel2 = tl4Var.n;
        UUID uuid2 = tl4Var.m;
        ct1.a0(objA);
        j = j2;
        groupDetailModel = groupDetailModel2;
        uuid = uuid2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Group> qi0VarUpdateGroup = y85.m.t().d().updateGroup(uuid, groupDetailModel);
        tl4Var.m = null;
        tl4Var.n = null;
        tl4Var.f2122o = j;
        tl4Var.r = 2;
        Object objM = nv1.m(qi0VarUpdateGroup, tl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(UUID uuid, DeviceStateDetailModel deviceStateDetailModel, jc1 jc1Var) {
        wl4 wl4Var;
        long j;
        if (jc1Var instanceof wl4) {
            wl4Var = (wl4) jc1Var;
            int i = wl4Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                wl4Var.r = i - Integer.MIN_VALUE;
            } else {
                wl4Var = new wl4(this, jc1Var);
            }
        } else {
            wl4Var = new wl4(this, jc1Var);
        }
        Object objA = wl4Var.p;
        int i2 = wl4Var.r;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            wl4Var.m = uuid;
            wl4Var.n = deviceStateDetailModel;
            j = 30000;
            wl4Var.f2427o = 30000L;
            wl4Var.r = 1;
            objA = n85Var.a(30000L, wl4Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = wl4Var.f2427o;
        DeviceStateDetailModel deviceStateDetailModel2 = wl4Var.n;
        UUID uuid2 = wl4Var.m;
        ct1.a0(objA);
        j = j2;
        deviceStateDetailModel = deviceStateDetailModel2;
        uuid = uuid2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Device> qi0VarPutDevice = y85.m.t().d().putDevice(uuid, deviceStateDetailModel);
        wl4Var.m = null;
        wl4Var.n = null;
        wl4Var.f2427o = j;
        wl4Var.r = 2;
        Object objM = nv1.m(qi0VarPutDevice, wl4Var);
        return objM == ne1Var ? ne1Var : objM;
    }
}
